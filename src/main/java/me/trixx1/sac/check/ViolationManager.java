package me.trixx1.sac.check;

import me.trixx1.sac.SACPlugin;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ViolationManager {

    private final SACPlugin plugin;
    private final Map<UUID, Map<String, Integer>> violations = new HashMap<>();

    public ViolationManager(SACPlugin plugin) {
        this.plugin = plugin;
    }

    public void addViolation(Player player, String checkName) {
        violations.computeIfAbsent(player.getUniqueId(), k -> new HashMap<>())
                  .merge(checkName, 1, Integer::sum);

        int total = violations.get(player.getUniqueId()).get(checkName);

        // Alert staff
        String alertMsg = plugin.getConfigManager().getMessages().getString("alert")
                .replace("%player%", player.getName())
                .replace("%check%", checkName)
                .replace("%violations%", String.valueOf(total));

        Bukkit.getOnlinePlayers().stream()
                .filter(p -> p.hasPermission("sac.alerts"))
                .forEach(p -> p.sendMessage("§8[§cSAC§8] " + alertMsg.replace("&", "§")));

        handlePunishment(player, checkName, total);
    }

    private void handlePunishment(Player player, String checkName, int total) {
        String action = plugin.getConfigManager().getPunishments().getString("violation-actions." + total);
        if (action != null) {
            List<String> cmds = plugin.getConfigManager().getPunishments().getStringList("punishments." + action + ".commands");
            for (String cmd : cmds) {
                String finalCmd = cmd.replace("%player%", player.getName()).replace("%check%", checkName);
                Bukkit.getScheduler().runTask(plugin, () -> Bukkit.dispatchCommand(Bukkit.getConsoleSender(), finalCmd));
            }
        }
    }
}

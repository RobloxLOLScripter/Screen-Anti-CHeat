package me.trixx1.sac.command;

import me.trixx1.sac.SACPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SACCommand implements CommandExecutor {

    private final SACPlugin plugin;

    public SACCommand(SACPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!sender.hasPermission("sac.admin")) {
            sender.sendMessage("§cNo permission.");
            return true;
        }

        if (args.length == 0 || args[0].equalsIgnoreCase("help")) {
            sender.sendMessage("§8§m----------------------------------------");
            sender.sendMessage("§c§lScreen Anti-Cheat §7(SAC) Help");
            sender.sendMessage("§f/sac reload §7- Reload config");
            sender.sendMessage("§f/sac alerts <on/off> §7- Toggle alerts");
            sender.sendMessage("§f/sac profile <player> §7- View player profile");
            sender.sendMessage("§f/sac client <player> §7- View detected client");
            sender.sendMessage("§8§m----------------------------------------");
            sender.sendMessage("§7Made By Trixx1_");
            return true;
        }

        if (args[0].equalsIgnoreCase("reload")) {
            plugin.reloadConfig();
            sender.sendMessage("§aPlugin reloaded.");
            return true;
        }

        if (args[0].equalsIgnoreCase("client") && args.length > 1) {
             sender.sendMessage("§7Player: §f" + args[1]);
             sender.sendMessage("§7Client: §fLunar Client"); // Mock for now
             return true;
        }

        return true;
    }
}

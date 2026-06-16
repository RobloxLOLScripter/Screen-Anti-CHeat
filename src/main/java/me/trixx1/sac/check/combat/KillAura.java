package me.trixx1.sac.check.combat;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;
import org.bukkit.entity.Entity;

public class KillAura extends Check {
    public KillAura(SACPlugin plugin) {
        super(plugin, "KillAura", "Combat");
    }

    public void handle(PlayerData data, Entity target) {
        if (!isEnabled()) return;

        // Basic Check: Distance and Angle
        double distance = data.getPlayer().getLocation().distance(target.getLocation());
        if (distance > 6.0) {
            fail(data, "Illegal distance: " + distance);
        }
    }
}

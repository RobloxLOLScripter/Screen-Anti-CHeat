package me.trixx1.sac.check.combat;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;
import org.bukkit.entity.Entity;

public class Reach extends Check {
    public Reach(SACPlugin plugin) {
        super(plugin, "Reach", "Combat");
    }

    public void handle(PlayerData data, Entity target) {
        if (!isEnabled()) return;
        double reach = data.getPlayer().getEyeLocation().distance(target.getLocation());
        if (reach > 3.5) { // Competitive reach is usually around 3.0
            incrementBuffer(1.0);
            if (getBuffer() > 3) {
                fail(data, "Reach: " + reach);
            }
        } else {
            reduceBuffer(0.05);
        }
    }
}

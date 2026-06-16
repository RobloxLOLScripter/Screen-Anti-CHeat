package me.trixx1.sac.check.movement;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;
import org.bukkit.Location;

public class Speed extends Check {
    public Speed(SACPlugin plugin) {
        super(plugin, "Speed", "Movement");
    }

    public void handle(PlayerData data, Location to) {
        if (!isEnabled()) return;

        double distance = Math.sqrt(Math.pow(to.getX() - data.getLastPosX(), 2) + Math.pow(to.getZ() - data.getLastPosZ(), 2));
        double maxSpeed = 0.66; // Basic sprint speed with some buffer

        if (data.getPlayer().hasPotionEffect(org.bukkit.potion.PotionEffectType.SPEED)) {
            maxSpeed += 0.15;
        }

        if (distance > maxSpeed) {
            incrementBuffer(1.0);
            if (getBuffer() > 5) {
                fail(data, "Distance: " + distance);
            }
        } else {
            reduceBuffer(0.1);
        }
    }
}

package me.trixx1.sac.check.combat;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class Velocity extends Check {
    public Velocity(SACPlugin plugin) {
        super(plugin, "Velocity", "Combat");
    }

    public void handle(PlayerData data, double vertical, double horizontal) {
        // Anti-Knockback / Velocity detection
    }
}

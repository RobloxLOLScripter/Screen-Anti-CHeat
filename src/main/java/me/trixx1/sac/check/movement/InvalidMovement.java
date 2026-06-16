package me.trixx1.sac.check.movement;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class InvalidMovement extends Check {
    public InvalidMovement(SACPlugin plugin) {
        super(plugin, "InvalidMovement", "Movement");
    }

    public void handle(PlayerData data) {
        // Invalid movement detection
    }
}

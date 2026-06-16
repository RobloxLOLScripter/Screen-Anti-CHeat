package me.trixx1.sac.check.movement;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class AirJump extends Check {
    public AirJump(SACPlugin plugin) {
        super(plugin, "AirJump", "Movement");
    }

    public void handle(PlayerData data) {
        // Air jump detection
    }
}

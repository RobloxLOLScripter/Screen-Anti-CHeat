package me.trixx1.sac.check.movement;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class MotionPrediction extends Check {
    public MotionPrediction(SACPlugin plugin) {
        super(plugin, "MotionPrediction", "Movement");
    }

    public void handle(PlayerData data) {
        // Motion prediction logic
    }
}

package me.trixx1.sac.check.movement;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class Step extends Check {
    public Step(SACPlugin plugin) {
        super(plugin, "Step", "Movement");
    }

    public void handle(PlayerData data, double deltaY) {
        if (!isEnabled()) return;
        if (deltaY > 0.6 && deltaY < 1.1) { // Normal step is 0.6, 1.0 block is suspicious if instant
             // Step logic
        }
    }
}

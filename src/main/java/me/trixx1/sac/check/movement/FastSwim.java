package me.trixx1.sac.check.movement;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class FastSwim extends Check {
    public FastSwim(SACPlugin plugin) {
        super(plugin, "FastSwim", "Movement");
    }

    public void handle(PlayerData data) {
        // Fast swim detection
    }
}

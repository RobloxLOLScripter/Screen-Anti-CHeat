package me.trixx1.sac.check.movement;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class FastLadder extends Check {
    public FastLadder(SACPlugin plugin) {
        super(plugin, "FastLadder", "Movement");
    }

    public void handle(PlayerData data) {
        // Fast ladder detection
    }
}

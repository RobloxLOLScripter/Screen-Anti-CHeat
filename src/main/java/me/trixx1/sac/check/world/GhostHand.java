package me.trixx1.sac.check.world;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class GhostHand extends Check {
    public GhostHand(SACPlugin plugin) {
        super(plugin, "GhostHand", "World");
    }

    public void handle(PlayerData data) {
        // Ghost hand detection
    }
}

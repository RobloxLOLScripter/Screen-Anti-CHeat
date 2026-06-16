package me.trixx1.sac.check.world;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class Nuker extends Check {
    public Nuker(SACPlugin plugin) {
        super(plugin, "Nuker", "World");
    }

    public void handle(PlayerData data) {
        // Nuker detection
    }
}

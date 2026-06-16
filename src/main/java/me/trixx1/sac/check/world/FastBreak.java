package me.trixx1.sac.check.world;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class FastBreak extends Check {
    public FastBreak(SACPlugin plugin) {
        super(plugin, "FastBreak", "World");
    }

    public void handle(PlayerData data) {
        // Fast break detection
    }
}

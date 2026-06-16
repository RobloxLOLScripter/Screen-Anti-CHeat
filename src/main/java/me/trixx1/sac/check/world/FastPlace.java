package me.trixx1.sac.check.world;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class FastPlace extends Check {
    public FastPlace(SACPlugin plugin) {
        super(plugin, "FastPlace", "World");
    }

    public void handle(PlayerData data) {
        // Fast place detection
    }
}

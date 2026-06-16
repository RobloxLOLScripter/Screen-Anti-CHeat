package me.trixx1.sac.check.world;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class BlockReach extends Check {
    public BlockReach(SACPlugin plugin) {
        super(plugin, "BlockReach", "World");
    }

    public void handle(PlayerData data) {
        // Block reach detection
    }
}

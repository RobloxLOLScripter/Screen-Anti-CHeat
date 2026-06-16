package me.trixx1.sac.check.world;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class Tower extends Check {
    public Tower(SACPlugin plugin) {
        super(plugin, "Tower", "World");
    }

    public void handle(PlayerData data) {
        // Tower detection
    }
}

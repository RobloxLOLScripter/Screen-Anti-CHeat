package me.trixx1.sac.check.movement;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class Spider extends Check {
    public Spider(SACPlugin plugin) {
        super(plugin, "Spider", "Movement");
    }

    public void handle(PlayerData data) {
        // Wall climb detection
    }
}

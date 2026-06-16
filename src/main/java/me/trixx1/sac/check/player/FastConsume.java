package me.trixx1.sac.check.player;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class FastConsume extends Check {
    public FastConsume(SACPlugin plugin) {
        super(plugin, "FastConsume", "Player");
    }

    public void handle(PlayerData data) {
        // Fast consume detection
    }
}

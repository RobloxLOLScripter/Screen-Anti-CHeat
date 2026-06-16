package me.trixx1.sac.check.player;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class BadPackets extends Check {
    public BadPackets(SACPlugin plugin) {
        super(plugin, "BadPackets", "Player");
    }

    public void handle(PlayerData data) {
        // Bad packets detection
    }
}

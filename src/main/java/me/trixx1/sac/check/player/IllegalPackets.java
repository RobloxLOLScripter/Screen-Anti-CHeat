package me.trixx1.sac.check.player;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class IllegalPackets extends Check {
    public IllegalPackets(SACPlugin plugin) {
        super(plugin, "IllegalPackets", "Player");
    }

    public void handle(PlayerData data) {
        // Illegal packets detection
    }
}

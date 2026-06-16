package me.trixx1.sac.check.player;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class InvalidRotation extends Check {
    public InvalidRotation(SACPlugin plugin) {
        super(plugin, "InvalidRotation", "Player");
    }

    public void handle(PlayerData data) {
        // Invalid rotation detection
    }
}

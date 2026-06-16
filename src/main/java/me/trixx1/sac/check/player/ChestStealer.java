package me.trixx1.sac.check.player;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class ChestStealer extends Check {
    public ChestStealer(SACPlugin plugin) {
        super(plugin, "ChestStealer", "Player");
    }

    public void handle(PlayerData data) {
        // Chest stealer detection
    }
}

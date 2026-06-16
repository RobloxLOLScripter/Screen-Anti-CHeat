package me.trixx1.sac.check.player;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class InventoryMove extends Check {
    public InventoryMove(SACPlugin plugin) {
        super(plugin, "InventoryMove", "Player");
    }

    public void handle(PlayerData data) {
        // Inventory move detection
    }
}

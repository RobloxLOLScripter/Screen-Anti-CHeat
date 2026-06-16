package me.trixx1.sac.check.player;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class AutoTotem extends Check {
    public AutoTotem(SACPlugin plugin) {
        super(plugin, "AutoTotem", "Player");
    }

    public void handle(PlayerData data) {
        // Auto totem detection
    }
}

package me.trixx1.sac.check.player;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class AutoArmor extends Check {
    public AutoArmor(SACPlugin plugin) {
        super(plugin, "AutoArmor", "Player");
    }

    public void handle(PlayerData data) {
        // Auto armor detection
    }
}

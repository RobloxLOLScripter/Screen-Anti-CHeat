package me.trixx1.sac.check.combat;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class Criticals extends Check {
    public Criticals(SACPlugin plugin) {
        super(plugin, "Criticals", "Combat");
    }

    public void handle(PlayerData data) {
        if (!isEnabled()) return;
        if (data.getPlayer().getFallDistance() <= 0 && !data.isOnGround()) {
            // Potential criticals exploit
        }
    }
}

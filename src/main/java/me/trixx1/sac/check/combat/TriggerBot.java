package me.trixx1.sac.check.combat;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class TriggerBot extends Check {
    public TriggerBot(SACPlugin plugin) {
        super(plugin, "TriggerBot", "Combat");
    }

    public void handle(PlayerData data) {
        // Implementation for trigger bot detection
    }
}

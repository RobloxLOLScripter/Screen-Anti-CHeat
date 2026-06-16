package me.trixx1.sac.check.combat;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class TimerAbuse extends Check {
    public TimerAbuse(SACPlugin plugin) {
        super(plugin, "TimerAbuse", "Combat");
    }

    public void handle(PlayerData data) {
        // Combat timer abuse
    }
}

package me.trixx1.sac.check.combat;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class AntiKnockback extends Check {
    public AntiKnockback(SACPlugin plugin) {
        super(plugin, "AntiKnockback", "Combat");
    }

    public void handle(PlayerData data) {
        // Anti-KB logic
    }
}

package me.trixx1.sac.check.combat;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class Hitbox extends Check {
    public Hitbox(SACPlugin plugin) {
        super(plugin, "Hitbox", "Combat");
    }

    public void handle(PlayerData data) {
        // Hitbox detection logic
    }
}

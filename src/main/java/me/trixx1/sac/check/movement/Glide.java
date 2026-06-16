package me.trixx1.sac.check.movement;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class Glide extends Check {
    public Glide(SACPlugin plugin) {
        super(plugin, "Glide", "Movement");
    }

    public void handle(PlayerData data) {
        // Glide detection
    }
}

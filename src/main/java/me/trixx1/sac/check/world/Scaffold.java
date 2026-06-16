package me.trixx1.sac.check.world;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;
import org.bukkit.Material;
import org.bukkit.block.Block;

public class Scaffold extends Check {
    public Scaffold(SACPlugin plugin) {
        super(plugin, "Scaffold", "World");
    }

    public void handle(PlayerData data, Block block) {
        if (!isEnabled()) return;
        if (data.getPlayer().getLocation().getY() - block.getY() > 1.0 && data.getPlayer().getPitch() > 70) {
            incrementBuffer(1.0);
            if (getBuffer() > 4) {
                fail(data, "Scaffold detected");
            }
        } else {
            reduceBuffer(0.1);
        }
    }
}

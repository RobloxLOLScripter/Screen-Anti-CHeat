package me.trixx1.sac.check.movement;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class PacketFly extends Check {
    public PacketFly(SACPlugin plugin) {
        super(plugin, "PacketFly", "Movement");
    }

    public void handle(PlayerData data) {
        // Packet fly detection
    }
}

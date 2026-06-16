package me.trixx1.sac.check.movement;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class NoFall extends Check {
    public NoFall(SACPlugin plugin) {
        super(plugin, "NoFall", "Movement");
    }

    public void handle(PlayerData data, boolean packetOnGround) {
        if (!isEnabled()) return;
        if (packetOnGround && data.getPlayer().getFallDistance() > 2.0) {
            fail(data, "Packet on ground while falling: " + data.getPlayer().getFallDistance());
        }
    }
}

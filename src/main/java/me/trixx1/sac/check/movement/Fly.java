package me.trixx1.sac.check.movement;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;
import org.bukkit.Location;

public class Fly extends Check {
    public Fly(SACPlugin plugin) {
        super(plugin, "Fly", "Movement");
    }

    public void handle(PlayerData data, Location to) {
        if (!isEnabled()) return;

        double deltaY = to.getY() - data.getLastPosY();
        if (deltaY >= 0 && !data.isOnGround() && data.getPlayer().getFallDistance() == 0) {
            incrementBuffer(1.0);
            if (getBuffer() > 4) {
                fail(data, "Defying gravity");
            }
        } else {
            reduceBuffer(0.2);
        }
    }
}

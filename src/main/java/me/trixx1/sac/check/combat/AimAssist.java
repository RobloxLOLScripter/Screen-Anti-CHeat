package me.trixx1.sac.check.combat;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class AimAssist extends Check {
    public AimAssist(SACPlugin plugin) {
        super(plugin, "AimAssist", "Combat");
    }

    public void handle(PlayerData data, float yaw, float pitch) {
        if (!isEnabled()) return;

        float deltaYaw = Math.abs(yaw - data.getLastYaw());
        if (deltaYaw > 0 && deltaYaw < 0.01) {
            incrementBuffer(1.0);
            if (getBuffer() > 5) {
                fail(data, "Smooth aim detected");
            }
        } else {
            reduceBuffer(0.1);
        }
    }
}

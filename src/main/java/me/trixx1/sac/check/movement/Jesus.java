package me.trixx1.sac.check.movement;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;
import org.bukkit.Material;

public class Jesus extends Check {
    public Jesus(SACPlugin plugin) {
        super(plugin, "Jesus", "Movement");
    }

    public void handle(PlayerData data) {
        if (!isEnabled()) return;
        Material m = data.getPlayer().getLocation().getBlock().getType();
        if ((m == Material.WATER || m == Material.LAVA) && data.isOnGround()) {
             incrementBuffer(1.0);
             if (getBuffer() > 3) {
                 fail(data, "Walking on liquid");
             }
        } else {
            reduceBuffer(0.1);
        }
    }
}

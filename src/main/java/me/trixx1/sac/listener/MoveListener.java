package me.trixx1.sac.listener;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.movement.Speed;
import me.trixx1.sac.check.movement.Fly;
import me.trixx1.sac.data.PlayerData;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MoveListener implements Listener {

    private final SACPlugin plugin;

    public MoveListener(SACPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        PlayerData data = plugin.getPlayerDataManager().getPlayerData(event.getPlayer());
        if (data == null) return;

        data.setOnGround(event.getPlayer().isOnGround());

        plugin.getCheckManager().getCheck(Speed.class).handle(data, event.getTo());
        plugin.getCheckManager().getCheck(Fly.class).handle(data, event.getTo());

        data.setLastPosX(event.getTo().getX());
        data.setLastPosY(event.getTo().getY());
        data.setLastPosZ(event.getTo().getZ());
        data.setLastYaw(event.getTo().getYaw());
        data.setLastPitch(event.getTo().getPitch());
    }
}

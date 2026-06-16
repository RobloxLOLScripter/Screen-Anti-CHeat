package me.trixx1.sac.data;

import org.bukkit.entity.Player;
import java.util.UUID;

public class PlayerData {

    private final UUID uuid;
    private final Player player;

    // Movement data
    private double lastPosX, lastPosY, lastPosZ;
    private float lastYaw, lastPitch;
    private boolean onGround;
    private int airTicks;

    // Combat data
    private int lastAttackTicks;
    private double lastDamage;

    // Connection data
    private int ping;
    private String clientBrand = "Vanilla";

    public PlayerData(Player player) {
        this.uuid = player.getUniqueId();
        this.player = player;
        this.lastPosX = player.getLocation().getX();
        this.lastPosY = player.getLocation().getY();
        this.lastPosZ = player.getLocation().getZ();
        this.lastYaw = player.getLocation().getYaw();
        this.lastPitch = player.getLocation().getPitch();
    }

    public UUID getUuid() { return uuid; }
    public Player getPlayer() { return player; }

    public double getLastPosX() { return lastPosX; }
    public void setLastPosX(double lastPosX) { this.lastPosX = lastPosX; }
    public double getLastPosY() { return lastPosY; }
    public void setLastPosY(double lastPosY) { this.lastPosY = lastPosY; }
    public double getLastPosZ() { return lastPosZ; }
    public void setLastPosZ(double lastPosZ) { this.lastPosZ = lastPosZ; }

    public float getLastYaw() { return lastYaw; }
    public void setLastYaw(float lastYaw) { this.lastYaw = lastYaw; }
    public float getLastPitch() { return lastPitch; }
    public void setLastPitch(float lastPitch) { this.lastPitch = lastPitch; }

    public boolean isOnGround() { return onGround; }
    public void setOnGround(boolean onGround) { this.onGround = onGround; }

    public int getAirTicks() { return airTicks; }
    public void setAirTicks(int airTicks) { this.airTicks = airTicks; }

    public int getPing() { return ping; }
    public void setPing(int ping) { this.ping = ping; }

    public String getClientBrand() { return clientBrand; }
    public void setClientBrand(String clientBrand) { this.clientBrand = clientBrand; }
}

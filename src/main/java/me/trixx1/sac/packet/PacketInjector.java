package me.trixx1.sac.packet;

import me.trixx1.sac.SACPlugin;
import org.bukkit.entity.Player;

public class PacketInjector {

    private final SACPlugin plugin;

    public PacketInjector(SACPlugin plugin) {
        this.plugin = plugin;
    }

    public void inject(Player player) {
        // Netty injection logic
    }

    public void uninject(Player player) {
        // Netty uninjection logic
    }
}

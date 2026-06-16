package me.trixx1.sac.listener;

import me.trixx1.sac.SACPlugin;
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;

public class ClientBrandListener implements PluginMessageListener {

    private final SACPlugin plugin;

    public ClientBrandListener(SACPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void onPluginMessageReceived(@NotNull String channel, @NotNull Player player, @NotNull byte[] message) {
        if (channel.equals("minecraft:brand") || channel.equals("MC|Brand")) {
            String brand = new String(message, StandardCharsets.UTF_8).substring(1); // First byte is length
            plugin.getPlayerDataManager().getPlayerData(player).setClientBrand(brand);
        }
    }
}

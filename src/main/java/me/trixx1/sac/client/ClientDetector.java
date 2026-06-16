package me.trixx1.sac.client;

import org.bukkit.entity.Player;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ClientDetector {

    private final Map<UUID, String> detectedClients = new HashMap<>();

    public void detect(Player player, String brand) {
        String client = "Vanilla";
        if (brand.contains("lunarclient")) client = "Lunar Client";
        else if (brand.contains("badlion")) client = "Badlion Client";
        else if (brand.contains("feather")) client = "Feather Client";
        else if (brand.contains("labymod")) client = "LabyMod";
        else if (brand.contains("forge")) client = "Forge";
        else if (brand.contains("fabric")) client = "Fabric";

        detectedClients.put(player.getUniqueId(), client);
    }

    public String getClient(Player player) {
        return detectedClients.getOrDefault(player.getUniqueId(), "Vanilla");
    }
}

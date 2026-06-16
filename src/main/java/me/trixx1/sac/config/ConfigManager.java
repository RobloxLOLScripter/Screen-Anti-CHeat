package me.trixx1.sac.config;

import me.trixx1.sac.SACPlugin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigManager {

    private final SACPlugin plugin;
    private FileConfiguration checksConfig;
    private File checksFile;
    private FileConfiguration punishmentsConfig;
    private File punishmentsFile;
    private FileConfiguration messagesConfig;
    private File messagesFile;
    private FileConfiguration guiConfig;
    private File guiFile;

    public ConfigManager(SACPlugin plugin) {
        this.plugin = plugin;
        loadConfigs();
    }

    public void loadConfigs() {
        plugin.saveDefaultConfig();

        checksFile = new File(plugin.getDataFolder(), "checks.yml");
        if (!checksFile.exists()) plugin.saveResource("checks.yml", false);
        checksConfig = YamlConfiguration.loadConfiguration(checksFile);

        punishmentsFile = new File(plugin.getDataFolder(), "punishments.yml");
        if (!punishmentsFile.exists()) plugin.saveResource("punishments.yml", false);
        punishmentsConfig = YamlConfiguration.loadConfiguration(punishmentsFile);

        messagesFile = new File(plugin.getDataFolder(), "messages.yml");
        if (!messagesFile.exists()) plugin.saveResource("messages.yml", false);
        messagesConfig = YamlConfiguration.loadConfiguration(messagesFile);

        guiFile = new File(plugin.getDataFolder(), "gui.yml");
        if (!guiFile.exists()) plugin.saveResource("gui.yml", false);
        guiConfig = YamlConfiguration.loadConfiguration(guiFile);
    }

    public FileConfiguration getChecks() { return checksConfig; }
    public FileConfiguration getPunishments() { return punishmentsConfig; }
    public FileConfiguration getMessages() { return messagesConfig; }
    public FileConfiguration getGui() { return guiConfig; }
}

package me.trixx1.sac;

import me.trixx1.sac.command.SACCommand;
import me.trixx1.sac.config.ConfigManager;
import me.trixx1.sac.data.PlayerDataManager;
import me.trixx1.sac.lang.LanguageManager;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

/**
 * Main plugin class for Screen Anti-Cheat (SAC).
 * Made By Trixx1_
 */
public class SACPlugin extends JavaPlugin {

    private static SACPlugin instance;
    private ConfigManager configManager;
    private LanguageManager languageManager;
    private PlayerDataManager playerDataManager;
    private me.trixx1.sac.check.CheckManager checkManager;
    private me.trixx1.sac.check.ViolationManager violationManager;

    @Override
    public void onEnable() {
        instance = this;

        this.configManager = new ConfigManager(this);
        this.languageManager = new LanguageManager(this);
        this.playerDataManager = new PlayerDataManager();
        this.violationManager = new me.trixx1.sac.check.ViolationManager(this);
        this.checkManager = new me.trixx1.sac.check.CheckManager(this);

        getServer().getPluginManager().registerEvents(new me.trixx1.sac.listener.PlayerListener(this), this);
        getServer().getPluginManager().registerEvents(new me.trixx1.sac.listener.MoveListener(this), this);

        getServer().getMessenger().registerIncomingPluginChannel(this, "minecraft:brand", new me.trixx1.sac.listener.ClientBrandListener(this));

        getCommand("sac").setExecutor(new SACCommand(this));

        Logger logger = getLogger();
        logger.info("========================================");
        logger.info("    Screen Anti-Cheat (SAC) Enabled");
        logger.info("           Made By Trixx1_");
        logger.info("========================================");
    }

    @Override
    public void onDisable() {
        getLogger().info("Screen Anti-Cheat (SAC) Disabled. Made By Trixx1_");
    }

    public PlayerDataManager getPlayerDataManager() {
        return playerDataManager;
    }

    public me.trixx1.sac.check.CheckManager getCheckManager() {
        return checkManager;
    }

    public me.trixx1.sac.check.ViolationManager getViolationManager() {
        return violationManager;
    }

    public ConfigManager getConfigManager() {
        return configManager;
    }

    public LanguageManager getLanguageManager() {
        return languageManager;
    }

    public static SACPlugin getInstance() {
        return instance;
    }
}

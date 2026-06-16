package me.trixx1.sac.lang;

import me.trixx1.sac.SACPlugin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class LanguageManager {

    private final SACPlugin plugin;
    private final Map<String, FileConfiguration> languages = new HashMap<>();
    private String currentLanguage;

    public LanguageManager(SACPlugin plugin) {
        this.plugin = plugin;
        this.currentLanguage = plugin.getConfig().getString("language", "en");
        loadLanguages();
    }

    public void loadLanguages() {
        File langDir = new File(plugin.getDataFolder(), "languages");
        if (!langDir.exists()) langDir.mkdirs();

        String[] langCodes = {"en", "cs", "sk", "de", "fr", "es", "it", "pl", "nl", "ru", "uk", "tr"};
        for (String code : langCodes) {
            File langFile = new File(langDir, code + ".yml");
            if (!langFile.exists()) {
                plugin.saveResource("languages/" + code + ".yml", false);
            }
            languages.put(code, YamlConfiguration.loadConfiguration(langFile));
        }
    }

    public String getMessage(String key) {
        FileConfiguration langConfig = languages.getOrDefault(currentLanguage, languages.get("en"));
        if (langConfig == null) return "Missing Lang: " + key;
        return langConfig.getString(key, "Missing Key: " + key);
    }

    public void setLanguage(String code) {
        this.currentLanguage = code;
    }
}

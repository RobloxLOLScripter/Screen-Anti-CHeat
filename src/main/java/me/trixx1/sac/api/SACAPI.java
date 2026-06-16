package me.trixx1.sac.api;

import me.trixx1.sac.SACPlugin;

public class SACAPI {

    private static SACAPI instance;
    private final SACPlugin plugin;

    public SACAPI(SACPlugin plugin) {
        this.plugin = plugin;
        instance = this;
    }

    public static SACAPI getInstance() {
        return instance;
    }

    // API Methods
}

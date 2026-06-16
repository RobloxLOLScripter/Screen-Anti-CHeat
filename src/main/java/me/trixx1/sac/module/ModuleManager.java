package me.trixx1.sac.module;

import me.trixx1.sac.SACPlugin;
import java.util.ArrayList;
import java.util.List;

public class ModuleManager {

    private final SACPlugin plugin;
    private final List<SACModule> modules = new ArrayList<>();

    public ModuleManager(SACPlugin plugin) {
        this.plugin = plugin;
    }

    public void loadModules() {
        // Module loading logic
    }

    public void registerModule(SACModule module) {
        modules.add(module);
        module.onEnable();
    }
}

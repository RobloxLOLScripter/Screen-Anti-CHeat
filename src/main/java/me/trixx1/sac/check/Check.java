package me.trixx1.sac.check;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.data.PlayerData;
import org.bukkit.Bukkit;

public abstract class Check {

    protected final SACPlugin plugin;
    private final String name;
    private final String category;
    private boolean enabled;
    private int violations;
    private double buffer;

    public Check(SACPlugin plugin, String name, String category) {
        this.plugin = plugin;
        this.name = name;
        this.category = category;
        this.enabled = true; // Should be loaded from config
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }

    protected void fail(PlayerData data, String info) {
        violations++;
        plugin.getLogger().warning(data.getPlayer().getName() + " failed " + name + ": " + info);
        // Alert logic here
    }

    protected void incrementBuffer(double amount) {
        buffer += amount;
    }

    protected void reduceBuffer(double amount) {
        buffer = Math.max(0, buffer - amount);
    }

    protected double getBuffer() { return buffer; }
}

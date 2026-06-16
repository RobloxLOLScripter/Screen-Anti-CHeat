package me.trixx1.sac.util;

import org.bukkit.Bukkit;

public class CompensationUtil {

    public static double getTPS() {
        return Bukkit.getTPS()[0];
    }

    public static long getPing(org.bukkit.entity.Player player) {
        return player.getPing();
    }

    public static double adjustThreshold(double base, org.bukkit.entity.Player player) {
        double tps = getTPS();
        long ping = getPing(player);

        double multiplier = 1.0;
        if (tps < 18.0) multiplier += (20.0 - tps) * 0.1;
        if (ping > 150) multiplier += (ping - 150) * 0.001;

        return base * multiplier;
    }
}

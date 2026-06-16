package me.trixx1.sac.check.player;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;

public class Timer extends Check {
    private long lastPacket;
    private final java.util.LinkedList<Long> deltas = new java.util.LinkedList<>();

    public Timer(SACPlugin plugin) {
        super(plugin, "Timer", "Player");
    }

    public void handle(PlayerData data) {
        if (!isEnabled()) return;
        long now = System.currentTimeMillis();
        if (lastPacket != 0) {
            long delta = now - lastPacket;
            deltas.add(delta);
            if (deltas.size() > 50) deltas.removeFirst();

            if (deltas.size() == 50) {
                double avg = deltas.stream().mapToLong(Long::longValue).average().orElse(50);
                if (avg < 45) { // Normal is 50ms
                    fail(data, "Timer speed: " + (50.0 / avg));
                }
            }
        }
        lastPacket = now;
    }
}

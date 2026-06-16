package me.trixx1.sac.check.combat;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.Check;
import me.trixx1.sac.data.PlayerData;
import java.util.LinkedList;

public class AutoClicker extends Check {
    private final LinkedList<Long> clicks = new LinkedList<>();

    public AutoClicker(SACPlugin plugin) {
        super(plugin, "AutoClicker", "Combat");
    }

    public void handle(PlayerData data) {
        if (!isEnabled()) return;

        long now = System.currentTimeMillis();
        clicks.add(now);
        while (!clicks.isEmpty() && now - clicks.getFirst() > 1000) {
            clicks.removeFirst();
        }

        if (clicks.size() > 20) {
            fail(data, "CPS: " + clicks.size());
        }
    }
}

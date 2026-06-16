package me.trixx1.sac.check;

import me.trixx1.sac.SACPlugin;
import me.trixx1.sac.check.combat.*;
import me.trixx1.sac.check.movement.*;
import me.trixx1.sac.check.world.*;
import me.trixx1.sac.check.player.*;

import java.util.ArrayList;
import java.util.List;

public class CheckManager {

    private final List<Check> checks = new ArrayList<>();

    public CheckManager(SACPlugin plugin) {
        // Combat
        checks.add(new KillAura(plugin));
        checks.add(new AimAssist(plugin));
        checks.add(new AutoClicker(plugin));
        checks.add(new TriggerBot(plugin));
        checks.add(new Reach(plugin));
        checks.add(new Hitbox(plugin));
        checks.add(new Velocity(plugin));
        checks.add(new Criticals(plugin));
        checks.add(new AntiKnockback(plugin));
        checks.add(new TimerAbuse(plugin));

        // Movement
        checks.add(new Speed(plugin));
        checks.add(new Fly(plugin));
        checks.add(new Glide(plugin));
        checks.add(new NoFall(plugin));
        checks.add(new Jesus(plugin));
        checks.add(new Step(plugin));
        checks.add(new Spider(plugin));
        checks.add(new FastLadder(plugin));
        checks.add(new FastSwim(plugin));
        checks.add(new AirJump(plugin));
        checks.add(new ElytraExploits(plugin));
        checks.add(new InvalidMovement(plugin));
        checks.add(new MotionPrediction(plugin));
        checks.add(new PacketFly(plugin));

        // World
        checks.add(new Scaffold(plugin));
        checks.add(new FastPlace(plugin));
        checks.add(new FastBreak(plugin));
        checks.add(new Nuker(plugin));
        checks.add(new GhostHand(plugin));
        checks.add(new BlockReach(plugin));
        checks.add(new Tower(plugin));

        // Player
        checks.add(new InventoryMove(plugin));
        checks.add(new AutoArmor(plugin));
        checks.add(new AutoTotem(plugin));
        checks.add(new ChestStealer(plugin));
        checks.add(new FastConsume(plugin));
        checks.add(new BadPackets(plugin));
        checks.add(new Timer(plugin));
        checks.add(new IllegalPackets(plugin));
        checks.add(new InvalidRotation(plugin));
    }

    public List<Check> getChecks() {
        return checks;
    }

    public <T extends Check> T getCheck(Class<T> clazz) {
        for (Check check : checks) {
            if (clazz.isInstance(check)) {
                return clazz.cast(check);
            }
        }
        return null;
    }
}

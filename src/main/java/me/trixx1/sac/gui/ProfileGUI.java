package me.trixx1.sac.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ProfileGUI {

    public static void open(Player viewer, Player target) {
        Inventory inv = Bukkit.createInventory(null, 27, "§8Player Profile: " + target.getName());

        ItemStack head = new ItemStack(Material.PLAYER_HEAD);
        ItemMeta meta = head.getItemMeta();
        meta.setDisplayName("§e" + target.getName());
        List<String> lore = new ArrayList<>();
        lore.add("§7Client: §fLunar Client");
        lore.add("§7Ping: §f" + target.getPing() + "ms");
        lore.add("§7Risk Level: §aLow");
        meta.setLore(lore);
        head.setItemMeta(meta);

        inv.setItem(13, head);
        viewer.openInventory(inv);
    }
}

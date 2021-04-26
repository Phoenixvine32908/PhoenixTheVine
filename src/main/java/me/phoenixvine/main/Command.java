package me.phoenixvine.main;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, org.bukkit.command.@NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (command.getName().equalsIgnoreCase("freet"))  {
        Player player = null;
        if (sender instanceof Player) {
        }player = (Player) sender;
        if (sender.hasPermission("freet")) {
            ItemStack end_stone_bricks = new ItemStack(Material.END_STONE_BRICKS);
            ItemStack Netherite_ingot = new ItemStack(Material.NETHERITE_INGOT);
            end_stone_bricks.setAmount(1);
            Netherite_ingot.setAmount(2);
            player.getInventory().addItem(end_stone_bricks, Netherite_ingot);
            player.sendMessage(ChatColor.GRAY + "You got stuff");

        } else {
            player.sendMessage(ChatColor.RED + "You dont have permission stinky");
            }

    }
    return true;
    }
}

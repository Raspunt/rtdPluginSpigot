package org.giga.rtdplugin2.actions;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.giga.rtdplugin2.lists.SwordsList;

import java.util.Random;

public class RandomItemAction {

    public void giveRandomSword(Player player) {
        Random random = new Random();
        SwordsList[] swords = SwordsList.values();

        SwordsList randomSword = swords[random.nextInt(swords.length)];
        Material swordMaterial = randomSword.getMaterial();

        ItemStack sword = new ItemStack(swordMaterial);
        player.getInventory().addItem(sword);
    }
    public void giveStick(Player player) {
//        player.getInventory().clear();

        ItemStack enchantedStick = new ItemStack(Material.STICK, 1);
        enchantedStick.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1000);

        ItemMeta meta = enchantedStick.getItemMeta();
        meta.setDisplayName("Дужегуб пусечек over9999");
        enchantedStick.setItemMeta(meta);

        player.getInventory().addItem(enchantedStick);
    }


    public void give9999PoisonPotatoes(Player player) {
        player.sendMessage("нужна еда? вот еда!!");
        ItemStack poisonPotato = new ItemStack(Material.POISONOUS_POTATO, 9999);
        player.getInventory().addItem(poisonPotato);
    }

    public void giveDiamondPants(Player player) {
        player.sendMessage("за 40 гривен штаны!");
        ItemStack diamondPants = new ItemStack(Material.DIAMOND_LEGGINGS);

        ItemMeta meta = diamondPants.getItemMeta();
        meta.setDisplayName("Гомогейсие подштаники");
        diamondPants.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);

        diamondPants.setItemMeta(meta);
        player.getInventory().addItem(diamondPants);
    }

}

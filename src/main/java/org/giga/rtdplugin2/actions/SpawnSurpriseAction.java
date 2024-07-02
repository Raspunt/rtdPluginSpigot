package org.giga.rtdplugin2.actions;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Villager;
import org.giga.rtdplugin2.lists.AngryMobsList;

import java.util.Random;

public class SpawnSurpriseAction {

    public void spawnRandomMob(Player player) {
        player.sendMessage("тебе пиздец!");
        Random random = new Random();

        AngryMobsList[] angryMobs = AngryMobsList.values();
        AngryMobsList randomMobType = angryMobs[random.nextInt(angryMobs.length)];

        EntityType mobType = randomMobType.getEntityType();

        Location spawnLocation = player.getLocation();

        for (int i = 0; i < 30; i++) {
            LivingEntity mob = (LivingEntity) player.getWorld().spawnEntity(spawnLocation, mobType);
        }
    }
    public void spawnVillagers(Player player) {
        player.sendMessage("Ура вы нашли поселенцев!!");

        Location playerLocation = player.getLocation();


        for (int i = 0; i < 40; i++) {
            double randomX = playerLocation.getX() + Math.random() * 20 - 10;
            double randomZ = playerLocation.getX() + Math.random() * 20 - 10;
            Location spawnLocation = new Location(player.getWorld(), playerLocation.getX() + randomX, playerLocation.getY() + 60, playerLocation.getZ() + randomZ);

            Villager villager = (Villager) player.getWorld().spawnEntity(spawnLocation, EntityType.VILLAGER);
            villager.setProfession(Villager.Profession.FARMER);
            villager.setAI(true);
        }
    }

}

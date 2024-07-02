package org.giga.rtdplugin2.actions;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class TeleportAction {

    public void goToTheSun(Player player) {
        World world = player.getWorld();

        Location sunLocation = new Location(world, 0, 256, 0);

        player.teleport(sunLocation);
        player.sendMessage("хорошо да?");
    }
}

package org.giga.rtdplugin2.actions;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EffectAction {

    public void jumpOver9000(Player player) {
        player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 255 * 20, 100));
    }

    public void speedOver9000(Player player) {
        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 255 * 20, 100));
    }

    public void tiredOver9000(Player player) {
        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 255 * 20, 10));
    }
}

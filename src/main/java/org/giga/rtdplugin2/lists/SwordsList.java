package org.giga.rtdplugin2.lists;

import org.bukkit.Material;

public enum SwordsList {
    WOODEN_SWORD(Material.WOODEN_SWORD),
    STONE_SWORD(Material.STONE_SWORD),
    IRON_SWORD(Material.IRON_SWORD),
    GOLDEN_SWORD(Material.GOLDEN_SWORD),
    DIAMOND_SWORD(Material.DIAMOND_SWORD);

    private final Material material;

    SwordsList(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }
}

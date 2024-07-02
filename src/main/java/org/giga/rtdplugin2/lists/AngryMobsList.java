package org.giga.rtdplugin2.lists;

import org.bukkit.entity.EntityType;

public enum AngryMobsList {
    CREEPER(EntityType.CREEPER),
    ZOMBIE(EntityType.ZOMBIE),
    SKELETON(EntityType.SKELETON),
    SPIDER(EntityType.SPIDER),
    ENDERMAN(EntityType.ENDERMAN);

    private final EntityType entityType;

    AngryMobsList(EntityType entityType) {
        this.entityType = entityType;
    }

    public EntityType getEntityType() {
        return entityType;
    }
}

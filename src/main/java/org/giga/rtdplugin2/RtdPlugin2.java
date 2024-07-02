package org.giga.rtdplugin2;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.giga.rtdplugin2.commands.rtdCommand;

public final class RtdPlugin2 extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("rtd Plugin plugin is worked!!");

        getCommand("rtd").setExecutor(new rtdCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

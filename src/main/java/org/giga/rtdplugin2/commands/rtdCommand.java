package org.giga.rtdplugin2.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.giga.rtdplugin2.actions.EffectAction;
import org.giga.rtdplugin2.actions.RandomItemAction;
import org.giga.rtdplugin2.actions.SpawnSurpriseAction;
import org.bukkit.entity.Player;
import org.giga.rtdplugin2.actions.TeleportAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class rtdCommand implements CommandExecutor {

    private List<Runnable> actions = new ArrayList<>();

    private void createActionsList(Player player) {
        if (actions.isEmpty()) {
            SpawnSurpriseAction ssa = new SpawnSurpriseAction();
            RandomItemAction ria = new RandomItemAction();
            TeleportAction ta = new TeleportAction();
            EffectAction ea = new EffectAction();

            actions.add(() -> ssa.spawnRandomMob(player));
            actions.add(() -> ria.giveRandomSword(player));
            actions.add(() -> ria.give9999PoisonPotatoes(player));
            actions.add(() -> ria.giveStick(player));
            actions.add(() -> ta.goToTheSun(player));
            actions.add(() -> ta.goToTheSun(player));
            actions.add(() -> ea.speedOver9000(player));
            actions.add(() -> ea.jumpOver9000(player));
            actions.add(() -> ea.tiredOver9000(player));
            actions.add(() -> ria.giveDiamondPants(player));
            actions.add(() -> ssa.spawnVillagers(player));


        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Bukkit.getLogger().info("rtd command was executed!");
        if (!(sender instanceof Player)) {
            sender.sendMessage("The rtd command is available only for players!");
            return true;
        }

        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("rtd")) {
            createActionsList(player);

            Random random = new Random();
            Runnable action = actions.get(random.nextInt(actions.size()));
            action.run();
        }
        return true;
    }
}

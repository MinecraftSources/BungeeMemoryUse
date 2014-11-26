package me.Hugmanrique.BungeeMemoryUse;

/**
 * Created by Hugo on 26/11/2014.
 */
        import net.md_5.bungee.api.CommandSender;
        import net.md_5.bungee.api.connection.ProxiedPlayer;
        import net.md_5.bungee.api.plugin.Command;

public class command_memoria extends Command {

    public command_memoria(String name) {
        super("memoria", "BungeeCordMemoryUsage.command.memory", new String[0]);
    }

    public void execute(CommandSender sender, String[] args) {
        if(sender instanceof ProxiedPlayer) {
            ProxiedPlayer run = (ProxiedPlayer)sender;
            if(run.hasPermission("BungeeCordMemoryUsage.command.mem")) {
                Runtime run1 = Runtime.getRuntime();
                run.sendMessage("§d§l[Info] §cRAM Usada §f/ §eTotal§f / §aLibre§f]  §f" + (run1.totalMemory() - run1.freeMemory()) / 1048576L + " MB §7/ §6" + run1.totalMemory() / 1048576L + " MB §7/§2 " + run1.freeMemory() / 1048576L + " MB");
            } else {
                run.sendMessage("§c§l[Error] §fNo tienes permisos para hacer eso.");
            }
        } else {
            Runtime run2 = Runtime.getRuntime();
            System.out.println("§d§l[Info] §cRAM Usada §f/ §eTotal§f / §aLibre§f]  §f" + (run2.totalMemory() - run2.freeMemory()) / 1048576L + " MB §7/ §6" + run2.totalMemory() / 1048576L + " MB §7/§2 " + run2.freeMemory() / 1048576L + " MB");
        }
    }
}

package me.Hugmanrique.BungeeMemoryUse;

/**
 * Created by Hugo on 26/11/2014.
 */

        import me.Hugmanrique.BungeeMemoryUse.command_memoria;
        import me.Hugmanrique.BungeeMemoryUse.command_mem;
        import net.md_5.bungee.api.ProxyServer;
        import net.md_5.bungee.api.plugin.Plugin;

public class Usage extends Plugin {

    public void onEnable() {
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new command_mem("mem"));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new command_memoria("memoria"));
        this.getLogger().info(" [HABILITADO] HugmanriqueMC Version: " + this.getDescription().getVersion());
    }

    public void onDisable() {
        this.getLogger().info(" [DESHABILITADO] HugmanriqueMC Version: " + this.getDescription().getVersion());
    }
}
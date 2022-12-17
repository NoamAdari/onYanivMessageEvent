package art.kadawi.lol;

import art.kadawi.lol.Events.ShulkerFarmFixEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Lol extends JavaPlugin {
    public static Plugin instance;
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
    getServer().getPluginManager().registerEvents(new ShulkerFarmFixEvent(),this );
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

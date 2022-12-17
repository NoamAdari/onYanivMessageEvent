package art.kadawi.lol.Events;

import art.kadawi.lol.Lol;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.EventListener;

public class ShulkerFarmFixEvent implements Listener {

    @EventHandler
    public void onYanivSendEvent(AsyncPlayerChatEvent e){
        Bukkit.getScheduler().runTask(Lol.instance , ()-> {
            if (e.getPlayer().getName().equals("TheShinyBunny")) {
                Bukkit.broadcastMessage(ChatColor.RED + "" + ChatColor.BOLD + "יניב תתקן את החוות שאלקרים");
            }
        } );
    }
}

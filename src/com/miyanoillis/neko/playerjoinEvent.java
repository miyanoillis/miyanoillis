package com.miyanoillis.neko;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class playerjoinEvent implements Listener {
    @EventHandler
    public void jion (PlayerJoinEvent event){
        Player p = event.getPlayer();
        String s = String.format("test123");
        p.sendRawMessage(s);
    }
}

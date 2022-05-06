package com.miyanoillis.neko;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

    @Override
    public void onEnable()
    {
        getLogger().info(ansicolor.BLUE+">>miyanoillis<<");
        getServer().getPluginManager().registerEvents(new  playerjoinEvent(), this);
    }
}

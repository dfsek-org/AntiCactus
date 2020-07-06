package com.dfsek.anticactus;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Metrics metrics = new Metrics(this, 8099);
        this.getServer().getPluginManager().registerEvents(new EventHandler(), this);
    }
}

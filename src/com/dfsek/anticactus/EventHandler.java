package com.dfsek.anticactus;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockGrowEvent;

public class EventHandler implements Listener {
    @org.bukkit.event.EventHandler(priority = EventPriority.HIGHEST)
    public void cactusOverride(BlockGrowEvent e) {
        Location l = e.getBlock().getLocation();
        if(l.clone().subtract(0,1,0).getBlock().getType().equals(Material.CACTUS) && (l.clone().add(1,0,0).getBlock().getType().isSolid()
                || l.clone().add(0,0,1).getBlock().getType().isSolid()
                || l.clone().subtract(1,0,0).getBlock().getType().isSolid()
                || l.clone().subtract(0,0,1).getBlock().getType().isSolid())) {
            e.setCancelled(true);
        }
    }
}

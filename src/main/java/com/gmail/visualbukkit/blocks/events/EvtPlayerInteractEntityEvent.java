package com.gmail.visualbukkit.blocks.events;

import com.gmail.visualbukkit.blocks.EventBlock;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class EvtPlayerInteractEntityEvent extends EventBlock {

    public EvtPlayerInteractEntityEvent() {
        super(PlayerInteractEntityEvent.class);
    }
}
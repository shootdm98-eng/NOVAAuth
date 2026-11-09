package com.luminiadev.exampleplugin.listener;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.event.player.PlayerQuitEvent;
import cn.nukkit.utils.TextFormat;

public class EventListener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(TextFormat.DARK_GREEN + event.getPlayer().getName() + " joined the game!");
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        event.setQuitMessage(TextFormat.DARK_GREEN + event.getPlayer().getName() + " left the game!");
    }
}

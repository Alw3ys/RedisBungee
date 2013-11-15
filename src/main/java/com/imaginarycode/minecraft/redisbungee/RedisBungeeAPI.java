/**
 * Copyright © 2013 tuxed <write@imaginarycode.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See http://www.wtfpl.net/ for more details.
 */
package com.imaginarycode.minecraft.redisbungee;

import net.md_5.bungee.api.config.ServerInfo;

import java.util.Set;

/**
 * This class exposes some internal RedisBungee functions. You obtain an instance of this object by invoking {@link RedisBungee#getApi()}.
 *
 * @author tuxed
 * @since 0.2.3
 */
public class RedisBungeeAPI {
    private RedisBungee plugin;

    protected RedisBungeeAPI(RedisBungee plugin) {
        this.plugin = plugin;
    }

    /**
     * Get a combined count of all players on this network.
     *
     * @return a count of all players found
     */
    public int getPlayerCount() {
        return plugin.getCount();
    }

    /**
     * Get the last time a player was on. If the player is currently online, this will return 0. If the player has not been recorded,
     * this will return -1. Otherwise it will return a value in seconds.
     *
     * @param player a player name
     * @return the last time a player was on, if online returns a 0
     */
    public long getLastOnline(String player) {
        return plugin.getLastOnline(player);
    }

    /**
     * Get the server where the specified player is playing. This function also deals with the case of local players
     * as well, and will return local information on them.
     *
     * @param player a player name
     * @return a {@link net.md_5.bungee.api.config.ServerInfo} for the server the player is on.
     */
    public ServerInfo getServerFor(String player) {
        return plugin.getServerFor(player);
    }

    /**
     * Get a combined list of players on this network.
     * <p/>
     * Note that this function returns an immutable {@link java.util.Set}.
     *
     * @return a Set with all players found
     */
    public Set<String> getPlayersOnline() {
        return plugin.getPlayers();
    }
}

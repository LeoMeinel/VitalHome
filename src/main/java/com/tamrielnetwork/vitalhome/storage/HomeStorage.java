/*
 * VitalHome is a Spigot Plugin that gives players the ability to set homes and teleport to them.
 * Copyright © 2022 Leopold Meinel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see https://github.com/TamrielNetwork/VitalHome/blob/main/LICENSE
 */

package com.tamrielnetwork.vitalhome.storage;

import com.tamrielnetwork.vitalhome.VitalHome;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public abstract class HomeStorage {

	protected final VitalHome main = JavaPlugin.getPlugin(VitalHome.class);

	public abstract Location loadHome(@NotNull Player player, @NotNull String arg);

	public abstract Set<String> listHome(@NotNull Player player);

	public abstract void saveHome(@NotNull Player player, @NotNull String arg);

	public abstract void clear(@NotNull String playerUUID, @NotNull String arg);

}
package com.github.gurapomu

import org.bukkit.plugin.java.JavaPlugin

class Spigot_exporter : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("hello kotlin spigot exporter")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("good-bye kotlin spigot exporter")
    }
}

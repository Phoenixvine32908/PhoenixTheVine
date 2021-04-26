package me.phoenixvine.main;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerCommands();
        System.out.print("PhoenixOnTheVine is starting");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.print("PhoenixOnTheVine is disablinling");
    }



    public void registerCommands() {
        getCommand("freet").setExecutor(new Command());
    }
}

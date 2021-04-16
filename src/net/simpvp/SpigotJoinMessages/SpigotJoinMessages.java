package net.simpvp.SpigotJoinMessages;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;




public class SpigotJoinMessages extends JavaPlugin implements Listener {
	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
		getServer().getPluginManager().registerEvents(new PlayerQuit(), this);
	}


}

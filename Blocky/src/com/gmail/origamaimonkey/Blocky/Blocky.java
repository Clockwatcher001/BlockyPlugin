

/**
 * Created by Clockwatcher on 11/25/2014.
 */
public class Blocky {
    package com.gmail.clockwatcher12345.Blocky;

    import org.bukkit.plugin.java.JavaPlugin;
    import org.bukkit.ChatColor;
    import org.bukkit.command.Command;
    import org.bukkit.command.CommandSender;
    import org.bukkit.entity.Player;
    import org.bukkit.plugin.PluginDescriptionFile;

    public class MainClass extends JavaPlugin implements Listeners;

    public void onEnable() {

        getServer().getLogger().info("Blocky:" + this.getDescription.getVersion() + "Loaded!")
        getServer().getLogger().info("" +this.getDescription.getDescription())
    }
    public boolean onCommand(CommandSender sender, Command command);
    String label, String[] args) {

        if(label.equalIgnoresCase("/" + ("Blocky help")){

            ((Player) sender),sendMessage(ChatColor.RED + "            Help Page 1/2")

            ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "Heres a list of things you can ask me about the server!")
            ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "A:Who are you?")
            ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "B:What is factions?")
            ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "C:How do I get to the wilderness")
            ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "D:How do I get to the shop")

                    if(label.equalIgnoresCase("/" + ("Blocky help2")){

                ((Player) sender),sendMessage(ChatColor.RED + "            Help Page 2/2")

                ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "E:How do I create a faction?")
                ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "F:How do I apply for staff?")
                ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "G:Where can I build?")
                ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "H:How do I get to spawn?")
                ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "I:How do I claim land?")

            }

                    if(label.equalIgnoresCase("/" + ("Blocky a")) {

                ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "I am Blocky, Ill help you!")

                return 0;

            }

            if(label.equalIgnoresCase("/" + ("Blocky b")) {

                ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "A multiplayer game, inwhich you and your faction strive to be the best!")

                return 0;

            }

            if(label.equalIgnoresCase("/" + ("Blocky c")) {

                ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "/wild works on most servers, but if that doesnt work, just walk far off spawn.")

                return 0;

            }

            if(label.equalIgnoresCase("/" + ("Blocky d")) {

                ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "/warp shop, wait a few seconds after use.")

                return 0;

            }

            if(label.equalIgnoresCase("/" + ("Blocky e")) {

                ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "/f help should explain")

                return 0;

            }

            if(label.equalIgnoresCase("/" + ("Blocky f")) {

                ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "Ask one of the staff, or better yet, if there is a forum GO TO IT!")

                return 0;

            }

            if(label.equalIgnoresCase("/" + ("Blocky g")) {

                ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "Once you get to the wilderness, you should be able to.")

                return 0;

            }

            if(label.equalIgnoresCase("/" + ("Blocky h")) {

                ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "/warp spawn will work on most servers, but if that doesnt work, use /spawn")

                return 0;

            }

            if(label.equalIgnoresCase("/" + ("Blocky i")) {

                ((Player) sender),sendMessage(ChatColor.DARK_AQUA + "/f help will explain this.")

                return 0;

            }

            }
            }
            }

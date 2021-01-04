package justsiri.fks.fakespeedrun;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class FakeSpeedRun extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        getCommand("fkspedr").setExecutor(this);
        Bukkit.getPluginManager().registerEvents(new event(), this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
            ItemMeta item_meta = item.getItemMeta();
            item_meta.setDisplayName("NETTHERRITE SWOOOORD??");
            item.setItemMeta(item_meta);
            player.getInventory().addItem(item);
        }

        return true;
    }
}

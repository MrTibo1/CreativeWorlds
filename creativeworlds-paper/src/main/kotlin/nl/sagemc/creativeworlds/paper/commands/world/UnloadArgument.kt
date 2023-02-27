package nl.sagemc.creativeworlds.paper.commands.world

import me.thojs.kommandhandler.core.CommandArgument
import me.thojs.kommandhandler.core.parsers.LiteralParser
import nl.sagemc.creativeworlds.paper.worldmanager.WorldManager
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class UnloadArgument(source: CommandSender) : CommandArgument<CommandSender, String>(source, LiteralParser("unload")) {
    init {
        executor {
            if (source !is Player) return@executor
            val world = WorldManager.getWorld(source.world) ?: return@executor
            world.unload()
        }
    }
}
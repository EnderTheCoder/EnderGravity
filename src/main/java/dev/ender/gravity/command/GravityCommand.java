package dev.ender.gravity.command;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.tree.LiteralCommandNode;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.test.TestCommand;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

@Mod.EventBusSubscriber
public class GravityCommand implements Command<CommandSource> {
    public static GravityCommand INSTANCE = new GravityCommand();

    @SubscribeEvent
    public static void onServerStaring(FMLServerStartingEvent event) {
        CommandDispatcher<CommandSource> dispatcher = event.getServer().getFunctionManager().getCommandDispatcher();
        LiteralCommandNode<CommandSource> command = dispatcher.register(
                Commands.literal("gravity").then(
                        Commands.literal("gravity")
                                .requires((commandSource) -> commandSource.hasPermissionLevel(0))
                                .executes(GravityCommand.INSTANCE)
                )
        );
        dispatcher.register(Commands.literal("gravity").redirect(command));
    }

    @Override
    public int run(CommandContext<CommandSource> context) throws CommandSyntaxException {


        context.getSource().sendFeedback(new StringTextComponent("Player gravity set"), false);
        return 0;
    }
}

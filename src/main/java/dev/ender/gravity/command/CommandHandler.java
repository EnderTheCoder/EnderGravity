package dev.ender.gravity.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.tree.LiteralCommandNode;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

@Mod.EventBusSubscriber
public class CommandHandler  {
    public static NormalHandler NORINS = new NormalHandler();




    @SubscribeEvent
    public static void onServerStaring(FMLServerStartingEvent event) {
        CommandDispatcher<CommandSource> dispatcher = event.getServer().getFunctionManager().getCommandDispatcher();
        LiteralCommandNode<CommandSource> command1 = dispatcher.register(
                Commands.literal("gravity").then(
                        Commands.literal("normal")
                                .requires((commandSource) -> commandSource.hasPermissionLevel(0))
                                .executes(CommandHandler.NORINS)
                )
        );

        LiteralCommandNode<CommandSource> command2 = dispatcher.register(
                Commands.literal("gravity").then(
                        Commands.literal("up")
                                .requires((commandSource) -> commandSource.hasPermissionLevel(0))
                                .executes(CommandHandler.NORINS)
                )
        );

        LiteralCommandNode<CommandSource> command3 = dispatcher.register(
                Commands.literal("gravity").then(
                        Commands.literal("px")
                                .requires((commandSource) -> commandSource.hasPermissionLevel(0))
                                .executes(CommandHandler.NORINS)
                )
        );

        LiteralCommandNode<CommandSource> command4 = dispatcher.register(
                Commands.literal("gravity").then(
                        Commands.literal("mx")
                                .requires((commandSource) -> commandSource.hasPermissionLevel(0))
                                .executes(CommandHandler.NORINS)
                )
        );

        LiteralCommandNode<CommandSource> command5 = dispatcher.register(
                Commands.literal("gravity").then(
                        Commands.literal("py")
                                .requires((commandSource) -> commandSource.hasPermissionLevel(0))
                                .executes(CommandHandler.NORINS)
                )
        );

        LiteralCommandNode<CommandSource> command6 = dispatcher.register(
                Commands.literal("gravity").then(
                        Commands.literal("my")
                                .requires((commandSource) -> commandSource.hasPermissionLevel(0))
                                .executes(CommandHandler.NORINS)
                )
        );







        //dispatcher.register(Commands.literal("gravity").redirect(command));
    }




}

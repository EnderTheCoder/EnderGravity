package dev.ender.gravity.command;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import dev.ender.gravity.IGravity;
import dev.ender.gravity.mixin.PlayerEntityMixin;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MinecraftGame;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import org.apache.logging.log4j.core.jmx.Server;

public class MXHandler implements Command<CommandSource> {

    @Override
    public int run(CommandContext<CommandSource> context) throws CommandSyntaxException {
        context.getSource().sendFeedback(new TranslationTextComponent("cmd error"), false);


        String[] cmd = context.getInput().split(" ");
            if( cmd.length != 3){
                    context.getSource().sendFeedback(new TranslationTextComponent("cmd error"), false);
            }else{
            NetworkPlayerInfo pi = Minecraft.getInstance().getConnection().getPlayerInfo(cmd[2]);
                pi.
            }
        }



    }
}

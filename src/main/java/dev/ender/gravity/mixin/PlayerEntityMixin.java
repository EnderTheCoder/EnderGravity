package dev.ender.gravity.mixin;

import dev.ender.gravity.IGravity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effects;
import net.minecraft.util.IReorderingProcessor;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.world.World;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.io.Console;
import java.util.List;


@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity implements IGravity {
    //@Shadow public abstract void addMovementStat(double p_71000_1_, double p_71000_3_, double p_71000_5_);

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> p_i48577_1_, World p_i48577_2_) {
        super(p_i48577_1_, p_i48577_2_);
    }



    @Inject(method = "travel", at = @At("RETURN"))
    public void travel_injector(Vector3d p_213352_1_, CallbackInfo ci) {

//        if (this.getPosZ() <= 0.0  ) {
//            //this.setMotion(this.getMotion().x, this.getMotion().y ,0);
//        } else {

        switch (GS) {
            case NORMAL: {
                break;
            }
            case UP: {
                this.setMotion(this.getMotion().x , this.getMotion().y + 0.16, this.getMotion().z);
            }
            case PX: {
                this.setMotion(this.getMotion().x + 0.08 , this.getMotion().y , this.getMotion().z);
            }
            case MX: {
                this.setMotion(this.getMotion().x - 0.08, this.getMotion().y, this.getMotion().z);
            }
            case PZ: {
                this.setMotion(this.getMotion().x , this.getMotion().y , this.getMotion().z + 0.08);
            }
            case MZ: {
                this.setMotion(this.getMotion().x , this.getMotion().y , this.getMotion().z - 0.08);
            }
        }
    }

    public GravityState GS = GravityState.NORMAL;

    public void setState(GravityState gs){
        this.GS = gs;
    }

    public GravityState getState(){
        return this.GS;
    }
}


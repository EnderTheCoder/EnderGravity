package dev.ender.gravity.mixin;

import dev.ender.gravity.IGravity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity implements IGravity {
    protected PlayerEntityMixin(EntityType<? extends LivingEntity> p_i48577_1_, World p_i48577_2_) {
        super(p_i48577_1_, p_i48577_2_);
    }



    @Inject(method = "travel", at = @At("TAIL"))
    public void travel_injector(Vector3d p_213352_1_, CallbackInfo ci) {

        if (this.getPosZ() <= 0.0  ) {
            this.setMotion(this.getMotion().x, this.getMotion().y + 0.08 ,0);
        } else this.setMotion(this.getMotion().x, this.getMotion().y + 0.08, this.getMotion().z + 0.08);
    }
}


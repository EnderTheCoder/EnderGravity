package dev.ender.gravity.mixin;

import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.storage.IServerConfiguration;
import net.minecraft.world.storage.SaveFormat;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.WorldPersistenceHooks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

//@Mixin(ForgeMod.class)
//public abstract  class ForgeModMixin implements WorldPersistenceHooks.WorldPersistenceHook {
//
//    public final RegistryObject<Attribute> ENTITY_GRAVITY;
//
//    protected ForgeModMixin(RegistryObject<Attribute> entity_gravity) {
//        ENTITY_GRAVITY = entity_gravity;
//    }
//
//    @Shadow
//    public abstract String getModId();
//
//    @Shadow
//    public abstract CompoundNBT getDataForWriting(SaveFormat.LevelSave levelSave, IServerConfiguration iServerConfiguration);
//
//    @Shadow
//    public abstract void readData(SaveFormat.LevelSave levelSave, IServerConfiguration iServerConfiguration, CompoundNBT compoundNBT);
//}

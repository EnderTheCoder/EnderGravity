package dev.ender.gravity.client;

import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class GravityCameraReset {

    public static float rotation = 0;

    @SubscribeEvent
    public static void onViewRotation(EntityViewRenderEvent.CameraSetup event) {

        ClientPlayerEntity player = (ClientPlayerEntity) event.getInfo().getRenderViewEntity();
//        if (player.getAttribute())
//        event.setRoll(90f);
    }

    @SubscribeEvent
    public static void onViewPositionReset(EntityViewRenderEvent event) {

    }

    @SubscribeEvent
    public static void onPlayerEntityRender(RenderPlayerEvent event) {
        event.getRenderer().getEntityModel().bipedRightLeg.rotationPointZ = 1.0f;
        event.getMatrixStack().rotate(Vector3f.ZP.rotationDegrees(rotation++));
//        event.getMatrixStack().rotate(Vector3f.XP.rotationDegrees(rotation));
//        event.getMatrixStack().rotate(Vector3f.YP.rotationDegrees(rotation));
    }
}

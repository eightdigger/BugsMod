package net.eightdigger.bug_friends.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.eightdigger.bug_friends.BugFriends;
import net.eightdigger.bug_friends.entity.custom.BeetleEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.behavior.BackUpIfTooClose;


public class BeetleRenderer extends MobRenderer<BeetleEntity, BeetleModel<BeetleEntity>> {


    public BeetleRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new BeetleModel<>(pContext.bakeLayer(ModModelLayers.BEETLE_LAYER)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(BeetleEntity pEntity) {
        return new ResourceLocation(BugFriends.MOD_ID, "textures/entity/rhinobeetlegold.png");
    }

    @Override
    public void render(BeetleEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()){
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}

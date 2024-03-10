package net.eightdigger.bug_friends.entity.client;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.eightdigger.bug_friends.entity.animations.ModAnimationDefinitons;
import net.eightdigger.bug_friends.entity.custom.BeetleEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;



public class BeetleModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart Beetle;
	private final ModelPart head;

	public BeetleModel(ModelPart root) {
		this.Beetle = root.getChild("Beetle");
		this.head = Beetle.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Beetle = partdefinition.addOrReplaceChild("Beetle", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = Beetle.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.025F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(10, 1).addBox(0.0F, -1.975F, -4.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(12, 0).addBox(0.0F, -2.975F, -5.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(10, 0).addBox(-1.0F, -1.975F, -5.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.975F, -2.0F));

		PartDefinition body = Beetle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition RightLeg = body.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(3.0589F, 2.0354F, -1.3544F));

		PartDefinition fR = RightLeg.addOrReplaceChild("fR", CubeListBuilder.create(), PartPose.offset(-4.5089F, -2.2104F, -0.1456F));

		PartDefinition cube_r1 = fR.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 10).addBox(0.8F, -2.1F, -2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.0F, 1.5F, 0.0F, 0.0F, 0.7418F));

		PartDefinition mR = RightLeg.addOrReplaceChild("mR", CubeListBuilder.create(), PartPose.offset(-4.5089F, -2.2104F, 1.3544F));

		PartDefinition cube_r2 = mR.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 10).mirror().addBox(0.8F, -2.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.7418F));

		PartDefinition bR = RightLeg.addOrReplaceChild("bR", CubeListBuilder.create(), PartPose.offset(-4.5089F, -2.2104F, 2.8544F));

		PartDefinition cube_r3 = bR.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 10).mirror().addBox(0.8F, -2.1F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.0F, -1.5F, 0.0F, 0.0F, 0.7418F));

		PartDefinition LeftLeg = body.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(-3.0589F, 2.0354F, -1.3544F));

		PartDefinition fL = LeftLeg.addOrReplaceChild("fL", CubeListBuilder.create(), PartPose.offset(4.5089F, -2.2104F, -0.1456F));

		PartDefinition cube_r4 = fL.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(10, 10).mirror().addBox(-0.8F, -2.1F, -2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 1.0F, 1.5F, 0.0F, 0.0F, -0.7418F));

		PartDefinition mL = LeftLeg.addOrReplaceChild("mL", CubeListBuilder.create(), PartPose.offset(4.5089F, -2.2104F, 1.3544F));

		PartDefinition cube_r5 = mL.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 10).addBox(-0.8F, -2.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.7418F));

		PartDefinition bL = LeftLeg.addOrReplaceChild("bL", CubeListBuilder.create(), PartPose.offset(4.5089F, -2.2104F, 2.8544F));

		PartDefinition cube_r6 = bL.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(12, 10).addBox(-0.8F, -2.1F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.0F, -1.5F, 0.0F, 0.0F, -0.7418F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitons.BEETLE_WALK, limbSwing, limbSwingAmount, 2f, 1f);
		this.animate(((BeetleEntity) entity).idleAnimationState, ModAnimationDefinitons.BEETLE_IDLE, ageInTicks, 1f);
		this.animate(((BeetleEntity) entity).attackAnimationState, ModAnimationDefinitons.BEETLE_ATTACK, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Beetle.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Beetle;
	}
}
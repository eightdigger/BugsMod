package net.eightdigger.bug_friends.entity.client;

import com.ibm.icu.text.Normalizer;
import net.eightdigger.bug_friends.BugFriends;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation BEETLE_LAYER = new ModelLayerLocation(
            new ResourceLocation(BugFriends.MOD_ID, "beetle_layer"), "main");

}

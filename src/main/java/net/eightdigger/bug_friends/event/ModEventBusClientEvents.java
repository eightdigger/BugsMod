package net.eightdigger.bug_friends.event;

import net.eightdigger.bug_friends.BugFriends;
import net.eightdigger.bug_friends.entity.client.BeetleModel;
import net.eightdigger.bug_friends.entity.client.ModModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BugFriends.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.BEETLE_LAYER, BeetleModel::createBodyLayer);
    }
}

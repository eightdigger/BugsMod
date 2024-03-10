package net.eightdigger.bug_friends.event;

import net.eightdigger.bug_friends.BugFriends;
import net.eightdigger.bug_friends.entity.ModEntities;
import net.eightdigger.bug_friends.entity.custom.BeetleEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber(modid = BugFriends.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.BEETLE.get(), BeetleEntity.createAttributes().build());
    }

}

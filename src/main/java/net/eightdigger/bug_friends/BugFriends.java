package net.eightdigger.bug_friends;

import com.mojang.logging.LogUtils;
import net.eightdigger.bug_friends.entity.ModEntities;
import net.eightdigger.bug_friends.entity.client.BeetleRenderer;
import net.eightdigger.bug_friends.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import javax.swing.text.html.parser.Entity;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BugFriends.MOD_ID)
public class BugFriends
{
    public static final String MOD_ID = "bug_friends";
    private static final Logger LOGGER = LogUtils.getLogger();
    public BugFriends()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        ModEntities.register((modEventBus));

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }
    private void commonSetup(final FMLCommonSetupEvent event) {

    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.BEETLE_HUSK);
        }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.GOLDEN_BEETLE_HUSK);
        }
        if(event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.BEETLE_SPAWN_EGG);
        }

    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.BEETLE.get(), BeetleRenderer::new);
        }
    }
}

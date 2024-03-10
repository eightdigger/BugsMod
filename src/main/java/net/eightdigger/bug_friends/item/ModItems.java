package net.eightdigger.bug_friends.item;

import net.eightdigger.bug_friends.BugFriends;
import net.eightdigger.bug_friends.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BugFriends.MOD_ID);

    public static final RegistryObject<Item> BEETLE_HUSK = ITEMS.register("beetle_husk",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLDEN_BEETLE_HUSK = ITEMS.register("golden_beetle_husk",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> BEETLE_SPAWN_EGG = ITEMS.register("beetle_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BEETLE, 0x7d3833, 0x3b2027, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

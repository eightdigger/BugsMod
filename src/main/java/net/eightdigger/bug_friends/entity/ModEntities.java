package net.eightdigger.bug_friends.entity;

import net.eightdigger.bug_friends.BugFriends;
import net.eightdigger.bug_friends.entity.custom.BeetleEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.text.DefaultFormatter;
import javax.swing.text.html.parser.Entity;

public class ModEntities {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BugFriends.MOD_ID);

    public static final RegistryObject<EntityType<BeetleEntity>> BEETLE =
            ENTITY_TYPES.register("beetle", () -> EntityType.Builder.of(BeetleEntity::new, MobCategory.CREATURE)
                    .sized(0.3f,0.3f).build("beetle"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

/*    */ package net.mcreator.clones.init;
/*    */ 
/*    */ import java.util.function.Supplier;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraftforge.common.ForgeSpawnEggItem;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ClonesModItems
/*    */ {
/* 17 */   public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "clones");
/* 18 */   public static final RegistryObject<Item> CLONE_PIG_SPAWN_EGG = REGISTRY.register("clone_pig_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)ClonesModEntities.CLONE_PIG, -16777216, -65485, new Item.Properties()));
/* 19 */   public static final RegistryObject<Item> TRUE_CLONE_PIG_SPAWN_EGG = REGISTRY.register("true_clone_pig_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)ClonesModEntities.TRUE_CLONE_PIG, -16777216, -65485, new Item.Properties()));
/* 20 */   public static final RegistryObject<Item> TESTOK_SPAWN_EGG = REGISTRY.register("testok_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)ClonesModEntities.TESTOK, -1, -1, new Item.Properties()));
/* 21 */   public static final RegistryObject<Item> CLONE_ZOMBIE_SPAWN_EGG = REGISTRY.register("clone_zombie_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)ClonesModEntities.CLONE_ZOMBIE, -6710887, -3355444, new Item.Properties()));
/* 22 */   public static final RegistryObject<Item> CLONE_CREEPER_SPAWN_EGG = REGISTRY.register("clone_creeper_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)ClonesModEntities.CLONE_CREEPER, -3381760, -10079488, new Item.Properties()));
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/clones-1.0.0.jar!/net/mcreator/clones/init/ClonesModItems.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
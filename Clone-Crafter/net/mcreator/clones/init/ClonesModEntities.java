/*    */ package net.mcreator.clones.init;
/*    */ 
/*    */ import java.util.function.BiFunction;
/*    */ import net.mcreator.clones.entity.CloneCreeperEntity;
/*    */ import net.mcreator.clones.entity.ClonePigEntity;
/*    */ import net.mcreator.clones.entity.CloneZombieEntity;
/*    */ import net.mcreator.clones.entity.TestokEntity;
/*    */ import net.mcreator.clones.entity.TrueClonePigEntity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobCategory;
/*    */ import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class ClonesModEntities
/*    */ {
/* 28 */   public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "clones");
/* 29 */   public static final RegistryObject<EntityType<ClonePigEntity>> CLONE_PIG = register("clone_pig", 
/* 30 */       EntityType.Builder.m_20704_(ClonePigEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(900).setUpdateInterval(3).setCustomClientFactory(ClonePigEntity::new).m_20719_().m_20699_(0.9F, 0.9F));
/* 31 */   public static final RegistryObject<EntityType<TrueClonePigEntity>> TRUE_CLONE_PIG = register("true_clone_pig", EntityType.Builder.m_20704_(TrueClonePigEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 32 */       .setTrackingRange(201).setUpdateInterval(3).setCustomClientFactory(TrueClonePigEntity::new).m_20719_().m_20699_(0.9F, 0.9F));
/* 33 */   public static final RegistryObject<EntityType<TestokEntity>> TESTOK = register("testok", 
/* 34 */       EntityType.Builder.m_20704_(TestokEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TestokEntity::new)
/*    */       
/* 36 */       .m_20699_(0.6F, 1.8F));
/* 37 */   public static final RegistryObject<EntityType<CloneZombieEntity>> CLONE_ZOMBIE = register("clone_zombie", 
/* 38 */       EntityType.Builder.m_20704_(CloneZombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CloneZombieEntity::new)
/*    */       
/* 40 */       .m_20699_(0.6F, 1.8F));
/* 41 */   public static final RegistryObject<EntityType<CloneCreeperEntity>> CLONE_CREEPER = register("clone_creeper", 
/* 42 */       EntityType.Builder.m_20704_(CloneCreeperEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CloneCreeperEntity::new)
/*    */       
/* 44 */       .m_20699_(0.6F, 1.7F));
/*    */   
/*    */   private static <T extends net.minecraft.world.entity.Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
/* 47 */     return REGISTRY.register(registryname, () -> entityTypeBuilder.m_20712_(registryname));
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void init(FMLCommonSetupEvent event) {
/* 52 */     event.enqueueWork(() -> {
/*    */           ClonePigEntity.init();
/*    */           TrueClonePigEntity.init();
/*    */           TestokEntity.init();
/*    */           CloneZombieEntity.init();
/*    */           CloneCreeperEntity.init();
/*    */         });
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerAttributes(EntityAttributeCreationEvent event) {
/* 63 */     event.put((EntityType)CLONE_PIG.get(), ClonePigEntity.createAttributes().m_22265_());
/* 64 */     event.put((EntityType)TRUE_CLONE_PIG.get(), TrueClonePigEntity.createAttributes().m_22265_());
/* 65 */     event.put((EntityType)TESTOK.get(), TestokEntity.createAttributes().m_22265_());
/* 66 */     event.put((EntityType)CLONE_ZOMBIE.get(), CloneZombieEntity.createAttributes().m_22265_());
/* 67 */     event.put((EntityType)CLONE_CREEPER.get(), CloneCreeperEntity.createAttributes().m_22265_());
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/clones-1.0.0.jar!/net/mcreator/clones/init/ClonesModEntities.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
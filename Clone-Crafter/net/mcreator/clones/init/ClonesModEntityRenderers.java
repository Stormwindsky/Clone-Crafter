/*    */ package net.mcreator.clones.init;
/*    */ 
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.client.event.EntityRenderersEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */ public class ClonesModEntityRenderers
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
/* 22 */     event.registerEntityRenderer((EntityType)ClonesModEntities.CLONE_PIG.get(), net.mcreator.clones.client.renderer.ClonePigRenderer::new);
/* 23 */     event.registerEntityRenderer((EntityType)ClonesModEntities.TRUE_CLONE_PIG.get(), net.mcreator.clones.client.renderer.TrueClonePigRenderer::new);
/* 24 */     event.registerEntityRenderer((EntityType)ClonesModEntities.TESTOK.get(), net.mcreator.clones.client.renderer.TestokRenderer::new);
/* 25 */     event.registerEntityRenderer((EntityType)ClonesModEntities.CLONE_ZOMBIE.get(), net.mcreator.clones.client.renderer.CloneZombieRenderer::new);
/* 26 */     event.registerEntityRenderer((EntityType)ClonesModEntities.CLONE_CREEPER.get(), net.mcreator.clones.client.renderer.CloneCreeperRenderer::new);
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/clones-1.0.0.jar!/net/mcreator/clones/init/ClonesModEntityRenderers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
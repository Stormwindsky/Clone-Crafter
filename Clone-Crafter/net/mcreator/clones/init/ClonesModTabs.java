/*    */ package net.mcreator.clones.init;
/*    */ 
/*    */ import net.minecraft.world.item.CreativeModeTabs;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.event.CreativeModeTabEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class ClonesModTabs
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {
/* 18 */     if (tabData.getTab() == CreativeModeTabs.f_256731_) {
/* 19 */       tabData.m_246326_((ItemLike)ClonesModItems.CLONE_PIG_SPAWN_EGG.get());
/* 20 */       tabData.m_246326_((ItemLike)ClonesModItems.TRUE_CLONE_PIG_SPAWN_EGG.get());
/* 21 */       tabData.m_246326_((ItemLike)ClonesModItems.TESTOK_SPAWN_EGG.get());
/* 22 */       tabData.m_246326_((ItemLike)ClonesModItems.CLONE_ZOMBIE_SPAWN_EGG.get());
/* 23 */       tabData.m_246326_((ItemLike)ClonesModItems.CLONE_CREEPER_SPAWN_EGG.get());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/clones-1.0.0.jar!/net/mcreator/clones/init/ClonesModTabs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
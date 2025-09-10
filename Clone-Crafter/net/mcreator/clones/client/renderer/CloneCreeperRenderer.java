/*    */ package net.mcreator.clones.client.renderer;
/*    */ 
/*    */ import net.mcreator.clones.entity.CloneCreeperEntity;
/*    */ import net.minecraft.client.model.CreeperModel;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.model.geom.ModelLayers;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class CloneCreeperRenderer extends MobRenderer<CloneCreeperEntity, CreeperModel<CloneCreeperEntity>> {
/*    */   public CloneCreeperRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new CreeperModel(context.m_174023_(ModelLayers.f_171285_)), 0.5F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(CloneCreeperEntity entity) {
/* 19 */     return new ResourceLocation("clones:textures/entities/clonecreeper.png");
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/clones-1.0.0.jar!/net/mcreator/clones/client/renderer/CloneCreeperRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
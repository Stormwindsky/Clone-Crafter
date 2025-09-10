/*    */ package net.mcreator.clones.client.renderer;
/*    */ 
/*    */ import net.mcreator.clones.entity.ClonePigEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.model.PigModel;
/*    */ import net.minecraft.client.model.geom.ModelLayers;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class ClonePigRenderer extends MobRenderer<ClonePigEntity, PigModel<ClonePigEntity>> {
/*    */   public ClonePigRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new PigModel(context.m_174023_(ModelLayers.f_171205_)), 0.5F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(ClonePigEntity entity) {
/* 19 */     return new ResourceLocation("clones:textures/entities/clonepig.png");
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/clones-1.0.0.jar!/net/mcreator/clones/client/renderer/ClonePigRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package net.mcreator.clones.client.renderer;
/*    */ import net.mcreator.clones.entity.CloneZombieEntity;
/*    */ import net.minecraft.client.model.HumanoidModel;
/*    */ import net.minecraft.client.model.geom.ModelLayers;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
/*    */ import net.minecraft.client.renderer.entity.layers.RenderLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class CloneZombieRenderer extends HumanoidMobRenderer<CloneZombieEntity, HumanoidModel<CloneZombieEntity>> {
/*    */   public CloneZombieRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, new HumanoidModel(context.m_174023_(ModelLayers.f_171162_)), 0.5F);
/* 16 */     m_115326_((RenderLayer)new HumanoidArmorLayer((RenderLayerParent)this, new HumanoidModel(context.m_174023_(ModelLayers.f_171164_)), new HumanoidModel(context.m_174023_(ModelLayers.f_171165_)), context.m_266367_()));
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(CloneZombieEntity entity) {
/* 21 */     return new ResourceLocation("clones:textures/entities/666.png");
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/clones-1.0.0.jar!/net/mcreator/clones/client/renderer/CloneZombieRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
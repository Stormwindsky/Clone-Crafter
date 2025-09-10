/*    */ package net.mcreator.clones.entity;
/*    */ 
/*    */ import java.util.EnumSet;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.ai.goal.Goal;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */   extends Goal
/*    */ {
/*    */   null() {
/* 61 */     m_7021_(EnumSet.of(Goal.Flag.MOVE));
/*    */   }
/*    */   
/*    */   public boolean m_8036_() {
/* 65 */     if (CloneZombieEntity.this.m_5448_() != null && !CloneZombieEntity.this.m_21566_().m_24995_()) {
/* 66 */       return true;
/*    */     }
/* 68 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean m_8045_() {
/* 74 */     return (CloneZombieEntity.this.m_21566_().m_24995_() && CloneZombieEntity.this.m_5448_() != null && CloneZombieEntity.this.m_5448_().m_6084_());
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_8056_() {
/* 79 */     LivingEntity livingentity = CloneZombieEntity.this.m_5448_();
/* 80 */     Vec3 vec3d = livingentity.m_20299_(1.0F);
/* 81 */     CloneZombieEntity.access$000(CloneZombieEntity.this).m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 1.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_8037_() {
/* 86 */     LivingEntity livingentity = CloneZombieEntity.this.m_5448_();
/* 87 */     if (CloneZombieEntity.this.m_20191_().m_82381_(livingentity.m_20191_())) {
/* 88 */       CloneZombieEntity.this.m_7327_((Entity)livingentity);
/*    */     } else {
/* 90 */       double d0 = CloneZombieEntity.this.m_20280_((Entity)livingentity);
/* 91 */       if (d0 < 16.0D) {
/* 92 */         Vec3 vec3d = livingentity.m_20299_(1.0F);
/* 93 */         CloneZombieEntity.access$100(CloneZombieEntity.this).m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 1.0D);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/clones-1.0.0.jar!/net/mcreator/clones/entity/CloneZombieEntity$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package net.mcreator.clones.procedures;
/*    */ 
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class CloneZombieOnEntityTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 14 */     if (entity == null)
/*    */       return; 
/* 16 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).isEmpty() && 
/* 17 */       entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity; if (!_entity.f_19853_.m_5776_())
/* 18 */         _entity.m_7292_(new MobEffectInstance(MobEffects.f_19596_, 60, 3, false, false));  }
/*    */   
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/clones-1.0.0.jar!/net/mcreator/clones/procedures/CloneZombieOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
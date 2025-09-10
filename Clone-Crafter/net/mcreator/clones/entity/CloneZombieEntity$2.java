/*     */ package net.mcreator.clones.entity;
/*     */ 
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class null
/*     */   extends RandomStrollGoal
/*     */ {
/*     */   null(PathfinderMob arg0, double arg1, int arg2) {
/*  98 */     super(arg0, arg1, arg2);
/*     */   }
/*     */   protected Vec3 m_7037_() {
/* 101 */     RandomSource random = CloneZombieEntity.this.m_217043_();
/* 102 */     double dir_x = CloneZombieEntity.this.m_20185_() + ((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
/* 103 */     double dir_y = CloneZombieEntity.this.m_20186_() + ((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
/* 104 */     double dir_z = CloneZombieEntity.this.m_20189_() + ((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
/* 105 */     return new Vec3(dir_x, dir_y, dir_z);
/*     */   }
/*     */ }


/* Location:              /home/stormwindsky/Téléchargements/clones-1.0.0.jar!/net/mcreator/clones/entity/CloneZombieEntity$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
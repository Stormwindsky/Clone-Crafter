/*     */ package net.mcreator.clones.entity;
/*     */ import java.util.EnumSet;
/*     */ import net.mcreator.clones.init.ClonesModEntities;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientGamePacketListener;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.Difficulty;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.SpawnPlacements;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.control.MoveControl;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.levelgen.Heightmap;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class CloneZombieEntity extends Monster {
/*     */   public CloneZombieEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  41 */     this((EntityType<CloneZombieEntity>)ClonesModEntities.CLONE_ZOMBIE.get(), world);
/*     */   }
/*     */   
/*     */   public CloneZombieEntity(EntityType<CloneZombieEntity> type, Level world) {
/*  45 */     super(type, world);
/*  46 */     this.f_19793_ = 0.6F;
/*  47 */     this.f_21364_ = 0;
/*  48 */     m_21557_(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  53 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  58 */     super.m_8099_();
/*  59 */     this.f_21345_.m_25352_(1, new Goal()
/*     */         {
/*     */ 
/*     */           
/*     */           public boolean m_8036_()
/*     */           {
/*  65 */             if (CloneZombieEntity.this.m_5448_() != null && !CloneZombieEntity.this.m_21566_().m_24995_()) {
/*  66 */               return true;
/*     */             }
/*  68 */             return false;
/*     */           }
/*     */ 
/*     */ 
/*     */           
/*     */           public boolean m_8045_() {
/*  74 */             return (CloneZombieEntity.this.m_21566_().m_24995_() && CloneZombieEntity.this.m_5448_() != null && CloneZombieEntity.this.m_5448_().m_6084_());
/*     */           }
/*     */ 
/*     */           
/*     */           public void m_8056_() {
/*  79 */             LivingEntity livingentity = CloneZombieEntity.this.m_5448_();
/*  80 */             Vec3 vec3d = livingentity.m_20299_(1.0F);
/*  81 */             CloneZombieEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 1.0D);
/*     */           }
/*     */ 
/*     */           
/*     */           public void m_8037_() {
/*  86 */             LivingEntity livingentity = CloneZombieEntity.this.m_5448_();
/*  87 */             if (CloneZombieEntity.this.m_20191_().m_82381_(livingentity.m_20191_())) {
/*  88 */               CloneZombieEntity.this.m_7327_((Entity)livingentity);
/*     */             } else {
/*  90 */               double d0 = CloneZombieEntity.this.m_20280_((Entity)livingentity);
/*  91 */               if (d0 < 16.0D) {
/*  92 */                 Vec3 vec3d = livingentity.m_20299_(1.0F);
/*  93 */                 CloneZombieEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 1.0D);
/*     */               } 
/*     */             } 
/*     */           }
/*     */         });
/*  98 */     this.f_21345_.m_25352_(2, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D, 20)
/*     */         {
/*     */           protected Vec3 m_7037_() {
/* 101 */             RandomSource random = CloneZombieEntity.this.m_217043_();
/* 102 */             double dir_x = CloneZombieEntity.this.m_20185_() + ((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
/* 103 */             double dir_y = CloneZombieEntity.this.m_20186_() + ((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
/* 104 */             double dir_z = CloneZombieEntity.this.m_20189_() + ((random.m_188501_() * 2.0F - 1.0F) * 16.0F);
/* 105 */             return new Vec3(dir_x, dir_y, dir_z);
/*     */           }
/*     */         });
/* 108 */     this.f_21345_.m_25352_(3, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/* 111 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/* 114 */     this.f_21345_.m_25352_(4, (Goal)new RandomLookAroundGoal((Mob)this));
/* 115 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, false, false));
/* 116 */     this.f_21346_.m_25352_(6, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 121 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public double m_6049_() {
/* 126 */     return -0.35D;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 131 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 136 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6075_() {
/* 141 */     super.m_6075_();
/* 142 */     CloneZombieOnEntityTickUpdateProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */   
/*     */   public static void init() {
/* 146 */     SpawnPlacements.m_21754_((EntityType)ClonesModEntities.CLONE_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> 
/* 147 */         (world.m_46791_() != Difficulty.PEACEFUL && Monster.m_219009_(world, pos, random) && Mob.m_217057_(entityType, (LevelAccessor)world, reason, pos, random)));
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 151 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 152 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 153 */     builder = builder.m_22268_(Attributes.f_22276_, 10.0D);
/* 154 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 155 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 156 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 157 */     return builder;
/*     */   }
/*     */ }


/* Location:              /home/stormwindsky/Téléchargements/clones-1.0.0.jar!/net/mcreator/clones/entity/CloneZombieEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
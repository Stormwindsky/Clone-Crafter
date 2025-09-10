/*     */ package net.mcreator.clones.entity;
/*     */ import net.mcreator.clones.init.ClonesModEntities;
/*     */ import net.mcreator.clones.procedures.ClonePigOnEntityTickUpdateProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientGamePacketListener;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.Difficulty;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
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
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class ClonePigEntity extends Monster {
/*     */   public ClonePigEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  40 */     this((EntityType<ClonePigEntity>)ClonesModEntities.CLONE_PIG.get(), world);
/*     */   }
/*     */   
/*     */   public ClonePigEntity(EntityType<ClonePigEntity> type, Level world) {
/*  44 */     super(type, world);
/*  45 */     this.f_19793_ = 0.6F;
/*  46 */     this.f_21364_ = 0;
/*  47 */     m_21557_(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  52 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  57 */     super.m_8099_();
/*  58 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  61 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  64 */     this.f_21346_.m_25352_(2, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  65 */     this.f_21345_.m_25352_(3, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/*  66 */     this.f_21345_.m_25352_(4, (Goal)new RandomLookAroundGoal((Mob)this));
/*  67 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, false, false));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  72 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  77 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.scream"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/*  82 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.scream"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource damagesource, float amount) {
/*  87 */     if (damagesource.m_276093_(DamageTypes.f_268631_))
/*  88 */       return false; 
/*  89 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.AbstractArrow)
/*  90 */       return false; 
/*  91 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || damagesource.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/*  92 */       return false; 
/*  93 */     if (damagesource.m_276093_(DamageTypes.f_268671_))
/*  94 */       return false; 
/*  95 */     if (damagesource.m_276093_(DamageTypes.f_268585_))
/*  96 */       return false; 
/*  97 */     if (damagesource.m_276093_(DamageTypes.f_268722_))
/*  98 */       return false; 
/*  99 */     if (damagesource.m_276093_(DamageTypes.f_268450_))
/* 100 */       return false; 
/* 101 */     if (damagesource.m_276093_(DamageTypes.f_268565_))
/* 102 */       return false; 
/* 103 */     if (damagesource.m_276093_(DamageTypes.f_268714_))
/* 104 */       return false; 
/* 105 */     if (damagesource.m_276093_(DamageTypes.f_268526_))
/* 106 */       return false; 
/* 107 */     if (damagesource.m_276093_(DamageTypes.f_268482_))
/* 108 */       return false; 
/* 109 */     if (damagesource.m_276093_(DamageTypes.f_268493_))
/* 110 */       return false; 
/* 111 */     if (damagesource.m_276093_(DamageTypes.f_268641_))
/* 112 */       return false; 
/* 113 */     return super.m_6469_(damagesource, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6075_() {
/* 118 */     super.m_6075_();
/* 119 */     ClonePigOnEntityTickUpdateProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */   
/*     */   public static void init() {
/* 123 */     SpawnPlacements.m_21754_((EntityType)ClonesModEntities.CLONE_PIG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> 
/* 124 */         (world.m_46791_() != Difficulty.PEACEFUL && Monster.m_219009_(world, pos, random) && Mob.m_217057_(entityType, (LevelAccessor)world, reason, pos, random)));
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 128 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 129 */     builder = builder.m_22268_(Attributes.f_22279_, 0.4D);
/* 130 */     builder = builder.m_22268_(Attributes.f_22276_, 10.0D);
/* 131 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 132 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 133 */     builder = builder.m_22268_(Attributes.f_22277_, 900.0D);
/* 134 */     return builder;
/*     */   }
/*     */ }


/* Location:              /home/stormwindsky/Téléchargements/clones-1.0.0.jar!/net/mcreator/clones/entity/ClonePigEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
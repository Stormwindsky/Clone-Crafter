/*     */ package net.mcreator.clones.entity;
/*     */ import net.mcreator.clones.init.ClonesModEntities;
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
/*     */ public class TrueClonePigEntity extends Monster {
/*     */   public TrueClonePigEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  39 */     this((EntityType<TrueClonePigEntity>)ClonesModEntities.TRUE_CLONE_PIG.get(), world);
/*     */   }
/*     */   
/*     */   public TrueClonePigEntity(EntityType<TrueClonePigEntity> type, Level world) {
/*  43 */     super(type, world);
/*  44 */     this.f_19793_ = 0.6F;
/*  45 */     this.f_21364_ = 0;
/*  46 */     m_21557_(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<ClientGamePacketListener> m_5654_() {
/*  51 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  56 */     super.m_8099_();
/*  57 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  60 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  63 */     this.f_21346_.m_25352_(2, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  64 */     this.f_21345_.m_25352_(3, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/*  65 */     this.f_21345_.m_25352_(4, (Goal)new RandomLookAroundGoal((Mob)this));
/*  66 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, false, false));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  71 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  76 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.scream"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/*  81 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.scream"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource damagesource, float amount) {
/*  86 */     if (damagesource.m_276093_(DamageTypes.f_268631_))
/*  87 */       return false; 
/*  88 */     if (damagesource.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || damagesource.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/*  89 */       return false; 
/*  90 */     if (damagesource.m_276093_(DamageTypes.f_268671_))
/*  91 */       return false; 
/*  92 */     if (damagesource.m_276093_(DamageTypes.f_268722_))
/*  93 */       return false; 
/*  94 */     if (damagesource.m_276093_(DamageTypes.f_268450_))
/*  95 */       return false; 
/*  96 */     if (damagesource.m_276093_(DamageTypes.f_268565_))
/*  97 */       return false; 
/*  98 */     if (damagesource.m_276093_(DamageTypes.f_268482_))
/*  99 */       return false; 
/* 100 */     if (damagesource.m_276093_(DamageTypes.f_268493_))
/* 101 */       return false; 
/* 102 */     if (damagesource.m_276093_(DamageTypes.f_268641_))
/* 103 */       return false; 
/* 104 */     return super.m_6469_(damagesource, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6075_() {
/* 109 */     super.m_6075_();
/* 110 */     TrueClonePigOnEntityTickUpdateProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */   
/*     */   public static void init() {
/* 114 */     SpawnPlacements.m_21754_((EntityType)ClonesModEntities.TRUE_CLONE_PIG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> 
/* 115 */         (world.m_46791_() != Difficulty.PEACEFUL && Monster.m_219009_(world, pos, random) && Mob.m_217057_(entityType, (LevelAccessor)world, reason, pos, random)));
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 119 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 120 */     builder = builder.m_22268_(Attributes.f_22279_, 0.6D);
/* 121 */     builder = builder.m_22268_(Attributes.f_22276_, 10.0D);
/* 122 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 123 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 124 */     builder = builder.m_22268_(Attributes.f_22277_, 163.0D);
/* 125 */     return builder;
/*     */   }
/*     */ }


/* Location:              /home/stormwindsky/Téléchargements/clones-1.0.0.jar!/net/mcreator/clones/entity/TrueClonePigEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
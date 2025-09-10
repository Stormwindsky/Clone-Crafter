/*     */ package net.mcreator.clones.entity;
/*     */ import net.mcreator.clones.init.ClonesModEntities;
/*     */ import net.mcreator.clones.procedures.CloneCreeperEntityDiesProcedure;
/*     */ import net.mcreator.clones.procedures.CloneCreeperOnEntityTickUpdateProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientGamePacketListener;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.util.RandomSource;
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
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.levelgen.Heightmap;
/*     */ import net.minecraft.world.level.material.Material;
/*     */ import net.minecraftforge.common.DungeonHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class CloneCreeperEntity extends Monster {
/*     */   public CloneCreeperEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  40 */     this((EntityType<CloneCreeperEntity>)ClonesModEntities.CLONE_CREEPER.get(), world);
/*     */   }
/*     */   
/*     */   public CloneCreeperEntity(EntityType<CloneCreeperEntity> type, Level world) {
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
/*     */   public SoundEvent m_7515_() {
/*  77 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.ambient"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/*  82 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.drowned.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  87 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.phantom.bite"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/*  92 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.phantom.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/*  97 */     super.m_6667_(source);
/*  98 */     CloneCreeperEntityDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6075_() {
/* 103 */     super.m_6075_();
/* 104 */     CloneCreeperOnEntityTickUpdateProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */   
/*     */   public static void init() {
/* 108 */     SpawnPlacements.m_21754_((EntityType)ClonesModEntities.CLONE_CREEPER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> 
/* 109 */         (world.m_8055_(pos.m_7495_()).m_60767_() == Material.f_76315_ && world.m_45524_(pos, 0) > 8));
/* 110 */     DungeonHooks.addDungeonMob((EntityType)ClonesModEntities.CLONE_CREEPER.get(), 180);
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 114 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 115 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 116 */     builder = builder.m_22268_(Attributes.f_22276_, 10.0D);
/* 117 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 118 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 119 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 120 */     return builder;
/*     */   }
/*     */ }


/* Location:              /home/stormwindsky/Téléchargements/clones-1.0.0.jar!/net/mcreator/clones/entity/CloneCreeperEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package net.mcreator.clones.procedures;
/*     */ 
/*     */ import net.mcreator.clones.entity.TrueClonePigEntity;
/*     */ import net.mcreator.clones.init.ClonesModEntities;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.animal.Pig;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class ClonePigOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  27 */     if (entity == null)
/*     */       return; 
/*  29 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), e -> true).isEmpty()) {
/*  30 */       if (!entity.f_19853_.m_5776_())
/*  31 */         entity.m_146870_(); 
/*  32 */       if (Math.random() < 0.6D) {
/*  33 */         if (Math.random() < 0.7D)
/*  34 */         { if (Math.random() < 0.5D) {
/*  35 */             if (world instanceof Level) { Level _level = (Level)world;
/*  36 */               if (!_level.m_5776_()) {
/*  37 */                 _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.scream")), SoundSource.PLAYERS, 3.0F, -300.0F);
/*     */               } else {
/*  39 */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.scream")), SoundSource.PLAYERS, 3.0F, -300.0F, false);
/*     */               }  }
/*     */             
/*  42 */             if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  43 */               Pig pig = new Pig(EntityType.f_20510_, (Level)_level);
/*  44 */               pig.m_7678_(x, y, z, world.m_213780_().m_188501_() * 360.0F, 0.0F);
/*  45 */               if (pig instanceof Mob) { Mob _mobToSpawn = (Mob)pig;
/*  46 */                 _mobToSpawn.m_6518_((ServerLevelAccessor)_level, _level.m_6436_(pig.m_20183_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*  47 */                _level.m_7967_((Entity)pig); }
/*     */           
/*     */           } else {
/*  50 */             if (world instanceof Level) { Level _level = (Level)world;
/*  51 */               if (!_level.m_5776_()) {
/*  52 */                 _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.scream")), SoundSource.PLAYERS, 3.0F, -300.0F);
/*     */               } else {
/*  54 */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.scream")), SoundSource.PLAYERS, 3.0F, -300.0F, false);
/*     */               }  }
/*     */             
/*  57 */             if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  58 */               Pig pig = new Pig(EntityType.f_20510_, (Level)_level);
/*  59 */               pig.m_7678_(x, y, z, world.m_213780_().m_188501_() * 360.0F, 0.0F);
/*  60 */               if (pig instanceof Mob) { Mob _mobToSpawn = (Mob)pig;
/*  61 */                 _mobToSpawn.m_6518_((ServerLevelAccessor)_level, _level.m_6436_(pig.m_20183_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*  62 */                _level.m_7967_((Entity)pig); }
/*     */ 
/*     */           
/*     */           }  }
/*  66 */         else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  67 */           TrueClonePigEntity trueClonePigEntity = new TrueClonePigEntity((EntityType)ClonesModEntities.TRUE_CLONE_PIG.get(), (Level)_level);
/*  68 */           trueClonePigEntity.m_7678_(x, y, z, world.m_213780_().m_188501_() * 360.0F, 0.0F);
/*  69 */           if (trueClonePigEntity instanceof Mob) { Mob _mobToSpawn = (Mob)trueClonePigEntity;
/*  70 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, _level.m_6436_(trueClonePigEntity.m_20183_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*  71 */            _level.m_7967_((Entity)trueClonePigEntity); }
/*     */       
/*     */       } else {
/*     */         
/*  75 */         if (world instanceof Level) { Level _level = (Level)world;
/*  76 */           if (!_level.m_5776_()) {
/*  77 */             _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.scream")), SoundSource.PLAYERS, 3.0F, -300.0F);
/*     */           } else {
/*  79 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.scream")), SoundSource.PLAYERS, 3.0F, -300.0F, false);
/*     */           }  }
/*     */         
/*  82 */         world.m_7731_(BlockPos.m_274561_(x, y, z), Blocks.f_50080_.m_49966_(), 3);
/*     */       } 
/*     */     } 
/*  85 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).isEmpty()) {
/*  86 */       if (world instanceof Level) { Level _level = (Level)world;
/*  87 */         if (!_level.m_5776_()) {
/*  88 */           _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.PLAYERS, 1.0F, -100.0F);
/*     */         } else {
/*  90 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.PLAYERS, 1.0F, -100.0F, false);
/*     */         }  }
/*     */ 
/*     */       
/*  94 */       BlockPos _pos = BlockPos.m_274561_(x, y, z);
/*  95 */       Block.m_49892_(world.m_8055_(_pos), world, BlockPos.m_274561_(x, y, z), null);
/*  96 */       world.m_46961_(_pos, false);
/*     */     } 
/*     */     
/*  99 */     if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 30.0D, 30.0D, 30.0D), e -> true).isEmpty() && 
/* 100 */       world instanceof Level) { Level _level = (Level)world;
/* 101 */       if (!_level.m_5776_()) {
/* 102 */         _level.m_5594_(null, BlockPos.m_274561_(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.hurt")), SoundSource.PLAYERS, 1.0F, -200.0F);
/*     */       } else {
/* 104 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.hurt")), SoundSource.PLAYERS, 1.0F, -200.0F, false);
/*     */       }  }
/*     */   
/*     */   }
/*     */ }


/* Location:              /home/stormwindsky/Téléchargements/clones-1.0.0.jar!/net/mcreator/clones/procedures/ClonePigOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
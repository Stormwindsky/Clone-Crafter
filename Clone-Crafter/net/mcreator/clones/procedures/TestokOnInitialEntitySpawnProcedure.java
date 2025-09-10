/*    */ package net.mcreator.clones.procedures;
/*    */ import net.mcreator.clones.entity.ClonePigEntity;
/*    */ import net.mcreator.clones.entity.CloneZombieEntity;
/*    */ import net.mcreator.clones.init.ClonesModEntities;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.monster.CaveSpider;
/*    */ import net.minecraft.world.entity.monster.Drowned;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ 
/*    */ public class TestokOnInitialEntitySpawnProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 18 */     if (entity == null)
/*    */       return; 
/* 20 */     if (!entity.f_19853_.m_5776_())
/* 21 */       entity.m_146870_(); 
/* 22 */     if (Math.random() < 0.7D)
/* 23 */     { if (Math.random() < 0.7D)
/* 24 */       { if (Math.random() < 0.7D)
/* 25 */         { if (Math.random() < 0.7D)
/* 26 */           { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 27 */               Drowned drowned = new Drowned(EntityType.f_20562_, (Level)_level);
/* 28 */               drowned.m_7678_(x, y, z, 0.0F, 0.0F);
/* 29 */               drowned.m_5618_(0.0F);
/* 30 */               drowned.m_5616_(0.0F);
/* 31 */               drowned.m_20334_(0.0D, 0.0D, 0.0D);
/* 32 */               if (drowned instanceof Mob) { Mob _mobToSpawn = (Mob)drowned;
/* 33 */                 _mobToSpawn.m_6518_((ServerLevelAccessor)_level, _level.m_6436_(drowned.m_20183_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 34 */                _level.m_7967_((Entity)drowned); }
/*    */             
/*    */              }
/* 37 */           else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 38 */             Drowned drowned = new Drowned(EntityType.f_20562_, (Level)_level);
/* 39 */             drowned.m_7678_(x, y, z, 0.0F, 0.0F);
/* 40 */             drowned.m_5618_(0.0F);
/* 41 */             drowned.m_5616_(0.0F);
/* 42 */             drowned.m_20334_(0.0D, 0.0D, 0.0D);
/* 43 */             if (drowned instanceof Mob) { Mob _mobToSpawn = (Mob)drowned;
/* 44 */               _mobToSpawn.m_6518_((ServerLevelAccessor)_level, _level.m_6436_(drowned.m_20183_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 45 */              _level.m_7967_((Entity)drowned); }
/*    */           
/*    */            }
/*    */         
/* 49 */         else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 50 */           ClonePigEntity clonePigEntity = new ClonePigEntity((EntityType)ClonesModEntities.CLONE_PIG.get(), (Level)_level);
/* 51 */           clonePigEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 52 */           clonePigEntity.m_5618_(0.0F);
/* 53 */           clonePigEntity.m_5616_(0.0F);
/* 54 */           clonePigEntity.m_20334_(0.0D, 0.0D, 0.0D);
/* 55 */           if (clonePigEntity instanceof Mob) { Mob _mobToSpawn = (Mob)clonePigEntity;
/* 56 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, _level.m_6436_(clonePigEntity.m_20183_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 57 */            _level.m_7967_((Entity)clonePigEntity); }
/*    */         
/*    */          }
/*    */       
/* 61 */       else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 62 */         CloneZombieEntity cloneZombieEntity = new CloneZombieEntity((EntityType)ClonesModEntities.CLONE_ZOMBIE.get(), (Level)_level);
/* 63 */         cloneZombieEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 64 */         cloneZombieEntity.m_5618_(0.0F);
/* 65 */         cloneZombieEntity.m_5616_(0.0F);
/* 66 */         cloneZombieEntity.m_20334_(0.0D, 0.0D, 0.0D);
/* 67 */         if (cloneZombieEntity instanceof Mob) { Mob _mobToSpawn = (Mob)cloneZombieEntity;
/* 68 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, _level.m_6436_(cloneZombieEntity.m_20183_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 69 */          _level.m_7967_((Entity)cloneZombieEntity); }
/*    */       
/*    */        }
/*    */     
/* 73 */     else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 74 */       CaveSpider caveSpider = new CaveSpider(EntityType.f_20554_, (Level)_level);
/* 75 */       caveSpider.m_7678_(x, y, z, 0.0F, 0.0F);
/* 76 */       caveSpider.m_5618_(0.0F);
/* 77 */       caveSpider.m_5616_(0.0F);
/* 78 */       caveSpider.m_20334_(0.0D, 0.0D, 0.0D);
/* 79 */       if (caveSpider instanceof Mob) { Mob _mobToSpawn = (Mob)caveSpider;
/* 80 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, _level.m_6436_(caveSpider.m_20183_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 81 */        _level.m_7967_((Entity)caveSpider); }
/*    */   
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/clones-1.0.0.jar!/net/mcreator/clones/procedures/TestokOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
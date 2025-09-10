/*    */ package net.mcreator.clones;
/*    */ 
/*    */ import java.util.AbstractMap;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import java.util.concurrent.ConcurrentLinkedQueue;
/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ import net.mcreator.clones.init.ClonesModEntities;
/*    */ import net.mcreator.clones.init.ClonesModItems;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.IEventBus;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ import net.minecraftforge.network.NetworkRegistry;
/*    */ import net.minecraftforge.network.simple.SimpleChannel;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
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
/*    */ @Mod("clones")
/*    */ public class ClonesMod
/*    */ {
/* 46 */   public static final Logger LOGGER = LogManager.getLogger(ClonesMod.class);
/*    */   public static final String MODID = "clones";
/*    */   
/*    */   public ClonesMod() {
/* 50 */     MinecraftForge.EVENT_BUS.register(this);
/* 51 */     IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
/*    */     
/* 53 */     ClonesModItems.REGISTRY.register(bus);
/* 54 */     ClonesModEntities.REGISTRY.register(bus);
/*    */   }
/*    */ 
/*    */   
/*    */   private static final String PROTOCOL_VERSION = "1";
/* 59 */   public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation("clones", "clones"), () -> "1", "1"::equals, "1"::equals);
/* 60 */   private static int messageID = 0;
/*    */   
/*    */   public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
/* 63 */     PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
/* 64 */     messageID++;
/*    */   }
/*    */   
/* 67 */   private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();
/*    */   
/*    */   public static void queueServerWork(int tick, Runnable action) {
/* 70 */     workQueue.add(new AbstractMap.SimpleEntry<>(action, Integer.valueOf(tick)));
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void tick(TickEvent.ServerTickEvent event) {
/* 75 */     if (event.phase == TickEvent.Phase.END) {
/* 76 */       List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
/* 77 */       workQueue.forEach(work -> {
/*    */             work.setValue(Integer.valueOf(((Integer)work.getValue()).intValue() - 1));
/*    */             if (((Integer)work.getValue()).intValue() == 0)
/*    */               actions.add(work); 
/*    */           });
/* 82 */       actions.forEach(e -> ((Runnable)e.getKey()).run());
/* 83 */       workQueue.removeAll(actions);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/clones-1.0.0.jar!/net/mcreator/clones/ClonesMod.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
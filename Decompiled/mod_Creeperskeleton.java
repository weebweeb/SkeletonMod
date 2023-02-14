/*    */ import java.awt.Color;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class mod_Creeperskeleton
/*    */   extends BaseMod
/*    */ {
/*    */   public String getVersion() {
/* 10 */     return "1.3.2";
/*    */   }
/*    */ 
/*    */   
/*    */   public void load() {
/* 15 */     ModLoader.registerEntityID(EntityCreeperskeleton.class, "Creeperskeleton", 60);
/* 16 */     ModLoader.addSpawn("Creeperskeleton", 5, 1, 1, jx.a);
/* 17 */     ModLoader.addLocalization("entity.Creeperskeleton.name", "Creeperskeleton");
/* 18 */     jr.a.put(Integer.valueOf(60), new js(60, 894731, (new Color(21, 15, 6)).getRGB()));
/*    */   }
/*    */ 
/*    */   
/*    */   public void addRenderer(Map<Class<EntityCreeperskeleton>, awm> var1) {
/* 23 */     var1.put(EntityCreeperskeleton.class, new awm((art)new asc(), 0.5F));
/*    */   }
/*    */ }


/* Location:              C:\Users\Shadow\Downloads\SkeletonsPlus\!\mod_Creeperskeleton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
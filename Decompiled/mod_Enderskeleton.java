/*    */ import java.awt.Color;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class mod_Enderskeleton
/*    */   extends BaseMod
/*    */ {
/*    */   public String getVersion() {
/* 10 */     return "1.3.2";
/*    */   }
/*    */ 
/*    */   
/*    */   public void load() {
/* 15 */     ModLoader.registerEntityID(EntityEnderskeleton.class, "EnderSkeleton", 61);
/* 16 */     ModLoader.addSpawn("Enderskeleton", 5, 1, 1, jx.a);
/* 17 */     ModLoader.addLocalization("entity.Enderskeleton.name", "Enderskeleton");
/* 18 */     jr.a.put(Integer.valueOf(61), new js(61, 894731, (new Color(21, 15, 6)).getRGB()));
/*    */   }
/*    */ 
/*    */   
/*    */   public void addRenderer(Map<Class<EntityEnderskeleton>, awm> var1) {
/* 23 */     var1.put(EntityEnderskeleton.class, new awm((art)new asc(), 0.5F));
/*    */   }
/*    */ }


/* Location:              C:\Users\Shadow\Downloads\SkeletonsPlus\!\mod_Enderskeleton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
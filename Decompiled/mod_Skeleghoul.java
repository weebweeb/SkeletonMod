/*    */ import java.awt.Color;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class mod_Skeleghoul
/*    */   extends BaseMod
/*    */ {
/*    */   public String getVersion() {
/* 10 */     return "1.3.2";
/*    */   }
/*    */ 
/*    */   
/*    */   public void load() {
/* 15 */     ModLoader.registerEntityID(EntitySkeleghoul.class, "Skeleghoul", 65);
/* 16 */     ModLoader.addSpawn("Skeleghoul", 1, 1, 1, jx.customMonster);
/* 17 */     ModLoader.addLocalization("entity.Skeleghoul.name", "Skeleghoul");
/* 18 */     jr.a.put(Integer.valueOf(65), new js(65, 894731, (new Color(21, 15, 6)).getRGB()));
/*    */   }
/*    */ 
/*    */   
/*    */   public void addRenderer(Map<Class<EntitySkeleghoul>, awm> var1) {
/* 23 */     var1.put(EntitySkeleghoul.class, new awm((art)new asc(), 0.5F));
/*    */   }
/*    */ }


/* Location:              C:\Users\Shadow\Downloads\SkeletonsPlus\!\mod_Skeleghoul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
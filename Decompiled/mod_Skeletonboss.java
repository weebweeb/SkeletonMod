/*    */ import java.awt.Color;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class mod_Skeletonboss
/*    */   extends BaseMod
/*    */ {
/*    */   public String getVersion() {
/* 10 */     return "1.3.2";
/*    */   }
/*    */ 
/*    */   
/*    */   public void load() {
/* 15 */     ModLoader.registerEntityID(EntitySkeleBoss.class, "(WIP)Sklenderman", 12);
/* 16 */     ModLoader.addSpawn("(WIP)Sklenderman", 0, 0, 0, jx.a);
/* 17 */     ModLoader.addLocalization("entity.(WIP)Sklenderman.name", "(WIP)Sklenderman");
/* 18 */     jr.a.put(Integer.valueOf(12), new js(12, 894731, (new Color(21, 15, 6)).getRGB()));
/*    */   }
/*    */ 
/*    */   
/*    */   public void addRenderer(Map<Class<EntitySkeleBoss>, awm> var1) {
/* 23 */     var1.put(EntitySkeleBoss.class, new awm((art)new asc(), 0.5F));
/*    */   }
/*    */ }


/* Location:              C:\Users\Shadow\Downloads\SkeletonsPlus\!\mod_Skeletonboss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
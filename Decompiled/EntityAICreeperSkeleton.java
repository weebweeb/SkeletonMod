/*    */ 
/*    */ 
/*    */ public class EntityAICreeperSkeleton
/*    */   extends kv
/*    */ {
/*    */   EntityCreeperskeleton swellingCreeper;
/*    */   jw creeperAttackTarget;
/*    */   
/*    */   public EntityAICreeperSkeleton(EntityCreeperskeleton var1) {
/* 10 */     this.swellingCreeper = var1;
/* 11 */     a(1);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 17 */     jw var1 = this.swellingCreeper.az();
/* 18 */     return (this.swellingCreeper.getCreeperState() > 0 || (var1 != null && this.swellingCreeper.e(var1) < 9.0D));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void e() {
/* 24 */     this.swellingCreeper.as().g();
/* 25 */     this.creeperAttackTarget = this.swellingCreeper.az();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void c() {
/* 31 */     this.creeperAttackTarget = null;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void d() {
/* 37 */     if (this.creeperAttackTarget == null) {
/*    */       
/* 39 */       this.swellingCreeper.setCreeperState(-1);
/*    */     }
/* 41 */     else if (this.swellingCreeper.e(this.creeperAttackTarget) > 49.0D) {
/*    */       
/* 43 */       this.swellingCreeper.setCreeperState(-1);
/*    */     }
/* 45 */     else if (!this.swellingCreeper.at().a(this.creeperAttackTarget)) {
/*    */       
/* 47 */       this.swellingCreeper.setCreeperState(-1);
/*    */     }
/*    */     else {
/*    */       
/* 51 */       this.swellingCreeper.setCreeperState(1);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Shadow\Downloads\SkeletonsPlus\!\EntityAICreeperSkeleton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
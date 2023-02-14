/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acq
/*    */ {
/*  8 */   public static final acq[] a = new acq[16];
/*    */ 
/*    */   
/* 11 */   public static final acq b = new acq(0, 0);
/*    */ 
/*    */   
/* 14 */   public static final acq c = new acq(1, 8368696);
/*    */ 
/*    */   
/* 17 */   public static final acq skullstoneColor = new acq(0, 0);
/*    */ 
/*    */   
/* 20 */   public static final acq d = new acq(2, 16247203);
/*    */ 
/*    */   
/* 23 */   public static final acq e = new acq(3, 10987431);
/*    */ 
/*    */   
/* 26 */   public static final acq f = new acq(4, 16711680);
/*    */ 
/*    */   
/* 29 */   public static final acq g = new acq(5, 10526975);
/*    */ 
/*    */   
/* 32 */   public static final acq h = new acq(6, 10987431);
/*    */ 
/*    */   
/* 35 */   public static final acq i = new acq(7, 31744);
/*    */ 
/*    */   
/* 38 */   public static final acq j = new acq(8, 16777215);
/*    */ 
/*    */   
/* 41 */   public static final acq k = new acq(9, 10791096);
/*    */ 
/*    */   
/* 44 */   public static final acq l = new acq(10, 12020271);
/*    */ 
/*    */   
/* 47 */   public static final acq m = new acq(11, 7368816);
/*    */ 
/*    */   
/* 50 */   public static final acq n = new acq(12, 4210943);
/*    */ 
/*    */   
/* 53 */   public static final acq o = new acq(13, 6837042);
/*    */ 
/*    */   
/*    */   public final int p;
/*    */ 
/*    */   
/*    */   public final int q;
/*    */ 
/*    */   
/*    */   private acq(int par1, int par2) {
/* 63 */     this.q = par1;
/* 64 */     this.p = par2;
/* 65 */     a[par1] = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\Shadow\Downloads\SkeletonsPlus\!\acq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
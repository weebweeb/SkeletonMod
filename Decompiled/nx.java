/*     */ 
/*     */ 
/*     */ public class nx
/*     */   extends nu
/*     */ {
/*   6 */   private static final rj d = new rj(rh.k, 1);
/*     */ 
/*     */   
/*     */   public nx(up par1World) {
/*  10 */     super(par1World);
/*  11 */     this.az = "/mob/skeleton.png";
/*  12 */     this.bw = 0.25F;
/*  13 */     this.bg.a(1, (kv)new ks((jw)this));
/*  14 */     this.bg.a(2, (kv)new lr((kb)this));
/*  15 */     this.bg.a(3, (kv)new kr((kb)this, this.bw));
/*  16 */     this.bg.a(4, (kv)new kk((jw)this, this.bw, 1, 60));
/*  17 */     this.bg.a(5, (kv)new lp((kb)this, this.bw));
/*  18 */     this.bg.a(6, (kv)new la((jw)this, og.class, 8.0F));
/*  19 */     this.bg.a(6, (kv)new lo((jw)this));
/*  20 */     this.bh.a(1, (kv)new ly((jw)this, false));
/*  21 */     this.bh.a(2, (kv)new lz((jw)this, og.class, 16.0F, 0, true));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean aV() {
/*  29 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aM() {
/*  34 */     return 20;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aQ() {
/*  42 */     return "mob.skeleton";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aR() {
/*  50 */     return "mob.skeletonhurt";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aS() {
/*  58 */     return "mob.skeletonhurt";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public rj bm() {
/*  64 */     return d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public jy bt() {
/*  72 */     return jy.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {
/*  81 */     if (this.p.s() && !this.p.K) {
/*     */       
/*  83 */       float var1 = c(1.0F);
/*     */       
/*  85 */       if (var1 > 0.5F && this.p.j(ih.c(this.t), ih.c(this.u), ih.c(this.v)) && this.Z.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F)
/*     */       {
/*  87 */         d(8);
/*     */       }
/*     */     } 
/*     */     
/*  91 */     super.d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(je par1DamageSource) {
/*  99 */     super.a(par1DamageSource);
/*     */     
/* 101 */     if (par1DamageSource.f() instanceof oi && par1DamageSource.g() instanceof og) {
/*     */       
/* 103 */       og var2 = (og)par1DamageSource.g();
/* 104 */       double var3 = var2.t - this.t;
/* 105 */       double var5 = var2.v - this.v;
/*     */       
/* 107 */       if (var3 * var3 + var5 * var5 >= 2500.0D)
/*     */       {
/* 109 */         var2.a((hp)hl.v);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int aT() {
/* 119 */     return rh.l.bT;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(boolean par1, int par2) {
/* 127 */     int var3 = this.Z.nextInt(3 + par2);
/*     */     
/*     */     int var4;
/* 130 */     for (var4 = 0; var4 < var3; var4++)
/*     */     {
/* 132 */       b(rh.l.bT, 1);
/*     */     }
/*     */     
/* 135 */     var3 = this.Z.nextInt(3 + par2);
/*     */     
/* 137 */     for (var4 = 0; var4 < var3; var4++)
/*     */     {
/* 139 */       b(rh.aX.bT, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void l(int par1) {
/* 145 */     if (par1 > 0) {
/*     */       
/* 147 */       rj var2 = new rj(rh.k);
/* 148 */       tu.a(this.Z, var2, 5);
/* 149 */       a(var2, 0.0F);
/*     */     }
/*     */     else {
/*     */       
/* 153 */       b(rh.k.bT, 1);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Shadow\Downloads\SkeletonsPlus\!\nx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
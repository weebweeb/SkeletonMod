/*     */ public class EntitySkeleghoul
/*     */   extends jv
/*     */   implements nq
/*     */ {
/*   5 */   public int courseChangeCooldown = 0;
/*     */   public double waypointX;
/*     */   public double waypointY;
/*     */   public double waypointZ;
/*   9 */   private jn targetedEntity = null;
/*     */ 
/*     */   
/*  12 */   private int aggroCooldown = 0;
/*  13 */   public int prevAttackCounter = 0;
/*  14 */   public int attackCounter = 0;
/*     */ 
/*     */   
/*     */   public EntitySkeleghoul(up par1World) {
/*  18 */     super(par1World);
/*  19 */     this.az = "/mob/skeleton.png";
/*  20 */     a(10.0F, 10.0F);
/*  21 */     this.ae = false;
/*  22 */     this.aV = 5;
/*  23 */     this.bg.a(1, (kv)new kk((jw)this, this.bw, 1, 60));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {
/*  29 */     if (this.p.s() && !this.p.K) {
/*     */       
/*  31 */       float var1 = c(1.0F);
/*     */       
/*  33 */       if (var1 > 0.5F && this.p.j(ih.c(this.t), ih.c(this.u), ih.c(this.v)) && this.Z.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F)
/*     */       {
/*  35 */         d(8);
/*     */       }
/*     */     } 
/*     */     
/*  39 */     super.d();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  44 */     super.a();
/*  45 */     this.af.a(16, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public int aM() {
/*  50 */     return 100;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void h_() {
/*  56 */     super.h_();
/*  57 */     byte var1 = this.af.a(16);
/*  58 */     this.az = (var1 == 1) ? "/mob/skeleton.png" : "/mob/skeleton.png";
/*     */   }
/*     */ 
/*     */   
/*     */   protected void be() {
/*  63 */     if (!this.p.K && this.p.u == 0)
/*     */     {
/*  65 */       y();
/*     */     }
/*     */     
/*  68 */     bb();
/*  69 */     this.prevAttackCounter = this.attackCounter;
/*  70 */     double var1 = this.waypointX - this.t;
/*  71 */     double var3 = this.waypointY - this.u;
/*  72 */     double var5 = this.waypointZ - this.v;
/*  73 */     double var7 = var1 * var1 + var3 * var3 + var5 * var5;
/*     */     
/*  75 */     if (var7 < 1.0D || var7 > 3600.0D) {
/*     */       
/*  77 */       this.waypointX = this.t + ((this.Z.nextFloat() * 2.0F - 1.0F) * 16.0F);
/*  78 */       this.waypointY = this.u + ((this.Z.nextFloat() * 2.0F - 1.0F) * 16.0F);
/*  79 */       this.waypointZ = this.v + ((this.Z.nextFloat() * 2.0F - 1.0F) * 16.0F);
/*     */     } 
/*     */     
/*  82 */     if (this.courseChangeCooldown-- <= 0) {
/*     */       
/*  84 */       this.courseChangeCooldown += this.Z.nextInt(5) + 2;
/*  85 */       var7 = ih.a(var7);
/*     */       
/*  87 */       if (isCourseTraversable(this.waypointX, this.waypointY, this.waypointZ, var7)) {
/*     */         
/*  89 */         this.w += var1 / var7 * 0.1D;
/*  90 */         this.x += var3 / var7 * 0.1D;
/*  91 */         this.y += var5 / var7 * 0.1D;
/*     */       }
/*     */       else {
/*     */         
/*  95 */         this.waypointX = this.t;
/*  96 */         this.waypointY = this.u;
/*  97 */         this.waypointZ = this.v;
/*     */       } 
/*     */     } 
/*     */     
/* 101 */     if (this.targetedEntity != null && this.targetedEntity.L)
/*     */     {
/* 103 */       this.targetedEntity = null;
/*     */     }
/*     */     
/* 106 */     if (this.targetedEntity == null || this.aggroCooldown-- <= 0) {
/*     */       
/* 108 */       this.targetedEntity = (jn)this.p.b((jn)this, 100.0D);
/*     */       
/* 110 */       if (this.targetedEntity != null)
/*     */       {
/* 112 */         this.aggroCooldown = 20;
/*     */       }
/*     */     } 
/*     */     
/* 116 */     double var9 = 64.0D;
/*     */     
/* 118 */     if (this.targetedEntity != null && this.targetedEntity.e((jn)this) < var9 * var9) {
/*     */       
/* 120 */       double var11 = this.targetedEntity.t - this.t;
/* 121 */       double var13 = this.targetedEntity.D.b + (this.targetedEntity.O / 2.0F) - this.u + (this.O / 2.0F);
/* 122 */       double var15 = this.targetedEntity.v - this.v;
/* 123 */       this.aq = this.z = -((float)Math.atan2(var11, var15)) * 180.0F / 3.1415927F;
/*     */       
/* 125 */       if (l(this.targetedEntity)) {
/*     */         
/* 127 */         if (this.attackCounter == 10)
/*     */         {
/* 129 */           this.p.a((og)null, 1007, (int)this.t, (int)this.u, (int)this.v, 0);
/*     */         }
/*     */         
/* 132 */         this.attackCounter++;
/*     */         
/* 134 */         if (this.attackCounter == 20)
/*     */         {
/* 136 */           this.p.a((og)null, 1008, (int)this.t, (int)this.u, (int)this.v, 0);
/* 137 */           ok var17 = new ok(this.p, (jw)this, var11, var13, var15);
/* 138 */           double var18 = 4.0D;
/* 139 */           ajs var20 = i(1.0F);
/* 140 */           var17.t = this.t + var20.a * var18;
/* 141 */           var17.u = this.u + (this.O / 2.0F) + 0.5D;
/* 142 */           var17.v = this.v + var20.c * var18;
/* 143 */           this.p.d((jn)var17);
/* 144 */           this.attackCounter = -40;
/*     */         }
/*     */       
/* 147 */       } else if (this.attackCounter > 0) {
/*     */         
/* 149 */         this.attackCounter--;
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 154 */       this.aq = this.z = -((float)Math.atan2(this.w, this.y)) * 180.0F / 3.1415927F;
/*     */       
/* 156 */       if (this.attackCounter > 0)
/*     */       {
/* 158 */         this.attackCounter--;
/*     */       }
/*     */     } 
/*     */     
/* 162 */     if (!this.p.K) {
/*     */       
/* 164 */       byte var21 = this.af.a(16);
/* 165 */       byte var12 = (byte)((this.attackCounter > 10) ? 1 : 0);
/*     */       
/* 167 */       if (var21 != var12)
/*     */       {
/* 169 */         this.af.b(16, Byte.valueOf(var12));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isCourseTraversable(double par1, double par3, double par5, double par7) {
/* 177 */     double var9 = (this.waypointX - this.t) / par7;
/* 178 */     double var11 = (this.waypointY - this.u) / par7;
/* 179 */     double var13 = (this.waypointZ - this.v) / par7;
/* 180 */     ajn var15 = this.D.c();
/*     */     
/* 182 */     for (int var16 = 1; var16 < par7; var16++) {
/*     */       
/* 184 */       var15.d(var9, var11, var13);
/*     */       
/* 186 */       if (!this.p.a((jn)this, var15).isEmpty())
/*     */       {
/* 188 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 192 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aQ() {
/* 198 */     return "mob.skeleton";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aR() {
/* 204 */     return "mob.skeletonhurt";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bi() {
/* 209 */     return (this.Z.nextInt(20) == 0 && super.bi() && this.p.u > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int getMaxNumberOfCreature() {
/* 214 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected String aS() {
/* 219 */     return "mob.skeletonhurt";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected int aT() {
/* 225 */     return rh.M.bT;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(boolean par1, int par2) {
/* 231 */     int var3 = this.Z.nextInt(2) + this.Z.nextInt(1 + par2);
/*     */     
/*     */     int var4;
/* 234 */     for (var4 = 0; var4 < var3; var4++)
/*     */     {
/* 236 */       b(rh.aX.bT, 1);
/*     */     }
/*     */     
/* 239 */     var3 = this.Z.nextInt(3) + this.Z.nextInt(1 + par2);
/*     */     
/* 241 */     for (var4 = 0; var4 < var3; var4++)
/*     */     {
/* 243 */       b(rh.M.bT, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected float aP() {
/* 250 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int bl() {
/* 256 */     return 1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Shadow\Downloads\SkeletonsPlus\!\EntitySkeleghoul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
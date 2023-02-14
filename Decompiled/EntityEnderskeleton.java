/*     */ 
/*     */ public class EntityEnderskeleton
/*     */   extends nu
/*     */ {
/*   5 */   private static boolean[] carriableBlocks = new boolean[256];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  10 */   private int teleportDelay = 0;
/*  11 */   private int field_70826_g = 0;
/*     */ 
/*     */ 
/*     */   
/*     */   public EntityEnderskeleton(up par1World) {
/*  16 */     super(par1World);
/*  17 */     this.az = "/textures/enderskeleton.png";
/*  18 */     this.bw = 0.3F;
/*  19 */     this.f = 4;
/*     */     
/*  21 */     this.bg.a(1, (kv)new ks((jw)this));
/*  22 */     this.bg.a(2, (kv)new lr((kb)this));
/*  23 */     this.bg.a(3, (kv)new kr((kb)this, this.bw));
/*  24 */     this.bg.a(4, (kv)new kk((jw)this, this.bw, 1, 60));
/*  25 */     this.bg.a(5, (kv)new lp((kb)this, this.bw));
/*  26 */     this.bg.a(6, (kv)new la((jw)this, og.class, 8.0F));
/*  27 */     this.bg.a(6, (kv)new lo((jw)this));
/*  28 */     this.bh.a(1, (kv)new ly((jw)this, false));
/*  29 */     this.bh.a(2, (kv)new lz((jw)this, og.class, 16.0F, 0, true));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int aM() {
/*  35 */     return 40;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  40 */     super.a();
/*  41 */     this.af.a(16, new Byte((byte)0));
/*  42 */     this.af.a(17, new Byte((byte)0));
/*  43 */     this.af.a(18, new Byte((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(an par1NBTTagCompound) {
/*  49 */     super.b(par1NBTTagCompound);
/*  50 */     par1NBTTagCompound.a("carried", (short)getCarried());
/*  51 */     par1NBTTagCompound.a("carriedData", (short)getCarryingData());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(an par1NBTTagCompound) {
/*  57 */     super.a(par1NBTTagCompound);
/*  58 */     setCarried(par1NBTTagCompound.d("carried"));
/*  59 */     setCarryingData(par1NBTTagCompound.d("carriedData"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected jn k() {
/*  65 */     og var1 = this.p.b((jn)this, 64.0D);
/*     */     
/*  67 */     if (var1 != null)
/*     */     {
/*  69 */       if (shouldAttackPlayer(var1)) {
/*     */         
/*  71 */         if (this.field_70826_g++ == 5)
/*     */         {
/*  73 */           this.field_70826_g = 0;
/*  74 */           func_70819_e(true);
/*  75 */           return (jn)var1;
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/*  80 */         this.field_70826_g = 0;
/*     */       } 
/*     */     }
/*     */     
/*  84 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean shouldAttackPlayer(og par1EntityPlayer) {
/*  90 */     rj var2 = par1EntityPlayer.by.b[3];
/*     */     
/*  92 */     if (var2 != null && var2.c == aig.ba.ca)
/*     */     {
/*  94 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  98 */     ajs var3 = par1EntityPlayer.i(1.0F).b();
/*  99 */     ajs var4 = ajs.a().a(this.t - par1EntityPlayer.t, this.D.b + (this.O / 2.0F) - par1EntityPlayer.u + par1EntityPlayer.e(), this.v - par1EntityPlayer.v);
/* 100 */     double var5 = var4.c();
/* 101 */     var4 = var4.b();
/* 102 */     double var7 = var3.b(var4);
/* 103 */     return (var7 > 1.0D - 0.025D / var5) ? par1EntityPlayer.l((jn)this) : false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {
/* 110 */     if (G())
/*     */     {
/* 112 */       a(je.e, 1);
/*     */     }
/*     */     
/* 115 */     this.bw = (this.a != null) ? 6.5F : 0.3F;
/*     */ 
/*     */     
/* 118 */     if (!this.p.K)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 124 */       if (getCarried() == 0) {
/*     */         
/* 126 */         if (this.Z.nextInt(20) == 0) {
/*     */           
/* 128 */           int i = ih.c(this.t - 2.0D + this.Z.nextDouble() * 4.0D);
/* 129 */           int var2 = ih.c(this.u + this.Z.nextDouble() * 3.0D);
/* 130 */           int var3 = ih.c(this.v - 2.0D + this.Z.nextDouble() * 4.0D);
/* 131 */           int var4 = this.p.a(i, var2, var3);
/*     */           
/* 133 */           if (carriableBlocks[var4])
/*     */           {
/* 135 */             setCarried(this.p.a(i, var2, var3));
/* 136 */             setCarryingData(this.p.g(i, var2, var3));
/* 137 */             this.p.e(i, var2, var3, 0);
/*     */           }
/*     */         
/*     */         } 
/* 141 */       } else if (this.Z.nextInt(2000) == 0) {
/*     */         
/* 143 */         int i = ih.c(this.t - 1.0D + this.Z.nextDouble() * 2.0D);
/* 144 */         int var2 = ih.c(this.u + this.Z.nextDouble() * 2.0D);
/* 145 */         int var3 = ih.c(this.v - 1.0D + this.Z.nextDouble() * 2.0D);
/* 146 */         int var4 = this.p.a(i, var2, var3);
/* 147 */         int var5 = this.p.a(i, var2 - 1, var3);
/*     */         
/* 149 */         if (var4 == 0 && var5 > 0 && aig.m[var5].c()) {
/*     */           
/* 151 */           this.p.d(i, var2, var3, getCarried(), getCarryingData());
/* 152 */           setCarried(0);
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 157 */     for (int var1 = 0; var1 < 2; var1++)
/*     */     {
/* 159 */       this.p.a("portal", this.t + (this.Z.nextDouble() - 0.5D) * this.N, this.u + this.Z.nextDouble() * this.O - 0.25D, this.v + (this.Z.nextDouble() - 0.5D) * this.N, (this.Z.nextDouble() - 0.5D) * 2.0D, -this.Z.nextDouble(), (this.Z.nextDouble() - 0.5D) * 2.0D);
/*     */     }
/*     */     
/* 162 */     if (this.p.s() && !this.p.K) {
/*     */       
/* 164 */       float var6 = c(1.0F);
/*     */       
/* 166 */       if (var6 > 0.5F && this.p.j(ih.c(this.t), ih.c(this.u), ih.c(this.v)) && this.Z.nextFloat() * 30.0F < (var6 - 0.4F) * 2.0F) {
/*     */         
/* 168 */         this.a = null;
/* 169 */         func_70819_e(false);
/* 170 */         teleportRandomly();
/*     */       } 
/*     */     } 
/*     */     
/* 174 */     if (G()) {
/*     */       
/* 176 */       this.a = null;
/* 177 */       func_70819_e(false);
/* 178 */       teleportRandomly();
/*     */     } 
/*     */     
/* 181 */     this.bu = false;
/*     */     
/* 183 */     if (this.a != null)
/*     */     {
/* 185 */       a(this.a, 100.0F, 100.0F);
/*     */     }
/*     */     
/* 188 */     if (!this.p.K && S())
/*     */     {
/* 190 */       if (this.a != null) {
/*     */         
/* 192 */         if (this.a instanceof og && shouldAttackPlayer((og)this.a))
/*     */         {
/* 194 */           this.br = this.bs = 0.0F;
/* 195 */           this.bw = 0.0F;
/*     */           
/* 197 */           if (this.a.e((jn)this) < 16.0D)
/*     */           {
/* 199 */             teleportRandomly();
/*     */           }
/*     */           
/* 202 */           this.teleportDelay = 0;
/*     */         }
/* 204 */         else if (this.a.e((jn)this) > 256.0D && this.teleportDelay++ >= 30 && teleportToEntity(this.a))
/*     */         {
/* 206 */           this.teleportDelay = 0;
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 211 */         func_70819_e(false);
/* 212 */         this.teleportDelay = 0;
/*     */       } 
/*     */     }
/*     */     
/* 216 */     super.d();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean teleportRandomly() {
/* 222 */     double var1 = this.t + (this.Z.nextDouble() - 0.5D) * 64.0D;
/* 223 */     double var3 = this.u + (this.Z.nextInt(64) - 32);
/* 224 */     double var5 = this.v + (this.Z.nextDouble() - 0.5D) * 64.0D;
/* 225 */     return teleportTo(var1, var3, var5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean teleportToEntity(jn par1Entity) {
/* 231 */     ajs var2 = ajs.a().a(this.t - par1Entity.t, this.D.b + (this.O / 2.0F) - par1Entity.u + par1Entity.e(), this.v - par1Entity.v);
/* 232 */     var2 = var2.b();
/* 233 */     double var3 = 16.0D;
/* 234 */     double var5 = this.t + (this.Z.nextDouble() - 0.5D) * 8.0D - var2.a * var3;
/* 235 */     double var7 = this.u + (this.Z.nextInt(16) - 8) - var2.b * var3;
/* 236 */     double var9 = this.v + (this.Z.nextDouble() - 0.5D) * 8.0D - var2.c * var3;
/* 237 */     return teleportTo(var5, var7, var9);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean teleportTo(double par1, double par3, double par5) {
/* 243 */     double var7 = this.t;
/* 244 */     double var9 = this.u;
/* 245 */     double var11 = this.v;
/* 246 */     this.t = par1;
/* 247 */     this.u = par3;
/* 248 */     this.v = par5;
/* 249 */     boolean var13 = false;
/* 250 */     int var14 = ih.c(this.t);
/* 251 */     int var15 = ih.c(this.u);
/* 252 */     int var16 = ih.c(this.v);
/*     */ 
/*     */     
/* 255 */     if (this.p.e(var14, var15, var16)) {
/*     */       
/* 257 */       boolean var17 = false;
/*     */       
/* 259 */       while (!var17 && var15 > 0) {
/*     */         
/* 261 */         int i = this.p.a(var14, var15 - 1, var16);
/*     */         
/* 263 */         if (i != 0 && (aig.m[i]).cp.c()) {
/*     */           
/* 265 */           var17 = true;
/*     */           
/*     */           continue;
/*     */         } 
/* 269 */         this.u--;
/* 270 */         var15--;
/*     */       } 
/*     */ 
/*     */       
/* 274 */       if (var17) {
/*     */         
/* 276 */         b(this.t, this.u, this.v);
/*     */         
/* 278 */         if (this.p.a((jn)this, this.D).isEmpty() && !this.p.d(this.D))
/*     */         {
/* 280 */           var13 = true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 285 */     if (!var13) {
/*     */       
/* 287 */       b(var7, var9, var11);
/* 288 */       return false;
/*     */     } 
/*     */ 
/*     */     
/* 292 */     short var30 = 128;
/*     */     
/* 294 */     for (int var18 = 0; var18 < var30; var18++) {
/*     */       
/* 296 */       double var19 = var18 / (var30 - 1.0D);
/* 297 */       float var21 = (this.Z.nextFloat() - 0.5F) * 0.2F;
/* 298 */       float var22 = (this.Z.nextFloat() - 0.5F) * 0.2F;
/* 299 */       float var23 = (this.Z.nextFloat() - 0.5F) * 0.2F;
/* 300 */       double var24 = var7 + (this.t - var7) * var19 + (this.Z.nextDouble() - 0.5D) * this.N * 2.0D;
/* 301 */       double var26 = var9 + (this.u - var9) * var19 + this.Z.nextDouble() * this.O;
/* 302 */       double var28 = var11 + (this.v - var11) * var19 + (this.Z.nextDouble() - 0.5D) * this.N * 2.0D;
/* 303 */       this.p.a("portal", var24, var26, var28, var21, var22, var23);
/*     */     } 
/*     */     
/* 306 */     this.p.a(var7, var9, var11, "mob.endermen.portal", 1.0F, 1.0F);
/* 307 */     this.p.a((jn)this, "mob.endermen.portal", 1.0F, 1.0F);
/* 308 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aQ() {
/* 315 */     return "mob.endermen.idle";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aR() {
/* 321 */     return "mob.endermen.hit";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aS() {
/* 327 */     return "mob.endermen.death";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected int aT() {
/* 333 */     return rh.bn.bT;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(boolean par1, int par2) {
/* 339 */     int var3 = aT();
/*     */     
/* 341 */     if (var3 > 0) {
/*     */       
/* 343 */       int var4 = this.Z.nextInt(2 + par2);
/*     */       
/* 345 */       for (int var5 = 0; var5 < var4; var5++)
/*     */       {
/* 347 */         b(var3, 1);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCarried(int par1) {
/* 355 */     this.af.b(16, Byte.valueOf((byte)(par1 & 0xFF)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCarried() {
/* 361 */     return this.af.a(16);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCarryingData(int par1) {
/* 367 */     this.af.b(17, Byte.valueOf((byte)(par1 & 0xFF)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCarryingData() {
/* 373 */     return this.af.a(17);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(je par1DamageSource, int par2) {
/* 379 */     if (par1DamageSource instanceof jg) {
/*     */       
/* 381 */       for (int var3 = 0; var3 < 64; var3++) {
/*     */         
/* 383 */         if (teleportRandomly())
/*     */         {
/* 385 */           return true;
/*     */         }
/*     */       } 
/*     */       
/* 389 */       return false;
/*     */     } 
/*     */ 
/*     */     
/* 393 */     if (par1DamageSource.g() instanceof og)
/*     */     {
/* 395 */       func_70819_e(true);
/*     */     }
/*     */     
/* 398 */     return super.a(par1DamageSource, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70823_r() {
/* 404 */     return (this.af.a(18) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_70819_e(boolean par1) {
/* 409 */     this.af.b(18, Byte.valueOf((byte)(par1 ? 1 : 0)));
/*     */   }
/*     */ 
/*     */   
/*     */   static {
/* 414 */     carriableBlocks[aig.u.ca] = true;
/* 415 */     carriableBlocks[aig.v.ca] = true;
/* 416 */     carriableBlocks[aig.E.ca] = true;
/* 417 */     carriableBlocks[aig.F.ca] = true;
/* 418 */     carriableBlocks[aig.ad.ca] = true;
/* 419 */     carriableBlocks[aig.ae.ca] = true;
/* 420 */     carriableBlocks[aig.af.ca] = true;
/* 421 */     carriableBlocks[aig.ag.ca] = true;
/* 422 */     carriableBlocks[aig.am.ca] = true;
/* 423 */     carriableBlocks[aig.aV.ca] = true;
/* 424 */     carriableBlocks[aig.aW.ca] = true;
/* 425 */     carriableBlocks[aig.ba.ca] = true;
/* 426 */     carriableBlocks[aig.br.ca] = true;
/* 427 */     carriableBlocks[aig.by.ca] = true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aV() {
/* 432 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Shadow\Downloads\SkeletonsPlus\!\EntityEnderskeleton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
/*     */ 
/*     */ public class EntitySkeleBoss
/*     */   extends jw
/*     */   implements nq
/*     */ {
/*     */   public float field_70813_a;
/*     */   public float field_70811_b;
/*     */   public float field_70812_c;
/*   9 */   private int slimeJumpDelay = 0;
/*     */ 
/*     */   
/*     */   public EntitySkeleBoss(up par1World) {
/*  13 */     super(par1World);
/*  14 */     this.az = "/mob/skeleton.png";
/*  15 */     this.bw = 0.3F;
/*  16 */     int var2 = 1 << this.Z.nextInt(3);
/*  17 */     this.M = 0.0F;
/*  18 */     this.slimeJumpDelay = this.Z.nextInt(20) + 10;
/*  19 */     setSlimeSize(var2);
/*  20 */     this.bg.a(0, (kv)new ks(this));
/*  21 */     this.bg.a(1, (kv)new ld(this, og.class, this.bw, false));
/*  22 */     this.bg.a(1, (kv)new kk(this, this.bw, 1, 60));
/*  23 */     this.bg.a(6, (kv)new lo(this));
/*  24 */     this.bh.a(0, (kv)new ly(this, false));
/*  25 */     this.bh.a(1, (kv)new lz(this, og.class, 16.0F, 0, true));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_82193_c(jn par1Entity) {
/*  32 */     return 4;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aV() {
/*  37 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  42 */     super.a();
/*  43 */     this.af.a(16, new Byte((byte)1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSlimeSize(int par1) {
/*  48 */     this.af.b(16, new Byte((byte)par1));
/*  49 */     a(0.6F * par1, 0.6F * par1);
/*  50 */     b(this.t, this.u, this.v);
/*  51 */     j(aM());
/*  52 */     this.aV = par1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int aM() {
/*  57 */     int var1 = getSlimeSize();
/*  58 */     return var1 * var1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSlimeSize() {
/*  64 */     return this.af.a(16);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(an par1NBTTagCompound) {
/*  70 */     super.b(par1NBTTagCompound);
/*  71 */     par1NBTTagCompound.a("Size", getSlimeSize() - 1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(an par1NBTTagCompound) {
/*  77 */     super.a(par1NBTTagCompound);
/*  78 */     setSlimeSize(par1NBTTagCompound.e("Size") + 1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected String getSlimeParticle() {
/*  84 */     return "Random";
/*     */   }
/*     */ 
/*     */   
/*     */   protected String getJumpSound() {
/*  89 */     return "mob.enderman";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void h_() {
/*  95 */     if (!this.p.K && this.p.u == 0 && getSlimeSize() > 0)
/*     */     {
/*  97 */       this.L = true;
/*     */     }
/*     */     
/* 100 */     this.field_70811_b += (this.field_70813_a - this.field_70811_b) * 0.5F;
/* 101 */     this.field_70812_c = this.field_70811_b;
/* 102 */     boolean var1 = this.E;
/* 103 */     super.h_();
/*     */     
/* 105 */     if (this.E && !var1) {
/*     */       
/* 107 */       int var2 = getSlimeSize();
/*     */       
/* 109 */       for (int var3 = 0; var3 < var2 * 8; var3++) {
/*     */         
/* 111 */         float var4 = this.Z.nextFloat() * 3.1415927F * 2.0F;
/* 112 */         float var5 = this.Z.nextFloat() * 0.5F + 0.5F;
/* 113 */         float var6 = ih.a(var4) * var2 * 0.5F * var5;
/* 114 */         float var7 = ih.b(var4) * var2 * 0.5F * var5;
/* 115 */         this.p.a(getSlimeParticle(), this.t + var6, this.D.b, this.v + var7, 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */       
/* 118 */       if (makesSoundOnLand())
/*     */       {
/* 120 */         this.p.a(this, getJumpSound(), aP(), ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F) / 0.8F);
/*     */       }
/*     */       
/* 123 */       this.field_70813_a = -0.5F;
/*     */     }
/* 125 */     else if (!this.E && var1) {
/*     */       
/* 127 */       this.field_70813_a = 1.0F;
/*     */     } 
/*     */     
/* 130 */     func_70808_l();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void be() {
/* 135 */     bb();
/* 136 */     og var1 = this.p.b(this, 16.0D);
/*     */     
/* 138 */     if (var1 != null)
/*     */     {
/* 140 */       a((jn)var1, 10.0F, 20.0F);
/*     */     }
/*     */     
/* 143 */     if (this.E && this.slimeJumpDelay-- <= 0) {
/*     */       
/* 145 */       this.slimeJumpDelay = getJumpDelay();
/*     */       
/* 147 */       if (var1 != null)
/*     */       {
/* 149 */         this.slimeJumpDelay /= 3;
/*     */       }
/*     */       
/* 152 */       this.bu = true;
/*     */       
/* 154 */       if (makesSoundOnJump())
/*     */       {
/* 156 */         this.p.a(this, getJumpSound(), aP(), ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F) * 0.8F);
/*     */       }
/*     */       
/* 159 */       this.br = 1.0F - this.Z.nextFloat() * 2.0F;
/* 160 */       this.bs = (1 * getSlimeSize());
/*     */     }
/*     */     else {
/*     */       
/* 164 */       this.bu = false;
/*     */       
/* 166 */       if (this.E)
/*     */       {
/* 168 */         this.br = this.bs = 0.0F;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_70808_l() {
/* 175 */     this.field_70813_a *= 0.6F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected int getJumpDelay() {
/* 181 */     return this.Z.nextInt(20) + 10;
/*     */   }
/*     */ 
/*     */   
/*     */   protected EntitySkeleBoss createInstance() {
/* 186 */     return new EntitySkeleBoss(this.p);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void y() {
/* 192 */     int var1 = getSlimeSize();
/*     */     
/* 194 */     if (!this.p.K && var1 > 1 && aN() <= 0) {
/*     */       
/* 196 */       int var2 = 2 + this.Z.nextInt(3);
/*     */       
/* 198 */       for (int var3 = 0; var3 < var2; var3++) {
/*     */         
/* 200 */         float var4 = ((var3 % 2) - 0.5F) * var1 / 4.0F;
/* 201 */         float var5 = ((var3 / 2) - 0.5F) * var1 / 4.0F;
/* 202 */         EntitySkeleBoss var6 = createInstance();
/* 203 */         var6.setSlimeSize(var1 / 2);
/* 204 */         var6.b(this.t + var4, this.u + 0.5D, this.v + var5, this.Z.nextFloat() * 360.0F, 0.0F);
/* 205 */         this.p.d(var6);
/*     */       } 
/*     */     } 
/*     */     
/* 209 */     super.y();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b_(og par1EntityPlayer) {
/* 215 */     if (canDamagePlayer()) {
/*     */       
/* 217 */       int var2 = getSlimeSize();
/*     */       
/* 219 */       if (l((jn)par1EntityPlayer) && e((jn)par1EntityPlayer) < 0.6D * var2 * 0.6D * var2 && par1EntityPlayer.a(je.a(this), getAttackStrength()))
/*     */       {
/* 221 */         this.p.a(this, "mob.skeletonhurt", 1.0F, (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean canDamagePlayer() {
/* 229 */     return (getSlimeSize() > 1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected int getAttackStrength() {
/* 235 */     return getSlimeSize();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aR() {
/* 241 */     return "mob.skeletonhurt";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aS() {
/* 247 */     return "mob.skeletonhurt";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected int aT() {
/* 253 */     return (getSlimeSize() == 1) ? rh.aX.bT : 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean bi() {
/* 259 */     wl var1 = this.p.d(ih.c(this.t), ih.c(this.v));
/* 260 */     return (this.p.H().t() == va.c && this.Z.nextInt(4) != 1) ? false : (((getSlimeSize() == 1 || this.p.u > 0) && this.Z.nextInt(10) == 0 && var1.a(987234911L).nextInt(10) == 0 && this.u < 40.0D) ? super.bi() : false);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected float aP() {
/* 266 */     return 0.4F * getSlimeSize();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int bf() {
/* 272 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean makesSoundOnJump() {
/* 278 */     return (getSlimeSize() > 1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean makesSoundOnLand() {
/* 284 */     return (getSlimeSize() > 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public int bl() {
/* 289 */     return 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\Shadow\Downloads\SkeletonsPlus\!\EntitySkeleBoss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
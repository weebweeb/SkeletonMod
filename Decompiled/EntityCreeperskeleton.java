/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EntityCreeperskeleton
/*     */   extends nu
/*     */ {
/*     */   int timeSinceIgnited;
/*     */   int lastActiveTime;
/*  12 */   private static final rj defaultheldItem = new rj(rh.k, 1);
/*     */ 
/*     */   
/*     */   public EntityCreeperskeleton(up par1World) {
/*  16 */     super(par1World);
/*  17 */     this.az = "/mob/skeleton.png";
/*  18 */     this.bw = 0.3F;
/*  19 */     this.f = 4;
/*     */     
/*  21 */     this.bg.a(1, (kv)new ks((jw)this));
/*  22 */     this.bg.a(2, new EntityAICreeperSkeleton(this));
/*  23 */     this.bg.a(2, (kv)new lr((kb)this));
/*  24 */     this.bg.a(3, (kv)new kr((kb)this, this.bw));
/*  25 */     this.bg.a(4, (kv)new kk((jw)this, this.bw, 1, 60));
/*  26 */     this.bg.a(5, (kv)new lp((kb)this, this.bw));
/*  27 */     this.bg.a(6, (kv)new la((jw)this, og.class, 8.0F));
/*  28 */     this.bg.a(7, (kv)new lo((jw)this));
/*  29 */     this.bh.a(1, (kv)new ly((jw)this, false));
/*  30 */     this.bh.a(2, (kv)new lz((jw)this, og.class, 16.0F, 0, true));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int aM() {
/*  36 */     return 30;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aV() {
/*  41 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a() {
/*  46 */     super.a();
/*  47 */     this.af.a(16, Byte.valueOf((byte)-1));
/*  48 */     this.af.a(17, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public rj bm() {
/*  54 */     return defaultheldItem;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public jy bt() {
/*  60 */     return jy.b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {
/*  66 */     if (this.p.s() && !this.p.K) {
/*     */       
/*  68 */       float var1 = c(1.0F);
/*     */       
/*  70 */       if (var1 > 0.5F && this.p.j(ih.c(this.t), ih.c(this.u), ih.c(this.v)) && this.Z.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F)
/*     */       {
/*  72 */         d(8);
/*     */       }
/*     */     } 
/*     */     
/*  76 */     super.d();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(an par1NBTTagCompound) {
/*  82 */     super.b(par1NBTTagCompound);
/*     */     
/*  84 */     if (this.af.a(17) == 1)
/*     */     {
/*  86 */       par1NBTTagCompound.a("powered", true);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(an par1NBTTagCompound) {
/*  93 */     super.a(par1NBTTagCompound);
/*  94 */     this.af.b(17, Byte.valueOf((byte)(par1NBTTagCompound.n("powered") ? 1 : 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void h_() {
/* 100 */     if (S()) {
/*     */       
/* 102 */       this.lastActiveTime = this.timeSinceIgnited;
/* 103 */       int var1 = getCreeperState();
/*     */       
/* 105 */       if (var1 > 0 && this.timeSinceIgnited == 0)
/*     */       {
/* 107 */         this.p.a((jn)this, "random.fuse", 1.0F, 0.5F);
/*     */       }
/*     */       
/* 110 */       this.timeSinceIgnited += var1;
/*     */       
/* 112 */       if (this.timeSinceIgnited < 0)
/*     */       {
/* 114 */         this.timeSinceIgnited = 0;
/*     */       }
/*     */       
/* 117 */       if (this.timeSinceIgnited >= 30) {
/*     */         
/* 119 */         this.timeSinceIgnited = 30;
/*     */         
/* 121 */         if (!this.p.K) {
/*     */           
/* 123 */           if (getPowered()) {
/*     */             
/* 125 */             this.p.a((jn)this, this.t, this.u, this.v, 6.0F);
/*     */           }
/*     */           else {
/*     */             
/* 129 */             this.p.a((jn)this, this.t, this.u, this.v, 3.0F);
/*     */           } 
/*     */           
/* 132 */           y();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 137 */     super.h_();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aR() {
/* 143 */     return "mob.creeper";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected String aS() {
/* 149 */     return "mob.creeperdeath";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(je par1DamageSource) {
/* 155 */     super.a(par1DamageSource);
/*     */     
/* 157 */     if (par1DamageSource.g() instanceof nx)
/*     */     {
/* 159 */       b(rh.bI.bT + this.Z.nextInt(10), 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean k(jn par1Entity) {
/* 165 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getPowered() {
/* 171 */     return (this.af.a(17) == 1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float setCreeperFlashTime(float par1) {
/* 177 */     return (this.lastActiveTime + (this.timeSinceIgnited - this.lastActiveTime) * par1) / 28.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCreeperState() {
/* 183 */     return this.af.a(16);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCreeperState(int par1) {
/* 189 */     this.af.b(16, Byte.valueOf((byte)par1));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected int aT() {
/* 195 */     return rh.l.bT;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(boolean par1, int par2) {
/* 201 */     int var3 = this.Z.nextInt(3 + par2);
/*     */     
/*     */     int var4;
/* 204 */     for (var4 = 0; var4 < var3; var4++)
/*     */     {
/* 206 */       b(rh.l.bT, 1);
/*     */     }
/*     */     
/* 209 */     var3 = this.Z.nextInt(3 + par2);
/*     */     
/* 211 */     for (var4 = 0; var4 < var3; var4++)
/*     */     {
/* 213 */       b(rh.aX.bT, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void l(int par1) {
/* 219 */     if (par1 > 0) {
/*     */       
/* 221 */       rj var2 = new rj(rh.k);
/* 222 */       tu.a(this.Z, var2, 5);
/* 223 */       a(var2, 0.0F);
/*     */     }
/*     */     else {
/*     */       
/* 227 */       b(rh.k.bT, 1);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ng par1EntityLightningBolt) {
/* 234 */     super.a(par1EntityLightningBolt);
/* 235 */     this.af.b(17, Byte.valueOf((byte)1));
/*     */   }
/*     */ }


/* Location:              C:\Users\Shadow\Downloads\SkeletonsPlus\!\EntityCreeperskeleton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
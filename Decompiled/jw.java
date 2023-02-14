/*      */ import java.util.Collection;
/*      */ import java.util.HashMap;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ 
/*      */ 
/*      */ public abstract class jw
/*      */   extends jn
/*      */ {
/*   11 */   public int an = 20;
/*      */   public float ao;
/*      */   public float ap;
/*   14 */   public float aq = 0.0F;
/*   15 */   public float ar = 0.0F;
/*      */ 
/*      */   
/*   18 */   public float as = 0.0F;
/*      */ 
/*      */   
/*   21 */   public float at = 0.0F;
/*      */   
/*      */   protected float au;
/*      */   
/*      */   protected float av;
/*      */   protected float aw;
/*      */   protected float ax;
/*      */   protected boolean ay = true;
/*   29 */   protected String az = "/mob/char.png";
/*      */   protected boolean aA = true;
/*   31 */   protected float aB = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   36 */   protected String aC = null;
/*   37 */   protected float aD = 1.0F;
/*      */ 
/*      */   
/*   40 */   protected int aE = 0;
/*   41 */   protected float aF = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   47 */   public float aG = 0.1F;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   52 */   public float aH = 0.02F;
/*      */   public float aI;
/*      */   public float aJ;
/*   55 */   protected int aK = aM();
/*      */ 
/*      */ 
/*      */   
/*      */   public int aL;
/*      */ 
/*      */ 
/*      */   
/*      */   protected int aM;
/*      */ 
/*      */ 
/*      */   
/*      */   private int a;
/*      */ 
/*      */   
/*      */   public int aN;
/*      */ 
/*      */   
/*      */   public int aO;
/*      */ 
/*      */   
/*   76 */   public float aP = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   81 */   public int aQ = 0;
/*   82 */   public int aR = 0;
/*      */ 
/*      */   
/*      */   public float aS;
/*      */   
/*      */   public float aT;
/*      */   
/*      */   protected boolean aU = false;
/*      */   
/*      */   protected int aV;
/*      */   
/*   93 */   public int aW = -1;
/*   94 */   public float aX = (float)(Math.random() * 0.8999999761581421D + 0.10000000149011612D);
/*      */ 
/*      */   
/*      */   public float aY;
/*      */ 
/*      */   
/*      */   public float aZ;
/*      */ 
/*      */   
/*      */   public float ba;
/*      */   
/*  105 */   protected og bb = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  111 */   protected int bc = 0;
/*      */ 
/*      */   
/*  114 */   private jw b = null;
/*  115 */   private int c = 0;
/*  116 */   private jw d = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  122 */   public int bd = 0;
/*  123 */   public int be = 0;
/*  124 */   protected HashMap bf = new HashMap<Object, Object>();
/*      */   
/*      */   private boolean e = true;
/*      */   
/*      */   private int f;
/*      */   
/*      */   private ki g;
/*      */   
/*      */   private kj h;
/*      */   
/*      */   private kh i;
/*      */   
/*      */   private kf j;
/*      */   private mf by;
/*      */   protected final kw bg;
/*      */   protected final kw bh;
/*      */   private jw bz;
/*      */   private mg bA;
/*      */   private float bB;
/*  143 */   private j bC = new j(0, 0, 0);
/*      */ 
/*      */   
/*  146 */   private float bD = -1.0F;
/*      */ 
/*      */   
/*      */   protected int bi;
/*      */ 
/*      */   
/*      */   protected double bj;
/*      */ 
/*      */   
/*      */   protected double bk;
/*      */ 
/*      */   
/*      */   protected double bl;
/*      */ 
/*      */   
/*      */   protected double bm;
/*      */ 
/*      */   
/*      */   protected double bn;
/*      */ 
/*      */   
/*  167 */   float bo = 0.0F;
/*      */ 
/*      */   
/*  170 */   protected int bp = 0;
/*      */ 
/*      */   
/*  173 */   protected int bq = 0;
/*      */   
/*      */   protected float br;
/*      */   
/*      */   protected float bs;
/*      */   protected float bt;
/*      */   protected boolean bu = false;
/*  180 */   protected float bv = 0.0F;
/*  181 */   protected float bw = 0.7F;
/*      */ 
/*      */   
/*  184 */   private int bE = 0;
/*      */ 
/*      */   
/*      */   private jn bF;
/*      */ 
/*      */   
/*  190 */   protected int bx = 0;
/*      */ 
/*      */   
/*      */   public jw(up par1World) {
/*  194 */     super(par1World);
/*  195 */     this.m = true;
/*  196 */     this.bg = new kw((par1World != null && par1World.F != null) ? par1World.F : null);
/*  197 */     this.bh = new kw((par1World != null && par1World.F != null) ? par1World.F : null);
/*  198 */     this.g = new ki(this);
/*  199 */     this.h = new kj(this);
/*  200 */     this.i = new kh(this);
/*  201 */     this.j = new kf(this);
/*  202 */     this.by = new mf(this, par1World, 16.0F);
/*  203 */     this.bA = new mg(this);
/*  204 */     this.ap = (float)(Math.random() + 1.0D) * 0.01F;
/*  205 */     b(this.t, this.u, this.v);
/*  206 */     this.ao = (float)Math.random() * 12398.0F;
/*  207 */     this.z = (float)(Math.random() * Math.PI * 2.0D);
/*  208 */     this.as = this.z;
/*  209 */     this.W = 0.5F;
/*      */   }
/*      */ 
/*      */   
/*      */   public ki ap() {
/*  214 */     return this.g;
/*      */   }
/*      */ 
/*      */   
/*      */   public kj aq() {
/*  219 */     return this.h;
/*      */   }
/*      */ 
/*      */   
/*      */   public kh ar() {
/*  224 */     return this.i;
/*      */   }
/*      */ 
/*      */   
/*      */   public mf as() {
/*  229 */     return this.by;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public mg at() {
/*  237 */     return this.bA;
/*      */   }
/*      */ 
/*      */   
/*      */   public Random au() {
/*  242 */     return this.Z;
/*      */   }
/*      */ 
/*      */   
/*      */   public jw av() {
/*  247 */     return this.b;
/*      */   }
/*      */ 
/*      */   
/*      */   public jw aw() {
/*  252 */     return this.d;
/*      */   }
/*      */ 
/*      */   
/*      */   public void j(jn par1Entity) {
/*  257 */     if (par1Entity instanceof jw)
/*      */     {
/*  259 */       this.d = (jw)par1Entity;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public int ax() {
/*  265 */     return this.bq;
/*      */   }
/*      */ 
/*      */   
/*      */   public float am() {
/*  270 */     return this.as;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void d(float par1) {
/*  278 */     this.as = par1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float ay() {
/*  286 */     return this.bB;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void e(float par1) {
/*  294 */     this.bB = par1;
/*  295 */     f(par1);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean k(jn par1Entity) {
/*  300 */     j(par1Entity);
/*  301 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public jw az() {
/*  309 */     return this.bz;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(jw par1EntityLiving) {
/*  317 */     this.bz = par1EntityLiving;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(Class<no> par1Class) {
/*  322 */     return (no.class != par1Class && nr.class != par1Class && EntityCreeperskeleton.class != par1Class);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void aA() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean aB() {
/*  336 */     return d(ih.c(this.t), ih.c(this.u), ih.c(this.v));
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean d(int par1, int par2, int par3) {
/*  341 */     return (this.bD == -1.0F) ? true : ((this.bC.e(par1, par2, par3) < this.bD * this.bD));
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(int par1, int par2, int par3, int par4) {
/*  346 */     this.bC.b(par1, par2, par3);
/*  347 */     this.bD = par4;
/*      */   }
/*      */ 
/*      */   
/*      */   public j aC() {
/*  352 */     return this.bC;
/*      */   }
/*      */ 
/*      */   
/*      */   public float aD() {
/*  357 */     return this.bD;
/*      */   }
/*      */ 
/*      */   
/*      */   public void aE() {
/*  362 */     this.bD = -1.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean aF() {
/*  367 */     return (this.bD != -1.0F);
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(jw par1EntityLiving) {
/*  372 */     this.b = par1EntityLiving;
/*  373 */     this.c = (this.b != null) ? 60 : 0;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a() {
/*  378 */     this.af.a(8, Integer.valueOf(this.f));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean l(jn par1Entity) {
/*  386 */     return (this.p.a(ajs.a().a(this.t, this.u + e(), this.v), ajs.a().a(par1Entity.t, par1Entity.u + par1Entity.e(), par1Entity.v)) == null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String O() {
/*  394 */     return this.az;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean L() {
/*  402 */     return !this.L;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean M() {
/*  410 */     return !this.L;
/*      */   }
/*      */ 
/*      */   
/*      */   public float e() {
/*  415 */     return this.O * 0.85F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int aG() {
/*  423 */     return 80;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void aH() {
/*  431 */     String var1 = aQ();
/*      */     
/*  433 */     if (var1 != null)
/*      */     {
/*  435 */       this.p.a(this, var1, aP(), i());
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void z() {
/*  444 */     this.aI = this.aJ;
/*  445 */     super.z();
/*  446 */     this.p.F.a("mobBaseTick");
/*      */     
/*  448 */     if (S() && this.Z.nextInt(1000) < this.a++) {
/*      */       
/*  450 */       this.a = -aG();
/*  451 */       aH();
/*      */     } 
/*      */     
/*  454 */     if (S() && T())
/*      */     {
/*  456 */       a(je.d, 1);
/*      */     }
/*      */     
/*  459 */     if (F() || this.p.K)
/*      */     {
/*  461 */       B();
/*      */     }
/*      */     
/*  464 */     if (S() && a(aco.g) && !aU() && !this.bf.containsKey(Integer.valueOf(ji.o.H))) {
/*      */       
/*  466 */       g(h(ai()));
/*      */       
/*  468 */       if (ai() == -20) {
/*      */         
/*  470 */         g(0);
/*      */         
/*  472 */         for (int var1 = 0; var1 < 8; var1++) {
/*      */           
/*  474 */           float var2 = this.Z.nextFloat() - this.Z.nextFloat();
/*  475 */           float var3 = this.Z.nextFloat() - this.Z.nextFloat();
/*  476 */           float var4 = this.Z.nextFloat() - this.Z.nextFloat();
/*  477 */           this.p.a("bubble", this.t + var2, this.u + var3, this.v + var4, this.w, this.x, this.y);
/*      */         } 
/*      */         
/*  480 */         a(je.e, 2);
/*      */       } 
/*      */       
/*  483 */       B();
/*      */     }
/*      */     else {
/*      */       
/*  487 */       g(300);
/*      */     } 
/*      */     
/*  490 */     this.aS = this.aT;
/*      */     
/*  492 */     if (this.aR > 0)
/*      */     {
/*  494 */       this.aR--;
/*      */     }
/*      */     
/*  497 */     if (this.aN > 0)
/*      */     {
/*  499 */       this.aN--;
/*      */     }
/*      */     
/*  502 */     if (this.ad > 0)
/*      */     {
/*  504 */       this.ad--;
/*      */     }
/*      */     
/*  507 */     if (this.aK <= 0)
/*      */     {
/*  509 */       aI();
/*      */     }
/*      */     
/*  512 */     if (this.bc > 0) {
/*      */       
/*  514 */       this.bc--;
/*      */     }
/*      */     else {
/*      */       
/*  518 */       this.bb = null;
/*      */     } 
/*      */     
/*  521 */     if (this.d != null && !this.d.S())
/*      */     {
/*  523 */       this.d = null;
/*      */     }
/*      */     
/*  526 */     if (this.b != null)
/*      */     {
/*  528 */       if (!this.b.S()) {
/*      */         
/*  530 */         c((jw)null);
/*      */       }
/*  532 */       else if (this.c > 0) {
/*      */         
/*  534 */         this.c--;
/*      */       }
/*      */       else {
/*      */         
/*  538 */         c((jw)null);
/*      */       } 
/*      */     }
/*      */     
/*  542 */     bo();
/*  543 */     this.ax = this.aw;
/*  544 */     this.ar = this.aq;
/*  545 */     this.at = this.as;
/*  546 */     this.B = this.z;
/*  547 */     this.C = this.A;
/*  548 */     this.p.F.b();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void aI() {
/*  556 */     this.aQ++;
/*      */     
/*  558 */     if (this.aQ == 20) {
/*      */ 
/*      */ 
/*      */       
/*  562 */       if (!this.p.K && (this.bc > 0 || aJ()) && !g_()) {
/*      */         
/*  564 */         int i = a(this.bb);
/*      */         
/*  566 */         while (i > 0) {
/*      */           
/*  568 */           int var2 = ju.a(i);
/*  569 */           i -= var2;
/*  570 */           this.p.d((jn)new ju(this.p, this.t, this.u, this.v, var2));
/*      */         } 
/*      */       } 
/*      */       
/*  574 */       y();
/*      */       
/*  576 */       for (int var1 = 0; var1 < 20; var1++) {
/*      */         
/*  578 */         double var8 = this.Z.nextGaussian() * 0.02D;
/*  579 */         double var4 = this.Z.nextGaussian() * 0.02D;
/*  580 */         double var6 = this.Z.nextGaussian() * 0.02D;
/*  581 */         this.p.a("explode", this.t + (this.Z.nextFloat() * this.N * 2.0F) - this.N, this.u + (this.Z.nextFloat() * this.O), this.v + (this.Z.nextFloat() * this.N * 2.0F) - this.N, var8, var4, var6);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected int h(int par1) {
/*  591 */     return par1 - 1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected int a(og par1EntityPlayer) {
/*  599 */     return this.aV;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean aJ() {
/*  607 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void aK() {
/*  615 */     for (int var1 = 0; var1 < 20; var1++) {
/*      */       
/*  617 */       double var2 = this.Z.nextGaussian() * 0.02D;
/*  618 */       double var4 = this.Z.nextGaussian() * 0.02D;
/*  619 */       double var6 = this.Z.nextGaussian() * 0.02D;
/*  620 */       double var8 = 10.0D;
/*  621 */       this.p.a("explode", this.t + (this.Z.nextFloat() * this.N * 2.0F) - this.N - var2 * var8, this.u + (this.Z.nextFloat() * this.O) - var4 * var8, this.v + (this.Z.nextFloat() * this.N * 2.0F) - this.N - var6 * var8, var2, var4, var6);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void U() {
/*  630 */     super.U();
/*  631 */     this.au = this.av;
/*  632 */     this.av = 0.0F;
/*  633 */     this.R = 0.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(double par1, double par3, double par5, float par7, float par8, int par9) {
/*  642 */     this.M = 0.0F;
/*  643 */     this.bj = par1;
/*  644 */     this.bk = par3;
/*  645 */     this.bl = par5;
/*  646 */     this.bm = par7;
/*  647 */     this.bn = par8;
/*  648 */     this.bi = par9;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void h_() {
/*  656 */     super.h_();
/*      */     
/*  658 */     if (this.bd > 0) {
/*      */       
/*  660 */       if (this.be <= 0)
/*      */       {
/*  662 */         this.be = 60;
/*      */       }
/*      */       
/*  665 */       this.be--;
/*      */       
/*  667 */       if (this.be <= 0)
/*      */       {
/*  669 */         this.bd--;
/*      */       }
/*      */     } 
/*      */     
/*  673 */     d();
/*  674 */     double var1 = this.t - this.q;
/*  675 */     double var3 = this.v - this.s;
/*  676 */     float var5 = (float)(var1 * var1 + var3 * var3);
/*  677 */     float var6 = this.aq;
/*  678 */     float var7 = 0.0F;
/*  679 */     this.au = this.av;
/*  680 */     float var8 = 0.0F;
/*      */     
/*  682 */     if (var5 > 0.0025000002F) {
/*      */       
/*  684 */       var8 = 1.0F;
/*  685 */       var7 = (float)Math.sqrt(var5) * 3.0F;
/*  686 */       var6 = (float)Math.atan2(var3, var1) * 180.0F / 3.1415927F - 90.0F;
/*      */     } 
/*      */     
/*  689 */     if (this.aJ > 0.0F)
/*      */     {
/*  691 */       var6 = this.z;
/*      */     }
/*      */     
/*  694 */     if (!this.E)
/*      */     {
/*  696 */       var8 = 0.0F;
/*      */     }
/*      */     
/*  699 */     this.av += (var8 - this.av) * 0.3F;
/*  700 */     this.p.F.a("headTurn");
/*      */     
/*  702 */     if (aV()) {
/*      */       
/*  704 */       this.j.a();
/*      */     }
/*      */     else {
/*      */       
/*  708 */       float var9 = ih.g(var6 - this.aq);
/*  709 */       this.aq += var9 * 0.3F;
/*  710 */       float var10 = ih.g(this.z - this.aq);
/*  711 */       boolean var11 = (var10 < -90.0F || var10 >= 90.0F);
/*      */       
/*  713 */       if (var10 < -75.0F)
/*      */       {
/*  715 */         var10 = -75.0F;
/*      */       }
/*      */       
/*  718 */       if (var10 >= 75.0F)
/*      */       {
/*  720 */         var10 = 75.0F;
/*      */       }
/*      */       
/*  723 */       this.aq = this.z - var10;
/*      */       
/*  725 */       if (var10 * var10 > 2500.0F)
/*      */       {
/*  727 */         this.aq += var10 * 0.2F;
/*      */       }
/*      */       
/*  730 */       if (var11)
/*      */       {
/*  732 */         var7 *= -1.0F;
/*      */       }
/*      */     } 
/*      */     
/*  736 */     this.p.F.b();
/*  737 */     this.p.F.a("rangeChecks");
/*      */     
/*  739 */     while (this.z - this.B < -180.0F)
/*      */     {
/*  741 */       this.B -= 360.0F;
/*      */     }
/*      */     
/*  744 */     while (this.z - this.B >= 180.0F)
/*      */     {
/*  746 */       this.B += 360.0F;
/*      */     }
/*      */     
/*  749 */     while (this.aq - this.ar < -180.0F)
/*      */     {
/*  751 */       this.ar -= 360.0F;
/*      */     }
/*      */     
/*  754 */     while (this.aq - this.ar >= 180.0F)
/*      */     {
/*  756 */       this.ar += 360.0F;
/*      */     }
/*      */     
/*  759 */     while (this.A - this.C < -180.0F)
/*      */     {
/*  761 */       this.C -= 360.0F;
/*      */     }
/*      */     
/*  764 */     while (this.A - this.C >= 180.0F)
/*      */     {
/*  766 */       this.C += 360.0F;
/*      */     }
/*      */     
/*  769 */     while (this.as - this.at < -180.0F)
/*      */     {
/*  771 */       this.at -= 360.0F;
/*      */     }
/*      */     
/*  774 */     while (this.as - this.at >= 180.0F)
/*      */     {
/*  776 */       this.at += 360.0F;
/*      */     }
/*      */     
/*  779 */     this.p.F.b();
/*  780 */     this.aw += var7;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void i(int par1) {
/*  788 */     if (this.aK > 0) {
/*      */       
/*  790 */       this.aK += par1;
/*      */       
/*  792 */       if (this.aK > aM())
/*      */       {
/*  794 */         this.aK = aM();
/*      */       }
/*      */       
/*  797 */       this.ad = this.an / 2;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public abstract int aM();
/*      */   
/*      */   public int aN() {
/*  805 */     return this.aK;
/*      */   }
/*      */ 
/*      */   
/*      */   public void j(int par1) {
/*  810 */     this.aK = par1;
/*      */     
/*  812 */     if (par1 > aM())
/*      */     {
/*  814 */       par1 = aM();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(je par1DamageSource, int par2) {
/*  823 */     if (this.p.K)
/*      */     {
/*  825 */       return false;
/*      */     }
/*      */ 
/*      */     
/*  829 */     this.bq = 0;
/*      */     
/*  831 */     if (this.aK <= 0)
/*      */     {
/*  833 */       return false;
/*      */     }
/*  835 */     if (par1DamageSource.k() && a(ji.n))
/*      */     {
/*  837 */       return false;
/*      */     }
/*      */ 
/*      */     
/*  841 */     this.aZ = 1.5F;
/*  842 */     boolean var3 = true;
/*      */     
/*  844 */     if (this.ad > this.an / 2.0F) {
/*      */       
/*  846 */       if (par2 <= this.bp)
/*      */       {
/*  848 */         return false;
/*      */       }
/*      */       
/*  851 */       d(par1DamageSource, par2 - this.bp);
/*  852 */       this.bp = par2;
/*  853 */       var3 = false;
/*      */     }
/*      */     else {
/*      */       
/*  857 */       this.bp = par2;
/*  858 */       this.aL = this.aK;
/*  859 */       this.ad = this.an;
/*  860 */       d(par1DamageSource, par2);
/*  861 */       this.aN = this.aO = 10;
/*      */     } 
/*      */     
/*  864 */     this.aP = 0.0F;
/*  865 */     jn var4 = par1DamageSource.g();
/*      */     
/*  867 */     if (var4 != null) {
/*      */       
/*  869 */       if (var4 instanceof jw)
/*      */       {
/*  871 */         c((jw)var4);
/*      */       }
/*      */       
/*  874 */       if (var4 instanceof og) {
/*      */         
/*  876 */         this.bc = 60;
/*  877 */         this.bb = (og)var4;
/*      */       }
/*  879 */       else if (var4 instanceof mz) {
/*      */         
/*  881 */         mz var5 = (mz)var4;
/*      */         
/*  883 */         if (var5.n()) {
/*      */           
/*  885 */           this.bc = 60;
/*  886 */           this.bb = null;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  891 */     if (var3) {
/*      */       
/*  893 */       this.p.a(this, (byte)2);
/*      */       
/*  895 */       if (par1DamageSource != je.e && par1DamageSource != je.l)
/*      */       {
/*  897 */         K();
/*      */       }
/*      */       
/*  900 */       if (var4 != null) {
/*      */         
/*  902 */         double var9 = var4.t - this.t;
/*      */         
/*      */         double var7;
/*  905 */         for (var7 = var4.v - this.v; var9 * var9 + var7 * var7 < 1.0E-4D; var7 = (Math.random() - Math.random()) * 0.01D)
/*      */         {
/*  907 */           var9 = (Math.random() - Math.random()) * 0.01D;
/*      */         }
/*      */         
/*  910 */         this.aP = (float)(Math.atan2(var7, var9) * 180.0D / Math.PI) - this.z;
/*  911 */         a(var4, par2, var9, var7);
/*      */       }
/*      */       else {
/*      */         
/*  915 */         this.aP = ((int)(Math.random() * 2.0D) * 180);
/*      */       } 
/*      */     } 
/*      */     
/*  919 */     if (this.aK <= 0) {
/*      */       
/*  921 */       if (var3)
/*      */       {
/*  923 */         this.p.a(this, aS(), aP(), i());
/*      */       }
/*      */       
/*  926 */       a(par1DamageSource);
/*      */     }
/*  928 */     else if (var3) {
/*      */       
/*  930 */       this.p.a(this, aR(), aP(), i());
/*      */     } 
/*      */     
/*  933 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private float i() {
/*  943 */     return g_() ? ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.5F) : ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void ab() {
/*  951 */     this.aN = this.aO = 10;
/*  952 */     this.aP = 0.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int aO() {
/*  960 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void k(int par1) {}
/*      */ 
/*      */ 
/*      */   
/*      */   protected int b(je par1DamageSource, int par2) {
/*  970 */     if (!par1DamageSource.c()) {
/*      */       
/*  972 */       int var3 = 25 - aO();
/*  973 */       int var4 = par2 * var3 + this.aM;
/*  974 */       k(par2);
/*  975 */       par2 = var4 / 25;
/*  976 */       this.aM = var4 % 25;
/*      */     } 
/*      */     
/*  979 */     return par2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected int c(je par1DamageSource, int par2) {
/*  987 */     if (a(ji.m)) {
/*      */       
/*  989 */       int var3 = (b(ji.m).c() + 1) * 5;
/*  990 */       int var4 = 25 - var3;
/*  991 */       int var5 = par2 * var4 + this.aM;
/*  992 */       par2 = var5 / 25;
/*  993 */       this.aM = var5 % 25;
/*      */     } 
/*      */     
/*  996 */     return par2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void d(je par1DamageSource, int par2) {
/* 1005 */     par2 = b(par1DamageSource, par2);
/* 1006 */     par2 = c(par1DamageSource, par2);
/* 1007 */     this.aK -= par2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float aP() {
/* 1015 */     return 1.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String aQ() {
/* 1023 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String aR() {
/* 1031 */     return "damage.hurtflesh";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String aS() {
/* 1039 */     return "damage.hurtflesh";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(jn par1Entity, int par2, double par3, double par5) {
/* 1047 */     this.al = true;
/* 1048 */     float var7 = ih.a(par3 * par3 + par5 * par5);
/* 1049 */     float var8 = 0.4F;
/* 1050 */     this.w /= 2.0D;
/* 1051 */     this.x /= 2.0D;
/* 1052 */     this.y /= 2.0D;
/* 1053 */     this.w -= par3 / var7 * var8;
/* 1054 */     this.x += var8;
/* 1055 */     this.y -= par5 / var7 * var8;
/*      */     
/* 1057 */     if (this.x > 0.4000000059604645D)
/*      */     {
/* 1059 */       this.x = 0.4000000059604645D;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(je par1DamageSource) {
/* 1068 */     jn var2 = par1DamageSource.g();
/*      */     
/* 1070 */     if (this.aE >= 0 && var2 != null)
/*      */     {
/* 1072 */       var2.c(this, this.aE);
/*      */     }
/*      */     
/* 1075 */     if (var2 != null)
/*      */     {
/* 1077 */       var2.a(this);
/*      */     }
/*      */     
/* 1080 */     this.aU = true;
/*      */     
/* 1082 */     if (!this.p.K) {
/*      */       
/* 1084 */       int var3 = 0;
/*      */       
/* 1086 */       if (var2 instanceof og)
/*      */       {
/* 1088 */         var3 = tu.f(((og)var2).by);
/*      */       }
/*      */       
/* 1091 */       if (!g_()) {
/*      */         
/* 1093 */         a((this.bc > 0), var3);
/*      */         
/* 1095 */         if (this.bc > 0) {
/*      */           
/* 1097 */           int var4 = this.Z.nextInt(200) - var3;
/*      */           
/* 1099 */           if (var4 < 5)
/*      */           {
/* 1101 */             l((var4 <= 0) ? 1 : 0);
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1107 */     this.p.a(this, (byte)3);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void l(int par1) {}
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(boolean par1, int par2) {
/* 1117 */     int var3 = aT();
/*      */     
/* 1119 */     if (var3 > 0) {
/*      */       
/* 1121 */       int var4 = this.Z.nextInt(3);
/*      */       
/* 1123 */       if (par2 > 0)
/*      */       {
/* 1125 */         var4 += this.Z.nextInt(par2 + 1);
/*      */       }
/*      */       
/* 1128 */       for (int var5 = 0; var5 < var4; var5++)
/*      */       {
/* 1130 */         b(var3, 1);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected int aT() {
/* 1140 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(float par1) {
/* 1148 */     super.a(par1);
/* 1149 */     int var2 = ih.f(par1 - 3.0F);
/*      */     
/* 1151 */     if (var2 > 0) {
/*      */       
/* 1153 */       if (var2 > 4) {
/*      */         
/* 1155 */         this.p.a(this, "damage.fallbig", 1.0F, 1.0F);
/*      */       }
/*      */       else {
/*      */         
/* 1159 */         this.p.a(this, "damage.fallsmall", 1.0F, 1.0F);
/*      */       } 
/*      */       
/* 1162 */       a(je.h, var2);
/* 1163 */       int var3 = this.p.a(ih.c(this.t), ih.c(this.u - 0.20000000298023224D - this.M), ih.c(this.v));
/*      */       
/* 1165 */       if (var3 > 0) {
/*      */         
/* 1167 */         aij var4 = (aig.m[var3]).cn;
/* 1168 */         this.p.a(this, var4.d(), var4.b() * 0.5F, var4.c() * 0.75F);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void e(float par1, float par2) {
/* 1181 */     if (H() && (!(this instanceof og) || !((og)this).bZ.b)) {
/*      */       
/* 1183 */       double d = this.u;
/* 1184 */       a(par1, par2, aV() ? 0.04F : 0.02F);
/* 1185 */       d(this.w, this.x, this.y);
/* 1186 */       this.w *= 0.800000011920929D;
/* 1187 */       this.x *= 0.800000011920929D;
/* 1188 */       this.y *= 0.800000011920929D;
/* 1189 */       this.x -= 0.02D;
/*      */       
/* 1191 */       if (this.F && c(this.w, this.x + 0.6000000238418579D - this.u + d, this.y))
/*      */       {
/* 1193 */         this.x = 0.30000001192092896D;
/*      */       }
/*      */     }
/* 1196 */     else if (J() && (!(this instanceof og) || !((og)this).bZ.b)) {
/*      */       
/* 1198 */       double d = this.u;
/* 1199 */       a(par1, par2, 0.02F);
/* 1200 */       d(this.w, this.x, this.y);
/* 1201 */       this.w *= 0.5D;
/* 1202 */       this.x *= 0.5D;
/* 1203 */       this.y *= 0.5D;
/* 1204 */       this.x -= 0.02D;
/*      */       
/* 1206 */       if (this.F && c(this.w, this.x + 0.6000000238418579D - this.u + d, this.y))
/*      */       {
/* 1208 */         this.x = 0.30000001192092896D;
/*      */       }
/*      */     }
/*      */     else {
/*      */       
/* 1213 */       float f1, var5 = 0.91F;
/*      */       
/* 1215 */       if (this.E) {
/*      */         
/* 1217 */         var5 = 0.54600006F;
/* 1218 */         int var6 = this.p.a(ih.c(this.t), ih.c(this.D.b) - 1, ih.c(this.v));
/*      */         
/* 1220 */         if (var6 > 0)
/*      */         {
/* 1222 */           var5 = (aig.m[var6]).cq * 0.91F;
/*      */         }
/*      */       } 
/*      */       
/* 1226 */       float var10 = 0.16277136F / var5 * var5 * var5;
/*      */       
/* 1228 */       if (this.E) {
/*      */         
/* 1230 */         if (aV()) {
/*      */           
/* 1232 */           f1 = ay();
/*      */         }
/*      */         else {
/*      */           
/* 1236 */           f1 = this.aG;
/*      */         } 
/*      */         
/* 1239 */         f1 *= var10;
/*      */       }
/*      */       else {
/*      */         
/* 1243 */         f1 = this.aH;
/*      */       } 
/*      */       
/* 1246 */       a(par1, par2, f1);
/* 1247 */       var5 = 0.91F;
/*      */       
/* 1249 */       if (this.E) {
/*      */         
/* 1251 */         var5 = 0.54600006F;
/* 1252 */         int var8 = this.p.a(ih.c(this.t), ih.c(this.D.b) - 1, ih.c(this.v));
/*      */         
/* 1254 */         if (var8 > 0)
/*      */         {
/* 1256 */           var5 = (aig.m[var8]).cq * 0.91F;
/*      */         }
/*      */       } 
/*      */       
/* 1260 */       if (f_()) {
/*      */         
/* 1262 */         float var12 = 0.15F;
/*      */         
/* 1264 */         if (this.w < -var12)
/*      */         {
/* 1266 */           this.w = -var12;
/*      */         }
/*      */         
/* 1269 */         if (this.w > var12)
/*      */         {
/* 1271 */           this.w = var12;
/*      */         }
/*      */         
/* 1274 */         if (this.y < -var12)
/*      */         {
/* 1276 */           this.y = -var12;
/*      */         }
/*      */         
/* 1279 */         if (this.y > var12)
/*      */         {
/* 1281 */           this.y = var12;
/*      */         }
/*      */         
/* 1284 */         this.R = 0.0F;
/*      */         
/* 1286 */         if (this.x < -0.15D)
/*      */         {
/* 1288 */           this.x = -0.15D;
/*      */         }
/*      */         
/* 1291 */         boolean var9 = (af() && this instanceof og);
/*      */         
/* 1293 */         if (var9 && this.x < 0.0D)
/*      */         {
/* 1295 */           this.x = 0.0D;
/*      */         }
/*      */       } 
/*      */       
/* 1299 */       d(this.w, this.x, this.y);
/*      */       
/* 1301 */       if (this.F && f_())
/*      */       {
/* 1303 */         this.x = 0.2D;
/*      */       }
/*      */       
/* 1306 */       this.x -= 0.08D;
/* 1307 */       this.x *= 0.9800000190734863D;
/* 1308 */       this.w *= var5;
/* 1309 */       this.y *= var5;
/*      */     } 
/*      */     
/* 1312 */     this.aY = this.aZ;
/* 1313 */     double var3 = this.t - this.q;
/* 1314 */     double var11 = this.v - this.s;
/* 1315 */     float var7 = ih.a(var3 * var3 + var11 * var11) * 4.0F;
/*      */     
/* 1317 */     if (var7 > 1.0F)
/*      */     {
/* 1319 */       var7 = 1.0F;
/*      */     }
/*      */     
/* 1322 */     this.aZ += (var7 - this.aZ) * 0.4F;
/* 1323 */     this.ba += this.aZ;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean f_() {
/* 1331 */     int var1 = ih.c(this.t);
/* 1332 */     int var2 = ih.c(this.D.b);
/* 1333 */     int var3 = ih.c(this.v);
/* 1334 */     int var4 = this.p.a(var1, var2, var3);
/* 1335 */     return (var4 == aig.aF.ca || var4 == aig.bu.ca);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(an par1NBTTagCompound) {
/* 1343 */     par1NBTTagCompound.a("Health", (short)this.aK);
/* 1344 */     par1NBTTagCompound.a("HurtTime", (short)this.aN);
/* 1345 */     par1NBTTagCompound.a("DeathTime", (short)this.aQ);
/* 1346 */     par1NBTTagCompound.a("AttackTime", (short)this.aR);
/*      */     
/* 1348 */     if (!this.bf.isEmpty()) {
/*      */       
/* 1350 */       at var2 = new at();
/* 1351 */       Iterator<jj> var3 = this.bf.values().iterator();
/*      */       
/* 1353 */       while (var3.hasNext()) {
/*      */         
/* 1355 */         jj var4 = var3.next();
/* 1356 */         an var5 = new an();
/* 1357 */         var5.a("Id", (byte)var4.a());
/* 1358 */         var5.a("Amplifier", (byte)var4.c());
/* 1359 */         var5.a("Duration", var4.b());
/* 1360 */         var2.a((ay)var5);
/*      */       } 
/*      */       
/* 1363 */       par1NBTTagCompound.a("ActiveEffects", (ay)var2);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(an par1NBTTagCompound) {
/* 1372 */     if (this.aK < -32768)
/*      */     {
/* 1374 */       this.aK = -32768;
/*      */     }
/*      */     
/* 1377 */     this.aK = par1NBTTagCompound.d("Health");
/*      */     
/* 1379 */     if (!par1NBTTagCompound.b("Health"))
/*      */     {
/* 1381 */       this.aK = aM();
/*      */     }
/*      */     
/* 1384 */     this.aN = par1NBTTagCompound.d("HurtTime");
/* 1385 */     this.aQ = par1NBTTagCompound.d("DeathTime");
/* 1386 */     this.aR = par1NBTTagCompound.d("AttackTime");
/*      */     
/* 1388 */     if (par1NBTTagCompound.b("ActiveEffects")) {
/*      */       
/* 1390 */       at var2 = par1NBTTagCompound.m("ActiveEffects");
/*      */       
/* 1392 */       for (int var3 = 0; var3 < var2.c(); var3++) {
/*      */         
/* 1394 */         an var4 = (an)var2.b(var3);
/* 1395 */         byte var5 = var4.c("Id");
/* 1396 */         byte var6 = var4.c("Amplifier");
/* 1397 */         int var7 = var4.e("Duration");
/* 1398 */         this.bf.put(Integer.valueOf(var5), new jj(var5, var7, var6));
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean S() {
/* 1408 */     return (!this.L && this.aK > 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean aU() {
/* 1413 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void f(float par1) {
/* 1418 */     this.bs = par1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void d(boolean par1) {
/* 1423 */     this.bu = par1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void d() {
/* 1432 */     if (this.bE > 0)
/*      */     {
/* 1434 */       this.bE--;
/*      */     }
/*      */     
/* 1437 */     if (this.bi > 0) {
/*      */       
/* 1439 */       double var1 = this.t + (this.bj - this.t) / this.bi;
/* 1440 */       double var3 = this.u + (this.bk - this.u) / this.bi;
/* 1441 */       double var5 = this.v + (this.bl - this.v) / this.bi;
/* 1442 */       double var7 = ih.g(this.bm - this.z);
/* 1443 */       this.z = (float)(this.z + var7 / this.bi);
/* 1444 */       this.A = (float)(this.A + (this.bn - this.A) / this.bi);
/* 1445 */       this.bi--;
/* 1446 */       b(var1, var3, var5);
/* 1447 */       b(this.z, this.A);
/*      */     } 
/*      */     
/* 1450 */     if (Math.abs(this.w) < 0.005D)
/*      */     {
/* 1452 */       this.w = 0.0D;
/*      */     }
/*      */     
/* 1455 */     if (Math.abs(this.x) < 0.005D)
/*      */     {
/* 1457 */       this.x = 0.0D;
/*      */     }
/*      */     
/* 1460 */     if (Math.abs(this.y) < 0.005D)
/*      */     {
/* 1462 */       this.y = 0.0D;
/*      */     }
/*      */     
/* 1465 */     this.p.F.a("ai");
/*      */     
/* 1467 */     if (aX()) {
/*      */       
/* 1469 */       this.bu = false;
/* 1470 */       this.br = 0.0F;
/* 1471 */       this.bs = 0.0F;
/* 1472 */       this.bt = 0.0F;
/*      */     }
/* 1474 */     else if (aW()) {
/*      */       
/* 1476 */       if (aV()) {
/*      */         
/* 1478 */         this.p.F.a("newAi");
/* 1479 */         bc();
/* 1480 */         this.p.F.b();
/*      */       }
/*      */       else {
/*      */         
/* 1484 */         this.p.F.a("oldAi");
/* 1485 */         be();
/* 1486 */         this.p.F.b();
/* 1487 */         this.as = this.z;
/*      */       } 
/*      */     } 
/*      */     
/* 1491 */     this.p.F.b();
/* 1492 */     this.p.F.a("jump");
/*      */     
/* 1494 */     if (this.bu) {
/*      */       
/* 1496 */       if (!H() && !J()) {
/*      */         
/* 1498 */         if (this.E && this.bE == 0)
/*      */         {
/* 1500 */           aZ();
/* 1501 */           this.bE = 10;
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/* 1506 */         this.x += 0.03999999910593033D;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 1511 */       this.bE = 0;
/*      */     } 
/*      */     
/* 1514 */     this.p.F.b();
/* 1515 */     this.p.F.a("travel");
/* 1516 */     this.br *= 0.98F;
/* 1517 */     this.bs *= 0.98F;
/* 1518 */     this.bt *= 0.9F;
/* 1519 */     float var9 = this.aG;
/* 1520 */     this.aG *= bs();
/* 1521 */     e(this.br, this.bs);
/* 1522 */     this.aG = var9;
/* 1523 */     this.p.F.b();
/* 1524 */     this.p.F.a("push");
/*      */     
/* 1526 */     if (!this.p.K) {
/*      */       
/* 1528 */       List var2 = this.p.b(this, this.D.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
/*      */       
/* 1530 */       if (var2 != null && !var2.isEmpty()) {
/*      */         
/* 1532 */         Iterator<jn> var10 = var2.iterator();
/*      */         
/* 1534 */         while (var10.hasNext()) {
/*      */           
/* 1536 */           jn var4 = var10.next();
/*      */           
/* 1538 */           if (var4.M())
/*      */           {
/* 1540 */             var4.f(this);
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1546 */     this.p.F.b();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean aV() {
/* 1554 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean aW() {
/* 1562 */     return !this.p.K;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean aX() {
/* 1570 */     return (this.aK <= 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean aY() {
/* 1575 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void aZ() {
/* 1583 */     this.x = 0.41999998688697815D;
/*      */     
/* 1585 */     if (a(ji.j))
/*      */     {
/* 1587 */       this.x += ((b(ji.j).c() + 1) * 0.1F);
/*      */     }
/*      */     
/* 1590 */     if (ag()) {
/*      */       
/* 1592 */       float var1 = this.z * 0.017453292F;
/* 1593 */       this.w -= (ih.a(var1) * 0.2F);
/* 1594 */       this.y += (ih.b(var1) * 0.2F);
/*      */     } 
/*      */     
/* 1597 */     this.al = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean ba() {
/* 1605 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void bb() {
/* 1613 */     og var1 = this.p.a(this, -1.0D);
/*      */     
/* 1615 */     if (var1 != null) {
/*      */       
/* 1617 */       double var2 = var1.t - this.t;
/* 1618 */       double var4 = var1.u - this.u;
/* 1619 */       double var6 = var1.v - this.v;
/* 1620 */       double var8 = var2 * var2 + var4 * var4 + var6 * var6;
/*      */       
/* 1622 */       if (ba() && var8 > 16384.0D)
/*      */       {
/* 1624 */         y();
/*      */       }
/*      */       
/* 1627 */       if (this.bq > 600 && this.Z.nextInt(800) == 0 && var8 > 1024.0D && ba()) {
/*      */         
/* 1629 */         y();
/*      */       }
/* 1631 */       else if (var8 < 1024.0D) {
/*      */         
/* 1633 */         this.bq = 0;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void bc() {
/* 1640 */     this.bq++;
/* 1641 */     this.p.F.a("checkDespawn");
/* 1642 */     bb();
/* 1643 */     this.p.F.b();
/* 1644 */     this.p.F.a("sensing");
/* 1645 */     this.bA.a();
/* 1646 */     this.p.F.b();
/* 1647 */     this.p.F.a("targetSelector");
/* 1648 */     this.bh.a();
/* 1649 */     this.p.F.b();
/* 1650 */     this.p.F.a("goalSelector");
/* 1651 */     this.bg.a();
/* 1652 */     this.p.F.b();
/* 1653 */     this.p.F.a("navigation");
/* 1654 */     this.by.e();
/* 1655 */     this.p.F.b();
/* 1656 */     this.p.F.a("mob tick");
/* 1657 */     bd();
/* 1658 */     this.p.F.b();
/* 1659 */     this.p.F.a("controls");
/* 1660 */     this.p.F.a("move");
/* 1661 */     this.h.c();
/* 1662 */     this.p.F.c("look");
/* 1663 */     this.g.a();
/* 1664 */     this.p.F.c("jump");
/* 1665 */     this.i.b();
/* 1666 */     this.p.F.b();
/* 1667 */     this.p.F.b();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void bd() {}
/*      */ 
/*      */ 
/*      */   
/*      */   protected void be() {
/* 1677 */     this.bq++;
/* 1678 */     bb();
/* 1679 */     this.br = 0.0F;
/* 1680 */     this.bs = 0.0F;
/* 1681 */     float var1 = 8.0F;
/*      */     
/* 1683 */     if (this.Z.nextFloat() < 0.02F) {
/*      */       
/* 1685 */       og var2 = this.p.a(this, var1);
/*      */       
/* 1687 */       if (var2 != null) {
/*      */         
/* 1689 */         this.bF = (jn)var2;
/* 1690 */         this.bx = 10 + this.Z.nextInt(20);
/*      */       }
/*      */       else {
/*      */         
/* 1694 */         this.bt = (this.Z.nextFloat() - 0.5F) * 20.0F;
/*      */       } 
/*      */     } 
/*      */     
/* 1698 */     if (this.bF != null) {
/*      */       
/* 1700 */       a(this.bF, 10.0F, bf());
/*      */       
/* 1702 */       if (this.bx-- <= 0 || this.bF.L || this.bF.e(this) > (var1 * var1))
/*      */       {
/* 1704 */         this.bF = null;
/*      */       }
/*      */     }
/*      */     else {
/*      */       
/* 1709 */       if (this.Z.nextFloat() < 0.05F)
/*      */       {
/* 1711 */         this.bt = (this.Z.nextFloat() - 0.5F) * 20.0F;
/*      */       }
/*      */       
/* 1714 */       this.z += this.bt;
/* 1715 */       this.A = this.bv;
/*      */     } 
/*      */     
/* 1718 */     boolean var4 = H();
/* 1719 */     boolean var3 = J();
/*      */     
/* 1721 */     if (var4 || var3)
/*      */     {
/* 1723 */       this.bu = (this.Z.nextFloat() < 0.8F);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int bf() {
/* 1733 */     return 40;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(jn par1Entity, float par2, float par3) {
/* 1741 */     double var8, var4 = par1Entity.t - this.t;
/* 1742 */     double var6 = par1Entity.v - this.v;
/*      */ 
/*      */     
/* 1745 */     if (par1Entity instanceof jw) {
/*      */       
/* 1747 */       jw var10 = (jw)par1Entity;
/* 1748 */       var8 = this.u + e() - var10.u + var10.e();
/*      */     }
/*      */     else {
/*      */       
/* 1752 */       var8 = (par1Entity.D.b + par1Entity.D.e) / 2.0D - this.u + e();
/*      */     } 
/*      */     
/* 1755 */     double var14 = ih.a(var4 * var4 + var6 * var6);
/* 1756 */     float var12 = (float)(Math.atan2(var6, var4) * 180.0D / Math.PI) - 90.0F;
/* 1757 */     float var13 = (float)-(Math.atan2(var8, var14) * 180.0D / Math.PI);
/* 1758 */     this.A = -b(this.A, var13, par3);
/* 1759 */     this.z = b(this.z, var12, par2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private float b(float par1, float par2, float par3) {
/* 1767 */     float var4 = ih.g(par2 - par1);
/*      */     
/* 1769 */     if (var4 > par3)
/*      */     {
/* 1771 */       var4 = par3;
/*      */     }
/*      */     
/* 1774 */     if (var4 < -par3)
/*      */     {
/* 1776 */       var4 = -par3;
/*      */     }
/*      */     
/* 1779 */     return par1 + var4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean bi() {
/* 1787 */     return (this.p.b(this.D) && this.p.a(this, this.D).isEmpty() && !this.p.d(this.D));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void C() {
/* 1795 */     a(je.i, 4);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float g(float par1) {
/* 1803 */     float var2 = this.aJ - this.aI;
/*      */     
/* 1805 */     if (var2 < 0.0F)
/*      */     {
/* 1807 */       var2++;
/*      */     }
/*      */     
/* 1810 */     return this.aI + var2 * par1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ajs h(float par1) {
/* 1818 */     if (par1 == 1.0F)
/*      */     {
/* 1820 */       return ajs.a().a(this.t, this.u, this.v);
/*      */     }
/*      */ 
/*      */     
/* 1824 */     double var2 = this.q + (this.t - this.q) * par1;
/* 1825 */     double var4 = this.r + (this.u - this.r) * par1;
/* 1826 */     double var6 = this.s + (this.v - this.s) * par1;
/* 1827 */     return ajs.a().a(var2, var4, var6);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ajs Z() {
/* 1836 */     return i(1.0F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ajs i(float par1) {
/* 1849 */     if (par1 == 1.0F) {
/*      */       
/* 1851 */       float f1 = ih.b(-this.z * 0.017453292F - 3.1415927F);
/* 1852 */       float f2 = ih.a(-this.z * 0.017453292F - 3.1415927F);
/* 1853 */       float f3 = -ih.b(-this.A * 0.017453292F);
/* 1854 */       float f4 = ih.a(-this.A * 0.017453292F);
/* 1855 */       return ajs.a().a((f2 * f3), f4, (f1 * f3));
/*      */     } 
/*      */ 
/*      */     
/* 1859 */     float var2 = this.C + (this.A - this.C) * par1;
/* 1860 */     float var3 = this.B + (this.z - this.B) * par1;
/* 1861 */     float var4 = ih.b(-var3 * 0.017453292F - 3.1415927F);
/* 1862 */     float var5 = ih.a(-var3 * 0.017453292F - 3.1415927F);
/* 1863 */     float var6 = -ih.b(-var2 * 0.017453292F);
/* 1864 */     float var7 = ih.a(-var2 * 0.017453292F);
/* 1865 */     return ajs.a().a((var5 * var6), var7, (var4 * var6));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float bj() {
/* 1874 */     return 1.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ajq a(double par1, float par3) {
/* 1882 */     ajs var4 = h(par3);
/* 1883 */     ajs var5 = i(par3);
/* 1884 */     ajs var6 = var4.c(var5.a * par1, var5.b * par1, var5.c * par1);
/* 1885 */     return this.p.a(var4, var6);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int bl() {
/* 1893 */     return 4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public rj bm() {
/* 1901 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(byte par1) {
/* 1906 */     if (par1 == 2) {
/*      */       
/* 1908 */       this.aZ = 1.5F;
/* 1909 */       this.ad = this.an;
/* 1910 */       this.aN = this.aO = 10;
/* 1911 */       this.aP = 0.0F;
/* 1912 */       this.p.a(this, aR(), aP(), (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F);
/* 1913 */       a(je.j, 0);
/*      */     }
/* 1915 */     else if (par1 == 3) {
/*      */       
/* 1917 */       this.p.a(this, aS(), aP(), (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F);
/* 1918 */       this.aK = 0;
/* 1919 */       a(je.j);
/*      */     }
/*      */     else {
/*      */       
/* 1923 */       super.a(par1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean bn() {
/* 1932 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int b(rj par1ItemStack, int par2) {
/* 1940 */     return par1ItemStack.c();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void bo() {
/* 1945 */     Iterator<Integer> var1 = this.bf.keySet().iterator();
/*      */     
/* 1947 */     while (var1.hasNext()) {
/*      */       
/* 1949 */       Integer var2 = var1.next();
/* 1950 */       jj var3 = (jj)this.bf.get(var2);
/*      */       
/* 1952 */       if (!var3.a(this) && !this.p.K) {
/*      */         
/* 1954 */         var1.remove();
/* 1955 */         c(var3);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1961 */     if (this.e) {
/*      */       
/* 1963 */       if (!this.p.K)
/*      */       {
/* 1965 */         if (this.bf.isEmpty()) {
/*      */           
/* 1967 */           this.af.b(8, Integer.valueOf(0));
/*      */         }
/*      */         else {
/*      */           
/* 1971 */           int var9 = sr.a(this.bf.values());
/* 1972 */           this.af.b(8, Integer.valueOf(var9));
/*      */         } 
/*      */       }
/*      */       
/* 1976 */       this.e = false;
/*      */     } 
/*      */     
/* 1979 */     if (this.Z.nextBoolean()) {
/*      */       
/* 1981 */       int var9 = this.af.c(8);
/*      */       
/* 1983 */       if (var9 > 0) {
/*      */         
/* 1985 */         double var10 = (var9 >> 16 & 0xFF) / 255.0D;
/* 1986 */         double var5 = (var9 >> 8 & 0xFF) / 255.0D;
/* 1987 */         double var7 = (var9 >> 0 & 0xFF) / 255.0D;
/* 1988 */         this.p.a("mobSpell", this.t + (this.Z.nextDouble() - 0.5D) * this.N, this.u + this.Z.nextDouble() * this.O - this.M, this.v + (this.Z.nextDouble() - 0.5D) * this.N, var10, var5, var7);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void bp() {
/* 1995 */     Iterator<Integer> var1 = this.bf.keySet().iterator();
/*      */     
/* 1997 */     while (var1.hasNext()) {
/*      */       
/* 1999 */       Integer var2 = var1.next();
/* 2000 */       jj var3 = (jj)this.bf.get(var2);
/*      */       
/* 2002 */       if (!this.p.K) {
/*      */         
/* 2004 */         var1.remove();
/* 2005 */         c(var3);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public Collection bq() {
/* 2012 */     return this.bf.values();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(ji par1Potion) {
/* 2017 */     return this.bf.containsKey(Integer.valueOf(par1Potion.H));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public jj b(ji par1Potion) {
/* 2025 */     return (jj)this.bf.get(Integer.valueOf(par1Potion.H));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void d(jj par1PotionEffect) {
/* 2033 */     if (e(par1PotionEffect))
/*      */     {
/* 2035 */       if (this.bf.containsKey(Integer.valueOf(par1PotionEffect.a()))) {
/*      */         
/* 2037 */         ((jj)this.bf.get(Integer.valueOf(par1PotionEffect.a()))).a(par1PotionEffect);
/* 2038 */         b((jj)this.bf.get(Integer.valueOf(par1PotionEffect.a())));
/*      */       }
/*      */       else {
/*      */         
/* 2042 */         this.bf.put(Integer.valueOf(par1PotionEffect.a()), par1PotionEffect);
/* 2043 */         a(par1PotionEffect);
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean e(jj par1PotionEffect) {
/* 2050 */     if (bt() == jy.b) {
/*      */       
/* 2052 */       int var2 = par1PotionEffect.a();
/*      */       
/* 2054 */       if (var2 == ji.l.H || var2 == ji.u.H)
/*      */       {
/* 2056 */         return false;
/*      */       }
/*      */     } 
/*      */     
/* 2060 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean br() {
/* 2068 */     return (bt() == jy.b);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void n(int par1) {
/* 2076 */     this.bf.remove(Integer.valueOf(par1));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(jj par1PotionEffect) {
/* 2081 */     this.e = true;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void b(jj par1PotionEffect) {
/* 2086 */     this.e = true;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void c(jj par1PotionEffect) {
/* 2091 */     this.e = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float bs() {
/* 2100 */     float var1 = 1.0F;
/*      */     
/* 2102 */     if (a(ji.c))
/*      */     {
/* 2104 */       var1 *= 1.0F + 0.2F * (b(ji.c).c() + 1);
/*      */     }
/*      */     
/* 2107 */     if (a(ji.d))
/*      */     {
/* 2109 */       var1 *= 1.0F - 0.15F * (b(ji.d).c() + 1);
/*      */     }
/*      */     
/* 2112 */     return var1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(double par1, double par3, double par5) {
/* 2120 */     b(par1, par3, par5, this.z, this.A);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean g_() {
/* 2128 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public jy bt() {
/* 2136 */     return jy.a;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(rj par1ItemStack) {
/* 2144 */     this.p.a(this, "random.break", 0.8F, 0.8F + this.p.v.nextFloat() * 0.4F);
/*      */     
/* 2146 */     for (int var2 = 0; var2 < 5; var2++) {
/*      */       
/* 2148 */       ajs var3 = ajs.a().a((this.Z.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
/* 2149 */       var3.a(-this.A * 3.1415927F / 180.0F);
/* 2150 */       var3.b(-this.z * 3.1415927F / 180.0F);
/* 2151 */       ajs var4 = ajs.a().a((this.Z.nextFloat() - 0.5D) * 0.3D, -this.Z.nextFloat() * 0.6D - 0.3D, 0.6D);
/* 2152 */       var4.a(-this.A * 3.1415927F / 180.0F);
/* 2153 */       var4.b(-this.z * 3.1415927F / 180.0F);
/* 2154 */       var4 = var4.c(this.t, this.u + e(), this.v);
/* 2155 */       this.p.a("iconcrack_" + (par1ItemStack.b()).bT, var4.a, var4.b, var4.c, var3.a, var3.b + 0.05D, var3.c);
/*      */     } 
/*      */   }
/*      */ }


/* Location:              C:\Users\Shadow\Downloads\SkeletonsPlus\!\jw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
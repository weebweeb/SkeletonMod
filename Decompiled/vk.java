/*     */ import java.awt.Color;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class vk
/*     */ {
/*  11 */   public static final vk[] a = new vk[256];
/*  12 */   public static final vk b = (new vy(0)).b(112).a("Ocean").b(-1.0F, 0.4F);
/*  13 */   public static final vk c = (new vz(1)).b(9286496).a("Plains").a(0.8F, 0.4F);
/*  14 */   public static final vk d = (new vq(2)).b(16421912).a("Desert").m().a(2.0F, 0.0F).b(0.1F, 0.2F);
/*  15 */   public static final vk e = (new vr(3)).b(6316128).a("Extreme Hills").b(0.3F, 1.5F).a(0.2F, 0.3F);
/*  16 */   public static final vk f = (new vt(4)).b(353825).a("Forest").a(5159473).a(0.7F, 0.8F);
/*  17 */   public static final vk g = (new wd(5)).b(747097).a("Taiga").a(5159473).b().a(0.05F, 0.8F).b(0.1F, 0.4F);
/*  18 */   public static final vk h = (new wc(6)).b(522674).a("Swampland").a(9154376).b(-0.2F, 0.1F).a(0.8F, 0.9F);
/*  19 */   public static final vk i = (new wb(7)).b(255).a("River").b(-0.5F, 0.0F);
/*  20 */   public static final vk j = (new vu(8)).b(16711680).a("Hell").m().a(2.0F, 0.0F);
/*  21 */   public static final vk Skeletonrealm = (new BiomeGenSkullrealm(91)).a("Skelerealm").a(0.0F, 0.8F);
/*     */ 
/*     */   
/*  24 */   public static final vk k = (new we(9)).b(8421631).a("Sky").m();
/*  25 */   public static final vk l = (new vy(10)).b(9474208).a("FrozenOcean").b().b(-1.0F, 0.5F).a(0.0F, 0.5F);
/*  26 */   public static final vk m = (new wb(11)).b(10526975).a("FrozenRiver").b().b(-0.5F, 0.0F).a(0.0F, 0.5F);
/*  27 */   public static final vk n = (new vv(12)).b(16777215).a("Ice Plains").b().a(0.0F, 0.5F);
/*  28 */   public static final vk o = (new vv(13)).b(10526880).a("Ice Mountains").b().b(0.3F, 1.3F).a(0.0F, 0.5F);
/*  29 */   public static final vk p = (new vx(14)).b(16711935).a("MushroomIsland").a(0.9F, 1.0F).b(0.2F, 1.0F);
/*  30 */   public static final vk q = (new vx(15)).b(10486015).a("MushroomIslandShore").a(0.9F, 1.0F).b(-1.0F, 0.1F);
/*     */ 
/*     */   
/*  33 */   public static final vk r = (new vj(16)).b(16440917).a("Beach").a(0.8F, 0.4F).b(0.0F, 0.1F);
/*     */ 
/*     */   
/*  36 */   public static final vk s = (new vq(17)).b(13786898).a("DesertHills").m().a(2.0F, 0.0F).b(0.3F, 0.8F);
/*     */ 
/*     */   
/*  39 */   public static final vk t = (new vt(18)).b(2250012).a("ForestHills").a(5159473).a(0.7F, 0.8F).b(0.3F, 0.7F);
/*     */ 
/*     */   
/*  42 */   public static final vk u = (new wd(19)).b(1456435).a("TaigaHills").b().a(5159473).a(0.05F, 0.8F).b(0.3F, 0.8F);
/*     */ 
/*     */   
/*  45 */   public static final vk v = (new vr(20)).b(7501978).a("Extreme Hills Edge").b(0.2F, 0.8F).a(0.2F, 0.3F);
/*     */ 
/*     */   
/*  48 */   public static final vk w = (new vw(21)).b(5470985).a("Jungle").a(5470985).a(1.2F, 0.9F).b(0.2F, 0.4F);
/*  49 */   public static final vk x = (new vw(22)).b(2900485).a("JungleHills").a(5470985).a(1.2F, 0.9F).b(1.8F, 0.5F);
/*     */ 
/*     */ 
/*     */   
/*     */   public String y;
/*     */ 
/*     */   
/*     */   public int z;
/*     */ 
/*     */   
/*     */   public byte A;
/*     */ 
/*     */   
/*     */   public byte B;
/*     */ 
/*     */   
/*     */   public int C;
/*     */ 
/*     */   
/*     */   public float D;
/*     */ 
/*     */   
/*     */   public float E;
/*     */ 
/*     */   
/*     */   public float F;
/*     */ 
/*     */   
/*     */   public float G;
/*     */ 
/*     */   
/*     */   public int H;
/*     */ 
/*     */   
/*     */   public vo I;
/*     */ 
/*     */   
/*     */   protected List J;
/*     */ 
/*     */   
/*     */   protected List K;
/*     */ 
/*     */   
/*     */   protected List L;
/*     */ 
/*     */   
/*     */   private boolean R;
/*     */ 
/*     */   
/*     */   private boolean S;
/*     */ 
/*     */   
/*     */   public final int M;
/*     */ 
/*     */   
/*     */   protected yu N;
/*     */ 
/*     */   
/*     */   protected xq O;
/*     */ 
/*     */   
/*     */   protected xr P;
/*     */ 
/*     */   
/*     */   protected ys Q;
/*     */ 
/*     */ 
/*     */   
/*     */   protected vk(int par1) {
/* 118 */     this.A = (byte)aig.u.ca;
/* 119 */     this.B = (byte)aig.v.ca;
/* 120 */     this.C = 5169201;
/* 121 */     this.D = 0.1F;
/* 122 */     this.E = 0.3F;
/* 123 */     this.F = 0.5F;
/* 124 */     this.G = 0.5F;
/* 125 */     this.H = 16777215;
/* 126 */     this.J = new ArrayList();
/* 127 */     this.K = new ArrayList();
/* 128 */     this.L = new ArrayList();
/* 129 */     this.S = true;
/* 130 */     this.N = new yu(false);
/* 131 */     this.O = new xq(false);
/* 132 */     this.P = new xr(false);
/* 133 */     this.Q = new ys();
/* 134 */     this.M = par1;
/* 135 */     a[par1] = this;
/* 136 */     this.I = a();
/* 137 */     this.K.add(new vl(mu.class, 12, 4, 4));
/* 138 */     this.K.add(new vl(mt.class, 10, 4, 4));
/* 139 */     this.K.add(new vl(mo.class, 10, 4, 4));
/* 140 */     this.K.add(new vl(mp.class, 8, 4, 4));
/* 141 */     this.J.add(new vl(nz.class, 10, 4, 4));
/* 142 */     this.J.add(new vl(oa.class, 10, 4, 4));
/* 143 */     this.J.add(new vl(nx.class, 10, 4, 4));
/* 144 */     this.J.add(new vl(no.class, 10, 4, 4));
/* 145 */     this.J.add(new vl(ny.class, 10, 4, 4));
/* 146 */     this.J.add(new vl(np.class, 1, 1, 4));
/* 147 */     this.L.add(new vl(mw.class, 10, 4, 4));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected vo a() {
/* 155 */     return new vo(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private vk a(float par1, float par2) {
/* 163 */     if (par1 > 0.1F && par1 < 0.2F)
/*     */     {
/* 165 */       throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
/*     */     }
/*     */ 
/*     */     
/* 169 */     this.F = par1;
/* 170 */     this.G = par2;
/* 171 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private vk b(float par1, float par2) {
/* 180 */     this.D = par1;
/* 181 */     this.E = par2;
/* 182 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private vk m() {
/* 190 */     this.S = false;
/* 191 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public xy a(Random par1Random) {
/* 199 */     return (par1Random.nextInt(10) == 0) ? (xy)this.O : (xy)this.N;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public xy b(Random par1Random) {
/* 207 */     return (xy)new yt(aig.X.ca, 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected vk b() {
/* 215 */     this.R = true;
/* 216 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected vk a(String par1Str) {
/* 221 */     this.y = par1Str;
/* 222 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected vk a(int par1) {
/* 227 */     this.C = par1;
/* 228 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected vk b(int par1) {
/* 233 */     this.z = par1;
/* 234 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(float par1) {
/* 242 */     par1 /= 3.0F;
/*     */     
/* 244 */     if (par1 < -1.0F)
/*     */     {
/* 246 */       par1 = -1.0F;
/*     */     }
/*     */     
/* 249 */     if (par1 > 1.0F)
/*     */     {
/* 251 */       par1 = 1.0F;
/*     */     }
/*     */     
/* 254 */     return Color.getHSBColor(0.62222224F - par1 * 0.05F, 0.5F + par1 * 0.1F, 1.0F).getRGB();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List a(jx par1EnumCreatureType) {
/* 262 */     return (par1EnumCreatureType == jx.a) ? this.J : ((par1EnumCreatureType == jx.b) ? this.K : ((par1EnumCreatureType == jx.c) ? this.L : null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 270 */     return this.R;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 278 */     return this.R ? false : this.S;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean e() {
/* 286 */     return (this.G > 0.85F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float f() {
/* 294 */     return 0.1F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int g() {
/* 302 */     return (int)(this.G * 65536.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int h() {
/* 310 */     return (int)(this.F * 65536.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float i() {
/* 318 */     return this.G;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float j() {
/* 326 */     return this.F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(up par1World, Random par2Random, int par3, int par4) {
/* 331 */     this.I.a(par1World, par2Random, par3, par4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int k() {
/* 339 */     double var1 = ih.a(j(), 0.0F, 1.0F);
/* 340 */     double var3 = ih.a(i(), 0.0F, 1.0F);
/* 341 */     return uo.a(var1, var3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int l() {
/* 349 */     double var1 = ih.a(j(), 0.0F, 1.0F);
/* 350 */     double var3 = ih.a(i(), 0.0F, 1.0F);
/* 351 */     return un.a(var1, var3);
/*     */   }
/*     */ }


/* Location:              C:\Users\Shadow\Downloads\SkeletonsPlus\!\vk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
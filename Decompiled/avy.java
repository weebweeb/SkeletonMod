/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class avy
/*     */ {
/*  11 */   private Map o = new HashMap<Object, Object>();
/*     */ 
/*     */   
/*  14 */   public static avy a = new avy();
/*     */   
/*     */   private aov p;
/*     */   
/*     */   public static double b;
/*     */   
/*     */   public static double c;
/*     */   
/*     */   public static double d;
/*     */   
/*     */   public avf e;
/*     */   
/*     */   public ava f;
/*     */   
/*     */   public up g;
/*     */   
/*     */   public jw h;
/*     */   
/*     */   public float i;
/*     */   public float j;
/*     */   public anz k;
/*     */   public double l;
/*     */   public double m;
/*     */   public double n;
/*     */   
/*     */   private avy() {
/*  40 */     this.o.put(nz.class, new aww());
/*  41 */     this.o.put(nn.class, new aww());
/*  42 */     this.o.put(mt.class, new awq((art)new arv(), (art)new arv(0.5F), 0.7F));
/*  43 */     this.o.put(mu.class, new aws((art)new arz(), (art)new ary(), 0.7F));
/*  44 */     this.o.put(mp.class, new avs((art)new arl(), 0.7F));
/*  45 */     this.o.put(mr.class, new awn((art)new arl(), 0.7F));
/*  46 */     this.o.put(mz.class, new axb((art)new ask(), 0.5F));
/*  47 */     this.o.put(mo.class, new avr((art)new ark(), 0.3F));
/*  48 */     this.o.put(ms.class, new awo((art)new aru(), 0.4F));
/*  49 */     this.o.put(nw.class, new awt());
/*  50 */     this.o.put(no.class, new avt());
/*  51 */     this.o.put(np.class, new avx());
/*  52 */     this.o.put(mv.class, new awv());
/*  53 */     this.o.put(nx.class, new awg((arp)new asc(), 0.5F));
/*  54 */     this.o.put(nm.class, new avp());
/*  55 */     this.o.put(oa.class, new awg((arp)new asl(), 0.5F));
/*  56 */     this.o.put(ny.class, new awu((art)new asd(16), (art)new asd(0), 0.25F));
/*  57 */     this.o.put(nt.class, new awj());
/*  58 */     this.o.put(og.class, new awr());
/*  59 */     this.o.put(ns.class, new awf((art)new asl(), 0.5F, 6.0F));
/*  60 */     this.o.put(nr.class, new awe());
/*  61 */     this.o.put(mw.class, new awx((art)new asg(), 0.7F));
/*  62 */     this.o.put(od.class, new axa());
/*  63 */     this.o.put(mx.class, new awz());
/*  64 */     this.o.put(jw.class, new awm((art)new arp(), 0.5F));
/*  65 */     this.o.put(nd.class, new avw());
/*  66 */     this.o.put(nc.class, new avv());
/*  67 */     this.o.put(jn.class, new avu());
/*  68 */     this.o.put(jz.class, new awp());
/*  69 */     this.o.put(oi.class, new avo());
/*  70 */     this.o.put(on.class, new awi(rh.aD.a(0)));
/*  71 */     this.o.put(oq.class, new awi(rh.bn.a(0)));
/*  72 */     this.o.put(oj.class, new awi(rh.bA.a(0)));
/*  73 */     this.o.put(op.class, new awi(rh.aP.a(0)));
/*  74 */     this.o.put(os.class, new awi(154));
/*  75 */     this.o.put(or.class, new awi(rh.bD.a(0)));
/*  76 */     this.o.put(ok.class, new awc(2.0F));
/*  77 */     this.o.put(om.class, new awc(0.5F));
/*  78 */     this.o.put(nj.class, new awh());
/*  79 */     this.o.put(ju.class, new awa());
/*  80 */     this.o.put(nl.class, new awy());
/*  81 */     this.o.put(ni.class, new awb());
/*  82 */     this.o.put(nk.class, new awl());
/*  83 */     this.o.put(nh.class, new avq());
/*  84 */     this.o.put(ol.class, new awd());
/*  85 */     this.o.put(ng.class, new awk());
/*  86 */     ModLoader.addAllRenderers(this.o);
/*  87 */     Iterator<avz> var1 = this.o.values().iterator();
/*     */     
/*  89 */     while (var1.hasNext()) {
/*     */       
/*  91 */       avz var2 = var1.next();
/*  92 */       var2.a(this);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public avz a(Class<jn> par1Class) {
/*  98 */     avz var2 = (avz)this.o.get(par1Class);
/*     */     
/* 100 */     if (var2 == null && par1Class != jn.class) {
/*     */       
/* 102 */       var2 = a(par1Class.getSuperclass());
/* 103 */       this.o.put(par1Class, var2);
/*     */     } 
/*     */     
/* 106 */     return var2;
/*     */   }
/*     */ 
/*     */   
/*     */   public avz a(jn par1Entity) {
/* 111 */     return a(par1Entity.getClass());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(up par1World, avf par2RenderEngine, aov par3FontRenderer, jw par4EntityLiving, anz par5GameSettings, float par6) {
/* 120 */     this.g = par1World;
/* 121 */     this.e = par2RenderEngine;
/* 122 */     this.k = par5GameSettings;
/* 123 */     this.h = par4EntityLiving;
/* 124 */     this.p = par3FontRenderer;
/*     */     
/* 126 */     if (par4EntityLiving.bn()) {
/*     */       
/* 128 */       int var7 = par1World.a(ih.c(par4EntityLiving.t), ih.c(par4EntityLiving.u), ih.c(par4EntityLiving.v));
/*     */       
/* 130 */       if (var7 == aig.S.ca)
/*     */       {
/* 132 */         int var8 = par1World.g(ih.c(par4EntityLiving.t), ih.c(par4EntityLiving.u), ih.c(par4EntityLiving.v));
/* 133 */         int var9 = var8 & 0x3;
/* 134 */         this.i = (var9 * 90 + 180);
/* 135 */         this.j = 0.0F;
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 140 */       this.i = par4EntityLiving.B + (par4EntityLiving.z - par4EntityLiving.B) * par6;
/* 141 */       this.j = par4EntityLiving.C + (par4EntityLiving.A - par4EntityLiving.C) * par6;
/*     */     } 
/*     */     
/* 144 */     if (par5GameSettings.P == 2)
/*     */     {
/* 146 */       this.i += 180.0F;
/*     */     }
/*     */     
/* 149 */     this.l = par4EntityLiving.S + (par4EntityLiving.t - par4EntityLiving.S) * par6;
/* 150 */     this.m = par4EntityLiving.T + (par4EntityLiving.u - par4EntityLiving.T) * par6;
/* 151 */     this.n = par4EntityLiving.U + (par4EntityLiving.v - par4EntityLiving.U) * par6;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(jn par1Entity, float par2) {
/* 159 */     double var3 = par1Entity.S + (par1Entity.t - par1Entity.S) * par2;
/* 160 */     double var5 = par1Entity.T + (par1Entity.u - par1Entity.T) * par2;
/* 161 */     double var7 = par1Entity.U + (par1Entity.v - par1Entity.U) * par2;
/* 162 */     float var9 = par1Entity.B + (par1Entity.z - par1Entity.B) * par2;
/* 163 */     int var10 = par1Entity.b(par2);
/*     */     
/* 165 */     if (par1Entity.ad())
/*     */     {
/* 167 */       var10 = 15728880;
/*     */     }
/*     */     
/* 170 */     int var11 = var10 % 65536;
/* 171 */     int var12 = var10 / 65536;
/* 172 */     ayy.a(ayy.b, var11 / 1.0F, var12 / 1.0F);
/* 173 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 174 */     a(par1Entity, var3 - b, var5 - c, var7 - d, var9, par2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(jn par1Entity, double par2, double par4, double par6, float par8, float par9) {
/* 183 */     avz var10 = a(par1Entity);
/*     */     
/* 185 */     if (var10 != null) {
/*     */       
/* 187 */       var10.a(par1Entity, par2, par4, par6, par8, par9);
/* 188 */       var10.b(par1Entity, par2, par4, par6, par8, par9);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(up par1World) {
/* 197 */     this.g = par1World;
/*     */   }
/*     */ 
/*     */   
/*     */   public double a(double par1, double par3, double par5) {
/* 202 */     double var7 = par1 - this.l;
/* 203 */     double var9 = par3 - this.m;
/* 204 */     double var11 = par5 - this.n;
/* 205 */     return var7 * var7 + var9 * var9 + var11 * var11;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aov a() {
/* 213 */     return this.p;
/*     */   }
/*     */ }


/* Location:              C:\Users\Shadow\Downloads\SkeletonsPlus\!\avy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
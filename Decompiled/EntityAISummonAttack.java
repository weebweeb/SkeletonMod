/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EntityAISummonAttack
/*     */   extends kv
/*     */ {
/*     */   up worldObj;
/*     */   jw entityHost;
/*     */   jw attackTarget;
/*  12 */   int rangedAttackTime = 0;
/*     */   float entityMoveSpeed;
/*  14 */   int field_75318_f = 0;
/*     */ 
/*     */   
/*     */   int rangedAttackID;
/*     */ 
/*     */   
/*     */   int maxRangedAttackTime;
/*     */ 
/*     */   
/*     */   public EntityAISummonAttack(jw par1EntityLiving, float par2, int par3, int par4) {
/*  24 */     this.entityHost = par1EntityLiving;
/*  25 */     this.worldObj = par1EntityLiving.p;
/*  26 */     this.entityMoveSpeed = par2;
/*  27 */     this.rangedAttackID = par3;
/*  28 */     this.maxRangedAttackTime = par4;
/*  29 */     a(3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  35 */     jw var1 = this.entityHost.az();
/*     */     
/*  37 */     if (var1 == null)
/*     */     {
/*  39 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  43 */     this.attackTarget = var1;
/*  44 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  51 */     return (a() || !this.entityHost.as().f());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  57 */     this.attackTarget = null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {
/*  63 */     double var1 = 100.0D;
/*  64 */     double var3 = this.entityHost.e(this.attackTarget.t, this.attackTarget.D.b, this.attackTarget.v);
/*  65 */     boolean var5 = this.entityHost.at().a(this.attackTarget);
/*     */     
/*  67 */     if (var5) {
/*     */       
/*  69 */       this.field_75318_f++;
/*     */     }
/*     */     else {
/*     */       
/*  73 */       this.field_75318_f = 0;
/*     */     } 
/*     */     
/*  76 */     if (var3 <= var1 && this.field_75318_f >= 20) {
/*     */       
/*  78 */       this.entityHost.as().g();
/*     */     }
/*     */     else {
/*     */       
/*  82 */       this.entityHost.as().a(this.attackTarget, this.entityMoveSpeed);
/*     */     } 
/*     */     
/*  85 */     this.entityHost.ap().a(this.attackTarget, 30.0F, 30.0F);
/*  86 */     this.rangedAttackTime = Math.max(this.rangedAttackTime - 1, 0);
/*     */     
/*  88 */     if (this.rangedAttackTime <= 0)
/*     */     {
/*  90 */       if (var3 <= var1 && var5) {
/*     */         
/*  92 */         doRangedAttack();
/*  93 */         this.rangedAttackTime = this.maxRangedAttackTime;
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void doRangedAttack() {
/* 101 */     if (this.rangedAttackID == 3) {
/*     */       
/* 103 */       nx var1 = new nx(this.worldObj);
/* 104 */       this.worldObj.a(this.entityHost, "random.bow", 1.0F, 1.0F / (this.entityHost.au().nextFloat() * 0.4F + 0.8F));
/* 105 */       this.worldObj.d((jn)var1);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Shadow\Downloads\SkeletonsPlus\!\EntityAISummonAttack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
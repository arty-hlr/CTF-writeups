package kotlin.random;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.PlatformImplementations;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;















@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000:\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\013\n\000\n\002\020\022\n\002\b\005\n\002\020\006\n\002\b\003\n\002\020\007\n\002\b\002\n\002\020\t\n\002\b\003\b'\030\000 \0302\0020\001:\002\027\030B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\004H&J\b\020\006\032\0020\007H\026J\020\020\b\032\0020\t2\006\020\n\032\0020\tH\026J$\020\b\032\0020\t2\006\020\n\032\0020\t2\b\b\002\020\013\032\0020\0042\b\b\002\020\f\032\0020\004H\026J\020\020\b\032\0020\t2\006\020\r\032\0020\004H\026J\b\020\016\032\0020\017H\026J\020\020\016\032\0020\0172\006\020\020\032\0020\017H\026J\030\020\016\032\0020\0172\006\020\021\032\0020\0172\006\020\020\032\0020\017H\026J\b\020\022\032\0020\023H\026J\b\020\024\032\0020\004H\026J\020\020\024\032\0020\0042\006\020\020\032\0020\004H\026J\030\020\024\032\0020\0042\006\020\021\032\0020\0042\006\020\020\032\0020\004H\026J\b\020\025\032\0020\026H\026J\020\020\025\032\0020\0262\006\020\020\032\0020\026H\026J\030\020\025\032\0020\0262\006\020\021\032\0020\0262\006\020\020\032\0020\026H\026¨\006\031"}, d2={"Lkotlin/random/Random;", "", "()V", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "Companion", "Default", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public abstract class Random
{
  public abstract int nextBits(int paramInt);
  
  public int nextInt()
  {
    return nextBits(32);
  }
  






  public int nextInt(int until)
  {
    return nextInt(0, until);
  }
  
  /* Error */
  public int nextInt(int from, int until)
  {
    // Byte code:
    //   0: iload_1
    //   1: iload_2
    //   2: invokestatic 27	kotlin/random/RandomKt:checkRangeBounds	(II)V
    //   5: iload_2
    //   6: iload_1
    //   7: isub
    //   8: istore_3
    //   9: iload_3
    //   10: ifgt +9 -> 19
    //   13: iload_3
    //   14: ldc 28
    //   16: if_icmpne +61 -> 77
    //   19: iload_3
    //   20: iload_3
    //   21: ineg
    //   22: iand
    //   23: iload_3
    //   24: if_icmpne +18 -> 42
    //   27: iload_3
    //   28: invokestatic 33	kotlin/random/PlatformRandomKt:fastLog2	(I)I
    //   31: istore 5
    //   33: aload_0
    //   34: iload 5
    //   36: invokevirtual 17	kotlin/random/Random:nextBits	(I)I
    //   39: goto +31 -> 70
    //   42: aload_0
    //   43: invokevirtual 35	kotlin/random/Random:nextInt	()I
    //   46: iconst_1
    //   47: iushr
    //   48: istore 6
    //   50: iload 6
    //   52: iload_3
    //   53: irem
    //   54: istore 5
    //   56: iload 6
    //   58: iload 5
    //   60: isub
    //   61: iload_3
    //   62: iconst_1
    //   63: isub
    //   64: iadd
    //   65: iflt -23 -> 42
    //   68: iload 5
    //   70: istore 4
    //   72: iload_1
    //   73: iload 4
    //   75: iadd
    //   76: ireturn
    //   77: aload_0
    //   78: invokevirtual 35	kotlin/random/Random:nextInt	()I
    //   81: istore 4
    //   83: iload_2
    //   84: iload_1
    //   85: iload 4
    //   87: istore 5
    //   89: iload 5
    //   91: if_icmple +7 -> 98
    //   94: pop
    //   95: goto +11 -> 106
    //   98: iload 5
    //   100: if_icmple +6 -> 106
    //   103: iload 4
    //   105: ireturn
    //   106: goto -29 -> 77
    // Line number table:
    //   Java source line #57	-> byte code offset #0
    //   Java source line #58	-> byte code offset #5
    //   Java source line #59	-> byte code offset #9
    //   Java source line #60	-> byte code offset #19
    //   Java source line #61	-> byte code offset #27
    //   Java source line #62	-> byte code offset #33
    //   Java source line #64	-> byte code offset #42
    //   Java source line #65	-> byte code offset #42
    //   Java source line #66	-> byte code offset #42
    //   Java source line #67	-> byte code offset #50
    //   Java source line #68	-> byte code offset #56
    //   Java source line #69	-> byte code offset #68
    //   Java source line #60	-> byte code offset #70
    //   Java source line #71	-> byte code offset #72
    //   Java source line #73	-> byte code offset #77
    //   Java source line #74	-> byte code offset #77
    //   Java source line #75	-> byte code offset #83
    //   Java source line #73	-> byte code offset #106
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	Random
    //   0	109	1	from	int
    //   0	109	2	until	int
    //   9	100	3	n	int
    //   72	5	4	rnd	int
    //   83	23	4	rnd	int
    //   33	6	5	bitCount	int
    //   42	28	5	v	int
    //   50	18	6	bits	int
  }
  
  public long nextLong()
  {
    return (nextInt() << 32) + nextInt();
  }
  






  public long nextLong(long until)
  {
    return nextLong(0L, until);
  }
  
  /* Error */
  public long nextLong(long from, long until)
  {
    // Byte code:
    //   0: lload_1
    //   1: lload_3
    //   2: invokestatic 50	kotlin/random/RandomKt:checkRangeBounds	(JJ)V
    //   5: lload_3
    //   6: lload_1
    //   7: lsub
    //   8: lstore 5
    //   10: lload 5
    //   12: lconst_0
    //   13: lcmp
    //   14: ifle +139 -> 153
    //   17: lload 5
    //   19: lload 5
    //   21: lneg
    //   22: land
    //   23: lload 5
    //   25: lcmp
    //   26: ifne +88 -> 114
    //   29: lload 5
    //   31: l2i
    //   32: istore 9
    //   34: lload 5
    //   36: bipush 32
    //   38: lushr
    //   39: l2i
    //   40: istore 10
    //   42: iload 9
    //   44: ifeq +24 -> 68
    //   47: iload 9
    //   49: invokestatic 33	kotlin/random/PlatformRandomKt:fastLog2	(I)I
    //   52: istore 11
    //   54: aload_0
    //   55: iload 11
    //   57: invokevirtual 17	kotlin/random/Random:nextBits	(I)I
    //   60: i2l
    //   61: ldc2_w 51
    //   64: land
    //   65: goto +44 -> 109
    //   68: iload 10
    //   70: iconst_1
    //   71: if_icmpne +15 -> 86
    //   74: aload_0
    //   75: invokevirtual 35	kotlin/random/Random:nextInt	()I
    //   78: i2l
    //   79: ldc2_w 51
    //   82: land
    //   83: goto +26 -> 109
    //   86: iload 10
    //   88: invokestatic 33	kotlin/random/PlatformRandomKt:fastLog2	(I)I
    //   91: istore 11
    //   93: aload_0
    //   94: iload 11
    //   96: invokevirtual 17	kotlin/random/Random:nextBits	(I)I
    //   99: i2l
    //   100: bipush 32
    //   102: lshl
    //   103: aload_0
    //   104: invokevirtual 35	kotlin/random/Random:nextInt	()I
    //   107: i2l
    //   108: ladd
    //   109: lstore 7
    //   111: goto +37 -> 148
    //   114: aload_0
    //   115: invokevirtual 54	kotlin/random/Random:nextLong	()J
    //   118: iconst_1
    //   119: lushr
    //   120: lstore 11
    //   122: lload 11
    //   124: lload 5
    //   126: lrem
    //   127: lstore 9
    //   129: lload 11
    //   131: lload 9
    //   133: lsub
    //   134: lload 5
    //   136: lconst_1
    //   137: lsub
    //   138: ladd
    //   139: lconst_0
    //   140: lcmp
    //   141: iflt -27 -> 114
    //   144: lload 9
    //   146: lstore 7
    //   148: lload_1
    //   149: lload 7
    //   151: ladd
    //   152: lreturn
    //   153: aload_0
    //   154: invokevirtual 54	kotlin/random/Random:nextLong	()J
    //   157: lstore 7
    //   159: lload_3
    //   160: lload_1
    //   161: lload 7
    //   163: lstore 9
    //   165: lload 9
    //   167: lcmp
    //   168: ifle +7 -> 175
    //   171: pop2
    //   172: goto +12 -> 184
    //   175: lload 9
    //   177: lcmp
    //   178: ifle +6 -> 184
    //   181: lload 7
    //   183: lreturn
    //   184: goto -31 -> 153
    // Line number table:
    //   Java source line #106	-> byte code offset #0
    //   Java source line #107	-> byte code offset #5
    //   Java source line #108	-> byte code offset #10
    //   Java source line #109	-> byte code offset #17
    //   Java source line #110	-> byte code offset #17
    //   Java source line #111	-> byte code offset #29
    //   Java source line #112	-> byte code offset #34
    //   Java source line #113	-> byte code offset #42
    //   Java source line #114	-> byte code offset #42
    //   Java source line #115	-> byte code offset #47
    //   Java source line #117	-> byte code offset #54
    //   Java source line #119	-> byte code offset #68
    //   Java source line #121	-> byte code offset #74
    //   Java source line #123	-> byte code offset #86
    //   Java source line #124	-> byte code offset #93
    //   Java source line #113	-> byte code offset #109
    //   Java source line #128	-> byte code offset #114
    //   Java source line #129	-> byte code offset #114
    //   Java source line #130	-> byte code offset #114
    //   Java source line #131	-> byte code offset #122
    //   Java source line #132	-> byte code offset #129
    //   Java source line #133	-> byte code offset #144
    //   Java source line #134	-> byte code offset #148
    //   Java source line #135	-> byte code offset #148
    //   Java source line #137	-> byte code offset #153
    //   Java source line #138	-> byte code offset #153
    //   Java source line #139	-> byte code offset #159
    //   Java source line #137	-> byte code offset #184
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	187	0	this	Random
    //   0	187	1	from	long
    //   0	187	3	until	long
    //   10	177	5	n	long
    //   17	136	7	rnd	long
    //   159	25	7	rnd	long
    //   34	77	9	nLow	int
    //   114	34	9	v	long
    //   42	69	10	nHigh	int
    //   54	11	11	bitCount	int
    //   93	16	11	bitCount	int
    //   122	22	11	bits	long
  }
  
  public boolean nextBoolean()
  {
    return nextBits(1) != 0;
  }
  
  public double nextDouble()
  {
    return PlatformRandomKt.doubleFromParts(nextBits(26), nextBits(27));
  }
  




  public double nextDouble(double until)
  {
    return nextDouble(0.0D, until);
  }
  







  public double nextDouble(double from, double until)
  {
    RandomKt.checkRangeBounds(from, until);
    double size = until - from;
    double d1 = size; if (Double.isInfinite(d1)) { d1 = from;double d2 = d1; if (!Double.isInfinite(d2)) d2 = d1; if ((!Double.isNaN(d2) ? 1 : 0) != 0) { d1 = until;d2 = d1; if (!Double.isInfinite(d2)) d2 = d1;
        r1 = nextDouble() * (until / 2 - from / 2);
      }
    }
    double r = (!Double.isNaN(d2) ? 1 : 0) != 0 ? 
    
      from + r1 + r1 : 
      
      from + nextDouble() * size;
    
    double r1 = until;return r >= until ? Math.nextAfter(r1, DoubleCompanionObject.INSTANCE.getNEGATIVE_INFINITY()) : r;
  }
  

  public float nextFloat()
  {
    return nextBits(24) / 16777216;
  }
  
  /* Error */
  @NotNull
  public byte[] nextBytes(@NotNull byte[] array, int fromIndex, int toIndex)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 108
    //   3: invokestatic 114	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: arraylength
    //   8: iconst_0
    //   9: iload_2
    //   10: istore 4
    //   12: iload 4
    //   14: if_icmple +7 -> 21
    //   17: pop
    //   18: goto +32 -> 50
    //   21: iload 4
    //   23: if_icmplt +27 -> 50
    //   26: aload_1
    //   27: arraylength
    //   28: iconst_0
    //   29: iload_3
    //   30: istore 4
    //   32: iload 4
    //   34: if_icmple +7 -> 41
    //   37: pop
    //   38: goto +12 -> 50
    //   41: iload 4
    //   43: if_icmplt +7 -> 50
    //   46: iconst_1
    //   47: goto +4 -> 51
    //   50: iconst_0
    //   51: istore 4
    //   53: iload 4
    //   55: ifne +64 -> 119
    //   58: new 116	java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial 120	java/lang/StringBuilder:<init>	()V
    //   65: ldc 122
    //   67: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: iload_2
    //   71: invokevirtual 129	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   74: ldc -125
    //   76: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: iload_3
    //   80: invokevirtual 129	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   83: ldc -123
    //   85: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: aload_1
    //   89: arraylength
    //   90: invokevirtual 129	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   93: bipush 46
    //   95: invokevirtual 136	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   98: invokevirtual 140	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   101: astore 6
    //   103: new 142	java/lang/IllegalArgumentException
    //   106: dup
    //   107: aload 6
    //   109: invokevirtual 143	java/lang/Object:toString	()Ljava/lang/String;
    //   112: invokespecial 146	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   115: checkcast 148	java/lang/Throwable
    //   118: athrow
    //   119: iload_2
    //   120: iload_3
    //   121: if_icmpgt +7 -> 128
    //   124: iconst_1
    //   125: goto +4 -> 129
    //   128: iconst_0
    //   129: istore 4
    //   131: iload 4
    //   133: ifne +54 -> 187
    //   136: new 116	java/lang/StringBuilder
    //   139: dup
    //   140: invokespecial 120	java/lang/StringBuilder:<init>	()V
    //   143: ldc 122
    //   145: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: iload_2
    //   149: invokevirtual 129	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   152: ldc -106
    //   154: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: iload_3
    //   158: invokevirtual 129	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   161: ldc -104
    //   163: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: invokevirtual 140	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: astore 6
    //   171: new 142	java/lang/IllegalArgumentException
    //   174: dup
    //   175: aload 6
    //   177: invokevirtual 143	java/lang/Object:toString	()Ljava/lang/String;
    //   180: invokespecial 146	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   183: checkcast 148	java/lang/Throwable
    //   186: athrow
    //   187: iload_3
    //   188: iload_2
    //   189: isub
    //   190: iconst_4
    //   191: idiv
    //   192: istore 4
    //   194: iload_2
    //   195: istore 5
    //   197: iconst_0
    //   198: istore 6
    //   200: iload 4
    //   202: istore 7
    //   204: iload 6
    //   206: iload 7
    //   208: if_icmpge +70 -> 278
    //   211: iload 6
    //   213: istore 8
    //   215: aload_0
    //   216: invokevirtual 35	kotlin/random/Random:nextInt	()I
    //   219: istore 9
    //   221: aload_1
    //   222: iload 5
    //   224: iload 9
    //   226: i2b
    //   227: bastore
    //   228: aload_1
    //   229: iload 5
    //   231: iconst_1
    //   232: iadd
    //   233: iload 9
    //   235: bipush 8
    //   237: iushr
    //   238: i2b
    //   239: bastore
    //   240: aload_1
    //   241: iload 5
    //   243: iconst_2
    //   244: iadd
    //   245: iload 9
    //   247: bipush 16
    //   249: iushr
    //   250: i2b
    //   251: bastore
    //   252: aload_1
    //   253: iload 5
    //   255: iconst_3
    //   256: iadd
    //   257: iload 9
    //   259: bipush 24
    //   261: iushr
    //   262: i2b
    //   263: bastore
    //   264: iload 5
    //   266: iconst_4
    //   267: iadd
    //   268: istore 5
    //   270: nop
    //   271: nop
    //   272: iinc 6 1
    //   275: goto -71 -> 204
    //   278: iload_3
    //   279: iload 5
    //   281: isub
    //   282: istore 6
    //   284: aload_0
    //   285: iload 6
    //   287: bipush 8
    //   289: imul
    //   290: invokevirtual 17	kotlin/random/Random:nextBits	(I)I
    //   293: istore 7
    //   295: iconst_0
    //   296: istore 8
    //   298: iload 6
    //   300: istore 9
    //   302: iload 8
    //   304: iload 9
    //   306: if_icmpge +25 -> 331
    //   309: aload_1
    //   310: iload 5
    //   312: iload 8
    //   314: iadd
    //   315: iload 7
    //   317: iload 8
    //   319: bipush 8
    //   321: imul
    //   322: iushr
    //   323: i2b
    //   324: bastore
    //   325: iinc 8 1
    //   328: goto -26 -> 302
    //   331: aload_1
    //   332: areturn
    // Line number table:
    //   Java source line #196	-> byte code offset #6
    //   Java source line #196	-> byte code offset #58
    //   Java source line #196	-> byte code offset #101
    //   Java source line #197	-> byte code offset #119
    //   Java source line #197	-> byte code offset #136
    //   Java source line #197	-> byte code offset #169
    //   Java source line #199	-> byte code offset #187
    //   Java source line #201	-> byte code offset #194
    //   Java source line #202	-> byte code offset #197
    //   Java source line #203	-> byte code offset #215
    //   Java source line #204	-> byte code offset #221
    //   Java source line #205	-> byte code offset #228
    //   Java source line #206	-> byte code offset #240
    //   Java source line #207	-> byte code offset #252
    //   Java source line #208	-> byte code offset #264
    //   Java source line #209	-> byte code offset #270
    //   Java source line #202	-> byte code offset #272
    //   Java source line #211	-> byte code offset #278
    //   Java source line #212	-> byte code offset #284
    //   Java source line #213	-> byte code offset #295
    //   Java source line #214	-> byte code offset #309
    //   Java source line #213	-> byte code offset #325
    //   Java source line #217	-> byte code offset #331
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	333	0	this	Random
    //   0	333	1	array	byte[]
    //   0	333	2	fromIndex	int
    //   0	333	3	toIndex	int
    //   194	139	4	steps	int
    //   58	43	5	$i$a$1$require	int
    //   136	33	5	$i$a$2$require	int
    //   197	136	5	position	int
    //   284	49	6	remainder	int
    //   295	38	7	vr	int
    //   215	56	8	it	int
    //   309	19	8	i	int
    //   221	49	9	v	int
    //   215	56	10	$i$a$3$repeat	int
  }
  
  @NotNull
  public byte[] nextBytes(@NotNull byte[] array)
  {
    Intrinsics.checkParameterIsNotNull(array, "array");return nextBytes(array, 0, array.length);
  }
  
  @NotNull
  public byte[] nextBytes(int size) {
    return nextBytes(new byte[size]);
  }
  









  private static final Random defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom(); public static final Default Default = new Default(null);
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000@\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\n\002\020\013\n\000\n\002\020\022\n\002\b\005\n\002\020\006\n\002\b\003\n\002\020\007\n\002\b\002\n\002\020\t\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\007\032\0020\b2\006\020\t\032\0020\bH\026J\b\020\n\032\0020\013H\026J\020\020\f\032\0020\r2\006\020\016\032\0020\rH\026J \020\f\032\0020\r2\006\020\016\032\0020\r2\006\020\017\032\0020\b2\006\020\020\032\0020\bH\026J\020\020\f\032\0020\r2\006\020\021\032\0020\bH\026J\b\020\022\032\0020\023H\026J\020\020\022\032\0020\0232\006\020\024\032\0020\023H\026J\030\020\022\032\0020\0232\006\020\025\032\0020\0232\006\020\024\032\0020\023H\026J\b\020\026\032\0020\027H\026J\b\020\030\032\0020\bH\026J\020\020\030\032\0020\b2\006\020\024\032\0020\bH\026J\030\020\030\032\0020\b2\006\020\025\032\0020\b2\006\020\024\032\0020\bH\026J\b\020\031\032\0020\032H\026J\020\020\031\032\0020\0322\006\020\024\032\0020\032H\026J\030\020\031\032\0020\0322\006\020\025\032\0020\0322\006\020\024\032\0020\032H\026R\026\020\003\032\0020\0048\006X\004¢\006\b\n\000\022\004\b\005\020\002R\016\020\006\032\0020\001X\004¢\006\002\n\000¨\006\033"}, d2={"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "()V", "Companion", "Lkotlin/random/Random$Companion;", "Companion$annotations", "defaultRandom", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "kotlin-stdlib"})
  public static final class Default extends Random { public int nextBits(int bitCount) { return Random.access$getDefaultRandom$cp().nextBits(bitCount); }
    public int nextInt() { return Random.access$getDefaultRandom$cp().nextInt(); }
    public int nextInt(int until) { return Random.access$getDefaultRandom$cp().nextInt(until); }
    public int nextInt(int from, int until) { return Random.access$getDefaultRandom$cp().nextInt(from, until); }
    
    public long nextLong() { return Random.access$getDefaultRandom$cp().nextLong(); }
    public long nextLong(long until) { return Random.access$getDefaultRandom$cp().nextLong(until); }
    public long nextLong(long from, long until) { return Random.access$getDefaultRandom$cp().nextLong(from, until); }
    
    public boolean nextBoolean() { return Random.access$getDefaultRandom$cp().nextBoolean(); }
    
    public double nextDouble() { return Random.access$getDefaultRandom$cp().nextDouble(); }
    public double nextDouble(double until) { return Random.access$getDefaultRandom$cp().nextDouble(until); }
    public double nextDouble(double from, double until) { return Random.access$getDefaultRandom$cp().nextDouble(from, until); }
    
    public float nextFloat() { return Random.access$getDefaultRandom$cp().nextFloat(); }
    @NotNull
    public byte[] nextBytes(@NotNull byte[] array) { Intrinsics.checkParameterIsNotNull(array, "array");return Random.access$getDefaultRandom$cp().nextBytes(array); } @NotNull
    public byte[] nextBytes(int size) { return Random.access$getDefaultRandom$cp().nextBytes(size); } @NotNull
    public byte[] nextBytes(@NotNull byte[] array, int fromIndex, int toIndex) { Intrinsics.checkParameterIsNotNull(array, "array");return Random.access$getDefaultRandom$cp().nextBytes(array, fromIndex, toIndex); } private Default() {} } /**
   * @deprecated
   */
  @JvmField
  @NotNull
  public static final Companion Companion = Companion.INSTANCE; /**
   * @deprecated
   */
  @Deprecated(message="Use Default companion object instead", level=DeprecationLevel.HIDDEN)
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\004H\026¨\006\006"}, d2={"Lkotlin/random/Random$Companion;", "Lkotlin/random/Random;", "()V", "nextBits", "", "bitCount", "kotlin-stdlib"})
  public static final class Companion extends Random { static { Companion localCompanion = new Companion();INSTANCE = localCompanion; }
    private Companion() {} public int nextBits(int bitCount) { return Random.Default.nextBits(bitCount); }
    
    public static final Companion INSTANCE;
  }
  
  public Random() {}
}

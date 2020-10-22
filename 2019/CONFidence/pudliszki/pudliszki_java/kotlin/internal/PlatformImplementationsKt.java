package kotlin.internal;

import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;











@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\036\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\b\n\002\b\004\n\002\020\000\n\002\b\004\032 \020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0052\006\020\007\032\0020\005H\001\032\"\020\b\032\002H\t\"\n\b\000\020\t\030\001*\0020\n2\006\020\013\032\0020\nH\b¢\006\002\020\f\032\b\020\r\032\0020\005H\002\"\020\020\000\032\0020\0018\000X\004¢\006\002\n\000¨\006\016"}, d2={"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "castToBaseType", "T", "", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "getJavaVersion", "kotlin-stdlib"})
public final class PlatformImplementationsKt
{
  static
  {
    int $i$a$1$run;
    int version = getJavaVersion();
    ClassLoader localClassLoader1; ClassLoader localClassLoader2; if (version >= 65544) {
      try {
        Object tmp20_17 = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();Intrinsics.checkExpressionValueIsNotNull(tmp20_17, "Class.forName(\"kotlin.in…entations\").newInstance()");Object localObject1 = tmp20_17; try { Object tmp29_28 = localObject1;
          





























          if (tmp29_28 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations"); tmpTernaryOp = ((PlatformImplementations)tmp29_28; } catch (ClassCastException localClassCastException) { localClassLoader1 = localObject1.getClass().getClassLoader();localClassLoader2 = PlatformImplementations.class.getClassLoader(); Throwable tmp108_105 = new ClassCastException("Instance classloader: " + localClassLoader1 + ", base type classloader: " + localClassLoader2).initCause((Throwable)localClassCastException);Intrinsics.checkExpressionValueIsNotNull(tmp108_105, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");throw tmp108_105;
        }
      } catch (ClassNotFoundException localClassNotFoundException4) {
        try { Object tmp128_125 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();Intrinsics.checkExpressionValueIsNotNull(tmp128_125, "Class.forName(\"kotlin.in…entations\").newInstance()");Object localObject2 = tmp128_125; try { Object tmp137_136 = localObject2;
            
































            if (tmp137_136 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations"); tmpTernaryOp = ((PlatformImplementations)tmp137_136; } catch (ClassCastException localClassCastException1) { localClassLoader1 = localObject2.getClass().getClassLoader();localClassLoader2 = PlatformImplementations.class.getClassLoader(); Throwable tmp216_213 = new ClassCastException("Instance classloader: " + localClassLoader1 + ", base type classloader: " + localClassLoader2).initCause((Throwable)localClassCastException1);Intrinsics.checkExpressionValueIsNotNull(tmp216_213, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");throw tmp216_213;
          }
        } catch (ClassNotFoundException localClassNotFoundException5) {}
      }
    } else if (version >= 65543)
      try {
        Object tmp242_239 = Class.forName("kotlin.internal.jdk7.JDK7PlatformImplementations").newInstance();Intrinsics.checkExpressionValueIsNotNull(tmp242_239, "Class.forName(\"kotlin.in…entations\").newInstance()");Object localObject3 = tmp242_239; try { Object tmp251_250 = localObject3;
          






































          if (tmp251_250 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations"); tmpTernaryOp = ((PlatformImplementations)tmp251_250; } catch (ClassCastException localClassCastException2) { localClassLoader1 = localObject3.getClass().getClassLoader();localClassLoader2 = PlatformImplementations.class.getClassLoader(); Throwable tmp330_327 = new ClassCastException("Instance classloader: " + localClassLoader1 + ", base type classloader: " + localClassLoader2).initCause((Throwable)localClassCastException2);Intrinsics.checkExpressionValueIsNotNull(tmp330_327, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");throw tmp330_327;
        }
      } catch (ClassNotFoundException localClassNotFoundException6) {
        try { Object tmp350_347 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();Intrinsics.checkExpressionValueIsNotNull(tmp350_347, "Class.forName(\"kotlin.in…entations\").newInstance()");Object localObject4 = tmp350_347; try { Object tmp359_358 = localObject4;
            









































            if (tmp359_358 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations"); tmpTernaryOp = ((PlatformImplementations)tmp359_358; } catch (ClassCastException localClassCastException3) { localClassLoader1 = localObject4.getClass().getClassLoader();localClassLoader2 = PlatformImplementations.class.getClassLoader(); Throwable tmp438_435 = new ClassCastException("Instance classloader: " + localClassLoader1 + ", base type classloader: " + localClassLoader2).initCause((Throwable)localClassCastException3);Intrinsics.checkExpressionValueIsNotNull(tmp438_435, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");throw tmp438_435; } } catch (ClassNotFoundException localClassNotFoundException7) {} } }
  
  @JvmField
  @NotNull
  public static final PlatformImplementations IMPLEMENTATIONS = new PlatformImplementations();
  
  @InlineOnly
  private static final <T> T castToBaseType(Object instance) {
    try {
      ;
      Intrinsics.reifiedOperationMarker(1, "T");return (Object)instance;
    } catch (ClassCastException e) {
      ClassLoader instanceCL = instance.getClass().getClassLoader();
      Intrinsics.reifiedOperationMarker(4, "T");ClassLoader baseTypeCL = Object.class.getClassLoader(); Throwable 
        tmp77_74 = new ClassCastException("Instance classloader: " + instanceCL + ", base type classloader: " + baseTypeCL).initCause((Throwable)e);Intrinsics.checkExpressionValueIsNotNull(tmp77_74, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");throw tmp77_74;
    }
  }
  


























  @PublishedApi
  @SinceKotlin(version="1.2")
  public static final boolean apiVersionIsAtLeast(int major, int minor, int patch)
  {
    return KotlinVersion.CURRENT.isAtLeast(major, minor, patch);
  }
  
  /* Error */
  private static final int getJavaVersion()
  {
    // Byte code:
    //   0: ldc 81
    //   2: istore_0
    //   3: ldc 83
    //   5: invokestatic 89	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   8: dup
    //   9: ifnull +6 -> 15
    //   12: goto +6 -> 18
    //   15: pop
    //   16: iload_0
    //   17: ireturn
    //   18: astore_1
    //   19: aload_1
    //   20: checkcast 91	java/lang/CharSequence
    //   23: bipush 46
    //   25: iconst_0
    //   26: iconst_0
    //   27: bipush 6
    //   29: aconst_null
    //   30: invokestatic 97	kotlin/text/StringsKt:indexOf$default	(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I
    //   33: istore_2
    //   34: iload_2
    //   35: ifge +23 -> 58
    //   38: nop
    //   39: aload_1
    //   40: astore_3
    //   41: aload_3
    //   42: invokestatic 103	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   45: ldc 104
    //   47: imul
    //   48: istore_3
    //   49: goto +7 -> 56
    //   52: astore 4
    //   54: iload_0
    //   55: istore_3
    //   56: iload_3
    //   57: ireturn
    //   58: aload_1
    //   59: checkcast 91	java/lang/CharSequence
    //   62: bipush 46
    //   64: iload_2
    //   65: iconst_1
    //   66: iadd
    //   67: iconst_0
    //   68: iconst_4
    //   69: aconst_null
    //   70: invokestatic 97	kotlin/text/StringsKt:indexOf$default	(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I
    //   73: istore_3
    //   74: iload_3
    //   75: ifge +8 -> 83
    //   78: aload_1
    //   79: invokevirtual 109	java/lang/String:length	()I
    //   82: istore_3
    //   83: aload_1
    //   84: astore 5
    //   86: iconst_0
    //   87: istore 6
    //   89: aload 5
    //   91: dup
    //   92: ifnonnull +13 -> 105
    //   95: new 111	kotlin/TypeCastException
    //   98: dup
    //   99: ldc 113
    //   101: invokespecial 114	kotlin/TypeCastException:<init>	(Ljava/lang/String;)V
    //   104: athrow
    //   105: iload 6
    //   107: iload_2
    //   108: invokevirtual 118	java/lang/String:substring	(II)Ljava/lang/String;
    //   111: dup
    //   112: ldc 120
    //   114: invokestatic 67	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   117: astore 4
    //   119: aload_1
    //   120: astore 6
    //   122: iload_2
    //   123: iconst_1
    //   124: iadd
    //   125: istore 7
    //   127: aload 6
    //   129: dup
    //   130: ifnonnull +13 -> 143
    //   133: new 111	kotlin/TypeCastException
    //   136: dup
    //   137: ldc 113
    //   139: invokespecial 114	kotlin/TypeCastException:<init>	(Ljava/lang/String;)V
    //   142: athrow
    //   143: iload 7
    //   145: iload_3
    //   146: invokevirtual 118	java/lang/String:substring	(II)Ljava/lang/String;
    //   149: dup
    //   150: ldc 120
    //   152: invokestatic 67	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   155: astore 5
    //   157: nop
    //   158: aload 4
    //   160: astore 6
    //   162: aload 6
    //   164: invokestatic 103	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   167: ldc 104
    //   169: imul
    //   170: aload 5
    //   172: astore 6
    //   174: istore 8
    //   176: aload 6
    //   178: invokestatic 103	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   181: istore 9
    //   183: iload 8
    //   185: iload 9
    //   187: iadd
    //   188: istore 6
    //   190: goto +8 -> 198
    //   193: astore 7
    //   195: iload_0
    //   196: istore 6
    //   198: iload 6
    //   200: ireturn
    // Line number table:
    //   Java source line #62	-> byte code offset #0
    //   Java source line #63	-> byte code offset #3
    //   Java source line #64	-> byte code offset #19
    //   Java source line #65	-> byte code offset #34
    //   Java source line #66	-> byte code offset #38
    //   Java source line #66	-> byte code offset #45
    //   Java source line #68	-> byte code offset #58
    //   Java source line #69	-> byte code offset #74
    //   Java source line #71	-> byte code offset #83
    //   Java source line #71	-> byte code offset #117
    //   Java source line #72	-> byte code offset #119
    //   Java source line #72	-> byte code offset #155
    //   Java source line #73	-> byte code offset #157
    //   Java source line #74	-> byte code offset #158
    //   Java source line #74	-> byte code offset #167
    //   Java source line #74	-> byte code offset #187
    //   Java source line #75	-> byte code offset #193
    //   Java source line #76	-> byte code offset #195
    //   Java source line #73	-> byte code offset #198
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	198	0	default	int
    //   19	182	1	version	String
    //   34	167	2	firstDot	int
    //   74	127	3	secondDot	int
    //   54	2	4	e	NumberFormatException
    //   119	82	4	firstPart	String
    //   157	44	5	secondPart	String
    //   195	3	7	e	NumberFormatException
    // Exception table:
    //   from	to	target	type
    //   38	49	52	java/lang/NumberFormatException
    //   157	190	193	java/lang/NumberFormatException
  }
}

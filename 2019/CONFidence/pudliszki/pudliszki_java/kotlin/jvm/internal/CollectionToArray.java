package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\0002\n\000\n\002\020\021\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\036\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032#\020\006\032\n\022\006\022\004\030\0010\0020\0012\n\020\007\032\006\022\002\b\0030\bH\007¢\006\004\b\t\020\n\0325\020\006\032\n\022\006\022\004\030\0010\0020\0012\n\020\007\032\006\022\002\b\0030\b2\020\020\013\032\f\022\006\022\004\030\0010\002\030\0010\001H\007¢\006\004\b\t\020\f\032~\020\r\032\n\022\006\022\004\030\0010\0020\0012\n\020\007\032\006\022\002\b\0030\b2\024\020\016\032\020\022\f\022\n\022\006\022\004\030\0010\0020\0010\0172\032\020\020\032\026\022\004\022\0020\005\022\f\022\n\022\006\022\004\030\0010\0020\0010\0212(\020\022\032$\022\f\022\n\022\006\022\004\030\0010\0020\001\022\004\022\0020\005\022\f\022\n\022\006\022\004\030\0010\0020\0010\023H\b¢\006\002\020\024\"\030\020\000\032\n\022\006\022\004\030\0010\0020\001X\004¢\006\004\n\002\020\003\"\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\025"}, d2={"EMPTY", "", "", "[Ljava/lang/Object;", "MAX_SIZE", "", "collectionToArray", "collection", "", "toArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", "a", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "toArrayImpl", "empty", "Lkotlin/Function0;", "alloc", "Lkotlin/Function1;", "trim", "Lkotlin/Function2;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "kotlin-stdlib"})
@JvmName(name="CollectionToArray")
public final class CollectionToArray
{
  /* Error */
  @JvmName(name="toArray")
  @org.jetbrains.annotations.NotNull
  public static final Object[] toArray(@org.jetbrains.annotations.NotNull Collection<?> collection)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 17
    //   3: invokestatic 23	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: nop
    //   7: aload_0
    //   8: invokeinterface 29 1 0
    //   13: istore_1
    //   14: iload_1
    //   15: ifne +9 -> 24
    //   18: getstatic 31	kotlin/jvm/internal/CollectionToArray:EMPTY	[Ljava/lang/Object;
    //   21: goto +158 -> 179
    //   24: aload_0
    //   25: invokeinterface 35 1 0
    //   30: astore_2
    //   31: aload_2
    //   32: invokeinterface 41 1 0
    //   37: ifne +9 -> 46
    //   40: getstatic 31	kotlin/jvm/internal/CollectionToArray:EMPTY	[Ljava/lang/Object;
    //   43: goto +136 -> 179
    //   46: iload_1
    //   47: istore_3
    //   48: iload_3
    //   49: anewarray 4	java/lang/Object
    //   52: astore_3
    //   53: iconst_0
    //   54: istore 4
    //   56: aload_3
    //   57: iload 4
    //   59: iinc 4 1
    //   62: aload_2
    //   63: invokeinterface 45 1 0
    //   68: aastore
    //   69: iload 4
    //   71: aload_3
    //   72: arraylength
    //   73: if_icmplt +71 -> 144
    //   76: aload_2
    //   77: invokeinterface 41 1 0
    //   82: ifne +7 -> 89
    //   85: aload_3
    //   86: goto +93 -> 179
    //   89: iload 4
    //   91: iconst_3
    //   92: imul
    //   93: iconst_1
    //   94: iadd
    //   95: iconst_1
    //   96: iushr
    //   97: istore 5
    //   99: iload 5
    //   101: iload 4
    //   103: if_icmpgt +25 -> 128
    //   106: iload 4
    //   108: ldc 12
    //   110: if_icmplt +14 -> 124
    //   113: new 47	java/lang/OutOfMemoryError
    //   116: dup
    //   117: invokespecial 51	java/lang/OutOfMemoryError:<init>	()V
    //   120: checkcast 53	java/lang/Throwable
    //   123: athrow
    //   124: ldc 12
    //   126: istore 5
    //   128: aload_3
    //   129: iload 5
    //   131: invokestatic 59	java/util/Arrays:copyOf	([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   134: dup
    //   135: ldc 61
    //   137: invokestatic 64	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   140: astore_3
    //   141: goto +35 -> 176
    //   144: aload_2
    //   145: invokeinterface 41 1 0
    //   150: ifne +26 -> 176
    //   153: aload_3
    //   154: iload 4
    //   156: istore 6
    //   158: astore 7
    //   160: aload 7
    //   162: iload 6
    //   164: invokestatic 59	java/util/Arrays:copyOf	([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   167: dup
    //   168: ldc 66
    //   170: invokestatic 64	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   173: goto +6 -> 179
    //   176: goto -120 -> 56
    //   179: areturn
    // Line number table:
    //   Java source line #19	-> byte code offset #6
    //   Java source line #20	-> byte code offset #6
    //   Java source line #19	-> byte code offset #6
    //   Java source line #83	-> byte code offset #7
    //   Java source line #84	-> byte code offset #14
    //   Java source line #21	-> byte code offset #18
    //   Java source line #85	-> byte code offset #24
    //   Java source line #86	-> byte code offset #31
    //   Java source line #21	-> byte code offset #40
    //   Java source line #87	-> byte code offset #46
    //   Java source line #22	-> byte code offset #48
    //   Java source line #88	-> byte code offset #53
    //   Java source line #90	-> byte code offset #56
    //   Java source line #91	-> byte code offset #56
    //   Java source line #92	-> byte code offset #69
    //   Java source line #93	-> byte code offset #76
    //   Java source line #97	-> byte code offset #89
    //   Java source line #98	-> byte code offset #99
    //   Java source line #99	-> byte code offset #106
    //   Java source line #100	-> byte code offset #124
    //   Java source line #102	-> byte code offset #128
    //   Java source line #104	-> byte code offset #144
    //   Java source line #23	-> byte code offset #160
    //   Java source line #105	-> byte code offset #176
    //   Java source line #90	-> byte code offset #176
    //   Java source line #24	-> byte code offset #179
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	180	0	collection	Collection
    //   14	165	1	size$iv	int
    //   18	3	2	$i$a$1$toArrayImpl	int
    //   31	148	2	iter$iv	Iterator
    //   40	3	3	$i$a$1$toArrayImpl	int
    //   48	4	3	size	int
    //   53	126	3	result$iv	Object[]
    //   48	4	4	$i$a$2$toArrayImpl	int
    //   56	123	4	i$iv	int
    //   99	42	5	newSize$iv	int
    //   160	13	6	size	int
    //   160	13	7	result	Object[]
    //   160	13	8	$i$a$3$toArrayImpl	int
    //   7	172	9	$i$f$toArrayImpl	int
  }
  
  /* Error */
  @JvmName(name="toArray")
  @org.jetbrains.annotations.NotNull
  public static final Object[] toArray(@org.jetbrains.annotations.NotNull Collection<?> collection, @org.jetbrains.annotations.Nullable Object[] a)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 17
    //   3: invokestatic 23	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ifnonnull +14 -> 21
    //   10: new 83	java/lang/NullPointerException
    //   13: dup
    //   14: invokespecial 84	java/lang/NullPointerException:<init>	()V
    //   17: checkcast 53	java/lang/Throwable
    //   20: athrow
    //   21: nop
    //   22: aload_0
    //   23: invokeinterface 29 1 0
    //   28: istore_2
    //   29: iload_2
    //   30: ifne +16 -> 46
    //   33: aload_1
    //   34: arraylength
    //   35: ifle +7 -> 42
    //   38: aload_1
    //   39: iconst_0
    //   40: aconst_null
    //   41: aastore
    //   42: aload_1
    //   43: goto +219 -> 262
    //   46: aload_0
    //   47: invokeinterface 35 1 0
    //   52: astore 4
    //   54: aload 4
    //   56: invokeinterface 41 1 0
    //   61: ifne +16 -> 77
    //   64: aload_1
    //   65: arraylength
    //   66: ifle +7 -> 73
    //   69: aload_1
    //   70: iconst_0
    //   71: aconst_null
    //   72: aastore
    //   73: aload_1
    //   74: goto +188 -> 262
    //   77: iload_2
    //   78: istore_3
    //   79: iload_3
    //   80: aload_1
    //   81: arraylength
    //   82: if_icmpgt +7 -> 89
    //   85: aload_1
    //   86: goto +31 -> 117
    //   89: aload_1
    //   90: invokevirtual 88	java/lang/Object:getClass	()Ljava/lang/Class;
    //   93: invokevirtual 93	java/lang/Class:getComponentType	()Ljava/lang/Class;
    //   96: iload_3
    //   97: invokestatic 99	java/lang/reflect/Array:newInstance	(Ljava/lang/Class;I)Ljava/lang/Object;
    //   100: dup
    //   101: ifnonnull +13 -> 114
    //   104: new 101	kotlin/TypeCastException
    //   107: dup
    //   108: ldc 103
    //   110: invokespecial 106	kotlin/TypeCastException:<init>	(Ljava/lang/String;)V
    //   113: athrow
    //   114: checkcast 79	[Ljava/lang/Object;
    //   117: astore 6
    //   119: iconst_0
    //   120: istore_3
    //   121: aload 6
    //   123: iload_3
    //   124: iinc 3 1
    //   127: aload 4
    //   129: invokeinterface 45 1 0
    //   134: aastore
    //   135: iload_3
    //   136: aload 6
    //   138: arraylength
    //   139: if_icmplt +72 -> 211
    //   142: aload 4
    //   144: invokeinterface 41 1 0
    //   149: ifne +8 -> 157
    //   152: aload 6
    //   154: goto +108 -> 262
    //   157: iload_3
    //   158: iconst_3
    //   159: imul
    //   160: iconst_1
    //   161: iadd
    //   162: iconst_1
    //   163: iushr
    //   164: istore 5
    //   166: iload 5
    //   168: iload_3
    //   169: if_icmpgt +24 -> 193
    //   172: iload_3
    //   173: ldc 12
    //   175: if_icmplt +14 -> 189
    //   178: new 47	java/lang/OutOfMemoryError
    //   181: dup
    //   182: invokespecial 51	java/lang/OutOfMemoryError:<init>	()V
    //   185: checkcast 53	java/lang/Throwable
    //   188: athrow
    //   189: ldc 12
    //   191: istore 5
    //   193: aload 6
    //   195: iload 5
    //   197: invokestatic 59	java/util/Arrays:copyOf	([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   200: dup
    //   201: ldc 61
    //   203: invokestatic 64	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   206: astore 6
    //   208: goto +51 -> 259
    //   211: aload 4
    //   213: invokeinterface 41 1 0
    //   218: ifne +41 -> 259
    //   221: aload 6
    //   223: iload_3
    //   224: istore 7
    //   226: astore 8
    //   228: aload 8
    //   230: aload_1
    //   231: if_acmpne +12 -> 243
    //   234: aload_1
    //   235: iload 7
    //   237: aconst_null
    //   238: aastore
    //   239: aload_1
    //   240: goto +16 -> 256
    //   243: aload 8
    //   245: iload 7
    //   247: invokestatic 59	java/util/Arrays:copyOf	([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   250: dup
    //   251: ldc 66
    //   253: invokestatic 64	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   256: goto +6 -> 262
    //   259: goto -138 -> 121
    //   262: areturn
    // Line number table:
    //   Java source line #30	-> byte code offset #6
    //   Java source line #31	-> byte code offset #21
    //   Java source line #32	-> byte code offset #21
    //   Java source line #31	-> byte code offset #21
    //   Java source line #106	-> byte code offset #22
    //   Java source line #107	-> byte code offset #29
    //   Java source line #34	-> byte code offset #33
    //   Java source line #35	-> byte code offset #42
    //   Java source line #108	-> byte code offset #46
    //   Java source line #109	-> byte code offset #54
    //   Java source line #34	-> byte code offset #64
    //   Java source line #35	-> byte code offset #73
    //   Java source line #110	-> byte code offset #77
    //   Java source line #38	-> byte code offset #79
    //   Java source line #39	-> byte code offset #79
    //   Java source line #111	-> byte code offset #119
    //   Java source line #113	-> byte code offset #121
    //   Java source line #114	-> byte code offset #121
    //   Java source line #115	-> byte code offset #135
    //   Java source line #116	-> byte code offset #142
    //   Java source line #120	-> byte code offset #157
    //   Java source line #121	-> byte code offset #166
    //   Java source line #122	-> byte code offset #172
    //   Java source line #123	-> byte code offset #189
    //   Java source line #125	-> byte code offset #193
    //   Java source line #127	-> byte code offset #211
    //   Java source line #42	-> byte code offset #228
    //   Java source line #43	-> byte code offset #234
    //   Java source line #44	-> byte code offset #239
    //   Java source line #46	-> byte code offset #243
    //   Java source line #42	-> byte code offset #256
    //   Java source line #46	-> byte code offset #256
    //   Java source line #128	-> byte code offset #259
    //   Java source line #113	-> byte code offset #259
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	263	0	collection	Collection
    //   0	263	1	a	Object[]
    //   29	233	2	size$iv	int
    //   33	10	3	$i$a$4$toArrayImpl	int
    //   64	10	3	$i$a$4$toArrayImpl	int
    //   79	38	3	size	int
    //   121	141	3	i$iv	int
    //   54	208	4	iter$iv	Iterator
    //   79	38	5	$i$a$5$toArrayImpl	int
    //   166	42	5	newSize$iv	int
    //   119	143	6	result$iv	Object[]
    //   228	28	7	size	int
    //   228	28	8	result	Object[]
    //   228	28	9	$i$a$6$toArrayImpl	int
    //   22	240	10	$i$f$toArrayImpl	int
  }
  
  private static final Object[] toArrayImpl(Collection<?> collection, Function0<Object[]> empty, Function1<? super Integer, Object[]> alloc, Function2<? super Object[], ? super Integer, Object[]> trim)
  {
    ;
    int size = collection.size();
    if (size == 0) return (Object[])empty.invoke();
    Iterator iter = collection.iterator();
    if (!iter.hasNext()) return (Object[])empty.invoke();
    Object[] result = (Object[])alloc.invoke(Integer.valueOf(size));
    int i = 0;
    for (;;)
    {
      result[(i++)] = iter.next();
      if (i >= result.length) {
        if (!iter.hasNext()) { return result;
        }
        

        int newSize = i * 3 + 1 >>> 1;
        if (newSize <= i) {
          if (i >= 2147483645) throw ((Throwable)new OutOfMemoryError());
          newSize = 2147483645;
        }
        Object[] tmp152_149 = Arrays.copyOf(result, newSize);Intrinsics.checkExpressionValueIsNotNull(tmp152_149, "Arrays.copyOf(result, newSize)");result = tmp152_149;
      }
      else if (!iter.hasNext()) { return (Object[])trim.invoke(result, Integer.valueOf(i));
      }
    }
  }
  















































  private static final Object[] EMPTY = new Object[0];
  private static final int MAX_SIZE = 2147483645;
  
  static
  {
    int $i$f$emptyArray;
  }
}

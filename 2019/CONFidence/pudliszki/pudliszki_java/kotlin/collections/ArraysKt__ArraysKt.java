package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000H\n\000\n\002\020\013\n\000\n\002\020\021\n\002\b\004\n\002\020\016\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020!\n\002\b\003\n\002\020 \n\002\b\005\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\0321\020\000\032\0020\001\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\0032\016\020\004\032\n\022\006\b\001\022\002H\0020\003H\001¢\006\004\b\005\020\006\032!\020\007\032\0020\b\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\003H\001¢\006\004\b\t\020\n\032?\020\013\032\0020\f\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\0032\n\020\r\032\0060\016j\002`\0172\020\020\020\032\f\022\b\022\006\022\002\b\0030\0030\021H\002¢\006\004\b\022\020\023\032+\020\024\032\b\022\004\022\002H\0020\025\"\004\b\000\020\002*\022\022\016\b\001\022\n\022\006\b\001\022\002H\0020\0030\003¢\006\002\020\026\0328\020\027\032\002H\030\"\020\b\000\020\031*\006\022\002\b\0030\003*\002H\030\"\004\b\001\020\030*\002H\0312\f\020\032\032\b\022\004\022\002H\0300\033H\b¢\006\002\020\034\032)\020\035\032\0020\001*\b\022\002\b\003\030\0010\003H\b\002\016\n\f\b\000\022\002\030\001\032\004\b\003\020\000¢\006\002\020\036\032G\020\037\032\032\022\n\022\b\022\004\022\002H\0020\025\022\n\022\b\022\004\022\002H\0300\0250 \"\004\b\000\020\002\"\004\b\001\020\030*\026\022\022\b\001\022\016\022\004\022\002H\002\022\004\022\002H\0300 0\003¢\006\002\020!¨\006\""}, d2={"contentDeepEqualsImpl", "", "T", "", "other", "contentDeepEquals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "contentDeepToStringImpl", "", "contentDeepToString", "([Ljava/lang/Object;)Ljava/lang/String;", "contentDeepToStringInternal", "", "result", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "processed", "", "contentDeepToStringInternal$ArraysKt__ArraysKt", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V", "flatten", "", "([[Ljava/lang/Object;)Ljava/util/List;", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNullOrEmpty", "([Ljava/lang/Object;)Z", "unzip", "Lkotlin/Pair;", "([Lkotlin/Pair;)Lkotlin/Pair;", "kotlin-stdlib"}, xs="kotlin/collections/ArraysKt")
class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt
{
  @NotNull
  public static final <T> List<T> flatten(@NotNull T[][] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Object[] $receiver$iv = (Object[])$receiver;
    





































































    int $i$f$sumBy;
    




































































    int sum$iv = 0;
    Object localObject1 = $receiver$iv;int i = localObject1.length; for (int j = 0; j < i;) { Object element$iv = localObject1[j];
      Object[] arrayOfObject1 = (Object[])element$iv;k = sum$iv;
      int $i$a$1$sumBy;
      Object[] it;
      int m = it.length;sum$iv = k + m;
      












































































































































      j++;
    }
    
    int k = sum$iv;int n = k;ArrayList result = new ArrayList(n);
    for (Object[] element : $receiver) {
      CollectionsKt.addAll((java.util.Collection)result, element);
    }
    return (List)result;
  }
  




  @NotNull
  public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Pair<? extends T, ? extends R>[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");ArrayList listT = new ArrayList($receiver.length);
    ArrayList listR = new ArrayList($receiver.length);
    for (Pair pair : $receiver) {
      listT.add(pair.getFirst());
      listR.add(pair.getSecond());
    }
    return kotlin.TuplesKt.to(listT, listR);
  }
  


  @kotlin.SinceKotlin(version="1.3")
  @kotlin.internal.InlineOnly
  private static final boolean isNullOrEmpty(@org.jetbrains.annotations.Nullable Object[] $receiver)
  {
    ;
    

    Object[] arrayOfObject;
    
    if ($receiver != null) arrayOfObject = $receiver; return (arrayOfObject.length == 0 ? 1 : 0) != 0;
  }
  



  @kotlin.SinceKotlin(version="1.3")
  @kotlin.internal.InlineOnly
  private static final <C extends Object[],  extends R, R> R ifEmpty(C $receiver, kotlin.jvm.functions.Function0<? extends R> defaultValue)
  {
    ;
    

    Object[] arrayOfObject = $receiver;return (arrayOfObject.length == 0 ? 1 : 0) != 0 ? defaultValue.invoke() : $receiver;
  }
  
  /* Error */
  @kotlin.SinceKotlin(version="1.3")
  @kotlin.PublishedApi
  @kotlin.jvm.JvmName(name="contentDeepEquals")
  public static final <T> boolean contentDeepEquals(@NotNull T[] $receiver, @NotNull T[] other)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 9
    //   3: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 101
    //   9: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: aload_1
    //   14: if_acmpne +5 -> 19
    //   17: iconst_1
    //   18: ireturn
    //   19: aload_0
    //   20: arraylength
    //   21: aload_1
    //   22: arraylength
    //   23: if_icmpeq +5 -> 28
    //   26: iconst_0
    //   27: ireturn
    //   28: iconst_0
    //   29: istore_2
    //   30: aload_0
    //   31: arraylength
    //   32: istore_3
    //   33: iload_2
    //   34: iload_3
    //   35: if_icmpge +596 -> 631
    //   38: aload_0
    //   39: iload_2
    //   40: aaload
    //   41: astore 4
    //   43: aload_1
    //   44: iload_2
    //   45: aaload
    //   46: astore 5
    //   48: aload 4
    //   50: aload 5
    //   52: if_acmpne +6 -> 58
    //   55: goto +570 -> 625
    //   58: aload 4
    //   60: ifnull +8 -> 68
    //   63: aload 5
    //   65: ifnonnull +5 -> 70
    //   68: iconst_0
    //   69: ireturn
    //   70: aload 4
    //   72: instanceof 17
    //   75: ifeq +36 -> 111
    //   78: aload 5
    //   80: instanceof 17
    //   83: ifeq +28 -> 111
    //   86: aload 4
    //   88: checkcast 17	[Ljava/lang/Object;
    //   91: astore 6
    //   93: aload 6
    //   95: aload 5
    //   97: checkcast 17	[Ljava/lang/Object;
    //   100: invokestatic 105	kotlin/collections/ArraysKt:contentDeepEquals	([Ljava/lang/Object;[Ljava/lang/Object;)Z
    //   103: ifne +522 -> 625
    //   106: iconst_0
    //   107: ireturn
    //   108: nop
    //   109: nop
    //   110: athrow
    //   111: aload 4
    //   113: instanceof 107
    //   116: ifeq +36 -> 152
    //   119: aload 5
    //   121: instanceof 107
    //   124: ifeq +28 -> 152
    //   127: aload 4
    //   129: checkcast 107	[B
    //   132: astore 6
    //   134: aload 6
    //   136: aload 5
    //   138: checkcast 107	[B
    //   141: invokestatic 113	java/util/Arrays:equals	([B[B)Z
    //   144: ifne +481 -> 625
    //   147: iconst_0
    //   148: ireturn
    //   149: nop
    //   150: nop
    //   151: athrow
    //   152: aload 4
    //   154: instanceof 115
    //   157: ifeq +36 -> 193
    //   160: aload 5
    //   162: instanceof 115
    //   165: ifeq +28 -> 193
    //   168: aload 4
    //   170: checkcast 115	[S
    //   173: astore 6
    //   175: aload 6
    //   177: aload 5
    //   179: checkcast 115	[S
    //   182: invokestatic 118	java/util/Arrays:equals	([S[S)Z
    //   185: ifne +440 -> 625
    //   188: iconst_0
    //   189: ireturn
    //   190: nop
    //   191: nop
    //   192: athrow
    //   193: aload 4
    //   195: instanceof 120
    //   198: ifeq +36 -> 234
    //   201: aload 5
    //   203: instanceof 120
    //   206: ifeq +28 -> 234
    //   209: aload 4
    //   211: checkcast 120	[I
    //   214: astore 6
    //   216: aload 6
    //   218: aload 5
    //   220: checkcast 120	[I
    //   223: invokestatic 123	java/util/Arrays:equals	([I[I)Z
    //   226: ifne +399 -> 625
    //   229: iconst_0
    //   230: ireturn
    //   231: nop
    //   232: nop
    //   233: athrow
    //   234: aload 4
    //   236: instanceof 125
    //   239: ifeq +36 -> 275
    //   242: aload 5
    //   244: instanceof 125
    //   247: ifeq +28 -> 275
    //   250: aload 4
    //   252: checkcast 125	[J
    //   255: astore 6
    //   257: aload 6
    //   259: aload 5
    //   261: checkcast 125	[J
    //   264: invokestatic 128	java/util/Arrays:equals	([J[J)Z
    //   267: ifne +358 -> 625
    //   270: iconst_0
    //   271: ireturn
    //   272: nop
    //   273: nop
    //   274: athrow
    //   275: aload 4
    //   277: instanceof 130
    //   280: ifeq +36 -> 316
    //   283: aload 5
    //   285: instanceof 130
    //   288: ifeq +28 -> 316
    //   291: aload 4
    //   293: checkcast 130	[F
    //   296: astore 6
    //   298: aload 6
    //   300: aload 5
    //   302: checkcast 130	[F
    //   305: invokestatic 133	java/util/Arrays:equals	([F[F)Z
    //   308: ifne +317 -> 625
    //   311: iconst_0
    //   312: ireturn
    //   313: nop
    //   314: nop
    //   315: athrow
    //   316: aload 4
    //   318: instanceof 135
    //   321: ifeq +36 -> 357
    //   324: aload 5
    //   326: instanceof 135
    //   329: ifeq +28 -> 357
    //   332: aload 4
    //   334: checkcast 135	[D
    //   337: astore 6
    //   339: aload 6
    //   341: aload 5
    //   343: checkcast 135	[D
    //   346: invokestatic 138	java/util/Arrays:equals	([D[D)Z
    //   349: ifne +276 -> 625
    //   352: iconst_0
    //   353: ireturn
    //   354: nop
    //   355: nop
    //   356: athrow
    //   357: aload 4
    //   359: instanceof 140
    //   362: ifeq +36 -> 398
    //   365: aload 5
    //   367: instanceof 140
    //   370: ifeq +28 -> 398
    //   373: aload 4
    //   375: checkcast 140	[C
    //   378: astore 6
    //   380: aload 6
    //   382: aload 5
    //   384: checkcast 140	[C
    //   387: invokestatic 143	java/util/Arrays:equals	([C[C)Z
    //   390: ifne +235 -> 625
    //   393: iconst_0
    //   394: ireturn
    //   395: nop
    //   396: nop
    //   397: athrow
    //   398: aload 4
    //   400: instanceof 145
    //   403: ifeq +36 -> 439
    //   406: aload 5
    //   408: instanceof 145
    //   411: ifeq +28 -> 439
    //   414: aload 4
    //   416: checkcast 145	[Z
    //   419: astore 6
    //   421: aload 6
    //   423: aload 5
    //   425: checkcast 145	[Z
    //   428: invokestatic 148	java/util/Arrays:equals	([Z[Z)Z
    //   431: ifne +194 -> 625
    //   434: iconst_0
    //   435: ireturn
    //   436: nop
    //   437: nop
    //   438: athrow
    //   439: aload 4
    //   441: instanceof 150
    //   444: ifeq +38 -> 482
    //   447: aload 5
    //   449: instanceof 150
    //   452: ifeq +30 -> 482
    //   455: aload 4
    //   457: checkcast 150	kotlin/UByteArray
    //   460: invokevirtual 154	kotlin/UByteArray:unbox-impl	()[B
    //   463: aload 5
    //   465: checkcast 150	kotlin/UByteArray
    //   468: invokevirtual 154	kotlin/UByteArray:unbox-impl	()[B
    //   471: invokestatic 159	kotlin/collections/UArraysKt:contentEquals-kdPth3s	([B[B)Z
    //   474: ifne +151 -> 625
    //   477: iconst_0
    //   478: ireturn
    //   479: nop
    //   480: nop
    //   481: athrow
    //   482: aload 4
    //   484: instanceof 161
    //   487: ifeq +38 -> 525
    //   490: aload 5
    //   492: instanceof 161
    //   495: ifeq +30 -> 525
    //   498: aload 4
    //   500: checkcast 161	kotlin/UShortArray
    //   503: invokevirtual 164	kotlin/UShortArray:unbox-impl	()[S
    //   506: aload 5
    //   508: checkcast 161	kotlin/UShortArray
    //   511: invokevirtual 164	kotlin/UShortArray:unbox-impl	()[S
    //   514: invokestatic 167	kotlin/collections/UArraysKt:contentEquals-mazbYpA	([S[S)Z
    //   517: ifne +108 -> 625
    //   520: iconst_0
    //   521: ireturn
    //   522: nop
    //   523: nop
    //   524: athrow
    //   525: aload 4
    //   527: instanceof 169
    //   530: ifeq +38 -> 568
    //   533: aload 5
    //   535: instanceof 169
    //   538: ifeq +30 -> 568
    //   541: aload 4
    //   543: checkcast 169	kotlin/UIntArray
    //   546: invokevirtual 172	kotlin/UIntArray:unbox-impl	()[I
    //   549: aload 5
    //   551: checkcast 169	kotlin/UIntArray
    //   554: invokevirtual 172	kotlin/UIntArray:unbox-impl	()[I
    //   557: invokestatic 175	kotlin/collections/UArraysKt:contentEquals-ctEhBpI	([I[I)Z
    //   560: ifne +65 -> 625
    //   563: iconst_0
    //   564: ireturn
    //   565: nop
    //   566: nop
    //   567: athrow
    //   568: aload 4
    //   570: instanceof 177
    //   573: ifeq +38 -> 611
    //   576: aload 5
    //   578: instanceof 177
    //   581: ifeq +30 -> 611
    //   584: aload 4
    //   586: checkcast 177	kotlin/ULongArray
    //   589: invokevirtual 180	kotlin/ULongArray:unbox-impl	()[J
    //   592: aload 5
    //   594: checkcast 177	kotlin/ULongArray
    //   597: invokevirtual 180	kotlin/ULongArray:unbox-impl	()[J
    //   600: invokestatic 183	kotlin/collections/UArraysKt:contentEquals-us8wMrg	([J[J)Z
    //   603: ifne +22 -> 625
    //   606: iconst_0
    //   607: ireturn
    //   608: nop
    //   609: nop
    //   610: athrow
    //   611: aload 4
    //   613: aload 5
    //   615: invokestatic 187	kotlin/jvm/internal/Intrinsics:areEqual	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   618: iconst_1
    //   619: ixor
    //   620: ifeq +5 -> 625
    //   623: iconst_0
    //   624: ireturn
    //   625: iinc 2 1
    //   628: goto -595 -> 33
    //   631: iconst_1
    //   632: ireturn
    // Line number table:
    //   Java source line #76	-> byte code offset #12
    //   Java source line #77	-> byte code offset #19
    //   Java source line #79	-> byte code offset #28
    //   Java source line #80	-> byte code offset #38
    //   Java source line #81	-> byte code offset #43
    //   Java source line #83	-> byte code offset #48
    //   Java source line #84	-> byte code offset #55
    //   Java source line #85	-> byte code offset #58
    //   Java source line #86	-> byte code offset #68
    //   Java source line #87	-> byte code offset #70
    //   Java source line #89	-> byte code offset #70
    //   Java source line #90	-> byte code offset #70
    //   Java source line #90	-> byte code offset #106
    //   Java source line #91	-> byte code offset #111
    //   Java source line #91	-> byte code offset #147
    //   Java source line #92	-> byte code offset #152
    //   Java source line #92	-> byte code offset #188
    //   Java source line #93	-> byte code offset #193
    //   Java source line #93	-> byte code offset #229
    //   Java source line #94	-> byte code offset #234
    //   Java source line #94	-> byte code offset #270
    //   Java source line #95	-> byte code offset #275
    //   Java source line #95	-> byte code offset #311
    //   Java source line #96	-> byte code offset #316
    //   Java source line #96	-> byte code offset #352
    //   Java source line #97	-> byte code offset #357
    //   Java source line #97	-> byte code offset #393
    //   Java source line #98	-> byte code offset #398
    //   Java source line #98	-> byte code offset #434
    //   Java source line #100	-> byte code offset #439
    //   Java source line #101	-> byte code offset #482
    //   Java source line #102	-> byte code offset #525
    //   Java source line #103	-> byte code offset #568
    //   Java source line #105	-> byte code offset #611
    //   Java source line #106	-> byte code offset #625
    //   Java source line #79	-> byte code offset #625
    //   Java source line #109	-> byte code offset #631
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	633	0	$receiver	Object[]
    //   0	633	1	other	Object[]
    //   38	590	2	i	int
    //   43	582	4	v1	Object
    //   48	577	5	v2	Object
  }
  
  @kotlin.SinceKotlin(version="1.3")
  @kotlin.PublishedApi
  @kotlin.jvm.JvmName(name="contentDeepToString")
  @NotNull
  public static final <T> String contentDeepToString(@NotNull T[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int length = kotlin.ranges.RangesKt.coerceAtMost($receiver.length, 429496729) * 5 + 2;
    StringBuilder localStringBuilder1 = new StringBuilder(length);StringBuilder $receiver = localStringBuilder1;
    int $i$a$1$buildString; StringBuilder localStringBuilder2 = $receiver;Object[] arrayOfObject = $receiver;List localList = (List)new ArrayList();contentDeepToStringInternal$ArraysKt__ArraysKt(arrayOfObject, localStringBuilder2, localList); String tmp61_58 = localStringBuilder1.toString();Intrinsics.checkExpressionValueIsNotNull(tmp61_58, "StringBuilder(capacity).…builderAction).toString()");return tmp61_58;
  }
  

  private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(@NotNull T[] $receiver, StringBuilder result, List<Object[]> processed)
  {
    if (processed.contains($receiver)) {
      result.append("[...]");
      return;
    }
    processed.add($receiver);
    result.append('[');
    
    int i = 0; int i; for (int j = $receiver.length; i < j; i++) {
      if (i != 0) {
        result.append(", ");
      }
      Object element = $receiver[i];
      Object localObject1 = element; if (localObject1 == null) {
        result.append("null");
      } else if ((localObject1 instanceof Object[])) { contentDeepToStringInternal$ArraysKt__ArraysKt((Object[])element, result, processed); } else { Object localObject2;
        StringBuilder localStringBuilder; String str; if ((localObject1 instanceof byte[])) { localObject2 = (byte[])element;localStringBuilder = result; String tmp124_121 = Arrays.toString((byte[])localObject2);Intrinsics.checkExpressionValueIsNotNull(tmp124_121, "java.util.Arrays.toString(this)");str = tmp124_121;localStringBuilder.append(str);
        } else if ((localObject1 instanceof short[])) { localObject2 = (short[])element;localStringBuilder = result; String tmp166_163 = Arrays.toString((short[])localObject2);Intrinsics.checkExpressionValueIsNotNull(tmp166_163, "java.util.Arrays.toString(this)");str = tmp166_163;localStringBuilder.append(str);
        } else if ((localObject1 instanceof int[])) { localObject2 = (int[])element;localStringBuilder = result; String tmp208_205 = Arrays.toString((int[])localObject2);Intrinsics.checkExpressionValueIsNotNull(tmp208_205, "java.util.Arrays.toString(this)");str = tmp208_205;localStringBuilder.append(str);
        } else if ((localObject1 instanceof long[])) { localObject2 = (long[])element;localStringBuilder = result; String tmp250_247 = Arrays.toString((long[])localObject2);Intrinsics.checkExpressionValueIsNotNull(tmp250_247, "java.util.Arrays.toString(this)");str = tmp250_247;localStringBuilder.append(str);
        } else if ((localObject1 instanceof float[])) { localObject2 = (float[])element;localStringBuilder = result; String tmp292_289 = Arrays.toString((float[])localObject2);Intrinsics.checkExpressionValueIsNotNull(tmp292_289, "java.util.Arrays.toString(this)");str = tmp292_289;localStringBuilder.append(str);
        } else if ((localObject1 instanceof double[])) { localObject2 = (double[])element;localStringBuilder = result; String tmp334_331 = Arrays.toString((double[])localObject2);Intrinsics.checkExpressionValueIsNotNull(tmp334_331, "java.util.Arrays.toString(this)");str = tmp334_331;localStringBuilder.append(str);
        } else if ((localObject1 instanceof char[])) { localObject2 = (char[])element;localStringBuilder = result; String tmp376_373 = Arrays.toString((char[])localObject2);Intrinsics.checkExpressionValueIsNotNull(tmp376_373, "java.util.Arrays.toString(this)");str = tmp376_373;localStringBuilder.append(str);
        } else if ((localObject1 instanceof boolean[])) { localObject2 = (boolean[])element;localStringBuilder = result; String tmp418_415 = Arrays.toString((boolean[])localObject2);Intrinsics.checkExpressionValueIsNotNull(tmp418_415, "java.util.Arrays.toString(this)");str = tmp418_415;localStringBuilder.append(str);
        }
        else if ((localObject1 instanceof UByteArray)) { result.append(UArraysKt.contentToString-GBYM_sE(((UByteArray)element).unbox-impl()));
        } else if ((localObject1 instanceof UShortArray)) { result.append(UArraysKt.contentToString-rL5Bavg(((UShortArray)element).unbox-impl()));
        } else if ((localObject1 instanceof UIntArray)) { result.append(UArraysKt.contentToString--ajY-9A(((UIntArray)element).unbox-impl()));
        } else if ((localObject1 instanceof ULongArray)) { result.append(UArraysKt.contentToString-QwZRm1k(((ULongArray)element).unbox-impl()));
        } else {
          result.append(element.toString());
        }
      }
    }
    result.append(']');
    processed.remove(CollectionsKt.getLastIndex(processed));
  }
  
  public ArraysKt__ArraysKt() {}
}

package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;











@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\036\n\000\n\002\030\002\n\002\020\016\n\002\b\003\n\002\020\b\n\002\b\003\n\002\020 \n\002\b\013\032!\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0020\0012\006\020\003\032\0020\002H\002¢\006\002\b\004\032\021\020\005\032\0020\006*\0020\002H\002¢\006\002\b\007\032\024\020\b\032\0020\002*\0020\0022\b\b\002\020\003\032\0020\002\032J\020\t\032\0020\002*\b\022\004\022\0020\0020\n2\006\020\013\032\0020\0062\022\020\f\032\016\022\004\022\0020\002\022\004\022\0020\0020\0012\024\020\r\032\020\022\004\022\0020\002\022\006\022\004\030\0010\0020\001H\b¢\006\002\b\016\032\024\020\017\032\0020\002*\0020\0022\b\b\002\020\020\032\0020\002\032\036\020\021\032\0020\002*\0020\0022\b\b\002\020\020\032\0020\0022\b\b\002\020\022\032\0020\002\032\n\020\023\032\0020\002*\0020\002\032\024\020\024\032\0020\002*\0020\0022\b\b\002\020\022\032\0020\002¨\006\025"}, d2={"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, xs="kotlin/text/StringsKt")
class StringsKt__IndentKt
{
  @NotNull
  public static final String trimMargin(@NotNull String $receiver, @NotNull String marginPrefix)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(marginPrefix, "marginPrefix");return StringsKt.replaceIndentByMargin($receiver, "", marginPrefix);
  }
  
  /* Error */
  @NotNull
  public static final String replaceIndentByMargin(@NotNull String $receiver, @NotNull String newIndent, @NotNull String marginPrefix)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 9
    //   3: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 35
    //   9: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_2
    //   13: ldc 17
    //   15: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   18: aload_2
    //   19: checkcast 37	java/lang/CharSequence
    //   22: astore_3
    //   23: aload_3
    //   24: invokestatic 41	kotlin/text/StringsKt:isBlank	(Ljava/lang/CharSequence;)Z
    //   27: ifne +7 -> 34
    //   30: iconst_1
    //   31: goto +4 -> 35
    //   34: iconst_0
    //   35: istore_3
    //   36: iload_3
    //   37: ifne +23 -> 60
    //   40: ldc 43
    //   42: astore 5
    //   44: new 45	java/lang/IllegalArgumentException
    //   47: dup
    //   48: aload 5
    //   50: invokevirtual 49	java/lang/Object:toString	()Ljava/lang/String;
    //   53: invokespecial 53	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   56: checkcast 55	java/lang/Throwable
    //   59: athrow
    //   60: aload_0
    //   61: checkcast 37	java/lang/CharSequence
    //   64: invokestatic 59	kotlin/text/StringsKt:lines	(Ljava/lang/CharSequence;)Ljava/util/List;
    //   67: astore_3
    //   68: aload_3
    //   69: astore 4
    //   71: aload_0
    //   72: invokevirtual 65	java/lang/String:length	()I
    //   75: aload_1
    //   76: invokevirtual 65	java/lang/String:length	()I
    //   79: aload_3
    //   80: invokeinterface 70 1 0
    //   85: imul
    //   86: iadd
    //   87: istore 5
    //   89: aload_1
    //   90: invokestatic 74	kotlin/text/StringsKt__IndentKt:getIndentFunction$StringsKt__IndentKt	(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;
    //   93: astore 6
    //   95: aload 4
    //   97: invokestatic 80	kotlin/collections/CollectionsKt:getLastIndex	(Ljava/util/List;)I
    //   100: istore 7
    //   102: aload 4
    //   104: checkcast 82	java/lang/Iterable
    //   107: astore 8
    //   109: aload 8
    //   111: astore 9
    //   113: new 84	java/util/ArrayList
    //   116: dup
    //   117: invokespecial 87	java/util/ArrayList:<init>	()V
    //   120: checkcast 89	java/util/Collection
    //   123: astore 10
    //   125: aload 9
    //   127: astore 11
    //   129: iconst_0
    //   130: istore 12
    //   132: aload 11
    //   134: invokeinterface 93 1 0
    //   139: astore 13
    //   141: aload 13
    //   143: invokeinterface 99 1 0
    //   148: ifeq +273 -> 421
    //   151: aload 13
    //   153: invokeinterface 103 1 0
    //   158: astore 14
    //   160: iload 12
    //   162: iinc 12 1
    //   165: istore 15
    //   167: iload 15
    //   169: ifge +6 -> 175
    //   172: invokestatic 106	kotlin/collections/CollectionsKt:throwIndexOverflow	()V
    //   175: iload 15
    //   177: istore 16
    //   179: iload 16
    //   181: aload 14
    //   183: astore 17
    //   185: istore 18
    //   187: iload 18
    //   189: aload 17
    //   191: checkcast 61	java/lang/String
    //   194: astore 19
    //   196: istore 20
    //   198: iload 20
    //   200: ifeq +10 -> 210
    //   203: iload 20
    //   205: iload 7
    //   207: if_icmpne +18 -> 225
    //   210: aload 19
    //   212: checkcast 37	java/lang/CharSequence
    //   215: invokestatic 41	kotlin/text/StringsKt:isBlank	(Ljava/lang/CharSequence;)Z
    //   218: ifeq +7 -> 225
    //   221: aconst_null
    //   222: goto +171 -> 393
    //   225: aload 19
    //   227: astore 21
    //   229: aload 21
    //   231: checkcast 37	java/lang/CharSequence
    //   234: astore 22
    //   236: iconst_0
    //   237: istore 23
    //   239: aload 22
    //   241: invokeinterface 107 1 0
    //   246: istore 24
    //   248: iload 23
    //   250: iload 24
    //   252: if_icmpge +41 -> 293
    //   255: aload 22
    //   257: iload 23
    //   259: invokeinterface 111 2 0
    //   264: istore 25
    //   266: iload 25
    //   268: invokestatic 117	kotlin/text/CharsKt:isWhitespace	(C)Z
    //   271: ifne +7 -> 278
    //   274: iconst_1
    //   275: goto +4 -> 279
    //   278: iconst_0
    //   279: ifeq +8 -> 287
    //   282: iload 23
    //   284: goto +10 -> 294
    //   287: iinc 23 1
    //   290: goto -42 -> 248
    //   293: iconst_m1
    //   294: istore 26
    //   296: iload 26
    //   298: iconst_m1
    //   299: if_icmpne +7 -> 306
    //   302: aconst_null
    //   303: goto +61 -> 364
    //   306: aload 21
    //   308: aload_2
    //   309: iload 26
    //   311: iconst_0
    //   312: iconst_4
    //   313: aconst_null
    //   314: invokestatic 121	kotlin/text/StringsKt:startsWith$default	(Ljava/lang/String;Ljava/lang/String;IZILjava/lang/Object;)Z
    //   317: ifeq +46 -> 363
    //   320: aload 21
    //   322: astore 22
    //   324: iload 26
    //   326: aload_2
    //   327: invokevirtual 65	java/lang/String:length	()I
    //   330: iadd
    //   331: istore 23
    //   333: aload 22
    //   335: dup
    //   336: ifnonnull +13 -> 349
    //   339: new 123	kotlin/TypeCastException
    //   342: dup
    //   343: ldc 125
    //   345: invokespecial 126	kotlin/TypeCastException:<init>	(Ljava/lang/String;)V
    //   348: athrow
    //   349: iload 23
    //   351: invokevirtual 130	java/lang/String:substring	(I)Ljava/lang/String;
    //   354: dup
    //   355: ldc -124
    //   357: invokestatic 135	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   360: goto +4 -> 364
    //   363: aconst_null
    //   364: nop
    //   365: dup
    //   366: ifnull +24 -> 390
    //   369: astore 30
    //   371: aload 6
    //   373: aload 30
    //   375: invokeinterface 141 2 0
    //   380: checkcast 61	java/lang/String
    //   383: dup
    //   384: ifnull +6 -> 390
    //   387: goto +6 -> 393
    //   390: pop
    //   391: aload 19
    //   393: dup
    //   394: ifnull +22 -> 416
    //   397: astore 31
    //   399: aload 31
    //   401: astore 32
    //   403: aload 10
    //   405: aload 32
    //   407: invokeinterface 145 2 0
    //   412: pop
    //   413: goto +4 -> 417
    //   416: pop
    //   417: nop
    //   418: goto -277 -> 141
    //   421: nop
    //   422: aload 10
    //   424: checkcast 67	java/util/List
    //   427: checkcast 82	java/lang/Iterable
    //   430: new 147	java/lang/StringBuilder
    //   433: dup
    //   434: iload 5
    //   436: invokespecial 150	java/lang/StringBuilder:<init>	(I)V
    //   439: checkcast 152	java/lang/Appendable
    //   442: ldc -102
    //   444: checkcast 37	java/lang/CharSequence
    //   447: aconst_null
    //   448: aconst_null
    //   449: iconst_0
    //   450: aconst_null
    //   451: aconst_null
    //   452: bipush 124
    //   454: aconst_null
    //   455: invokestatic 158	kotlin/collections/CollectionsKt:joinTo$default	(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Appendable;
    //   458: checkcast 147	java/lang/StringBuilder
    //   461: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   464: dup
    //   465: ldc -95
    //   467: invokestatic 135	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   470: areturn
    // Line number table:
    //   Java source line #34	-> byte code offset #18
    //   Java source line #34	-> byte code offset #36
    //   Java source line #34	-> byte code offset #40
    //   Java source line #34	-> byte code offset #42
    //   Java source line #35	-> byte code offset #60
    //   Java source line #37	-> byte code offset #68
    //   Java source line #122	-> byte code offset #95
    //   Java source line #123	-> byte code offset #102
    //   Java source line #130	-> byte code offset #102
    //   Java source line #123	-> byte code offset #102
    //   Java source line #131	-> byte code offset #102
    //   Java source line #123	-> byte code offset #102
    //   Java source line #132	-> byte code offset #109
    //   Java source line #142	-> byte code offset #125
    //   Java source line #143	-> byte code offset #129
    //   Java source line #144	-> byte code offset #132
    //   Java source line #144	-> byte code offset #181
    //   Java source line #142	-> byte code offset #187
    //   Java source line #145	-> byte code offset #198
    //   Java source line #146	-> byte code offset #221
    //   Java source line #148	-> byte code offset #225
    //   Java source line #38	-> byte code offset #229
    //   Java source line #149	-> byte code offset #236
    //   Java source line #150	-> byte code offset #255
    //   Java source line #38	-> byte code offset #266
    //   Java source line #151	-> byte code offset #282
    //   Java source line #149	-> byte code offset #287
    //   Java source line #154	-> byte code offset #293
    //   Java source line #38	-> byte code offset #294
    //   Java source line #40	-> byte code offset #296
    //   Java source line #41	-> byte code offset #296
    //   Java source line #42	-> byte code offset #306
    //   Java source line #43	-> byte code offset #363
    //   Java source line #40	-> byte code offset #364
    //   Java source line #44	-> byte code offset #364
    //   Java source line #148	-> byte code offset #391
    //   Java source line #145	-> byte code offset #393
    //   Java source line #148	-> byte code offset #393
    //   Java source line #142	-> byte code offset #403
    //   Java source line #142	-> byte code offset #413
    //   Java source line #142	-> byte code offset #417
    //   Java source line #155	-> byte code offset #421
    //   Java source line #156	-> byte code offset #422
    //   Java source line #131	-> byte code offset #430
    //   Java source line #130	-> byte code offset #461
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	471	0	$receiver	String
    //   0	471	1	newIndent	String
    //   0	471	2	marginPrefix	String
    //   68	403	3	lines	java.util.List
    //   40	2	4	$i$a$1$require	int
    //   95	375	4	$receiver$iv	java.util.List
    //   95	375	5	resultSizeEstimate$iv	int
    //   95	375	6	indentAddFunction$iv	Function1
    //   102	368	7	lastIndex$iv	int
    //   109	318	8	$receiver$iv$iv	Iterable
    //   125	299	9	$receiver$iv$iv$iv	Iterable
    //   125	299	10	destination$iv$iv$iv	java.util.Collection
    //   129	293	11	$receiver$iv$iv$iv$iv	Iterable
    //   132	290	12	index$iv$iv$iv$iv	int
    //   160	258	14	item$iv$iv$iv$iv	Object
    //   187	230	17	element$iv$iv$iv	Object
    //   187	230	18	index$iv$iv$iv	int
    //   198	195	19	value$iv	String
    //   198	195	20	index$iv	int
    //   229	136	21	line	String
    //   236	58	22	$receiver$iv	CharSequence
    //   255	35	23	index$iv	int
    //   266	13	25	it	char
    //   296	68	26	firstNonWhitespaceIndex	int
    //   266	13	27	$i$a$1$indexOfFirst	int
    //   236	58	28	$i$f$indexOfFirst	int
    //   229	136	29	$i$a$2$reindent	int
    //   403	9	32	it$iv$iv$iv	Object
    //   198	195	33	$i$a$1$mapIndexedNotNull	int
    //   403	9	34	$i$a$1$let	int
    //   187	230	35	$i$a$1$forEachIndexed	int
    //   129	293	36	$i$f$forEachIndexed	int
    //   125	299	37	$i$f$mapIndexedNotNullTo	int
    //   109	318	38	$i$f$mapIndexedNotNull	int
    //   95	375	39	$i$f$reindent$StringsKt__IndentKt	int
  }
  
  @NotNull
  public static final String trimIndent(@NotNull String $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return StringsKt.replaceIndent($receiver, "");
  }
  
  /* Error */
  @NotNull
  public static final String replaceIndent(@NotNull String $receiver, @NotNull String newIndent)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 9
    //   3: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 35
    //   9: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: checkcast 37	java/lang/CharSequence
    //   16: invokestatic 59	kotlin/text/StringsKt:lines	(Ljava/lang/CharSequence;)Ljava/util/List;
    //   19: astore_2
    //   20: aload_2
    //   21: checkcast 82	java/lang/Iterable
    //   24: astore 4
    //   26: nop
    //   27: aload 4
    //   29: astore 5
    //   31: new 84	java/util/ArrayList
    //   34: dup
    //   35: invokespecial 87	java/util/ArrayList:<init>	()V
    //   38: checkcast 89	java/util/Collection
    //   41: astore 6
    //   43: aload 5
    //   45: invokeinterface 93 1 0
    //   50: astore 7
    //   52: aload 7
    //   54: invokeinterface 99 1 0
    //   59: ifeq +55 -> 114
    //   62: aload 7
    //   64: invokeinterface 103 1 0
    //   69: astore 8
    //   71: aload 8
    //   73: checkcast 61	java/lang/String
    //   76: astore 9
    //   78: aload 9
    //   80: checkcast 37	java/lang/CharSequence
    //   83: astore 10
    //   85: aload 10
    //   87: invokestatic 41	kotlin/text/StringsKt:isBlank	(Ljava/lang/CharSequence;)Z
    //   90: ifne +7 -> 97
    //   93: iconst_1
    //   94: goto +4 -> 98
    //   97: iconst_0
    //   98: ifeq -46 -> 52
    //   101: aload 6
    //   103: aload 8
    //   105: invokeinterface 145 2 0
    //   110: pop
    //   111: goto -59 -> 52
    //   114: aload 6
    //   116: checkcast 67	java/util/List
    //   119: checkcast 82	java/lang/Iterable
    //   122: astore 4
    //   124: nop
    //   125: aload 4
    //   127: astore 5
    //   129: new 84	java/util/ArrayList
    //   132: dup
    //   133: aload 4
    //   135: bipush 10
    //   137: invokestatic 209	kotlin/collections/CollectionsKt:collectionSizeOrDefault	(Ljava/lang/Iterable;I)I
    //   140: invokespecial 210	java/util/ArrayList:<init>	(I)V
    //   143: checkcast 89	java/util/Collection
    //   146: astore 6
    //   148: aload 5
    //   150: invokeinterface 93 1 0
    //   155: astore 7
    //   157: aload 7
    //   159: invokeinterface 99 1 0
    //   164: ifeq +46 -> 210
    //   167: aload 7
    //   169: invokeinterface 103 1 0
    //   174: astore 8
    //   176: aload 6
    //   178: aload 8
    //   180: checkcast 61	java/lang/String
    //   183: astore 9
    //   185: astore 33
    //   187: aload 9
    //   189: invokestatic 214	kotlin/text/StringsKt__IndentKt:indentWidth$StringsKt__IndentKt	(Ljava/lang/String;)I
    //   192: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   195: astore 34
    //   197: aload 33
    //   199: aload 34
    //   201: invokeinterface 145 2 0
    //   206: pop
    //   207: goto -50 -> 157
    //   210: aload 6
    //   212: checkcast 67	java/util/List
    //   215: checkcast 82	java/lang/Iterable
    //   218: invokestatic 224	kotlin/collections/CollectionsKt:min	(Ljava/lang/Iterable;)Ljava/lang/Comparable;
    //   221: checkcast 216	java/lang/Integer
    //   224: dup
    //   225: ifnull +9 -> 234
    //   228: invokevirtual 227	java/lang/Integer:intValue	()I
    //   231: goto +5 -> 236
    //   234: pop
    //   235: iconst_0
    //   236: istore_3
    //   237: aload_2
    //   238: astore 4
    //   240: aload_0
    //   241: invokevirtual 65	java/lang/String:length	()I
    //   244: aload_1
    //   245: invokevirtual 65	java/lang/String:length	()I
    //   248: aload_2
    //   249: invokeinterface 70 1 0
    //   254: imul
    //   255: iadd
    //   256: istore 5
    //   258: aload_1
    //   259: invokestatic 74	kotlin/text/StringsKt__IndentKt:getIndentFunction$StringsKt__IndentKt	(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;
    //   262: astore 6
    //   264: aload 4
    //   266: invokestatic 80	kotlin/collections/CollectionsKt:getLastIndex	(Ljava/util/List;)I
    //   269: istore 7
    //   271: aload 4
    //   273: checkcast 82	java/lang/Iterable
    //   276: astore 8
    //   278: aload 8
    //   280: astore 9
    //   282: new 84	java/util/ArrayList
    //   285: dup
    //   286: invokespecial 87	java/util/ArrayList:<init>	()V
    //   289: checkcast 89	java/util/Collection
    //   292: astore 10
    //   294: aload 9
    //   296: astore 11
    //   298: iconst_0
    //   299: istore 12
    //   301: aload 11
    //   303: invokeinterface 93 1 0
    //   308: astore 13
    //   310: aload 13
    //   312: invokeinterface 99 1 0
    //   317: ifeq +143 -> 460
    //   320: aload 13
    //   322: invokeinterface 103 1 0
    //   327: astore 14
    //   329: iload 12
    //   331: iinc 12 1
    //   334: istore 15
    //   336: iload 15
    //   338: ifge +6 -> 344
    //   341: invokestatic 106	kotlin/collections/CollectionsKt:throwIndexOverflow	()V
    //   344: iload 15
    //   346: istore 16
    //   348: iload 16
    //   350: aload 14
    //   352: astore 17
    //   354: istore 18
    //   356: iload 18
    //   358: aload 17
    //   360: checkcast 61	java/lang/String
    //   363: astore 19
    //   365: istore 20
    //   367: iload 20
    //   369: ifeq +10 -> 379
    //   372: iload 20
    //   374: iload 7
    //   376: if_icmpne +18 -> 394
    //   379: aload 19
    //   381: checkcast 37	java/lang/CharSequence
    //   384: invokestatic 41	kotlin/text/StringsKt:isBlank	(Ljava/lang/CharSequence;)Z
    //   387: ifeq +7 -> 394
    //   390: aconst_null
    //   391: goto +41 -> 432
    //   394: aload 19
    //   396: astore 21
    //   398: aload 21
    //   400: iload_3
    //   401: invokestatic 231	kotlin/text/StringsKt:drop	(Ljava/lang/String;I)Ljava/lang/String;
    //   404: dup
    //   405: ifnull +24 -> 429
    //   408: astore 23
    //   410: aload 6
    //   412: aload 23
    //   414: invokeinterface 141 2 0
    //   419: checkcast 61	java/lang/String
    //   422: dup
    //   423: ifnull +6 -> 429
    //   426: goto +6 -> 432
    //   429: pop
    //   430: aload 19
    //   432: dup
    //   433: ifnull +22 -> 455
    //   436: astore 24
    //   438: aload 24
    //   440: astore 25
    //   442: aload 10
    //   444: aload 25
    //   446: invokeinterface 145 2 0
    //   451: pop
    //   452: goto +4 -> 456
    //   455: pop
    //   456: nop
    //   457: goto -147 -> 310
    //   460: nop
    //   461: aload 10
    //   463: checkcast 67	java/util/List
    //   466: checkcast 82	java/lang/Iterable
    //   469: new 147	java/lang/StringBuilder
    //   472: dup
    //   473: iload 5
    //   475: invokespecial 150	java/lang/StringBuilder:<init>	(I)V
    //   478: checkcast 152	java/lang/Appendable
    //   481: ldc -102
    //   483: checkcast 37	java/lang/CharSequence
    //   486: aconst_null
    //   487: aconst_null
    //   488: iconst_0
    //   489: aconst_null
    //   490: aconst_null
    //   491: bipush 124
    //   493: aconst_null
    //   494: invokestatic 158	kotlin/collections/CollectionsKt:joinTo$default	(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Appendable;
    //   497: checkcast 147	java/lang/StringBuilder
    //   500: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   503: dup
    //   504: ldc -95
    //   506: invokestatic 135	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   509: areturn
    // Line number table:
    //   Java source line #69	-> byte code offset #12
    //   Java source line #71	-> byte code offset #20
    //   Java source line #74	-> byte code offset #20
    //   Java source line #71	-> byte code offset #20
    //   Java source line #73	-> byte code offset #20
    //   Java source line #71	-> byte code offset #20
    //   Java source line #72	-> byte code offset #20
    //   Java source line #71	-> byte code offset #20
    //   Java source line #72	-> byte code offset #26
    //   Java source line #157	-> byte code offset #27
    //   Java source line #158	-> byte code offset #43
    //   Java source line #72	-> byte code offset #85
    //   Java source line #159	-> byte code offset #114
    //   Java source line #73	-> byte code offset #124
    //   Java source line #160	-> byte code offset #125
    //   Java source line #161	-> byte code offset #148
    //   Java source line #162	-> byte code offset #176
    //   Java source line #73	-> byte code offset #189
    //   Java source line #161	-> byte code offset #207
    //   Java source line #163	-> byte code offset #210
    //   Java source line #74	-> byte code offset #218
    //   Java source line #71	-> byte code offset #236
    //   Java source line #76	-> byte code offset #237
    //   Java source line #164	-> byte code offset #264
    //   Java source line #165	-> byte code offset #271
    //   Java source line #172	-> byte code offset #271
    //   Java source line #165	-> byte code offset #271
    //   Java source line #173	-> byte code offset #271
    //   Java source line #165	-> byte code offset #271
    //   Java source line #174	-> byte code offset #278
    //   Java source line #184	-> byte code offset #294
    //   Java source line #185	-> byte code offset #298
    //   Java source line #186	-> byte code offset #301
    //   Java source line #186	-> byte code offset #350
    //   Java source line #184	-> byte code offset #356
    //   Java source line #187	-> byte code offset #367
    //   Java source line #188	-> byte code offset #390
    //   Java source line #190	-> byte code offset #394
    //   Java source line #76	-> byte code offset #398
    //   Java source line #190	-> byte code offset #430
    //   Java source line #187	-> byte code offset #432
    //   Java source line #190	-> byte code offset #432
    //   Java source line #184	-> byte code offset #442
    //   Java source line #184	-> byte code offset #452
    //   Java source line #184	-> byte code offset #456
    //   Java source line #191	-> byte code offset #460
    //   Java source line #192	-> byte code offset #461
    //   Java source line #173	-> byte code offset #469
    //   Java source line #172	-> byte code offset #500
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	510	0	$receiver	String
    //   0	510	1	newIndent	String
    //   20	490	2	lines	java.util.List
    //   237	273	3	minCommonIndent	int
    //   27	92	4	$receiver$iv	Iterable
    //   125	90	4	$receiver$iv	Iterable
    //   264	245	4	$receiver$iv	java.util.List
    //   43	73	5	$receiver$iv$iv	Iterable
    //   148	64	5	$receiver$iv$iv	Iterable
    //   264	245	5	resultSizeEstimate$iv	int
    //   43	73	6	destination$iv$iv	java.util.Collection
    //   148	64	6	destination$iv$iv	java.util.Collection
    //   264	245	6	indentAddFunction$iv	Function1
    //   271	238	7	lastIndex$iv	int
    //   71	40	8	element$iv$iv	Object
    //   176	31	8	item$iv$iv	Object
    //   278	188	8	$receiver$iv$iv	Iterable
    //   78	20	9	p1	String
    //   187	5	9	p1	String
    //   294	169	9	$receiver$iv$iv$iv	Iterable
    //   187	5	10	$i$a$2$unknown	int
    //   294	169	10	destination$iv$iv$iv	java.util.Collection
    //   78	20	11	$i$a$1$unknown	int
    //   148	64	11	$i$f$mapTo	int
    //   298	163	11	$receiver$iv$iv$iv$iv	Iterable
    //   43	73	12	$i$f$filterTo	int
    //   125	90	12	$i$f$map	int
    //   301	160	12	index$iv$iv$iv$iv	int
    //   27	92	13	$i$f$filter	int
    //   329	128	14	item$iv$iv$iv$iv	Object
    //   356	100	17	element$iv$iv$iv	Object
    //   356	100	18	index$iv$iv$iv	int
    //   367	65	19	value$iv	String
    //   367	65	20	index$iv	int
    //   398	6	21	line	String
    //   398	6	22	$i$a$1$reindent	int
    //   442	9	25	it$iv$iv$iv	Object
    //   367	65	26	$i$a$1$mapIndexedNotNull	int
    //   442	9	27	$i$a$1$let	int
    //   356	100	28	$i$a$1$forEachIndexed	int
    //   298	163	29	$i$f$forEachIndexed	int
    //   294	169	30	$i$f$mapIndexedNotNullTo	int
    //   278	188	31	$i$f$mapIndexedNotNull	int
    //   264	245	32	$i$f$reindent$StringsKt__IndentKt	int
  }
  
  @NotNull
  public static final String prependIndent(@NotNull String $receiver, @NotNull String indent)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(indent, "indent");
    










    SequencesKt.joinToString$default(SequencesKt.map(StringsKt.lineSequence((CharSequence)$receiver), (Function1)new Lambda(indent) {
      @NotNull
      public final String invoke(@NotNull String it) { Intrinsics.checkParameterIsNotNull(it, "it");
        





        return $indent + it;
      }
    }), (CharSequence)"\n", null, null, 0, null, null, 62, null); }
  
  private static final int indentWidth$StringsKt__IndentKt(@NotNull String $receiver) { CharSequence $receiver$iv = (CharSequence)$receiver;
    













































    int $i$f$indexOfFirst;
    













































    int i = 0; int index$iv; char it; int $i$a$1$indexOfFirst; for (int k = $receiver$iv.length(); i < k; index$iv++) {
      it = $receiver$iv.charAt(index$iv);
    }
    

    $receiver$iv = (!CharsKt.isWhitespace(it) ? 1 : 0) != 0 ? index$iv : -1;
    int j;
    int j = $receiver$iv; int $i$a$2$let; return j == -1 ? $receiver.length() : j;
  }
  
  private static final Function1<String, String> getIndentFunction$StringsKt__IndentKt(String indent) { CharSequence localCharSequence = (CharSequence)indent;(localCharSequence.length() == 0 ? 1 : 0) != 0 ? (Function1)getIndentFunction.1.INSTANCE : 
      (Function1)new Lambda(indent) { @NotNull
        public final String invoke(@NotNull String line) { Intrinsics.checkParameterIsNotNull(line, "line");return $indent + line;
        }
      };
    }
    
    /* Error */
    private static final String reindent$StringsKt__IndentKt(@NotNull java.util.List<String> $receiver, int resultSizeEstimate, Function1<? super String, String> indentAddFunction, Function1<? super String, String> indentCutFunction)
    {
      // Byte code:
      //   0: aload_0
      //   1: invokestatic 80	kotlin/collections/CollectionsKt:getLastIndex	(Ljava/util/List;)I
      //   4: istore 5
      //   6: aload_0
      //   7: checkcast 82	java/lang/Iterable
      //   10: astore 6
      //   12: aload 6
      //   14: astore 7
      //   16: new 84	java/util/ArrayList
      //   19: dup
      //   20: invokespecial 87	java/util/ArrayList:<init>	()V
      //   23: checkcast 89	java/util/Collection
      //   26: astore 8
      //   28: aload 7
      //   30: astore 9
      //   32: iconst_0
      //   33: istore 10
      //   35: aload 9
      //   37: invokeinterface 93 1 0
      //   42: astore 11
      //   44: aload 11
      //   46: invokeinterface 99 1 0
      //   51: ifeq +169 -> 220
      //   54: aload 11
      //   56: invokeinterface 103 1 0
      //   61: astore 12
      //   63: iload 10
      //   65: iinc 10 1
      //   68: istore 13
      //   70: iload 13
      //   72: ifge +32 -> 104
      //   75: iconst_1
      //   76: iconst_3
      //   77: iconst_0
      //   78: invokestatic 287	kotlin/internal/PlatformImplementationsKt:apiVersionIsAtLeast	(III)Z
      //   81: ifeq +9 -> 90
      //   84: invokestatic 106	kotlin/collections/CollectionsKt:throwIndexOverflow	()V
      //   87: goto +17 -> 104
      //   90: new 289	java/lang/ArithmeticException
      //   93: dup
      //   94: ldc_w 291
      //   97: invokespecial 292	java/lang/ArithmeticException:<init>	(Ljava/lang/String;)V
      //   100: checkcast 55	java/lang/Throwable
      //   103: athrow
      //   104: iload 13
      //   106: istore 14
      //   108: iload 14
      //   110: aload 12
      //   112: astore 15
      //   114: istore 16
      //   116: iload 16
      //   118: aload 15
      //   120: checkcast 61	java/lang/String
      //   123: astore 17
      //   125: istore 18
      //   127: iload 18
      //   129: ifeq +10 -> 139
      //   132: iload 18
      //   134: iload 5
      //   136: if_icmpne +18 -> 154
      //   139: aload 17
      //   141: checkcast 37	java/lang/CharSequence
      //   144: invokestatic 41	kotlin/text/StringsKt:isBlank	(Ljava/lang/CharSequence;)Z
      //   147: ifeq +7 -> 154
      //   150: aconst_null
      //   151: goto +41 -> 192
      //   154: aload_3
      //   155: aload 17
      //   157: invokeinterface 141 2 0
      //   162: checkcast 61	java/lang/String
      //   165: dup
      //   166: ifnull +23 -> 189
      //   169: astore 19
      //   171: aload_2
      //   172: aload 19
      //   174: invokeinterface 141 2 0
      //   179: checkcast 61	java/lang/String
      //   182: dup
      //   183: ifnull +6 -> 189
      //   186: goto +6 -> 192
      //   189: pop
      //   190: aload 17
      //   192: dup
      //   193: ifnull +22 -> 215
      //   196: astore 21
      //   198: aload 21
      //   200: astore 22
      //   202: aload 8
      //   204: aload 22
      //   206: invokeinterface 145 2 0
      //   211: pop
      //   212: goto +4 -> 216
      //   215: pop
      //   216: nop
      //   217: goto -173 -> 44
      //   220: nop
      //   221: aload 8
      //   223: checkcast 67	java/util/List
      //   226: checkcast 82	java/lang/Iterable
      //   229: new 147	java/lang/StringBuilder
      //   232: dup
      //   233: iload_1
      //   234: invokespecial 150	java/lang/StringBuilder:<init>	(I)V
      //   237: checkcast 152	java/lang/Appendable
      //   240: ldc -102
      //   242: checkcast 37	java/lang/CharSequence
      //   245: aconst_null
      //   246: aconst_null
      //   247: iconst_0
      //   248: aconst_null
      //   249: aconst_null
      //   250: bipush 124
      //   252: aconst_null
      //   253: invokestatic 158	kotlin/collections/CollectionsKt:joinTo$default	(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Appendable;
      //   256: checkcast 147	java/lang/StringBuilder
      //   259: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   262: dup
      //   263: ldc -95
      //   265: invokestatic 135	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
      //   268: areturn
      // Line number table:
      //   Java source line #111	-> byte code offset #0
      //   Java source line #112	-> byte code offset #6
      //   Java source line #119	-> byte code offset #6
      //   Java source line #112	-> byte code offset #6
      //   Java source line #118	-> byte code offset #6
      //   Java source line #112	-> byte code offset #6
      //   Java source line #199	-> byte code offset #12
      //   Java source line #209	-> byte code offset #28
      //   Java source line #210	-> byte code offset #32
      //   Java source line #211	-> byte code offset #35
      //   Java source line #211	-> byte code offset #110
      //   Java source line #209	-> byte code offset #116
      //   Java source line #113	-> byte code offset #127
      //   Java source line #114	-> byte code offset #150
      //   Java source line #116	-> byte code offset #154
      //   Java source line #116	-> byte code offset #190
      //   Java source line #113	-> byte code offset #192
      //   Java source line #116	-> byte code offset #192
      //   Java source line #209	-> byte code offset #202
      //   Java source line #209	-> byte code offset #212
      //   Java source line #209	-> byte code offset #216
      //   Java source line #212	-> byte code offset #220
      //   Java source line #213	-> byte code offset #221
      //   Java source line #118	-> byte code offset #229
      //   Java source line #119	-> byte code offset #259
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	269	0	$receiver	java.util.List
      //   0	269	1	resultSizeEstimate	int
      //   0	269	2	indentAddFunction	Function1
      //   0	269	3	indentCutFunction	Function1
      //   0	269	4	$i$f$reindent$StringsKt__IndentKt	int
      //   6	263	5	lastIndex	int
      //   12	214	6	$receiver$iv	Iterable
      //   28	195	7	$receiver$iv$iv	Iterable
      //   28	195	8	destination$iv$iv	java.util.Collection
      //   32	189	9	$receiver$iv$iv$iv	Iterable
      //   35	186	10	index$iv$iv$iv	int
      //   63	154	12	item$iv$iv$iv	Object
      //   116	100	15	element$iv$iv	Object
      //   116	100	16	index$iv$iv	int
      //   127	65	17	value	String
      //   127	65	18	index	int
      //   127	65	20	$i$a$1$mapIndexedNotNull	int
      //   202	9	22	it$iv$iv	Object
      //   202	9	23	$i$a$1$let	int
      //   116	100	24	$i$a$1$forEachIndexed	int
      //   32	189	25	$i$f$forEachIndexed	int
      //   28	195	26	$i$f$mapIndexedNotNullTo	int
      //   12	214	27	$i$f$mapIndexedNotNull	int
    }
    
    public StringsKt__IndentKt() {}
  }

package kotlin.text;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000.\n\000\n\002\020\001\n\000\n\002\020\016\n\000\n\002\020\005\n\002\b\002\n\002\020\b\n\002\b\005\n\002\020\t\n\002\b\003\n\002\020\n\n\002\b\003\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\000\032\023\020\004\032\004\030\0010\005*\0020\003H\007¢\006\002\020\006\032\033\020\004\032\004\030\0010\005*\0020\0032\006\020\007\032\0020\bH\007¢\006\002\020\t\032\023\020\n\032\004\030\0010\b*\0020\003H\007¢\006\002\020\013\032\033\020\n\032\004\030\0010\b*\0020\0032\006\020\007\032\0020\bH\007¢\006\002\020\f\032\023\020\r\032\004\030\0010\016*\0020\003H\007¢\006\002\020\017\032\033\020\r\032\004\030\0010\016*\0020\0032\006\020\007\032\0020\bH\007¢\006\002\020\020\032\023\020\021\032\004\030\0010\022*\0020\003H\007¢\006\002\020\023\032\033\020\021\032\004\030\0010\022*\0020\0032\006\020\007\032\0020\bH\007¢\006\002\020\024¨\006\025"}, d2={"numberFormatError", "", "input", "", "toByteOrNull", "", "(Ljava/lang/String;)Ljava/lang/Byte;", "radix", "", "(Ljava/lang/String;I)Ljava/lang/Byte;", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)Ljava/lang/Integer;", "toLongOrNull", "", "(Ljava/lang/String;)Ljava/lang/Long;", "(Ljava/lang/String;I)Ljava/lang/Long;", "toShortOrNull", "", "(Ljava/lang/String;)Ljava/lang/Short;", "(Ljava/lang/String;I)Ljava/lang/Short;", "kotlin-stdlib"}, xs="kotlin/text/StringsKt")
class StringsKt__StringNumberConversionsKt
  extends StringsKt__StringNumberConversionsJVMKt
{
  @SinceKotlin(version="1.1")
  @Nullable
  public static final Byte toByteOrNull(@NotNull String $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return StringsKt.toByteOrNull($receiver, 10);
  }
  
  /* Error */
  @SinceKotlin(version="1.1")
  @Nullable
  public static final Byte toByteOrNull(@NotNull String $receiver, int radix)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 13
    //   3: invokestatic 19	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: iload_1
    //   8: invokestatic 30	kotlin/text/StringsKt:toIntOrNull	(Ljava/lang/String;I)Ljava/lang/Integer;
    //   11: dup
    //   12: ifnull +9 -> 21
    //   15: invokevirtual 36	java/lang/Integer:intValue	()I
    //   18: goto +6 -> 24
    //   21: pop
    //   22: aconst_null
    //   23: areturn
    //   24: istore_2
    //   25: iload_2
    //   26: bipush -128
    //   28: if_icmplt +9 -> 37
    //   31: iload_2
    //   32: bipush 127
    //   34: if_icmple +5 -> 39
    //   37: aconst_null
    //   38: areturn
    //   39: iload_2
    //   40: i2b
    //   41: invokestatic 42	java/lang/Byte:valueOf	(B)Ljava/lang/Byte;
    //   44: areturn
    // Line number table:
    //   Java source line #27	-> byte code offset #6
    //   Java source line #28	-> byte code offset #25
    //   Java source line #29	-> byte code offset #39
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	$receiver	String
    //   0	45	1	radix	int
    //   25	20	2	int	int
  }
  
  @SinceKotlin(version="1.1")
  @Nullable
  public static final Short toShortOrNull(@NotNull String $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return StringsKt.toShortOrNull($receiver, 10);
  }
  
  /* Error */
  @SinceKotlin(version="1.1")
  @Nullable
  public static final Short toShortOrNull(@NotNull String $receiver, int radix)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 13
    //   3: invokestatic 19	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: iload_1
    //   8: invokestatic 30	kotlin/text/StringsKt:toIntOrNull	(Ljava/lang/String;I)Ljava/lang/Integer;
    //   11: dup
    //   12: ifnull +9 -> 21
    //   15: invokevirtual 36	java/lang/Integer:intValue	()I
    //   18: goto +6 -> 24
    //   21: pop
    //   22: aconst_null
    //   23: areturn
    //   24: istore_2
    //   25: iload_2
    //   26: sipush 32768
    //   29: if_icmplt +10 -> 39
    //   32: iload_2
    //   33: sipush 32767
    //   36: if_icmple +5 -> 41
    //   39: aconst_null
    //   40: areturn
    //   41: iload_2
    //   42: i2s
    //   43: invokestatic 55	java/lang/Short:valueOf	(S)Ljava/lang/Short;
    //   46: areturn
    // Line number table:
    //   Java source line #47	-> byte code offset #6
    //   Java source line #48	-> byte code offset #25
    //   Java source line #49	-> byte code offset #41
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	$receiver	String
    //   0	47	1	radix	int
    //   25	22	2	int	int
  }
  
  @SinceKotlin(version="1.1")
  @Nullable
  public static final Integer toIntOrNull(@NotNull String $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return StringsKt.toIntOrNull($receiver, 10);
  }
  
  /* Error */
  @SinceKotlin(version="1.1")
  @Nullable
  public static final Integer toIntOrNull(@NotNull String $receiver, int radix)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 13
    //   3: invokestatic 19	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: iload_1
    //   7: invokestatic 62	kotlin/text/CharsKt:checkRadix	(I)I
    //   10: pop
    //   11: aload_0
    //   12: invokevirtual 67	java/lang/String:length	()I
    //   15: istore_2
    //   16: iload_2
    //   17: ifne +5 -> 22
    //   20: aconst_null
    //   21: areturn
    //   22: aload_0
    //   23: iconst_0
    //   24: invokevirtual 71	java/lang/String:charAt	(I)C
    //   27: istore 6
    //   29: iload 6
    //   31: bipush 48
    //   33: if_icmpge +51 -> 84
    //   36: iload_2
    //   37: iconst_1
    //   38: if_icmpne +5 -> 43
    //   41: aconst_null
    //   42: areturn
    //   43: iconst_1
    //   44: istore_3
    //   45: iload 6
    //   47: bipush 45
    //   49: if_icmpne +13 -> 62
    //   52: iconst_1
    //   53: istore 4
    //   55: ldc 72
    //   57: istore 5
    //   59: goto +34 -> 93
    //   62: iload 6
    //   64: bipush 43
    //   66: if_icmpne +13 -> 79
    //   69: iconst_0
    //   70: istore 4
    //   72: ldc 73
    //   74: istore 5
    //   76: goto +17 -> 93
    //   79: aconst_null
    //   80: areturn
    //   81: nop
    //   82: nop
    //   83: athrow
    //   84: iconst_0
    //   85: istore_3
    //   86: iconst_0
    //   87: istore 4
    //   89: ldc 73
    //   91: istore 5
    //   93: iload 5
    //   95: iload_1
    //   96: idiv
    //   97: istore 7
    //   99: iconst_0
    //   100: istore 8
    //   102: iload_3
    //   103: istore 9
    //   105: iload_2
    //   106: iconst_1
    //   107: isub
    //   108: istore 10
    //   110: iload 9
    //   112: iload 10
    //   114: if_icmpgt +69 -> 183
    //   117: aload_0
    //   118: iload 9
    //   120: invokevirtual 71	java/lang/String:charAt	(I)C
    //   123: iload_1
    //   124: invokestatic 77	kotlin/text/CharsKt:digitOf	(CI)I
    //   127: istore 11
    //   129: iload 11
    //   131: ifge +5 -> 136
    //   134: aconst_null
    //   135: areturn
    //   136: iload 8
    //   138: iload 7
    //   140: if_icmpge +5 -> 145
    //   143: aconst_null
    //   144: areturn
    //   145: iload 8
    //   147: iload_1
    //   148: imul
    //   149: istore 8
    //   151: iload 8
    //   153: iload 5
    //   155: iload 11
    //   157: iadd
    //   158: if_icmpge +5 -> 163
    //   161: aconst_null
    //   162: areturn
    //   163: iload 8
    //   165: iload 11
    //   167: isub
    //   168: istore 8
    //   170: iload 9
    //   172: iload 10
    //   174: if_icmpeq +9 -> 183
    //   177: iinc 9 1
    //   180: goto -63 -> 117
    //   183: iload 4
    //   185: ifeq +11 -> 196
    //   188: iload 8
    //   190: invokestatic 80	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   193: goto +9 -> 202
    //   196: iload 8
    //   198: ineg
    //   199: invokestatic 80	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   202: areturn
    // Line number table:
    //   Java source line #67	-> byte code offset #6
    //   Java source line #69	-> byte code offset #11
    //   Java source line #70	-> byte code offset #16
    //   Java source line #72	-> byte code offset #22
    //   Java source line #73	-> byte code offset #22
    //   Java source line #74	-> byte code offset #22
    //   Java source line #76	-> byte code offset #22
    //   Java source line #77	-> byte code offset #29
    //   Java source line #78	-> byte code offset #36
    //   Java source line #80	-> byte code offset #43
    //   Java source line #82	-> byte code offset #45
    //   Java source line #83	-> byte code offset #52
    //   Java source line #84	-> byte code offset #55
    //   Java source line #85	-> byte code offset #62
    //   Java source line #86	-> byte code offset #69
    //   Java source line #87	-> byte code offset #72
    //   Java source line #89	-> byte code offset #79
    //   Java source line #91	-> byte code offset #84
    //   Java source line #92	-> byte code offset #86
    //   Java source line #93	-> byte code offset #89
    //   Java source line #94	-> byte code offset #93
    //   Java source line #97	-> byte code offset #93
    //   Java source line #98	-> byte code offset #99
    //   Java source line #99	-> byte code offset #102
    //   Java source line #100	-> byte code offset #117
    //   Java source line #102	-> byte code offset #129
    //   Java source line #103	-> byte code offset #136
    //   Java source line #105	-> byte code offset #145
    //   Java source line #107	-> byte code offset #151
    //   Java source line #109	-> byte code offset #163
    //   Java source line #99	-> byte code offset #170
    //   Java source line #112	-> byte code offset #183
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	203	0	$receiver	String
    //   0	203	1	radix	int
    //   16	187	2	length	int
    //   22	181	3	start	int
    //   22	181	4	isNegative	boolean
    //   22	181	5	limit	int
    //   29	174	6	firstChar	char
    //   99	104	7	limitBeforeMul	int
    //   102	101	8	result	int
    //   117	63	9	i	int
    //   129	41	11	digit	int
  }
  
  @SinceKotlin(version="1.1")
  @Nullable
  public static final Long toLongOrNull(@NotNull String $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return StringsKt.toLongOrNull($receiver, 10);
  }
  
  /* Error */
  @SinceKotlin(version="1.1")
  @Nullable
  public static final Long toLongOrNull(@NotNull String $receiver, int radix)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 13
    //   3: invokestatic 19	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: iload_1
    //   7: invokestatic 62	kotlin/text/CharsKt:checkRadix	(I)I
    //   10: pop
    //   11: aload_0
    //   12: invokevirtual 67	java/lang/String:length	()I
    //   15: istore_2
    //   16: iload_2
    //   17: ifne +5 -> 22
    //   20: aconst_null
    //   21: areturn
    //   22: aload_0
    //   23: iconst_0
    //   24: invokevirtual 71	java/lang/String:charAt	(I)C
    //   27: istore 7
    //   29: iload 7
    //   31: bipush 48
    //   33: if_icmpge +53 -> 86
    //   36: iload_2
    //   37: iconst_1
    //   38: if_icmpne +5 -> 43
    //   41: aconst_null
    //   42: areturn
    //   43: iconst_1
    //   44: istore_3
    //   45: iload 7
    //   47: bipush 45
    //   49: if_icmpne +14 -> 63
    //   52: iconst_1
    //   53: istore 4
    //   55: ldc2_w 98
    //   58: lstore 5
    //   60: goto +36 -> 96
    //   63: iload 7
    //   65: bipush 43
    //   67: if_icmpne +14 -> 81
    //   70: iconst_0
    //   71: istore 4
    //   73: ldc2_w 100
    //   76: lstore 5
    //   78: goto +18 -> 96
    //   81: aconst_null
    //   82: areturn
    //   83: nop
    //   84: nop
    //   85: athrow
    //   86: iconst_0
    //   87: istore_3
    //   88: iconst_0
    //   89: istore 4
    //   91: ldc2_w 100
    //   94: lstore 5
    //   96: lload 5
    //   98: iload_1
    //   99: i2l
    //   100: ldiv
    //   101: lstore 8
    //   103: lconst_0
    //   104: lstore 10
    //   106: iload_3
    //   107: istore 12
    //   109: iload_2
    //   110: iconst_1
    //   111: isub
    //   112: istore 13
    //   114: iload 12
    //   116: iload 13
    //   118: if_icmpgt +74 -> 192
    //   121: aload_0
    //   122: iload 12
    //   124: invokevirtual 71	java/lang/String:charAt	(I)C
    //   127: iload_1
    //   128: invokestatic 77	kotlin/text/CharsKt:digitOf	(CI)I
    //   131: istore 14
    //   133: iload 14
    //   135: ifge +5 -> 140
    //   138: aconst_null
    //   139: areturn
    //   140: lload 10
    //   142: lload 8
    //   144: lcmp
    //   145: ifge +5 -> 150
    //   148: aconst_null
    //   149: areturn
    //   150: lload 10
    //   152: iload_1
    //   153: i2l
    //   154: lmul
    //   155: lstore 10
    //   157: lload 10
    //   159: lload 5
    //   161: iload 14
    //   163: i2l
    //   164: ladd
    //   165: lcmp
    //   166: ifge +5 -> 171
    //   169: aconst_null
    //   170: areturn
    //   171: lload 10
    //   173: iload 14
    //   175: i2l
    //   176: lsub
    //   177: lstore 10
    //   179: iload 12
    //   181: iload 13
    //   183: if_icmpeq +9 -> 192
    //   186: iinc 12 1
    //   189: goto -68 -> 121
    //   192: iload 4
    //   194: ifeq +11 -> 205
    //   197: lload 10
    //   199: invokestatic 106	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   202: goto +9 -> 211
    //   205: lload 10
    //   207: lneg
    //   208: invokestatic 106	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   211: areturn
    // Line number table:
    //   Java source line #130	-> byte code offset #6
    //   Java source line #132	-> byte code offset #11
    //   Java source line #133	-> byte code offset #16
    //   Java source line #135	-> byte code offset #22
    //   Java source line #136	-> byte code offset #22
    //   Java source line #137	-> byte code offset #22
    //   Java source line #139	-> byte code offset #22
    //   Java source line #140	-> byte code offset #29
    //   Java source line #141	-> byte code offset #36
    //   Java source line #143	-> byte code offset #43
    //   Java source line #145	-> byte code offset #45
    //   Java source line #146	-> byte code offset #52
    //   Java source line #147	-> byte code offset #55
    //   Java source line #148	-> byte code offset #63
    //   Java source line #149	-> byte code offset #70
    //   Java source line #150	-> byte code offset #73
    //   Java source line #152	-> byte code offset #81
    //   Java source line #154	-> byte code offset #86
    //   Java source line #155	-> byte code offset #88
    //   Java source line #156	-> byte code offset #91
    //   Java source line #157	-> byte code offset #96
    //   Java source line #160	-> byte code offset #96
    //   Java source line #161	-> byte code offset #103
    //   Java source line #162	-> byte code offset #106
    //   Java source line #163	-> byte code offset #121
    //   Java source line #165	-> byte code offset #133
    //   Java source line #166	-> byte code offset #140
    //   Java source line #168	-> byte code offset #150
    //   Java source line #170	-> byte code offset #157
    //   Java source line #172	-> byte code offset #171
    //   Java source line #162	-> byte code offset #179
    //   Java source line #175	-> byte code offset #192
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	$receiver	String
    //   0	212	1	radix	int
    //   16	196	2	length	int
    //   22	190	3	start	int
    //   22	190	4	isNegative	boolean
    //   22	190	5	limit	long
    //   29	183	7	firstChar	char
    //   103	109	8	limitBeforeMul	long
    //   106	106	10	result	long
    //   121	68	12	i	int
    //   133	46	14	digit	int
  }
  
  @NotNull
  public static final Void numberFormatError(@NotNull String input)
  {
    Intrinsics.checkParameterIsNotNull(input, "input");throw ((Throwable)new NumberFormatException("Invalid number format: '" + input + '\''));
  }
  
  public StringsKt__StringNumberConversionsKt() {}
}

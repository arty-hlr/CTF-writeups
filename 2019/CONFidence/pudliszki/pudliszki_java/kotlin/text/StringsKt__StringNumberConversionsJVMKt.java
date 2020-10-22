package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000X\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\013\n\000\n\002\020\005\n\000\n\002\020\006\n\002\b\003\n\002\020\007\n\002\b\004\n\002\020\t\n\000\n\002\020\n\n\002\b\002\0324\020\000\032\004\030\001H\001\"\004\b\000\020\0012\006\020\002\032\0020\0032\022\020\004\032\016\022\004\022\0020\003\022\004\022\002H\0010\005H\b¢\006\004\b\006\020\007\032\r\020\b\032\0020\t*\0020\003H\b\032\025\020\b\032\0020\t*\0020\0032\006\020\n\032\0020\013H\b\032\016\020\f\032\004\030\0010\t*\0020\003H\007\032\026\020\f\032\004\030\0010\t*\0020\0032\006\020\n\032\0020\013H\007\032\r\020\r\032\0020\016*\0020\003H\b\032\025\020\r\032\0020\016*\0020\0032\006\020\017\032\0020\020H\b\032\016\020\021\032\004\030\0010\016*\0020\003H\007\032\026\020\021\032\004\030\0010\016*\0020\0032\006\020\017\032\0020\020H\007\032\r\020\022\032\0020\023*\0020\003H\b\032\r\020\024\032\0020\025*\0020\003H\b\032\025\020\024\032\0020\025*\0020\0032\006\020\017\032\0020\020H\b\032\r\020\026\032\0020\027*\0020\003H\b\032\023\020\030\032\004\030\0010\027*\0020\003H\007¢\006\002\020\031\032\r\020\032\032\0020\033*\0020\003H\b\032\023\020\034\032\004\030\0010\033*\0020\003H\007¢\006\002\020\035\032\r\020\036\032\0020\020*\0020\003H\b\032\025\020\036\032\0020\020*\0020\0032\006\020\017\032\0020\020H\b\032\r\020\037\032\0020 *\0020\003H\b\032\025\020\037\032\0020 *\0020\0032\006\020\017\032\0020\020H\b\032\r\020!\032\0020\"*\0020\003H\b\032\025\020!\032\0020\"*\0020\0032\006\020\017\032\0020\020H\b\032\025\020#\032\0020\003*\0020\0252\006\020\017\032\0020\020H\b\032\025\020#\032\0020\003*\0020\0202\006\020\017\032\0020\020H\b\032\025\020#\032\0020\003*\0020 2\006\020\017\032\0020\020H\b\032\025\020#\032\0020\003*\0020\"2\006\020\017\032\0020\020H\b¨\006$"}, d2={"screenFloatValue", "T", "str", "", "parse", "Lkotlin/Function1;", "screenFloatValue$StringsKt__StringNumberConversionsJVMKt", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "toBigDecimal", "Ljava/math/BigDecimal;", "mathContext", "Ljava/math/MathContext;", "toBigDecimalOrNull", "toBigInteger", "Ljava/math/BigInteger;", "radix", "", "toBigIntegerOrNull", "toBoolean", "", "toByte", "", "toDouble", "", "toDoubleOrNull", "(Ljava/lang/String;)Ljava/lang/Double;", "toFloat", "", "toFloatOrNull", "(Ljava/lang/String;)Ljava/lang/Float;", "toInt", "toLong", "", "toShort", "", "toString", "kotlin-stdlib"}, xs="kotlin/text/StringsKt")
class StringsKt__StringNumberConversionsJVMKt extends StringsKt__StringBuilderKt
{
  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final String toString(byte $receiver, int radix)
  {
    ;
    int i = $receiver;int j = CharsKt.checkRadix(radix); String tmp17_14 = Integer.toString(i, CharsKt.checkRadix(j));Intrinsics.checkExpressionValueIsNotNull(tmp17_14, "java.lang.Integer.toStri…(this, checkRadix(radix))");return tmp17_14;
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final String toString(short $receiver, int radix)
  {
    ;
    int i = $receiver;int j = CharsKt.checkRadix(radix); String tmp17_14 = Integer.toString(i, CharsKt.checkRadix(j));Intrinsics.checkExpressionValueIsNotNull(tmp17_14, "java.lang.Integer.toStri…(this, checkRadix(radix))");return tmp17_14;
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final String toString(int $receiver, int radix)
  {
    ;
    String tmp8_5 = Integer.toString($receiver, CharsKt.checkRadix(radix));Intrinsics.checkExpressionValueIsNotNull(tmp8_5, "java.lang.Integer.toStri…(this, checkRadix(radix))");return tmp8_5;
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final String toString(long $receiver, int radix)
  {
    ;
    String tmp8_5 = Long.toString($receiver, CharsKt.checkRadix(radix));Intrinsics.checkExpressionValueIsNotNull(tmp8_5, "java.lang.Long.toString(this, checkRadix(radix))");return tmp8_5;
  }
  
  @InlineOnly
  private static final boolean toBoolean(@NotNull String $receiver) {
    ;
    return Boolean.parseBoolean($receiver);
  }
  
  @InlineOnly
  private static final byte toByte(@NotNull String $receiver)
  {
    ;
    return Byte.parseByte($receiver);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final byte toByte(@NotNull String $receiver, int radix)
  {
    ;
    return Byte.parseByte($receiver, CharsKt.checkRadix(radix));
  }
  

  @InlineOnly
  private static final short toShort(@NotNull String $receiver)
  {
    ;
    return Short.parseShort($receiver);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final short toShort(@NotNull String $receiver, int radix)
  {
    ;
    return Short.parseShort($receiver, CharsKt.checkRadix(radix));
  }
  
  @InlineOnly
  private static final int toInt(@NotNull String $receiver)
  {
    ;
    return Integer.parseInt($receiver);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final int toInt(@NotNull String $receiver, int radix)
  {
    ;
    return Integer.parseInt($receiver, CharsKt.checkRadix(radix));
  }
  
  @InlineOnly
  private static final long toLong(@NotNull String $receiver)
  {
    ;
    return Long.parseLong($receiver);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final long toLong(@NotNull String $receiver, int radix)
  {
    ;
    return Long.parseLong($receiver, CharsKt.checkRadix(radix));
  }
  
  @InlineOnly
  private static final float toFloat(@NotNull String $receiver)
  {
    ;
    return Float.parseFloat($receiver);
  }
  
  @InlineOnly
  private static final double toDouble(@NotNull String $receiver)
  {
    ;
    return Double.parseDouble($receiver);
  }
  








  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigInteger toBigInteger(@NotNull String $receiver)
  {
    ;
    







    return new BigInteger($receiver);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigInteger toBigInteger(@NotNull String $receiver, int radix)
  {
    ;
    
    return new BigInteger($receiver, CharsKt.checkRadix(radix));
  }
  
  @SinceKotlin(version="1.2")
  @Nullable
  public static final BigInteger toBigIntegerOrNull(@NotNull String $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return StringsKt.toBigIntegerOrNull($receiver, 10);
  }
  













  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigDecimal toBigDecimal(@NotNull String $receiver)
  {
    ;
    












    return new BigDecimal($receiver);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigDecimal toBigDecimal(@NotNull String $receiver, java.math.MathContext mathContext)
  {
    ;
    

    return new BigDecimal($receiver, mathContext);
  }
  












  private static final <T> T screenFloatValue$StringsKt__StringNumberConversionsJVMKt(String str, kotlin.jvm.functions.Function1<? super String, ? extends T> parse)
  {
    T ?;
    











    try
    {
      ;
      











      ? = ScreenFloatValueRegEx.value.matches((CharSequence)str) ? 
        parse.invoke(str) : 
        
        null;
    } catch (NumberFormatException e) {
      ? = null;
    }
    return ?;
  }
  
  @SinceKotlin(version="1.1")
  @Nullable
  public static final Float toFloatOrNull(@NotNull String $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");
    











































    String p1;
    










































    try
    {
      int $i$f$screenFloatValue$StringsKt__StringNumberConversionsJVMKt;
      










































      p1 = $receiver;
      int $i$a$1$unknown;
      p1 = ScreenFloatValueRegEx.value.matches((CharSequence)$receiver) ? Float.valueOf(Float.parseFloat(
        p1)) : 
        
        null;
    } catch (NumberFormatException e$iv) {
      p1 = null;
    }
    return 
    



































































































































      p1;
  }
  
  @SinceKotlin(version="1.1")
  @Nullable
  public static final Double toDoubleOrNull(@NotNull String $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");
    











































    String p1;
    










































    try
    {
      int $i$f$screenFloatValue$StringsKt__StringNumberConversionsJVMKt;
      










































      p1 = $receiver;
      int $i$a$1$unknown;
      p1 = ScreenFloatValueRegEx.value.matches((CharSequence)$receiver) ? Double.valueOf(Double.parseDouble(
        p1)) : 
        
        null;
    } catch (NumberFormatException e$iv) {
      p1 = null;
    }
    return 
    



































































































































      p1;
  }
  
  @SinceKotlin(version="1.2")
  @Nullable
  public static final BigDecimal toBigDecimalOrNull(@NotNull String $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");
    


















    String it;
    


















    try
    {
      int $i$f$screenFloatValue$StringsKt__StringNumberConversionsJVMKt;
      


















      it = $receiver;
      int $i$a$1$screenFloatValue;
      String str1 = it;
      



























































      it = ScreenFloatValueRegEx.value.matches((CharSequence)$receiver) ? new BigDecimal(str1) : 
      

        null;
    } catch (NumberFormatException e$iv) {
      it = null;
    }
    return 
    


























































      it;
  }
  
  @SinceKotlin(version="1.2")
  @Nullable
  public static final BigDecimal toBigDecimalOrNull(@NotNull String $receiver, @NotNull java.math.MathContext mathContext)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(mathContext, "mathContext");
    

















    BigDecimal localBigDecimal;
    

















    try
    {
      int $i$f$screenFloatValue$StringsKt__StringNumberConversionsJVMKt;
      
















      String it = $receiver;
      int $i$a$2$screenFloatValue;
      String str1 = it;java.math.MathContext localMathContext = mathContext;
      























































      localBigDecimal = ScreenFloatValueRegEx.value.matches((CharSequence)$receiver) ? new BigDecimal(str1, localMathContext) : 
      

        null;
    } catch (NumberFormatException e$iv) {
      localBigDecimal = null;
    }
    return 
    






















































      localBigDecimal;
  }
  
  /* Error */
  @SinceKotlin(version="1.2")
  @Nullable
  public static final BigInteger toBigIntegerOrNull(@NotNull String $receiver, int radix)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 117
    //   3: invokestatic 120	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: iload_1
    //   7: invokestatic 16	kotlin/text/CharsKt:checkRadix	(I)I
    //   10: pop
    //   11: aload_0
    //   12: invokevirtual 173	java/lang/String:length	()I
    //   15: istore_2
    //   16: iload_2
    //   17: tableswitch	default:+42->59, 0:+23->40, 1:+25->42
    //   40: aconst_null
    //   41: areturn
    //   42: aload_0
    //   43: iconst_0
    //   44: invokevirtual 177	java/lang/String:charAt	(I)C
    //   47: iload_1
    //   48: invokestatic 181	kotlin/text/CharsKt:digitOf	(CI)I
    //   51: ifge +58 -> 109
    //   54: aconst_null
    //   55: areturn
    //   56: nop
    //   57: nop
    //   58: athrow
    //   59: aload_0
    //   60: iconst_0
    //   61: invokevirtual 177	java/lang/String:charAt	(I)C
    //   64: bipush 45
    //   66: if_icmpne +7 -> 73
    //   69: iconst_1
    //   70: goto +4 -> 74
    //   73: iconst_0
    //   74: istore_3
    //   75: iload_3
    //   76: istore 4
    //   78: iload_2
    //   79: istore 5
    //   81: iload 4
    //   83: iload 5
    //   85: if_icmpge +24 -> 109
    //   88: aload_0
    //   89: iload 4
    //   91: invokevirtual 177	java/lang/String:charAt	(I)C
    //   94: iload_1
    //   95: invokestatic 181	kotlin/text/CharsKt:digitOf	(CI)I
    //   98: ifge +5 -> 103
    //   101: aconst_null
    //   102: areturn
    //   103: iinc 4 1
    //   106: goto -25 -> 81
    //   109: aload_0
    //   110: astore_3
    //   111: new 153	java/math/BigInteger
    //   114: dup
    //   115: aload_3
    //   116: iload_1
    //   117: invokestatic 16	kotlin/text/CharsKt:checkRadix	(I)I
    //   120: invokespecial 162	java/math/BigInteger:<init>	(Ljava/lang/String;I)V
    //   123: areturn
    // Line number table:
    //   Java source line #182	-> byte code offset #6
    //   Java source line #183	-> byte code offset #11
    //   Java source line #184	-> byte code offset #16
    //   Java source line #185	-> byte code offset #40
    //   Java source line #186	-> byte code offset #42
    //   Java source line #188	-> byte code offset #59
    //   Java source line #189	-> byte code offset #75
    //   Java source line #190	-> byte code offset #88
    //   Java source line #191	-> byte code offset #101
    //   Java source line #189	-> byte code offset #103
    //   Java source line #194	-> byte code offset #109
    //   Java source line #195	-> byte code offset #109
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	124	0	$receiver	String
    //   0	124	1	radix	int
    //   16	108	2	length	int
    //   75	34	3	start	int
    //   88	18	4	index	int
  }
  
  public StringsKt__StringNumberConversionsJVMKt() {}
}

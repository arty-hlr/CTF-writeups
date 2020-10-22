package kotlin.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000B\n\000\n\002\020\016\n\000\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\002\020\r\n\000\n\002\020\000\n\002\b\007\032.\020\000\032\0020\0012\006\020\002\032\0020\0032\033\020\004\032\027\022\b\022\0060\006j\002`\007\022\004\022\0020\b0\005¢\006\002\b\tH\b\032&\020\000\032\0020\0012\033\020\004\032\027\022\b\022\0060\006j\002`\007\022\004\022\0020\b0\005¢\006\002\b\tH\b\0325\020\n\032\002H\013\"\f\b\000\020\013*\0060\fj\002`\r*\002H\0132\026\020\016\032\f\022\b\b\001\022\004\030\0010\0200\017\"\004\030\0010\020¢\006\002\020\021\032/\020\n\032\0060\006j\002`\007*\0060\006j\002`\0072\026\020\016\032\f\022\b\b\001\022\004\030\0010\0220\017\"\004\030\0010\022¢\006\002\020\023\032/\020\n\032\0060\006j\002`\007*\0060\006j\002`\0072\026\020\016\032\f\022\b\b\001\022\004\030\0010\0010\017\"\004\030\0010\001¢\006\002\020\024\0329\020\025\032\0020\b\"\004\b\000\020\013*\0060\fj\002`\r2\006\020\026\032\002H\0132\024\020\027\032\020\022\004\022\002H\013\022\004\022\0020\020\030\0010\005H\000¢\006\002\020\030¨\006\031"}, d2={"buildString", "", "capacity", "", "builderAction", "Lkotlin/Function1;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "Lkotlin/ExtensionFunctionType;", "append", "T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "value", "", "", "(Ljava/lang/Appendable;[Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "", "(Ljava/lang/StringBuilder;[Ljava/lang/Object;)Ljava/lang/StringBuilder;", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;", "appendElement", "element", "transform", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, xs="kotlin/text/StringsKt")
class StringsKt__StringBuilderKt extends StringsKt__StringBuilderJVMKt
{
  @InlineOnly
  private static final String buildString(Function1<? super StringBuilder, Unit> builderAction)
  {
    ;
    StringBuilder localStringBuilder = new StringBuilder();builderAction.invoke(localStringBuilder); String tmp20_17 = localStringBuilder.toString();Intrinsics.checkExpressionValueIsNotNull(tmp20_17, "StringBuilder().apply(builderAction).toString()");return tmp20_17;
  }
  

  @kotlin.SinceKotlin(version="1.1")
  @InlineOnly
  private static final String buildString(int capacity, Function1<? super StringBuilder, Unit> builderAction)
  {
    ;
    StringBuilder localStringBuilder = new StringBuilder(capacity);builderAction.invoke(localStringBuilder); String tmp21_18 = localStringBuilder.toString();Intrinsics.checkExpressionValueIsNotNull(tmp21_18, "StringBuilder(capacity).…builderAction).toString()");return tmp21_18;
  }
  
  @NotNull
  public static final <T extends Appendable> T append(@NotNull T $receiver, @NotNull CharSequence... value)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(value, "value"); for (CharSequence item : value)
      $receiver.append(item);
    return $receiver;
  }
  

  @NotNull
  public static final StringBuilder append(@NotNull StringBuilder $receiver, @NotNull String... value)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(value, "value"); for (String item : value)
      $receiver.append(item);
    return $receiver;
  }
  

  @NotNull
  public static final StringBuilder append(@NotNull StringBuilder $receiver, @NotNull Object... value)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(value, "value"); for (Object item : value)
      $receiver.append(item);
    return $receiver;
  }
  
  /* Error */
  public static final <T> void appendElement(@NotNull Appendable $receiver, T element, @org.jetbrains.annotations.Nullable Function1<? super T, ? extends CharSequence> transform)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 50
    //   3: invokestatic 53	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_2
    //   7: ifnull +23 -> 30
    //   10: aload_0
    //   11: aload_2
    //   12: aload_1
    //   13: invokeinterface 19 2 0
    //   18: checkcast 86	java/lang/CharSequence
    //   21: invokeinterface 60 2 0
    //   26: pop
    //   27: goto +71 -> 98
    //   30: aload_1
    //   31: dup
    //   32: ifnull +9 -> 41
    //   35: instanceof 86
    //   38: goto +5 -> 43
    //   41: pop
    //   42: iconst_1
    //   43: ifeq +17 -> 60
    //   46: aload_0
    //   47: aload_1
    //   48: checkcast 86	java/lang/CharSequence
    //   51: invokeinterface 60 2 0
    //   56: pop
    //   57: goto +41 -> 98
    //   60: aload_1
    //   61: instanceof 88
    //   64: ifeq +20 -> 84
    //   67: aload_0
    //   68: aload_1
    //   69: checkcast 88	java/lang/Character
    //   72: invokevirtual 92	java/lang/Character:charValue	()C
    //   75: invokeinterface 95 2 0
    //   80: pop
    //   81: goto +17 -> 98
    //   84: aload_0
    //   85: aload_1
    //   86: invokestatic 101	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   89: checkcast 86	java/lang/CharSequence
    //   92: invokeinterface 60 2 0
    //   97: pop
    //   98: return
    // Line number table:
    //   Java source line #57	-> byte code offset #6
    //   Java source line #58	-> byte code offset #6
    //   Java source line #59	-> byte code offset #30
    //   Java source line #60	-> byte code offset #60
    //   Java source line #61	-> byte code offset #84
    //   Java source line #62	-> byte code offset #98
    //   Java source line #63	-> byte code offset #98
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	$receiver	Appendable
    //   0	99	1	element	Object
    //   0	99	2	transform	Function1
  }
  
  public StringsKt__StringBuilderKt() {}
}

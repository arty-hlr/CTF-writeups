package kotlin.text;

import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000T\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\f\n\002\020\r\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\020\013\n\002\020\005\n\002\020\031\n\002\020\006\n\002\020\007\n\002\020\b\n\002\020\t\n\002\020\n\n\002\020\016\n\002\b\002\n\002\020\002\n\002\b\002\032\022\020\000\032\0060\001j\002`\002*\0060\001j\002`\002\032\035\020\000\032\0060\001j\002`\002*\0060\001j\002`\0022\006\020\003\032\0020\004H\b\032\037\020\000\032\0060\001j\002`\002*\0060\001j\002`\0022\b\020\003\032\004\030\0010\005H\b\032\022\020\000\032\0060\006j\002`\007*\0060\006j\002`\007\032\037\020\000\032\0060\006j\002`\007*\0060\006j\002`\0072\b\020\003\032\004\030\0010\bH\b\032\037\020\000\032\0060\006j\002`\007*\0060\006j\002`\0072\b\020\003\032\004\030\0010\tH\b\032\035\020\000\032\0060\006j\002`\007*\0060\006j\002`\0072\006\020\003\032\0020\nH\b\032\035\020\000\032\0060\006j\002`\007*\0060\006j\002`\0072\006\020\003\032\0020\013H\b\032\035\020\000\032\0060\006j\002`\007*\0060\006j\002`\0072\006\020\003\032\0020\004H\b\032\035\020\000\032\0060\006j\002`\007*\0060\006j\002`\0072\006\020\003\032\0020\fH\b\032\037\020\000\032\0060\006j\002`\007*\0060\006j\002`\0072\b\020\003\032\004\030\0010\005H\b\032\035\020\000\032\0060\006j\002`\007*\0060\006j\002`\0072\006\020\003\032\0020\rH\b\032\035\020\000\032\0060\006j\002`\007*\0060\006j\002`\0072\006\020\003\032\0020\016H\b\032\035\020\000\032\0060\006j\002`\007*\0060\006j\002`\0072\006\020\003\032\0020\017H\b\032\035\020\000\032\0060\006j\002`\007*\0060\006j\002`\0072\006\020\003\032\0020\020H\b\032\035\020\000\032\0060\006j\002`\007*\0060\006j\002`\0072\006\020\003\032\0020\021H\b\032\037\020\000\032\0060\006j\002`\007*\0060\006j\002`\0072\b\020\003\032\004\030\0010\022H\b\032%\020\000\032\0060\006j\002`\007*\0060\006j\002`\0072\016\020\003\032\n\030\0010\006j\004\030\001`\007H\b\032\024\020\023\032\0060\006j\002`\007*\0060\006j\002`\007H\007\032!\020\024\032\0020\025*\0060\006j\002`\0072\006\020\026\032\0020\0172\006\020\003\032\0020\004H\n¨\006\027"}, d2={"appendln", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "value", "", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuffer;", "", "", "", "", "", "", "", "", "", "", "clear", "set", "", "index", "kotlin-stdlib"}, xs="kotlin/text/StringsKt")
class StringsKt__StringBuilderJVMKt extends StringsKt__RegexExtensionsKt
{
  @InlineOnly
  private static final void set(@NotNull StringBuilder $receiver, int index, char value)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");$receiver.setCharAt(index, value);
  }
  

  @kotlin.SinceKotlin(version="1.3")
  @NotNull
  public static final StringBuilder clear(@NotNull StringBuilder $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");StringBuilder localStringBuilder1 = $receiver;StringBuilder $receiver = localStringBuilder1; int $i$a$1$apply; $receiver.setLength(0);return localStringBuilder1;
  }
  



  @NotNull
  public static final Appendable appendln(@NotNull Appendable $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); Appendable tmp18_13 = $receiver.append((CharSequence)SystemProperties.LINE_SEPARATOR);Intrinsics.checkExpressionValueIsNotNull(tmp18_13, "append(SystemProperties.LINE_SEPARATOR)");return tmp18_13; }
  
  @InlineOnly
  private static final Appendable appendln(@NotNull Appendable $receiver, CharSequence value) { ;
    Appendable tmp7_2 = $receiver.append(value);Intrinsics.checkExpressionValueIsNotNull(tmp7_2, "append(value)");return StringsKt.appendln(tmp7_2); }
  
  @InlineOnly
  private static final Appendable appendln(@NotNull Appendable $receiver, char value) { ;
    Appendable tmp7_2 = $receiver.append(value);Intrinsics.checkExpressionValueIsNotNull(tmp7_2, "append(value)");return StringsKt.appendln(tmp7_2); }
  
  @NotNull
  public static final StringBuilder appendln(@NotNull StringBuilder $receiver) { Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); StringBuilder tmp13_10 = $receiver.append(SystemProperties.LINE_SEPARATOR);Intrinsics.checkExpressionValueIsNotNull(tmp13_10, "append(SystemProperties.LINE_SEPARATOR)");return tmp13_10; }
  
  @InlineOnly
  private static final StringBuilder appendln(@NotNull StringBuilder $receiver, StringBuffer value) { ;
    StringBuilder tmp5_2 = $receiver.append(value);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "append(value)");return StringsKt.appendln(tmp5_2); }
  
  @InlineOnly
  private static final StringBuilder appendln(@NotNull StringBuilder $receiver, CharSequence value) { ;
    StringBuilder tmp5_2 = $receiver.append(value);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "append(value)");return StringsKt.appendln(tmp5_2); }
  
  @InlineOnly
  private static final StringBuilder appendln(@NotNull StringBuilder $receiver, String value) { ;
    StringBuilder tmp5_2 = $receiver.append(value);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "append(value)");return StringsKt.appendln(tmp5_2); }
  
  @InlineOnly
  private static final StringBuilder appendln(@NotNull StringBuilder $receiver, Object value) { ;
    StringBuilder tmp5_2 = $receiver.append(value);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "append(value)");return StringsKt.appendln(tmp5_2); }
  
  @InlineOnly
  private static final StringBuilder appendln(@NotNull StringBuilder $receiver, StringBuilder value) { ;
    StringBuilder tmp8_5 = $receiver.append((CharSequence)value);Intrinsics.checkExpressionValueIsNotNull(tmp8_5, "append(value)");return StringsKt.appendln(tmp8_5); }
  
  @InlineOnly
  private static final StringBuilder appendln(@NotNull StringBuilder $receiver, char[] value) { ;
    StringBuilder tmp5_2 = $receiver.append(value);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "append(value)");return StringsKt.appendln(tmp5_2); }
  
  @InlineOnly
  private static final StringBuilder appendln(@NotNull StringBuilder $receiver, char value) { ;
    StringBuilder tmp5_2 = $receiver.append(value);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "append(value)");return StringsKt.appendln(tmp5_2); }
  
  @InlineOnly
  private static final StringBuilder appendln(@NotNull StringBuilder $receiver, boolean value) { ;
    StringBuilder tmp5_2 = $receiver.append(value);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "append(value)");return StringsKt.appendln(tmp5_2); }
  
  @InlineOnly
  private static final StringBuilder appendln(@NotNull StringBuilder $receiver, int value) { ;
    StringBuilder tmp5_2 = $receiver.append(value);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "append(value)");return StringsKt.appendln(tmp5_2); }
  
  @InlineOnly
  private static final StringBuilder appendln(@NotNull StringBuilder $receiver, short value) { ;
    StringBuilder tmp5_2 = $receiver.append(value);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "append(value.toInt())");return StringsKt.appendln(tmp5_2); }
  
  @InlineOnly
  private static final StringBuilder appendln(@NotNull StringBuilder $receiver, byte value) { ;
    StringBuilder tmp5_2 = $receiver.append(value);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "append(value.toInt())");return StringsKt.appendln(tmp5_2); }
  
  @InlineOnly
  private static final StringBuilder appendln(@NotNull StringBuilder $receiver, long value) { ;
    StringBuilder tmp5_2 = $receiver.append(value);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "append(value)");return StringsKt.appendln(tmp5_2); }
  
  @InlineOnly
  private static final StringBuilder appendln(@NotNull StringBuilder $receiver, float value) { ;
    StringBuilder tmp5_2 = $receiver.append(value);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "append(value)");return StringsKt.appendln(tmp5_2); }
  
  @InlineOnly
  private static final StringBuilder appendln(@NotNull StringBuilder $receiver, double value) { ;
    StringBuilder tmp5_2 = $receiver.append(value);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "append(value)");return StringsKt.appendln(tmp5_2);
  }
  
  public StringsKt__StringBuilderJVMKt() {}
}

package kotlin.text;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.TypeCastException;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000x\n\000\n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\022\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\031\n\000\n\002\020\025\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\r\n\002\b\006\n\002\030\002\n\000\n\002\020\021\n\002\020\000\n\002\b\b\n\002\020\f\n\002\b\021\n\002\020 \n\000\n\002\030\002\n\002\b\016\032\021\020\006\032\0020\0022\006\020\007\032\0020\bH\b\032\021\020\006\032\0020\0022\006\020\t\032\0020\nH\b\032\021\020\006\032\0020\0022\006\020\013\032\0020\fH\b\032\031\020\006\032\0020\0022\006\020\013\032\0020\f2\006\020\r\032\0020\016H\b\032!\020\006\032\0020\0022\006\020\013\032\0020\f2\006\020\017\032\0020\0202\006\020\021\032\0020\020H\b\032)\020\006\032\0020\0022\006\020\013\032\0020\f2\006\020\017\032\0020\0202\006\020\021\032\0020\0202\006\020\r\032\0020\016H\b\032\021\020\006\032\0020\0022\006\020\022\032\0020\023H\b\032!\020\006\032\0020\0022\006\020\022\032\0020\0232\006\020\017\032\0020\0202\006\020\021\032\0020\020H\b\032!\020\006\032\0020\0022\006\020\024\032\0020\0252\006\020\017\032\0020\0202\006\020\021\032\0020\020H\b\032\n\020\026\032\0020\002*\0020\002\032\025\020\027\032\0020\020*\0020\0022\006\020\030\032\0020\020H\b\032\025\020\031\032\0020\020*\0020\0022\006\020\030\032\0020\020H\b\032\035\020\032\032\0020\020*\0020\0022\006\020\033\032\0020\0202\006\020\034\032\0020\020H\b\032\034\020\035\032\0020\020*\0020\0022\006\020\036\032\0020\0022\b\b\002\020\037\032\0020 \032\025\020!\032\0020 *\0020\0022\006\020\t\032\0020\bH\b\032\025\020!\032\0020 *\0020\0022\006\020\"\032\0020#H\b\032\n\020$\032\0020\002*\0020\002\032\034\020%\032\0020 *\0020\0022\006\020&\032\0020\0022\b\b\002\020\037\032\0020 \032 \020'\032\0020 *\004\030\0010\0022\b\020\036\032\004\030\0010\0022\b\b\002\020\037\032\0020 \0322\020(\032\0020\002*\0020\0022\006\020)\032\0020*2\026\020+\032\f\022\b\b\001\022\004\030\0010-0,\"\004\030\0010-H\b¢\006\002\020.\032*\020(\032\0020\002*\0020\0022\026\020+\032\f\022\b\b\001\022\004\030\0010-0,\"\004\030\0010-H\b¢\006\002\020/\032:\020(\032\0020\002*\0020\0032\006\020)\032\0020*2\006\020(\032\0020\0022\026\020+\032\f\022\b\b\001\022\004\030\0010-0,\"\004\030\0010-H\b¢\006\002\0200\0322\020(\032\0020\002*\0020\0032\006\020(\032\0020\0022\026\020+\032\f\022\b\b\001\022\004\030\0010-0,\"\004\030\0010-H\b¢\006\002\0201\032\r\0202\032\0020\002*\0020\002H\b\032\n\0203\032\0020 *\0020#\032\035\0204\032\0020\020*\0020\0022\006\0205\032\002062\006\0207\032\0020\020H\b\032\035\0204\032\0020\020*\0020\0022\006\0208\032\0020\0022\006\0207\032\0020\020H\b\032\035\0209\032\0020\020*\0020\0022\006\0205\032\002062\006\0207\032\0020\020H\b\032\035\0209\032\0020\020*\0020\0022\006\0208\032\0020\0022\006\0207\032\0020\020H\b\032\035\020:\032\0020\020*\0020\0022\006\020\030\032\0020\0202\006\020;\032\0020\020H\b\0324\020<\032\0020 *\0020#2\006\020=\032\0020\0202\006\020\036\032\0020#2\006\020>\032\0020\0202\006\020\021\032\0020\0202\b\b\002\020\037\032\0020 \0324\020<\032\0020 *\0020\0022\006\020=\032\0020\0202\006\020\036\032\0020\0022\006\020>\032\0020\0202\006\020\021\032\0020\0202\b\b\002\020\037\032\0020 \032\022\020?\032\0020\002*\0020#2\006\020@\032\0020\020\032$\020A\032\0020\002*\0020\0022\006\020B\032\002062\006\020C\032\002062\b\b\002\020\037\032\0020 \032$\020A\032\0020\002*\0020\0022\006\020D\032\0020\0022\006\020E\032\0020\0022\b\b\002\020\037\032\0020 \032$\020F\032\0020\002*\0020\0022\006\020B\032\002062\006\020C\032\002062\b\b\002\020\037\032\0020 \032$\020F\032\0020\002*\0020\0022\006\020D\032\0020\0022\006\020E\032\0020\0022\b\b\002\020\037\032\0020 \032\"\020G\032\b\022\004\022\0020\0020H*\0020#2\006\020I\032\0020J2\b\b\002\020K\032\0020\020\032\034\020L\032\0020 *\0020\0022\006\020M\032\0020\0022\b\b\002\020\037\032\0020 \032$\020L\032\0020 *\0020\0022\006\020M\032\0020\0022\006\020N\032\0020\0202\b\b\002\020\037\032\0020 \032\025\020O\032\0020\002*\0020\0022\006\020N\032\0020\020H\b\032\035\020O\032\0020\002*\0020\0022\006\020N\032\0020\0202\006\020\034\032\0020\020H\b\032\027\020P\032\0020\f*\0020\0022\b\b\002\020\r\032\0020\016H\b\032\r\020Q\032\0020\023*\0020\002H\b\0323\020Q\032\0020\023*\0020\0022\006\020R\032\0020\0232\b\b\002\020S\032\0020\0202\b\b\002\020N\032\0020\0202\b\b\002\020\034\032\0020\020H\b\032\r\020T\032\0020\002*\0020\002H\b\032\025\020T\032\0020\002*\0020\0022\006\020)\032\0020*H\b\032\027\020U\032\0020J*\0020\0022\b\b\002\020V\032\0020\020H\b\032\r\020W\032\0020\002*\0020\002H\b\032\025\020W\032\0020\002*\0020\0022\006\020)\032\0020*H\b\"\033\020\000\032\b\022\004\022\0020\0020\001*\0020\0038F¢\006\006\032\004\b\004\020\005¨\006X"}, d2={"CASE_INSENSITIVE_ORDER", "Ljava/util/Comparator;", "", "Lkotlin/String$Companion;", "getCASE_INSENSITIVE_ORDER", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "String", "stringBuffer", "Ljava/lang/StringBuffer;", "stringBuilder", "Ljava/lang/StringBuilder;", "bytes", "", "charset", "Ljava/nio/charset/Charset;", "offset", "", "length", "chars", "", "codePoints", "", "capitalize", "codePointAt", "index", "codePointBefore", "codePointCount", "beginIndex", "endIndex", "compareTo", "other", "ignoreCase", "", "contentEquals", "charSequence", "", "decapitalize", "endsWith", "suffix", "equals", "format", "locale", "Ljava/util/Locale;", "args", "", "", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "intern", "isBlank", "nativeIndexOf", "ch", "", "fromIndex", "str", "nativeLastIndexOf", "offsetByCodePoints", "codePointOffset", "regionMatches", "thisOffset", "otherOffset", "repeat", "n", "replace", "oldChar", "newChar", "oldValue", "newValue", "replaceFirst", "split", "", "regex", "Ljava/util/regex/Pattern;", "limit", "startsWith", "prefix", "startIndex", "substring", "toByteArray", "toCharArray", "destination", "destinationOffset", "toLowerCase", "toPattern", "flags", "toUpperCase", "kotlin-stdlib"}, xs="kotlin/text/StringsKt")
class StringsKt__StringsJVMKt extends StringsKt__StringNumberConversionsKt
{
  @InlineOnly
  private static final int nativeIndexOf(@NotNull String $receiver, char ch, int fromIndex)
  {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); return $receiver.indexOf(ch, fromIndex);
  }
  
  @InlineOnly
  private static final int nativeIndexOf(@NotNull String $receiver, String str, int fromIndex) {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); return $receiver.indexOf(str, fromIndex);
  }
  
  @InlineOnly
  private static final int nativeLastIndexOf(@NotNull String $receiver, char ch, int fromIndex) {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); return $receiver.lastIndexOf(ch, fromIndex);
  }
  
  @InlineOnly
  private static final int nativeLastIndexOf(@NotNull String $receiver, String str, int fromIndex) {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); return $receiver.lastIndexOf(str, fromIndex);
  }
  




  public static final boolean equals(@Nullable String $receiver, @Nullable String other, boolean ignoreCase)
  {
    if ($receiver == null)
      return other == null;
    return !ignoreCase ? 
      $receiver.equals(other) : 
      
      $receiver.equalsIgnoreCase(other);
  }
  


  @NotNull
  public static final String replace(@NotNull String $receiver, char oldChar, char newChar, boolean ignoreCase)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); if (!ignoreCase) {
      String tmp16_13 = $receiver.replace(oldChar, newChar);Intrinsics.checkExpressionValueIsNotNull(tmp16_13, "(this as java.lang.Strin…replace(oldChar, newChar)");return tmp16_13;
    }
    int i = 0;char[] arrayOfChar = { oldChar };boolean bool = ignoreCase;return kotlin.sequences.SequencesKt.joinToString$default(StringsKt.splitToSequence$default((CharSequence)$receiver, arrayOfChar, bool, i, 4, null), (CharSequence)String.valueOf(newChar), null, null, 0, null, null, 62, null);
  }
  



  @NotNull
  public static final String replace(@NotNull String $receiver, @NotNull String oldValue, @NotNull String newValue, boolean ignoreCase)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(oldValue, "oldValue");Intrinsics.checkParameterIsNotNull(newValue, "newValue");int i = 0;String[] arrayOfString = { oldValue };boolean bool = ignoreCase;return kotlin.sequences.SequencesKt.joinToString$default(StringsKt.splitToSequence$default((CharSequence)$receiver, arrayOfString, bool, i, 4, null), (CharSequence)newValue, null, null, 0, null, null, 62, null);
  }
  


  @NotNull
  public static final String replaceFirst(@NotNull String $receiver, char oldChar, char newChar, boolean ignoreCase)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int index = StringsKt.indexOf$default((CharSequence)$receiver, oldChar, 0, ignoreCase, 2, null);
    String str = $receiver;int i = index + 1;CharSequence localCharSequence = (CharSequence)String.valueOf(newChar);return index < 0 ? $receiver : StringsKt.replaceRange((CharSequence)str, index, i, localCharSequence).toString();
  }
  



  @NotNull
  public static final String replaceFirst(@NotNull String $receiver, @NotNull String oldValue, @NotNull String newValue, boolean ignoreCase)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(oldValue, "oldValue");Intrinsics.checkParameterIsNotNull(newValue, "newValue");int index = StringsKt.indexOf$default((CharSequence)$receiver, oldValue, 0, ignoreCase, 2, null);
    String str = $receiver;int i = index + oldValue.length();return index < 0 ? $receiver : StringsKt.replaceRange((CharSequence)str, index, i, (CharSequence)newValue).toString();
  }
  

  @InlineOnly
  private static final String toUpperCase(@NotNull String $receiver)
  {
    ;
    
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); String tmp18_15 = $receiver.toUpperCase();Intrinsics.checkExpressionValueIsNotNull(tmp18_15, "(this as java.lang.String).toUpperCase()");return tmp18_15;
  }
  

  @InlineOnly
  private static final String toLowerCase(@NotNull String $receiver)
  {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); String tmp18_15 = $receiver.toLowerCase();Intrinsics.checkExpressionValueIsNotNull(tmp18_15, "(this as java.lang.String).toLowerCase()");return tmp18_15;
  }
  
  @InlineOnly
  private static final char[] toCharArray(@NotNull String $receiver) {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); char[] tmp18_15 = $receiver.toCharArray();Intrinsics.checkExpressionValueIsNotNull(tmp18_15, "(this as java.lang.String).toCharArray()");return tmp18_15;
  }
  





  @InlineOnly
  private static final char[] toCharArray(@NotNull String $receiver, char[] destination, int destinationOffset, int startIndex, int endIndex)
  {
    ;
    




    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); $receiver.getChars(startIndex, endIndex, destination, destinationOffset);
    return destination;
  }
  

  @InlineOnly
  private static final String format(@NotNull String $receiver, Object... args)
  {
    ;
    Object[] tmp2_1 = args; String tmp10_7 = String.format($receiver, Arrays.copyOf(tmp2_1, tmp2_1.length));Intrinsics.checkExpressionValueIsNotNull(tmp10_7, "java.lang.String.format(this, *args)");return tmp10_7;
  }
  
  @InlineOnly
  private static final String format(@NotNull StringCompanionObject $receiver, String format, Object... args)
  {
    ;
    Object[] tmp2_1 = args; String tmp10_7 = String.format(format, Arrays.copyOf(tmp2_1, tmp2_1.length));Intrinsics.checkExpressionValueIsNotNull(tmp10_7, "java.lang.String.format(format, *args)");return tmp10_7;
  }
  
  @InlineOnly
  private static final String format(@NotNull String $receiver, Locale locale, Object... args)
  {
    ;
    Object[] tmp3_2 = args; String tmp11_8 = String.format(locale, $receiver, Arrays.copyOf(tmp3_2, tmp3_2.length));Intrinsics.checkExpressionValueIsNotNull(tmp11_8, "java.lang.String.format(locale, this, *args)");return tmp11_8;
  }
  

  @InlineOnly
  private static final String format(@NotNull StringCompanionObject $receiver, Locale locale, String format, Object... args)
  {
    ;
    Object[] tmp3_2 = args; String tmp11_8 = String.format(locale, format, Arrays.copyOf(tmp3_2, tmp3_2.length));Intrinsics.checkExpressionValueIsNotNull(tmp11_8, "java.lang.String.format(locale, format, *args)");return tmp11_8;
  }
  



  @NotNull
  public static final java.util.List<String> split(@NotNull CharSequence $receiver, @NotNull Pattern regex, int limit)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(regex, "regex");int i = limit >= 0 ? 1 : 0; if (i == 0) { int $i$a$1$require; String str = "Limit must be non-negative, but was " + limit + '.';throw ((Throwable)new IllegalArgumentException(str.toString())); }
    String[] tmp82_79 = regex.split($receiver, limit == 0 ? -1 : limit);Intrinsics.checkExpressionValueIsNotNull(tmp82_79, "regex.split(this, if (limit == 0) -1 else limit)");return kotlin.collections.ArraysKt.asList(tmp82_79);
  }
  
  @InlineOnly
  private static final String substring(@NotNull String $receiver, int startIndex)
  {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); String tmp19_16 = $receiver.substring(startIndex);Intrinsics.checkExpressionValueIsNotNull(tmp19_16, "(this as java.lang.String).substring(startIndex)");return tmp19_16;
  }
  

  @InlineOnly
  private static final String substring(@NotNull String $receiver, int startIndex, int endIndex)
  {
    ;
    
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); String tmp20_17 = $receiver.substring(startIndex, endIndex);Intrinsics.checkExpressionValueIsNotNull(tmp20_17, "(this as java.lang.Strin…ing(startIndex, endIndex)");return tmp20_17;
  }
  


  public static final boolean startsWith(@NotNull String $receiver, @NotNull String prefix, boolean ignoreCase)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(prefix, "prefix"); if (!ignoreCase) {
      return $receiver.startsWith(prefix);
    }
    return StringsKt.regionMatches($receiver, 0, prefix, 0, prefix.length(), ignoreCase);
  }
  



  public static final boolean startsWith(@NotNull String $receiver, @NotNull String prefix, int startIndex, boolean ignoreCase)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(prefix, "prefix"); if (!ignoreCase) {
      return $receiver.startsWith(prefix, startIndex);
    }
    return StringsKt.regionMatches($receiver, startIndex, prefix, 0, prefix.length(), ignoreCase);
  }
  



  public static final boolean endsWith(@NotNull String $receiver, @NotNull String suffix, boolean ignoreCase)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(suffix, "suffix"); if (!ignoreCase) {
      return $receiver.endsWith(suffix);
    }
    return StringsKt.regionMatches($receiver, $receiver.length() - suffix.length(), suffix, 0, suffix.length(), true);
  }
  





  @InlineOnly
  private static final String String(byte[] bytes, int offset, int length, Charset charset)
  {
    ;
    



    return new String(bytes, offset, length, charset);
  }
  
  @InlineOnly
  private static final String String(byte[] bytes, Charset charset)
  {
    ;
    return new String(bytes, charset);
  }
  



  @InlineOnly
  private static final String String(byte[] bytes, int offset, int length)
  {
    ;
    

    return new String(bytes, offset, length, Charsets.UTF_8);
  }
  

  @InlineOnly
  private static final String String(byte[] bytes)
  {
    ;
    return new String(bytes, Charsets.UTF_8);
  }
  
  @InlineOnly
  private static final String String(char[] chars)
  {
    ;
    return new String(chars);
  }
  


  @InlineOnly
  private static final String String(char[] chars, int offset, int length)
  {
    ;
    
    return new String(chars, offset, length);
  }
  
  @InlineOnly
  private static final String String(int[] codePoints, int offset, int length)
  {
    ;
    return new String(codePoints, offset, length);
  }
  
  @InlineOnly
  private static final String String(StringBuffer stringBuffer)
  {
    ;
    return new String(stringBuffer);
  }
  
  @InlineOnly
  private static final String String(StringBuilder stringBuilder)
  {
    ;
    return new String(stringBuilder);
  }
  
  @InlineOnly
  private static final int codePointAt(@NotNull String $receiver, int index) {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); return $receiver.codePointAt(index);
  }
  
  @InlineOnly
  private static final int codePointBefore(@NotNull String $receiver, int index) {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); return $receiver.codePointBefore(index);
  }
  
  @InlineOnly
  private static final int codePointCount(@NotNull String $receiver, int beginIndex, int endIndex)
  {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); return $receiver.codePointCount(beginIndex, endIndex);
  }
  


  public static final int compareTo(@NotNull String $receiver, @NotNull String other, boolean ignoreCase)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(other, "other"); if (ignoreCase) {
      return $receiver.compareToIgnoreCase(other);
    }
    return $receiver.compareTo(other);
  }
  
  @InlineOnly
  private static final boolean contentEquals(@NotNull String $receiver, CharSequence charSequence)
  {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); return $receiver.contentEquals(charSequence);
  }
  
  @InlineOnly
  private static final boolean contentEquals(@NotNull String $receiver, StringBuffer stringBuilder) {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); return $receiver.contentEquals(stringBuilder);
  }
  
  @InlineOnly
  private static final String intern(@NotNull String $receiver) {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); String tmp18_15 = $receiver.intern();Intrinsics.checkExpressionValueIsNotNull(tmp18_15, "(this as java.lang.String).intern()");return tmp18_15;
  }
  
  /* Error */
  public static final boolean isBlank(@NotNull CharSequence $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 64
    //   3: invokestatic 70	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: invokeinterface 387 1 0
    //   12: ifeq +86 -> 98
    //   15: aload_0
    //   16: invokestatic 391	kotlin/text/StringsKt:getIndices	(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;
    //   19: checkcast 393	java/lang/Iterable
    //   22: astore_1
    //   23: aload_1
    //   24: instanceof 395
    //   27: ifeq +19 -> 46
    //   30: aload_1
    //   31: checkcast 395	java/util/Collection
    //   34: invokeinterface 399 1 0
    //   39: ifeq +7 -> 46
    //   42: iconst_1
    //   43: goto +52 -> 95
    //   46: aload_1
    //   47: invokeinterface 403 1 0
    //   52: astore_2
    //   53: aload_2
    //   54: invokeinterface 408 1 0
    //   59: ifeq +35 -> 94
    //   62: aload_2
    //   63: checkcast 410	kotlin/collections/IntIterator
    //   66: invokevirtual 413	kotlin/collections/IntIterator:nextInt	()I
    //   69: istore_3
    //   70: iload_3
    //   71: istore 4
    //   73: aload_0
    //   74: iload 4
    //   76: invokeinterface 417 2 0
    //   81: invokestatic 423	kotlin/text/CharsKt:isWhitespace	(C)Z
    //   84: ifne -31 -> 53
    //   87: iconst_0
    //   88: goto +7 -> 95
    //   91: nop
    //   92: nop
    //   93: athrow
    //   94: iconst_1
    //   95: ifeq +7 -> 102
    //   98: iconst_1
    //   99: goto +4 -> 103
    //   102: iconst_0
    //   103: ireturn
    // Line number table:
    //   Java source line #355	-> byte code offset #6
    //   Java source line #480	-> byte code offset #23
    //   Java source line #481	-> byte code offset #46
    //   Java source line #355	-> byte code offset #73
    //   Java source line #482	-> byte code offset #94
    //   Java source line #355	-> byte code offset #103
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	$receiver	CharSequence
    //   23	72	1	$receiver$iv	Iterable
    //   70	21	3	element$iv	int
    //   73	11	4	it	int
    //   73	11	5	$i$a$1$all	int
    //   23	72	6	$i$f$all	int
  }
  
  @InlineOnly
  private static final int offsetByCodePoints(@NotNull String $receiver, int index, int codePointOffset)
  {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); return $receiver.offsetByCodePoints(index, codePointOffset);
  }
  






  public static final boolean regionMatches(@NotNull CharSequence $receiver, int thisOffset, @NotNull CharSequence other, int otherOffset, int length, boolean ignoreCase)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(other, "other"); if ((($receiver instanceof String)) && ((other instanceof String))) {
      return StringsKt.regionMatches((String)$receiver, thisOffset, (String)other, otherOffset, length, ignoreCase);
    }
    return StringsKt.regionMatchesImpl($receiver, thisOffset, other, otherOffset, length, ignoreCase);
  }
  






  public static final boolean regionMatches(@NotNull String $receiver, int thisOffset, @NotNull String other, int otherOffset, int length, boolean ignoreCase)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(other, "other");
    

    return !ignoreCase ? $receiver.regionMatches(thisOffset, other, otherOffset, length) : $receiver.regionMatches(ignoreCase, thisOffset, other, otherOffset, length);
  }
  
  @InlineOnly
  private static final String toLowerCase(@NotNull String $receiver, Locale locale) {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); String tmp19_16 = $receiver.toLowerCase(locale);Intrinsics.checkExpressionValueIsNotNull(tmp19_16, "(this as java.lang.String).toLowerCase(locale)");return tmp19_16;
  }
  
  @InlineOnly
  private static final String toUpperCase(@NotNull String $receiver, Locale locale) {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); String tmp19_16 = $receiver.toUpperCase(locale);Intrinsics.checkExpressionValueIsNotNull(tmp19_16, "(this as java.lang.String).toUpperCase(locale)");return tmp19_16;
  }
  
  @InlineOnly
  private static final byte[] toByteArray(@NotNull String $receiver, Charset charset)
  {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); byte[] tmp19_16 = $receiver.getBytes(charset);Intrinsics.checkExpressionValueIsNotNull(tmp19_16, "(this as java.lang.String).getBytes(charset)");return tmp19_16;
  }
  

  @InlineOnly
  private static final Pattern toPattern(@NotNull String $receiver, int flags)
  {
    ;
    
    Pattern tmp5_2 = Pattern.compile($receiver, flags);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "java.util.regex.Pattern.compile(this, flags)");return tmp5_2;
  }
  




  @NotNull
  public static final String capitalize(@NotNull String $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");CharSequence localCharSequence = (CharSequence)$receiver; StringBuilder localStringBuilder; String str; if ((localCharSequence.length() > 0 ? 1 : 0) != 0) { char c = $receiver.charAt(0);Object localObject = $receiver;int i = 0;int j = 1;localStringBuilder = new StringBuilder(); String tmp62_59 = ((String)localObject).substring(i, j);Intrinsics.checkExpressionValueIsNotNull(tmp62_59, "(this as java.lang.Strin…ing(startIndex, endIndex)");str = tmp62_59;localObject = str;localStringBuilder = localStringBuilder; Object tmp79_78 = localObject; if (tmp79_78 == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); String tmp96_93 = tmp79_78.toUpperCase();Intrinsics.checkExpressionValueIsNotNull(tmp96_93, "(this as java.lang.String).toUpperCase()");str = tmp96_93;localObject = $receiver;i = 1;localStringBuilder = localStringBuilder.append(str); String tmp122_119 = ((String)localObject).substring(i);Intrinsics.checkExpressionValueIsNotNull(tmp122_119, "(this as java.lang.String).substring(startIndex)");str = tmp122_119; } return Character.isLowerCase(c) ? str : $receiver;
  }
  




  @NotNull
  public static final String decapitalize(@NotNull String $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");CharSequence localCharSequence = (CharSequence)$receiver; StringBuilder localStringBuilder; String str; if ((localCharSequence.length() > 0 ? 1 : 0) != 0) { char c = $receiver.charAt(0);Object localObject = $receiver;int i = 0;int j = 1;localStringBuilder = new StringBuilder(); String tmp62_59 = ((String)localObject).substring(i, j);Intrinsics.checkExpressionValueIsNotNull(tmp62_59, "(this as java.lang.Strin…ing(startIndex, endIndex)");str = tmp62_59;localObject = str;localStringBuilder = localStringBuilder; Object tmp79_78 = localObject; if (tmp79_78 == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); String tmp96_93 = tmp79_78.toLowerCase();Intrinsics.checkExpressionValueIsNotNull(tmp96_93, "(this as java.lang.String).toLowerCase()");str = tmp96_93;localObject = $receiver;i = 1;localStringBuilder = localStringBuilder.append(str); String tmp122_119 = ((String)localObject).substring(i);Intrinsics.checkExpressionValueIsNotNull(tmp122_119, "(this as java.lang.String).substring(startIndex)");str = tmp122_119; } return Character.isUpperCase(c) ? str : $receiver;
  }
  



  @NotNull
  public static final String repeat(@NotNull CharSequence $receiver, int n)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");char c1 = n >= 0 ? '\001' : '\000'; if (c1 == 0) { int $i$a$1$require; String str = "Count 'n' must be non-negative, but was " + n + '.';throw ((Throwable)new IllegalArgumentException(str.toString()));
    }
    switch (n) {
    case 0:  tmpTernaryOp = ""; break;
    case 1:  tmpTernaryOp = $receiver.toString(); break; default:  char char;
      int size$iv;
      char[] arrayOfChar1; switch ($receiver.length()) {
      case 0:  tmpTernaryOp = ""; break;
      case 1:  c1 = $receiver.charAt(0);char = c1; int $i$a$2$let; size$iv = n;
        

















        int $i$f$CharArray;
        

















        char[] result$iv = new char[size$iv];
        int i = 0; for (int j = result$iv.length; i < j;) { int i$iv;
          int k = i$iv;int m = i$iv;char[] arrayOfChar2 = result$iv;
          int $i$a$1$<init>;
          int it;
          int n = char;arrayOfChar2[m] = n;
          





































          i$iv++;
        }
        
        arrayOfChar1 = result$iv;tmpTernaryOp = new String(arrayOfChar1); break;
      default: 
        StringBuilder sb = new StringBuilder(n * $receiver.length());
        char = '\001';char c2 = n; int i; for (char > c2;; i++) {
          sb.append($receiver);
          if (i == c2)
            break;
        }
        Intrinsics.checkExpressionValueIsNotNull(sb.toString(), "sb.toString()");
      }
      break;
    }
    return 
    










      tmp261_258;
  }
  









  @NotNull
  public static final java.util.Comparator<String> getCASE_INSENSITIVE_ORDER(@NotNull StringCompanionObject $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); java.util.Comparator tmp9_6 = String.CASE_INSENSITIVE_ORDER;Intrinsics.checkExpressionValueIsNotNull(tmp9_6, "java.lang.String.CASE_INSENSITIVE_ORDER");return tmp9_6;
  }
  
  public StringsKt__StringsJVMKt() {}
}

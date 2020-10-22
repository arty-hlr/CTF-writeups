package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KDeclarationContainer;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


















































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000f\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\"\n\002\b\002\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\r\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020 \n\002\b\004\n\002\020\000\n\002\b\003\030\000 ,2\0060\001j\002`\002:\002,-B\017\b\026\022\006\020\003\032\0020\004¢\006\002\020\005B\027\b\026\022\006\020\003\032\0020\004\022\006\020\006\032\0020\007¢\006\002\020\bB\035\b\026\022\006\020\003\032\0020\004\022\f\020\t\032\b\022\004\022\0020\0070\n¢\006\002\020\013B\017\b\001\022\006\020\f\032\0020\r¢\006\002\020\016J\016\020\024\032\0020\0252\006\020\026\032\0020\027J\032\020\030\032\004\030\0010\0312\006\020\026\032\0020\0272\b\b\002\020\032\032\0020\033J\036\020\034\032\b\022\004\022\0020\0310\0352\006\020\026\032\0020\0272\b\b\002\020\032\032\0020\033J\020\020\036\032\004\030\0010\0312\006\020\026\032\0020\027J\021\020\037\032\0020\0252\006\020\026\032\0020\027H\004J\"\020 \032\0020\0042\006\020\026\032\0020\0272\022\020!\032\016\022\004\022\0020\031\022\004\022\0020\0270\"J\026\020 \032\0020\0042\006\020\026\032\0020\0272\006\020#\032\0020\004J\026\020$\032\0020\0042\006\020\026\032\0020\0272\006\020#\032\0020\004J\036\020%\032\b\022\004\022\0020\0040&2\006\020\026\032\0020\0272\b\b\002\020'\032\0020\033J\006\020(\032\0020\rJ\b\020)\032\0020\004H\026J\b\020*\032\0020+H\002R\026\020\017\032\n\022\004\022\0020\007\030\0010\nX\016¢\006\002\n\000R\016\020\f\032\0020\rX\004¢\006\002\n\000R\027\020\t\032\b\022\004\022\0020\0070\n8F¢\006\006\032\004\b\020\020\021R\021\020\003\032\0020\0048F¢\006\006\032\004\b\022\020\023¨\006."}, d2={"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "(Ljava/lang/String;)V", "option", "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "options", "", "(Ljava/lang/String;Ljava/util/Set;)V", "nativePattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;)V", "_options", "getOptions", "()Ljava/util/Set;", "getPattern", "()Ljava/lang/String;", "containsMatchIn", "", "input", "", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchEntire", "matches", "replace", "transform", "Lkotlin/Function1;", "replacement", "replaceFirst", "split", "", "limit", "toPattern", "toString", "writeReplace", "", "Companion", "Serialized", "kotlin-stdlib"})
public final class Regex
  implements Serializable
{
  private Set<? extends RegexOption> _options;
  private final Pattern nativePattern;
  public static final Companion Companion = new Companion(null);
  
  @PublishedApi
  public Regex(@NotNull Pattern nativePattern)
  {
    this.nativePattern = nativePattern;
  }
  
  public Regex(@NotNull String pattern) {
    this(tmp12_9);
  }
  
  public Regex(@NotNull String pattern, @NotNull RegexOption option) { this(tmp29_26); }
  
  public Regex(@NotNull String pattern, @NotNull Set<? extends RegexOption> options) {
    this(tmp32_29);
  }
  
  @NotNull
  public final String getPattern() {
    String tmp7_4 = nativePattern.pattern();Intrinsics.checkExpressionValueIsNotNull(tmp7_4, "nativePattern.pattern()");return tmp7_4;
  }
  


  public final boolean matches(@NotNull CharSequence input)
  {
    Intrinsics.checkParameterIsNotNull(input, "input");return nativePattern.matcher(input).matches();
  }
  
  public final boolean containsMatchIn(@NotNull CharSequence input) { Intrinsics.checkParameterIsNotNull(input, "input");return nativePattern.matcher(input).find();
  }
  




  @Nullable
  public final MatchResult find(@NotNull CharSequence input, int startIndex)
  {
    Intrinsics.checkParameterIsNotNull(input, "input"); Matcher tmp14_11 = nativePattern.matcher(input);Intrinsics.checkExpressionValueIsNotNull(tmp14_11, "nativePattern.matcher(input)");return RegexKt.access$findNext(tmp14_11, startIndex, input);
  }
  

  @NotNull
  public final Sequence<MatchResult> findAll(@NotNull final CharSequence input, final int startIndex)
  {
    Intrinsics.checkParameterIsNotNull(input, "input");SequencesKt.generateSequence((Function0)new Lambda(input) { @Nullable
      public final MatchResult invoke() { return this$0.find(input, startIndex); } }, (Function1)findAll.2.INSTANCE);
  }
  

  @Nullable
  public final MatchResult matchEntire(@NotNull CharSequence input)
  {
    Intrinsics.checkParameterIsNotNull(input, "input"); Matcher tmp14_11 = nativePattern.matcher(input);Intrinsics.checkExpressionValueIsNotNull(tmp14_11, "nativePattern.matcher(input)");return RegexKt.access$matchEntire(tmp14_11, input);
  }
  

  @NotNull
  public final String replace(@NotNull CharSequence input, @NotNull String replacement)
  {
    Intrinsics.checkParameterIsNotNull(input, "input");Intrinsics.checkParameterIsNotNull(replacement, "replacement"); String tmp24_21 = nativePattern.matcher(input).replaceAll(replacement);Intrinsics.checkExpressionValueIsNotNull(tmp24_21, "nativePattern.matcher(in…).replaceAll(replacement)");return tmp24_21;
  }
  




























  @NotNull
  public final String replaceFirst(@NotNull CharSequence input, @NotNull String replacement)
  {
    Intrinsics.checkParameterIsNotNull(input, "input");Intrinsics.checkParameterIsNotNull(replacement, "replacement"); String tmp24_21 = nativePattern.matcher(input).replaceFirst(replacement);Intrinsics.checkExpressionValueIsNotNull(tmp24_21, "nativePattern.matcher(in…replaceFirst(replacement)");return tmp24_21;
  }
  





  @NotNull
  public final List<String> split(@NotNull CharSequence input, int limit)
  {
    Intrinsics.checkParameterIsNotNull(input, "input");int i = limit >= 0 ? 1 : 0; if (i == 0) { int $i$a$1$require; String str1 = "Limit must be non-negative, but was " + limit + '.';throw ((Throwable)new IllegalArgumentException(str1.toString()));
    }
    Matcher matcher = nativePattern.matcher(input);
    if ((!matcher.find()) || (limit == 1)) { return CollectionsKt.listOf(input.toString());
    }
    ArrayList result = new ArrayList(limit > 0 ? RangesKt.coerceAtMost(limit, 10) : 10);
    int lastStart = 0;
    int lastSplit = limit - 1;
    do
    {
      localCharSequence = input;j = matcher.start();localArrayList1 = result;str2 = localCharSequence.subSequence(lastStart, j).toString();localArrayList1.add(str2);
      lastStart = matcher.end();
    } while (((lastSplit < 0) || (result.size() != lastSplit)) && 
      (matcher.find()));
    
    CharSequence localCharSequence = input;int j = input.length();ArrayList localArrayList1 = result;String str2 = localCharSequence.subSequence(lastStart, j).toString();localArrayList1.add(str2);
    
    return (List)result;
  }
  



  @NotNull
  public String toString()
  {
    String tmp7_4 = nativePattern.toString();Intrinsics.checkExpressionValueIsNotNull(tmp7_4, "nativePattern.toString()");return tmp7_4;
  }
  



  @NotNull
  public final Pattern toPattern() { return nativePattern; }
  
  private final Object writeReplace() { String tmp11_8 = nativePattern.pattern();Intrinsics.checkExpressionValueIsNotNull(tmp11_8, "nativePattern.pattern()");return new Serialized(tmp11_8, nativePattern.flags());
  }
  
  /* Error */
  @NotNull
  public final Set<RegexOption> getOptions()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	kotlin/text/Regex:_options	Ljava/util/Set;
    //   4: dup
    //   5: ifnull +6 -> 11
    //   8: goto +62 -> 70
    //   11: pop
    //   12: aload_0
    //   13: getfield 13	kotlin/text/Regex:nativePattern	Ljava/util/regex/Pattern;
    //   16: invokevirtual 39	java/util/regex/Pattern:flags	()I
    //   19: istore_1
    //   20: ldc 41
    //   22: invokestatic 47	java/util/EnumSet:allOf	(Ljava/lang/Class;)Ljava/util/EnumSet;
    //   25: astore_2
    //   26: aload_2
    //   27: astore_3
    //   28: aload_3
    //   29: checkcast 49	java/lang/Iterable
    //   32: new 51	kotlin/text/Regex$fromInt$$inlined$apply$lambda$1
    //   35: dup
    //   36: iload_1
    //   37: invokespecial 55	kotlin/text/Regex$fromInt$$inlined$apply$lambda$1:<init>	(I)V
    //   40: checkcast 57	kotlin/jvm/functions/Function1
    //   43: invokestatic 63	kotlin/collections/CollectionsKt:retainAll	(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Z
    //   46: pop
    //   47: nop
    //   48: aload_2
    //   49: checkcast 65	java/util/Set
    //   52: invokestatic 71	java/util/Collections:unmodifiableSet	(Ljava/util/Set;)Ljava/util/Set;
    //   55: dup
    //   56: ldc 73
    //   58: invokestatic 26	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   61: astore_1
    //   62: aload_1
    //   63: astore_2
    //   64: aload_0
    //   65: aload_2
    //   66: putfield 35	kotlin/text/Regex:_options	Ljava/util/Set;
    //   69: aload_1
    //   70: areturn
    // Line number table:
    //   Java source line #104	-> byte code offset #0
    //   Java source line #313	-> byte code offset #20
    //   Java source line #314	-> byte code offset #28
    //   Java source line #315	-> byte code offset #47
    //   Java source line #313	-> byte code offset #48
    //   Java source line #313	-> byte code offset #52
    //   Java source line #315	-> byte code offset #61
    //   Java source line #104	-> byte code offset #62
    //   Java source line #104	-> byte code offset #64
    //   Java source line #104	-> byte code offset #69
    //   Java source line #104	-> byte code offset #70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	this	Regex
    //   20	41	1	value$iv	int
    //   64	5	2	it	Set
    //   28	19	3	$receiver$iv	java.util.EnumSet
    //   64	5	3	$i$a$1$also	int
    //   28	19	4	$i$a$1$apply	int
    //   20	41	5	$i$f$fromInt	int
  }
  
  /* Error */
  @NotNull
  public final String replace(@NotNull CharSequence input, @NotNull Function1<? super MatchResult, ? extends CharSequence> transform)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 85
    //   3: invokestatic 88	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_2
    //   7: ldc -94
    //   9: invokestatic 88	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: aload_1
    //   14: iconst_0
    //   15: iconst_2
    //   16: aconst_null
    //   17: invokestatic 164	kotlin/text/Regex:find$default	(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;
    //   20: dup
    //   21: ifnull +6 -> 27
    //   24: goto +9 -> 33
    //   27: pop
    //   28: aload_1
    //   29: invokevirtual 167	java/lang/Object:toString	()Ljava/lang/String;
    //   32: areturn
    //   33: astore_3
    //   34: iconst_0
    //   35: istore 4
    //   37: aload_1
    //   38: invokeinterface 172 1 0
    //   43: istore 5
    //   45: new 174	java/lang/StringBuilder
    //   48: dup
    //   49: iload 5
    //   51: invokespecial 175	java/lang/StringBuilder:<init>	(I)V
    //   54: astore 6
    //   56: aload_3
    //   57: dup
    //   58: ifnonnull +6 -> 64
    //   61: invokestatic 179	kotlin/jvm/internal/Intrinsics:throwNpe	()V
    //   64: astore 7
    //   66: aload 6
    //   68: aload_1
    //   69: iload 4
    //   71: aload 7
    //   73: invokeinterface 185 1 0
    //   78: invokevirtual 191	kotlin/ranges/IntRange:getStart	()Ljava/lang/Integer;
    //   81: invokevirtual 196	java/lang/Integer:intValue	()I
    //   84: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: aload 6
    //   90: aload_2
    //   91: aload 7
    //   93: invokeinterface 204 2 0
    //   98: checkcast 169	java/lang/CharSequence
    //   101: invokevirtual 207	java/lang/StringBuilder:append	(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: aload 7
    //   107: invokeinterface 185 1 0
    //   112: invokevirtual 210	kotlin/ranges/IntRange:getEndInclusive	()Ljava/lang/Integer;
    //   115: invokevirtual 196	java/lang/Integer:intValue	()I
    //   118: iconst_1
    //   119: iadd
    //   120: istore 4
    //   122: aload 7
    //   124: invokeinterface 214 1 0
    //   129: astore_3
    //   130: iload 4
    //   132: iload 5
    //   134: if_icmpge +7 -> 141
    //   137: aload_3
    //   138: ifnonnull -82 -> 56
    //   141: iload 4
    //   143: iload 5
    //   145: if_icmpge +14 -> 159
    //   148: aload 6
    //   150: aload_1
    //   151: iload 4
    //   153: iload 5
    //   155: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
    //   158: pop
    //   159: aload 6
    //   161: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   164: dup
    //   165: ldc -39
    //   167: invokestatic 26	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   170: areturn
    // Line number table:
    //   Java source line #149	-> byte code offset #12
    //   Java source line #151	-> byte code offset #34
    //   Java source line #152	-> byte code offset #37
    //   Java source line #153	-> byte code offset #45
    //   Java source line #154	-> byte code offset #56
    //   Java source line #155	-> byte code offset #56
    //   Java source line #156	-> byte code offset #66
    //   Java source line #157	-> byte code offset #88
    //   Java source line #158	-> byte code offset #105
    //   Java source line #159	-> byte code offset #122
    //   Java source line #160	-> byte code offset #130
    //   Java source line #162	-> byte code offset #141
    //   Java source line #163	-> byte code offset #148
    //   Java source line #166	-> byte code offset #159
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	171	0	this	Regex
    //   0	171	1	input	CharSequence
    //   0	171	2	transform	Function1
    //   34	137	3	match	MatchResult
    //   37	134	4	lastStart	int
    //   45	126	5	length	int
    //   56	115	6	sb	StringBuilder
    //   66	75	7	foundMatch	MatchResult
  }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\006\n\002\020\000\n\002\b\002\b\002\030\000 \0162\0060\001j\002`\002:\001\016B\025\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\002\020\007J\b\020\f\032\0020\rH\002R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\b\020\tR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\n\020\013¨\006\017"}, d2={"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "flags", "", "(Ljava/lang/String;I)V", "getFlags", "()I", "getPattern", "()Ljava/lang/String;", "readResolve", "", "Companion", "kotlin-stdlib"})
  private static final class Serialized
    implements Serializable
  {
    @NotNull
    private final String pattern;
    private final int flags;
    private static final long serialVersionUID = 0L;
    public static final Companion Companion = new Companion(null);
    
    public Serialized(@NotNull String pattern, int flags)
    {
      this.pattern = pattern;this.flags = flags; } public final int getFlags() { return flags; } @NotNull
    public final String getPattern() { return pattern; }
    

    private final Object readResolve()
    {
      Pattern tmp15_12 = Pattern.compile(pattern, flags);Intrinsics.checkExpressionValueIsNotNull(tmp15_12, "Pattern.compile(pattern, flags)");return new Regex(tmp15_12);
    }
    
    @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\t\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000¨\006\005"}, d2={"Lkotlin/text/Regex$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"})
    public static final class Companion { private Companion() {} } }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\004H\002J\016\020\006\032\0020\0072\006\020\b\032\0020\007J\016\020\t\032\0020\0072\006\020\b\032\0020\007J\016\020\n\032\0020\0132\006\020\b\032\0020\007¨\006\f"}, d2={"Lkotlin/text/Regex$Companion;", "", "()V", "ensureUnicodeCase", "", "flags", "escape", "", "literal", "escapeReplacement", "fromLiteral", "Lkotlin/text/Regex;", "kotlin-stdlib"})
  public static final class Companion { @NotNull
    public final Regex fromLiteral(@NotNull String literal) { Intrinsics.checkParameterIsNotNull(literal, "literal");String str = literal;RegexOption localRegexOption = RegexOption.LITERAL;return new Regex(str, localRegexOption);
    }
    
    @NotNull
    public final String escape(@NotNull String literal)
    {
      Intrinsics.checkParameterIsNotNull(literal, "literal"); String tmp10_7 = Pattern.quote(literal);Intrinsics.checkExpressionValueIsNotNull(tmp10_7, "Pattern.quote(literal)");return tmp10_7;
    }
    
    @NotNull
    public final String escapeReplacement(@NotNull String literal)
    {
      Intrinsics.checkParameterIsNotNull(literal, "literal"); String tmp10_7 = Matcher.quoteReplacement(literal);Intrinsics.checkExpressionValueIsNotNull(tmp10_7, "Matcher.quoteReplacement(literal)");return tmp10_7; }
    
    private final int ensureUnicodeCase(int flags) { return (flags & 0x2) != 0 ? flags | 0x40 : flags; }
    
    private Companion() {}
  }
}

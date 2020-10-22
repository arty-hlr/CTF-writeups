package kotlin.internal.jdk8;

import kotlin.Metadata;
import kotlin.internal.jdk7.JDK7PlatformImplementations;
import kotlin.random.Random;
import kotlin.random.jdk8.PlatformThreadLocalRandom;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000$\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\b\020\030\0002\0020\001B\005¢\006\002\020\002J\b\020\003\032\0020\004H\026J\032\020\005\032\004\030\0010\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2={"Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "()V", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "kotlin-stdlib-jdk8"})
public class JDK8PlatformImplementations
  extends JDK7PlatformImplementations
{
  /* Error */
  @org.jetbrains.annotations.Nullable
  public kotlin.text.MatchGroup getMatchResultNamedGroup(@NotNull java.util.regex.MatchResult matchResult, @NotNull String name)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 10
    //   3: invokestatic 16	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_2
    //   7: ldc 18
    //   9: invokestatic 16	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_1
    //   13: dup
    //   14: instanceof 20
    //   17: ifne +5 -> 22
    //   20: pop
    //   21: aconst_null
    //   22: checkcast 20	java/util/regex/Matcher
    //   25: dup
    //   26: ifnull +6 -> 32
    //   29: goto +17 -> 46
    //   32: pop
    //   33: new 22	java/lang/UnsupportedOperationException
    //   36: dup
    //   37: ldc 24
    //   39: invokespecial 28	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;)V
    //   42: checkcast 30	java/lang/Throwable
    //   45: athrow
    //   46: astore_3
    //   47: aload_3
    //   48: aload_2
    //   49: invokevirtual 34	java/util/regex/Matcher:start	(Ljava/lang/String;)I
    //   52: istore 5
    //   54: new 36	kotlin/ranges/IntRange
    //   57: dup
    //   58: iload 5
    //   60: aload_3
    //   61: aload_2
    //   62: invokevirtual 39	java/util/regex/Matcher:end	(Ljava/lang/String;)I
    //   65: iconst_1
    //   66: isub
    //   67: invokespecial 42	kotlin/ranges/IntRange:<init>	(II)V
    //   70: astore 4
    //   72: aload 4
    //   74: invokevirtual 46	kotlin/ranges/IntRange:getStart	()Ljava/lang/Integer;
    //   77: invokevirtual 52	java/lang/Integer:intValue	()I
    //   80: iflt +26 -> 106
    //   83: new 54	kotlin/text/MatchGroup
    //   86: dup
    //   87: aload_3
    //   88: aload_2
    //   89: invokevirtual 58	java/util/regex/Matcher:group	(Ljava/lang/String;)Ljava/lang/String;
    //   92: dup
    //   93: ldc 60
    //   95: invokestatic 63	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   98: aload 4
    //   100: invokespecial 66	kotlin/text/MatchGroup:<init>	(Ljava/lang/String;Lkotlin/ranges/IntRange;)V
    //   103: goto +4 -> 107
    //   106: aconst_null
    //   107: areturn
    // Line number table:
    //   Java source line #30	-> byte code offset #12
    //   Java source line #32	-> byte code offset #47
    //   Java source line #33	-> byte code offset #72
    //   Java source line #34	-> byte code offset #83
    //   Java source line #36	-> byte code offset #106
    //   Java source line #33	-> byte code offset #107
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	this	JDK8PlatformImplementations
    //   0	108	1	matchResult	java.util.regex.MatchResult
    //   0	108	2	name	String
    //   47	61	3	matcher	java.util.regex.Matcher
    //   72	36	4	range	kotlin.ranges.IntRange
  }
  
  @NotNull
  public Random defaultPlatformRandom()
  {
    return (Random)new PlatformThreadLocalRandom();
  }
  
  public JDK8PlatformImplementations() {}
}

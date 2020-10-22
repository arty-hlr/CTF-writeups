package kotlin.text.jdk8;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\022\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\032\027\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\002¨\006\005"}, d2={"get", "Lkotlin/text/MatchGroup;", "Lkotlin/text/MatchGroupCollection;", "name", "", "kotlin-stdlib-jdk8"}, pn="kotlin.text")
@JvmName(name="RegexExtensionsJDK8Kt")
public final class RegexExtensionsJDK8Kt
{
  /* Error */
  @kotlin.SinceKotlin(version="1.2")
  @org.jetbrains.annotations.Nullable
  public static final kotlin.text.MatchGroup get(@org.jetbrains.annotations.NotNull kotlin.text.MatchGroupCollection $receiver, @org.jetbrains.annotations.NotNull String name)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 16
    //   3: invokestatic 22	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 23
    //   9: invokestatic 22	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: dup
    //   14: instanceof 25
    //   17: ifne +5 -> 22
    //   20: pop
    //   21: aconst_null
    //   22: checkcast 25	kotlin/text/MatchNamedGroupCollection
    //   25: dup
    //   26: ifnull +6 -> 32
    //   29: goto +17 -> 46
    //   32: pop
    //   33: new 27	java/lang/UnsupportedOperationException
    //   36: dup
    //   37: ldc 29
    //   39: invokespecial 33	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;)V
    //   42: checkcast 35	java/lang/Throwable
    //   45: athrow
    //   46: astore_2
    //   47: aload_2
    //   48: aload_1
    //   49: invokeinterface 38 2 0
    //   54: areturn
    // Line number table:
    //   Java source line #31	-> byte code offset #12
    //   Java source line #32	-> byte code offset #33
    //   Java source line #31	-> byte code offset #46
    //   Java source line #34	-> byte code offset #47
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	$receiver	kotlin.text.MatchGroupCollection
    //   0	55	1	name	String
    //   47	8	2	namedGroups	kotlin.text.MatchNamedGroupCollection
  }
}

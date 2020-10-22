package kotlin.random;

import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementations;
import kotlin.internal.PlatformImplementationsKt;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\036\n\000\n\002\030\002\n\000\n\002\020\006\n\000\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\002\032\t\020\000\032\0020\001H\b\032\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\005H\000\032\020\020\007\032\0020\0052\006\020\b\032\0020\005H\000\032\f\020\t\032\0020\n*\0020\001H\007\032\f\020\013\032\0020\001*\0020\nH\007¨\006\f"}, d2={"defaultPlatformRandom", "Lkotlin/random/Random;", "doubleFromParts", "", "hi26", "", "low27", "fastLog2", "value", "asJavaRandom", "Ljava/util/Random;", "asKotlinRandom", "kotlin-stdlib"})
public final class PlatformRandomKt
{
  /* Error */
  @kotlin.SinceKotlin(version="1.3")
  @org.jetbrains.annotations.NotNull
  public static final java.util.Random asJavaRandom(@org.jetbrains.annotations.NotNull Random $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 12
    //   3: invokestatic 18	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: dup
    //   8: instanceof 20
    //   11: ifne +5 -> 16
    //   14: pop
    //   15: aconst_null
    //   16: checkcast 20	kotlin/random/AbstractPlatformRandom
    //   19: dup
    //   20: ifnull +13 -> 33
    //   23: invokevirtual 24	kotlin/random/AbstractPlatformRandom:getImpl	()Ljava/util/Random;
    //   26: dup
    //   27: ifnull +6 -> 33
    //   30: goto +15 -> 45
    //   33: pop
    //   34: new 26	kotlin/random/KotlinRandom
    //   37: dup
    //   38: aload_0
    //   39: invokespecial 30	kotlin/random/KotlinRandom:<init>	(Lkotlin/random/Random;)V
    //   42: checkcast 32	java/util/Random
    //   45: areturn
    // Line number table:
    //   Java source line #16	-> byte code offset #6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	$receiver	Random
  }
  
  /* Error */
  @kotlin.SinceKotlin(version="1.3")
  @org.jetbrains.annotations.NotNull
  public static final Random asKotlinRandom(@org.jetbrains.annotations.NotNull java.util.Random $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 12
    //   3: invokestatic 18	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: dup
    //   8: instanceof 26
    //   11: ifne +5 -> 16
    //   14: pop
    //   15: aconst_null
    //   16: checkcast 26	kotlin/random/KotlinRandom
    //   19: dup
    //   20: ifnull +13 -> 33
    //   23: invokevirtual 41	kotlin/random/KotlinRandom:getImpl	()Lkotlin/random/Random;
    //   26: dup
    //   27: ifnull +6 -> 33
    //   30: goto +15 -> 45
    //   33: pop
    //   34: new 43	kotlin/random/PlatformRandom
    //   37: dup
    //   38: aload_0
    //   39: invokespecial 46	kotlin/random/PlatformRandom:<init>	(Ljava/util/Random;)V
    //   42: checkcast 36	kotlin/random/Random
    //   45: areturn
    // Line number table:
    //   Java source line #23	-> byte code offset #6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	$receiver	java.util.Random
  }
  
  @InlineOnly
  private static final Random defaultPlatformRandom()
  {
    ;
    return PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();
  }
  
  public static final int fastLog2(int value) { return 31 - Integer.numberOfLeadingZeros(value); }
  
  public static final double doubleFromParts(int hi26, int low27) {
    return ((hi26 << 27) + low27) / 9007199254740992L;
  }
}

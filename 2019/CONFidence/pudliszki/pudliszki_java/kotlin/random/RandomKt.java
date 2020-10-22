package kotlin.random;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import org.jetbrains.annotations.NotNull;
















































































































































































































































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000:\n\000\n\002\030\002\n\000\n\002\020\b\n\002\020\t\n\000\n\002\020\016\n\000\n\002\020\000\n\002\b\002\n\002\020\002\n\002\020\006\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\007\032\020\020\000\032\0020\0012\006\020\002\032\0020\004H\007\032\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\bH\000\032\030\020\n\032\0020\0132\006\020\007\032\0020\f2\006\020\t\032\0020\fH\000\032\030\020\n\032\0020\0132\006\020\007\032\0020\0032\006\020\t\032\0020\003H\000\032\030\020\n\032\0020\0132\006\020\007\032\0020\0042\006\020\t\032\0020\004H\000\032\024\020\r\032\0020\003*\0020\0012\006\020\016\032\0020\017H\007\032\024\020\020\032\0020\004*\0020\0012\006\020\016\032\0020\021H\007\032\024\020\022\032\0020\003*\0020\0032\006\020\023\032\0020\003H\000¨\006\024"}, d2={"Random", "Lkotlin/random/Random;", "seed", "", "", "boundsErrorMessage", "", "from", "", "until", "checkRangeBounds", "", "", "nextInt", "range", "Lkotlin/ranges/IntRange;", "nextLong", "Lkotlin/ranges/LongRange;", "takeUpperBits", "bitCount", "kotlin-stdlib"})
public final class RandomKt
{
  @SinceKotlin(version="1.3")
  @NotNull
  public static final Random Random(int seed)
  {
    return (Random)new XorWowRandom(seed, seed >> 31);
  }
  






  @SinceKotlin(version="1.3")
  @NotNull
  public static final Random Random(long seed)
  {
    return (Random)new XorWowRandom((int)seed, (int)(seed >> 32));
  }
  








  @SinceKotlin(version="1.3")
  public static final int nextInt(@NotNull Random $receiver, @NotNull IntRange range)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(range, "range"); if (range.isEmpty()) { throw ((Throwable)new IllegalArgumentException("Cannot get random in empty range: " + range));
    }
    

    return range.getFirst() > Integer.MIN_VALUE ? $receiver.nextInt(range.getFirst() - 1, range.getLast()) + 1 : range.getLast() < Integer.MAX_VALUE ? $receiver.nextInt(range.getFirst(), range.getLast() + 1) : $receiver.nextInt();
  }
  






  @SinceKotlin(version="1.3")
  public static final long nextLong(@NotNull Random $receiver, @NotNull LongRange range)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(range, "range"); if (range.isEmpty()) { throw ((Throwable)new IllegalArgumentException("Cannot get random in empty range: " + range));
    }
    

    return range.getStart().longValue() > Long.MIN_VALUE ? $receiver.nextLong(range.getStart().longValue() - 1L, range.getEndInclusive().longValue()) + 1L : range.getLast() < Long.MAX_VALUE ? $receiver.nextLong(range.getStart().longValue(), range.getEndInclusive().longValue() + 1L) : $receiver.nextLong();
  }
  






  public static final int takeUpperBits(int $receiver, int bitCount) { return $receiver >>> 32 - bitCount & -bitCount >> 31; }
  
  public static final void checkRangeBounds(int from, int until) { int i = until > from ? 1 : 0; if (i == 0) { int $i$a$1$require; String str = boundsErrorMessage(Integer.valueOf(from), Integer.valueOf(until));throw ((Throwable)new IllegalArgumentException(str.toString())); } }
  public static final void checkRangeBounds(long from, long until) { int i = until > from ? 1 : 0; if (i == 0) { int $i$a$2$require; String str = boundsErrorMessage(Long.valueOf(from), Long.valueOf(until));throw ((Throwable)new IllegalArgumentException(str.toString())); } }
  public static final void checkRangeBounds(double from, double until) { int i = until > from ? 1 : 0; if (i == 0) { int $i$a$3$require; String str = boundsErrorMessage(Double.valueOf(from), Double.valueOf(until));throw ((Throwable)new IllegalArgumentException(str.toString())); } }
  @NotNull
  public static final String boundsErrorMessage(@NotNull Object from, @NotNull Object until) { Intrinsics.checkParameterIsNotNull(from, "from");Intrinsics.checkParameterIsNotNull(until, "until");return "Random range is empty: [" + from + ", " + until + ").";
  }
}

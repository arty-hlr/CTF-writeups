package kotlin.ranges;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.collections.ULongIterator;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;



































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000:\n\002\030\002\n\002\020\034\n\002\030\002\n\002\b\003\n\002\020\t\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\b\027\030\000 \0322\b\022\004\022\0020\0020\001:\001\032B\"\b\000\022\006\020\003\032\0020\002\022\006\020\004\032\0020\002\022\006\020\005\032\0020\006ø\001\000¢\006\002\020\007J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022H\002J\b\020\023\032\0020\024H\026J\b\020\025\032\0020\020H\026J\t\020\026\032\0020\027H\002J\b\020\030\032\0020\031H\026R\026\020\b\032\0020\002ø\001\000¢\006\n\n\002\020\013\032\004\b\t\020\nR\026\020\f\032\0020\002ø\001\000¢\006\n\n\002\020\013\032\004\b\r\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\016\020\nø\001\000\002\004\n\002\b\031¨\006\033"}, d2={"Lkotlin/ranges/ULongProgression;", "", "Lkotlin/ULong;", "start", "endInclusive", "step", "", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "first", "getFirst", "()J", "J", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "", "isEmpty", "iterator", "Lkotlin/collections/ULongIterator;", "toString", "", "Companion", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
@ExperimentalUnsignedTypes
public class ULongProgression
  implements Iterable<ULong>, KMappedMarker
{
  private final long first;
  private final long last;
  private final long step;
  public static final Companion Companion = new Companion(null);
  
  public final long getFirst()
  {
    return first;
  }
  
  public final long getLast()
  {
    return last;
  }
  
  public final long getStep()
  {
    return step;
  }
  
  private ULongProgression(long start, long endInclusive, long step)
  {
    if (step == 0L) throw ((Throwable)new IllegalArgumentException("Step must be non-zero."));
    if (step == Long.MIN_VALUE) { throw ((Throwable)new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation."));
    }
    



    first = start;
    



    last = UProgressionUtilKt.getProgressionLastElement-7ftBX0g(start, endInclusive, step);
    



    this.step = step; }
  @NotNull
  public ULongIterator iterator() { return (ULongIterator)new ULongProgressionIterator(first, last, step, null); }
  
  public boolean isEmpty() {
    long l1 = first;long l2 = last;l1 = first;l2 = last;return UnsignedKt.ulongCompare(l1, l2) > 0;
  }
  

  public boolean equals(@Nullable Object other) { return ((other instanceof ULongProgression)) && (((isEmpty()) && (((ULongProgression)other).isEmpty())) || ((first == first) && (last == last) && (step == step))); }
  
  public int hashCode() {
    long l1 = first;long l2 = first;int i = 32;int k = 31;int j = 31;long l3 = ULong.constructor-impl(l2 >>> i);l2 = l3;k = k;j = j;l3 = ULong.constructor-impl(l1 ^ l2);l1 = l3;k = k;j = j;int m = (int)l1;l1 = last;l2 = last;i = 32;k *= m;j = j;long l4 = ULong.constructor-impl(l2 >>> i);l2 = l4;k = k;j = j;l4 = ULong.constructor-impl(l1 ^ l2);l1 = l4;k = k;j = j;int n = (int)l1;return isEmpty() ? -1 : j * (k + n) + (int)(step ^ step >>> 32); }
  @NotNull
  public String toString() { return ULong.toString-impl(first) + " downTo " + ULong.toString-impl(last) + " step " + -step; }
  



  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\t\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J(\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\tø\001\000¢\006\004\b\n\020\013\002\004\n\002\b\031¨\006\f"}, d2={"Lkotlin/ranges/ULongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/ULongProgression;", "rangeStart", "Lkotlin/ULong;", "rangeEnd", "step", "", "fromClosedRange-7ftBX0g", "(JJJ)Lkotlin/ranges/ULongProgression;", "kotlin-stdlib"})
  public static final class Companion
  {
    @NotNull
    public final ULongProgression fromClosedRange-7ftBX0g(long rangeStart, long rangeEnd, long step)
    {
      return new ULongProgression(rangeStart, rangeEnd, step, null);
    }
    
    private Companion() {}
  }
}

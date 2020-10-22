package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.LongIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




























































































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\0002\n\002\030\002\n\002\020\034\n\002\020\t\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\b\026\030\000 \0302\b\022\004\022\0020\0020\001:\001\030B\037\b\000\022\006\020\003\032\0020\002\022\006\020\004\032\0020\002\022\006\020\005\032\0020\002¢\006\002\020\006J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\020H\002J\b\020\021\032\0020\022H\026J\b\020\023\032\0020\016H\026J\t\020\024\032\0020\025H\002J\b\020\026\032\0020\027H\026R\021\020\007\032\0020\002¢\006\b\n\000\032\004\b\b\020\tR\021\020\n\032\0020\002¢\006\b\n\000\032\004\b\013\020\tR\021\020\005\032\0020\002¢\006\b\n\000\032\004\b\f\020\t¨\006\031"}, d2={"Lkotlin/ranges/LongProgression;", "", "", "start", "endInclusive", "step", "(JJJ)V", "first", "getFirst", "()J", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "", "isEmpty", "iterator", "Lkotlin/collections/LongIterator;", "toString", "", "Companion", "kotlin-stdlib"})
public class LongProgression
  implements Iterable<Long>, KMappedMarker
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
  
  public LongProgression(long start, long endInclusive, long step)
  {
    if (step == 0L) throw ((Throwable)new IllegalArgumentException("Step must be non-zero."));
    if (step == Long.MIN_VALUE) { throw ((Throwable)new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation."));
    }
    



    first = start;
    



    last = ProgressionUtilKt.getProgressionLastElement(start, endInclusive, step);
    



    this.step = step; }
  @NotNull
  public LongIterator iterator() { return (LongIterator)new LongProgressionIterator(first, last, step); }
  
  public boolean isEmpty() {
    return first > last;
  }
  
  public boolean equals(@Nullable Object other) {
    return ((other instanceof LongProgression)) && (((isEmpty()) && (((LongProgression)other).isEmpty())) || ((first == first) && (last == last) && (step == step)));
  }
  
  public int hashCode() { return isEmpty() ? -1 : (int)(31 * (31 * (first ^ first >>> 32) + (last ^ last >>> 32)) + (step ^ step >>> 32)); }
  @NotNull
  public String toString() { return first + " downTo " + last + " step " + -step; }
  



  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\t\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\006¨\006\t"}, d2={"Lkotlin/ranges/LongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/LongProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"})
  public static final class Companion
  {
    @NotNull
    public final LongProgression fromClosedRange(long rangeStart, long rangeEnd, long step)
    {
      return new LongProgression(rangeStart, rangeEnd, step);
    }
    
    private Companion() {}
  }
}

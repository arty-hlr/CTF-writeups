package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;



































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000,\n\002\030\002\n\002\020\034\n\002\020\b\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\b\026\030\000 \0272\b\022\004\022\0020\0020\001:\001\027B\037\b\000\022\006\020\003\032\0020\002\022\006\020\004\032\0020\002\022\006\020\005\032\0020\002¢\006\002\020\006J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\020H\002J\b\020\021\032\0020\002H\026J\b\020\022\032\0020\016H\026J\t\020\023\032\0020\024H\002J\b\020\025\032\0020\026H\026R\021\020\007\032\0020\002¢\006\b\n\000\032\004\b\b\020\tR\021\020\n\032\0020\002¢\006\b\n\000\032\004\b\013\020\tR\021\020\005\032\0020\002¢\006\b\n\000\032\004\b\f\020\t¨\006\030"}, d2={"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", "", "Companion", "kotlin-stdlib"})
public class IntProgression
  implements Iterable<Integer>, KMappedMarker
{
  private final int first;
  private final int last;
  private final int step;
  public static final Companion Companion = new Companion(null);
  
  public final int getFirst()
  {
    return first;
  }
  
  public final int getLast()
  {
    return last;
  }
  
  public final int getStep()
  {
    return step;
  }
  
  public IntProgression(int start, int endInclusive, int step)
  {
    if (step == 0) throw ((Throwable)new IllegalArgumentException("Step must be non-zero."));
    if (step == Integer.MIN_VALUE) { throw ((Throwable)new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation."));
    }
    



    first = start;
    



    last = ProgressionUtilKt.getProgressionLastElement(start, endInclusive, step);
    



    this.step = step; }
  @NotNull
  public IntIterator iterator() { return (IntIterator)new IntProgressionIterator(first, last, step); }
  
  public boolean isEmpty() {
    return first > last;
  }
  
  public boolean equals(@Nullable Object other) {
    return ((other instanceof IntProgression)) && (((isEmpty()) && (((IntProgression)other).isEmpty())) || ((first == first) && (last == last) && (step == step)));
  }
  
  public int hashCode() { return isEmpty() ? -1 : 31 * (31 * first + last) + step; }
  @NotNull
  public String toString() { return first + " downTo " + last + " step " + -step; }
  



  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\006¨\006\t"}, d2={"Lkotlin/ranges/IntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/IntProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"})
  public static final class Companion
  {
    @NotNull
    public final IntProgression fromClosedRange(int rangeStart, int rangeEnd, int step)
    {
      return new IntProgression(rangeStart, rangeEnd, step);
    }
    
    private Companion() {}
  }
}

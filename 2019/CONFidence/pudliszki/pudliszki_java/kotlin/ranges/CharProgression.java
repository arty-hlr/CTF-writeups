package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;










@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\0004\n\002\030\002\n\002\020\034\n\002\020\f\n\002\b\003\n\002\020\b\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\b\026\030\000 \0312\b\022\004\022\0020\0020\001:\001\031B\037\b\000\022\006\020\003\032\0020\002\022\006\020\004\032\0020\002\022\006\020\005\032\0020\006¢\006\002\020\007J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022H\002J\b\020\023\032\0020\006H\026J\b\020\024\032\0020\020H\026J\t\020\025\032\0020\026H\002J\b\020\027\032\0020\030H\026R\021\020\b\032\0020\002¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\002¢\006\b\n\000\032\004\b\f\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\r\020\016¨\006\032"}, d2={"Lkotlin/ranges/CharProgression;", "", "", "start", "endInclusive", "step", "", "(CCI)V", "first", "getFirst", "()C", "last", "getLast", "getStep", "()I", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/CharIterator;", "toString", "", "Companion", "kotlin-stdlib"})
public class CharProgression
  implements Iterable<Character>, KMappedMarker
{
  private final char first;
  private final char last;
  private final int step;
  public static final Companion Companion = new Companion(null);
  
  public final char getFirst()
  {
    return first;
  }
  
  public final char getLast()
  {
    return last;
  }
  
  public final int getStep()
  {
    return step;
  }
  
  public CharProgression(char start, char endInclusive, int step)
  {
    if (step == 0) throw ((Throwable)new IllegalArgumentException("Step must be non-zero."));
    if (step == Integer.MIN_VALUE) { throw ((Throwable)new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation."));
    }
    



    first = start;
    



    last = ((char)ProgressionUtilKt.getProgressionLastElement(start, endInclusive, step));
    



    this.step = step; }
  @NotNull
  public CharIterator iterator() { return (CharIterator)new CharProgressionIterator(first, last, step); }
  
  public boolean isEmpty() {
    return first > last;
  }
  
  public boolean equals(@Nullable Object other) {
    return ((other instanceof CharProgression)) && (((isEmpty()) && (((CharProgression)other).isEmpty())) || ((first == first) && (last == last) && (step == step)));
  }
  
  public int hashCode() { return isEmpty() ? -1 : 31 * ('\037' * first + last) + step; }
  @NotNull
  public String toString() { return first + " downTo " + last + " step " + -step; }
  



  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\f\n\002\b\002\n\002\020\b\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\t¨\006\n"}, d2={"Lkotlin/ranges/CharProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/CharProgression;", "rangeStart", "", "rangeEnd", "step", "", "kotlin-stdlib"})
  public static final class Companion
  {
    @NotNull
    public final CharProgression fromClosedRange(char rangeStart, char rangeEnd, int step)
    {
      return new CharProgression(rangeStart, rangeEnd, step);
    }
    
    private Companion() {}
  }
}

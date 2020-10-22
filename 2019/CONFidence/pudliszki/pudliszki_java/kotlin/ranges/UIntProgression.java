package kotlin.ranges;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.UnsignedKt;
import kotlin.collections.UIntIterator;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;



































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\0004\n\002\030\002\n\002\020\034\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\b\027\030\000 \0312\b\022\004\022\0020\0020\001:\001\031B\"\b\000\022\006\020\003\032\0020\002\022\006\020\004\032\0020\002\022\006\020\005\032\0020\006ø\001\000¢\006\002\020\007J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022H\002J\b\020\023\032\0020\006H\026J\b\020\024\032\0020\020H\026J\t\020\025\032\0020\026H\002J\b\020\027\032\0020\030H\026R\026\020\b\032\0020\002ø\001\000¢\006\n\n\002\020\013\032\004\b\t\020\nR\026\020\f\032\0020\002ø\001\000¢\006\n\n\002\020\013\032\004\b\r\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\016\020\nø\001\000\002\004\n\002\b\031¨\006\032"}, d2={"Lkotlin/ranges/UIntProgression;", "", "Lkotlin/UInt;", "start", "endInclusive", "step", "", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "first", "getFirst", "()I", "I", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/UIntIterator;", "toString", "", "Companion", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
@ExperimentalUnsignedTypes
public class UIntProgression
  implements Iterable<UInt>, KMappedMarker
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
  
  private UIntProgression(int start, int endInclusive, int step)
  {
    if (step == 0) throw ((Throwable)new IllegalArgumentException("Step must be non-zero."));
    if (step == Integer.MIN_VALUE) { throw ((Throwable)new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation."));
    }
    



    first = start;
    



    last = UProgressionUtilKt.getProgressionLastElement-Nkh28Cs(start, endInclusive, step);
    



    this.step = step; }
  @NotNull
  public UIntIterator iterator() { return (UIntIterator)new UIntProgressionIterator(first, last, step, null); }
  
  public boolean isEmpty() {
    int i = first;int j = last;i = first;j = last;return UnsignedKt.uintCompare(i, j) > 0;
  }
  

  public boolean equals(@Nullable Object other) { return ((other instanceof UIntProgression)) && (((isEmpty()) && (((UIntProgression)other).isEmpty())) || ((first == first) && (last == last) && (step == step))); }
  
  public int hashCode() {
    int i = first;int k = 31;int j = 31;int m = i;i = last;k *= m;j = j;m = i;return isEmpty() ? -1 : j * (k + m) + step; }
  @NotNull
  public String toString() { return UInt.toString-impl(first) + " downTo " + UInt.toString-impl(last) + " step " + -step; }
  



  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J(\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\tø\001\000¢\006\004\b\n\020\013\002\004\n\002\b\031¨\006\f"}, d2={"Lkotlin/ranges/UIntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/UIntProgression;", "rangeStart", "Lkotlin/UInt;", "rangeEnd", "step", "", "fromClosedRange-Nkh28Cs", "(III)Lkotlin/ranges/UIntProgression;", "kotlin-stdlib"})
  public static final class Companion
  {
    @NotNull
    public final UIntProgression fromClosedRange-Nkh28Cs(int rangeStart, int rangeEnd, int step)
    {
      return new UIntProgression(rangeStart, rangeEnd, step, null);
    }
    
    private Companion() {}
  }
}

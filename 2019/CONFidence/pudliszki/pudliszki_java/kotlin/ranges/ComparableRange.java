package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;














@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000*\n\002\030\002\n\000\n\002\020\017\n\002\030\002\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\022\030\000*\016\b\000\020\001*\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B\025\022\006\020\004\032\0028\000\022\006\020\005\032\0028\000¢\006\002\020\006J\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\016H\002J\b\020\017\032\0020\020H\026J\b\020\021\032\0020\022H\026R\026\020\005\032\0028\000X\004¢\006\n\n\002\020\t\032\004\b\007\020\bR\026\020\004\032\0028\000X\004¢\006\n\n\002\020\t\032\004\b\n\020\b¨\006\023"}, d2={"Lkotlin/ranges/ComparableRange;", "T", "", "Lkotlin/ranges/ClosedRange;", "start", "endInclusive", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "getEndInclusive", "()Ljava/lang/Comparable;", "Ljava/lang/Comparable;", "getStart", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"})
class ComparableRange<T extends Comparable<? super T>>
  implements ClosedRange<T>
{
  @NotNull
  private final T start;
  @NotNull
  private final T endInclusive;
  
  public ComparableRange(@NotNull T start, @NotNull T endInclusive)
  {
    this.start = start;this.endInclusive = endInclusive; } public boolean contains(@NotNull T value) { Intrinsics.checkParameterIsNotNull(value, "value");return ClosedRange.DefaultImpls.contains(this, value); } public boolean isEmpty() { return ClosedRange.DefaultImpls.isEmpty(this); } @NotNull
  public T getStart() { return start; } @NotNull
  public T getEndInclusive() { return endInclusive; }
  
  public boolean equals(@Nullable Object other)
  {
    return ((other instanceof ComparableRange)) && (((isEmpty()) && (((ComparableRange)other).isEmpty())) || ((Intrinsics.areEqual(getStart(), ((ComparableRange)other).getStart())) && (Intrinsics.areEqual(getEndInclusive(), ((ComparableRange)other).getEndInclusive()))));
  }
  


  public int hashCode() { return isEmpty() ? -1 : 31 * getStart().hashCode() + getEndInclusive().hashCode(); }
  
  @NotNull
  public String toString() { return getStart() + ".." + getEndInclusive(); }
}

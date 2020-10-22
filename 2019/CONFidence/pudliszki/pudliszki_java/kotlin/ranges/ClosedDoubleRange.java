package kotlin.ranges;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;











































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000,\n\002\030\002\n\002\030\002\n\002\020\006\n\002\b\t\n\002\020\013\n\002\b\003\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\020\016\n\000\b\002\030\0002\b\022\004\022\0020\0020\001B\025\022\006\020\003\032\0020\002\022\006\020\004\032\0020\002¢\006\002\020\005J\021\020\013\032\0020\f2\006\020\r\032\0020\002H\002J\023\020\016\032\0020\f2\b\020\017\032\004\030\0010\020H\002J\b\020\021\032\0020\022H\026J\b\020\023\032\0020\fH\026J\030\020\024\032\0020\f2\006\020\025\032\0020\0022\006\020\026\032\0020\002H\026J\b\020\027\032\0020\030H\026R\016\020\006\032\0020\002X\004¢\006\002\n\000R\016\020\007\032\0020\002X\004¢\006\002\n\000R\024\020\004\032\0020\0028VX\004¢\006\006\032\004\b\b\020\tR\024\020\003\032\0020\0028VX\004¢\006\006\032\004\b\n\020\t¨\006\031"}, d2={"Lkotlin/ranges/ClosedDoubleRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "start", "endInclusive", "(DD)V", "_endInclusive", "_start", "getEndInclusive", "()Ljava/lang/Double;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "lessThanOrEquals", "a", "b", "toString", "", "kotlin-stdlib"})
final class ClosedDoubleRange
  implements ClosedFloatingPointRange<Double>
{
  private final double _start;
  private final double _endInclusive;
  
  public ClosedDoubleRange(double start, double endInclusive)
  {
    _start = start;
    _endInclusive = endInclusive; } @NotNull
  public Double getStart() { return Double.valueOf(_start); } @NotNull
  public Double getEndInclusive() { return Double.valueOf(_endInclusive); }
  
  public boolean lessThanOrEquals(double a, double b) { return a <= b; }
  
  public boolean contains(double value) { return (value >= _start) && (value <= _endInclusive); }
  public boolean isEmpty() { return _start > _endInclusive; }
  
  public boolean equals(@Nullable Object other) {
    return ((other instanceof ClosedDoubleRange)) && (((isEmpty()) && (((ClosedDoubleRange)other).isEmpty())) || ((_start == _start) && (_endInclusive == _endInclusive)));
  }
  


  public int hashCode() { return isEmpty() ? -1 : 31 * Double.valueOf(_start).hashCode() + Double.valueOf(_endInclusive).hashCode(); }
  
  @NotNull
  public String toString() { return _start + ".." + _endInclusive; }
}

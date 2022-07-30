package kotlin.ranges;

import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\030\n\002\030\002\n\000\n\002\020\017\n\002\030\002\n\000\n\002\020\013\n\002\b\b\bg\030\000*\016\b\000\020\001*\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003J\026\020\004\032\0020\0052\006\020\006\032\0028\000H\002¢\006\002\020\007J\b\020\b\032\0020\005H\026J\035\020\t\032\0020\0052\006\020\n\032\0028\0002\006\020\013\032\0028\000H&¢\006\002\020\f¨\006\r"}, d2={"Lkotlin/ranges/ClosedFloatingPointRange;", "T", "", "Lkotlin/ranges/ClosedRange;", "contains", "", "value", "(Ljava/lang/Comparable;)Z", "isEmpty", "lessThanOrEquals", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z", "kotlin-stdlib"})
@kotlin.SinceKotlin(version="1.1")
public abstract interface ClosedFloatingPointRange<T extends Comparable<? super T>> extends ClosedRange<T>
{
  public abstract boolean contains(@NotNull T paramT);
  
  public abstract boolean isEmpty();
  
  public abstract boolean lessThanOrEquals(@NotNull T paramT1, @NotNull T paramT2);
  
  @kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3)
  public static final class DefaultImpls
  {
    public static <T extends Comparable<? super T>> boolean contains(ClosedFloatingPointRange<T> $this, @NotNull T value)
    {
      kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");return ($this.lessThanOrEquals($this.getStart(), value)) && ($this.lessThanOrEquals(value, $this.getEndInclusive())); }
    public static <T extends Comparable<? super T>> boolean isEmpty(ClosedFloatingPointRange<T> $this) { return !$this.lessThanOrEquals($this.getStart(), $this.getEndInclusive()); }
  }
}

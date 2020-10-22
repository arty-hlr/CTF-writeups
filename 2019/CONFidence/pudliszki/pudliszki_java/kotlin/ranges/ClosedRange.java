package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;













@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\032\n\002\030\002\n\000\n\002\020\017\n\002\020\000\n\002\b\006\n\002\020\013\n\002\b\004\bf\030\000*\016\b\000\020\001*\b\022\004\022\002H\0010\0022\0020\003J\026\020\t\032\0020\n2\006\020\013\032\0028\000H\002¢\006\002\020\fJ\b\020\r\032\0020\nH\026R\022\020\004\032\0028\000X¦\004¢\006\006\032\004\b\005\020\006R\022\020\007\032\0028\000X¦\004¢\006\006\032\004\b\b\020\006¨\006\016"}, d2={"Lkotlin/ranges/ClosedRange;", "T", "", "", "endInclusive", "getEndInclusive", "()Ljava/lang/Comparable;", "start", "getStart", "contains", "", "value", "(Ljava/lang/Comparable;)Z", "isEmpty", "kotlin-stdlib"})
public abstract interface ClosedRange<T extends Comparable<? super T>>
{
  @NotNull
  public abstract T getStart();
  
  @NotNull
  public abstract T getEndInclusive();
  
  public abstract boolean contains(@NotNull T paramT);
  
  public abstract boolean isEmpty();
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3)
  public static final class DefaultImpls
  {
    public static <T extends Comparable<? super T>> boolean contains(ClosedRange<T> $this, @NotNull T value)
    {
      Intrinsics.checkParameterIsNotNull(value, "value");return (value.compareTo($this.getStart()) >= 0) && (value.compareTo($this.getEndInclusive()) <= 0);
    }
    
    public static <T extends Comparable<? super T>> boolean isEmpty(ClosedRange<T> $this)
    {
      return $this.getStart().compareTo($this.getEndInclusive()) > 0;
    }
  }
}

package kotlin.ranges;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;








































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000:\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\020\004\n\002\b\002\n\002\020\000\n\000\n\002\020\034\n\002\030\002\n\002\b\003\n\002\020\017\n\002\b\002\n\002\030\002\n\002\020\006\n\000\032\030\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\000\032@\020\006\032\0020\003\"\b\b\000\020\007*\0020\b\"\030\b\001\020\t*\b\022\004\022\002H\0070\n*\b\022\004\022\002H\0070\013*\002H\t2\b\020\f\032\004\030\001H\007H\n¢\006\002\020\r\0320\020\016\032\b\022\004\022\002H\0070\013\"\016\b\000\020\007*\b\022\004\022\002H\0070\017*\002H\0072\006\020\020\032\002H\007H\002¢\006\002\020\021\032\033\020\016\032\b\022\004\022\0020\0230\022*\0020\0232\006\020\020\032\0020\023H\002¨\006\024"}, d2={"checkStepIsPositive", "", "isPositive", "", "step", "", "contains", "T", "", "R", "", "Lkotlin/ranges/ClosedRange;", "element", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "rangeTo", "", "that", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/ClosedRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "kotlin-stdlib"}, xs="kotlin/ranges/RangesKt")
class RangesKt__RangesKt
  extends RangesKt__RangesJVMKt
{
  @NotNull
  public static final <T extends Comparable<? super T>> ClosedRange<T> rangeTo(@NotNull T $receiver, @NotNull T that)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(that, "that");return (ClosedRange)new ComparableRange($receiver, that);
  }
  


  @SinceKotlin(version="1.1")
  @NotNull
  public static final ClosedFloatingPointRange<Double> rangeTo(double $receiver, double that)
  {
    return (ClosedFloatingPointRange)new ClosedDoubleRange($receiver, that);
  }
  


  @SinceKotlin(version="1.3")
  @InlineOnly
  private static final <T, R extends Iterable<? extends T>,  extends ClosedRange<T>> boolean contains(@NotNull R $receiver, T element)
  {
    ;
    
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (element != null) && (((ClosedRange)$receiver).contains((Comparable)element));
  }
  
  public static final void checkStepIsPositive(boolean isPositive, @NotNull Number step) {
    Intrinsics.checkParameterIsNotNull(step, "step"); if (!isPositive) throw ((Throwable)new IllegalArgumentException("Step must be positive, was: " + step + '.'));
  }
  
  public RangesKt__RangesKt() {}
}

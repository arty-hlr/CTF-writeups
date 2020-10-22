package kotlin.coroutines.experimental;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;











































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000.\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\004\n\002\020\034\n\002\b\002\n\002\020(\n\002\b\002\n\002\030\002\n\002\b\002\b'\030\000*\006\b\000\020\001 \0002\0020\002B\007\b\000¢\006\002\020\003J\031\020\004\032\0020\0052\006\020\006\032\0028\000H¦@ø\001\000¢\006\002\020\007J\037\020\b\032\0020\0052\f\020\t\032\b\022\004\022\0028\0000\nH@ø\001\000¢\006\002\020\013J\037\020\b\032\0020\0052\f\020\f\032\b\022\004\022\0028\0000\rH¦@ø\001\000¢\006\002\020\016J\037\020\b\032\0020\0052\f\020\017\032\b\022\004\022\0028\0000\020H@ø\001\000¢\006\002\020\021\002\004\n\002\b\t¨\006\022"}, d2={"Lkotlin/coroutines/experimental/SequenceBuilder;", "T", "", "()V", "yield", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "yieldAll", "elements", "", "(Ljava/lang/Iterable;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "iterator", "", "(Ljava/util/Iterator;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "sequence", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "kotlin-stdlib_coroutinesExperimental"})
@RestrictsSuspension
@SinceKotlin(version="1.1")
public abstract class SequenceBuilder<T>
{
  @Nullable
  public abstract Object yield(T paramT, @NotNull Continuation<? super Unit> paramContinuation);
  
  @Nullable
  public abstract Object yieldAll(@NotNull Iterator<? extends T> paramIterator, @NotNull Continuation<? super Unit> paramContinuation);
  
  @Nullable
  public final Object yieldAll(@NotNull Iterable<? extends T> elements, @NotNull Continuation<? super Unit> paramContinuation)
  {
    if (((elements instanceof Collection)) && (((Collection)elements).isEmpty())) return Unit.INSTANCE;
    return yieldAll(elements.iterator(), paramContinuation);
  }
  


  @Nullable
  public final Object yieldAll(@NotNull Sequence<? extends T> sequence, @NotNull Continuation<? super Unit> paramContinuation)
  {
    return yieldAll(sequence.iterator(), paramContinuation);
  }
  
  public SequenceBuilder() {}
}

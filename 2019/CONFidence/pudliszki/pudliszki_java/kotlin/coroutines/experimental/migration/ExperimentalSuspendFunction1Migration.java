package kotlin.coroutines.experimental.migration;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;



















































































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\036\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\b\b\002\030\000*\004\b\000\020\001*\004\b\001\020\0022\034\022\004\022\002H\001\022\n\022\b\022\004\022\002H\0020\004\022\006\022\004\030\0010\0050\003B'\022 \020\006\032\034\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\007\022\006\022\004\030\0010\0050\003¢\006\002\020\bJ&\020\013\032\004\030\0010\0052\006\020\f\032\0028\0002\f\020\r\032\b\022\004\022\0028\0010\004H\002¢\006\002\020\016R+\020\006\032\034\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\007\022\006\022\004\030\0010\0050\003¢\006\b\n\000\032\004\b\t\020\n¨\006\017"}, d2={"Lkotlin/coroutines/experimental/migration/ExperimentalSuspendFunction1Migration;", "T1", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/experimental/Continuation;", "", "function", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;)V", "getFunction", "()Lkotlin/jvm/functions/Function2;", "invoke", "t1", "continuation", "(Ljava/lang/Object;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "kotlin-stdlib_coroutinesExperimental"})
final class ExperimentalSuspendFunction1Migration<T1, R>
  implements Function2<T1, kotlin.coroutines.experimental.Continuation<? super R>, Object>
{
  @NotNull
  private final Function2<T1, kotlin.coroutines.Continuation<? super R>, Object> function;
  
  public ExperimentalSuspendFunction1Migration(@NotNull Function2<? super T1, ? super kotlin.coroutines.Continuation<? super R>, ? extends Object> function) { this.function = function; } @NotNull
  public final Function2<T1, kotlin.coroutines.Continuation<? super R>, Object> getFunction() { return function; }
  
  @Nullable
  public Object invoke(T1 t1, @NotNull kotlin.coroutines.experimental.Continuation<? super R> continuation) { Intrinsics.checkParameterIsNotNull(continuation, "continuation");return function.invoke(t1, CoroutinesMigrationKt.toContinuation(continuation));
  }
}

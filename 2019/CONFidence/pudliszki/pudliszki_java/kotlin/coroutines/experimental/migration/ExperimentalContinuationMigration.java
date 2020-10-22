package kotlin.coroutines.experimental.migration;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Result.Companion;
import kotlin.ResultKt;
import kotlin.coroutines.experimental.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;






















































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000*\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\004\n\002\020\003\n\000\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\023\022\f\020\003\032\b\022\004\022\0028\0000\004¢\006\002\020\005J\025\020\f\032\0020\r2\006\020\016\032\0028\000H\026¢\006\002\020\017J\020\020\020\032\0020\r2\006\020\021\032\0020\022H\026R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\b\020\tR\027\020\003\032\b\022\004\022\0028\0000\004¢\006\b\n\000\032\004\b\n\020\013¨\006\023"}, d2={"Lkotlin/coroutines/experimental/migration/ExperimentalContinuationMigration;", "T", "Lkotlin/coroutines/experimental/Continuation;", "continuation", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/Continuation;)V", "context", "Lkotlin/coroutines/experimental/CoroutineContext;", "getContext", "()Lkotlin/coroutines/experimental/CoroutineContext;", "getContinuation", "()Lkotlin/coroutines/Continuation;", "resume", "", "value", "(Ljava/lang/Object;)V", "resumeWithException", "exception", "", "kotlin-stdlib_coroutinesExperimental"})
final class ExperimentalContinuationMigration<T>
  implements kotlin.coroutines.experimental.Continuation<T>
{
  @NotNull
  private final CoroutineContext context;
  @NotNull
  private final kotlin.coroutines.Continuation<T> continuation;
  
  @NotNull
  public final kotlin.coroutines.Continuation<T> getContinuation() { return continuation; } @NotNull
  public CoroutineContext getContext() { return context; }
  
  public ExperimentalContinuationMigration(@NotNull kotlin.coroutines.Continuation<? super T> continuation)
  {
    this.continuation = continuation;
    context = CoroutinesMigrationKt.toExperimentalCoroutineContext(this.continuation.getContext()); }
  public void resume(T value) { kotlin.coroutines.Continuation localContinuation1 = continuation;Result.Companion localCompanion = Result.Companion;kotlin.coroutines.Continuation localContinuation2 = localContinuation1;Object localObject = Result.constructor-impl(value);localContinuation2.resumeWith(localObject); }
  public void resumeWithException(@NotNull Throwable exception) { Intrinsics.checkParameterIsNotNull(exception, "exception");kotlin.coroutines.Continuation localContinuation1 = continuation;Result.Companion localCompanion = Result.Companion;kotlin.coroutines.Continuation localContinuation2 = localContinuation1;Object localObject = Result.constructor-impl(ResultKt.createFailure(exception));localContinuation2.resumeWith(localObject);
  }
}

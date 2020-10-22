package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000 \n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\b\b\002\030\0002\b\022\004\022\0020\0020\001B\005¢\006\002\020\003J\006\020\016\032\0020\002J\036\020\017\032\0020\0022\f\020\b\032\b\022\004\022\0020\0020\tH\026ø\001\000¢\006\002\020\020R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007R%\020\b\032\n\022\004\022\0020\002\030\0010\tX\016ø\001\000¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\r\002\004\n\002\b\031¨\006\021"}, d2={"Lkotlin/coroutines/jvm/internal/RunSuspend;", "Lkotlin/coroutines/Continuation;", "", "()V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "result", "Lkotlin/Result;", "getResult", "()Lkotlin/Result;", "setResult", "(Lkotlin/Result;)V", "await", "resumeWith", "(Ljava/lang/Object;)V", "kotlin-stdlib"})
final class RunSuspend
  implements Continuation<Unit>
{
  @Nullable
  private Result<Unit> result;
  
  @NotNull
  public CoroutineContext getContext() { return (CoroutineContext)EmptyCoroutineContext.INSTANCE; }
  @Nullable
  public final Result<Unit> getResult() { return result; } public final void setResult(@Nullable Result<Unit> <set-?>) { result = <set-?>; }
  
  public void resumeWith(@NotNull Object result) { synchronized (this) { int $i$a$1$synchronized;
      this.result = Result.box-impl(result);
      if (this == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.Object"); ((Object)this).notifyAll();Unit localUnit = 
        Unit.INSTANCE; } }
  
  public final void await() { int $i$a$1$synchronized; synchronized (this) {
      int $i$a$1$synchronized;
      Result result = this.result; if (result == null) {
        if (this == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.Object"); ((Object)this).wait();
      } else {
        Object localObject1 = result.unbox-impl();ResultKt.throwOnFailure(localObject1); return;
      }
    }
  }
  
  public RunSuspend() {}
}

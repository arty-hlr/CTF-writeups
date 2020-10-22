package kotlin.coroutines.experimental;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\004\n\002\020\003\n\000\bg\030\000*\006\b\000\020\001 \0002\0020\002J\025\020\007\032\0020\b2\006\020\t\032\0028\000H&¢\006\002\020\nJ\020\020\013\032\0020\b2\006\020\f\032\0020\rH&R\022\020\003\032\0020\004X¦\004¢\006\006\032\004\b\005\020\006¨\006\016"}, d2={"Lkotlin/coroutines/experimental/Continuation;", "T", "", "context", "Lkotlin/coroutines/experimental/CoroutineContext;", "getContext", "()Lkotlin/coroutines/experimental/CoroutineContext;", "resume", "", "value", "(Ljava/lang/Object;)V", "resumeWithException", "exception", "", "kotlin-stdlib_coroutinesExperimental"})
@SinceKotlin(version="1.1")
public abstract interface Continuation<T>
{
  @NotNull
  public abstract CoroutineContext getContext();
  
  public abstract void resume(T paramT);
  
  public abstract void resumeWithException(@NotNull Throwable paramThrowable);
}

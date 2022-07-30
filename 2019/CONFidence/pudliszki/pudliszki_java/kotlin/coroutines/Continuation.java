package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bg\030\000*\006\b\000\020\001 \0002\0020\002J\036\020\007\032\0020\b2\f\020\t\032\b\022\004\022\0028\0000\nH&ø\001\000¢\006\002\020\013R\022\020\003\032\0020\004X¦\004¢\006\006\032\004\b\005\020\006\002\004\n\002\b\031¨\006\f"}, d2={"Lkotlin/coroutines/Continuation;", "T", "", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public abstract interface Continuation<T>
{
  @NotNull
  public abstract CoroutineContext getContext();
  
  public abstract void resumeWith(@NotNull Object paramObject);
}

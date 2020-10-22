package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\000\bg\030\0002\0020\001J\n\020\005\032\004\030\0010\006H&R\024\020\002\032\004\030\0010\000X¦\004¢\006\006\032\004\b\003\020\004¨\006\007"}, d2={"Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public abstract interface CoroutineStackFrame
{
  @Nullable
  public abstract CoroutineStackFrame getCallerFrame();
  
  @Nullable
  public abstract StackTraceElement getStackTraceElement();
}

package kotlin.coroutines.experimental.jvm.internal;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.experimental.Continuation;
import kotlin.coroutines.experimental.CoroutineContext;
import kotlin.coroutines.experimental.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\0002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\t\n\002\020\002\n\002\b\004\n\002\020\003\n\002\b\003\b&\030\0002\n\022\006\022\004\030\0010\0020\0012\n\022\006\022\004\030\0010\0020\003B\037\022\006\020\004\032\0020\005\022\020\020\006\032\f\022\006\022\004\030\0010\002\030\0010\003¢\006\002\020\007J$\020\022\032\b\022\004\022\0020\0230\0032\b\020\024\032\004\030\0010\0022\n\020\006\032\006\022\002\b\0030\003H\026J\032\020\022\032\b\022\004\022\0020\0230\0032\n\020\006\032\006\022\002\b\0030\003H\026J\036\020\025\032\004\030\0010\0022\b\020\026\032\004\030\0010\0022\b\020\027\032\004\030\0010\030H$J\022\020\031\032\0020\0232\b\020\024\032\004\030\0010\002H\026J\020\020\032\032\0020\0232\006\020\027\032\0020\030H\026R\020\020\b\032\004\030\0010\tX\004¢\006\002\n\000R\030\020\n\032\f\022\006\022\004\030\0010\002\030\0010\003X\016¢\006\002\n\000R\034\020\006\032\f\022\006\022\004\030\0010\002\030\0010\0038\004@\004X\016¢\006\002\n\000R\024\020\013\032\0020\t8VX\004¢\006\006\032\004\b\f\020\rR\031\020\016\032\n\022\006\022\004\030\0010\0020\0038F¢\006\006\032\004\b\017\020\020R\022\020\021\032\0020\0058\004@\004X\016¢\006\002\n\000¨\006\033"}, d2={"Lkotlin/coroutines/experimental/jvm/internal/CoroutineImpl;", "Lkotlin/jvm/internal/Lambda;", "", "Lkotlin/coroutines/experimental/Continuation;", "arity", "", "completion", "(ILkotlin/coroutines/experimental/Continuation;)V", "_context", "Lkotlin/coroutines/experimental/CoroutineContext;", "_facade", "context", "getContext", "()Lkotlin/coroutines/experimental/CoroutineContext;", "facade", "getFacade", "()Lkotlin/coroutines/experimental/Continuation;", "label", "create", "", "value", "doResume", "data", "exception", "", "resume", "resumeWithException", "kotlin-stdlib_coroutinesExperimental"})
public abstract class CoroutineImpl
  extends Lambda<Object>
  implements Continuation<Object>
{
  @JvmField
  protected int label;
  private final CoroutineContext _context;
  private Continuation<Object> _facade;
  @JvmField
  @Nullable
  protected Continuation<Object> completion;
  
  @NotNull
  public CoroutineContext getContext()
  {
    CoroutineContext tmp4_1 = _context;
    





























    if (tmp4_1 == null) Intrinsics.throwNpe(); return tmp4_1;
  }
  
  @NotNull
  public final Continuation<Object> getFacade() {
    if (_facade == null) { CoroutineContext tmp12_9 = _context;
      


































      if (tmp12_9 == null) Intrinsics.throwNpe(); _facade = CoroutineIntrinsics.interceptContinuationIfNeeded(tmp12_9, (Continuation)this); }
    Continuation tmp33_30 = _facade;
    



































    if (tmp33_30 == null) Intrinsics.throwNpe(); return tmp33_30;
  }
  
  public void resume(@Nullable Object value) {
    Continuation tmp4_1 = completion;
    







































    if (tmp4_1 == null) Intrinsics.throwNpe(); Continuation localContinuation = tmp4_1; try { int $i$a$1$processBareContinuationResume; Object localObject = 
        doResume(value, null);
      if (localObject != IntrinsicsKt.getCOROUTINE_SUSPENDED()) { Continuation tmp30_29 = localContinuation;
        







































        if (tmp30_29 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>"); tmp30_29.resume(localObject); } } catch (Throwable localThrowable1) { localContinuation.resumeWithException(localThrowable1);
    }
  }
  
  public void resumeWithException(@NotNull Throwable exception)
  {
    Intrinsics.checkParameterIsNotNull(exception, "exception"); Continuation tmp10_7 = completion; if (tmp10_7 == null) Intrinsics.throwNpe(); Continuation localContinuation = tmp10_7; try { int $i$a$1$processBareContinuationResume; Object localObject = 
        doResume(null, exception);
      if (localObject != IntrinsicsKt.getCOROUTINE_SUSPENDED()) { Continuation tmp36_35 = localContinuation;
        













































        if (tmp36_35 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>"); tmp36_35.resume(localObject); } } catch (Throwable localThrowable1) { localContinuation.resumeWithException(localThrowable1);
    }
  }
  
  @Nullable
  protected abstract Object doResume(@Nullable Object paramObject, @Nullable Throwable paramThrowable);
  
  @NotNull
  public Continuation<Unit> create(@NotNull Continuation<?> completion) { Intrinsics.checkParameterIsNotNull(completion, "completion");throw ((Throwable)new IllegalStateException("create(Continuation) has not been overridden"));
  }
  
  @NotNull
  public Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<?> completion) { Intrinsics.checkParameterIsNotNull(completion, "completion");throw ((Throwable)new IllegalStateException("create(Any?;Continuation) has not been overridden"));
  }
  
  /* Error */
  public CoroutineImpl(int arity, @Nullable Continuation<Object> completion)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokespecial 100	kotlin/jvm/internal/Lambda:<init>	(I)V
    //   5: aload_0
    //   6: aload_2
    //   7: putfield 48	kotlin/coroutines/experimental/jvm/internal/CoroutineImpl:completion	Lkotlin/coroutines/experimental/Continuation;
    //   10: aload_0
    //   11: aload_0
    //   12: getfield 48	kotlin/coroutines/experimental/jvm/internal/CoroutineImpl:completion	Lkotlin/coroutines/experimental/Continuation;
    //   15: ifnull +7 -> 22
    //   18: iconst_0
    //   19: goto +4 -> 23
    //   22: iconst_m1
    //   23: putfield 102	kotlin/coroutines/experimental/jvm/internal/CoroutineImpl:label	I
    //   26: aload_0
    //   27: aload_0
    //   28: getfield 48	kotlin/coroutines/experimental/jvm/internal/CoroutineImpl:completion	Lkotlin/coroutines/experimental/Continuation;
    //   31: dup
    //   32: ifnull +11 -> 43
    //   35: invokeinterface 104 1 0
    //   40: goto +5 -> 45
    //   43: pop
    //   44: aconst_null
    //   45: putfield 17	kotlin/coroutines/experimental/jvm/internal/CoroutineImpl:_context	Lkotlin/coroutines/experimental/CoroutineContext;
    //   48: return
    // Line number table:
    //   Java source line #17	-> byte code offset #0
    //   Java source line #21	-> byte code offset #1
    //   Java source line #26	-> byte code offset #10
    //   Java source line #28	-> byte code offset #26
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	CoroutineImpl
    //   0	49	1	arity	int
    //   0	49	2	completion	Continuation
  }
}

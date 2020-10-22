package kotlin.coroutines.experimental;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.experimental.intrinsics.IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000.\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\004\n\002\020\003\n\002\b\003\b\001\030\000 \025*\006\b\000\020\001 \0002\b\022\004\022\002H\0010\002:\002\025\026B\025\b\021\022\f\020\003\032\b\022\004\022\0028\0000\002¢\006\002\020\004B\037\b\000\022\f\020\003\032\b\022\004\022\0028\0000\002\022\b\020\005\032\004\030\0010\006¢\006\002\020\007J\n\020\r\032\004\030\0010\006H\001J\025\020\016\032\0020\0172\006\020\020\032\0028\000H\026¢\006\002\020\021J\020\020\022\032\0020\0172\006\020\023\032\0020\024H\026R\024\020\b\032\0020\t8VX\004¢\006\006\032\004\b\n\020\013R\024\020\003\032\b\022\004\022\0028\0000\002X\004¢\006\002\n\000R\020\020\f\032\004\030\0010\006X\016¢\006\002\n\000¨\006\027"}, d2={"Lkotlin/coroutines/experimental/SafeContinuation;", "T", "Lkotlin/coroutines/experimental/Continuation;", "delegate", "(Lkotlin/coroutines/experimental/Continuation;)V", "initialResult", "", "(Lkotlin/coroutines/experimental/Continuation;Ljava/lang/Object;)V", "context", "Lkotlin/coroutines/experimental/CoroutineContext;", "getContext", "()Lkotlin/coroutines/experimental/CoroutineContext;", "result", "getResult", "resume", "", "value", "(Ljava/lang/Object;)V", "resumeWithException", "exception", "", "Companion", "Fail", "kotlin-stdlib_coroutinesExperimental"})
@PublishedApi
public final class SafeContinuation<T>
  implements Continuation<T>
{
  @PublishedApi
  public SafeContinuation(@NotNull Continuation<? super T> delegate) { this(delegate, UNDECIDED); }
  
  @NotNull
  public CoroutineContext getContext() { return delegate.getContext();
  }
  
  public SafeContinuation(@NotNull Continuation<? super T> delegate, @Nullable Object initialResult)
  {
    this.delegate = delegate;
    










    result = initialResult;
  }
  
  private static final Object UNDECIDED = new Object(); public static final Companion Companion = new Companion(null);
  private static final Object RESUMED = new Object();
  


  private static final AtomicReferenceFieldUpdater<SafeContinuation<?>, Object> RESULT = AtomicReferenceFieldUpdater.newUpdater(
    SafeContinuation.class, Object.class, "result");
  private volatile Object result;
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\020\003\n\002\b\004\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2={"Lkotlin/coroutines/experimental/SafeContinuation$Fail;", "", "exception", "", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "kotlin-stdlib_coroutinesExperimental"})
  private static final class Fail { public Fail(@NotNull Throwable exception) { this.exception = exception; } @NotNull
    public final Throwable getException() { return exception; }
    







    @NotNull
    private final Throwable exception;
  }
  







  private final Continuation<T> delegate;
  






  @PublishedApi
  @Nullable
  public final Object getResult()
  {
    Object result = this.result;
    if (result == UNDECIDED) {
      if (RESULT.compareAndSet(this, UNDECIDED, IntrinsicsKt.getCOROUTINE_SUSPENDED())) return IntrinsicsKt.getCOROUTINE_SUSPENDED();
      result = this.result;
    }
    
    if (result == RESUMED) return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    if ((result instanceof Fail)) throw ((Fail)result).getException();
    return result;
  }
  
  /* Error */
  public void resume(T value)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 25	kotlin/coroutines/experimental/SafeContinuation:result	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: getstatic 28	kotlin/coroutines/experimental/SafeContinuation:UNDECIDED	Ljava/lang/Object;
    //   9: if_acmpne +21 -> 30
    //   12: getstatic 32	kotlin/coroutines/experimental/SafeContinuation:RESULT	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   15: aload_0
    //   16: getstatic 28	kotlin/coroutines/experimental/SafeContinuation:UNDECIDED	Ljava/lang/Object;
    //   19: aload_1
    //   20: invokevirtual 38	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    //   23: ifeq +57 -> 80
    //   26: return
    //   27: nop
    //   28: nop
    //   29: athrow
    //   30: aload_2
    //   31: invokestatic 44	kotlin/coroutines/experimental/intrinsics/IntrinsicsKt:getCOROUTINE_SUSPENDED	()Ljava/lang/Object;
    //   34: if_acmpne +33 -> 67
    //   37: getstatic 32	kotlin/coroutines/experimental/SafeContinuation:RESULT	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   40: aload_0
    //   41: invokestatic 44	kotlin/coroutines/experimental/intrinsics/IntrinsicsKt:getCOROUTINE_SUSPENDED	()Ljava/lang/Object;
    //   44: getstatic 47	kotlin/coroutines/experimental/SafeContinuation:RESUMED	Ljava/lang/Object;
    //   47: invokevirtual 38	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    //   50: ifeq +30 -> 80
    //   53: aload_0
    //   54: getfield 15	kotlin/coroutines/experimental/SafeContinuation:delegate	Lkotlin/coroutines/experimental/Continuation;
    //   57: aload_1
    //   58: invokeinterface 49 2 0
    //   63: return
    //   64: nop
    //   65: nop
    //   66: athrow
    //   67: new 51	java/lang/IllegalStateException
    //   70: dup
    //   71: ldc 53
    //   73: invokespecial 57	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   76: checkcast 59	java/lang/Throwable
    //   79: athrow
    //   80: goto -80 -> 0
    // Line number table:
    //   Java source line #41	-> byte code offset #0
    //   Java source line #42	-> byte code offset #0
    //   Java source line #43	-> byte code offset #5
    //   Java source line #44	-> byte code offset #5
    //   Java source line #45	-> byte code offset #30
    //   Java source line #46	-> byte code offset #53
    //   Java source line #47	-> byte code offset #63
    //   Java source line #49	-> byte code offset #67
    //   Java source line #50	-> byte code offset #80
    //   Java source line #41	-> byte code offset #80
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	SafeContinuation
    //   0	83	1	value	Object
    //   5	75	2	result	Object
  }
  
  /* Error */
  public void resumeWithException(@NotNull Throwable exception)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 64
    //   3: invokestatic 70	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: getfield 25	kotlin/coroutines/experimental/SafeContinuation:result	Ljava/lang/Object;
    //   10: astore_2
    //   11: aload_2
    //   12: getstatic 28	kotlin/coroutines/experimental/SafeContinuation:UNDECIDED	Ljava/lang/Object;
    //   15: if_acmpne +28 -> 43
    //   18: getstatic 32	kotlin/coroutines/experimental/SafeContinuation:RESULT	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   21: aload_0
    //   22: getstatic 28	kotlin/coroutines/experimental/SafeContinuation:UNDECIDED	Ljava/lang/Object;
    //   25: new 72	kotlin/coroutines/experimental/SafeContinuation$Fail
    //   28: dup
    //   29: aload_1
    //   30: invokespecial 74	kotlin/coroutines/experimental/SafeContinuation$Fail:<init>	(Ljava/lang/Throwable;)V
    //   33: invokevirtual 38	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    //   36: ifeq +57 -> 93
    //   39: return
    //   40: nop
    //   41: nop
    //   42: athrow
    //   43: aload_2
    //   44: invokestatic 44	kotlin/coroutines/experimental/intrinsics/IntrinsicsKt:getCOROUTINE_SUSPENDED	()Ljava/lang/Object;
    //   47: if_acmpne +33 -> 80
    //   50: getstatic 32	kotlin/coroutines/experimental/SafeContinuation:RESULT	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   53: aload_0
    //   54: invokestatic 44	kotlin/coroutines/experimental/intrinsics/IntrinsicsKt:getCOROUTINE_SUSPENDED	()Ljava/lang/Object;
    //   57: getstatic 47	kotlin/coroutines/experimental/SafeContinuation:RESUMED	Ljava/lang/Object;
    //   60: invokevirtual 38	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    //   63: ifeq +30 -> 93
    //   66: aload_0
    //   67: getfield 15	kotlin/coroutines/experimental/SafeContinuation:delegate	Lkotlin/coroutines/experimental/Continuation;
    //   70: aload_1
    //   71: invokeinterface 76 2 0
    //   76: return
    //   77: nop
    //   78: nop
    //   79: athrow
    //   80: new 51	java/lang/IllegalStateException
    //   83: dup
    //   84: ldc 53
    //   86: invokespecial 57	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   89: checkcast 59	java/lang/Throwable
    //   92: athrow
    //   93: goto -87 -> 6
    // Line number table:
    //   Java source line #55	-> byte code offset #6
    //   Java source line #56	-> byte code offset #6
    //   Java source line #57	-> byte code offset #11
    //   Java source line #58	-> byte code offset #11
    //   Java source line #59	-> byte code offset #43
    //   Java source line #60	-> byte code offset #66
    //   Java source line #61	-> byte code offset #76
    //   Java source line #63	-> byte code offset #80
    //   Java source line #64	-> byte code offset #93
    //   Java source line #55	-> byte code offset #93
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	this	SafeContinuation
    //   0	96	1	exception	Throwable
    //   11	82	2	result	Object
  }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002RZ\020\003\032F\022\024\022\022\022\002\b\003 \006*\b\022\002\b\003\030\0010\0050\005\022\006\022\004\030\0010\001 \006*\"\022\024\022\022\022\002\b\003 \006*\b\022\002\b\003\030\0010\0050\005\022\006\022\004\030\0010\001\030\0010\0040\0048\002X\004¢\006\b\n\000\022\004\b\007\020\002R\020\020\b\032\004\030\0010\001X\004¢\006\002\n\000R\020\020\t\032\004\030\0010\001X\004¢\006\002\n\000¨\006\n"}, d2={"Lkotlin/coroutines/experimental/SafeContinuation$Companion;", "", "()V", "RESULT", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/coroutines/experimental/SafeContinuation;", "kotlin.jvm.PlatformType", "RESULT$annotations", "RESUMED", "UNDECIDED", "kotlin-stdlib_coroutinesExperimental"})
  public static final class Companion
  {
    private Companion() {}
  }
}

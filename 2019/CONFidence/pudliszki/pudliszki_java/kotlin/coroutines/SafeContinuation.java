package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.PublishedApi;
import kotlin.Result.Failure;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000<\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\000\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\b\001\030\000 \032*\006\b\000\020\001 \0002\b\022\004\022\002H\0010\0022\0020\003:\001\032B\025\b\021\022\f\020\004\032\b\022\004\022\0028\0000\002¢\006\002\020\005B\037\b\000\022\f\020\004\032\b\022\004\022\0028\0000\002\022\b\020\006\032\004\030\0010\007¢\006\002\020\bJ\n\020\021\032\004\030\0010\007H\001J\n\020\022\032\004\030\0010\023H\026J\036\020\024\032\0020\0252\f\020\020\032\b\022\004\022\0028\0000\026H\026ø\001\000¢\006\002\020\027J\b\020\030\032\0020\031H\026R\026\020\t\032\004\030\0010\0038VX\004¢\006\006\032\004\b\n\020\013R\024\020\f\032\0020\r8VX\004¢\006\006\032\004\b\016\020\017R\024\020\004\032\b\022\004\022\0028\0000\002X\004¢\006\002\n\000R\020\020\020\032\004\030\0010\007X\016¢\006\002\n\000\002\004\n\002\b\031¨\006\033"}, d2={"Lkotlin/coroutines/SafeContinuation;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "(Lkotlin/coroutines/Continuation;)V", "initialResult", "", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "result", "getOrThrow", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "resumeWith", "", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "toString", "", "Companion", "kotlin-stdlib"})
@PublishedApi
@kotlin.SinceKotlin(version="1.3")
public final class SafeContinuation<T>
  implements Continuation<T>, CoroutineStackFrame
{
  @PublishedApi
  public SafeContinuation(@NotNull Continuation<? super T> delegate) { this(delegate, CoroutineSingletons.UNDECIDED); }
  
  @NotNull
  public CoroutineContext getContext() { return delegate.getContext(); }
  
  public SafeContinuation(@NotNull Continuation<? super T> delegate, @Nullable Object initialResult)
  {
    this.delegate = delegate;
    









    result = initialResult;
  }
  


  @Deprecated
  public static final Companion Companion = new Companion(null);
  private static final AtomicReferenceFieldUpdater<SafeContinuation<?>, Object> RESULT = AtomicReferenceFieldUpdater.newUpdater(
    SafeContinuation.class, Object.class, "result");
  



  private final Continuation<T> delegate;
  



  private volatile Object result;
  




  @PublishedApi
  @Nullable
  public final Object getOrThrow()
  {
    Object result = this.result;
    if (result == CoroutineSingletons.UNDECIDED) {
      if (RESULT.compareAndSet(this, CoroutineSingletons.UNDECIDED, IntrinsicsKt.getCOROUTINE_SUSPENDED())) return IntrinsicsKt.getCOROUTINE_SUSPENDED();
      result = this.result;
    }
    

    if ((result instanceof Result.Failure)) throw exception;
    return 
      result == CoroutineSingletons.RESUMED ? IntrinsicsKt.getCOROUTINE_SUSPENDED() : 
      
      result;
  }
  

  @Nullable
  public CoroutineStackFrame getCallerFrame()
  {
    Continuation tmp4_1 = delegate;
    

































































    if (!(tmp4_1 instanceof CoroutineStackFrame)) tmp4_1; return (CoroutineStackFrame)null; }
  
  @Nullable
  public StackTraceElement getStackTraceElement() { return null; }
  
  @NotNull
  public String toString() { return "SafeContinuation for " + delegate; }
  
  /* Error */
  public void resumeWith(@NotNull Object result)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 30	kotlin/coroutines/SafeContinuation:result	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: getstatic 36	kotlin/coroutines/intrinsics/CoroutineSingletons:UNDECIDED	Lkotlin/coroutines/intrinsics/CoroutineSingletons;
    //   9: if_acmpne +21 -> 30
    //   12: getstatic 40	kotlin/coroutines/SafeContinuation:RESULT	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   15: aload_0
    //   16: getstatic 36	kotlin/coroutines/intrinsics/CoroutineSingletons:UNDECIDED	Lkotlin/coroutines/intrinsics/CoroutineSingletons;
    //   19: aload_1
    //   20: invokevirtual 46	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    //   23: ifeq +57 -> 80
    //   26: return
    //   27: nop
    //   28: nop
    //   29: athrow
    //   30: aload_2
    //   31: invokestatic 52	kotlin/coroutines/intrinsics/IntrinsicsKt:getCOROUTINE_SUSPENDED	()Ljava/lang/Object;
    //   34: if_acmpne +33 -> 67
    //   37: getstatic 40	kotlin/coroutines/SafeContinuation:RESULT	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   40: aload_0
    //   41: invokestatic 52	kotlin/coroutines/intrinsics/IntrinsicsKt:getCOROUTINE_SUSPENDED	()Ljava/lang/Object;
    //   44: getstatic 55	kotlin/coroutines/intrinsics/CoroutineSingletons:RESUMED	Lkotlin/coroutines/intrinsics/CoroutineSingletons;
    //   47: invokevirtual 46	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    //   50: ifeq +30 -> 80
    //   53: aload_0
    //   54: getfield 20	kotlin/coroutines/SafeContinuation:delegate	Lkotlin/coroutines/Continuation;
    //   57: aload_1
    //   58: invokeinterface 57 2 0
    //   63: return
    //   64: nop
    //   65: nop
    //   66: athrow
    //   67: new 59	java/lang/IllegalStateException
    //   70: dup
    //   71: ldc 61
    //   73: invokespecial 65	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   76: checkcast 67	java/lang/Throwable
    //   79: athrow
    //   80: goto -80 -> 0
    // Line number table:
    //   Java source line #37	-> byte code offset #0
    //   Java source line #38	-> byte code offset #0
    //   Java source line #39	-> byte code offset #5
    //   Java source line #40	-> byte code offset #5
    //   Java source line #41	-> byte code offset #30
    //   Java source line #42	-> byte code offset #53
    //   Java source line #43	-> byte code offset #63
    //   Java source line #45	-> byte code offset #67
    //   Java source line #46	-> byte code offset #80
    //   Java source line #37	-> byte code offset #80
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	SafeContinuation
    //   0	83	1	result	Object
    //   5	75	2	cur	Object
  }
  
  @kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002RZ\020\003\032F\022\024\022\022\022\002\b\003 \006*\b\022\002\b\003\030\0010\0050\005\022\006\022\004\030\0010\001 \006*\"\022\024\022\022\022\002\b\003 \006*\b\022\002\b\003\030\0010\0050\005\022\006\022\004\030\0010\001\030\0010\0040\0048\002X\004¢\006\b\n\000\022\004\b\007\020\002¨\006\b"}, d2={"Lkotlin/coroutines/SafeContinuation$Companion;", "", "()V", "RESULT", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/coroutines/SafeContinuation;", "kotlin.jvm.PlatformType", "RESULT$annotations", "kotlin-stdlib"})
  private static final class Companion
  {
    private Companion() {}
  }
}

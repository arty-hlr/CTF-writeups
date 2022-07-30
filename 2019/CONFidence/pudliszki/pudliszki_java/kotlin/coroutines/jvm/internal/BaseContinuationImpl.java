package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.Nullable;


@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\0006\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\002\030\002\n\002\b\b\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020\016\n\000\b!\030\0002\n\022\006\022\004\030\0010\0020\0012\0020\0032\0020\004B\027\022\020\020\005\032\f\022\006\022\004\030\0010\002\030\0010\001¢\006\002\020\006J$\020\f\032\b\022\004\022\0020\r0\0012\b\020\016\032\004\030\0010\0022\n\020\005\032\006\022\002\b\0030\001H\026J\032\020\f\032\b\022\004\022\0020\r0\0012\n\020\005\032\006\022\002\b\0030\001H\026J\n\020\017\032\004\030\0010\020H\026J\"\020\021\032\004\030\0010\0022\016\020\022\032\n\022\006\022\004\030\0010\0020\023H$ø\001\000¢\006\002\020\024J\b\020\025\032\0020\rH\024J\036\020\026\032\0020\r2\016\020\022\032\n\022\006\022\004\030\0010\0020\023ø\001\000¢\006\002\020\027J\b\020\030\032\0020\031H\026R\026\020\007\032\004\030\0010\0038VX\004¢\006\006\032\004\b\b\020\tR\033\020\005\032\f\022\006\022\004\030\0010\002\030\0010\001¢\006\b\n\000\032\004\b\n\020\013\002\004\n\002\b\031¨\006\032"}, d2={"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/io/Serializable;", "completion", "(Lkotlin/coroutines/Continuation;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getCompletion", "()Lkotlin/coroutines/Continuation;", "create", "", "value", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "invokeSuspend", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "resumeWith", "(Ljava/lang/Object;)V", "toString", "", "kotlin-stdlib"})
@kotlin.SinceKotlin(version="1.3")
public abstract class BaseContinuationImpl
  implements Continuation<Object>, CoroutineStackFrame, java.io.Serializable
{
  @Nullable
  private final Continuation<Object> completion;
  
  public BaseContinuationImpl(@Nullable Continuation<Object> completion) { this.completion = completion; }
  
  @Nullable
  public final Continuation<Object> getCompletion() { return completion; }
  

  public final void resumeWith(@org.jetbrains.annotations.NotNull Object result)
  {
    DebugProbesKt.probeCoroutineResumed((Continuation)this);
    
    Object current = (BaseContinuationImpl)this;
    Object param = result;
    for (;;) {
      Object localObject1 = current;BaseContinuationImpl $receiver = localObject1;
      int $i$a$1$with; Continuation tmp26_23 = completion;
      



























      if (tmp26_23 == null) kotlin.jvm.internal.Intrinsics.throwNpe(); Continuation completion = tmp26_23;
      Object outcome;
      try {
        outcome = $receiver.invokeSuspend(param);
        if (outcome == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) return;
        kotlin.Result.Companion localCompanion1 = kotlin.Result.Companion;outcome = kotlin.Result.constructor-impl(outcome);
      } catch (Throwable exception) {
        kotlin.Result.Companion localCompanion2 = kotlin.Result.Companion;outcome = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(exception));
      }
      Object outcome = 
        outcome;
      





      $receiver.releaseIntercepted();
      if ((completion instanceof BaseContinuationImpl))
      {
        current = (BaseContinuationImpl)completion;
        param = outcome;
      }
      else {
        completion.resumeWith(outcome);
        return;
      }
    }
  }
  





  @org.jetbrains.annotations.NotNull
  public Continuation<kotlin.Unit> create(@org.jetbrains.annotations.NotNull Continuation<?> completion)
  {
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(completion, "completion");throw ((Throwable)new UnsupportedOperationException("create(Continuation) has not been overridden"));
  }
  
  @org.jetbrains.annotations.NotNull
  public Continuation<kotlin.Unit> create(@Nullable Object value, @org.jetbrains.annotations.NotNull Continuation<?> completion) { kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(completion, "completion");throw ((Throwable)new UnsupportedOperationException("create(Any?;Continuation) has not been overridden"));
  }
  



  @Nullable
  public CoroutineStackFrame getCallerFrame()
  {
    Continuation tmp4_1 = completion;
    






































































    if (!(tmp4_1 instanceof CoroutineStackFrame)) tmp4_1; return (CoroutineStackFrame)null; }
  
  @Nullable
  public StackTraceElement getStackTraceElement() { return DebugMetadataKt.getStackTraceElement(this); }
  
  @Nullable
  protected abstract Object invokeSuspend(@org.jetbrains.annotations.NotNull Object paramObject);
  
  protected void releaseIntercepted() {}
  
  /* Error */
  @org.jetbrains.annotations.NotNull
  public String toString()
  {
    // Byte code:
    //   0: new 101	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   7: ldc 105
    //   9: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12: aload_0
    //   13: invokevirtual 113	kotlin/coroutines/jvm/internal/BaseContinuationImpl:getStackTraceElement	()Ljava/lang/StackTraceElement;
    //   16: dup
    //   17: ifnull +9 -> 26
    //   20: checkcast 11	java/io/Serializable
    //   23: goto +14 -> 37
    //   26: pop
    //   27: aload_0
    //   28: invokevirtual 117	java/lang/Object:getClass	()Ljava/lang/Class;
    //   31: invokevirtual 122	java/lang/Class:getName	()Ljava/lang/String;
    //   34: checkcast 11	java/io/Serializable
    //   37: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   40: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   43: areturn
    // Line number table:
    //   Java source line #67	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	BaseContinuationImpl
  }
}

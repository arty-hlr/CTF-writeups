package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.Result.Companion;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;


















@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000>\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\004\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\007\n\002\020\003\n\002\b\004\032<\020\006\032\b\022\004\022\002H\b0\007\"\004\b\000\020\b2\006\020\t\032\0020\0012\032\b\004\020\n\032\024\022\n\022\b\022\004\022\002H\b0\f\022\004\022\0020\r0\013H\bø\001\000\0323\020\016\032\002H\b\"\004\b\000\020\b2\032\b\004\020\017\032\024\022\n\022\b\022\004\022\002H\b0\007\022\004\022\0020\r0\013HHø\001\000¢\006\002\020\020\032D\020\021\032\b\022\004\022\0020\r0\007\"\004\b\000\020\b*\030\b\001\022\n\022\b\022\004\022\002H\b0\007\022\006\022\004\030\0010\0220\0132\f\020\023\032\b\022\004\022\002H\b0\007H\007ø\001\000¢\006\002\020\024\032]\020\021\032\b\022\004\022\0020\r0\007\"\004\b\000\020\025\"\004\b\001\020\b*#\b\001\022\004\022\002H\025\022\n\022\b\022\004\022\002H\b0\007\022\006\022\004\030\0010\0220\026¢\006\002\b\0272\006\020\030\032\002H\0252\f\020\023\032\b\022\004\022\002H\b0\007H\007ø\001\000¢\006\002\020\031\032&\020\032\032\0020\r\"\004\b\000\020\b*\b\022\004\022\002H\b0\0072\006\020\033\032\002H\bH\b¢\006\002\020\034\032!\020\035\032\0020\r\"\004\b\000\020\b*\b\022\004\022\002H\b0\0072\006\020\036\032\0020\037H\b\032>\020 \032\0020\r\"\004\b\000\020\b*\030\b\001\022\n\022\b\022\004\022\002H\b0\007\022\006\022\004\030\0010\0220\0132\f\020\023\032\b\022\004\022\002H\b0\007H\007ø\001\000¢\006\002\020!\032W\020 \032\0020\r\"\004\b\000\020\025\"\004\b\001\020\b*#\b\001\022\004\022\002H\025\022\n\022\b\022\004\022\002H\b0\007\022\006\022\004\030\0010\0220\026¢\006\002\b\0272\006\020\030\032\002H\0252\f\020\023\032\b\022\004\022\002H\b0\007H\007ø\001\000¢\006\002\020\"\"\033\020\000\032\0020\0018Æ\002X\004¢\006\f\022\004\b\002\020\003\032\004\b\004\020\005\002\004\n\002\b\031¨\006#"}, d2={"coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext$annotations", "()V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Continuation", "Lkotlin/coroutines/Continuation;", "T", "context", "resumeWith", "Lkotlin/Function1;", "Lkotlin/Result;", "", "suspendCoroutine", "block", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCoroutine", "", "completion", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "resume", "value", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "resumeWithException", "exception", "", "startCoroutine", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "kotlin-stdlib"})
public final class ContinuationKt
{
  @SinceKotlin(version="1.3")
  @InlineOnly
  private static final <T> void resume(@NotNull Continuation<? super T> $receiver, T value)
  {
    ;
    Result.Companion localCompanion = Result.Companion;Continuation localContinuation = $receiver;Object localObject = Result.constructor-impl(value);localContinuation.resumeWith(localObject);
  }
  

  @SinceKotlin(version="1.3")
  @InlineOnly
  private static final <T> void resumeWithException(@NotNull Continuation<? super T> $receiver, Throwable exception)
  {
    ;
    Result.Companion localCompanion = Result.Companion;Continuation localContinuation = $receiver;Object localObject = Result.constructor-impl(ResultKt.createFailure(exception));localContinuation.resumeWith(localObject);
  }
  





  @SinceKotlin(version="1.3")
  @InlineOnly
  private static final <T> Continuation<T> Continuation(CoroutineContext context, final Function1<? super Result<? extends T>, Unit> resumeWith)
  {
    ;
    




    (Continuation)new Continuation()
    {
      @NotNull
      public CoroutineContext getContext()
      {
        return $context;
      }
      
      public void resumeWith(@NotNull Object result) { resumeWith.invoke(Result.box-impl(result)); }
    };
  }
  








  @SinceKotlin(version="1.3")
  @NotNull
  public static final <T> Continuation<Unit> createCoroutine(@NotNull Function1<? super Continuation<? super T>, ? extends Object> $receiver, @NotNull Continuation<? super T> completion)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(completion, "completion");return (Continuation)new SafeContinuation(IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted($receiver, completion)), IntrinsicsKt.getCOROUTINE_SUSPENDED());
  }
  









  @SinceKotlin(version="1.3")
  @NotNull
  public static final <R, T> Continuation<Unit> createCoroutine(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> $receiver, R receiver, @NotNull Continuation<? super T> completion)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(completion, "completion");return (Continuation)new SafeContinuation(IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted($receiver, receiver, completion)), IntrinsicsKt.getCOROUTINE_SUSPENDED());
  }
  






  @SinceKotlin(version="1.3")
  public static final <T> void startCoroutine(@NotNull Function1<? super Continuation<? super T>, ? extends Object> $receiver, @NotNull Continuation<? super T> completion)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(completion, "completion");Continuation localContinuation1 = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted($receiver, completion));Unit localUnit = Unit.INSTANCE;Result.Companion localCompanion = Result.Companion;Continuation localContinuation2 = localContinuation1;Object localObject = Result.constructor-impl(localUnit);localContinuation2.resumeWith(localObject);
  }
  








  @SinceKotlin(version="1.3")
  public static final <R, T> void startCoroutine(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> $receiver, R receiver, @NotNull Continuation<? super T> completion)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(completion, "completion");Continuation localContinuation1 = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted($receiver, receiver, completion));Unit localUnit = Unit.INSTANCE;Result.Companion localCompanion = Result.Companion;Continuation localContinuation2 = localContinuation1;Object localObject = Result.constructor-impl(localUnit);localContinuation2.resumeWith(localObject);
  }
  



  @SinceKotlin(version="1.3")
  @InlineOnly
  private static final <T> Object suspendCoroutine(Function1<? super Continuation<? super T>, Unit> block, Continuation<? super T> arg1)
  {
    ;
    


    InlineMarker.mark(0);Continuation c = ???;
    int $i$a$2$suspendCoroutineUninterceptedOrReturn; SafeContinuation safe = new SafeContinuation(IntrinsicsKt.intercepted(c));
    block.invoke(safe); Object tmp34_30 = 
      safe.getOrThrow();
    if (tmp34_30 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) DebugProbesKt.probeCoroutineSuspended(???); InlineMarker.mark(1);
    


    return tmp34_30;
  }
  


  private static final CoroutineContext getCoroutineContext()
  {
    ;
    

    throw ((Throwable)new NotImplementedError("Implemented as intrinsic"));
  }
}

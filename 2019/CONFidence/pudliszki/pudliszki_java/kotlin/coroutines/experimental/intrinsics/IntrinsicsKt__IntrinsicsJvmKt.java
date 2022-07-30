package kotlin.coroutines.experimental.intrinsics;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.experimental.Continuation;
import kotlin.coroutines.experimental.jvm.internal.CoroutineImpl;
import kotlin.coroutines.experimental.jvm.internal.CoroutineIntrinsics;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\0002\n\000\n\002\020\000\n\002\b\005\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\006\032:\020\006\032\b\022\004\022\0020\b0\007\"\004\b\000\020\t2\f\020\n\032\b\022\004\022\002H\t0\0072\020\b\004\020\013\032\n\022\006\022\004\030\0010\0010\fH\b¢\006\002\b\r\032D\020\016\032\b\022\004\022\0020\b0\007\"\004\b\000\020\t*\030\b\001\022\n\022\b\022\004\022\002H\t0\007\022\006\022\004\030\0010\0010\0172\f\020\n\032\b\022\004\022\002H\t0\007H\007ø\001\000¢\006\002\020\020\032]\020\016\032\b\022\004\022\0020\b0\007\"\004\b\000\020\021\"\004\b\001\020\t*#\b\001\022\004\022\002H\021\022\n\022\b\022\004\022\002H\t0\007\022\006\022\004\030\0010\0010\022¢\006\002\b\0232\006\020\024\032\002H\0212\f\020\n\032\b\022\004\022\002H\t0\007H\007ø\001\000¢\006\002\020\025\032A\020\026\032\004\030\0010\001\"\004\b\000\020\t*\030\b\001\022\n\022\b\022\004\022\002H\t0\007\022\006\022\004\030\0010\0010\0172\f\020\n\032\b\022\004\022\002H\t0\007H\bø\001\000¢\006\002\020\027\032Z\020\026\032\004\030\0010\001\"\004\b\000\020\021\"\004\b\001\020\t*#\b\001\022\004\022\002H\021\022\n\022\b\022\004\022\002H\t0\007\022\006\022\004\030\0010\0010\022¢\006\002\b\0232\006\020\024\032\002H\0212\f\020\n\032\b\022\004\022\002H\t0\007H\bø\001\000¢\006\002\020\030\"\032\020\000\032\0020\0018FX\004¢\006\f\022\004\b\002\020\003\032\004\b\004\020\005\002\004\n\002\b\t¨\006\031"}, d2={"COROUTINE_SUSPENDED", "", "COROUTINE_SUSPENDED$annotations", "()V", "getCOROUTINE_SUSPENDED", "()Ljava/lang/Object;", "buildContinuationByInvokeCall", "Lkotlin/coroutines/experimental/Continuation;", "", "T", "completion", "block", "Lkotlin/Function0;", "buildContinuationByInvokeCall$IntrinsicsKt__IntrinsicsJvmKt", "createCoroutineUnchecked", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/experimental/Continuation;)Lkotlin/coroutines/experimental/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/experimental/Continuation;)Lkotlin/coroutines/experimental/Continuation;", "startCoroutineUninterceptedOrReturn", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "kotlin-stdlib_coroutinesExperimental"}, xs="kotlin/coroutines/experimental/intrinsics/IntrinsicsKt")
class IntrinsicsKt__IntrinsicsJvmKt
{
  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <T> Object startCoroutineUninterceptedOrReturn(@NotNull Function1<? super Continuation<? super T>, ? extends Object> $receiver, Continuation<? super T> completion)
  {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type (kotlin.coroutines.experimental.Continuation<T>) -> kotlin.Any?"); return ((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity($receiver, 1)).invoke(completion);
  }
  




  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <R, T> Object startCoroutineUninterceptedOrReturn(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> $receiver, R receiver, Continuation<? super T> completion)
  {
    ;
    


    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.experimental.Continuation<T>) -> kotlin.Any?"); return ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity($receiver, 2)).invoke(receiver, completion);
  }
  












  @SinceKotlin(version="1.1")
  @NotNull
  public static final <T> Continuation<Unit> createCoroutineUnchecked(@NotNull Function1<? super Continuation<? super T>, ? extends Object> $receiver, @NotNull Continuation<? super T> completion)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(completion, "completion");
    





























    int $i$f$buildContinuationByInvokeCall$IntrinsicsKt__IntrinsicsJvmKt;
    




























    IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnchecked..inlined.buildContinuationByInvokeCall.IntrinsicsKt__IntrinsicsJvmKt.1 continuation$iv = 
      new IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnchecked..inlined.buildContinuationByInvokeCall.IntrinsicsKt__IntrinsicsJvmKt.1(completion, $receiver, completion); Continuation tmp55_52 = ((CoroutineImpl)$receiver).create(completion);
    if (tmp55_52 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.jvm.internal.CoroutineImpl"); return !($receiver instanceof CoroutineImpl) ? 
    























































      CoroutineIntrinsics.interceptContinuationIfNeeded(completion.getContext(), (Continuation)continuation$iv) : ((CoroutineImpl)tmp55_52).getFacade();
  }
  










  @SinceKotlin(version="1.1")
  @NotNull
  public static final <R, T> Continuation<Unit> createCoroutineUnchecked(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> $receiver, R receiver, @NotNull Continuation<? super T> completion)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(completion, "completion");
    



















    int $i$f$buildContinuationByInvokeCall$IntrinsicsKt__IntrinsicsJvmKt;
    


















    IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnchecked..inlined.buildContinuationByInvokeCall.IntrinsicsKt__IntrinsicsJvmKt.2 continuation$iv = 
      new IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnchecked..inlined.buildContinuationByInvokeCall.IntrinsicsKt__IntrinsicsJvmKt.2(completion, $receiver, receiver, completion); Continuation tmp57_54 = ((CoroutineImpl)$receiver).create(receiver, completion);
    if (tmp57_54 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.jvm.internal.CoroutineImpl"); return !($receiver instanceof CoroutineImpl) ? 
    



































      CoroutineIntrinsics.interceptContinuationIfNeeded(completion.getContext(), (Continuation)continuation$iv) : ((CoroutineImpl)tmp57_54).getFacade();
  }
  

  private static final <T> Continuation<Unit> buildContinuationByInvokeCall$IntrinsicsKt__IntrinsicsJvmKt(Continuation<? super T> completion, final Function0<? extends Object> block)
  {
    ;
    
    Continuation continuation = 
      new Continuation() {
        @NotNull
        public kotlin.coroutines.experimental.CoroutineContext getContext() { return $completion.getContext(); }
        
        public void resume(@NotNull Unit value) {
          Intrinsics.checkParameterIsNotNull(value, "value");Continuation localContinuation = $completion; try { Object localObject = block.invoke(); if (localObject != IntrinsicsKt.getCOROUTINE_SUSPENDED()) { Continuation tmp30_29 = localContinuation;
              





































































































              if (tmp30_29 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>"); tmp30_29.resume(localObject); } } catch (Throwable localThrowable1) { localContinuation.resumeWithException(localThrowable1);
          }
        }
        
        public void resumeWithException(@NotNull Throwable exception) { Intrinsics.checkParameterIsNotNull(exception, "exception");$completion.resumeWithException(exception);
        }
        
      };
      return CoroutineIntrinsics.interceptContinuationIfNeeded(completion.getContext(), (Continuation)continuation);
    }
    


    @NotNull
    public static final Object getCOROUTINE_SUSPENDED()
    {
      return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }
    
    public IntrinsicsKt__IntrinsicsJvmKt() {}
  }

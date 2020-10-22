package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000&\n\000\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\007\032F\020\000\032\b\022\004\022\0020\0020\001\"\004\b\000\020\0032\f\020\004\032\b\022\004\022\002H\0030\0012\034\b\004\020\005\032\026\022\n\022\b\022\004\022\002H\0030\001\022\006\022\004\030\0010\0070\006H\b¢\006\002\b\b\032D\020\t\032\b\022\004\022\0020\0020\001\"\004\b\000\020\003*\030\b\001\022\n\022\b\022\004\022\002H\0030\001\022\006\022\004\030\0010\0070\0062\f\020\004\032\b\022\004\022\002H\0030\001H\007ø\001\000¢\006\002\020\n\032]\020\t\032\b\022\004\022\0020\0020\001\"\004\b\000\020\013\"\004\b\001\020\003*#\b\001\022\004\022\002H\013\022\n\022\b\022\004\022\002H\0030\001\022\006\022\004\030\0010\0070\f¢\006\002\b\r2\006\020\016\032\002H\0132\f\020\004\032\b\022\004\022\002H\0030\001H\007ø\001\000¢\006\002\020\017\032\036\020\020\032\b\022\004\022\002H\0030\001\"\004\b\000\020\003*\b\022\004\022\002H\0030\001H\007\032A\020\021\032\004\030\0010\007\"\004\b\000\020\003*\030\b\001\022\n\022\b\022\004\022\002H\0030\001\022\006\022\004\030\0010\0070\0062\f\020\004\032\b\022\004\022\002H\0030\001H\bø\001\000¢\006\002\020\022\032Z\020\021\032\004\030\0010\007\"\004\b\000\020\013\"\004\b\001\020\003*#\b\001\022\004\022\002H\013\022\n\022\b\022\004\022\002H\0030\001\022\006\022\004\030\0010\0070\f¢\006\002\b\r2\006\020\016\032\002H\0132\f\020\004\032\b\022\004\022\002H\0030\001H\bø\001\000¢\006\002\020\023\002\004\n\002\b\031¨\006\024"}, d2={"createCoroutineFromSuspendFunction", "Lkotlin/coroutines/Continuation;", "", "T", "completion", "block", "Lkotlin/Function1;", "", "createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "createCoroutineUnintercepted", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "intercepted", "startCoroutineUninterceptedOrReturn", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, xs="kotlin/coroutines/intrinsics/IntrinsicsKt")
class IntrinsicsKt__IntrinsicsJvmKt
{
  @SinceKotlin(version="1.3")
  @InlineOnly
  private static final <T> Object startCoroutineUninterceptedOrReturn(@NotNull Function1<? super Continuation<? super T>, ? extends Object> $receiver, Continuation<? super T> completion)
  {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?"); return ((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity($receiver, 1)).invoke(completion);
  }
  






  @SinceKotlin(version="1.3")
  @InlineOnly
  private static final <R, T> Object startCoroutineUninterceptedOrReturn(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> $receiver, R receiver, Continuation<? super T> completion)
  {
    ;
    




    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?"); return ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity($receiver, 2)).invoke(receiver, completion);
  }
  



















































  @SinceKotlin(version="1.3")
  private static final <T> Continuation<Unit> createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(final Continuation<? super T> completion, Function1<? super Continuation<? super T>, ? extends Object> block)
  {
    ;
    

















































    final CoroutineContext context = completion.getContext();
    

    if (completion == null) { throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }
    















    if (completion == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    context == EmptyCoroutineContext.INSTANCE ? 
      (Continuation)new RestrictedContinuationImpl(block) { private int label;
        
        @Nullable
        protected Object invokeSuspend(@NotNull Object result) { Object localObject;
          switch (label) {
          case 0: 
            label = 1;
            localObject = result;ResultKt.throwOnFailure(localObject);
            break;
          
          case 1: 
            label = 2;
            localObject = result;ResultKt.throwOnFailure(localObject); break;
          default: 
            localObject = "This coroutine had already completed";throw ((Throwable)new IllegalStateException(localObject.toString())); }
          return localObject;
        }
        
      } : (Continuation)new ContinuationImpl(block, completion) { private int label;
        
        @Nullable
        protected Object invokeSuspend(@NotNull Object result) { Object localObject;
          switch (label) {
          case 0: 
            label = 1;
            localObject = result;ResultKt.throwOnFailure(localObject);
            break;
          
          case 1: 
            label = 2;
            localObject = result;ResultKt.throwOnFailure(localObject); break;
          default: 
            localObject = "This coroutine had already completed";throw ((Throwable)new IllegalStateException(localObject.toString())); }
          return localObject;
        }
      };
    }
    
    @SinceKotlin(version="1.3")
    @NotNull
    public static final <T> Continuation<Unit> createCoroutineUnintercepted(@NotNull Function1<? super Continuation<? super T>, ? extends Object> $receiver, @NotNull Continuation<? super T> completion)
    {
      Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(completion, "completion");Continuation probeCompletion = DebugProbesKt.probeCoroutineCreated(completion);
      

























































      int $i$f$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt;
      

























































      CoroutineContext context$iv = probeCompletion.getContext(); Continuation 
      

        tmp56_55 = probeCompletion;
      

      if (tmp56_55 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
      Continuation tmp87_86 = probeCompletion;
      









































































































































































































      if (tmp87_86 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
      return 
      





















































































































        context$iv == EmptyCoroutineContext.INSTANCE ? 
        (Continuation)new IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted..inlined.createCoroutineFromSuspendFunction.IntrinsicsKt__IntrinsicsJvmKt.1(probeCompletion, tmp56_55, $receiver) : ($receiver instanceof BaseContinuationImpl) ? ((BaseContinuationImpl)$receiver).create(probeCompletion) : 
        (Continuation)new IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted..inlined.createCoroutineFromSuspendFunction.IntrinsicsKt__IntrinsicsJvmKt.2(probeCompletion, context$iv, tmp87_86, context$iv, $receiver);
    }
    
    @SinceKotlin(version="1.3")
    @NotNull
    public static final <R, T> Continuation<Unit> createCoroutineUnintercepted(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> $receiver, R receiver, @NotNull Continuation<? super T> completion)
    {
      Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(completion, "completion");Continuation probeCompletion = DebugProbesKt.probeCoroutineCreated(completion);
      










































      int $i$f$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt;
      










































      CoroutineContext context$iv = probeCompletion.getContext(); Continuation 
      

        tmp59_58 = probeCompletion;
      

      if (tmp59_58 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
      Continuation tmp92_91 = probeCompletion;
      














































































































































































































      if (tmp92_91 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
      return 
      























































































        context$iv == EmptyCoroutineContext.INSTANCE ? 
        (Continuation)new IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted..inlined.createCoroutineFromSuspendFunction.IntrinsicsKt__IntrinsicsJvmKt.3(probeCompletion, tmp59_58, $receiver, receiver) : ($receiver instanceof BaseContinuationImpl) ? ((BaseContinuationImpl)$receiver).create(receiver, probeCompletion) : 
        (Continuation)new IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted..inlined.createCoroutineFromSuspendFunction.IntrinsicsKt__IntrinsicsJvmKt.4(probeCompletion, context$iv, tmp92_91, context$iv, $receiver, receiver);
    }
    
    /* Error */
    @SinceKotlin(version="1.3")
    @NotNull
    public static final <T> Continuation<T> intercepted(@NotNull Continuation<? super T> $receiver)
    {
      // Byte code:
      //   0: aload_0
      //   1: ldc 52
      //   3: invokestatic 58	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_0
      //   7: dup
      //   8: instanceof 117
      //   11: ifne +5 -> 16
      //   14: pop
      //   15: aconst_null
      //   16: checkcast 117	kotlin/coroutines/jvm/internal/ContinuationImpl
      //   19: dup
      //   20: ifnull +13 -> 33
      //   23: invokevirtual 120	kotlin/coroutines/jvm/internal/ContinuationImpl:intercepted	()Lkotlin/coroutines/Continuation;
      //   26: dup
      //   27: ifnull +6 -> 33
      //   30: goto +5 -> 35
      //   33: pop
      //   34: aload_0
      //   35: areturn
      // Line number table:
      //   Java source line #137	-> byte code offset #6
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	36	0	$receiver	Continuation
    }
    
    public IntrinsicsKt__IntrinsicsJvmKt() {}
  }

package kotlin.coroutines.experimental.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\022\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\032*\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\0042\f\020\005\032\b\022\004\022\002H\0020\001H\000\032 \020\006\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\f\020\005\032\b\022\004\022\002H\0020\001¨\006\007"}, d2={"interceptContinuationIfNeeded", "Lkotlin/coroutines/experimental/Continuation;", "T", "context", "Lkotlin/coroutines/experimental/CoroutineContext;", "continuation", "normalizeContinuation", "kotlin-stdlib_coroutinesExperimental"})
@JvmName(name="CoroutineIntrinsics")
public final class CoroutineIntrinsics
{
  /* Error */
  @org.jetbrains.annotations.NotNull
  public static final <T> kotlin.coroutines.experimental.Continuation<T> normalizeContinuation(@org.jetbrains.annotations.NotNull kotlin.coroutines.experimental.Continuation<? super T> continuation)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 12
    //   3: invokestatic 18	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: dup
    //   8: instanceof 20
    //   11: ifne +5 -> 16
    //   14: pop
    //   15: aconst_null
    //   16: checkcast 20	kotlin/coroutines/experimental/jvm/internal/CoroutineImpl
    //   19: dup
    //   20: ifnull +13 -> 33
    //   23: invokevirtual 24	kotlin/coroutines/experimental/jvm/internal/CoroutineImpl:getFacade	()Lkotlin/coroutines/experimental/Continuation;
    //   26: dup
    //   27: ifnull +6 -> 33
    //   30: goto +5 -> 35
    //   33: pop
    //   34: aload_0
    //   35: areturn
    // Line number table:
    //   Java source line #18	-> byte code offset #6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	continuation	kotlin.coroutines.experimental.Continuation
  }
  
  /* Error */
  @org.jetbrains.annotations.NotNull
  public static final <T> kotlin.coroutines.experimental.Continuation<T> interceptContinuationIfNeeded(@org.jetbrains.annotations.NotNull kotlin.coroutines.experimental.CoroutineContext context, @org.jetbrains.annotations.NotNull kotlin.coroutines.experimental.Continuation<? super T> continuation)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 31
    //   3: invokestatic 18	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 12
    //   9: invokestatic 18	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: getstatic 37	kotlin/coroutines/experimental/ContinuationInterceptor:Key	Lkotlin/coroutines/experimental/ContinuationInterceptor$Key;
    //   16: checkcast 39	kotlin/coroutines/experimental/CoroutineContext$Key
    //   19: invokeinterface 45 2 0
    //   24: checkcast 33	kotlin/coroutines/experimental/ContinuationInterceptor
    //   27: dup
    //   28: ifnull +16 -> 44
    //   31: aload_1
    //   32: invokeinterface 48 2 0
    //   37: dup
    //   38: ifnull +6 -> 44
    //   41: goto +5 -> 46
    //   44: pop
    //   45: aload_1
    //   46: areturn
    // Line number table:
    //   Java source line #23	-> byte code offset #12
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	context	kotlin.coroutines.experimental.CoroutineContext
    //   0	47	1	continuation	kotlin.coroutines.experimental.Continuation
  }
}

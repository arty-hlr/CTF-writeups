package kotlin.coroutines.experimental.intrinsics;

import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.SinceKotlin;
import kotlin.coroutines.experimental.Continuation;
import kotlin.coroutines.experimental.jvm.internal.CoroutineIntrinsics;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;













@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\024\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\004\0325\020\000\032\002H\001\"\004\b\000\020\0012\034\b\004\020\002\032\026\022\n\022\b\022\004\022\002H\0010\004\022\006\022\004\030\0010\0050\003HHø\001\000¢\006\002\020\006\0325\020\007\032\002H\001\"\004\b\000\020\0012\034\b\004\020\002\032\026\022\n\022\b\022\004\022\002H\0010\004\022\006\022\004\030\0010\0050\003HHø\001\000¢\006\002\020\006\032\037\020\b\032\b\022\004\022\002H\0010\004\"\004\b\000\020\001*\b\022\004\022\002H\0010\004H\b\002\004\n\002\b\t¨\006\t"}, d2={"suspendCoroutineOrReturn", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/experimental/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "suspendCoroutineUninterceptedOrReturn", "intercepted", "kotlin-stdlib_coroutinesExperimental"}, xs="kotlin/coroutines/experimental/intrinsics/IntrinsicsKt")
class IntrinsicsKt__IntrinsicsKt
  extends IntrinsicsKt__IntrinsicsJvmKt
{
  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <T> Object suspendCoroutineOrReturn(Function1<? super Continuation<? super T>, ? extends Object> block, Continuation<? super T> arg1)
  {
    ;
    InlineMarker.mark(0);Continuation cont = ???; int $i$a$2$suspendCoroutineUninterceptedOrReturn; Continuation localContinuation1 = cont;Function1 localFunction1 = block;Continuation localContinuation2 = CoroutineIntrinsics.normalizeContinuation(localContinuation1);InlineMarker.mark(1);return localFunction1.invoke(localContinuation2);
  }
  





  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final <T> Object suspendCoroutineUninterceptedOrReturn(Function1<? super Continuation<? super T>, ? extends Object> block, Continuation<? super T> arg1)
  {
    throw ((Throwable)new NotImplementedError("Implementation of suspendCoroutineUninterceptedOrReturn is intrinsic"));
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final <T> Continuation<T> intercepted(@NotNull Continuation<? super T> $receiver)
  {
    ;
    throw ((Throwable)new NotImplementedError("Implementation of intercepted is intrinsic"));
  }
  
  public IntrinsicsKt__IntrinsicsKt() {}
}

package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\030\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\032.\020\000\032\0020\0012\034\020\002\032\030\b\001\022\n\022\b\022\004\022\0020\0010\004\022\006\022\004\030\0010\0050\003H\001ø\001\000¢\006\002\020\006\002\004\n\002\b\031¨\006\007"}, d2={"runSuspend", "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"})
public final class RunSuspendKt
{
  @SinceKotlin(version="1.3")
  public static final void runSuspend(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> block)
  {
    Intrinsics.checkParameterIsNotNull(block, "block");RunSuspend run = new RunSuspend();
    ContinuationKt.startCoroutine(block, (Continuation)run);
    run.await();
  }
}

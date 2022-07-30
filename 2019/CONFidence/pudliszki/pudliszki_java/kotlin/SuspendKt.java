package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\024\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\000\n\002\b\003\032P\020\000\032\030\b\001\022\n\022\b\022\004\022\002H\0030\002\022\006\022\004\030\0010\0040\001\"\004\b\000\020\0032\036\b\b\020\005\032\030\b\001\022\n\022\b\022\004\022\002H\0030\002\022\006\022\004\030\0010\0040\001H\bø\001\000ø\001\001¢\006\002\020\006\002\r\n\007\b\036\030\0020\001\n\002\b\031¨\006\007"}, d2={"suspend", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "R", "", "block", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "kotlin-stdlib"})
public final class SuspendKt
{
  @kotlin.internal.InlineOnly
  @SinceKotlin(version="1.2")
  private static final <R> Function1<Continuation<? super R>, Object> suspend(Function1<? super Continuation<? super R>, ? extends Object> block)
  {
    ;
    return block;
  }
}

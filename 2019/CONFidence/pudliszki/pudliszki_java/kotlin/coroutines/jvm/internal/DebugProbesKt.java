package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;





























@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\022\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\032\"\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\f\020\003\032\b\022\004\022\002H\0020\001H\001\032\024\020\004\032\0020\0052\n\020\006\032\006\022\002\b\0030\001H\001\032\024\020\007\032\0020\0052\n\020\006\032\006\022\002\b\0030\001H\001¨\006\b"}, d2={"probeCoroutineCreated", "Lkotlin/coroutines/Continuation;", "T", "completion", "probeCoroutineResumed", "", "frame", "probeCoroutineSuspended", "kotlin-stdlib"})
public final class DebugProbesKt
{
  @SinceKotlin(version="1.3")
  @NotNull
  public static final <T> Continuation<T> probeCoroutineCreated(@NotNull Continuation<? super T> completion)
  {
    Intrinsics.checkParameterIsNotNull(completion, "completion");return completion;
  }
  










  @SinceKotlin(version="1.3")
  public static final void probeCoroutineResumed(@NotNull Continuation<?> frame)
  {
    Intrinsics.checkParameterIsNotNull(frame, "frame");
  }
  










  @SinceKotlin(version="1.3")
  public static final void probeCoroutineSuspended(@NotNull Continuation<?> frame)
  {
    Intrinsics.checkParameterIsNotNull(frame, "frame");
  }
}

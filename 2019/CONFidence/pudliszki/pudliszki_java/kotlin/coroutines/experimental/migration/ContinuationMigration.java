package kotlin.coroutines.experimental.migration;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000*\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\023\022\f\020\003\032\b\022\004\022\0028\0000\004¢\006\002\020\005J\036\020\f\032\0020\r2\f\020\016\032\b\022\004\022\0028\0000\017H\026ø\001\000¢\006\002\020\020R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\b\020\tR\027\020\003\032\b\022\004\022\0028\0000\004¢\006\b\n\000\032\004\b\n\020\013\002\004\n\002\b\031¨\006\021"}, d2={"Lkotlin/coroutines/experimental/migration/ContinuationMigration;", "T", "Lkotlin/coroutines/Continuation;", "continuation", "Lkotlin/coroutines/experimental/Continuation;", "(Lkotlin/coroutines/experimental/Continuation;)V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getContinuation", "()Lkotlin/coroutines/experimental/Continuation;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "kotlin-stdlib_coroutinesExperimental"})
final class ContinuationMigration<T>
  implements kotlin.coroutines.Continuation<T>
{
  @NotNull
  private final CoroutineContext context;
  @NotNull
  private final kotlin.coroutines.experimental.Continuation<T> continuation;
  
  @NotNull
  public final kotlin.coroutines.experimental.Continuation<T> getContinuation() { return continuation; } @NotNull
  public CoroutineContext getContext() { return context; }
  
  public ContinuationMigration(@NotNull kotlin.coroutines.experimental.Continuation<? super T> continuation)
  {
    this.continuation = continuation;
    context = CoroutinesMigrationKt.toCoroutineContext(this.continuation.getContext());
  }
  
  /* Error */
  public void resumeWith(@NotNull Object result)
  {
    // Byte code:
    //   0: aload_1
    //   1: astore_2
    //   2: aload_2
    //   3: invokestatic 24	kotlin/Result:isSuccess-impl	(Ljava/lang/Object;)Z
    //   6: ifeq +15 -> 21
    //   9: aload_2
    //   10: astore_3
    //   11: aload_0
    //   12: getfield 28	kotlin/coroutines/experimental/migration/ContinuationMigration:continuation	Lkotlin/coroutines/experimental/Continuation;
    //   15: aload_3
    //   16: invokeinterface 33 2 0
    //   21: aload_2
    //   22: astore_2
    //   23: aload_2
    //   24: invokestatic 37	kotlin/Result:exceptionOrNull-impl	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   27: dup
    //   28: ifnull +25 -> 53
    //   31: astore_3
    //   32: aload_3
    //   33: astore 4
    //   35: aload 4
    //   37: astore 5
    //   39: aload_0
    //   40: getfield 28	kotlin/coroutines/experimental/migration/ContinuationMigration:continuation	Lkotlin/coroutines/experimental/Continuation;
    //   43: aload 5
    //   45: invokeinterface 41 2 0
    //   50: goto +4 -> 54
    //   53: pop
    //   54: return
    // Line number table:
    //   Java source line #83	-> byte code offset #0
    //   Java source line #85	-> byte code offset #0
    //   Java source line #83	-> byte code offset #0
    //   Java source line #84	-> byte code offset #0
    //   Java source line #83	-> byte code offset #0
    //   Java source line #84	-> byte code offset #2
    //   Java source line #84	-> byte code offset #11
    //   Java source line #84	-> byte code offset #21
    //   Java source line #85	-> byte code offset #23
    //   Java source line #85	-> byte code offset #39
    //   Java source line #85	-> byte code offset #50
    //   Java source line #86	-> byte code offset #54
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	ContinuationMigration
    //   0	55	1	result	Object
    //   11	10	3	it	Object
    //   11	10	4	$i$a$1$onSuccess	int
    //   39	11	5	it	Throwable
    //   39	11	6	$i$a$2$onFailure	int
  }
}

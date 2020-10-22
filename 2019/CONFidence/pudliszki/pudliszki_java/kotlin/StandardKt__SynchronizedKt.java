package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;









@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\022\n\002\b\003\n\002\020\000\n\000\n\002\030\002\n\002\b\002\0327\020\000\032\002H\001\"\004\b\000\020\0012\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\002H\0010\005H\b\002\n\n\b\b\001\022\002\020\002 \001¢\006\002\020\006¨\006\007"}, d2={"synchronized", "R", "lock", "", "block", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlin-stdlib"}, xs="kotlin/StandardKt")
class StandardKt__SynchronizedKt
  extends StandardKt__StandardKt
{
  @InlineOnly
  private static final <R> R jdMethod_synchronized(Object lock, Function0<? extends R> block)
  {
    ;
    try
    {
      Object localObject1 = block.invoke();
      


      return localObject1;
    } finally { InlineMarker.finallyStart(1);InlineMarker.finallyEnd(1);
    }
  }
  
  public StandardKt__SynchronizedKt() {}
}

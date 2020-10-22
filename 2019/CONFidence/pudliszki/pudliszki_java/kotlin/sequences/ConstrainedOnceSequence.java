package kotlin.sequences;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\034\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020(\n\000\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\023\022\f\020\003\032\b\022\004\022\0028\0000\002¢\006\002\020\004J\017\020\b\032\b\022\004\022\0028\0000\tH\002R(\020\005\032\034\022\030\022\026\022\004\022\0028\000 \007*\n\022\004\022\0028\000\030\0010\0020\0020\006X\004¢\006\002\n\000¨\006\n"}, d2={"Lkotlin/sequences/ConstrainedOnceSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "(Lkotlin/sequences/Sequence;)V", "sequenceRef", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "iterator", "", "kotlin-stdlib"})
public final class ConstrainedOnceSequence<T>
  implements Sequence<T>
{
  private final AtomicReference<Sequence<T>> sequenceRef;
  
  /* Error */
  @NotNull
  public java.util.Iterator<T> iterator()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 15	kotlin/sequences/ConstrainedOnceSequence:sequenceRef	Ljava/util/concurrent/atomic/AtomicReference;
    //   4: aconst_null
    //   5: invokevirtual 21	java/util/concurrent/atomic/AtomicReference:getAndSet	(Ljava/lang/Object;)Ljava/lang/Object;
    //   8: checkcast 7	kotlin/sequences/Sequence
    //   11: dup
    //   12: ifnull +6 -> 18
    //   15: goto +17 -> 32
    //   18: pop
    //   19: new 23	java/lang/IllegalStateException
    //   22: dup
    //   23: ldc 25
    //   25: invokespecial 29	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   28: checkcast 31	java/lang/Throwable
    //   31: athrow
    //   32: astore_1
    //   33: aload_1
    //   34: invokeinterface 33 1 0
    //   39: areturn
    // Line number table:
    //   Java source line #23	-> byte code offset #0
    //   Java source line #24	-> byte code offset #33
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	this	ConstrainedOnceSequence
    //   33	7	1	sequence	Sequence
  }
  
  public ConstrainedOnceSequence(@NotNull Sequence<? extends T> sequence)
  {
    sequenceRef = new AtomicReference(sequence);
  }
}

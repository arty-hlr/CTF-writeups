package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;












































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b!\030\0002\0020\001B\027\022\020\020\002\032\f\022\006\022\004\030\0010\004\030\0010\003¢\006\002\020\005R\024\020\006\032\0020\0078VX\004¢\006\006\032\004\b\b\020\t¨\006\n"}, d2={"Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "completion", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/coroutines/Continuation;)V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public abstract class RestrictedContinuationImpl
  extends BaseContinuationImpl
{
  @NotNull
  public CoroutineContext getContext()
  {
    return (CoroutineContext)EmptyCoroutineContext.INSTANCE;
  }
  
  /* Error */
  public RestrictedContinuationImpl(@org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<Object> completion)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 25	kotlin/coroutines/jvm/internal/BaseContinuationImpl:<init>	(Lkotlin/coroutines/Continuation;)V
    //   5: aload_1
    //   6: dup
    //   7: ifnull +54 -> 61
    //   10: astore_2
    //   11: aload_2
    //   12: astore_3
    //   13: aload_3
    //   14: invokeinterface 29 1 0
    //   19: getstatic 16	kotlin/coroutines/EmptyCoroutineContext:INSTANCE	Lkotlin/coroutines/EmptyCoroutineContext;
    //   22: if_acmpne +7 -> 29
    //   25: iconst_1
    //   26: goto +4 -> 30
    //   29: iconst_0
    //   30: istore 4
    //   32: iload 4
    //   34: ifne +23 -> 57
    //   37: ldc 31
    //   39: astore 5
    //   41: new 33	java/lang/IllegalArgumentException
    //   44: dup
    //   45: aload 5
    //   47: invokevirtual 39	java/lang/Object:toString	()Ljava/lang/String;
    //   50: invokespecial 42	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   53: checkcast 44	java/lang/Throwable
    //   56: athrow
    //   57: nop
    //   58: goto +4 -> 62
    //   61: pop
    //   62: return
    // Line number table:
    //   Java source line #80	-> byte code offset #0
    //   Java source line #82	-> byte code offset #1
    //   Java source line #84	-> byte code offset #5
    //   Java source line #85	-> byte code offset #13
    //   Java source line #86	-> byte code offset #37
    //   Java source line #85	-> byte code offset #39
    //   Java source line #88	-> byte code offset #57
    //   Java source line #84	-> byte code offset #58
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	this	RestrictedContinuationImpl
    //   0	63	1	completion	kotlin.coroutines.Continuation
    //   13	44	3	it	kotlin.coroutines.Continuation
    //   37	2	6	$i$a$1$require	int
    //   13	44	7	$i$a$1$let	int
  }
}

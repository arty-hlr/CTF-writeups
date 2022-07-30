package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;













































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\006\n\002\020\002\n\000\b!\030\0002\0020\001B\031\b\026\022\020\020\002\032\f\022\006\022\004\030\0010\004\030\0010\003¢\006\002\020\005B!\022\020\020\002\032\f\022\006\022\004\030\0010\004\030\0010\003\022\b\020\006\032\004\030\0010\007¢\006\002\020\bJ\016\020\f\032\n\022\006\022\004\030\0010\0040\003J\b\020\r\032\0020\016H\024R\020\020\006\032\004\030\0010\007X\004¢\006\002\n\000R\024\020\t\032\0020\0078VX\004¢\006\006\032\004\b\n\020\013R\030\020\f\032\f\022\006\022\004\030\0010\004\030\0010\003X\016¢\006\002\n\000¨\006\017"}, d2={"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "completion", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/coroutines/Continuation;)V", "_context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V", "context", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "intercepted", "releaseIntercepted", "", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public abstract class ContinuationImpl
  extends BaseContinuationImpl
{
  private transient Continuation<Object> intercepted;
  private final CoroutineContext _context;
  
  public ContinuationImpl(@Nullable Continuation<Object> completion, @Nullable CoroutineContext _context)
  {
    super(completion);this._context = _context;
  }
  
  @NotNull
  public CoroutineContext getContext() { CoroutineContext tmp4_1 = _context;
    






































































































    if (tmp4_1 == null) Intrinsics.throwNpe(); return tmp4_1;
  }
  






  protected void releaseIntercepted()
  {
    Continuation intercepted = this.intercepted;
    if ((intercepted != null) && (intercepted != (ContinuationImpl)this)) {
      CoroutineContext.Element tmp32_27 = getContext().get((CoroutineContext.Key)ContinuationInterceptor.Key);
      



















































































































      if (tmp32_27 == null) Intrinsics.throwNpe(); ((ContinuationInterceptor)tmp32_27).releaseInterceptedContinuation(intercepted);
    }
    this.intercepted = ((Continuation)CompletedContinuation.INSTANCE);
  }
  
  /* Error */
  @NotNull
  public final Continuation<Object> intercepted()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 30	kotlin/coroutines/jvm/internal/ContinuationImpl:intercepted	Lkotlin/coroutines/Continuation;
    //   4: dup
    //   5: ifnull +6 -> 11
    //   8: goto +56 -> 64
    //   11: pop
    //   12: aload_0
    //   13: invokevirtual 32	kotlin/coroutines/jvm/internal/ContinuationImpl:getContext	()Lkotlin/coroutines/CoroutineContext;
    //   16: getstatic 38	kotlin/coroutines/ContinuationInterceptor:Key	Lkotlin/coroutines/ContinuationInterceptor$Key;
    //   19: checkcast 40	kotlin/coroutines/CoroutineContext$Key
    //   22: invokeinterface 44 2 0
    //   27: checkcast 34	kotlin/coroutines/ContinuationInterceptor
    //   30: dup
    //   31: ifnull +19 -> 50
    //   34: aload_0
    //   35: checkcast 46	kotlin/coroutines/Continuation
    //   38: invokeinterface 50 2 0
    //   43: dup
    //   44: ifnull +6 -> 50
    //   47: goto +8 -> 55
    //   50: pop
    //   51: aload_0
    //   52: checkcast 46	kotlin/coroutines/Continuation
    //   55: astore_1
    //   56: aload_1
    //   57: astore_2
    //   58: aload_0
    //   59: aload_2
    //   60: putfield 30	kotlin/coroutines/jvm/internal/ContinuationImpl:intercepted	Lkotlin/coroutines/Continuation;
    //   63: aload_1
    //   64: areturn
    // Line number table:
    //   Java source line #110	-> byte code offset #0
    //   Java source line #111	-> byte code offset #12
    //   Java source line #112	-> byte code offset #12
    //   Java source line #111	-> byte code offset #12
    //   Java source line #112	-> byte code offset #56
    //   Java source line #112	-> byte code offset #58
    //   Java source line #112	-> byte code offset #63
    //   Java source line #112	-> byte code offset #64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	ContinuationImpl
    //   58	5	2	it	Continuation
    //   58	5	3	$i$a$1$also	int
  }
  
  /* Error */
  public ContinuationImpl(@Nullable Continuation<Object> completion)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_1
    //   3: dup
    //   4: ifnull +11 -> 15
    //   7: invokeinterface 75 1 0
    //   12: goto +5 -> 17
    //   15: pop
    //   16: aconst_null
    //   17: invokespecial 77	kotlin/coroutines/jvm/internal/ContinuationImpl:<init>	(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V
    //   20: return
    // Line number table:
    //   Java source line #101	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	21	0	this	ContinuationImpl
    //   0	21	1	completion	Continuation
  }
}

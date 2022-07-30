package kotlin.coroutines.experimental;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;













@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000B\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\004\n\002\020\000\n\002\b\004\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\016\n\000\b\000\030\0002\0020\001B\025\022\006\020\002\032\0020\001\022\006\020\003\032\0020\004¢\006\002\020\005J\020\020\n\032\0020\0132\006\020\003\032\0020\004H\002J\020\020\f\032\0020\0132\006\020\r\032\0020\000H\002J\023\020\016\032\0020\0132\b\020\017\032\004\030\0010\020H\002J5\020\021\032\002H\022\"\004\b\000\020\0222\006\020\023\032\002H\0222\030\020\024\032\024\022\004\022\002H\022\022\004\022\0020\004\022\004\022\002H\0220\025H\026¢\006\002\020\026J(\020\027\032\004\030\001H\030\"\b\b\000\020\030*\0020\0042\f\020\031\032\b\022\004\022\002H\0300\032H\002¢\006\002\020\033J\b\020\034\032\0020\035H\026J\024\020\036\032\0020\0012\n\020\031\032\006\022\002\b\0030\032H\026J\b\020\037\032\0020\035H\002J\b\020 \032\0020!H\026R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\006\020\007R\021\020\002\032\0020\001¢\006\b\n\000\032\004\b\b\020\t¨\006\""}, d2={"Lkotlin/coroutines/experimental/CombinedContext;", "Lkotlin/coroutines/experimental/CoroutineContext;", "left", "element", "Lkotlin/coroutines/experimental/CoroutineContext$Element;", "(Lkotlin/coroutines/experimental/CoroutineContext;Lkotlin/coroutines/experimental/CoroutineContext$Element;)V", "getElement", "()Lkotlin/coroutines/experimental/CoroutineContext$Element;", "getLeft", "()Lkotlin/coroutines/experimental/CoroutineContext;", "contains", "", "containsAll", "context", "equals", "other", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/experimental/CoroutineContext$Key;", "(Lkotlin/coroutines/experimental/CoroutineContext$Key;)Lkotlin/coroutines/experimental/CoroutineContext$Element;", "hashCode", "", "minusKey", "size", "toString", "", "kotlin-stdlib_coroutinesExperimental"})
public final class CombinedContext
  implements CoroutineContext
{
  @NotNull
  private final CoroutineContext left;
  @NotNull
  private final CoroutineContext.Element element;
  
  @NotNull
  public final CoroutineContext getLeft() { return left; } @NotNull
  public final CoroutineContext.Element getElement() { return element; } public CombinedContext(@NotNull CoroutineContext left, @NotNull CoroutineContext.Element element) { this.left = left;this.element = element; } @NotNull
  public CoroutineContext plus(@NotNull CoroutineContext context) { Intrinsics.checkParameterIsNotNull(context, "context");return CoroutineContext.DefaultImpls.plus(this, context);
  }
  










  public <R> R fold(R initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation)
  {
    Intrinsics.checkParameterIsNotNull(operation, "operation");return operation.invoke(left.fold(initial, operation), element);
  }
  








  private final int size()
  {
    return (left instanceof CombinedContext) ? ((CombinedContext)left).size() + 1 : 2;
  }
  
  private final boolean contains(CoroutineContext.Element element) { return Intrinsics.areEqual(get(element.getKey()), element); }
  
  private final boolean containsAll(CombinedContext context) {
    CombinedContext cur = context;
    for (;;) {
      if (!contains(element)) return false;
      CoroutineContext next = left;
      if ((next instanceof CombinedContext)) {
        cur = (CombinedContext)next;
      } else {
        CoroutineContext tmp37_36 = next;
        








































































        if (tmp37_36 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.CoroutineContext.Element"); return contains((CoroutineContext.Element)tmp37_36);
      }
    }
  }
  

  public boolean equals(@Nullable Object other) { return ((CombinedContext)this == other) || (((other instanceof CombinedContext)) && (((CombinedContext)other).size() == size()) && (((CombinedContext)other).containsAll(this))); }
  
  public int hashCode() { return left.hashCode() + element.hashCode(); }
  
  @NotNull
  public String toString()
  {
    return "[" + (String)fold("", (Function2)toString.1.INSTANCE) + "]";
  }
  
  /* Error */
  @Nullable
  public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 12
    //   3: invokestatic 18	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: checkcast 2	kotlin/coroutines/experimental/CombinedContext
    //   10: astore_2
    //   11: aload_2
    //   12: getfield 22	kotlin/coroutines/experimental/CombinedContext:element	Lkotlin/coroutines/experimental/CoroutineContext$Element;
    //   15: aload_1
    //   16: invokeinterface 26 2 0
    //   21: dup
    //   22: ifnull +10 -> 32
    //   25: astore_3
    //   26: aload_3
    //   27: astore 4
    //   29: aload 4
    //   31: areturn
    //   32: pop
    //   33: aload_2
    //   34: getfield 30	kotlin/coroutines/experimental/CombinedContext:left	Lkotlin/coroutines/experimental/CoroutineContext;
    //   37: astore_3
    //   38: aload_3
    //   39: instanceof 2
    //   42: ifeq +11 -> 53
    //   45: aload_3
    //   46: checkcast 2	kotlin/coroutines/experimental/CombinedContext
    //   49: astore_2
    //   50: goto +11 -> 61
    //   53: aload_3
    //   54: aload_1
    //   55: invokeinterface 31 2 0
    //   60: areturn
    //   61: goto -50 -> 11
    // Line number table:
    //   Java source line #35	-> byte code offset #6
    //   Java source line #36	-> byte code offset #11
    //   Java source line #37	-> byte code offset #11
    //   Java source line #37	-> byte code offset #29
    //   Java source line #37	-> byte code offset #32
    //   Java source line #38	-> byte code offset #33
    //   Java source line #39	-> byte code offset #38
    //   Java source line #40	-> byte code offset #45
    //   Java source line #42	-> byte code offset #53
    //   Java source line #43	-> byte code offset #61
    //   Java source line #36	-> byte code offset #61
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	CombinedContext
    //   0	64	1	key	CoroutineContext.Key
    //   11	53	2	cur	CombinedContext
    //   38	23	3	next	CoroutineContext
    //   29	3	4	it	CoroutineContext.Element
    //   29	3	5	$i$a$1$let	int
  }
  
  /* Error */
  @NotNull
  public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 12
    //   3: invokestatic 18	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: getfield 22	kotlin/coroutines/experimental/CombinedContext:element	Lkotlin/coroutines/experimental/CoroutineContext$Element;
    //   10: aload_1
    //   11: invokeinterface 26 2 0
    //   16: dup
    //   17: ifnull +11 -> 28
    //   20: astore_2
    //   21: aload_2
    //   22: astore_3
    //   23: aload_0
    //   24: getfield 30	kotlin/coroutines/experimental/CombinedContext:left	Lkotlin/coroutines/experimental/CoroutineContext;
    //   27: areturn
    //   28: pop
    //   29: aload_0
    //   30: getfield 30	kotlin/coroutines/experimental/CombinedContext:left	Lkotlin/coroutines/experimental/CoroutineContext;
    //   33: aload_1
    //   34: invokeinterface 58 2 0
    //   39: astore_2
    //   40: aload_2
    //   41: aload_0
    //   42: getfield 30	kotlin/coroutines/experimental/CombinedContext:left	Lkotlin/coroutines/experimental/CoroutineContext;
    //   45: if_acmpne +10 -> 55
    //   48: aload_0
    //   49: checkcast 6	kotlin/coroutines/experimental/CoroutineContext
    //   52: goto +35 -> 87
    //   55: aload_2
    //   56: getstatic 64	kotlin/coroutines/experimental/EmptyCoroutineContext:INSTANCE	Lkotlin/coroutines/experimental/EmptyCoroutineContext;
    //   59: if_acmpne +13 -> 72
    //   62: aload_0
    //   63: getfield 22	kotlin/coroutines/experimental/CombinedContext:element	Lkotlin/coroutines/experimental/CoroutineContext$Element;
    //   66: checkcast 6	kotlin/coroutines/experimental/CoroutineContext
    //   69: goto +18 -> 87
    //   72: new 2	kotlin/coroutines/experimental/CombinedContext
    //   75: dup
    //   76: aload_2
    //   77: aload_0
    //   78: getfield 22	kotlin/coroutines/experimental/CombinedContext:element	Lkotlin/coroutines/experimental/CoroutineContext$Element;
    //   81: invokespecial 68	kotlin/coroutines/experimental/CombinedContext:<init>	(Lkotlin/coroutines/experimental/CoroutineContext;Lkotlin/coroutines/experimental/CoroutineContext$Element;)V
    //   84: checkcast 6	kotlin/coroutines/experimental/CoroutineContext
    //   87: areturn
    // Line number table:
    //   Java source line #51	-> byte code offset #6
    //   Java source line #51	-> byte code offset #23
    //   Java source line #51	-> byte code offset #28
    //   Java source line #52	-> byte code offset #29
    //   Java source line #53	-> byte code offset #40
    //   Java source line #54	-> byte code offset #40
    //   Java source line #55	-> byte code offset #55
    //   Java source line #56	-> byte code offset #72
    //   Java source line #53	-> byte code offset #87
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	CombinedContext
    //   0	88	1	key	CoroutineContext.Key
    //   40	48	2	newLeft	CoroutineContext
    //   23	5	3	it	CoroutineContext.Element
    //   23	5	4	$i$a$1$let	int
  }
}

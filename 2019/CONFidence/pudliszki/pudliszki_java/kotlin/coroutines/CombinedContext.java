package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;














@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000L\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\004\n\002\020\000\n\002\b\004\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\003\b\001\030\0002\0020\0012\0060\002j\002`\003:\001!B\025\022\006\020\004\032\0020\001\022\006\020\005\032\0020\006¢\006\002\020\007J\020\020\b\032\0020\t2\006\020\005\032\0020\006H\002J\020\020\n\032\0020\t2\006\020\013\032\0020\000H\002J\023\020\f\032\0020\t2\b\020\r\032\004\030\0010\016H\002J5\020\017\032\002H\020\"\004\b\000\020\0202\006\020\021\032\002H\0202\030\020\022\032\024\022\004\022\002H\020\022\004\022\0020\006\022\004\022\002H\0200\023H\026¢\006\002\020\024J(\020\025\032\004\030\001H\026\"\b\b\000\020\026*\0020\0062\f\020\027\032\b\022\004\022\002H\0260\030H\002¢\006\002\020\031J\b\020\032\032\0020\033H\026J\024\020\034\032\0020\0012\n\020\027\032\006\022\002\b\0030\030H\026J\b\020\035\032\0020\033H\002J\b\020\036\032\0020\037H\026J\b\020 \032\0020\016H\002R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\004\032\0020\001X\004¢\006\002\n\000¨\006\""}, d2={"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "contains", "", "containsAll", "context", "equals", "other", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "hashCode", "", "minusKey", "size", "toString", "", "writeReplace", "Serialized", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public final class CombinedContext
  implements CoroutineContext, Serializable
{
  private final CoroutineContext left;
  private final CoroutineContext.Element element;
  
  public CombinedContext(@NotNull CoroutineContext left, @NotNull CoroutineContext.Element element)
  {
    this.left = left;this.element = element; } @NotNull
  public CoroutineContext plus(@NotNull CoroutineContext context) { Intrinsics.checkParameterIsNotNull(context, "context");return CoroutineContext.DefaultImpls.plus(this, context);
  }
  














  public <R> R fold(R initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation)
  {
    Intrinsics.checkParameterIsNotNull(operation, "operation");return operation.invoke(left.fold(initial, operation), element);
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
        























































































        if (tmp37_36 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"); return contains((CoroutineContext.Element)tmp37_36);
      }
    }
  }
  

  public boolean equals(@Nullable Object other) { return ((CombinedContext)this == other) || (((other instanceof CombinedContext)) && (((CombinedContext)other).size() == size()) && (((CombinedContext)other).containsAll(this))); }
  
  public int hashCode() { return left.hashCode() + element.hashCode(); }
  


  @NotNull
  public String toString() { return "[" + (String)fold("", (Function2)toString.1.INSTANCE) + "]"; }
  
  private final Object writeReplace() {
    int n = size();
    CoroutineContext[] elements = new CoroutineContext[n];
    Ref.IntRef localIntRef1 = new Ref.IntRef();element = 0;
    final Ref.IntRef index; fold(Unit.INSTANCE, (Function2)new Lambda(elements) { public final void invoke(@NotNull Unit $noName_0, @NotNull CoroutineContext.Element element) { Intrinsics.checkParameterIsNotNull($noName_0, "<anonymous parameter 0>");Intrinsics.checkParameterIsNotNull(element, "element");int i = tmp24_21;$elements[i] = ((CoroutineContext)element); } });
    int i = element == n ? 1 : 0; if (i == 0) { String str = "Check failed.";throw ((Throwable)new IllegalStateException(str.toString()));
    }
    return new Serialized(elements);
  }
  
  /* Error */
  @Nullable
  public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 17
    //   3: invokestatic 23	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: checkcast 2	kotlin/coroutines/CombinedContext
    //   10: astore_2
    //   11: aload_2
    //   12: getfield 27	kotlin/coroutines/CombinedContext:element	Lkotlin/coroutines/CoroutineContext$Element;
    //   15: aload_1
    //   16: invokeinterface 31 2 0
    //   21: dup
    //   22: ifnull +10 -> 32
    //   25: astore_3
    //   26: aload_3
    //   27: astore 4
    //   29: aload 4
    //   31: areturn
    //   32: pop
    //   33: aload_2
    //   34: getfield 35	kotlin/coroutines/CombinedContext:left	Lkotlin/coroutines/CoroutineContext;
    //   37: astore_3
    //   38: aload_3
    //   39: instanceof 2
    //   42: ifeq +11 -> 53
    //   45: aload_3
    //   46: checkcast 2	kotlin/coroutines/CombinedContext
    //   49: astore_2
    //   50: goto +11 -> 61
    //   53: aload_3
    //   54: aload_1
    //   55: invokeinterface 36 2 0
    //   60: areturn
    //   61: goto -50 -> 11
    // Line number table:
    //   Java source line #44	-> byte code offset #6
    //   Java source line #45	-> byte code offset #11
    //   Java source line #46	-> byte code offset #11
    //   Java source line #46	-> byte code offset #29
    //   Java source line #46	-> byte code offset #32
    //   Java source line #47	-> byte code offset #33
    //   Java source line #48	-> byte code offset #38
    //   Java source line #49	-> byte code offset #45
    //   Java source line #51	-> byte code offset #53
    //   Java source line #52	-> byte code offset #61
    //   Java source line #45	-> byte code offset #61
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
    //   1: ldc 17
    //   3: invokestatic 23	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: getfield 27	kotlin/coroutines/CombinedContext:element	Lkotlin/coroutines/CoroutineContext$Element;
    //   10: aload_1
    //   11: invokeinterface 31 2 0
    //   16: dup
    //   17: ifnull +11 -> 28
    //   20: astore_2
    //   21: aload_2
    //   22: astore_3
    //   23: aload_0
    //   24: getfield 35	kotlin/coroutines/CombinedContext:left	Lkotlin/coroutines/CoroutineContext;
    //   27: areturn
    //   28: pop
    //   29: aload_0
    //   30: getfield 35	kotlin/coroutines/CombinedContext:left	Lkotlin/coroutines/CoroutineContext;
    //   33: aload_1
    //   34: invokeinterface 63 2 0
    //   39: astore_2
    //   40: aload_2
    //   41: aload_0
    //   42: getfield 35	kotlin/coroutines/CombinedContext:left	Lkotlin/coroutines/CoroutineContext;
    //   45: if_acmpne +10 -> 55
    //   48: aload_0
    //   49: checkcast 6	kotlin/coroutines/CoroutineContext
    //   52: goto +35 -> 87
    //   55: aload_2
    //   56: getstatic 69	kotlin/coroutines/EmptyCoroutineContext:INSTANCE	Lkotlin/coroutines/EmptyCoroutineContext;
    //   59: if_acmpne +13 -> 72
    //   62: aload_0
    //   63: getfield 27	kotlin/coroutines/CombinedContext:element	Lkotlin/coroutines/CoroutineContext$Element;
    //   66: checkcast 6	kotlin/coroutines/CoroutineContext
    //   69: goto +18 -> 87
    //   72: new 2	kotlin/coroutines/CombinedContext
    //   75: dup
    //   76: aload_2
    //   77: aload_0
    //   78: getfield 27	kotlin/coroutines/CombinedContext:element	Lkotlin/coroutines/CoroutineContext$Element;
    //   81: invokespecial 73	kotlin/coroutines/CombinedContext:<init>	(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V
    //   84: checkcast 6	kotlin/coroutines/CoroutineContext
    //   87: areturn
    // Line number table:
    //   Java source line #60	-> byte code offset #6
    //   Java source line #60	-> byte code offset #23
    //   Java source line #60	-> byte code offset #28
    //   Java source line #61	-> byte code offset #29
    //   Java source line #62	-> byte code offset #40
    //   Java source line #63	-> byte code offset #40
    //   Java source line #64	-> byte code offset #55
    //   Java source line #65	-> byte code offset #72
    //   Java source line #62	-> byte code offset #87
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	CombinedContext
    //   0	88	1	key	CoroutineContext.Key
    //   40	48	2	newLeft	CoroutineContext
    //   23	5	3	it	CoroutineContext.Element
    //   23	5	4	$i$a$1$let	int
  }
  
  /* Error */
  private final int size()
  {
    // Byte code:
    //   0: aload_0
    //   1: checkcast 2	kotlin/coroutines/CombinedContext
    //   4: astore_1
    //   5: iconst_2
    //   6: istore_2
    //   7: aload_1
    //   8: getfield 35	kotlin/coroutines/CombinedContext:left	Lkotlin/coroutines/CoroutineContext;
    //   11: dup
    //   12: instanceof 2
    //   15: ifne +5 -> 20
    //   18: pop
    //   19: aconst_null
    //   20: checkcast 2	kotlin/coroutines/CombinedContext
    //   23: dup
    //   24: ifnull +6 -> 30
    //   27: goto +6 -> 33
    //   30: pop
    //   31: iload_2
    //   32: ireturn
    //   33: astore_1
    //   34: iinc 2 1
    //   37: goto -30 -> 7
    // Line number table:
    //   Java source line #70	-> byte code offset #0
    //   Java source line #71	-> byte code offset #5
    //   Java source line #72	-> byte code offset #7
    //   Java source line #73	-> byte code offset #7
    //   Java source line #74	-> byte code offset #34
    //   Java source line #72	-> byte code offset #37
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	this	CombinedContext
    //   5	35	1	cur	CombinedContext
    //   7	33	2	size	int
  }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\005\n\002\020\000\n\002\b\002\b\002\030\000 \f2\0060\001j\002`\002:\001\fB\023\022\f\020\003\032\b\022\004\022\0020\0050\004¢\006\002\020\006J\b\020\n\032\0020\013H\002R\031\020\003\032\b\022\004\022\0020\0050\004¢\006\n\n\002\020\t\032\004\b\007\020\b¨\006\r"}, d2={"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", "", "Lkotlin/coroutines/CoroutineContext;", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", "", "Companion", "kotlin-stdlib"})
  private static final class Serialized
    implements Serializable
  {
    @NotNull
    private final CoroutineContext[] elements;
    private static final long serialVersionUID = 0L;
    public static final Companion Companion = new Companion(null);
    
    public Serialized(@NotNull CoroutineContext[] elements) { this.elements = elements; } @NotNull
    public final CoroutineContext[] getElements() { return elements; }
    

    private final Object readResolve()
    {
      CoroutineContext[] arrayOfCoroutineContext = elements;Object initial$iv = EmptyCoroutineContext.INSTANCE;
      
      int $i$f$fold;
      Object[] $receiver$iv;
      Object accumulator$iv = initial$iv;
      for (Object element$iv : $receiver$iv) { Object localObject1 = element$iv;CoroutineContext p1 = (CoroutineContext)accumulator$iv;
        int $i$a$1$unknown;
        CoroutineContext p2;
        accumulator$iv = 
        



          p1.plus(p2);
      }
      return 
      




        accumulator$iv;
    }
    
    @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\t\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000¨\006\005"}, d2={"Lkotlin/coroutines/CombinedContext$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"})
    public static final class Companion
    {
      private Companion() {}
    }
  }
}

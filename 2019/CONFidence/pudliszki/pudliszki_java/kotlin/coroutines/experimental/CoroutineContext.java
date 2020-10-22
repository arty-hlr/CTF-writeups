package kotlin.coroutines.experimental;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000 \n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\007\bg\030\0002\0020\001:\002\021\022J5\020\002\032\002H\003\"\004\b\000\020\0032\006\020\004\032\002H\0032\030\020\005\032\024\022\004\022\002H\003\022\004\022\0020\007\022\004\022\002H\0030\006H&¢\006\002\020\bJ(\020\t\032\004\030\001H\n\"\b\b\000\020\n*\0020\0072\f\020\013\032\b\022\004\022\002H\n0\fH¦\002¢\006\002\020\rJ\024\020\016\032\0020\0002\n\020\013\032\006\022\002\b\0030\fH&J\021\020\017\032\0020\0002\006\020\020\032\0020\000H\002¨\006\023"}, d2={"Lkotlin/coroutines/experimental/CoroutineContext;", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/experimental/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/experimental/CoroutineContext$Key;", "(Lkotlin/coroutines/experimental/CoroutineContext$Key;)Lkotlin/coroutines/experimental/CoroutineContext$Element;", "minusKey", "plus", "context", "Element", "Key", "kotlin-stdlib_coroutinesExperimental"})
@SinceKotlin(version="1.1")
public abstract interface CoroutineContext
{
  @Nullable
  public abstract <E extends Element> E get(@NotNull Key<E> paramKey);
  
  public abstract <R> R fold(R paramR, @NotNull Function2<? super R, ? super Element, ? extends R> paramFunction2);
  
  @NotNull
  public abstract CoroutineContext plus(@NotNull CoroutineContext paramCoroutineContext);
  
  @NotNull
  public abstract CoroutineContext minusKey(@NotNull Key<?> paramKey);
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3)
  public static final class DefaultImpls
  {
    @NotNull
    public static CoroutineContext plus(CoroutineContext $this, @NotNull CoroutineContext context)
    {
      Intrinsics.checkParameterIsNotNull(context, "context");
      










      return context == EmptyCoroutineContext.INSTANCE ? $this : (CoroutineContext)context.fold($this, (Function2)CoroutineContext.plus.1.INSTANCE);
    } }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\020\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\000\bf\030\000*\b\b\000\020\001*\0020\0022\0020\003¨\006\004"}, d2={"Lkotlin/coroutines/experimental/CoroutineContext$Key;", "E", "Lkotlin/coroutines/experimental/CoroutineContext$Element;", "", "kotlin-stdlib_coroutinesExperimental"})
  public static abstract interface Key<E extends CoroutineContext.Element> {}
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\006\bf\030\0002\0020\001J5\020\006\032\002H\007\"\004\b\000\020\0072\006\020\b\032\002H\0072\030\020\t\032\024\022\004\022\002H\007\022\004\022\0020\000\022\004\022\002H\0070\nH\026¢\006\002\020\013J(\020\f\032\004\030\001H\r\"\b\b\000\020\r*\0020\0002\f\020\002\032\b\022\004\022\002H\r0\003H\002¢\006\002\020\016J\024\020\017\032\0020\0012\n\020\002\032\006\022\002\b\0030\003H\026R\026\020\002\032\006\022\002\b\0030\003X¦\004¢\006\006\032\004\b\004\020\005¨\006\020"}, d2={"Lkotlin/coroutines/experimental/CoroutineContext$Element;", "Lkotlin/coroutines/experimental/CoroutineContext;", "key", "Lkotlin/coroutines/experimental/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/experimental/CoroutineContext$Key;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "(Lkotlin/coroutines/experimental/CoroutineContext$Key;)Lkotlin/coroutines/experimental/CoroutineContext$Element;", "minusKey", "kotlin-stdlib_coroutinesExperimental"})
  public static abstract interface Element extends CoroutineContext { @NotNull
    public abstract CoroutineContext.Key<?> getKey();
    
    @Nullable
    public abstract <E extends Element> E get(@NotNull CoroutineContext.Key<E> paramKey);
    
    public abstract <R> R fold(R paramR, @NotNull Function2<? super R, ? super Element, ? extends R> paramFunction2);
    
    @NotNull
    public abstract CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> paramKey);
    
    @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3)
    public static final class DefaultImpls { @Nullable
      public static <E extends CoroutineContext.Element> E get(CoroutineContext.Element $this, @NotNull CoroutineContext.Key<E> key) { Intrinsics.checkParameterIsNotNull(key, "key"); if ($this.getKey() == key) { if ($this != null) break label35; throw new TypeCastException("null cannot be cast to non-null type E");throw $this; } label35: return null;
      }
      
      public static <R> R fold(CoroutineContext.Element $this, R initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) { Intrinsics.checkParameterIsNotNull(operation, "operation");return operation.invoke(initial, $this); }
      
      @NotNull
      public static CoroutineContext minusKey(CoroutineContext.Element $this, @NotNull CoroutineContext.Key<?> key) { Intrinsics.checkParameterIsNotNull(key, "key");return $this.getKey() == key ? (CoroutineContext)EmptyCoroutineContext.INSTANCE : (CoroutineContext)$this;
      }
      
      @NotNull
      public static CoroutineContext plus(CoroutineContext.Element $this, @NotNull CoroutineContext context)
      {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return CoroutineContext.DefaultImpls.plus((CoroutineContext)$this, context);
      }
    }
  }
}

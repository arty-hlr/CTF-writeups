package kotlin.coroutines;

import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000*\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\002\b\002\bg\030\000 \0172\0020\001:\001\017J(\020\002\032\004\030\001H\003\"\b\b\000\020\003*\0020\0012\f\020\004\032\b\022\004\022\002H\0030\005H\002¢\006\002\020\006J\"\020\007\032\b\022\004\022\002H\t0\b\"\004\b\000\020\t2\f\020\n\032\b\022\004\022\002H\t0\bH&J\024\020\013\032\0020\f2\n\020\004\032\006\022\002\b\0030\005H\026J\024\020\r\032\0020\0162\n\020\n\032\006\022\002\b\0030\bH\026¨\006\020"}, d2={"Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/CoroutineContext$Element;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "releaseInterceptedContinuation", "", "Key", "kotlin-stdlib"})
@kotlin.SinceKotlin(version="1.3")
public abstract interface ContinuationInterceptor extends CoroutineContext.Element {
  public static final Key Key = Key.$$INSTANCE;
  
  @NotNull
  public abstract <T> Continuation<T> interceptContinuation(@NotNull Continuation<? super T> paramContinuation);
  
  public abstract void releaseInterceptedContinuation(@NotNull Continuation<?> paramContinuation);
  
  @kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2={"Lkotlin/coroutines/ContinuationInterceptor$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlin/coroutines/ContinuationInterceptor;", "()V", "kotlin-stdlib"})
  public static final class Key implements CoroutineContext.Key<ContinuationInterceptor> { private Key() {}
    
    static { Key localKey = new Key();$$INSTANCE = localKey;
    }
  }
  




  @org.jetbrains.annotations.Nullable
  public abstract <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> paramKey);
  




  @NotNull
  public abstract CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> paramKey);
  



  @kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3)
  public static final class DefaultImpls
  {
    public static void releaseInterceptedContinuation(ContinuationInterceptor $this, @NotNull Continuation<?> continuation)
    {
      kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(continuation, "continuation");
    }
    
    @org.jetbrains.annotations.Nullable
    public static <E extends CoroutineContext.Element> E get(ContinuationInterceptor $this, @NotNull CoroutineContext.Key<E> key) {
      kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key"); if ($this == null) throw new kotlin.TypeCastException("null cannot be cast to non-null type E"); return key == ContinuationInterceptor.Key ? (CoroutineContext.Element)$this : null;
    }
    
    @NotNull
    public static CoroutineContext minusKey(ContinuationInterceptor $this, @NotNull CoroutineContext.Key<?> key) { kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");return key == ContinuationInterceptor.Key ? (CoroutineContext)EmptyCoroutineContext.INSTANCE : (CoroutineContext)$this;
    }
    
    public static <R> R fold(ContinuationInterceptor $this, R initial, @NotNull kotlin.jvm.functions.Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation)
    {
      kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(operation, "operation");
      return CoroutineContext.Element.DefaultImpls.fold((CoroutineContext.Element)$this, initial, operation);
    }
    
    @NotNull
    public static CoroutineContext plus(ContinuationInterceptor $this, @NotNull CoroutineContext context)
    {
      kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
      return CoroutineContext.Element.DefaultImpls.plus((CoroutineContext.Element)$this, context);
    }
  }
}

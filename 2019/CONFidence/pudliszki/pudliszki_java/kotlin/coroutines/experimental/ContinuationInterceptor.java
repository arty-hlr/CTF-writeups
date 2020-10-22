package kotlin.coroutines.experimental;

import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\bg\030\000 \0062\0020\001:\001\006J\"\020\002\032\b\022\004\022\002H\0040\003\"\004\b\000\020\0042\f\020\005\032\b\022\004\022\002H\0040\003H&¨\006\007"}, d2={"Lkotlin/coroutines/experimental/ContinuationInterceptor;", "Lkotlin/coroutines/experimental/CoroutineContext$Element;", "interceptContinuation", "Lkotlin/coroutines/experimental/Continuation;", "T", "continuation", "Key", "kotlin-stdlib_coroutinesExperimental"})
@kotlin.SinceKotlin(version="1.1")
public abstract interface ContinuationInterceptor extends CoroutineContext.Element { @kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3)
  public static final class DefaultImpls { @org.jetbrains.annotations.Nullable
    public static <E extends CoroutineContext.Element> E get(ContinuationInterceptor $this, @NotNull CoroutineContext.Key<E> key) { kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
      return CoroutineContext.Element.DefaultImpls.get((CoroutineContext.Element)$this, key); }
    
    public static <R> R fold(ContinuationInterceptor $this, R initial, @NotNull kotlin.jvm.functions.Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) { kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(operation, "operation");
      return CoroutineContext.Element.DefaultImpls.fold((CoroutineContext.Element)$this, initial, operation); }
    @NotNull
    public static CoroutineContext minusKey(ContinuationInterceptor $this, @NotNull CoroutineContext.Key<?> key) { kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
      return CoroutineContext.Element.DefaultImpls.minusKey((CoroutineContext.Element)$this, key); }
    @NotNull
    public static CoroutineContext plus(ContinuationInterceptor $this, @NotNull CoroutineContext context) { kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
      return CoroutineContext.Element.DefaultImpls.plus((CoroutineContext.Element)$this, context); } }
  @kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2={"Lkotlin/coroutines/experimental/ContinuationInterceptor$Key;", "Lkotlin/coroutines/experimental/CoroutineContext$Key;", "Lkotlin/coroutines/experimental/ContinuationInterceptor;", "()V", "kotlin-stdlib_coroutinesExperimental"})
  public static final class Key implements CoroutineContext.Key<ContinuationInterceptor> { private Key() {}
    static { Key localKey = new Key();$$INSTANCE = localKey;
    }
  }
  
  public static final Key Key = Key.$$INSTANCE;
  @NotNull
  public abstract <T> Continuation<T> interceptContinuation(@NotNull Continuation<? super T> paramContinuation);
}

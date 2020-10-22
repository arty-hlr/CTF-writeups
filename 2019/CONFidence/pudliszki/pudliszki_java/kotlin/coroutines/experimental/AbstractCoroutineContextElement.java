package kotlin.coroutines.experimental;

import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b'\030\0002\0020\001B\021\022\n\020\002\032\006\022\002\b\0030\003¢\006\002\020\004R\030\020\002\032\006\022\002\b\0030\003X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2={"Lkotlin/coroutines/experimental/AbstractCoroutineContextElement;", "Lkotlin/coroutines/experimental/CoroutineContext$Element;", "key", "Lkotlin/coroutines/experimental/CoroutineContext$Key;", "(Lkotlin/coroutines/experimental/CoroutineContext$Key;)V", "getKey", "()Lkotlin/coroutines/experimental/CoroutineContext$Key;", "kotlin-stdlib_coroutinesExperimental"})
@kotlin.SinceKotlin(version="1.1")
public abstract class AbstractCoroutineContextElement implements CoroutineContext.Element
{
  @NotNull
  private final CoroutineContext.Key<?> key;
  
  @NotNull
  public CoroutineContext plus(@NotNull CoroutineContext context) {
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");return CoroutineContext.Element.DefaultImpls.plus(this, context); } @NotNull
  public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) { kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");return CoroutineContext.Element.DefaultImpls.minusKey(this, key); } public <R> R fold(R initial, @NotNull kotlin.jvm.functions.Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) { kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(operation, "operation");return CoroutineContext.Element.DefaultImpls.fold(this, initial, operation); } @org.jetbrains.annotations.Nullable
  public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) { kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");return CoroutineContext.Element.DefaultImpls.get(this, key); } public AbstractCoroutineContextElement(@NotNull CoroutineContext.Key<?> key) { this.key = key; } @NotNull
  public CoroutineContext.Key<?> getKey() { return key; }
}

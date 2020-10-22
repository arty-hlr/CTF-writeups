package kotlin.coroutines.experimental.migration;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.experimental.CoroutineContext;
import org.jetbrains.annotations.NotNull;











































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\002\030\000 \0072\0020\001:\001\007B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\b"}, d2={"Lkotlin/coroutines/experimental/migration/ContextMigration;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "context", "Lkotlin/coroutines/experimental/CoroutineContext;", "(Lkotlin/coroutines/experimental/CoroutineContext;)V", "getContext", "()Lkotlin/coroutines/experimental/CoroutineContext;", "Key", "kotlin-stdlib_coroutinesExperimental"})
final class ContextMigration
  extends AbstractCoroutineContextElement
{
  @NotNull
  private final CoroutineContext context;
  public static final Key Key = new Key(null);
  
  public ContextMigration(@NotNull CoroutineContext context)
  {
    super((CoroutineContext.Key)Key);this.context = context; } @NotNull
  public final CoroutineContext getContext() { return context; }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2={"Lkotlin/coroutines/experimental/migration/ContextMigration$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlin/coroutines/experimental/migration/ContextMigration;", "()V", "kotlin-stdlib_coroutinesExperimental"})
  public static final class Key
    implements CoroutineContext.Key<ContextMigration>
  {
    private Key() {}
  }
}

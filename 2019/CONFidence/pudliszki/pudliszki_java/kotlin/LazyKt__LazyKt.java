package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;





















@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\030\n\000\n\002\030\002\n\002\b\005\n\002\020\000\n\000\n\002\030\002\n\002\b\002\032\037\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\002¢\006\002\020\004\0324\020\005\032\002H\002\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\b\020\006\032\004\030\0010\0072\n\020\b\032\006\022\002\b\0030\tH\n¢\006\002\020\n¨\006\013"}, d2={"lazyOf", "Lkotlin/Lazy;", "T", "value", "(Ljava/lang/Object;)Lkotlin/Lazy;", "getValue", "thisRef", "", "property", "Lkotlin/reflect/KProperty;", "(Lkotlin/Lazy;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "kotlin-stdlib"}, xs="kotlin/LazyKt")
class LazyKt__LazyKt
  extends LazyKt__LazyJVMKt
{
  @NotNull
  public static final <T> Lazy<T> lazyOf(T value)
  {
    return (Lazy)new InitializedLazyImpl(value);
  }
  

  @InlineOnly
  private static final <T> T getValue(@NotNull Lazy<? extends T> $receiver, Object thisRef, KProperty<?> property)
  {
    ;
    
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.getValue();
  }
  
  public LazyKt__LazyKt() {}
}

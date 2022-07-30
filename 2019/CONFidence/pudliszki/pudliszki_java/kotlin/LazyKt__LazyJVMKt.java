package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;








@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\034\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\032 \020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\f\020\003\032\b\022\004\022\002H\0020\004\032*\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\b\020\005\032\004\030\0010\0062\f\020\003\032\b\022\004\022\002H\0020\004\032(\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\006\020\007\032\0020\b2\f\020\003\032\b\022\004\022\002H\0020\004¨\006\t"}, d2={"lazy", "Lkotlin/Lazy;", "T", "initializer", "Lkotlin/Function0;", "lock", "", "mode", "Lkotlin/LazyThreadSafetyMode;", "kotlin-stdlib"}, xs="kotlin/LazyKt")
class LazyKt__LazyJVMKt
{
  @NotNull
  public static final <T> Lazy<T> lazy(@NotNull Function0<? extends T> initializer)
  {
    Intrinsics.checkParameterIsNotNull(initializer, "initializer");return (Lazy)new SynchronizedLazyImpl(initializer, null, 2, null);
  }
  







  @NotNull
  public static final <T> Lazy<T> lazy(@NotNull LazyThreadSafetyMode mode, @NotNull Function0<? extends T> initializer)
  {
    Intrinsics.checkParameterIsNotNull(mode, "mode");Intrinsics.checkParameterIsNotNull(initializer, "initializer"); switch (LazyKt.WhenMappings.$EnumSwitchMapping$0[mode.ordinal()]) {
    case 1:  new SynchronizedLazyImpl(initializer, null, 2, null); break;
    case 2:  new SafePublicationLazyImpl(initializer); break;
    case 3:  break; default:  throw new NoWhenBranchMatchedException(); }
    return (Lazy)new UnsafeLazyImpl(initializer);
  }
  







  @NotNull
  public static final <T> Lazy<T> lazy(@Nullable Object lock, @NotNull Function0<? extends T> initializer)
  {
    Intrinsics.checkParameterIsNotNull(initializer, "initializer");return (Lazy)new SynchronizedLazyImpl(initializer, lock);
  }
  
  public LazyKt__LazyJVMKt() {}
}

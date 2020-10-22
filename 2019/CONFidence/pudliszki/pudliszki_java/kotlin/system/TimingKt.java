package kotlin.system;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\024\n\000\n\002\020\t\n\000\n\002\030\002\n\002\020\002\n\002\b\002\032\027\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\b\032\027\020\005\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\b¨\006\006"}, d2={"measureNanoTime", "", "block", "Lkotlin/Function0;", "", "measureTimeMillis", "kotlin-stdlib"})
@kotlin.jvm.JvmName(name="TimingKt")
public final class TimingKt
{
  public static final long measureTimeMillis(@org.jetbrains.annotations.NotNull Function0<Unit> block)
  {
    ;
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");long start = System.currentTimeMillis();
    block.invoke();
    return System.currentTimeMillis() - start;
  }
  

  public static final long measureNanoTime(@org.jetbrains.annotations.NotNull Function0<Unit> block)
  {
    ;
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");long start = System.nanoTime();
    block.invoke();
    return System.nanoTime() - start;
  }
}

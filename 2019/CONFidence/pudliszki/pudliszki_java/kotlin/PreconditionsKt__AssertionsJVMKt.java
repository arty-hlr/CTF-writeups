package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;











@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\030\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020\000\n\000\032\021\020\000\032\0020\0012\006\020\002\032\0020\003H\b\032\037\020\000\032\0020\0012\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\005H\b¨\006\007"}, d2={"assert", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "kotlin-stdlib"}, xs="kotlin/PreconditionsKt")
class PreconditionsKt__AssertionsJVMKt
{
  @InlineOnly
  private static final void jdMethod_assert(boolean value)
  {
    ;
    if ((_Assertions.ENABLED) && (!value)) { int $i$a$1$assert; String str = "Assertion failed";throw ((Throwable)new AssertionError(str));
    }
  }
  

  @InlineOnly
  private static final void jdMethod_assert(boolean value, Function0<? extends Object> lazyMessage)
  {
    ;
    if ((_Assertions.ENABLED) && 
      (!value)) {
      Object message = lazyMessage.invoke();
      throw ((Throwable)new AssertionError(message));
    }
  }
  
  public PreconditionsKt__AssertionsJVMKt() {}
}

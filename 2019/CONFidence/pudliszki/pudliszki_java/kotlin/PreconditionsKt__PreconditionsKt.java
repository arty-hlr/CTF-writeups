package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;










@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\"\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020\000\n\002\b\005\n\002\020\001\n\002\b\004\032\034\020\000\032\0020\0012\006\020\002\032\0020\003H\b\002\b\n\006\b\000\032\002\020\001\032*\020\000\032\0020\0012\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\005H\b\002\b\n\006\b\000\032\002\020\001\032/\020\007\032\002H\b\"\b\b\000\020\b*\0020\0062\b\020\002\032\004\030\001H\bH\b\002\n\n\b\b\000\032\004\b\003\020\001¢\006\002\020\t\032=\020\007\032\002H\b\"\b\b\000\020\b*\0020\0062\b\020\002\032\004\030\001H\b2\f\020\004\032\b\022\004\022\0020\0060\005H\b\002\n\n\b\b\000\032\004\b\003\020\001¢\006\002\020\n\032\021\020\013\032\0020\f2\006\020\r\032\0020\006H\b\032\034\020\016\032\0020\0012\006\020\002\032\0020\003H\b\002\b\n\006\b\000\032\002\020\001\032*\020\016\032\0020\0012\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\005H\b\002\b\n\006\b\000\032\002\020\001\032/\020\017\032\002H\b\"\b\b\000\020\b*\0020\0062\b\020\002\032\004\030\001H\bH\b\002\n\n\b\b\000\032\004\b\003\020\001¢\006\002\020\t\032=\020\017\032\002H\b\"\b\b\000\020\b*\0020\0062\b\020\002\032\004\030\001H\b2\f\020\004\032\b\022\004\022\0020\0060\005H\b\002\n\n\b\b\000\032\004\b\003\020\001¢\006\002\020\n¨\006\020"}, d2={"check", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "checkNotNull", "T", "(Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "error", "", "message", "require", "requireNotNull", "kotlin-stdlib"}, xs="kotlin/PreconditionsKt")
class PreconditionsKt__PreconditionsKt
  extends PreconditionsKt__AssertionsJVMKt
{
  @InlineOnly
  private static final void require(boolean value)
  {
    ;
    if (!value) { int $i$a$2$require; String str = "Failed requirement.";throw ((Throwable)new IllegalArgumentException(str.toString()));
    }
  }
  



  @InlineOnly
  private static final void require(boolean value, Function0<? extends Object> lazyMessage)
  {
    ;
    

    if (!value) {
      Object message = lazyMessage.invoke();
      throw ((Throwable)new IllegalArgumentException(message.toString()));
    }
  }
  


  @InlineOnly
  private static final <T> T requireNotNull(T value)
  {
    ;
    

    if (value == null) { int $i$a$2$requireNotNull; String str = "Required value was null.";throw ((Throwable)new IllegalArgumentException(str.toString())); } return value;
  }
  




  @InlineOnly
  private static final <T> T requireNotNull(T value, Function0<? extends Object> lazyMessage)
  {
    ;
    



    if (value == null) {
      Object message = lazyMessage.invoke();
      throw ((Throwable)new IllegalArgumentException(message.toString()));
    }
    return value;
  }
  




  @InlineOnly
  private static final void check(boolean value)
  {
    ;
    


    if (!value) { int $i$a$2$check; String str = "Check failed.";throw ((Throwable)new IllegalStateException(str.toString()));
    }
  }
  



  @InlineOnly
  private static final void check(boolean value, Function0<? extends Object> lazyMessage)
  {
    ;
    

    if (!value) {
      Object message = lazyMessage.invoke();
      throw ((Throwable)new IllegalStateException(message.toString()));
    }
  }
  




  @InlineOnly
  private static final <T> T checkNotNull(T value)
  {
    ;
    


    if (value == null) { int $i$a$2$checkNotNull; String str = "Required value was null.";throw ((Throwable)new IllegalStateException(str.toString())); } return value;
  }
  




  @InlineOnly
  private static final <T> T checkNotNull(T value, Function0<? extends Object> lazyMessage)
  {
    ;
    



    if (value == null) {
      Object message = lazyMessage.invoke();
      throw ((Throwable)new IllegalStateException(message.toString()));
    }
    return value;
  }
  


  @InlineOnly
  private static final Void error(Object message)
  {
    ;
    

    throw ((Throwable)new IllegalStateException(message.toString()));
  }
  
  public PreconditionsKt__PreconditionsKt() {}
}

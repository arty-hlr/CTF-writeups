package kotlin;

import org.jetbrains.annotations.Nullable;



@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\020\003\n\002\b\003\030\0002\0060\001j\002`\002B\007\b\026¢\006\002\020\003B\021\b\026\022\b\020\004\032\004\030\0010\005¢\006\002\020\006B\033\b\026\022\b\020\004\032\004\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\021\b\026\022\b\020\007\032\004\030\0010\b¢\006\002\020\n¨\006\013"}, d2={"Lkotlin/UninitializedPropertyAccessException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "message", "", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "kotlin-stdlib"})
public final class UninitializedPropertyAccessException
  extends RuntimeException
{
  public UninitializedPropertyAccessException() {}
  
  public UninitializedPropertyAccessException(@Nullable String message) { super(message); }
  
  public UninitializedPropertyAccessException(@Nullable String message, @Nullable Throwable cause) { super(message, cause); }
  
  public UninitializedPropertyAccessException(@Nullable Throwable cause) { super(cause); }
}

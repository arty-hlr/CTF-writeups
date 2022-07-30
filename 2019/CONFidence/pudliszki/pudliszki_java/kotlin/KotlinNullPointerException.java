package kotlin;

import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\030\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\b\026\030\0002\0060\001j\002`\002B\007\b\026¢\006\002\020\003B\021\b\026\022\b\020\004\032\004\030\0010\005¢\006\002\020\006¨\006\007"}, d2={"Lkotlin/KotlinNullPointerException;", "Ljava/lang/NullPointerException;", "Lkotlin/NullPointerException;", "()V", "message", "", "(Ljava/lang/String;)V", "kotlin-stdlib"})
public class KotlinNullPointerException extends NullPointerException
{
  public KotlinNullPointerException() {}
  
  public KotlinNullPointerException(@Nullable String message) {
    super(message);
  }
}

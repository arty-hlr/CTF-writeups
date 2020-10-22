package kotlin;

import org.jetbrains.annotations.NotNull;





@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\026\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\030\0002\0060\001j\002`\002B\017\022\b\b\002\020\003\032\0020\004¢\006\002\020\005¨\006\006"}, d2={"Lkotlin/NotImplementedError;", "Ljava/lang/Error;", "Lkotlin/Error;", "message", "", "(Ljava/lang/String;)V", "kotlin-stdlib"})
public final class NotImplementedError
  extends Error
{
  public NotImplementedError(@NotNull String message)
  {
    super(message);
  }
  
  public NotImplementedError()
  {
    this(null, 1, null);
  }
}

package kotlin.jvm.internal;

import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;


@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\022\n\000\n\002\020(\n\002\b\002\n\002\020\021\n\002\b\002\032%\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\f\020\003\032\b\022\004\022\002H\0020\004¢\006\002\020\005¨\006\006"}, d2={"iterator", "", "T", "array", "", "([Ljava/lang/Object;)Ljava/util/Iterator;", "kotlin-stdlib"})
public final class ArrayIteratorKt
{
  @NotNull
  public static final <T> Iterator<T> iterator(@NotNull T[] array)
  {
    Intrinsics.checkParameterIsNotNull(array, "array");return (Iterator)new ArrayIterator(array);
  }
}

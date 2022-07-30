package kotlin.text;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;





@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\020\n\000\n\002\030\002\n\002\020\f\n\002\020\r\n\000\032\020\020\000\032\b\022\004\022\0020\0020\001*\0020\003¨\006\004"}, d2={"toSortedSet", "Ljava/util/SortedSet;", "", "", "kotlin-stdlib"}, xs="kotlin/text/StringsKt")
class StringsKt___StringsJvmKt
  extends StringsKt__StringsKt
{
  @NotNull
  public static final SortedSet<Character> toSortedSet(@NotNull CharSequence $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (SortedSet)StringsKt.toCollection($receiver, (Collection)new TreeSet());
  }
  
  public StringsKt___StringsJvmKt() {}
}

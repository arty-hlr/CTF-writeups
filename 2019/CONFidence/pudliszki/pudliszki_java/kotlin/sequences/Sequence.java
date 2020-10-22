package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020(\n\000\bf\030\000*\006\b\000\020\001 \0012\0020\002J\017\020\003\032\b\022\004\022\0028\0000\004H¦\002¨\006\005"}, d2={"Lkotlin/sequences/Sequence;", "T", "", "iterator", "", "kotlin-stdlib"})
public abstract interface Sequence<T>
{
  @NotNull
  public abstract Iterator<T> iterator();
}

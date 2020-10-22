package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\016\n\000\n\002\020(\n\000\n\002\030\002\n\000\032\037\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H\002¨\006\004"}, d2={"iterator", "", "T", "Ljava/util/Enumeration;", "kotlin-stdlib"}, xs="kotlin/collections/CollectionsKt")
class CollectionsKt__IteratorsJVMKt extends CollectionsKt__IterablesKt
{
  @NotNull
  public static final <T> Iterator<T> iterator(@NotNull Enumeration<T> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");(Iterator)new Iterator() {
      public boolean hasNext() { return $this_iterator.hasMoreElements(); }
      
      public T next() { return $this_iterator.nextElement(); }
      
      public void remove()
      {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
      }
    };
  }
  
  public CollectionsKt__IteratorsJVMKt() {}
}

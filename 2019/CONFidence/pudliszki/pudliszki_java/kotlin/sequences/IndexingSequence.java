package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

































































































































































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\030\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020(\n\000\b\000\030\000*\004\b\000\020\0012\016\022\n\022\b\022\004\022\002H\0010\0030\002B\023\022\f\020\004\032\b\022\004\022\0028\0000\002¢\006\002\020\005J\025\020\006\032\016\022\n\022\b\022\004\022\0028\0000\0030\007H\002R\024\020\004\032\b\022\004\022\0028\0000\002X\004¢\006\002\n\000¨\006\b"}, d2={"Lkotlin/sequences/IndexingSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/collections/IndexedValue;", "sequence", "(Lkotlin/sequences/Sequence;)V", "iterator", "", "kotlin-stdlib"})
public final class IndexingSequence<T>
  implements Sequence<IndexedValue<? extends T>>
{
  private final Sequence<T> sequence;
  
  public IndexingSequence(@NotNull Sequence<? extends T> sequence)
  {
    this.sequence = sequence;
  }
  





  @NotNull
  public Iterator<IndexedValue<T>> iterator()
  {
    (Iterator)new Iterator()
    {
      @NotNull
      private final Iterator<T> iterator;
      private int index;
      
      @NotNull
      public final Iterator<T> getIterator() { return iterator; }
      public final int getIndex() { return index; } public final void setIndex(int <set-?>) { index = <set-?>; }
      @NotNull
      public IndexedValue<T> next() { int i = tmp5_2;i = i; if (i < 0) CollectionsKt.throwIndexOverflow(); int j = i;Object localObject = iterator.next();int k = j;return new IndexedValue(k, localObject);
      }
      
      public boolean hasNext() {
        return iterator.hasNext();
      }
      
      public void remove()
      {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
      }
    };
  }
}

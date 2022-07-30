package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;































































































































































































































































































































































































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\004\n\002\020(\n\002\b\002\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B\033\022\f\020\004\032\b\022\004\022\0028\0000\002\022\006\020\005\032\0020\006¢\006\002\020\007J\026\020\b\032\b\022\004\022\0028\0000\0022\006\020\t\032\0020\006H\026J\017\020\n\032\b\022\004\022\0028\0000\013H\002J\026\020\f\032\b\022\004\022\0028\0000\0022\006\020\t\032\0020\006H\026R\016\020\005\032\0020\006X\004¢\006\002\n\000R\024\020\004\032\b\022\004\022\0028\0000\002X\004¢\006\002\n\000¨\006\r"}, d2={"Lkotlin/sequences/DropSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "count", "", "(Lkotlin/sequences/Sequence;I)V", "drop", "n", "iterator", "", "take", "kotlin-stdlib"})
public final class DropSequence<T>
  implements Sequence<T>, DropTakeSequence<T>
{
  private final Sequence<T> sequence;
  private final int count;
  
  public DropSequence(@NotNull Sequence<? extends T> sequence, int count)
  {
    this.sequence = sequence;this.count = count;
    



    int i = this.count >= 0 ? 1 : 0; if (i == 0) { int $i$a$1$require; String str = "count must be non-negative, but was " + this.count + '.';throw ((Throwable)new IllegalArgumentException(str.toString())); } }
  
  @NotNull
  public Sequence<T> drop(int n) { int i = count + n;int n1 = i; int $i$a$1$let; return n1 < 0 ? (Sequence)new DropSequence((Sequence)this, n) : (Sequence)new DropSequence(sequence, n1); } @NotNull
  public Sequence<T> take(int n) { int i = count + n;int n1 = i; int $i$a$1$let; return n1 < 0 ? (Sequence)new TakeSequence((Sequence)this, n) : (Sequence)new SubSequence(sequence, count, n1);
  }
  

















  @NotNull
  public Iterator<T> iterator()
  {
    (Iterator)new Iterator()
    {
      @NotNull
      private final Iterator<T> iterator;
      private int left;
      
      @NotNull
      public final Iterator<T> getIterator() { return iterator; }
      public final int getLeft() { return left; } public final void setLeft(int <set-?>) { left = <set-?>; }
      
      private final void drop()
      {
        while ((left > 0) && (iterator.hasNext())) {
          iterator.next();
          int i; left = ((i = left) + -1);
        }
      }
      
      public T next() {
        drop();
        return iterator.next();
      }
      
      public boolean hasNext() {
        drop();
        return iterator.hasNext();
      }
      
      public void remove()
      {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
      }
    };
  }
}

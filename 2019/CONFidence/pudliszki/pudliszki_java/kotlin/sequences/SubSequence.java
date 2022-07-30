package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;



























































































































































































































































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\b\n\002\020(\n\002\b\002\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B#\022\f\020\004\032\b\022\004\022\0028\0000\002\022\006\020\005\032\0020\006\022\006\020\007\032\0020\006¢\006\002\020\bJ\026\020\f\032\b\022\004\022\0028\0000\0022\006\020\r\032\0020\006H\026J\017\020\016\032\b\022\004\022\0028\0000\017H\002J\026\020\020\032\b\022\004\022\0028\0000\0022\006\020\r\032\0020\006H\026R\024\020\t\032\0020\0068BX\004¢\006\006\032\004\b\n\020\013R\016\020\007\032\0020\006X\004¢\006\002\n\000R\024\020\004\032\b\022\004\022\0028\0000\002X\004¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000¨\006\021"}, d2={"Lkotlin/sequences/SubSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "startIndex", "", "endIndex", "(Lkotlin/sequences/Sequence;II)V", "count", "getCount", "()I", "drop", "n", "iterator", "", "take", "kotlin-stdlib"})
public final class SubSequence<T>
  implements Sequence<T>, DropTakeSequence<T>
{
  private final Sequence<T> sequence;
  private final int startIndex;
  private final int endIndex;
  
  public SubSequence(@NotNull Sequence<? extends T> sequence, int startIndex, int endIndex)
  {
    this.sequence = sequence;this.startIndex = startIndex;this.endIndex = endIndex;
    





    int i = this.startIndex >= 0 ? 1 : 0; String str; if (i == 0) { int $i$a$1$require; str = "startIndex should be non-negative, but is " + this.startIndex;throw ((Throwable)new IllegalArgumentException(str.toString())); }
    i = this.endIndex >= 0 ? 1 : 0; if (i == 0) { int $i$a$2$require; str = "endIndex should be non-negative, but is " + this.endIndex;throw ((Throwable)new IllegalArgumentException(str.toString())); }
    i = this.endIndex >= this.startIndex ? 1 : 0; if (i == 0) { int $i$a$3$require; str = "endIndex should be not less than startIndex, but was " + this.endIndex + " < " + this.startIndex;throw ((Throwable)new IllegalArgumentException(str.toString()));
    } }
  
  private final int getCount() { return endIndex - startIndex; }
  @NotNull
  public Sequence<T> drop(int n) { return n >= getCount() ? SequencesKt.emptySequence() : (Sequence)new SubSequence(sequence, startIndex + n, endIndex); } @NotNull
  public Sequence<T> take(int n) { return n >= getCount() ? (Sequence)this : (Sequence)new SubSequence(sequence, startIndex, startIndex + n); }
  






















  @NotNull
  public Iterator<T> iterator()
  {
    (Iterator)new Iterator()
    {
      @NotNull
      private final Iterator<T> iterator;
      private int position;
      
      @NotNull
      public final Iterator<T> getIterator() { return iterator; }
      public final int getPosition() { return position; } public final void setPosition(int <set-?>) { position = <set-?>; }
      
      private final void drop()
      {
        while ((position < SubSequence.access$getStartIndex$p(this$0)) && (iterator.hasNext())) {
          iterator.next();
          int i = tmp41_38;
        }
      }
      
      public boolean hasNext() {
        drop();
        return (position < SubSequence.access$getEndIndex$p(this$0)) && (iterator.hasNext());
      }
      
      public T next() {
        drop();
        if (position >= SubSequence.access$getEndIndex$p(this$0))
          throw ((Throwable)new NoSuchElementException());
        int i = tmp34_31;
        return iterator.next();
      }
      
      public void remove()
      {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
      }
    };
  }
}

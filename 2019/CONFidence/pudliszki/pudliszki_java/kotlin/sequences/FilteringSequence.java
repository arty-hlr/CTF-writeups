package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;



































































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\020(\n\000\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B1\022\f\020\003\032\b\022\004\022\0028\0000\002\022\b\b\002\020\004\032\0020\005\022\022\020\006\032\016\022\004\022\0028\000\022\004\022\0020\0050\007¢\006\002\020\bJ\017\020\t\032\b\022\004\022\0028\0000\nH\002R\032\020\006\032\016\022\004\022\0028\000\022\004\022\0020\0050\007X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\024\020\003\032\b\022\004\022\0028\0000\002X\004¢\006\002\n\000¨\006\013"}, d2={"Lkotlin/sequences/FilteringSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "sendWhen", "", "predicate", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;ZLkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"})
public final class FilteringSequence<T>
  implements Sequence<T>
{
  private final Sequence<T> sequence;
  private final boolean sendWhen;
  private final Function1<T, Boolean> predicate;
  
  public FilteringSequence(@NotNull Sequence<? extends T> sequence, boolean sendWhen, @NotNull Function1<? super T, Boolean> predicate)
  {
    this.sequence = sequence;this.sendWhen = sendWhen;this.predicate = predicate;
  }
  


































  @NotNull
  public Iterator<T> iterator()
  {
    (Iterator)new Iterator()
    {
      @NotNull
      private final Iterator<T> iterator;
      private int nextState;
      @Nullable
      private T nextItem;
      
      @NotNull
      public final Iterator<T> getIterator() { return iterator; }
      public final int getNextState() { return nextState; } public final void setNextState(int <set-?>) { nextState = <set-?>; } @Nullable
      public final T getNextItem() { return nextItem; } public final void setNextItem(@Nullable T <set-?>) { nextItem = <set-?>; }
      
      private final void calcNext() {
        while (iterator.hasNext()) {
          Object item = iterator.next();
          if (((Boolean)FilteringSequence.access$getPredicate$p(this$0).invoke(item)).booleanValue() == FilteringSequence.access$getSendWhen$p(this$0)) {
            nextItem = item;
            nextState = 1;
            return;
          }
        }
        nextState = 0;
      }
      
      public T next() {
        if (nextState == -1)
          calcNext();
        if (nextState == 0)
          throw ((Throwable)new NoSuchElementException());
        Object result = nextItem;
        nextItem = null;
        nextState = -1;
        
        return result;
      }
      
      public boolean hasNext() {
        if (nextState == -1)
          calcNext();
        return nextState == 1;
      }
      
      public void remove()
      {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
      }
    };
  }
}

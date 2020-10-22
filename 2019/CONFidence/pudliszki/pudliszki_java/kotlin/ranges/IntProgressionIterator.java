package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;























@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\005\b\000\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\002\020\006J\t\020\b\032\0020\tH\002J\b\020\r\032\0020\003H\026R\016\020\007\032\0020\003X\004¢\006\002\n\000R\016\020\b\032\0020\tX\016¢\006\002\n\000R\016\020\n\032\0020\003X\016¢\006\002\n\000R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\013\020\f¨\006\016"}, d2={"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "first", "", "last", "step", "(III)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextInt", "kotlin-stdlib"})
public final class IntProgressionIterator
  extends IntIterator
{
  private final int finalElement;
  private boolean hasNext;
  private int next;
  private final int step;
  
  public final int getStep() { return step; } public IntProgressionIterator(int first, int last, int step) { this.step = step;
    finalElement = last;
    hasNext = (first <= last);
    next = (hasNext ? first : finalElement); }
  
  public boolean hasNext() { return hasNext; }
  
  public int nextInt() {
    int value = next;
    if (value == finalElement) {
      if (!hasNext) throw ((Throwable)new NoSuchElementException());
      hasNext = false;
    }
    else {
      next += step;
    }
    return value;
  }
}

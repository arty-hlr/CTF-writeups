package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.LongIterator;















































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\t\n\002\b\005\n\002\020\013\n\002\b\005\b\000\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\002\020\006J\t\020\b\032\0020\tH\002J\b\020\r\032\0020\003H\026R\016\020\007\032\0020\003X\004¢\006\002\n\000R\016\020\b\032\0020\tX\016¢\006\002\n\000R\016\020\n\032\0020\003X\016¢\006\002\n\000R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\013\020\f¨\006\016"}, d2={"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "first", "", "last", "step", "(JJJ)V", "finalElement", "hasNext", "", "next", "getStep", "()J", "nextLong", "kotlin-stdlib"})
public final class LongProgressionIterator
  extends LongIterator
{
  private final long finalElement;
  private boolean hasNext;
  private long next;
  private final long step;
  
  public final long getStep() { return step; } public LongProgressionIterator(long first, long last, long step) { this.step = step;
    finalElement = last;
    hasNext = (first <= last);
    next = (hasNext ? first : finalElement); }
  
  public boolean hasNext() { return hasNext; }
  
  public long nextLong() {
    long value = next;
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

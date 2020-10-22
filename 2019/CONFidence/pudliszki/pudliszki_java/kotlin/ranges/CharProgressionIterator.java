package kotlin.ranges;

import java.util.NoSuchElementException;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\020\f\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\005\b\000\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\002\020\007J\t\020\t\032\0020\nH\002J\b\020\016\032\0020\003H\026R\016\020\b\032\0020\006X\004¢\006\002\n\000R\016\020\t\032\0020\nX\016¢\006\002\n\000R\016\020\013\032\0020\006X\016¢\006\002\n\000R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\f\020\r¨\006\017"}, d2={"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "first", "", "last", "step", "", "(CCI)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextChar", "kotlin-stdlib"})
public final class CharProgressionIterator
  extends kotlin.collections.CharIterator
{
  private final int finalElement;
  private boolean hasNext;
  private int next;
  private final int step;
  
  public final int getStep() { return step; } public CharProgressionIterator(char first, char last, int step) { this.step = step;
    finalElement = last;
    hasNext = (first <= last);
    next = (hasNext ? first : finalElement); }
  
  public boolean hasNext() { return hasNext; }
  
  public char nextChar() {
    int value = next;
    if (value == finalElement) {
      if (!hasNext) throw ((Throwable)new NoSuchElementException());
      hasNext = false;
    }
    else {
      next += step;
    }
    return (char)value;
  }
}

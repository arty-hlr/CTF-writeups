package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.collections.ULongIterator;





















































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\t\n\002\b\004\n\002\020\013\n\002\b\004\b\003\030\0002\0020\001B \022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006ø\001\000¢\006\002\020\007J\t\020\n\032\0020\013H\002J\020\020\r\032\0020\003H\026ø\001\000¢\006\002\020\016R\023\020\b\032\0020\003X\004ø\001\000¢\006\004\n\002\020\tR\016\020\n\032\0020\013X\016¢\006\002\n\000R\023\020\f\032\0020\003X\016ø\001\000¢\006\004\n\002\020\tR\023\020\005\032\0020\003X\004ø\001\000¢\006\004\n\002\020\t\002\004\n\002\b\031¨\006\017"}, d2={"Lkotlin/ranges/ULongProgressionIterator;", "Lkotlin/collections/ULongIterator;", "first", "Lkotlin/ULong;", "last", "step", "", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "finalElement", "J", "hasNext", "", "next", "nextULong", "()J", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
@ExperimentalUnsignedTypes
final class ULongProgressionIterator
  extends ULongIterator
{
  private final long finalElement;
  private boolean hasNext;
  private final long step;
  private long next;
  
  private ULongProgressionIterator(long first, long last, long step)
  {
    finalElement = last;
    long l1 = first;ULongProgressionIterator localULongProgressionIterator = this;int i = UnsignedKt.ulongCompare(l1, last);l1 = first;localULongProgressionIterator = localULongProgressionIterator;i = UnsignedKt.ulongCompare(l1, last);hasNext = (i <= 0);
    l1 = step;localULongProgressionIterator = this;long l2 = ULong.constructor-impl(l1);step = l2;
    next = (hasNext ? first : finalElement); }
  
  public boolean hasNext() { return hasNext; }
  
  public long nextULong() {
    long value = next;
    if (value == finalElement) {
      if (!hasNext) throw ((Throwable)new NoSuchElementException());
      hasNext = false;
    } else {
      long l1 = next;long l2 = step;ULongProgressionIterator localULongProgressionIterator = this;long l3 = ULong.constructor-impl(l1 + l2);next = l3;
    }
    return value;
  }
}

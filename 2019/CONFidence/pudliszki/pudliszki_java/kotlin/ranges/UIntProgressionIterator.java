package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.UnsignedKt;
import kotlin.collections.UIntIterator;





















































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\004\n\002\020\013\n\002\b\004\b\003\030\0002\0020\001B \022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006ø\001\000¢\006\002\020\007J\t\020\n\032\0020\013H\002J\020\020\r\032\0020\003H\026ø\001\000¢\006\002\020\016R\023\020\b\032\0020\003X\004ø\001\000¢\006\004\n\002\020\tR\016\020\n\032\0020\013X\016¢\006\002\n\000R\023\020\f\032\0020\003X\016ø\001\000¢\006\004\n\002\020\tR\023\020\005\032\0020\003X\004ø\001\000¢\006\004\n\002\020\t\002\004\n\002\b\031¨\006\017"}, d2={"Lkotlin/ranges/UIntProgressionIterator;", "Lkotlin/collections/UIntIterator;", "first", "Lkotlin/UInt;", "last", "step", "", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "finalElement", "I", "hasNext", "", "next", "nextUInt", "()I", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
@ExperimentalUnsignedTypes
final class UIntProgressionIterator
  extends UIntIterator
{
  private final int finalElement;
  private boolean hasNext;
  private final int step;
  private int next;
  
  private UIntProgressionIterator(int first, int last, int step)
  {
    finalElement = last;
    int i = first;UIntProgressionIterator localUIntProgressionIterator = this;int j = UnsignedKt.uintCompare(i, last);i = first;localUIntProgressionIterator = localUIntProgressionIterator;j = UnsignedKt.uintCompare(i, last);hasNext = (j <= 0);
    i = step;localUIntProgressionIterator = this;j = UInt.constructor-impl(i);step = j;
    next = (hasNext ? first : finalElement); }
  
  public boolean hasNext() { return hasNext; }
  
  public int nextUInt() {
    int value = next;
    if (value == finalElement) {
      if (!hasNext) throw ((Throwable)new NoSuchElementException());
      hasNext = false;
    } else {
      int i = next;int j = step;UIntProgressionIterator localUIntProgressionIterator = this;int k = UInt.constructor-impl(i + j);next = k;
    }
    return value;
  }
}

package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ShortIterator;
import org.jetbrains.annotations.NotNull;








@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000$\n\002\030\002\n\002\030\002\n\000\n\002\020\027\n\002\b\002\n\002\020\b\n\000\n\002\020\013\n\000\n\002\020\n\n\000\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\bH\002J\b\020\t\032\0020\nH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\005\032\0020\006X\016¢\006\002\n\000¨\006\013"}, d2={"Lkotlin/jvm/internal/ArrayShortIterator;", "Lkotlin/collections/ShortIterator;", "array", "", "([S)V", "index", "", "hasNext", "", "nextShort", "", "kotlin-stdlib"})
final class ArrayShortIterator
  extends ShortIterator
{
  private int index;
  private final short[] array;
  
  public ArrayShortIterator(@NotNull short[] array) { this.array = array; }
  
  public boolean hasNext() { return index < array.length; }
  public short nextShort() { int i; try { i = tmp10_7;i = array[i]; } catch (ArrayIndexOutOfBoundsException e) { index -= 1;throw ((Throwable)new NoSuchElementException(e.getMessage())); } return i;
  }
}

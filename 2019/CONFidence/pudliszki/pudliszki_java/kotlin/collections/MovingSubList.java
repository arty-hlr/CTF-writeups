package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;











































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000,\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\020\b\n\002\b\b\n\002\020\002\n\002\b\002\b\000\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\0022\0060\003j\002`\004B\023\022\f\020\005\032\b\022\004\022\0028\0000\006¢\006\002\020\007J\026\020\016\032\0028\0002\006\020\017\032\0020\tH\002¢\006\002\020\020J\026\020\021\032\0020\0222\006\020\n\032\0020\t2\006\020\023\032\0020\tR\016\020\b\032\0020\tX\016¢\006\002\n\000R\016\020\n\032\0020\tX\016¢\006\002\n\000R\024\020\005\032\b\022\004\022\0028\0000\006X\004¢\006\002\n\000R\024\020\013\032\0020\t8VX\004¢\006\006\032\004\b\f\020\r¨\006\024"}, d2={"Lkotlin/collections/MovingSubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "", "(Ljava/util/List;)V", "_size", "", "fromIndex", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "move", "", "toIndex", "kotlin-stdlib"})
public final class MovingSubList<E>
  extends AbstractList<E>
  implements RandomAccess
{
  private int fromIndex;
  private int _size;
  private final List<E> list;
  
  public MovingSubList(@NotNull List<? extends E> list)
  {
    this.list = list;
  }
  
  public final void move(int fromIndex, int toIndex)
  {
    AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, list.size());
    this.fromIndex = fromIndex;
    _size = (toIndex - fromIndex);
  }
  
  public E get(int index) {
    AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, _size);
    
    return list.get(fromIndex + index);
  }
  
  public int getSize() { return _size; }
}

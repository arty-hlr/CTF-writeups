package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\0008\n\002\030\002\n\000\n\002\030\002\n\002\020 \n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\002\b\b\n\002\020(\n\002\b\002\n\002\020*\n\002\b\b\b'\030\000 \034*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003:\004\034\035\036\037B\007\b\004¢\006\002\020\004J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\fH\002J\026\020\r\032\0028\0002\006\020\016\032\0020\006H¦\002¢\006\002\020\017J\b\020\020\032\0020\006H\026J\025\020\021\032\0020\0062\006\020\022\032\0028\000H\026¢\006\002\020\023J\017\020\024\032\b\022\004\022\0028\0000\025H\002J\025\020\026\032\0020\0062\006\020\022\032\0028\000H\026¢\006\002\020\023J\016\020\027\032\b\022\004\022\0028\0000\030H\026J\026\020\027\032\b\022\004\022\0028\0000\0302\006\020\016\032\0020\006H\026J\036\020\031\032\b\022\004\022\0028\0000\0032\006\020\032\032\0020\0062\006\020\033\032\0020\006H\026R\022\020\005\032\0020\006X¦\004¢\006\006\032\004\b\007\020\b¨\006 "}, d2={"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "size", "", "getSize", "()I", "equals", "", "other", "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "element", "(Ljava/lang/Object;)I", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"})
@kotlin.SinceKotlin(version="1.1")
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>, KMappedMarker
{
  public static final Companion Companion = new Companion(null);
  
  @NotNull
  public Iterator<E> iterator()
  {
    return (Iterator)new IteratorImpl();
  }
  


  @NotNull
  public ListIterator<E> listIterator() { return (ListIterator)new ListIteratorImpl(0); }
  @NotNull
  public ListIterator<E> listIterator(int index) { return (ListIterator)new ListIteratorImpl(index); }
  @NotNull
  public List<E> subList(int fromIndex, int toIndex) { return (List)new SubList(this, fromIndex, toIndex); }
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\036\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\n\b\002\030\000*\006\b\001\020\001 \0012\b\022\004\022\002H\0010\0022\0060\003j\002`\004B#\022\f\020\005\032\b\022\004\022\0028\0010\002\022\006\020\006\032\0020\007\022\006\020\b\032\0020\007¢\006\002\020\tJ\026\020\016\032\0028\0012\006\020\017\032\0020\007H\002¢\006\002\020\020R\016\020\n\032\0020\007X\016¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\024\020\005\032\b\022\004\022\0028\0010\002X\004¢\006\002\n\000R\024\020\013\032\0020\0078VX\004¢\006\006\032\004\b\f\020\r¨\006\021"}, d2={"Lkotlin/collections/AbstractList$SubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "fromIndex", "", "toIndex", "(Lkotlin/collections/AbstractList;II)V", "_size", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "kotlin-stdlib"})
  private static final class SubList<E> extends AbstractList<E> implements RandomAccess { public SubList(@NotNull AbstractList<? extends E> list, int fromIndex, int toIndex) { this.list = list;this.fromIndex = fromIndex;
      


      AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(this.fromIndex, toIndex, this.list.size());
      _size = (toIndex - this.fromIndex);
    }
    
    public E get(int index) {
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, _size);
      
      return list.get(fromIndex + index);
    }
    
    public int getSize() { return _size; }
    
    private int _size;
    private final AbstractList<E> list;
    private final int fromIndex;
  }
  
  public boolean equals(@Nullable Object other)
  {
    if (other == (AbstractList)this) return true;
    if (!(other instanceof List)) { return false;
    }
    return Companion.orderedEquals$kotlin_stdlib((Collection)this, (Collection)other);
  }
  



  public int hashCode() { return Companion.orderedHashCode$kotlin_stdlib((Collection)this); }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\034\n\002\030\002\n\002\020(\n\002\b\002\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\003\b\004\030\0002\b\022\004\022\0028\0000\001B\005¢\006\002\020\002J\t\020\t\032\0020\nH\002J\016\020\013\032\0028\000H\002¢\006\002\020\fR\032\020\003\032\0020\004X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\b¨\006\r"}, d2={"Lkotlin/collections/AbstractList$IteratorImpl;", "", "(Lkotlin/collections/AbstractList;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
  private class IteratorImpl implements Iterator<E>, KMappedMarker {
    protected final int getIndex() { return index; } protected final void setIndex(int <set-?>) { index = <set-?>; }
    
    public boolean hasNext() { return index < this$0.size(); }
    
    private int index;
    public E next() { if (!hasNext()) throw ((Throwable)new NoSuchElementException());
      int i = tmp27_24;return this$0.get(i); }
    
    public IteratorImpl() {}
    
    public void remove() { throw new UnsupportedOperationException("Operation is not supported for read-only collection"); } }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020*\n\000\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\005\b\004\030\0002\f0\001R\b\022\004\022\0028\0000\0022\b\022\004\022\0028\0000\003B\r\022\006\020\004\032\0020\005¢\006\002\020\006J\b\020\007\032\0020\bH\026J\b\020\t\032\0020\005H\026J\r\020\n\032\0028\000H\026¢\006\002\020\013J\b\020\f\032\0020\005H\026¨\006\r"}, d2={"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "index", "", "(Lkotlin/collections/AbstractList;I)V", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"})
  private class ListIteratorImpl extends AbstractList<E>.IteratorImpl implements ListIterator<E>, KMappedMarker { public ListIteratorImpl() { super();
      

      AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, size());
      setIndex(index);
    }
    
    public boolean hasPrevious() { return getIndex() > 0; }
    
    public int nextIndex() { return getIndex(); }
    
    public E previous() {
      if (!hasPrevious()) throw ((Throwable)new NoSuchElementException());
      setIndex(getIndex() + -1);return get(getIndex());
    }
    
    public int previousIndex() { return getIndex() - 1; }
    
    public void add(E paramE) { throw new UnsupportedOperationException("Operation is not supported for read-only collection"); }
    public void set(E paramE) { throw new UnsupportedOperationException("Operation is not supported for read-only collection"); } }
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\020\b\n\002\b\t\n\002\020\013\n\000\n\002\020\036\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\035\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\006H\000¢\006\002\b\bJ\035\020\t\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\006H\000¢\006\002\b\nJ%\020\013\032\0020\0042\006\020\f\032\0020\0062\006\020\r\032\0020\0062\006\020\007\032\0020\006H\000¢\006\002\b\016J%\020\017\032\0020\0202\n\020\021\032\006\022\002\b\0030\0222\n\020\023\032\006\022\002\b\0030\022H\000¢\006\002\b\024J\031\020\025\032\0020\0062\n\020\021\032\006\022\002\b\0030\022H\000¢\006\002\b\026¨\006\027"}, d2={"Lkotlin/collections/AbstractList$Companion;", "", "()V", "checkElementIndex", "", "index", "", "size", "checkElementIndex$kotlin_stdlib", "checkPositionIndex", "checkPositionIndex$kotlin_stdlib", "checkRangeIndexes", "fromIndex", "toIndex", "checkRangeIndexes$kotlin_stdlib", "orderedEquals", "", "c", "", "other", "orderedEquals$kotlin_stdlib", "orderedHashCode", "orderedHashCode$kotlin_stdlib", "kotlin-stdlib"})
  public static final class Companion { public final void checkElementIndex$kotlin_stdlib(int index, int size) { if ((index < 0) || (index >= size)) {
        throw ((Throwable)new IndexOutOfBoundsException("index: " + index + ", size: " + size));
      }
    }
    
    public final void checkPositionIndex$kotlin_stdlib(int index, int size) {
      if ((index < 0) || (index > size)) {
        throw ((Throwable)new IndexOutOfBoundsException("index: " + index + ", size: " + size));
      }
    }
    
    public final void checkRangeIndexes$kotlin_stdlib(int fromIndex, int toIndex, int size) {
      if ((fromIndex < 0) || (toIndex > size)) {
        throw ((Throwable)new IndexOutOfBoundsException("fromIndex: " + fromIndex + ", toIndex: " + toIndex + ", size: " + size));
      }
      if (fromIndex > toIndex) {
        throw ((Throwable)new IllegalArgumentException("fromIndex: " + fromIndex + " > toIndex: " + toIndex));
      }
    }
    
    /* Error */
    public final int orderedHashCode$kotlin_stdlib(@NotNull Collection<?> c)
    {
      // Byte code:
      //   0: aload_1
      //   1: ldc 58
      //   3: invokestatic 64	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: iconst_1
      //   7: istore_2
      //   8: aload_1
      //   9: invokeinterface 70 1 0
      //   14: astore 4
      //   16: aload 4
      //   18: invokeinterface 76 1 0
      //   23: ifeq +33 -> 56
      //   26: aload 4
      //   28: invokeinterface 80 1 0
      //   33: astore_3
      //   34: bipush 31
      //   36: iload_2
      //   37: imul
      //   38: aload_3
      //   39: dup
      //   40: ifnull +9 -> 49
      //   43: invokevirtual 84	java/lang/Object:hashCode	()I
      //   46: goto +5 -> 51
      //   49: pop
      //   50: iconst_0
      //   51: iadd
      //   52: istore_2
      //   53: goto -37 -> 16
      //   56: iload_2
      //   57: ireturn
      // Line number table:
      //   Java source line #127	-> byte code offset #6
      //   Java source line #128	-> byte code offset #8
      //   Java source line #129	-> byte code offset #34
      //   Java source line #128	-> byte code offset #53
      //   Java source line #131	-> byte code offset #56
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	58	0	this	Companion
      //   0	58	1	c	Collection
      //   8	50	2	hashCode	int
      //   34	19	3	e	Object
    }
    
    public final boolean orderedEquals$kotlin_stdlib(@NotNull Collection<?> c, @NotNull Collection<?> other)
    {
      Intrinsics.checkParameterIsNotNull(c, "c");Intrinsics.checkParameterIsNotNull(other, "other"); if (c.size() != other.size()) { return false;
      }
      Iterator otherIterator = other.iterator();
      for (Object elem : c) {
        Object elemOther = otherIterator.next();
        if ((Intrinsics.areEqual(elem, elemOther) ^ true)) {
          return false;
        }
      }
      return true;
    }
    
    private Companion() {}
  }
  
  public int indexOf(Object element)
  {
    List $receiver$iv = this;
    



























































    int $i$f$indexOfFirst;
    



























































    int index$iv = 0;
    for (Object item$iv : $receiver$iv) {
      Object it = item$iv;
      int $i$a$1$indexOfFirst;
      index$iv++;
    }
    return Intrinsics.areEqual(it, element) ? 
    



























































































































      index$iv : 
      

      -1;
  }
  
  public int lastIndexOf(Object element)
  {
    List $receiver$iv = this;
    






























































    int $i$f$indexOfLast;
    





























































    ListIterator iterator$iv = $receiver$iv.listIterator($receiver$iv.size());
    Object it; int $i$a$1$indexOfLast; while (iterator$iv.hasPrevious()) {
      it = iterator$iv.previous();
    }
    return Intrinsics.areEqual(it, element) ? 
    
































































































































      iterator$iv.nextIndex() : 
      

      -1;
  }
  
  public abstract int getSize();
  
  public abstract E get(int paramInt);
  
  protected AbstractList() {}
  
  public void add(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public E remove(int paramInt)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public E set(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

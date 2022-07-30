package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\\\n\002\030\002\n\002\020 \n\002\020\001\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\t\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\036\n\002\b\002\n\002\020\000\n\002\b\006\n\002\020(\n\002\b\002\n\002\020*\n\002\b\005\n\002\020\016\n\000\bÀ\002\030\0002\b\022\004\022\0020\0020\0012\0060\003j\002`\0042\0060\005j\002`\006B\007\b\002¢\006\002\020\007J\021\020\016\032\0020\0172\006\020\020\032\0020\002H\002J\026\020\021\032\0020\0172\f\020\022\032\b\022\004\022\0020\0020\023H\026J\023\020\024\032\0020\0172\b\020\025\032\004\030\0010\026H\002J\021\020\027\032\0020\0022\006\020\030\032\0020\013H\002J\b\020\031\032\0020\013H\026J\020\020\032\032\0020\0132\006\020\020\032\0020\002H\026J\b\020\033\032\0020\017H\026J\017\020\034\032\b\022\004\022\0020\0020\035H\002J\020\020\036\032\0020\0132\006\020\020\032\0020\002H\026J\016\020\037\032\b\022\004\022\0020\0020 H\026J\026\020\037\032\b\022\004\022\0020\0020 2\006\020\030\032\0020\013H\026J\b\020!\032\0020\026H\002J\036\020\"\032\b\022\004\022\0020\0020\0012\006\020#\032\0020\0132\006\020$\032\0020\013H\026J\b\020%\032\0020&H\026R\016\020\b\032\0020\tXT¢\006\002\n\000R\024\020\n\032\0020\0138VX\004¢\006\006\032\004\b\f\020\r¨\006'"}, d2={"Lkotlin/collections/EmptyList;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "()V", "serialVersionUID", "", "size", "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "", "equals", "other", "", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "readResolve", "subList", "fromIndex", "toIndex", "toString", "", "kotlin-stdlib"})
public final class EmptyList implements List, Serializable, RandomAccess, KMappedMarker
{
  private static final long serialVersionUID = -7390468764508069838L;
  public static final EmptyList INSTANCE;
  
  static
  {
    EmptyList localEmptyList = new EmptyList();INSTANCE = localEmptyList;
  }
  
  public boolean equals(@org.jetbrains.annotations.Nullable Object other) { return ((other instanceof List)) && (((List)other).isEmpty()); }
  public int hashCode() { return 1; } @NotNull
  public String toString() { return "[]"; }
  
  public int getSize() { return 0; }
  public boolean isEmpty() { return true; }
  public boolean contains(@NotNull Void element) { Intrinsics.checkParameterIsNotNull(element, "element");return false; }
  public boolean containsAll(@NotNull Collection elements) { Intrinsics.checkParameterIsNotNull(elements, "elements");return elements.isEmpty(); }
  @NotNull
  public Void get(int index) { throw ((Throwable)new IndexOutOfBoundsException("Empty list doesn't contain element at index " + index + '.')); }
  public int indexOf(@NotNull Void element) { Intrinsics.checkParameterIsNotNull(element, "element");return -1; }
  public int lastIndexOf(@NotNull Void element) { Intrinsics.checkParameterIsNotNull(element, "element");return -1; }
  @NotNull
  public Iterator iterator() { return (Iterator)EmptyIterator.INSTANCE; } @NotNull
  public ListIterator listIterator() { return (ListIterator)EmptyIterator.INSTANCE; }
  @NotNull
  public ListIterator listIterator(int index) { if (index != 0) throw ((Throwable)new IndexOutOfBoundsException("Index: " + index));
    return (ListIterator)EmptyIterator.INSTANCE;
  }
  
  @NotNull
  public List subList(int fromIndex, int toIndex) { if ((fromIndex == 0) && (toIndex == 0)) return (List)this;
    throw ((Throwable)new IndexOutOfBoundsException("fromIndex: " + fromIndex + ", toIndex: " + toIndex));
  }
  
  private final Object readResolve() { return INSTANCE; }
  
  private EmptyList() {}
  
  public boolean add(Void paramVoid)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public void add(int paramInt, Void paramVoid)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean addAll(int paramInt, Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean addAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public void clear()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public Void remove(int paramInt)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public Void set(int paramInt, Void paramVoid)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public Object[] toArray()
  {
    return CollectionToArray.toArray(this);
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    return CollectionToArray.toArray(this, paramArrayOfT);
  }
}

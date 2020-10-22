package kotlin.collections;

import java.util.Collection;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000L\n\002\030\002\n\002\020\"\n\002\020\001\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\t\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\036\n\002\b\002\n\002\020\000\n\002\b\003\n\002\020(\n\002\b\002\n\002\020\016\n\000\bÀ\002\030\0002\b\022\004\022\0020\0020\0012\0060\003j\002`\004B\007\b\002¢\006\002\020\005J\021\020\f\032\0020\r2\006\020\016\032\0020\002H\002J\026\020\017\032\0020\r2\f\020\020\032\b\022\004\022\0020\0020\021H\026J\023\020\022\032\0020\r2\b\020\023\032\004\030\0010\024H\002J\b\020\025\032\0020\tH\026J\b\020\026\032\0020\rH\026J\017\020\027\032\b\022\004\022\0020\0020\030H\002J\b\020\031\032\0020\024H\002J\b\020\032\032\0020\033H\026R\016\020\006\032\0020\007XT¢\006\002\n\000R\024\020\b\032\0020\t8VX\004¢\006\006\032\004\b\n\020\013¨\006\034"}, d2={"Lkotlin/collections/EmptySet;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", "", "size", "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "", "equals", "other", "", "hashCode", "isEmpty", "iterator", "", "readResolve", "toString", "", "kotlin-stdlib"})
public final class EmptySet implements java.util.Set, java.io.Serializable, kotlin.jvm.internal.markers.KMappedMarker
{
  private static final long serialVersionUID = 3406603774387020532L;
  public static final EmptySet INSTANCE;
  
  static {
    EmptySet localEmptySet = new EmptySet();INSTANCE = localEmptySet;
  }
  
  public boolean equals(@org.jetbrains.annotations.Nullable Object other) { return ((other instanceof java.util.Set)) && (((java.util.Set)other).isEmpty()); }
  public int hashCode() { return 0; } @org.jetbrains.annotations.NotNull
  public String toString() { return "[]"; }
  
  public int getSize() { return 0; }
  public boolean isEmpty() { return true; }
  public boolean contains(@org.jetbrains.annotations.NotNull Void element) { kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(element, "element");return false; }
  public boolean containsAll(@org.jetbrains.annotations.NotNull Collection elements) { kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(elements, "elements");return elements.isEmpty(); }
  @org.jetbrains.annotations.NotNull
  public java.util.Iterator iterator() { return (java.util.Iterator)EmptyIterator.INSTANCE; }
  
  private final Object readResolve() { return INSTANCE; }
  
  private EmptySet() {}
  
  public boolean add(Void paramVoid)
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
  
  public boolean retainAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public Object[] toArray()
  {
    return kotlin.jvm.internal.CollectionToArray.toArray(this);
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    return kotlin.jvm.internal.CollectionToArray.toArray(this, paramArrayOfT);
  }
}

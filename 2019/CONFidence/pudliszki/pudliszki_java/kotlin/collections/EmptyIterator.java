package kotlin.collections;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000 \n\002\030\002\n\002\020*\n\002\020\001\n\002\b\002\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\003\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\t\020\004\032\0020\005H\002J\b\020\006\032\0020\005H\026J\t\020\007\032\0020\002H\002J\b\020\b\032\0020\tH\026J\b\020\n\032\0020\002H\026J\b\020\013\032\0020\tH\026¨\006\f"}, d2={"Lkotlin/collections/EmptyIterator;", "", "", "()V", "hasNext", "", "hasPrevious", "next", "nextIndex", "", "previous", "previousIndex", "kotlin-stdlib"})
public final class EmptyIterator implements java.util.ListIterator, kotlin.jvm.internal.markers.KMappedMarker
{
  public static final EmptyIterator INSTANCE;
  
  static
  {
    EmptyIterator localEmptyIterator = new EmptyIterator();INSTANCE = localEmptyIterator; }
  public boolean hasNext() { return false; }
  public boolean hasPrevious() { return false; }
  public int nextIndex() { return 0; }
  public int previousIndex() { return -1; } @NotNull
  public Void next() { throw ((Throwable)new NoSuchElementException()); } @NotNull
  public Void previous() { throw ((Throwable)new NoSuchElementException()); }
  
  private EmptyIterator() {}
  
  public void add(Void paramVoid)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public void set(Void paramVoid)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

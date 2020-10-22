package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;


































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000>\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\021\n\002\020\000\n\002\b\b\n\002\020\002\n\002\b\006\n\002\020\013\n\000\n\002\020(\n\002\b\f\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\0060\003j\002`\004B\r\022\006\020\005\032\0020\006¢\006\002\020\007J\023\020\022\032\0020\0232\006\020\024\032\0028\000¢\006\002\020\025J\026\020\026\032\0028\0002\006\020\027\032\0020\006H\002¢\006\002\020\030J\006\020\031\032\0020\032J\017\020\033\032\b\022\004\022\0028\0000\034H\002J\016\020\035\032\0020\0232\006\020\036\032\0020\006J\025\020\037\032\n\022\006\022\004\030\0010\n0\tH\024¢\006\002\020 J'\020\037\032\b\022\004\022\002H\0010\t\"\004\b\001\020\0012\f\020!\032\b\022\004\022\002H\0010\tH\024¢\006\002\020\"J9\020#\032\0020\023\"\004\b\001\020\001*\b\022\004\022\002H\0010\t2\006\020\024\032\002H\0012\b\b\002\020$\032\0020\0062\b\b\002\020%\032\0020\006H\002¢\006\002\020&J\025\020'\032\0020\006*\0020\0062\006\020\036\032\0020\006H\bR\030\020\b\032\n\022\006\022\004\030\0010\n0\tX\004¢\006\004\n\002\020\013R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\f\020\rR\036\020\017\032\0020\0062\006\020\016\032\0020\006@RX\016¢\006\b\n\000\032\004\b\020\020\rR\016\020\021\032\0020\006X\016¢\006\002\n\000¨\006("}, d2={"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "capacity", "", "(I)V", "buffer", "", "", "[Ljava/lang/Object;", "getCapacity", "()I", "<set-?>", "size", "getSize", "startIndex", "add", "", "element", "(Ljava/lang/Object;)V", "get", "index", "(I)Ljava/lang/Object;", "isFull", "", "iterator", "", "removeFirst", "n", "toArray", "()[Ljava/lang/Object;", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "fill", "fromIndex", "toIndex", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "forward", "kotlin-stdlib"})
final class RingBuffer<T>
  extends AbstractList<T>
  implements RandomAccess
{
  private final Object[] buffer;
  private int startIndex;
  private int size;
  private final int capacity;
  
  public final int getCapacity() { return capacity; } public RingBuffer(int capacity) { this.capacity = capacity;
    
    int i = this.capacity >= 0 ? 1 : 0; if (i == 0) { int $i$a$1$require; String str = "ring buffer capacity should not be negative but it is " + this.capacity;throw ((Throwable)new IllegalArgumentException(str.toString()));
    }
    
    buffer = new Object[this.capacity];
  }
  
  public int getSize() { return size; }
  





  public final boolean isFull()
  {
    return size() == capacity;
  }
  










  @NotNull
  public Iterator<T> iterator()
  {
    (Iterator)new AbstractIterator()
    {
      private int count;
      private int index;
      
      protected void computeNext()
      {
        if (count == 0) {
          done();
        }
        else {
          setNext(RingBuffer.access$getBuffer$p(this$0)[index]);
          int j = index;RingBuffer localRingBuffer1 = this$0;int k = 1;1 local1 = this;
          















          int $i$f$forward;
          















          int n$iv;
          















          int $receiver$iv;
          















          RingBuffer this_$iv;
          














          int m = ($receiver$iv + n$iv) % this_$iv.getCapacity();index = m;
          int i;
          count = ((i = count) + -1);
        }
      }
    };
  }
  
  @NotNull
  public <T> T[] toArray(@NotNull T[] array) {
    Intrinsics.checkParameterIsNotNull(array, "array");Object[] arrayOfObject1 = array;int i = size(); Object[] tmp29_26 = Arrays.copyOf(arrayOfObject1, i);Intrinsics.checkExpressionValueIsNotNull(tmp29_26, "java.util.Arrays.copyOf(this, newSize)");Object[] result = array.length < size() ? tmp29_26 : array;
    
    int size = size();
    
    int widx = 0;
    int idx = startIndex;
    
    while ((widx < size) && (idx < capacity)) {
      result[widx] = buffer[idx];
      widx++;
      idx++;
    }
    
    idx = 0;
    while (widx < size) {
      result[widx] = buffer[idx];
      widx++;
      idx++;
    }
    if (result.length > size()) { result[size()] = null;
    }
    Object[] tmp135_134 = result;
    















































































































































    if (tmp135_134 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>"); return tmp135_134;
  }
  
  @NotNull
  public Object[] toArray() { return toArray(new Object[size()]); }
  



  public final void add(T element)
  {
    if (isFull()) {
      throw ((Throwable)new IllegalStateException("ring buffer is full"));
    }
    
    int j = startIndex;RingBuffer localRingBuffer1 = this;int k = size();Object[] arrayOfObject = buffer;
    






    int $i$f$forward;
    






    int n$iv;
    






    int $receiver$iv;
    






    RingBuffer this_$iv;
    






    int m = ($receiver$iv + n$iv) % this_$iv.getCapacity();arrayOfObject[m] = element;
    int i;
    size = ((i = size()) + 1);
  }
  


  public final void removeFirst(int n)
  {
    int i = n >= 0 ? 1 : 0; String str; if (i == 0) { int $i$a$1$require; str = "n shouldn't be negative but it is " + n;throw ((Throwable)new IllegalArgumentException(str.toString())); }
    i = n <= size() ? 1 : 0; if (i == 0) { int $i$a$2$require; str = "n shouldn't be greater than the buffer size: n = " + n + ", size = " + size();throw ((Throwable)new IllegalArgumentException(str.toString()));
    }
    if (n > 0) {
      int start = startIndex;
      int j = start;RingBuffer this_$iv = this; int $i$f$forward; int $receiver$iv; int end = 
      


























        ($receiver$iv + n) % this_$iv.getCapacity();
      if (start > end) {
        fill(buffer, null, start, capacity);
        fill(buffer, null, 0, end);
      } else {
        fill(buffer, null, start, end);
      }
      
      startIndex = end;
      size = (size() - n);
    }
  }
  
  private final int forward(int $receiver, int n) {
    ;
    return ($receiver + n) % getCapacity();
  }
  
  private final <T> void fill(@NotNull T[] $receiver, T element, int fromIndex, int toIndex) {
    int i = fromIndex; int idx; for (int j = toIndex; i < j; idx++) {
      $receiver[idx] = element;
    }
  }
  
  public T get(int index)
  {
    AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, size());
    
    int i = startIndex;RingBuffer localRingBuffer1 = this;Object[] arrayOfObject = buffer;
    























    int $i$f$forward;
    























    int $receiver$iv;
    























    RingBuffer this_$iv;
    






















    int j = ($receiver$iv + index) % this_$iv.getCapacity();return arrayOfObject[j];
  }
}

package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;




































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000.\n\002\030\002\n\000\n\002\020\036\n\000\n\002\020\021\n\000\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\f\n\002\020(\n\000\n\002\020\000\n\000\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\035\022\016\020\003\032\n\022\006\b\001\022\0028\0000\004\022\006\020\005\032\0020\006¢\006\002\020\007J\026\020\020\032\0020\0062\006\020\021\032\0028\000H\002¢\006\002\020\022J\026\020\023\032\0020\0062\f\020\024\032\b\022\004\022\0028\0000\002H\026J\b\020\025\032\0020\006H\026J\017\020\026\032\b\022\004\022\0028\0000\027H\002J\025\020\030\032\f\022\b\b\001\022\004\030\0010\0310\004¢\006\002\020\016R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\005\020\bR\024\020\t\032\0020\n8VX\004¢\006\006\032\004\b\013\020\fR\033\020\003\032\n\022\006\b\001\022\0028\0000\004¢\006\n\n\002\020\017\032\004\b\r\020\016¨\006\032"}, d2={"Lkotlin/collections/ArrayAsCollection;", "T", "", "values", "", "isVarargs", "", "([Ljava/lang/Object;Z)V", "()Z", "size", "", "getSize", "()I", "getValues", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "contains", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "isEmpty", "iterator", "", "toArray", "", "kotlin-stdlib"})
final class ArrayAsCollection<T>
  implements Collection<T>, KMappedMarker
{
  @NotNull
  private final T[] values;
  private final boolean isVarargs;
  
  @NotNull
  public final T[] getValues() { return values; } public final boolean isVarargs() { return isVarargs; } public ArrayAsCollection(@NotNull T[] values, boolean isVarargs) { this.values = values;this.isVarargs = isVarargs; }
  public int getSize() { return values.length; }
  public boolean isEmpty() { Object[] arrayOfObject = values;return arrayOfObject.length == 0; }
  public boolean contains(Object element) { return ArraysKt.contains(values, element); }
  @NotNull
  public Iterator<T> iterator() { return ArrayIteratorKt.iterator(values); }
  @NotNull
  public final Object[] toArray() { return CollectionsKt.copyToArrayOfAny(values, isVarargs); }
  
  /* Error */
  public boolean containsAll(@NotNull Collection<? extends Object> elements)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 37
    //   3: invokestatic 43	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: checkcast 45	java/lang/Iterable
    //   10: astore_2
    //   11: aload_2
    //   12: checkcast 7	java/util/Collection
    //   15: invokeinterface 47 1 0
    //   20: ifeq +7 -> 27
    //   23: iconst_1
    //   24: goto +48 -> 72
    //   27: aload_2
    //   28: invokeinterface 51 1 0
    //   33: astore_3
    //   34: aload_3
    //   35: invokeinterface 56 1 0
    //   40: ifeq +31 -> 71
    //   43: aload_3
    //   44: invokeinterface 60 1 0
    //   49: astore 4
    //   51: aload 4
    //   53: astore 5
    //   55: aload_0
    //   56: aload 5
    //   58: invokevirtual 62	kotlin/collections/ArrayAsCollection:contains	(Ljava/lang/Object;)Z
    //   61: ifne -27 -> 34
    //   64: iconst_0
    //   65: goto +7 -> 72
    //   68: nop
    //   69: nop
    //   70: athrow
    //   71: iconst_1
    //   72: ireturn
    // Line number table:
    //   Java source line #59	-> byte code offset #6
    //   Java source line #395	-> byte code offset #11
    //   Java source line #396	-> byte code offset #27
    //   Java source line #59	-> byte code offset #55
    //   Java source line #397	-> byte code offset #71
    //   Java source line #59	-> byte code offset #72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	ArrayAsCollection
    //   0	73	1	elements	Collection
    //   11	61	2	$receiver$iv	Iterable
    //   51	17	4	element$iv	Object
    //   55	6	5	it	Object
    //   55	6	6	$i$a$1$all	int
    //   11	61	7	$i$f$all	int
  }
  
  public boolean add(T paramT)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean addAll(Collection<? extends T> paramCollection)
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
  
  public boolean removeAll(Collection<? extends Object> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean retainAll(Collection<? extends Object> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    return CollectionToArray.toArray(this, paramArrayOfT);
  }
}

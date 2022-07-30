package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\f\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\000*\006\b\000\020\001 \0012\0020\002B\025\022\006\020\003\032\0020\004\022\006\020\005\032\0028\000¢\006\002\020\006J\t\020\f\032\0020\004HÆ\003J\016\020\r\032\0028\000HÆ\003¢\006\002\020\nJ(\020\016\032\b\022\004\022\0028\0000\0002\b\b\002\020\003\032\0020\0042\b\b\002\020\005\032\0028\000HÆ\001¢\006\002\020\017J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\002HÖ\003J\t\020\023\032\0020\004HÖ\001J\t\020\024\032\0020\025HÖ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\007\020\bR\023\020\005\032\0028\000¢\006\n\n\002\020\013\032\004\b\t\020\n¨\006\026"}, d2={"Lkotlin/collections/IndexedValue;", "T", "", "index", "", "value", "(ILjava/lang/Object;)V", "getIndex", "()I", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(ILjava/lang/Object;)Lkotlin/collections/IndexedValue;", "equals", "", "other", "hashCode", "toString", "", "kotlin-stdlib"})
public final class IndexedValue<T>
{
  private final int index;
  private final T value;
  
  public boolean equals(@Nullable Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof IndexedValue))
      {
        IndexedValue localIndexedValue = (IndexedValue)paramObject;
        if ((index == index ? 1 : 0) != 0) {
          if (!Intrinsics.areEqual(value, value)) {}
        }
      }
    }
    else {
      return true;
    }
    return false;
  }
  
  /* Error */
  public int hashCode()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 11	kotlin/collections/IndexedValue:index	I
    //   4: bipush 31
    //   6: imul
    //   7: aload_0
    //   8: getfield 20	kotlin/collections/IndexedValue:value	Ljava/lang/Object;
    //   11: dup
    //   12: ifnull +9 -> 21
    //   15: invokevirtual 62	java/lang/Object:hashCode	()I
    //   18: goto +5 -> 23
    //   21: pop
    //   22: iconst_0
    //   23: iadd
    //   24: ireturn
  }
  
  @NotNull
  public String toString()
  {
    return "IndexedValue(index=" + index + ", value=" + value + ")";
  }
  
  @NotNull
  public final IndexedValue<T> copy(int index, T value)
  {
    return new IndexedValue(index, value);
  }
  
  public final T component2()
  {
    return value;
  }
  
  public final int component1()
  {
    return index;
  }
  
  public IndexedValue(int index, T value)
  {
    this.index = index;this.value = value; } public final T getValue() { return value; } public final int getIndex() { return index; }
}

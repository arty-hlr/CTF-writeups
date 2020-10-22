package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

















































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000,\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\017\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\006\b\000\020\001 \001*\006\b\001\020\002 \001*\006\b\002\020\003 \0012\0060\004j\002`\005B\035\022\006\020\006\032\0028\000\022\006\020\007\032\0028\001\022\006\020\b\032\0028\002¢\006\002\020\tJ\016\020\017\032\0028\000HÆ\003¢\006\002\020\013J\016\020\020\032\0028\001HÆ\003¢\006\002\020\013J\016\020\021\032\0028\002HÆ\003¢\006\002\020\013J>\020\022\032\024\022\004\022\0028\000\022\004\022\0028\001\022\004\022\0028\0020\0002\b\b\002\020\006\032\0028\0002\b\b\002\020\007\032\0028\0012\b\b\002\020\b\032\0028\002HÆ\001¢\006\002\020\023J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\027HÖ\003J\t\020\030\032\0020\031HÖ\001J\b\020\032\032\0020\033H\026R\023\020\006\032\0028\000¢\006\n\n\002\020\f\032\004\b\n\020\013R\023\020\007\032\0028\001¢\006\n\n\002\020\f\032\004\b\r\020\013R\023\020\b\032\0028\002¢\006\n\n\002\020\f\032\004\b\016\020\013¨\006\034"}, d2={"Lkotlin/Triple;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "third", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "getThird", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"})
public final class Triple<A, B, C>
  implements Serializable
{
  private final A first;
  private final B second;
  private final C third;
  
  public Triple(A first, B second, C third)
  {
    this.first = first;this.second = second;this.third = third; }
  public final A getFirst() { return first; }
  public final B getSecond() { return second; }
  public final C getThird() { return third; }
  

  @NotNull
  public String toString()
  {
    return '(' + first + ", " + second + ", " + third + ')';
  }
  
  public final A component1()
  {
    return first;
  }
  
  public final B component2()
  {
    return second;
  }
  
  public final C component3()
  {
    return third;
  }
  
  @NotNull
  public final Triple<A, B, C> copy(A first, B second, C third)
  {
    return new Triple(first, second, third);
  }
  
  /* Error */
  public int hashCode()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 24	kotlin/Triple:first	Ljava/lang/Object;
    //   4: dup
    //   5: ifnull +9 -> 14
    //   8: invokevirtual 66	java/lang/Object:hashCode	()I
    //   11: goto +5 -> 16
    //   14: pop
    //   15: iconst_0
    //   16: bipush 31
    //   18: imul
    //   19: aload_0
    //   20: getfield 35	kotlin/Triple:second	Ljava/lang/Object;
    //   23: dup
    //   24: ifnull +9 -> 33
    //   27: invokevirtual 66	java/lang/Object:hashCode	()I
    //   30: goto +5 -> 35
    //   33: pop
    //   34: iconst_0
    //   35: iadd
    //   36: bipush 31
    //   38: imul
    //   39: aload_0
    //   40: getfield 38	kotlin/Triple:third	Ljava/lang/Object;
    //   43: dup
    //   44: ifnull +9 -> 53
    //   47: invokevirtual 66	java/lang/Object:hashCode	()I
    //   50: goto +5 -> 55
    //   53: pop
    //   54: iconst_0
    //   55: iadd
    //   56: ireturn
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof Triple))
      {
        Triple localTriple = (Triple)paramObject;
        if ((!Intrinsics.areEqual(first, first)) || (!Intrinsics.areEqual(second, second)) || (!Intrinsics.areEqual(third, third))) {}
      }
    }
    else {
      return true;
    }
    return false;
  }
}

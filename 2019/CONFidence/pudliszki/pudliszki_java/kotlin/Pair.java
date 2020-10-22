package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;










@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000,\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\006\b\000\020\001 \001*\006\b\001\020\002 \0012\0060\003j\002`\004B\025\022\006\020\005\032\0028\000\022\006\020\006\032\0028\001¢\006\002\020\007J\016\020\f\032\0028\000HÆ\003¢\006\002\020\tJ\016\020\r\032\0028\001HÆ\003¢\006\002\020\tJ.\020\016\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\b\b\002\020\005\032\0028\0002\b\b\002\020\006\032\0028\001HÆ\001¢\006\002\020\017J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\023HÖ\003J\t\020\024\032\0020\025HÖ\001J\b\020\026\032\0020\027H\026R\023\020\005\032\0028\000¢\006\n\n\002\020\n\032\004\b\b\020\tR\023\020\006\032\0028\001¢\006\n\n\002\020\n\032\004\b\013\020\t¨\006\030"}, d2={"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"})
public final class Pair<A, B>
  implements Serializable
{
  private final A first;
  private final B second;
  
  public Pair(A first, B second)
  {
    this.first = first;this.second = second; }
  public final A getFirst() { return first; }
  public final B getSecond() { return second; }
  

  @NotNull
  public String toString()
  {
    return '(' + first + ", " + second + ')';
  }
  
  public final A component1()
  {
    return first;
  }
  
  public final B component2()
  {
    return second;
  }
  
  @NotNull
  public final Pair<A, B> copy(A first, B second)
  {
    return new Pair(first, second);
  }
  
  /* Error */
  public int hashCode()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 24	kotlin/Pair:first	Ljava/lang/Object;
    //   4: dup
    //   5: ifnull +9 -> 14
    //   8: invokevirtual 60	java/lang/Object:hashCode	()I
    //   11: goto +5 -> 16
    //   14: pop
    //   15: iconst_0
    //   16: bipush 31
    //   18: imul
    //   19: aload_0
    //   20: getfield 35	kotlin/Pair:second	Ljava/lang/Object;
    //   23: dup
    //   24: ifnull +9 -> 33
    //   27: invokevirtual 60	java/lang/Object:hashCode	()I
    //   30: goto +5 -> 35
    //   33: pop
    //   34: iconst_0
    //   35: iadd
    //   36: ireturn
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof Pair))
      {
        Pair localPair = (Pair)paramObject;
        if ((!Intrinsics.areEqual(first, first)) || (!Intrinsics.areEqual(second, second))) {}
      }
    }
    else {
      return true;
    }
    return false;
  }
}

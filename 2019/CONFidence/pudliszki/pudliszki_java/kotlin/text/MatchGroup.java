package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\003HÖ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\024"}, d2={"Lkotlin/text/MatchGroup;", "", "value", "", "range", "Lkotlin/ranges/IntRange;", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "getRange", "()Lkotlin/ranges/IntRange;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-stdlib"})
public final class MatchGroup
{
  @NotNull
  private final String value;
  @NotNull
  private final IntRange range;
  
  public boolean equals(@Nullable Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof MatchGroup))
      {
        MatchGroup localMatchGroup = (MatchGroup)paramObject;
        if ((!Intrinsics.areEqual(value, value)) || (!Intrinsics.areEqual(range, range))) {}
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
    //   1: getfield 11	kotlin/text/MatchGroup:value	Ljava/lang/String;
    //   4: dup
    //   5: ifnull +9 -> 14
    //   8: invokevirtual 65	java/lang/Object:hashCode	()I
    //   11: goto +5 -> 16
    //   14: pop
    //   15: iconst_0
    //   16: bipush 31
    //   18: imul
    //   19: aload_0
    //   20: getfield 19	kotlin/text/MatchGroup:range	Lkotlin/ranges/IntRange;
    //   23: dup
    //   24: ifnull +9 -> 33
    //   27: invokevirtual 65	java/lang/Object:hashCode	()I
    //   30: goto +5 -> 35
    //   33: pop
    //   34: iconst_0
    //   35: iadd
    //   36: ireturn
  }
  
  @NotNull
  public String toString()
  {
    return "MatchGroup(value=" + value + ", range=" + range + ")";
  }
  
  @NotNull
  public final MatchGroup copy(@NotNull String value, @NotNull IntRange range)
  {
    Intrinsics.checkParameterIsNotNull(value, "value");
    Intrinsics.checkParameterIsNotNull(range, "range");
    return new MatchGroup(value, range);
  }
  
  @NotNull
  public final IntRange component2()
  {
    return range;
  }
  
  @NotNull
  public final String component1()
  {
    return value;
  }
  
  public MatchGroup(@NotNull String value, @NotNull IntRange range)
  {
    this.value = value;this.range = range; } @NotNull
  public final IntRange getRange() { return range; } @NotNull
  public final String getValue() { return value; }
}

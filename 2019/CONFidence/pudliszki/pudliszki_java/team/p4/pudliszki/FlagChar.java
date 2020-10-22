package team.p4.pudliszki;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\000\n\002\020\000\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\004\b\000\020\0012\0020\002B\r\022\006\020\003\032\0028\000¢\006\002\020\004J\016\020\b\032\0028\000HÆ\003¢\006\002\020\006J\036\020\t\032\b\022\004\022\0028\0000\0002\b\b\002\020\003\032\0028\000HÆ\001¢\006\002\020\nJ\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\002HÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\023\020\003\032\0028\000¢\006\n\n\002\020\007\032\004\b\005\020\006¨\006\022"}, d2={"Lteam/p4/pudliszki/FlagChar;", "T", "", "c", "(Ljava/lang/Object;)V", "getC", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lteam/p4/pudliszki/FlagChar;", "equals", "", "other", "hashCode", "", "toString", "", "pudliszki"})
public final class FlagChar<T>
{
  private final T c;
  
  public boolean equals(@Nullable Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof FlagChar))
      {
        FlagChar localFlagChar = (FlagChar)paramObject;
        if (!Intrinsics.areEqual(c, c)) {}
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
    //   1: getfield 13	team/p4/pudliszki/FlagChar:c	Ljava/lang/Object;
    //   4: dup
    //   5: ifnull +9 -> 14
    //   8: invokevirtual 54	java/lang/Object:hashCode	()I
    //   11: goto +5 -> 16
    //   14: pop
    //   15: iconst_0
    //   16: ireturn
  }
  
  @NotNull
  public String toString()
  {
    return "FlagChar(c=" + c + ")";
  }
  
  @NotNull
  public final FlagChar<T> copy(T c)
  {
    return new FlagChar(c);
  }
  
  public final T component1()
  {
    return c;
  }
  
  public FlagChar(T c) { this.c = c; } public final T getC() { return c; }
}

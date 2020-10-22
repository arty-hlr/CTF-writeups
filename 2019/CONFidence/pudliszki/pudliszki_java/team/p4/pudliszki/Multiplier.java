package team.p4.pudliszki;

import kotlin.Metadata;















































































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\006\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\006\020\b\032\0020\003R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\004¨\006\t"}, d2={"Lteam/p4/pudliszki/Multiplier;", "", "m", "", "(I)V", "getM", "()I", "setM", "get", "pudliszki"})
public final class Multiplier
{
  private int m;
  
  public Multiplier()
  {
    this(0, 1, null);
  }
  
  public Multiplier(int m) { this.m = m; } public final void setM(int <set-?>) { m = <set-?>; } public final int getM() { return m; }
  
  public final int get() { m *= 32;
    return m / 32;
  }
}

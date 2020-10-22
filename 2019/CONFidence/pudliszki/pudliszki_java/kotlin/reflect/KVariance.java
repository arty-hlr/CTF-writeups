package kotlin.reflect;

import kotlin.Metadata;
import kotlin.SinceKotlin;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\006"}, d2={"Lkotlin/reflect/KVariance;", "", "(Ljava/lang/String;I)V", "INVARIANT", "IN", "OUT", "kotlin-stdlib"})
@SinceKotlin(version="1.1")
public enum KVariance
{
  static
  {
    KVariance[] tmp5_1 = new KVariance[3];
    void tmp17_14 = new KVariance("INVARIANT", 0);
    INVARIANT = tmp17_14;
    tmp5_1[0] = tmp17_14;
    KVariance[] tmp22_5 = tmp5_1;
    void tmp34_31 = new KVariance("IN", 1);
    IN = tmp34_31;
    tmp22_5[1] = tmp34_31;
    KVariance[] tmp39_22 = tmp22_5;
    void tmp51_48 = new KVariance("OUT", 2);
    OUT = tmp51_48;
    tmp39_22[2] = tmp51_48;
  }
  
  private KVariance() {}
}

package kotlin.reflect;

import kotlin.Metadata;
import kotlin.SinceKotlin;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\f\n\002\030\002\n\002\020\020\n\002\b\006\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006¨\006\007"}, d2={"Lkotlin/reflect/KVisibility;", "", "(Ljava/lang/String;I)V", "PUBLIC", "PROTECTED", "INTERNAL", "PRIVATE", "kotlin-stdlib"})
@SinceKotlin(version="1.1")
public enum KVisibility
{
  static
  {
    KVisibility[] tmp5_1 = new KVisibility[4];
    void tmp17_14 = new KVisibility("PUBLIC", 0);
    PUBLIC = tmp17_14;
    tmp5_1[0] = tmp17_14;
    KVisibility[] tmp22_5 = tmp5_1;
    void tmp34_31 = new KVisibility("PROTECTED", 1);
    PROTECTED = tmp34_31;
    tmp22_5[1] = tmp34_31;
    KVisibility[] tmp39_22 = tmp22_5;
    void tmp51_48 = new KVisibility("INTERNAL", 2);
    INTERNAL = tmp51_48;
    tmp39_22[2] = tmp51_48;
    KVisibility[] tmp56_39 = tmp39_22;
    void tmp68_65 = new KVisibility("PRIVATE", 3);
    PRIVATE = tmp68_65;
    tmp56_39[3] = tmp68_65;
  }
  
  private KVisibility() {}
}

package kotlin;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\006"}, d2={"Lkotlin/LazyThreadSafetyMode;", "", "(Ljava/lang/String;I)V", "SYNCHRONIZED", "PUBLICATION", "NONE", "kotlin-stdlib"})
public enum LazyThreadSafetyMode
{
  static
  {
    LazyThreadSafetyMode[] tmp5_1 = new LazyThreadSafetyMode[3];
    void tmp17_14 = new LazyThreadSafetyMode("SYNCHRONIZED", 0);
    SYNCHRONIZED = tmp17_14;
    tmp5_1[0] = tmp17_14;
    LazyThreadSafetyMode[] tmp22_5 = tmp5_1;
    void tmp34_31 = new LazyThreadSafetyMode("PUBLICATION", 1);
    PUBLICATION = tmp34_31;
    tmp22_5[1] = tmp34_31;
    LazyThreadSafetyMode[] tmp39_22 = tmp22_5;
    void tmp51_48 = new LazyThreadSafetyMode("NONE", 2);
    NONE = tmp51_48;
    tmp39_22[2] = tmp51_48;
  }
  
  private LazyThreadSafetyMode() {}
}

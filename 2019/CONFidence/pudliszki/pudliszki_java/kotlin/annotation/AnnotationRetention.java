package kotlin.annotation;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\006"}, d2={"Lkotlin/annotation/AnnotationRetention;", "", "(Ljava/lang/String;I)V", "SOURCE", "BINARY", "RUNTIME", "kotlin-stdlib"})
public enum AnnotationRetention
{
  static
  {
    AnnotationRetention[] tmp5_1 = new AnnotationRetention[3];
    void tmp17_14 = new AnnotationRetention("SOURCE", 0);
    SOURCE = tmp17_14;
    tmp5_1[0] = tmp17_14;
    AnnotationRetention[] tmp22_5 = tmp5_1;
    void tmp34_31 = new AnnotationRetention("BINARY", 1);
    BINARY = tmp34_31;
    tmp22_5[1] = tmp34_31;
    AnnotationRetention[] tmp39_22 = tmp22_5;
    void tmp51_48 = new AnnotationRetention("RUNTIME", 2);
    RUNTIME = tmp51_48;
    tmp39_22[2] = tmp51_48;
  }
  
  private AnnotationRetention() {}
}

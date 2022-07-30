package kotlin.io;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\f\n\002\030\002\n\002\020\020\n\002\b\004\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\005"}, d2={"Lkotlin/io/OnErrorAction;", "", "(Ljava/lang/String;I)V", "SKIP", "TERMINATE", "kotlin-stdlib"})
public enum OnErrorAction
{
  static
  {
    OnErrorAction[] tmp5_1 = new OnErrorAction[2];
    void tmp17_14 = new OnErrorAction("SKIP", 0);
    SKIP = tmp17_14;
    tmp5_1[0] = tmp17_14;
    OnErrorAction[] tmp22_5 = tmp5_1;
    void tmp34_31 = new OnErrorAction("TERMINATE", 1);
    TERMINATE = tmp34_31;
    tmp22_5[1] = tmp34_31;
  }
  
  private OnErrorAction() {}
}

package kotlin.io;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\f\n\002\030\002\n\002\020\020\n\002\b\004\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\005"}, d2={"Lkotlin/io/FileWalkDirection;", "", "(Ljava/lang/String;I)V", "TOP_DOWN", "BOTTOM_UP", "kotlin-stdlib"})
public enum FileWalkDirection
{
  static
  {
    FileWalkDirection[] tmp5_1 = new FileWalkDirection[2];
    void tmp17_14 = new FileWalkDirection("TOP_DOWN", 0);
    TOP_DOWN = tmp17_14;
    tmp5_1[0] = tmp17_14;
    FileWalkDirection[] tmp22_5 = tmp5_1;
    void tmp34_31 = new FileWalkDirection("BOTTOM_UP", 1);
    BOTTOM_UP = tmp34_31;
    tmp22_5[1] = tmp34_31;
  }
  
  private FileWalkDirection() {}
}

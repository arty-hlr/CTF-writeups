package kotlin.jvm.internal;

import kotlin.Metadata;





















@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\n\n\002\b\002\n\002\020\b\n\002\b\002\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\007XT¢\006\002\n\000R\016\020\b\032\0020\007XT¢\006\002\n\000¨\006\t"}, d2={"Lkotlin/jvm/internal/ShortCompanionObject;", "", "()V", "MAX_VALUE", "", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"})
public final class ShortCompanionObject
{
  public static final short MIN_VALUE = -32768;
  public static final short MAX_VALUE = 32767;
  public static final int SIZE_BYTES = 2;
  public static final int SIZE_BITS = 16;
  public static final ShortCompanionObject INSTANCE;
  
  private ShortCompanionObject() {}
  
  static
  {
    ShortCompanionObject localShortCompanionObject = new ShortCompanionObject();INSTANCE = localShortCompanionObject;
  }
}

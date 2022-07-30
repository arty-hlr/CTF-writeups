package kotlin.jvm.internal;

import kotlin.Metadata;














@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\t\n\002\b\002\n\002\020\b\n\002\b\002\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\007XT¢\006\002\n\000R\016\020\b\032\0020\007XT¢\006\002\n\000¨\006\t"}, d2={"Lkotlin/jvm/internal/LongCompanionObject;", "", "()V", "MAX_VALUE", "", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"})
public final class LongCompanionObject
{
  public static final long MIN_VALUE = Long.MIN_VALUE;
  public static final long MAX_VALUE = Long.MAX_VALUE;
  public static final int SIZE_BYTES = 8;
  public static final int SIZE_BITS = 64;
  public static final LongCompanionObject INSTANCE;
  
  private LongCompanionObject() {}
  
  static
  {
    LongCompanionObject localLongCompanionObject = new LongCompanionObject();INSTANCE = localLongCompanionObject;
  }
}

package kotlin.jvm.internal;

import kotlin.Metadata;







@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\007\n\002\b\013\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006R\024\020\007\032\0020\004XD¢\006\b\n\000\032\004\b\b\020\006R\024\020\t\032\0020\004XD¢\006\b\n\000\032\004\b\n\020\006R\024\020\013\032\0020\004XD¢\006\b\n\000\032\004\b\f\020\006R\024\020\r\032\0020\004XD¢\006\b\n\000\032\004\b\016\020\006¨\006\017"}, d2={"Lkotlin/jvm/internal/FloatCompanionObject;", "", "()V", "MAX_VALUE", "", "getMAX_VALUE", "()F", "MIN_VALUE", "getMIN_VALUE", "NEGATIVE_INFINITY", "getNEGATIVE_INFINITY", "NaN", "getNaN", "POSITIVE_INFINITY", "getPOSITIVE_INFINITY", "kotlin-stdlib"})
public final class FloatCompanionObject
{
  static
  {
    FloatCompanionObject localFloatCompanionObject = new FloatCompanionObject();INSTANCE = localFloatCompanionObject; }
  public final float getMIN_VALUE() { return MIN_VALUE; } private static final float MIN_VALUE = Float.MIN_VALUE;
  public final float getMAX_VALUE() { return MAX_VALUE; } private static final float MAX_VALUE = Float.MAX_VALUE;
  public final float getPOSITIVE_INFINITY() { return POSITIVE_INFINITY; } private static final float POSITIVE_INFINITY = Float.POSITIVE_INFINITY;
  public final float getNEGATIVE_INFINITY() { return NEGATIVE_INFINITY; } private static final float NEGATIVE_INFINITY = Float.NEGATIVE_INFINITY;
  public final float getNaN() { return NaN; } private static final float NaN = NaN.0F;
  public static final FloatCompanionObject INSTANCE;
  
  private FloatCompanionObject() {}
}

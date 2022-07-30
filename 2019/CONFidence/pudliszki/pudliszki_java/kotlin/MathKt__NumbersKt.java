package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000&\n\000\n\002\020\006\n\002\030\002\n\000\n\002\020\t\n\002\020\007\n\002\030\002\n\002\020\b\n\000\n\002\020\013\n\002\b\005\032\025\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\b\032\025\020\000\032\0020\005*\0020\0062\006\020\003\032\0020\007H\b\032\r\020\b\032\0020\t*\0020\001H\b\032\r\020\b\032\0020\t*\0020\005H\b\032\r\020\n\032\0020\t*\0020\001H\b\032\r\020\n\032\0020\t*\0020\005H\b\032\r\020\013\032\0020\t*\0020\001H\b\032\r\020\013\032\0020\t*\0020\005H\b\032\r\020\f\032\0020\004*\0020\001H\b\032\r\020\f\032\0020\007*\0020\005H\b\032\r\020\r\032\0020\004*\0020\001H\b\032\r\020\r\032\0020\007*\0020\005H\b¨\006\016"}, d2={"fromBits", "", "Lkotlin/Double$Companion;", "bits", "", "", "Lkotlin/Float$Companion;", "", "isFinite", "", "isInfinite", "isNaN", "toBits", "toRawBits", "kotlin-stdlib"}, xs="kotlin/MathKt")
class MathKt__NumbersKt extends MathKt__BigIntegersKt
{
  @InlineOnly
  private static final boolean isNaN(double $receiver)
  {
    ;
    return Double.isNaN($receiver);
  }
  
  @InlineOnly
  private static final boolean isNaN(float $receiver)
  {
    ;
    return Float.isNaN($receiver);
  }
  
  @InlineOnly
  private static final boolean isInfinite(double $receiver) {
    ;
    return Double.isInfinite($receiver);
  }
  
  @InlineOnly
  private static final boolean isInfinite(float $receiver) {
    ;
    return Float.isInfinite($receiver);
  }
  
  @InlineOnly
  private static final boolean isFinite(double $receiver) {
    ;
    double d = $receiver; if (!Double.isInfinite(d)) d = $receiver; return !Double.isNaN(d);
  }
  
  @InlineOnly
  private static final boolean isFinite(float $receiver) {
    ;
    float f = $receiver; if (!Float.isInfinite(f)) f = $receiver; return !Float.isNaN(f);
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final long toBits(double $receiver)
  {
    ;
    return Double.doubleToLongBits($receiver);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final long toRawBits(double $receiver)
  {
    ;
    return Double.doubleToRawLongBits($receiver);
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double fromBits(@NotNull DoubleCompanionObject $receiver, long bits) {
    ;
    return Double.longBitsToDouble(bits);
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final int toBits(float $receiver)
  {
    ;
    return Float.floatToIntBits($receiver);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final int toRawBits(float $receiver)
  {
    ;
    return Float.floatToRawIntBits($receiver);
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float fromBits(@NotNull FloatCompanionObject $receiver, int bits) {
    ;
    return Float.intBitsToFloat(bits);
  }
  
  public MathKt__NumbersKt() {}
}

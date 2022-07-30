package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;





@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000T\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020\005\n\000\n\002\030\002\n\002\020\f\n\000\n\002\030\002\n\002\020\006\n\000\n\002\030\002\n\002\020\007\n\000\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\002\020\t\n\000\n\002\030\002\n\002\020\n\n\000\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\001\032\020\020\004\032\0020\0052\006\020\002\032\0020\006H\001\032\020\020\007\032\0020\b2\006\020\002\032\0020\tH\001\032\020\020\n\032\0020\0132\006\020\002\032\0020\fH\001\032\020\020\r\032\0020\0162\006\020\002\032\0020\017H\001\032\020\020\020\032\0020\0212\006\020\002\032\0020\022H\001\032\020\020\023\032\0020\0242\006\020\002\032\0020\025H\001\032\020\020\026\032\0020\0272\006\020\002\032\0020\030H\001¨\006\031"}, d2={"boxBoolean", "Ljava/lang/Boolean;", "primitive", "", "boxByte", "Ljava/lang/Byte;", "", "boxChar", "Ljava/lang/Character;", "", "boxDouble", "Ljava/lang/Double;", "", "boxFloat", "Ljava/lang/Float;", "", "boxInt", "Ljava/lang/Integer;", "", "boxLong", "Ljava/lang/Long;", "", "boxShort", "Ljava/lang/Short;", "", "kotlin-stdlib"})
@JvmName(name="Boxing")
public final class Boxing
{
  @SinceKotlin(version="1.3")
  @PublishedApi
  @NotNull
  public static final Boolean boxBoolean(boolean primitive) { return Boolean.valueOf(primitive); }
  @SinceKotlin(version="1.3")
  @PublishedApi
  @NotNull
  public static final Byte boxByte(byte primitive) { return Byte.valueOf(primitive); }
  @SinceKotlin(version="1.3")
  @PublishedApi
  @NotNull
  public static final Short boxShort(short primitive) { return new Short(primitive); }
  @SinceKotlin(version="1.3")
  @PublishedApi
  @NotNull
  public static final Integer boxInt(int primitive) { return new Integer(primitive); }
  @SinceKotlin(version="1.3")
  @PublishedApi
  @NotNull
  public static final Long boxLong(long primitive) { return new Long(primitive); }
  @SinceKotlin(version="1.3")
  @PublishedApi
  @NotNull
  public static final Float boxFloat(float primitive) { return new Float(primitive); }
  @SinceKotlin(version="1.3")
  @PublishedApi
  @NotNull
  public static final Double boxDouble(double primitive) { return new Double(primitive); }
  @SinceKotlin(version="1.3")
  @PublishedApi
  @NotNull
  public static final Character boxChar(char primitive) { return new Character(primitive); }
}

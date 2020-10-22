package kotlin;

import kotlin.internal.InlineOnly;



















































































































































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000 \n\000\n\002\030\002\n\002\020\005\n\000\n\002\020\b\n\000\n\002\020\t\n\000\n\002\020\n\n\002\b\002\032\025\020\000\032\0020\001*\0020\002H\bø\001\000¢\006\002\020\003\032\025\020\000\032\0020\001*\0020\004H\bø\001\000¢\006\002\020\005\032\025\020\000\032\0020\001*\0020\006H\bø\001\000¢\006\002\020\007\032\025\020\000\032\0020\001*\0020\bH\bø\001\000¢\006\002\020\t\002\004\n\002\b\031¨\006\n"}, d2={"toUInt", "Lkotlin/UInt;", "", "(B)I", "", "(I)I", "", "(J)I", "", "(S)I", "kotlin-stdlib"})
public final class UIntKt
{
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final int toUInt(byte $receiver)
  {
    ;
    return UInt.constructor-impl($receiver); }
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final int toUInt(short $receiver) { ; return UInt.constructor-impl($receiver); }
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final int toUInt(int $receiver) { ; return UInt.constructor-impl($receiver); }
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final int toUInt(long $receiver) { ; return UInt.constructor-impl((int)$receiver);
  }
}

package kotlin;

import kotlin.jvm.internal.Intrinsics;


@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000(\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\t\n\000\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\003\032\030\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\001H\001\032\"\020\004\032\0020\0052\006\020\002\032\0020\0052\006\020\003\032\0020\005H\001ø\001\000¢\006\004\b\006\020\007\032\"\020\b\032\0020\0052\006\020\002\032\0020\0052\006\020\003\032\0020\005H\001ø\001\000¢\006\004\b\t\020\007\032\030\020\n\032\0020\0012\006\020\002\032\0020\0132\006\020\003\032\0020\013H\001\032\"\020\f\032\0020\r2\006\020\002\032\0020\r2\006\020\003\032\0020\rH\001ø\001\000¢\006\004\b\016\020\017\032\"\020\020\032\0020\r2\006\020\002\032\0020\r2\006\020\003\032\0020\rH\001ø\001\000¢\006\004\b\021\020\017\032\020\020\022\032\0020\0232\006\020\024\032\0020\013H\000\032\030\020\022\032\0020\0232\006\020\024\032\0020\0132\006\020\025\032\0020\001H\000\002\004\n\002\b\031¨\006\026"}, d2={"uintCompare", "", "v1", "v2", "uintDivide", "Lkotlin/UInt;", "uintDivide-J1ME1BU", "(II)I", "uintRemainder", "uintRemainder-J1ME1BU", "ulongCompare", "", "ulongDivide", "Lkotlin/ULong;", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "ulongToString", "", "v", "base", "kotlin-stdlib"})
@kotlin.jvm.JvmName(name="UnsignedKt")
public final class UnsignedKt {
  @PublishedApi
  public static final int uintCompare(int v1, int v2) { return Intrinsics.compare(v1 ^ 0x80000000, v2 ^ 0x80000000); }
  @PublishedApi
  public static final int ulongCompare(long v1, long v2) { return (v1 ^ 0x8000000000000000) < (v2 ^ 0x8000000000000000); }
  
  @PublishedApi
  public static final int uintDivide-J1ME1BU(int v1, int v2) { int i = v1;i = v2;long l2 = i & 0xFFFFFFFF;long l3 = i & 0xFFFFFFFF;long l1 = l2 / l3;return UInt.constructor-impl((int)l1); }
  @PublishedApi
  public static final int uintRemainder-J1ME1BU(int v1, int v2) { int i = v1;i = v2;long l2 = i & 0xFFFFFFFF;long l3 = i & 0xFFFFFFFF;long l1 = l2 % l3;return UInt.constructor-impl((int)l1);
  }
  

  @PublishedApi
  public static final long ulongDivide-eb3DHEI(long v1, long v2)
  {
    long l1 = v1;long dividend = l1;
    long l2 = v2;long divisor = l2;
    if (divisor < 0L) {
      l2 = v1;return ulongCompare(l2, v2) < 0 ? ULong.constructor-impl(0L) : ULong.constructor-impl(1L);
    }
    

    if (dividend >= 0L) {
      return ULong.constructor-impl(dividend / divisor);
    }
    

    long quotient = (dividend >>> 1) / divisor << 1;
    long rem = dividend - quotient * divisor;
    long l3 = ULong.constructor-impl(rem);long l4 = ULong.constructor-impl(divisor);long l5 = quotient;int i = ulongCompare(l3, l4);return ULong.constructor-impl(l5 + (i >= 0 ? 1 : 0));
  }
  
  @PublishedApi
  public static final long ulongRemainder-eb3DHEI(long v1, long v2)
  {
    long l1 = v1;long dividend = l1;
    long l2 = v2;long divisor = l2;
    if (divisor < 0L) {
      l2 = v1;
      

      l2 = v1;return ulongCompare(l2, v2) < 0 ? v1 : ULong.constructor-impl(l2 - v2);
    }
    


    if (dividend >= 0L) {
      return ULong.constructor-impl(dividend % divisor);
    }
    

    long quotient = (dividend >>> 1) / divisor << 1;
    long rem = dividend - quotient * divisor;
    long l3 = ULong.constructor-impl(rem);long l4 = ULong.constructor-impl(divisor);long l5 = rem;int i = ulongCompare(l3, l4);return ULong.constructor-impl(l5 - (i >= 0 ? divisor : 0L));
  }
  
  @org.jetbrains.annotations.NotNull
  public static final String ulongToString(long v) { return ulongToString(v, 10); }
  
  @org.jetbrains.annotations.NotNull
  public static final String ulongToString(long v, int base) { if (v >= 0L) { long l1 = v; String tmp16_13 = Long.toString(l1, kotlin.text.CharsKt.checkRadix(base));Intrinsics.checkExpressionValueIsNotNull(tmp16_13, "java.lang.Long.toString(this, checkRadix(radix))");return tmp16_13;
    }
    long quotient = (v >>> 1) / base << 1;
    long rem = v - quotient * base;
    if (rem >= base) {
      rem -= base;
      quotient += 1L;
    }
    long l2 = quotient;StringBuilder localStringBuilder = new StringBuilder(); String tmp80_77 = Long.toString(l2, kotlin.text.CharsKt.checkRadix(base));Intrinsics.checkExpressionValueIsNotNull(tmp80_77, "java.lang.Long.toString(this, checkRadix(radix))");String str = tmp80_77;l2 = rem;tmp80_77 = tmp80_77.append(str); String tmp110_107 = Long.toString(l2, kotlin.text.CharsKt.checkRadix(base));Intrinsics.checkExpressionValueIsNotNull(tmp110_107, "java.lang.Long.toString(this, checkRadix(radix))");tmp110_107 = tmp110_107;return tmp110_107;
  }
}

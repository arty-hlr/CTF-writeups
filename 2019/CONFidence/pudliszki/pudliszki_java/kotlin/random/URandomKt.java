package kotlin.random;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000:\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\017\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\002\032\"\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\003H\001ø\001\000¢\006\004\b\005\020\006\032\"\020\007\032\0020\0012\006\020\002\032\0020\b2\006\020\004\032\0020\bH\001ø\001\000¢\006\004\b\t\020\n\032\034\020\013\032\0020\f*\0020\r2\006\020\016\032\0020\017H\007ø\001\000¢\006\002\020\020\032\036\020\013\032\0020\f*\0020\r2\006\020\021\032\0020\fH\007ø\001\000¢\006\004\b\022\020\023\0322\020\013\032\0020\f*\0020\r2\006\020\021\032\0020\f2\b\b\002\020\024\032\0020\0172\b\b\002\020\025\032\0020\017H\007ø\001\000¢\006\004\b\026\020\027\032\024\020\030\032\0020\003*\0020\rH\007ø\001\000¢\006\002\020\031\032\036\020\030\032\0020\003*\0020\r2\006\020\004\032\0020\003H\007ø\001\000¢\006\004\b\032\020\033\032&\020\030\032\0020\003*\0020\r2\006\020\002\032\0020\0032\006\020\004\032\0020\003H\007ø\001\000¢\006\004\b\034\020\035\032\034\020\030\032\0020\003*\0020\r2\006\020\036\032\0020\037H\007ø\001\000¢\006\002\020 \032\024\020!\032\0020\b*\0020\rH\007ø\001\000¢\006\002\020\"\032\036\020!\032\0020\b*\0020\r2\006\020\004\032\0020\bH\007ø\001\000¢\006\004\b#\020$\032&\020!\032\0020\b*\0020\r2\006\020\002\032\0020\b2\006\020\004\032\0020\bH\007ø\001\000¢\006\004\b%\020&\032\034\020!\032\0020\b*\0020\r2\006\020\036\032\0020'H\007ø\001\000¢\006\002\020(\002\004\n\002\b\031¨\006)"}, d2={"checkUIntRangeBounds", "", "from", "Lkotlin/UInt;", "until", "checkUIntRangeBounds-J1ME1BU", "(II)V", "checkULongRangeBounds", "Lkotlin/ULong;", "checkULongRangeBounds-eb3DHEI", "(JJ)V", "nextUBytes", "Lkotlin/UByteArray;", "Lkotlin/random/Random;", "size", "", "(Lkotlin/random/Random;I)[B", "array", "nextUBytes-EVgfTAA", "(Lkotlin/random/Random;[B)[B", "fromIndex", "toIndex", "nextUBytes-Wvrt4B4", "(Lkotlin/random/Random;[BII)[B", "nextUInt", "(Lkotlin/random/Random;)I", "nextUInt-qCasIEU", "(Lkotlin/random/Random;I)I", "nextUInt-a8DCA5k", "(Lkotlin/random/Random;II)I", "range", "Lkotlin/ranges/UIntRange;", "(Lkotlin/random/Random;Lkotlin/ranges/UIntRange;)I", "nextULong", "(Lkotlin/random/Random;)J", "nextULong-V1Xi4fY", "(Lkotlin/random/Random;J)J", "nextULong-jmpaW-c", "(Lkotlin/random/Random;JJ)J", "Lkotlin/ranges/ULongRange;", "(Lkotlin/random/Random;Lkotlin/ranges/ULongRange;)J", "kotlin-stdlib"})
public final class URandomKt
{
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final int nextUInt(@NotNull Random $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int i = $receiver.nextInt();return kotlin.UInt.constructor-impl(i);
  }
  




  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final int nextUInt-qCasIEU(@NotNull Random $receiver, int until)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return nextUInt-a8DCA5k($receiver, 0, until);
  }
  





  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final int nextUInt-a8DCA5k(@NotNull Random $receiver, int from, int until)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");checkUIntRangeBounds-J1ME1BU(from, until);
    
    int i = from;int signedFrom = i ^ 0x80000000;
    int j = until;int signedUntil = j ^ 0x80000000;
    
    int signedResult = $receiver.nextInt(signedFrom, signedUntil) ^ 0x80000000;
    int k = signedResult;return kotlin.UInt.constructor-impl(k);
  }
  







  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final int nextUInt(@NotNull Random $receiver, @NotNull kotlin.ranges.UIntRange range)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(range, "range"); if (range.isEmpty()) throw ((Throwable)new IllegalArgumentException("Cannot get random in empty range: " + range));
    int i = range.getLast();int j = -1;i = range.getLast();j = 1;int k = range.getFirst();Random localRandom = $receiver;int m = kotlin.UInt.constructor-impl(i + j);
    i = range.getFirst();j = 0;i = range.getFirst();j = 1;localRandom = $receiver;k = kotlin.UInt.constructor-impl(i - j);i = nextUInt-a8DCA5k(localRandom, k, range.getLast());j = 1;
    
    return kotlin.UnsignedKt.uintCompare(i, j) > 0 ? kotlin.UInt.constructor-impl(i + j) : kotlin.UnsignedKt.uintCompare(i, j) < 0 ? nextUInt-a8DCA5k(localRandom, k, m) : nextUInt($receiver);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final long nextULong(@NotNull Random $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");long l = $receiver.nextLong();return ULong.constructor-impl(l);
  }
  




  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final long nextULong-V1Xi4fY(@NotNull Random $receiver, long until)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return nextULong-jmpaW-c($receiver, 0L, until);
  }
  





  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final long nextULong-jmpaW-c(@NotNull Random $receiver, long from, long until)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");checkULongRangeBounds-eb3DHEI(from, until);
    
    long l1 = from;long signedFrom = l1 ^ 0x8000000000000000;
    long l2 = until;long signedUntil = l2 ^ 0x8000000000000000;
    
    long signedResult = $receiver.nextLong(signedFrom, signedUntil) ^ 0x8000000000000000;
    long l3 = signedResult;return ULong.constructor-impl(l3);
  }
  







  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final long nextULong(@NotNull Random $receiver, @NotNull kotlin.ranges.ULongRange range)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(range, "range"); if (range.isEmpty()) throw ((Throwable)new IllegalArgumentException("Cannot get random in empty range: " + range));
    long l1 = range.getLast();long l2 = -1L;l1 = range.getLast();int i = 1;long l6 = range.getFirst();Random localRandom = $receiver;long l4 = l1;int k = i;long l5 = ULong.constructor-impl(k & 0xFFFFFFFF);long l7 = ULong.constructor-impl(l4 + l5);
    l1 = range.getFirst();long l3 = 0L;l1 = range.getFirst();int j = 1;localRandom = $receiver;l4 = l1;k = j;l5 = ULong.constructor-impl(k & 0xFFFFFFFF);l6 = ULong.constructor-impl(l4 - l5);l1 = nextULong-jmpaW-c(localRandom, l6, range.getLast());j = 1;l4 = l1;k = j;l5 = ULong.constructor-impl(k & 0xFFFFFFFF);
    
    return kotlin.UnsignedKt.ulongCompare(l1, l3) > 0 ? ULong.constructor-impl(l4 + l5) : kotlin.UnsignedKt.ulongCompare(l1, l2) < 0 ? nextULong-jmpaW-c(localRandom, l6, l7) : nextULong($receiver);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final byte[] nextUBytes-EVgfTAA(@NotNull Random $receiver, @NotNull byte[] array)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(array, "array");byte[] arrayOfByte1 = array;Random localRandom = $receiver;byte[] arrayOfByte2 = arrayOfByte1;localRandom.nextBytes(arrayOfByte2);
    return array;
  }
  
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final byte[] nextUBytes(@NotNull Random $receiver, int size)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");byte[] arrayOfByte = $receiver.nextBytes(size);return kotlin.UByteArray.constructor-impl(arrayOfByte);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final byte[] nextUBytes-Wvrt4B4(@NotNull Random $receiver, @NotNull byte[] array, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(array, "array");byte[] arrayOfByte1 = array;Random localRandom = $receiver;byte[] arrayOfByte2 = arrayOfByte1;localRandom.nextBytes(arrayOfByte2, fromIndex, toIndex);
    return array;
  }
  
  @ExperimentalUnsignedTypes
  public static final void checkUIntRangeBounds-J1ME1BU(int from, int until) {
    int i = until;i = kotlin.UnsignedKt.uintCompare(i, from) > 0 ? 1 : 0; if (i == 0) { int $i$a$1$require; String str = RandomKt.boundsErrorMessage(kotlin.UInt.box-impl(from), kotlin.UInt.box-impl(until));throw ((Throwable)new IllegalArgumentException(str.toString())); } }
  @ExperimentalUnsignedTypes
  public static final void checkULongRangeBounds-eb3DHEI(long from, long until) { long l = until;int i = kotlin.UnsignedKt.ulongCompare(l, from) > 0 ? 1 : 0; if (i == 0) { int $i$a$1$require; String str = RandomKt.boundsErrorMessage(ULong.box-impl(from), ULong.box-impl(until));throw ((Throwable)new IllegalArgumentException(str.toString()));
    }
  }
}

package kotlin.ranges;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.UnsignedKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\005\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\002\b\007\030\000 \0272\0020\0012\b\022\004\022\0020\0030\002:\001\027B\030\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003ø\001\000¢\006\002\020\006J\033\020\n\032\0020\0132\006\020\f\032\0020\003H\002ø\001\000¢\006\004\b\r\020\016J\023\020\017\032\0020\0132\b\020\020\032\004\030\0010\021H\002J\b\020\022\032\0020\023H\026J\b\020\024\032\0020\013H\026J\b\020\025\032\0020\026H\026R\027\020\005\032\0020\0038VX\004ø\001\000¢\006\006\032\004\b\007\020\bR\027\020\004\032\0020\0038VX\004ø\001\000¢\006\006\032\004\b\t\020\bø\001\000\002\004\n\002\b\031¨\006\030"}, d2={"Lkotlin/ranges/ULongRange;", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/ULong;", "start", "endInclusive", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEndInclusive", "()Lkotlin/ULong;", "getStart", "contains", "", "value", "contains-VKZWuLQ", "(J)Z", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
@ExperimentalUnsignedTypes
public final class ULongRange
  extends ULongProgression
  implements ClosedRange<ULong>
{
  private ULongRange(long start, long endInclusive) { super(start, endInclusive, 1L, null); } @NotNull
  public ULong getStart() { return ULong.box-impl(getFirst()); } @NotNull
  public ULong getEndInclusive() { return ULong.box-impl(getLast()); }
  
  public boolean contains-VKZWuLQ(long value) { long l1 = getFirst(); long l2; if (UnsignedKt.ulongCompare(l1, value) <= 0) { l1 = value;l2 = getLast(); } return UnsignedKt.ulongCompare(l1, l2) <= 0; }
  
  public boolean isEmpty() { long l1 = getFirst();long l2 = getLast();return UnsignedKt.ulongCompare(l1, l2) > 0;
  }
  

  public boolean equals(@Nullable Object other) { return ((other instanceof ULongRange)) && (((isEmpty()) && (((ULongRange)other).isEmpty())) || ((getFirst() == ((ULongRange)other).getFirst()) && (getLast() == ((ULongRange)other).getLast()))); }
  
  public int hashCode() {
    long l1 = getFirst();long l2 = getFirst();int i = 32;int j = 31;long l3 = ULong.constructor-impl(l2 >>> i);l2 = l3;j = j;l3 = ULong.constructor-impl(l1 ^ l2);l1 = l3;j = j;int k = (int)l1;l1 = getLast();l2 = getLast();i = 32;j *= k;long l4 = ULong.constructor-impl(l2 >>> i);l2 = l4;j = j;l4 = ULong.constructor-impl(l1 ^ l2);l1 = l4;j = j;int m = (int)l1;return isEmpty() ? -1 : j + m; }
  @NotNull
  public String toString() { return ULong.toString-impl(getFirst()) + ".." + ULong.toString-impl(getLast()); }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2={"Lkotlin/ranges/ULongRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/ULongRange;", "getEMPTY", "()Lkotlin/ranges/ULongRange;", "kotlin-stdlib"})
  public static final class Companion { @NotNull
    public final ULongRange getEMPTY() { return ULongRange.access$getEMPTY$cp(); } private Companion() {} } public static final Companion Companion = new Companion(null); @NotNull
  private static final ULongRange EMPTY = new ULongRange(-1L, 0L, null);
}

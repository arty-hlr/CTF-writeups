package kotlin.ranges;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.UnsignedKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\005\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\002\b\007\030\000 \0272\0020\0012\b\022\004\022\0020\0030\002:\001\027B\030\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003ø\001\000¢\006\002\020\006J\033\020\n\032\0020\0132\006\020\f\032\0020\003H\002ø\001\000¢\006\004\b\r\020\016J\023\020\017\032\0020\0132\b\020\020\032\004\030\0010\021H\002J\b\020\022\032\0020\023H\026J\b\020\024\032\0020\013H\026J\b\020\025\032\0020\026H\026R\027\020\005\032\0020\0038VX\004ø\001\000¢\006\006\032\004\b\007\020\bR\027\020\004\032\0020\0038VX\004ø\001\000¢\006\006\032\004\b\t\020\bø\001\000\002\004\n\002\b\031¨\006\030"}, d2={"Lkotlin/ranges/UIntRange;", "Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/UInt;", "start", "endInclusive", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEndInclusive", "()Lkotlin/UInt;", "getStart", "contains", "", "value", "contains-WZ4Q5Ns", "(I)Z", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
@ExperimentalUnsignedTypes
public final class UIntRange
  extends UIntProgression
  implements ClosedRange<UInt>
{
  private UIntRange(int start, int endInclusive) { super(start, endInclusive, 1, null); } @NotNull
  public UInt getStart() { return UInt.box-impl(getFirst()); } @NotNull
  public UInt getEndInclusive() { return UInt.box-impl(getLast()); }
  
  public boolean contains-WZ4Q5Ns(int value) { int i = getFirst(); int j; if (UnsignedKt.uintCompare(i, value) <= 0) { i = value;j = getLast(); } return UnsignedKt.uintCompare(i, j) <= 0; }
  
  public boolean isEmpty() { int i = getFirst();int j = getLast();return UnsignedKt.uintCompare(i, j) > 0;
  }
  

  public boolean equals(@Nullable Object other) { return ((other instanceof UIntRange)) && (((isEmpty()) && (((UIntRange)other).isEmpty())) || ((getFirst() == ((UIntRange)other).getFirst()) && (getLast() == ((UIntRange)other).getLast()))); }
  
  public int hashCode() {
    int i = getFirst();int j = 31;int k = i;i = getLast();j *= k;k = i;return isEmpty() ? -1 : j + k; }
  @NotNull
  public String toString() { return UInt.toString-impl(getFirst()) + ".." + UInt.toString-impl(getLast()); }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2={"Lkotlin/ranges/UIntRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/UIntRange;", "getEMPTY", "()Lkotlin/ranges/UIntRange;", "kotlin-stdlib"})
  public static final class Companion { @NotNull
    public final UIntRange getEMPTY() { return UIntRange.access$getEMPTY$cp(); } private Companion() {} } public static final Companion Companion = new Companion(null); @NotNull
  private static final UIntRange EMPTY = new UIntRange(-1, 0, null);
}

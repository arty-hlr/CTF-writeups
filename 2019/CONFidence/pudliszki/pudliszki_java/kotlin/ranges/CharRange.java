package kotlin.ranges;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\f\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\002\030\000 \0252\0020\0012\b\022\004\022\0020\0030\002:\001\025B\025\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\002\020\006J\021\020\n\032\0020\0132\006\020\f\032\0020\003H\002J\023\020\r\032\0020\0132\b\020\016\032\004\030\0010\017H\002J\b\020\020\032\0020\021H\026J\b\020\022\032\0020\013H\026J\b\020\023\032\0020\024H\026R\024\020\005\032\0020\0038VX\004¢\006\006\032\004\b\007\020\bR\024\020\004\032\0020\0038VX\004¢\006\006\032\004\b\t\020\b¨\006\026"}, d2={"Lkotlin/ranges/CharRange;", "Lkotlin/ranges/CharProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(CC)V", "getEndInclusive", "()Ljava/lang/Character;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"})
public final class CharRange
  extends CharProgression
  implements ClosedRange<Character>
{
  public CharRange(char start, char endInclusive) { super(start, endInclusive, 1); } @NotNull
  public Character getStart() { return Character.valueOf(getFirst()); } @NotNull
  public Character getEndInclusive() { return Character.valueOf(getLast()); }
  
  public boolean contains(char value) { return (getFirst() <= value) && (value <= getLast()); }
  
  public boolean isEmpty() { return getFirst() > getLast(); }
  
  public boolean equals(@Nullable Object other)
  {
    return ((other instanceof CharRange)) && (((isEmpty()) && (((CharRange)other).isEmpty())) || ((getFirst() == ((CharRange)other).getFirst()) && (getLast() == ((CharRange)other).getLast())));
  }
  
  public int hashCode() { return isEmpty() ? -1 : '\037' * getFirst() + getLast(); }
  @NotNull
  public String toString() { return getFirst() + ".." + getLast(); }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2={"Lkotlin/ranges/CharRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/CharRange;", "getEMPTY", "()Lkotlin/ranges/CharRange;", "kotlin-stdlib"})
  public static final class Companion { @NotNull
    public final CharRange getEMPTY() { return CharRange.access$getEMPTY$cp(); } private Companion() {} } public static final Companion Companion = new Companion(null); @NotNull
  private static final CharRange EMPTY = new CharRange((char)1, (char)0);
}

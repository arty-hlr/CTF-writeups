package kotlin; import kotlin.internal.InlineOnly;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000^\n\002\030\002\n\002\020\017\n\000\n\002\020\b\n\002\b\t\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\013\n\002\020\013\n\002\020\000\n\002\b\022\n\002\030\002\n\002\b\022\n\002\020\005\n\002\b\005\n\002\020\t\n\002\b\003\n\002\020\n\n\002\b\003\n\002\020\016\n\002\b\016\b@\030\000 b2\b\022\004\022\0020\0000\001:\001bB\024\b\001\022\006\020\002\032\0020\003ø\001\000¢\006\004\b\004\020\005J\033\020\b\032\0020\0002\006\020\t\032\0020\000H\fø\001\000¢\006\004\b\n\020\013J\033\020\f\032\0020\0032\006\020\t\032\0020\rH\nø\001\000¢\006\004\b\016\020\017J\033\020\f\032\0020\0032\006\020\t\032\0020\000H\nø\001\000¢\006\004\b\020\020\013J\033\020\f\032\0020\0032\006\020\t\032\0020\021H\nø\001\000¢\006\004\b\022\020\023J\033\020\f\032\0020\0032\006\020\t\032\0020\024H\nø\001\000¢\006\004\b\025\020\026J\023\020\027\032\0020\000H\nø\001\000¢\006\004\b\030\020\005J\033\020\031\032\0020\0002\006\020\t\032\0020\rH\nø\001\000¢\006\004\b\032\020\017J\033\020\031\032\0020\0002\006\020\t\032\0020\000H\nø\001\000¢\006\004\b\033\020\013J\033\020\031\032\0020\0212\006\020\t\032\0020\021H\nø\001\000¢\006\004\b\034\020\035J\033\020\031\032\0020\0002\006\020\t\032\0020\024H\nø\001\000¢\006\004\b\036\020\026J\023\020\037\032\0020 2\b\020\t\032\004\030\0010!HÖ\003J\t\020\"\032\0020\003HÖ\001J\023\020#\032\0020\000H\nø\001\000¢\006\004\b$\020\005J\023\020%\032\0020\000H\bø\001\000¢\006\004\b&\020\005J\033\020'\032\0020\0002\006\020\t\032\0020\rH\nø\001\000¢\006\004\b(\020\017J\033\020'\032\0020\0002\006\020\t\032\0020\000H\nø\001\000¢\006\004\b)\020\013J\033\020'\032\0020\0212\006\020\t\032\0020\021H\nø\001\000¢\006\004\b*\020\035J\033\020'\032\0020\0002\006\020\t\032\0020\024H\nø\001\000¢\006\004\b+\020\026J\033\020,\032\0020\0002\006\020\t\032\0020\000H\fø\001\000¢\006\004\b-\020\013J\033\020.\032\0020\0002\006\020\t\032\0020\rH\nø\001\000¢\006\004\b/\020\017J\033\020.\032\0020\0002\006\020\t\032\0020\000H\nø\001\000¢\006\004\b0\020\013J\033\020.\032\0020\0212\006\020\t\032\0020\021H\nø\001\000¢\006\004\b1\020\035J\033\020.\032\0020\0002\006\020\t\032\0020\024H\nø\001\000¢\006\004\b2\020\026J\033\0203\032\002042\006\020\t\032\0020\000H\nø\001\000¢\006\004\b5\0206J\033\0207\032\0020\0002\006\020\t\032\0020\rH\nø\001\000¢\006\004\b8\020\017J\033\0207\032\0020\0002\006\020\t\032\0020\000H\nø\001\000¢\006\004\b9\020\013J\033\0207\032\0020\0212\006\020\t\032\0020\021H\nø\001\000¢\006\004\b:\020\035J\033\0207\032\0020\0002\006\020\t\032\0020\024H\nø\001\000¢\006\004\b;\020\026J\033\020<\032\0020\0002\006\020=\032\0020\003H\fø\001\000¢\006\004\b>\020\013J\033\020?\032\0020\0002\006\020=\032\0020\003H\fø\001\000¢\006\004\b@\020\013J\033\020A\032\0020\0002\006\020\t\032\0020\rH\nø\001\000¢\006\004\bB\020\017J\033\020A\032\0020\0002\006\020\t\032\0020\000H\nø\001\000¢\006\004\bC\020\013J\033\020A\032\0020\0212\006\020\t\032\0020\021H\nø\001\000¢\006\004\bD\020\035J\033\020A\032\0020\0002\006\020\t\032\0020\024H\nø\001\000¢\006\004\bE\020\026J\020\020F\032\0020GH\b¢\006\004\bH\020IJ\020\020J\032\0020\003H\b¢\006\004\bK\020\005J\020\020L\032\0020MH\b¢\006\004\bN\020OJ\020\020P\032\0020QH\b¢\006\004\bR\020SJ\017\020T\032\0020UH\026¢\006\004\bV\020WJ\023\020X\032\0020\rH\bø\001\000¢\006\004\bY\020IJ\023\020Z\032\0020\000H\bø\001\000¢\006\004\b[\020\005J\023\020\\\032\0020\021H\bø\001\000¢\006\004\b]\020OJ\023\020^\032\0020\024H\bø\001\000¢\006\004\b_\020SJ\033\020`\032\0020\0002\006\020\t\032\0020\000H\fø\001\000¢\006\004\ba\020\013R\026\020\002\032\0020\0038\000X\004¢\006\b\n\000\022\004\b\006\020\007ø\001\000\002\004\n\002\b\031¨\006c"}, d2={"Lkotlin/UInt;", "", "data", "", "constructor-impl", "(I)I", "data$annotations", "()V", "and", "other", "and-WZ4Q5Ns", "(II)I", "compareTo", "Lkotlin/UByte;", "compareTo-7apg3OU", "(IB)I", "compareTo-WZ4Q5Ns", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(IJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(IS)I", "dec", "dec-impl", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(IJ)J", "div-xj2QHRw", "equals", "", "", "hashCode", "inc", "inc-impl", "inv", "inv-impl", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "or", "or-WZ4Q5Ns", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-WZ4Q5Ns", "(II)Lkotlin/ranges/UIntRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-impl", "shr", "shr-impl", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(I)B", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(I)J", "toShort", "", "toShort-impl", "(I)S", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "toUByte", "toUByte-impl", "toUInt", "toUInt-impl", "toULong", "toULong-impl", "toUShort", "toUShort-impl", "xor", "xor-WZ4Q5Ns", "Companion", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
@ExperimentalUnsignedTypes
public final class UInt implements Comparable<UInt> { @InlineOnly
  private int compareTo-WZ4Q5Ns(int paramInt) { return compareTo-WZ4Q5Ns(data, paramInt); } @org.jetbrains.annotations.NotNull
  public String toString() { return toString-impl(data); } public int hashCode() { return hashCode-impl(data); } public boolean equals(Object paramObject) { return equals-impl(data, paramObject); }
  


  private final int data;
  

  public static final int MIN_VALUE = 0;
  
  public static final int MAX_VALUE = -1;
  
  @PublishedApi
  public static int constructor-impl(int data)
  {
    return data;
  }
  




  public static final int SIZE_BYTES = 4;
  



  public static final int SIZE_BITS = 32;
  



  public static final Companion Companion = new Companion(null);
  



  @InlineOnly
  private static final int compareTo-7apg3OU(int $this, byte other)
  {
    ;
    



    int i = $this;int j = other;j = constructor-impl(j & 0xFF);return UnsignedKt.uintCompare(i, j);
  }
  

  @InlineOnly
  private static final int compareTo-xj2QHRw(int $this, short other)
  {
    ;
    int i = $this;int j = other;j = constructor-impl(j & 0xFFFF);return UnsignedKt.uintCompare(i, j);
  }
  

  @InlineOnly
  private static int compareTo-WZ4Q5Ns(int $this, int other)
  {
    ;
    
    return UnsignedKt.uintCompare($this, other);
  }
  

  @InlineOnly
  private static final int compareTo-VKZWuLQ(int $this, long other)
  {
    ;
    int i = $this;long l = ULong.constructor-impl(i & 0xFFFFFFFF);return UnsignedKt.ulongCompare(l, other); }
  
  @InlineOnly
  private static final int plus-7apg3OU(int $this, byte other) { ;
    int i = $this;int j = other;j = constructor-impl(j & 0xFF);return constructor-impl(i + j); }
  
  @InlineOnly
  private static final int plus-xj2QHRw(int $this, short other) { ; int i = $this;int j = other;j = constructor-impl(j & 0xFFFF);return constructor-impl(i + j); }
  
  @InlineOnly
  private static final int plus-WZ4Q5Ns(int $this, int other) { ; return constructor-impl($this + other); }
  
  @InlineOnly
  private static final long plus-VKZWuLQ(int $this, long other) { ; int i = $this;long l = ULong.constructor-impl(i & 0xFFFFFFFF);return ULong.constructor-impl(l + other); }
  
  @InlineOnly
  private static final int minus-7apg3OU(int $this, byte other) { ;
    int i = $this;int j = other;j = constructor-impl(j & 0xFF);return constructor-impl(i - j); }
  
  @InlineOnly
  private static final int minus-xj2QHRw(int $this, short other) { ; int i = $this;int j = other;j = constructor-impl(j & 0xFFFF);return constructor-impl(i - j); }
  
  @InlineOnly
  private static final int minus-WZ4Q5Ns(int $this, int other) { ; return constructor-impl($this - other); }
  
  @InlineOnly
  private static final long minus-VKZWuLQ(int $this, long other) { ; int i = $this;long l = ULong.constructor-impl(i & 0xFFFFFFFF);return ULong.constructor-impl(l - other); }
  
  @InlineOnly
  private static final int times-7apg3OU(int $this, byte other) { ;
    int i = $this;int j = other;j = constructor-impl(j & 0xFF);return constructor-impl(i * j); }
  
  @InlineOnly
  private static final int times-xj2QHRw(int $this, short other) { ; int i = $this;int j = other;j = constructor-impl(j & 0xFFFF);return constructor-impl(i * j); }
  
  @InlineOnly
  private static final int times-WZ4Q5Ns(int $this, int other) { ; return constructor-impl($this * other); }
  
  @InlineOnly
  private static final long times-VKZWuLQ(int $this, long other) { ; int i = $this;long l = ULong.constructor-impl(i & 0xFFFFFFFF);return ULong.constructor-impl(l * other); }
  
  @InlineOnly
  private static final int div-7apg3OU(int $this, byte other) { ;
    int i = $this;int j = other;j = constructor-impl(j & 0xFF);return UnsignedKt.uintDivide-J1ME1BU(i, j); }
  
  @InlineOnly
  private static final int div-xj2QHRw(int $this, short other) { ; int i = $this;int j = other;j = constructor-impl(j & 0xFFFF);return UnsignedKt.uintDivide-J1ME1BU(i, j); }
  
  @InlineOnly
  private static final int div-WZ4Q5Ns(int $this, int other) { ; return UnsignedKt.uintDivide-J1ME1BU($this, other); }
  
  @InlineOnly
  private static final long div-VKZWuLQ(int $this, long other) { ; int i = $this;long l = ULong.constructor-impl(i & 0xFFFFFFFF);return UnsignedKt.ulongDivide-eb3DHEI(l, other); }
  
  @InlineOnly
  private static final int rem-7apg3OU(int $this, byte other) { ;
    int i = $this;int j = other;j = constructor-impl(j & 0xFF);return UnsignedKt.uintRemainder-J1ME1BU(i, j); }
  
  @InlineOnly
  private static final int rem-xj2QHRw(int $this, short other) { ; int i = $this;int j = other;j = constructor-impl(j & 0xFFFF);return UnsignedKt.uintRemainder-J1ME1BU(i, j); }
  
  @InlineOnly
  private static final int rem-WZ4Q5Ns(int $this, int other) { ; return UnsignedKt.uintRemainder-J1ME1BU($this, other); }
  
  @InlineOnly
  private static final long rem-VKZWuLQ(int $this, long other) { ; int i = $this;long l = ULong.constructor-impl(i & 0xFFFFFFFF);return UnsignedKt.ulongRemainder-eb3DHEI(l, other); }
  
  @InlineOnly
  private static final int inc-impl(int $this) { ;
    return constructor-impl($this + 1); }
  
  @InlineOnly
  private static final int dec-impl(int $this) { ; return constructor-impl($this + -1); }
  
  @InlineOnly
  private static final kotlin.ranges.UIntRange rangeTo-WZ4Q5Ns(int $this, int other) { ;
    return new kotlin.ranges.UIntRange($this, other, null); }
  
  @InlineOnly
  private static final int shl-impl(int $this, int bitCount) { ;
    return constructor-impl($this << bitCount); }
  
  @InlineOnly
  private static final int shr-impl(int $this, int bitCount) { ; return constructor-impl($this >>> bitCount); }
  
  @InlineOnly
  private static final int and-WZ4Q5Ns(int $this, int other) { ; return constructor-impl($this & other); }
  
  @InlineOnly
  private static final int or-WZ4Q5Ns(int $this, int other) { ; return constructor-impl($this | other); }
  
  @InlineOnly
  private static final int xor-WZ4Q5Ns(int $this, int other) { ; return constructor-impl($this ^ other); }
  
  @InlineOnly
  private static final int inv-impl(int $this) { ; return constructor-impl($this ^ 0xFFFFFFFF); }
  
  @InlineOnly
  private static final byte toByte-impl(int $this) { ; return (byte)$this; }
  @InlineOnly
  private static final short toShort-impl(int $this) { ; return (short)$this; }
  @InlineOnly
  private static final int toInt-impl(int $this) { ; return $this; }
  @InlineOnly
  private static final long toLong-impl(int $this) { ; return $this & 0xFFFFFFFF; }
  
  @InlineOnly
  private static final byte toUByte-impl(int $this) { ; int i = $this;return UByte.constructor-impl((byte)i); }
  @InlineOnly
  private static final short toUShort-impl(int $this) { ; int i = $this;return UShort.constructor-impl((short)i); }
  @InlineOnly
  private static final int toUInt-impl(int $this) { ; return $this; }
  @InlineOnly
  private static final long toULong-impl(int $this) { ; return ULong.constructor-impl($this & 0xFFFFFFFF); }
  @org.jetbrains.annotations.NotNull
  public static String toString-impl(int $this) { int i = $this;return String.valueOf(i & 0xFFFFFFFF);
  }
  
  public static int hashCode-impl(int paramInt)
  {
    return paramInt;
  }
  
  public static boolean equals-impl(int paramInt, @org.jetbrains.annotations.Nullable Object paramObject)
  {
    if ((paramObject instanceof UInt))
    {
      int i = ((UInt)paramObject).unbox-impl();
      if ((paramInt == i ? 1 : 0) != 0) {
        return true;
      }
    }
    return false;
  }
  
  public static final boolean equals-impl0(int p1, int p2)
  {
    throw null;
  }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\023\020\003\032\0020\004XTø\001\000¢\006\004\n\002\020\005R\023\020\006\032\0020\004XTø\001\000¢\006\004\n\002\020\005R\016\020\007\032\0020\bXT¢\006\002\n\000R\016\020\t\032\0020\bXT¢\006\002\n\000\002\004\n\002\b\031¨\006\n"}, d2={"Lkotlin/UInt$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UInt;", "I", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"})
  public static final class Companion
  {
    private Companion() {}
  }
}

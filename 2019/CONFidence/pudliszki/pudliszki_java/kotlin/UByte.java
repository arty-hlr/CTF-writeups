package kotlin; import kotlin.internal.InlineOnly;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000^\n\002\030\002\n\002\020\017\n\000\n\002\020\005\n\002\b\t\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\013\n\002\020\013\n\002\020\000\n\002\b\022\n\002\030\002\n\002\b\022\n\002\020\t\n\002\b\003\n\002\020\n\n\002\b\003\n\002\020\016\n\002\b\016\b@\030\000 ^2\b\022\004\022\0020\0000\001:\001^B\024\b\001\022\006\020\002\032\0020\003ø\001\000¢\006\004\b\004\020\005J\033\020\b\032\0020\0002\006\020\t\032\0020\000H\fø\001\000¢\006\004\b\n\020\013J\033\020\f\032\0020\r2\006\020\t\032\0020\000H\nø\001\000¢\006\004\b\016\020\017J\033\020\f\032\0020\r2\006\020\t\032\0020\020H\nø\001\000¢\006\004\b\021\020\022J\033\020\f\032\0020\r2\006\020\t\032\0020\023H\nø\001\000¢\006\004\b\024\020\025J\033\020\f\032\0020\r2\006\020\t\032\0020\026H\nø\001\000¢\006\004\b\027\020\030J\023\020\031\032\0020\000H\nø\001\000¢\006\004\b\032\020\005J\033\020\033\032\0020\0202\006\020\t\032\0020\000H\nø\001\000¢\006\004\b\034\020\017J\033\020\033\032\0020\0202\006\020\t\032\0020\020H\nø\001\000¢\006\004\b\035\020\022J\033\020\033\032\0020\0232\006\020\t\032\0020\023H\nø\001\000¢\006\004\b\036\020\037J\033\020\033\032\0020\0202\006\020\t\032\0020\026H\nø\001\000¢\006\004\b \020\030J\023\020!\032\0020\"2\b\020\t\032\004\030\0010#HÖ\003J\t\020$\032\0020\rHÖ\001J\023\020%\032\0020\000H\nø\001\000¢\006\004\b&\020\005J\023\020'\032\0020\000H\bø\001\000¢\006\004\b(\020\005J\033\020)\032\0020\0202\006\020\t\032\0020\000H\nø\001\000¢\006\004\b*\020\017J\033\020)\032\0020\0202\006\020\t\032\0020\020H\nø\001\000¢\006\004\b+\020\022J\033\020)\032\0020\0232\006\020\t\032\0020\023H\nø\001\000¢\006\004\b,\020\037J\033\020)\032\0020\0202\006\020\t\032\0020\026H\nø\001\000¢\006\004\b-\020\030J\033\020.\032\0020\0002\006\020\t\032\0020\000H\fø\001\000¢\006\004\b/\020\013J\033\0200\032\0020\0202\006\020\t\032\0020\000H\nø\001\000¢\006\004\b1\020\017J\033\0200\032\0020\0202\006\020\t\032\0020\020H\nø\001\000¢\006\004\b2\020\022J\033\0200\032\0020\0232\006\020\t\032\0020\023H\nø\001\000¢\006\004\b3\020\037J\033\0200\032\0020\0202\006\020\t\032\0020\026H\nø\001\000¢\006\004\b4\020\030J\033\0205\032\002062\006\020\t\032\0020\000H\nø\001\000¢\006\004\b7\0208J\033\0209\032\0020\0202\006\020\t\032\0020\000H\nø\001\000¢\006\004\b:\020\017J\033\0209\032\0020\0202\006\020\t\032\0020\020H\nø\001\000¢\006\004\b;\020\022J\033\0209\032\0020\0232\006\020\t\032\0020\023H\nø\001\000¢\006\004\b<\020\037J\033\0209\032\0020\0202\006\020\t\032\0020\026H\nø\001\000¢\006\004\b=\020\030J\033\020>\032\0020\0202\006\020\t\032\0020\000H\nø\001\000¢\006\004\b?\020\017J\033\020>\032\0020\0202\006\020\t\032\0020\020H\nø\001\000¢\006\004\b@\020\022J\033\020>\032\0020\0232\006\020\t\032\0020\023H\nø\001\000¢\006\004\bA\020\037J\033\020>\032\0020\0202\006\020\t\032\0020\026H\nø\001\000¢\006\004\bB\020\030J\020\020C\032\0020\003H\b¢\006\004\bD\020\005J\020\020E\032\0020\rH\b¢\006\004\bF\020GJ\020\020H\032\0020IH\b¢\006\004\bJ\020KJ\020\020L\032\0020MH\b¢\006\004\bN\020OJ\017\020P\032\0020QH\026¢\006\004\bR\020SJ\023\020T\032\0020\000H\bø\001\000¢\006\004\bU\020\005J\023\020V\032\0020\020H\bø\001\000¢\006\004\bW\020GJ\023\020X\032\0020\023H\bø\001\000¢\006\004\bY\020KJ\023\020Z\032\0020\026H\bø\001\000¢\006\004\b[\020OJ\033\020\\\032\0020\0002\006\020\t\032\0020\000H\fø\001\000¢\006\004\b]\020\013R\026\020\002\032\0020\0038\000X\004¢\006\b\n\000\022\004\b\006\020\007ø\001\000\002\004\n\002\b\031¨\006_"}, d2={"Lkotlin/UByte;", "", "data", "", "constructor-impl", "(B)B", "data$annotations", "()V", "and", "other", "and-7apg3OU", "(BB)B", "compareTo", "", "compareTo-7apg3OU", "(BB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "dec", "dec-impl", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(BJ)J", "div-xj2QHRw", "equals", "", "", "hashCode", "inc", "inc-impl", "inv", "inv-impl", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "or", "or-7apg3OU", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "toByte-impl", "toInt", "toInt-impl", "(B)I", "toLong", "", "toLong-impl", "(B)J", "toShort", "", "toShort-impl", "(B)S", "toString", "", "toString-impl", "(B)Ljava/lang/String;", "toUByte", "toUByte-impl", "toUInt", "toUInt-impl", "toULong", "toULong-impl", "toUShort", "toUShort-impl", "xor", "xor-7apg3OU", "Companion", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
@ExperimentalUnsignedTypes
public final class UByte implements Comparable<UByte> { @InlineOnly
  private int compareTo-7apg3OU(byte paramByte) { return compareTo-7apg3OU(data, paramByte); } @org.jetbrains.annotations.NotNull
  public String toString() { return toString-impl(data); } public int hashCode() { return hashCode-impl(data); } public boolean equals(Object paramObject) { return equals-impl(data, paramObject); }
  


  private final byte data;
  

  public static final byte MIN_VALUE = 0;
  
  public static final byte MAX_VALUE = -1;
  
  @PublishedApi
  public static byte constructor-impl(byte data)
  {
    return data;
  }
  





  public static final int SIZE_BYTES = 1;
  



  public static final int SIZE_BITS = 8;
  



  public static final Companion Companion = new Companion(null);
  



  @InlineOnly
  private static int compareTo-7apg3OU(byte $this, byte other)
  {
    ;
    



    int i = $this;i = other;int j = i & 0xFF;int k = i & 0xFF;return kotlin.jvm.internal.Intrinsics.compare(j, k);
  }
  

  @InlineOnly
  private static final int compareTo-xj2QHRw(byte $this, short other)
  {
    ;
    int i = $this;i = other;int j = i & 0xFF;int k = i & 0xFFFF;return kotlin.jvm.internal.Intrinsics.compare(j, k);
  }
  

  @InlineOnly
  private static final int compareTo-WZ4Q5Ns(byte $this, int other)
  {
    ;
    int i = $this;i = UInt.constructor-impl(i & 0xFF);return UnsignedKt.uintCompare(i, other);
  }
  

  @InlineOnly
  private static final int compareTo-VKZWuLQ(byte $this, long other)
  {
    ;
    int i = $this;long l = ULong.constructor-impl(i & 0xFF);return UnsignedKt.ulongCompare(l, other); }
  
  @InlineOnly
  private static final int plus-7apg3OU(byte $this, byte other) { ;
    int i = $this;i = UInt.constructor-impl(i & 0xFF);int j = other;j = UInt.constructor-impl(j & 0xFF);return UInt.constructor-impl(i + j); }
  
  @InlineOnly
  private static final int plus-xj2QHRw(byte $this, short other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFF);int j = other;j = UInt.constructor-impl(j & 0xFFFF);return UInt.constructor-impl(i + j); }
  
  @InlineOnly
  private static final int plus-WZ4Q5Ns(byte $this, int other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFF);return UInt.constructor-impl(i + other); }
  
  @InlineOnly
  private static final long plus-VKZWuLQ(byte $this, long other) { ; int i = $this;long l = ULong.constructor-impl(i & 0xFF);return ULong.constructor-impl(l + other); }
  
  @InlineOnly
  private static final int minus-7apg3OU(byte $this, byte other) { ;
    int i = $this;i = UInt.constructor-impl(i & 0xFF);int j = other;j = UInt.constructor-impl(j & 0xFF);return UInt.constructor-impl(i - j); }
  
  @InlineOnly
  private static final int minus-xj2QHRw(byte $this, short other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFF);int j = other;j = UInt.constructor-impl(j & 0xFFFF);return UInt.constructor-impl(i - j); }
  
  @InlineOnly
  private static final int minus-WZ4Q5Ns(byte $this, int other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFF);return UInt.constructor-impl(i - other); }
  
  @InlineOnly
  private static final long minus-VKZWuLQ(byte $this, long other) { ; int i = $this;long l = ULong.constructor-impl(i & 0xFF);return ULong.constructor-impl(l - other); }
  
  @InlineOnly
  private static final int times-7apg3OU(byte $this, byte other) { ;
    int i = $this;i = UInt.constructor-impl(i & 0xFF);int j = other;j = UInt.constructor-impl(j & 0xFF);return UInt.constructor-impl(i * j); }
  
  @InlineOnly
  private static final int times-xj2QHRw(byte $this, short other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFF);int j = other;j = UInt.constructor-impl(j & 0xFFFF);return UInt.constructor-impl(i * j); }
  
  @InlineOnly
  private static final int times-WZ4Q5Ns(byte $this, int other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFF);return UInt.constructor-impl(i * other); }
  
  @InlineOnly
  private static final long times-VKZWuLQ(byte $this, long other) { ; int i = $this;long l = ULong.constructor-impl(i & 0xFF);return ULong.constructor-impl(l * other); }
  
  @InlineOnly
  private static final int div-7apg3OU(byte $this, byte other) { ;
    int i = $this;i = UInt.constructor-impl(i & 0xFF);int j = other;j = UInt.constructor-impl(j & 0xFF);return UnsignedKt.uintDivide-J1ME1BU(i, j); }
  
  @InlineOnly
  private static final int div-xj2QHRw(byte $this, short other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFF);int j = other;j = UInt.constructor-impl(j & 0xFFFF);return UnsignedKt.uintDivide-J1ME1BU(i, j); }
  
  @InlineOnly
  private static final int div-WZ4Q5Ns(byte $this, int other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFF);return UnsignedKt.uintDivide-J1ME1BU(i, other); }
  
  @InlineOnly
  private static final long div-VKZWuLQ(byte $this, long other) { ; int i = $this;long l = ULong.constructor-impl(i & 0xFF);return UnsignedKt.ulongDivide-eb3DHEI(l, other); }
  
  @InlineOnly
  private static final int rem-7apg3OU(byte $this, byte other) { ;
    int i = $this;i = UInt.constructor-impl(i & 0xFF);int j = other;j = UInt.constructor-impl(j & 0xFF);return UnsignedKt.uintRemainder-J1ME1BU(i, j); }
  
  @InlineOnly
  private static final int rem-xj2QHRw(byte $this, short other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFF);int j = other;j = UInt.constructor-impl(j & 0xFFFF);return UnsignedKt.uintRemainder-J1ME1BU(i, j); }
  
  @InlineOnly
  private static final int rem-WZ4Q5Ns(byte $this, int other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFF);return UnsignedKt.uintRemainder-J1ME1BU(i, other); }
  
  @InlineOnly
  private static final long rem-VKZWuLQ(byte $this, long other) { ; int i = $this;long l = ULong.constructor-impl(i & 0xFF);return UnsignedKt.ulongRemainder-eb3DHEI(l, other); }
  
  @InlineOnly
  private static final byte inc-impl(byte $this) { ;
    return constructor-impl((byte)($this + 1)); }
  
  @InlineOnly
  private static final byte dec-impl(byte $this) { ; return constructor-impl((byte)($this + -1)); }
  
  @InlineOnly
  private static final kotlin.ranges.UIntRange rangeTo-7apg3OU(byte $this, byte other) { ;
    int i = $this;int j = UInt.constructor-impl(i & 0xFF);i = other;j = j;int k = UInt.constructor-impl(i & 0xFF);kotlin.jvm.internal.DefaultConstructorMarker localDefaultConstructorMarker = null;int m = k;int n = j;return new kotlin.ranges.UIntRange(n, m, localDefaultConstructorMarker); }
  
  @InlineOnly
  private static final byte and-7apg3OU(byte $this, byte other) { ;
    int i = $this;int j = other;return constructor-impl((byte)(i & j)); }
  
  @InlineOnly
  private static final byte or-7apg3OU(byte $this, byte other) { ; int i = $this;int j = other;return constructor-impl((byte)(i | j)); }
  
  @InlineOnly
  private static final byte xor-7apg3OU(byte $this, byte other) { ; int i = $this;int j = other;return constructor-impl((byte)(i ^ j)); }
  
  @InlineOnly
  private static final byte inv-impl(byte $this) { ; int i = $this;return constructor-impl((byte)(i ^ 0xFFFFFFFF)); }
  
  @InlineOnly
  private static final byte toByte-impl(byte $this) { ; return $this; }
  @InlineOnly
  private static final short toShort-impl(byte $this) { ; int i = (short)$this;int j = 255;return (short)(i & j); }
  @InlineOnly
  private static final int toInt-impl(byte $this) { ; return $this & 0xFF; }
  @InlineOnly
  private static final long toLong-impl(byte $this) { ; return $this & 0xFF; }
  
  @InlineOnly
  private static final byte toUByte-impl(byte $this) { ; return $this; }
  @InlineOnly
  private static final short toUShort-impl(byte $this) { ; int i = (short)$this;int j = 255;return UShort.constructor-impl((short)(i & j)); }
  @InlineOnly
  private static final int toUInt-impl(byte $this) { ; return UInt.constructor-impl($this & 0xFF); }
  @InlineOnly
  private static final long toULong-impl(byte $this) { ; return ULong.constructor-impl($this & 0xFF); }
  @org.jetbrains.annotations.NotNull
  public static String toString-impl(byte $this) { int i = $this;return String.valueOf(i & 0xFF);
  }
  
  public static int hashCode-impl(byte paramByte)
  {
    return paramByte;
  }
  
  public static boolean equals-impl(byte paramByte, @org.jetbrains.annotations.Nullable Object paramObject)
  {
    if ((paramObject instanceof UByte))
    {
      byte b = ((UByte)paramObject).unbox-impl();
      if ((paramByte == b ? 1 : 0) != 0) {
        return true;
      }
    }
    return false;
  }
  
  public static final boolean equals-impl0(byte p1, byte p2)
  {
    throw null;
  }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\023\020\003\032\0020\004XTø\001\000¢\006\004\n\002\020\005R\023\020\006\032\0020\004XTø\001\000¢\006\004\n\002\020\005R\016\020\007\032\0020\bXT¢\006\002\n\000R\016\020\t\032\0020\bXT¢\006\002\n\000\002\004\n\002\b\031¨\006\n"}, d2={"Lkotlin/UByte$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UByte;", "B", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"})
  public static final class Companion
  {
    private Companion() {}
  }
}

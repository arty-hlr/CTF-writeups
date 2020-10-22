package kotlin; import kotlin.internal.InlineOnly;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000Z\n\002\030\002\n\002\020\017\n\000\n\002\020\n\n\002\b\t\n\002\020\b\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\r\n\002\020\013\n\002\020\000\n\002\b\022\n\002\030\002\n\002\b\r\n\002\020\005\n\002\b\006\n\002\020\t\n\002\b\005\n\002\020\016\n\002\b\016\b@\030\000 ^2\b\022\004\022\0020\0000\001:\001^B\024\b\001\022\006\020\002\032\0020\003ø\001\000¢\006\004\b\004\020\005J\033\020\b\032\0020\0002\006\020\t\032\0020\000H\fø\001\000¢\006\004\b\n\020\013J\033\020\f\032\0020\r2\006\020\t\032\0020\016H\nø\001\000¢\006\004\b\017\020\020J\033\020\f\032\0020\r2\006\020\t\032\0020\021H\nø\001\000¢\006\004\b\022\020\023J\033\020\f\032\0020\r2\006\020\t\032\0020\024H\nø\001\000¢\006\004\b\025\020\026J\033\020\f\032\0020\r2\006\020\t\032\0020\000H\nø\001\000¢\006\004\b\027\020\030J\023\020\031\032\0020\000H\nø\001\000¢\006\004\b\032\020\005J\033\020\033\032\0020\0212\006\020\t\032\0020\016H\nø\001\000¢\006\004\b\034\020\020J\033\020\033\032\0020\0212\006\020\t\032\0020\021H\nø\001\000¢\006\004\b\035\020\023J\033\020\033\032\0020\0242\006\020\t\032\0020\024H\nø\001\000¢\006\004\b\036\020\037J\033\020\033\032\0020\0212\006\020\t\032\0020\000H\nø\001\000¢\006\004\b \020\030J\023\020!\032\0020\"2\b\020\t\032\004\030\0010#HÖ\003J\t\020$\032\0020\rHÖ\001J\023\020%\032\0020\000H\nø\001\000¢\006\004\b&\020\005J\023\020'\032\0020\000H\bø\001\000¢\006\004\b(\020\005J\033\020)\032\0020\0212\006\020\t\032\0020\016H\nø\001\000¢\006\004\b*\020\020J\033\020)\032\0020\0212\006\020\t\032\0020\021H\nø\001\000¢\006\004\b+\020\023J\033\020)\032\0020\0242\006\020\t\032\0020\024H\nø\001\000¢\006\004\b,\020\037J\033\020)\032\0020\0212\006\020\t\032\0020\000H\nø\001\000¢\006\004\b-\020\030J\033\020.\032\0020\0002\006\020\t\032\0020\000H\fø\001\000¢\006\004\b/\020\013J\033\0200\032\0020\0212\006\020\t\032\0020\016H\nø\001\000¢\006\004\b1\020\020J\033\0200\032\0020\0212\006\020\t\032\0020\021H\nø\001\000¢\006\004\b2\020\023J\033\0200\032\0020\0242\006\020\t\032\0020\024H\nø\001\000¢\006\004\b3\020\037J\033\0200\032\0020\0212\006\020\t\032\0020\000H\nø\001\000¢\006\004\b4\020\030J\033\0205\032\002062\006\020\t\032\0020\000H\nø\001\000¢\006\004\b7\0208J\033\0209\032\0020\0212\006\020\t\032\0020\016H\nø\001\000¢\006\004\b:\020\020J\033\0209\032\0020\0212\006\020\t\032\0020\021H\nø\001\000¢\006\004\b;\020\023J\033\0209\032\0020\0242\006\020\t\032\0020\024H\nø\001\000¢\006\004\b<\020\037J\033\0209\032\0020\0212\006\020\t\032\0020\000H\nø\001\000¢\006\004\b=\020\030J\033\020>\032\0020\0212\006\020\t\032\0020\016H\nø\001\000¢\006\004\b?\020\020J\033\020>\032\0020\0212\006\020\t\032\0020\021H\nø\001\000¢\006\004\b@\020\023J\033\020>\032\0020\0242\006\020\t\032\0020\024H\nø\001\000¢\006\004\bA\020\037J\033\020>\032\0020\0212\006\020\t\032\0020\000H\nø\001\000¢\006\004\bB\020\030J\020\020C\032\0020DH\b¢\006\004\bE\020FJ\020\020G\032\0020\rH\b¢\006\004\bH\020IJ\020\020J\032\0020KH\b¢\006\004\bL\020MJ\020\020N\032\0020\003H\b¢\006\004\bO\020\005J\017\020P\032\0020QH\026¢\006\004\bR\020SJ\023\020T\032\0020\016H\bø\001\000¢\006\004\bU\020FJ\023\020V\032\0020\021H\bø\001\000¢\006\004\bW\020IJ\023\020X\032\0020\024H\bø\001\000¢\006\004\bY\020MJ\023\020Z\032\0020\000H\bø\001\000¢\006\004\b[\020\005J\033\020\\\032\0020\0002\006\020\t\032\0020\000H\fø\001\000¢\006\004\b]\020\013R\026\020\002\032\0020\0038\000X\004¢\006\b\n\000\022\004\b\006\020\007ø\001\000\002\004\n\002\b\031¨\006_"}, d2={"Lkotlin/UShort;", "", "data", "", "constructor-impl", "(S)S", "data$annotations", "()V", "and", "other", "and-xj2QHRw", "(SS)S", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "compareTo-xj2QHRw", "(SS)I", "dec", "dec-impl", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(SJ)J", "div-xj2QHRw", "equals", "", "", "hashCode", "inc", "inc-impl", "inv", "inv-impl", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "or", "or-xj2QHRw", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(S)B", "toInt", "toInt-impl", "(S)I", "toLong", "", "toLong-impl", "(S)J", "toShort", "toShort-impl", "toString", "", "toString-impl", "(S)Ljava/lang/String;", "toUByte", "toUByte-impl", "toUInt", "toUInt-impl", "toULong", "toULong-impl", "toUShort", "toUShort-impl", "xor", "xor-xj2QHRw", "Companion", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
@ExperimentalUnsignedTypes
public final class UShort implements Comparable<UShort> { @InlineOnly
  private int compareTo-xj2QHRw(short paramShort) { return compareTo-xj2QHRw(data, paramShort); } @org.jetbrains.annotations.NotNull
  public String toString() { return toString-impl(data); } public int hashCode() { return hashCode-impl(data); } public boolean equals(Object paramObject) { return equals-impl(data, paramObject); }
  


  private final short data;
  

  public static final short MIN_VALUE = 0;
  
  public static final short MAX_VALUE = -1;
  
  @PublishedApi
  public static short constructor-impl(short data)
  {
    return data;
  }
  




  public static final int SIZE_BYTES = 2;
  



  public static final int SIZE_BITS = 16;
  



  public static final Companion Companion = new Companion(null);
  



  @InlineOnly
  private static final int compareTo-7apg3OU(short $this, byte other)
  {
    ;
    



    int i = $this;i = other;int j = i & 0xFFFF;int k = i & 0xFF;return kotlin.jvm.internal.Intrinsics.compare(j, k);
  }
  

  @InlineOnly
  private static int compareTo-xj2QHRw(short $this, short other)
  {
    ;
    
    int i = $this;i = other;int j = i & 0xFFFF;int k = i & 0xFFFF;return kotlin.jvm.internal.Intrinsics.compare(j, k);
  }
  

  @InlineOnly
  private static final int compareTo-WZ4Q5Ns(short $this, int other)
  {
    ;
    int i = $this;i = UInt.constructor-impl(i & 0xFFFF);return UnsignedKt.uintCompare(i, other);
  }
  

  @InlineOnly
  private static final int compareTo-VKZWuLQ(short $this, long other)
  {
    ;
    int i = $this;long l = ULong.constructor-impl(i & 0xFFFF);return UnsignedKt.ulongCompare(l, other); }
  
  @InlineOnly
  private static final int plus-7apg3OU(short $this, byte other) { ;
    int i = $this;i = UInt.constructor-impl(i & 0xFFFF);int j = other;j = UInt.constructor-impl(j & 0xFF);return UInt.constructor-impl(i + j); }
  
  @InlineOnly
  private static final int plus-xj2QHRw(short $this, short other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFFFF);int j = other;j = UInt.constructor-impl(j & 0xFFFF);return UInt.constructor-impl(i + j); }
  
  @InlineOnly
  private static final int plus-WZ4Q5Ns(short $this, int other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFFFF);return UInt.constructor-impl(i + other); }
  
  @InlineOnly
  private static final long plus-VKZWuLQ(short $this, long other) { ; int i = $this;long l = ULong.constructor-impl(i & 0xFFFF);return ULong.constructor-impl(l + other); }
  
  @InlineOnly
  private static final int minus-7apg3OU(short $this, byte other) { ;
    int i = $this;i = UInt.constructor-impl(i & 0xFFFF);int j = other;j = UInt.constructor-impl(j & 0xFF);return UInt.constructor-impl(i - j); }
  
  @InlineOnly
  private static final int minus-xj2QHRw(short $this, short other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFFFF);int j = other;j = UInt.constructor-impl(j & 0xFFFF);return UInt.constructor-impl(i - j); }
  
  @InlineOnly
  private static final int minus-WZ4Q5Ns(short $this, int other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFFFF);return UInt.constructor-impl(i - other); }
  
  @InlineOnly
  private static final long minus-VKZWuLQ(short $this, long other) { ; int i = $this;long l = ULong.constructor-impl(i & 0xFFFF);return ULong.constructor-impl(l - other); }
  
  @InlineOnly
  private static final int times-7apg3OU(short $this, byte other) { ;
    int i = $this;i = UInt.constructor-impl(i & 0xFFFF);int j = other;j = UInt.constructor-impl(j & 0xFF);return UInt.constructor-impl(i * j); }
  
  @InlineOnly
  private static final int times-xj2QHRw(short $this, short other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFFFF);int j = other;j = UInt.constructor-impl(j & 0xFFFF);return UInt.constructor-impl(i * j); }
  
  @InlineOnly
  private static final int times-WZ4Q5Ns(short $this, int other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFFFF);return UInt.constructor-impl(i * other); }
  
  @InlineOnly
  private static final long times-VKZWuLQ(short $this, long other) { ; int i = $this;long l = ULong.constructor-impl(i & 0xFFFF);return ULong.constructor-impl(l * other); }
  
  @InlineOnly
  private static final int div-7apg3OU(short $this, byte other) { ;
    int i = $this;i = UInt.constructor-impl(i & 0xFFFF);int j = other;j = UInt.constructor-impl(j & 0xFF);return UnsignedKt.uintDivide-J1ME1BU(i, j); }
  
  @InlineOnly
  private static final int div-xj2QHRw(short $this, short other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFFFF);int j = other;j = UInt.constructor-impl(j & 0xFFFF);return UnsignedKt.uintDivide-J1ME1BU(i, j); }
  
  @InlineOnly
  private static final int div-WZ4Q5Ns(short $this, int other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFFFF);return UnsignedKt.uintDivide-J1ME1BU(i, other); }
  
  @InlineOnly
  private static final long div-VKZWuLQ(short $this, long other) { ; int i = $this;long l = ULong.constructor-impl(i & 0xFFFF);return UnsignedKt.ulongDivide-eb3DHEI(l, other); }
  
  @InlineOnly
  private static final int rem-7apg3OU(short $this, byte other) { ;
    int i = $this;i = UInt.constructor-impl(i & 0xFFFF);int j = other;j = UInt.constructor-impl(j & 0xFF);return UnsignedKt.uintRemainder-J1ME1BU(i, j); }
  
  @InlineOnly
  private static final int rem-xj2QHRw(short $this, short other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFFFF);int j = other;j = UInt.constructor-impl(j & 0xFFFF);return UnsignedKt.uintRemainder-J1ME1BU(i, j); }
  
  @InlineOnly
  private static final int rem-WZ4Q5Ns(short $this, int other) { ; int i = $this;i = UInt.constructor-impl(i & 0xFFFF);return UnsignedKt.uintRemainder-J1ME1BU(i, other); }
  
  @InlineOnly
  private static final long rem-VKZWuLQ(short $this, long other) { ; int i = $this;long l = ULong.constructor-impl(i & 0xFFFF);return UnsignedKt.ulongRemainder-eb3DHEI(l, other); }
  
  @InlineOnly
  private static final short inc-impl(short $this) { ;
    return constructor-impl((short)($this + 1)); }
  
  @InlineOnly
  private static final short dec-impl(short $this) { ; return constructor-impl((short)($this + -1)); }
  
  @InlineOnly
  private static final kotlin.ranges.UIntRange rangeTo-xj2QHRw(short $this, short other) { ;
    int i = $this;int j = UInt.constructor-impl(i & 0xFFFF);i = other;j = j;int k = UInt.constructor-impl(i & 0xFFFF);kotlin.jvm.internal.DefaultConstructorMarker localDefaultConstructorMarker = null;int m = k;int n = j;return new kotlin.ranges.UIntRange(n, m, localDefaultConstructorMarker); }
  
  @InlineOnly
  private static final short and-xj2QHRw(short $this, short other) { ;
    int i = $this;int j = other;return constructor-impl((short)(i & j)); }
  
  @InlineOnly
  private static final short or-xj2QHRw(short $this, short other) { ; int i = $this;int j = other;return constructor-impl((short)(i | j)); }
  
  @InlineOnly
  private static final short xor-xj2QHRw(short $this, short other) { ; int i = $this;int j = other;return constructor-impl((short)(i ^ j)); }
  
  @InlineOnly
  private static final short inv-impl(short $this) { ; int i = $this;return constructor-impl((short)(i ^ 0xFFFFFFFF)); }
  
  @InlineOnly
  private static final byte toByte-impl(short $this) { ; return (byte)$this; }
  @InlineOnly
  private static final short toShort-impl(short $this) { ; return $this; }
  @InlineOnly
  private static final int toInt-impl(short $this) { ; return $this & 0xFFFF; }
  @InlineOnly
  private static final long toLong-impl(short $this) { ; return $this & 0xFFFF; }
  
  @InlineOnly
  private static final byte toUByte-impl(short $this) { ; int i = $this;return UByte.constructor-impl((byte)i); }
  @InlineOnly
  private static final short toUShort-impl(short $this) { ; return $this; }
  @InlineOnly
  private static final int toUInt-impl(short $this) { ; return UInt.constructor-impl($this & 0xFFFF); }
  @InlineOnly
  private static final long toULong-impl(short $this) { ; return ULong.constructor-impl($this & 0xFFFF); }
  @org.jetbrains.annotations.NotNull
  public static String toString-impl(short $this) { int i = $this;return String.valueOf(i & 0xFFFF);
  }
  
  public static int hashCode-impl(short paramShort)
  {
    return paramShort;
  }
  
  public static boolean equals-impl(short paramShort, @org.jetbrains.annotations.Nullable Object paramObject)
  {
    if ((paramObject instanceof UShort))
    {
      short s = ((UShort)paramObject).unbox-impl();
      if ((paramShort == s ? 1 : 0) != 0) {
        return true;
      }
    }
    return false;
  }
  
  public static final boolean equals-impl0(short p1, short p2)
  {
    throw null;
  }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\023\020\003\032\0020\004XTø\001\000¢\006\004\n\002\020\005R\023\020\006\032\0020\004XTø\001\000¢\006\004\n\002\020\005R\016\020\007\032\0020\bXT¢\006\002\n\000R\016\020\t\032\0020\bXT¢\006\002\n\000\002\004\n\002\b\031¨\006\n"}, d2={"Lkotlin/UShort$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UShort;", "S", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"})
  public static final class Companion
  {
    private Companion() {}
  }
}

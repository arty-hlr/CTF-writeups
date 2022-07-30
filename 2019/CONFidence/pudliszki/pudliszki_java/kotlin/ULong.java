package kotlin; import kotlin.internal.InlineOnly;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000Z\n\002\030\002\n\002\020\017\n\000\n\002\020\t\n\002\b\t\n\002\020\b\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\r\n\002\020\013\n\002\020\000\n\002\b\022\n\002\030\002\n\002\b\022\n\002\020\005\n\002\b\b\n\002\020\n\n\002\b\003\n\002\020\016\n\002\b\016\b@\030\000 e2\b\022\004\022\0020\0000\001:\001eB\024\b\001\022\006\020\002\032\0020\003ø\001\000¢\006\004\b\004\020\005J\033\020\b\032\0020\0002\006\020\t\032\0020\000H\fø\001\000¢\006\004\b\n\020\013J\033\020\f\032\0020\r2\006\020\t\032\0020\016H\nø\001\000¢\006\004\b\017\020\020J\033\020\f\032\0020\r2\006\020\t\032\0020\021H\nø\001\000¢\006\004\b\022\020\023J\033\020\f\032\0020\r2\006\020\t\032\0020\000H\nø\001\000¢\006\004\b\024\020\025J\033\020\f\032\0020\r2\006\020\t\032\0020\026H\nø\001\000¢\006\004\b\027\020\030J\023\020\031\032\0020\000H\nø\001\000¢\006\004\b\032\020\005J\033\020\033\032\0020\0002\006\020\t\032\0020\016H\nø\001\000¢\006\004\b\034\020\035J\033\020\033\032\0020\0002\006\020\t\032\0020\021H\nø\001\000¢\006\004\b\036\020\037J\033\020\033\032\0020\0002\006\020\t\032\0020\000H\nø\001\000¢\006\004\b \020\013J\033\020\033\032\0020\0002\006\020\t\032\0020\026H\nø\001\000¢\006\004\b!\020\"J\023\020#\032\0020$2\b\020\t\032\004\030\0010%HÖ\003J\t\020&\032\0020\rHÖ\001J\023\020'\032\0020\000H\nø\001\000¢\006\004\b(\020\005J\023\020)\032\0020\000H\bø\001\000¢\006\004\b*\020\005J\033\020+\032\0020\0002\006\020\t\032\0020\016H\nø\001\000¢\006\004\b,\020\035J\033\020+\032\0020\0002\006\020\t\032\0020\021H\nø\001\000¢\006\004\b-\020\037J\033\020+\032\0020\0002\006\020\t\032\0020\000H\nø\001\000¢\006\004\b.\020\013J\033\020+\032\0020\0002\006\020\t\032\0020\026H\nø\001\000¢\006\004\b/\020\"J\033\0200\032\0020\0002\006\020\t\032\0020\000H\fø\001\000¢\006\004\b1\020\013J\033\0202\032\0020\0002\006\020\t\032\0020\016H\nø\001\000¢\006\004\b3\020\035J\033\0202\032\0020\0002\006\020\t\032\0020\021H\nø\001\000¢\006\004\b4\020\037J\033\0202\032\0020\0002\006\020\t\032\0020\000H\nø\001\000¢\006\004\b5\020\013J\033\0202\032\0020\0002\006\020\t\032\0020\026H\nø\001\000¢\006\004\b6\020\"J\033\0207\032\002082\006\020\t\032\0020\000H\nø\001\000¢\006\004\b9\020:J\033\020;\032\0020\0002\006\020\t\032\0020\016H\nø\001\000¢\006\004\b<\020\035J\033\020;\032\0020\0002\006\020\t\032\0020\021H\nø\001\000¢\006\004\b=\020\037J\033\020;\032\0020\0002\006\020\t\032\0020\000H\nø\001\000¢\006\004\b>\020\013J\033\020;\032\0020\0002\006\020\t\032\0020\026H\nø\001\000¢\006\004\b?\020\"J\033\020@\032\0020\0002\006\020A\032\0020\rH\fø\001\000¢\006\004\bB\020\037J\033\020C\032\0020\0002\006\020A\032\0020\rH\fø\001\000¢\006\004\bD\020\037J\033\020E\032\0020\0002\006\020\t\032\0020\016H\nø\001\000¢\006\004\bF\020\035J\033\020E\032\0020\0002\006\020\t\032\0020\021H\nø\001\000¢\006\004\bG\020\037J\033\020E\032\0020\0002\006\020\t\032\0020\000H\nø\001\000¢\006\004\bH\020\013J\033\020E\032\0020\0002\006\020\t\032\0020\026H\nø\001\000¢\006\004\bI\020\"J\020\020J\032\0020KH\b¢\006\004\bL\020MJ\020\020N\032\0020\rH\b¢\006\004\bO\020PJ\020\020Q\032\0020\003H\b¢\006\004\bR\020\005J\020\020S\032\0020TH\b¢\006\004\bU\020VJ\017\020W\032\0020XH\026¢\006\004\bY\020ZJ\023\020[\032\0020\016H\bø\001\000¢\006\004\b\\\020MJ\023\020]\032\0020\021H\bø\001\000¢\006\004\b^\020PJ\023\020_\032\0020\000H\bø\001\000¢\006\004\b`\020\005J\023\020a\032\0020\026H\bø\001\000¢\006\004\bb\020VJ\033\020c\032\0020\0002\006\020\t\032\0020\000H\fø\001\000¢\006\004\bd\020\013R\026\020\002\032\0020\0038\000X\004¢\006\b\n\000\022\004\b\006\020\007ø\001\000\002\004\n\002\b\031¨\006f"}, d2={"Lkotlin/ULong;", "", "data", "", "constructor-impl", "(J)J", "data$annotations", "()V", "and", "other", "and-VKZWuLQ", "(JJ)J", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(JB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "dec", "dec-impl", "div", "div-7apg3OU", "(JB)J", "div-WZ4Q5Ns", "(JI)J", "div-VKZWuLQ", "div-xj2QHRw", "(JS)J", "equals", "", "", "hashCode", "inc", "inc-impl", "inv", "inv-impl", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "or", "or-VKZWuLQ", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-impl", "shr", "shr-impl", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(J)B", "toInt", "toInt-impl", "(J)I", "toLong", "toLong-impl", "toShort", "", "toShort-impl", "(J)S", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "toUByte", "toUByte-impl", "toUInt", "toUInt-impl", "toULong", "toULong-impl", "toUShort", "toUShort-impl", "xor", "xor-VKZWuLQ", "Companion", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
@ExperimentalUnsignedTypes
public final class ULong implements Comparable<ULong> { @InlineOnly
  private int compareTo-VKZWuLQ(long paramLong) { return compareTo-VKZWuLQ(data, paramLong); } @org.jetbrains.annotations.NotNull
  public String toString() { return toString-impl(data); } public int hashCode() { return hashCode-impl(data); } public boolean equals(Object paramObject) { return equals-impl(data, paramObject); }
  


  private final long data;
  

  public static final long MIN_VALUE = 0L;
  
  public static final long MAX_VALUE = -1L;
  
  @PublishedApi
  public static long constructor-impl(long data)
  {
    return data;
  }
  




  public static final int SIZE_BYTES = 8;
  



  public static final int SIZE_BITS = 64;
  



  public static final Companion Companion = new Companion(null);
  



  @InlineOnly
  private static final int compareTo-7apg3OU(long $this, byte other)
  {
    ;
    



    long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFF);return UnsignedKt.ulongCompare(l1, l2);
  }
  

  @InlineOnly
  private static final int compareTo-xj2QHRw(long $this, short other)
  {
    ;
    long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFFFF);return UnsignedKt.ulongCompare(l1, l2);
  }
  

  @InlineOnly
  private static final int compareTo-WZ4Q5Ns(long $this, int other)
  {
    ;
    long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFFFFFFFF);return UnsignedKt.ulongCompare(l1, l2);
  }
  

  @InlineOnly
  private static int compareTo-VKZWuLQ(long $this, long other)
  {
    ;
    
    return UnsignedKt.ulongCompare($this, other); }
  
  @InlineOnly
  private static final long plus-7apg3OU(long $this, byte other) { ;
    long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFF);return constructor-impl(l1 + l2); }
  
  @InlineOnly
  private static final long plus-xj2QHRw(long $this, short other) { ; long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFFFF);return constructor-impl(l1 + l2); }
  
  @InlineOnly
  private static final long plus-WZ4Q5Ns(long $this, int other) { ; long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFFFFFFFF);return constructor-impl(l1 + l2); }
  
  @InlineOnly
  private static final long plus-VKZWuLQ(long $this, long other) { ; return constructor-impl($this + other); }
  
  @InlineOnly
  private static final long minus-7apg3OU(long $this, byte other) { ;
    long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFF);return constructor-impl(l1 - l2); }
  
  @InlineOnly
  private static final long minus-xj2QHRw(long $this, short other) { ; long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFFFF);return constructor-impl(l1 - l2); }
  
  @InlineOnly
  private static final long minus-WZ4Q5Ns(long $this, int other) { ; long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFFFFFFFF);return constructor-impl(l1 - l2); }
  
  @InlineOnly
  private static final long minus-VKZWuLQ(long $this, long other) { ; return constructor-impl($this - other); }
  
  @InlineOnly
  private static final long times-7apg3OU(long $this, byte other) { ;
    long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFF);return constructor-impl(l1 * l2); }
  
  @InlineOnly
  private static final long times-xj2QHRw(long $this, short other) { ; long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFFFF);return constructor-impl(l1 * l2); }
  
  @InlineOnly
  private static final long times-WZ4Q5Ns(long $this, int other) { ; long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFFFFFFFF);return constructor-impl(l1 * l2); }
  
  @InlineOnly
  private static final long times-VKZWuLQ(long $this, long other) { ; return constructor-impl($this * other); }
  
  @InlineOnly
  private static final long div-7apg3OU(long $this, byte other) { ;
    long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFF);return UnsignedKt.ulongDivide-eb3DHEI(l1, l2); }
  
  @InlineOnly
  private static final long div-xj2QHRw(long $this, short other) { ; long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFFFF);return UnsignedKt.ulongDivide-eb3DHEI(l1, l2); }
  
  @InlineOnly
  private static final long div-WZ4Q5Ns(long $this, int other) { ; long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFFFFFFFF);return UnsignedKt.ulongDivide-eb3DHEI(l1, l2); }
  
  @InlineOnly
  private static final long div-VKZWuLQ(long $this, long other) { ; return UnsignedKt.ulongDivide-eb3DHEI($this, other); }
  
  @InlineOnly
  private static final long rem-7apg3OU(long $this, byte other) { ;
    long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFF);return UnsignedKt.ulongRemainder-eb3DHEI(l1, l2); }
  
  @InlineOnly
  private static final long rem-xj2QHRw(long $this, short other) { ; long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFFFF);return UnsignedKt.ulongRemainder-eb3DHEI(l1, l2); }
  
  @InlineOnly
  private static final long rem-WZ4Q5Ns(long $this, int other) { ; long l1 = $this;int i = other;long l2 = constructor-impl(i & 0xFFFFFFFF);return UnsignedKt.ulongRemainder-eb3DHEI(l1, l2); }
  
  @InlineOnly
  private static final long rem-VKZWuLQ(long $this, long other) { ; return UnsignedKt.ulongRemainder-eb3DHEI($this, other); }
  
  @InlineOnly
  private static final long inc-impl(long $this) { ;
    return constructor-impl($this + 1L); }
  
  @InlineOnly
  private static final long dec-impl(long $this) { ; return constructor-impl($this + -1L); }
  
  @InlineOnly
  private static final kotlin.ranges.ULongRange rangeTo-VKZWuLQ(long $this, long other) { ;
    return new kotlin.ranges.ULongRange($this, other, null); }
  
  @InlineOnly
  private static final long shl-impl(long $this, int bitCount) { ;
    return constructor-impl($this << bitCount); }
  
  @InlineOnly
  private static final long shr-impl(long $this, int bitCount) { ; return constructor-impl($this >>> bitCount); }
  
  @InlineOnly
  private static final long and-VKZWuLQ(long $this, long other) { ; return constructor-impl($this & other); }
  
  @InlineOnly
  private static final long or-VKZWuLQ(long $this, long other) { ; return constructor-impl($this | other); }
  
  @InlineOnly
  private static final long xor-VKZWuLQ(long $this, long other) { ; return constructor-impl($this ^ other); }
  
  @InlineOnly
  private static final long inv-impl(long $this) { ; return constructor-impl($this ^ 0xFFFFFFFFFFFFFFFF); }
  
  @InlineOnly
  private static final byte toByte-impl(long $this) { ; return (byte)(int)$this; }
  @InlineOnly
  private static final short toShort-impl(long $this) { ; return (short)(int)$this; }
  @InlineOnly
  private static final int toInt-impl(long $this) { ; return (int)$this; }
  @InlineOnly
  private static final long toLong-impl(long $this) { ; return $this; }
  
  @InlineOnly
  private static final byte toUByte-impl(long $this) { ; long l = $this;return UByte.constructor-impl((byte)(int)l); }
  @InlineOnly
  private static final short toUShort-impl(long $this) { ; long l = $this;return UShort.constructor-impl((short)(int)l); }
  @InlineOnly
  private static final int toUInt-impl(long $this) { ; long l = $this;return UInt.constructor-impl((int)l); }
  @InlineOnly
  private static final long toULong-impl(long $this) { ; return $this; }
  @org.jetbrains.annotations.NotNull
  public static String toString-impl(long $this) { return UnsignedKt.ulongToString($this); }
  
  public static int hashCode-impl(long paramLong)
  {
    long tmp1_0 = paramLong;
    return (int)(tmp1_0 ^ tmp1_0 >>> 32);
  }
  
  public static boolean equals-impl(long paramLong, @org.jetbrains.annotations.Nullable Object paramObject)
  {
    if ((paramObject instanceof ULong))
    {
      long l = ((ULong)paramObject).unbox-impl();
      if ((paramLong == l ? 1 : 0) != 0) {
        return true;
      }
    }
    return false;
  }
  
  public static final boolean equals-impl0(long p1, long p2)
  {
    throw null;
  }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\023\020\003\032\0020\004XTø\001\000¢\006\004\n\002\020\005R\023\020\006\032\0020\004XTø\001\000¢\006\004\n\002\020\005R\016\020\007\032\0020\bXT¢\006\002\n\000R\016\020\t\032\0020\bXT¢\006\002\n\000\002\004\n\002\b\031¨\006\n"}, d2={"Lkotlin/ULong$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/ULong;", "J", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"})
  public static final class Companion
  {
    private Companion() {}
  }
}

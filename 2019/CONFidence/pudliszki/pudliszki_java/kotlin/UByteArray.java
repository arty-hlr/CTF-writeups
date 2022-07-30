package kotlin; import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000F\n\002\030\002\n\002\020\036\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\022\n\002\b\006\n\002\020\013\n\002\b\t\n\002\020\000\n\002\b\t\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\004\n\002\020\016\n\002\b\002\b@\030\0002\b\022\004\022\0020\0020\001:\001-B\024\b\026\022\006\020\003\032\0020\004ø\001\000¢\006\004\b\005\020\006B\024\b\001\022\006\020\007\032\0020\bø\001\000¢\006\004\b\005\020\tJ\033\020\016\032\0020\0172\006\020\020\032\0020\002H\002ø\001\000¢\006\004\b\021\020\022J \020\023\032\0020\0172\f\020\024\032\b\022\004\022\0020\0020\001H\026ø\001\000¢\006\004\b\025\020\026J\023\020\027\032\0020\0172\b\020\030\032\004\030\0010\031HÖ\003J\033\020\032\032\0020\0022\006\020\033\032\0020\004H\002ø\001\000¢\006\004\b\034\020\035J\t\020\036\032\0020\004HÖ\001J\017\020\037\032\0020\017H\026¢\006\004\b \020!J\020\020\"\032\0020#H\002¢\006\004\b$\020%J#\020&\032\0020'2\006\020\033\032\0020\0042\006\020(\032\0020\002H\002ø\001\000¢\006\004\b)\020*J\t\020+\032\0020,HÖ\001R\024\020\003\032\0020\0048VX\004¢\006\006\032\004\b\n\020\013R\026\020\007\032\0020\b8\000X\004¢\006\b\n\000\022\004\b\f\020\rø\001\000\002\004\n\002\b\031¨\006."}, d2={"Lkotlin/UByteArray;", "", "Lkotlin/UByte;", "size", "", "constructor-impl", "(I)[B", "storage", "", "([B)[B", "getSize-impl", "([B)I", "storage$annotations", "()V", "contains", "", "element", "contains-7apg3OU", "([BB)Z", "containsAll", "elements", "containsAll-impl", "([BLjava/util/Collection;)Z", "equals", "other", "", "get", "index", "get-impl", "([BI)B", "hashCode", "isEmpty", "isEmpty-impl", "([B)Z", "iterator", "Lkotlin/collections/UByteIterator;", "iterator-impl", "([B)Lkotlin/collections/UByteIterator;", "set", "", "value", "set-VurrAj0", "([BIB)V", "toString", "", "Iterator", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
@ExperimentalUnsignedTypes
public final class UByteArray implements java.util.Collection<UByte>, kotlin.jvm.internal.markers.KMappedMarker { public int getSize() { return getSize-impl(storage); } @NotNull
  public kotlin.collections.UByteIterator iterator() { return iterator-impl(storage); } public boolean contains-7apg3OU(byte paramByte) { return contains-7apg3OU(storage, paramByte); } public boolean containsAll(@NotNull java.util.Collection<? extends Object> paramCollection) { return containsAll-impl(storage, paramCollection); } public boolean isEmpty() { return isEmpty-impl(storage); } public String toString() { return toString-impl(storage); } public int hashCode() { return hashCode-impl(storage); } public boolean equals(Object paramObject) { return equals-impl(storage, paramObject); }
  



  @NotNull
  private final byte[] storage;
  


  @PublishedApi
  @NotNull
  public static byte[] constructor-impl(@NotNull byte[] storage)
  {
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storage, "storage");return storage; }
  
  @NotNull
  public static byte[] constructor-impl(int size) { return constructor-impl(new byte[size]); }
  
  public static final byte get-impl(byte[] $this, int index) {
    byte b = $this[index];return UByte.constructor-impl(b);
  }
  
  public static final void set-VurrAj0(byte[] $this, int index, byte value) {
    int i = value;int j = index;byte[] arrayOfByte = $this;int k = i;arrayOfByte[j] = k;
  }
  

  public static int getSize-impl(byte[] $this) { return $this.length; }
  
  @NotNull
  public static kotlin.collections.UByteIterator iterator-impl(byte[] $this) { return (kotlin.collections.UByteIterator)new Iterator($this); }
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\022\n\002\b\002\n\002\020\b\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\bH\002J\020\020\t\032\0020\nH\026ø\001\000¢\006\002\020\013R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\005\032\0020\006X\016¢\006\002\n\000\002\004\n\002\b\031¨\006\f"}, d2={"Lkotlin/UByteArray$Iterator;", "Lkotlin/collections/UByteIterator;", "array", "", "([B)V", "index", "", "hasNext", "", "nextUByte", "Lkotlin/UByte;", "()B", "kotlin-stdlib"})
  private static final class Iterator extends kotlin.collections.UByteIterator { public Iterator(@NotNull byte[] array) { this.array = array; }
    
    private int index;
    private final byte[] array;
    /* Error */
    public byte nextUByte()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 10	kotlin/UByteArray$Iterator:index	I
      //   4: aload_0
      //   5: getfield 14	kotlin/UByteArray$Iterator:array	[B
      //   8: arraylength
      //   9: if_icmpge +29 -> 38
      //   12: aload_0
      //   13: getfield 14	kotlin/UByteArray$Iterator:array	[B
      //   16: aload_0
      //   17: dup
      //   18: getfield 10	kotlin/UByteArray$Iterator:index	I
      //   21: dup
      //   22: istore_1
      //   23: iconst_1
      //   24: iadd
      //   25: putfield 10	kotlin/UByteArray$Iterator:index	I
      //   28: iload_1
      //   29: baload
      //   30: istore_1
      //   31: iload_1
      //   32: invokestatic 24	kotlin/UByte:constructor-impl	(B)B
      //   35: goto +21 -> 56
      //   38: new 26	java/util/NoSuchElementException
      //   41: dup
      //   42: aload_0
      //   43: getfield 10	kotlin/UByteArray$Iterator:index	I
      //   46: invokestatic 32	java/lang/String:valueOf	(I)Ljava/lang/String;
      //   49: invokespecial 36	java/util/NoSuchElementException:<init>	(Ljava/lang/String;)V
      //   52: checkcast 38	java/lang/Throwable
      //   55: athrow
      //   56: ireturn
      // Line number table:
      //   Java source line #37	-> byte code offset #0
      //   Java source line #37	-> byte code offset #38
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	57	0	this	Iterator
    }
    
    public boolean hasNext() { return index < array.length; }
  }
  
  public static boolean contains-7apg3OU(byte[] $this, byte element) {
    byte b1 = element;byte[] arrayOfByte = $this;byte b2 = b1;return kotlin.collections.ArraysKt.contains(arrayOfByte, b2);
  }
  
  public static boolean isEmpty-impl(byte[] $this) {
    return $this.length == 0;
  }
  
  /* Error */
  public static boolean containsAll-impl(byte[] $this, @NotNull java.util.Collection<UByte> elements)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 107
    //   3: invokestatic 77	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: checkcast 109	java/lang/Iterable
    //   10: astore_2
    //   11: aload_2
    //   12: checkcast 7	java/util/Collection
    //   15: invokeinterface 111 1 0
    //   20: ifeq +7 -> 27
    //   23: iconst_1
    //   24: goto +66 -> 90
    //   27: aload_2
    //   28: invokeinterface 113 1 0
    //   33: astore_3
    //   34: aload_3
    //   35: invokeinterface 116 1 0
    //   40: ifeq +49 -> 89
    //   43: aload_3
    //   44: invokeinterface 120 1 0
    //   49: astore 4
    //   51: aload 4
    //   53: checkcast 44	kotlin/UByte
    //   56: invokevirtual 48	kotlin/UByte:unbox-impl	()B
    //   59: istore 5
    //   61: aload_0
    //   62: iload 5
    //   64: istore 6
    //   66: astore 7
    //   68: iload 6
    //   70: istore 8
    //   72: aload 7
    //   74: iload 8
    //   76: invokestatic 104	kotlin/collections/ArraysKt:contains	([BB)Z
    //   79: ifne -45 -> 34
    //   82: iconst_0
    //   83: goto +7 -> 90
    //   86: nop
    //   87: nop
    //   88: athrow
    //   89: iconst_1
    //   90: ireturn
    // Line number table:
    //   Java source line #42	-> byte code offset #6
    //   Java source line #59	-> byte code offset #11
    //   Java source line #60	-> byte code offset #27
    //   Java source line #42	-> byte code offset #61
    //   Java source line #42	-> byte code offset #76
    //   Java source line #61	-> byte code offset #89
    //   Java source line #42	-> byte code offset #90
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	$this	byte[]
    //   0	91	1	elements	java.util.Collection
    //   11	79	2	$receiver$iv	Iterable
    //   51	35	4	element$iv	Object
    //   61	18	5	it	byte
    //   61	18	9	$i$a$1$all	int
    //   11	79	10	$i$f$all	int
  }
  
  @NotNull
  public static String toString-impl(byte[] paramArrayOfByte)
  {
    return "UByteArray(storage=" + java.util.Arrays.toString(paramArrayOfByte) + ")";
  }
  
  /* Error */
  public static int hashCode-impl(byte[] arg0)
  {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: ifnull +9 -> 11
    //   5: invokestatic 165	java/util/Arrays:hashCode	([B)I
    //   8: goto +5 -> 13
    //   11: pop
    //   12: iconst_0
    //   13: ireturn
  }
  
  public static boolean equals-impl(byte[] paramArrayOfByte, @org.jetbrains.annotations.Nullable Object paramObject)
  {
    if ((paramObject instanceof UByteArray))
    {
      byte[] arrayOfByte = ((UByteArray)paramObject).unbox-impl();
      if (kotlin.jvm.internal.Intrinsics.areEqual(paramArrayOfByte, arrayOfByte)) {
        return true;
      }
    }
    return false;
  }
  
  public static final boolean equals-impl0(@NotNull byte[] p1, @NotNull byte[] p2)
  {
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p1, "p1");
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p2, "p2");
    throw null;
  }
  
  public boolean add-7apg3OU(byte paramByte)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean addAll(java.util.Collection<? extends UByte> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public void clear()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean removeAll(java.util.Collection<? extends Object> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean retainAll(java.util.Collection<? extends Object> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public Object[] toArray()
  {
    return kotlin.jvm.internal.CollectionToArray.toArray(this);
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    return kotlin.jvm.internal.CollectionToArray.toArray(this, paramArrayOfT);
  }
}

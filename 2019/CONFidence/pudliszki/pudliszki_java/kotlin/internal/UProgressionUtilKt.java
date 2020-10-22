package kotlin.internal;

import kotlin.UInt;
import kotlin.UnsignedKt;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000 \n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\n\002\020\b\n\000\n\002\020\t\n\002\b\002\032*\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0012\006\020\004\032\0020\001H\002ø\001\000¢\006\004\b\005\020\006\032*\020\000\032\0020\0072\006\020\002\032\0020\0072\006\020\003\032\0020\0072\006\020\004\032\0020\007H\002ø\001\000¢\006\004\b\b\020\t\032*\020\n\032\0020\0012\006\020\013\032\0020\0012\006\020\f\032\0020\0012\006\020\r\032\0020\016H\001ø\001\000¢\006\004\b\017\020\006\032*\020\n\032\0020\0072\006\020\013\032\0020\0072\006\020\f\032\0020\0072\006\020\r\032\0020\020H\001ø\001\000¢\006\004\b\021\020\t\002\004\n\002\b\031¨\006\022"}, d2={"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"})
public final class UProgressionUtilKt
{
  private static final int differenceModulo-WZ9TVnA(int a, int b, int c)
  {
    int i = a;int ac = UnsignedKt.uintRemainder-J1ME1BU(i, c);
    int j = b;int bc = UnsignedKt.uintRemainder-J1ME1BU(j, c);
    j = ac;j = ac;j = ac;j = UInt.constructor-impl(j - bc);return UnsignedKt.uintCompare(j, bc) >= 0 ? UInt.constructor-impl(j - bc) : UInt.constructor-impl(j + c);
  }
  
  private static final long differenceModulo-sambcqE(long a, long b, long c) {
    long l1 = a;long ac = UnsignedKt.ulongRemainder-eb3DHEI(l1, c);
    long l2 = b;long bc = UnsignedKt.ulongRemainder-eb3DHEI(l2, c);
    l2 = ac;l2 = ac;l2 = ac;l2 = kotlin.ULong.constructor-impl(l2 - bc);return UnsignedKt.ulongCompare(l2, bc) >= 0 ? kotlin.ULong.constructor-impl(l2 - bc) : kotlin.ULong.constructor-impl(l2 + c);
  }
  
  /* Error */
  @kotlin.PublishedApi
  @kotlin.SinceKotlin(version="1.3")
  public static final int getProgressionLastElement-Nkh28Cs(int start, int end, int step)
  {
    // Byte code:
    //   0: iload_2
    //   1: ifle +56 -> 57
    //   4: iload_0
    //   5: istore_3
    //   6: iload_3
    //   7: iload_1
    //   8: invokestatic 15	kotlin/UnsignedKt:uintCompare	(II)I
    //   11: iflt +7 -> 18
    //   14: iload_1
    //   15: goto +113 -> 128
    //   18: iload_1
    //   19: istore_3
    //   20: iload_1
    //   21: iload_0
    //   22: iload_2
    //   23: istore 4
    //   25: istore 6
    //   27: istore 5
    //   29: iload 4
    //   31: invokestatic 21	kotlin/UInt:constructor-impl	(I)I
    //   34: istore 7
    //   36: iload 5
    //   38: iload 6
    //   40: iload 7
    //   42: invokestatic 50	kotlin/internal/UProgressionUtilKt:differenceModulo-WZ9TVnA	(III)I
    //   45: istore 4
    //   47: iload_3
    //   48: iload 4
    //   50: isub
    //   51: invokestatic 21	kotlin/UInt:constructor-impl	(I)I
    //   54: goto +74 -> 128
    //   57: iload_2
    //   58: ifge +57 -> 115
    //   61: iload_0
    //   62: istore_3
    //   63: iload_3
    //   64: iload_1
    //   65: invokestatic 15	kotlin/UnsignedKt:uintCompare	(II)I
    //   68: ifgt +7 -> 75
    //   71: iload_1
    //   72: goto +56 -> 128
    //   75: iload_1
    //   76: istore_3
    //   77: iload_0
    //   78: iload_1
    //   79: iload_2
    //   80: ineg
    //   81: istore 4
    //   83: istore 6
    //   85: istore 5
    //   87: iload 4
    //   89: invokestatic 21	kotlin/UInt:constructor-impl	(I)I
    //   92: istore 7
    //   94: iload 5
    //   96: iload 6
    //   98: iload 7
    //   100: invokestatic 50	kotlin/internal/UProgressionUtilKt:differenceModulo-WZ9TVnA	(III)I
    //   103: istore 4
    //   105: iload_3
    //   106: iload 4
    //   108: iadd
    //   109: invokestatic 21	kotlin/UInt:constructor-impl	(I)I
    //   112: goto +16 -> 128
    //   115: new 52	java/lang/IllegalArgumentException
    //   118: dup
    //   119: ldc 54
    //   121: invokespecial 58	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   124: checkcast 60	java/lang/Throwable
    //   127: athrow
    //   128: ireturn
    // Line number table:
    //   Java source line #40	-> byte code offset #0
    //   Java source line #41	-> byte code offset #0
    //   Java source line #41	-> byte code offset #14
    //   Java source line #41	-> byte code offset #42
    //   Java source line #41	-> byte code offset #54
    //   Java source line #42	-> byte code offset #57
    //   Java source line #42	-> byte code offset #71
    //   Java source line #42	-> byte code offset #100
    //   Java source line #42	-> byte code offset #112
    //   Java source line #43	-> byte code offset #115
    //   Java source line #40	-> byte code offset #128
    //   Java source line #44	-> byte code offset #128
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	start	int
    //   0	129	1	end	int
    //   0	129	2	step	int
  }
  
  /* Error */
  @kotlin.PublishedApi
  @kotlin.SinceKotlin(version="1.3")
  public static final long getProgressionLastElement-7ftBX0g(long start, long end, long step)
  {
    // Byte code:
    //   0: lload 4
    //   2: lconst_0
    //   3: lcmp
    //   4: ifle +61 -> 65
    //   7: lload_0
    //   8: lstore 6
    //   10: lload 6
    //   12: lload_2
    //   13: invokestatic 37	kotlin/UnsignedKt:ulongCompare	(JJ)I
    //   16: iflt +7 -> 23
    //   19: lload_2
    //   20: goto +124 -> 144
    //   23: lload_2
    //   24: lstore 6
    //   26: lload_2
    //   27: lload_0
    //   28: lload 4
    //   30: lstore 8
    //   32: lstore 12
    //   34: lstore 10
    //   36: lload 8
    //   38: invokestatic 42	kotlin/ULong:constructor-impl	(J)J
    //   41: lstore 14
    //   43: lload 10
    //   45: lload 12
    //   47: lload 14
    //   49: invokestatic 66	kotlin/internal/UProgressionUtilKt:differenceModulo-sambcqE	(JJJ)J
    //   52: lstore 8
    //   54: lload 6
    //   56: lload 8
    //   58: lsub
    //   59: invokestatic 42	kotlin/ULong:constructor-impl	(J)J
    //   62: goto +82 -> 144
    //   65: lload 4
    //   67: lconst_0
    //   68: lcmp
    //   69: ifge +62 -> 131
    //   72: lload_0
    //   73: lstore 6
    //   75: lload 6
    //   77: lload_2
    //   78: invokestatic 37	kotlin/UnsignedKt:ulongCompare	(JJ)I
    //   81: ifgt +7 -> 88
    //   84: lload_2
    //   85: goto +59 -> 144
    //   88: lload_2
    //   89: lstore 6
    //   91: lload_0
    //   92: lload_2
    //   93: lload 4
    //   95: lneg
    //   96: lstore 8
    //   98: lstore 12
    //   100: lstore 10
    //   102: lload 8
    //   104: invokestatic 42	kotlin/ULong:constructor-impl	(J)J
    //   107: lstore 14
    //   109: lload 10
    //   111: lload 12
    //   113: lload 14
    //   115: invokestatic 66	kotlin/internal/UProgressionUtilKt:differenceModulo-sambcqE	(JJJ)J
    //   118: lstore 8
    //   120: lload 6
    //   122: lload 8
    //   124: ladd
    //   125: invokestatic 42	kotlin/ULong:constructor-impl	(J)J
    //   128: goto +16 -> 144
    //   131: new 52	java/lang/IllegalArgumentException
    //   134: dup
    //   135: ldc 54
    //   137: invokespecial 58	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   140: checkcast 60	java/lang/Throwable
    //   143: athrow
    //   144: lreturn
    // Line number table:
    //   Java source line #64	-> byte code offset #0
    //   Java source line #65	-> byte code offset #0
    //   Java source line #65	-> byte code offset #19
    //   Java source line #65	-> byte code offset #49
    //   Java source line #65	-> byte code offset #62
    //   Java source line #66	-> byte code offset #65
    //   Java source line #66	-> byte code offset #84
    //   Java source line #66	-> byte code offset #115
    //   Java source line #66	-> byte code offset #128
    //   Java source line #67	-> byte code offset #131
    //   Java source line #64	-> byte code offset #144
    //   Java source line #68	-> byte code offset #144
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	start	long
    //   0	145	2	end	long
    //   0	145	4	step	long
  }
}

package kotlin.internal;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\022\n\000\n\002\020\b\n\002\b\003\n\002\020\t\n\002\b\006\032 \020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0012\006\020\004\032\0020\001H\002\032 \020\000\032\0020\0052\006\020\002\032\0020\0052\006\020\003\032\0020\0052\006\020\004\032\0020\005H\002\032 \020\006\032\0020\0012\006\020\007\032\0020\0012\006\020\b\032\0020\0012\006\020\t\032\0020\001H\001\032 \020\006\032\0020\0052\006\020\007\032\0020\0052\006\020\b\032\0020\0052\006\020\t\032\0020\005H\001\032\030\020\n\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\001H\002\032\030\020\n\032\0020\0052\006\020\002\032\0020\0052\006\020\003\032\0020\005H\002¨\006\013"}, d2={"differenceModulo", "", "a", "b", "c", "", "getProgressionLastElement", "start", "end", "step", "mod", "kotlin-stdlib"})
public final class ProgressionUtilKt
{
  private static final int mod(int a, int b)
  {
    int mod = a % b;
    return mod >= 0 ? mod : mod + b;
  }
  
  private static final long mod(long a, long b) {
    long mod = a % b;
    return mod >= 0L ? mod : mod + b;
  }
  
  private static final int differenceModulo(int a, int b, int c)
  {
    return mod(mod(a, c) - mod(b, c), c);
  }
  
  private static final long differenceModulo(long a, long b, long c) {
    return mod(mod(a, c) - mod(b, c), c);
  }
  
  /* Error */
  @kotlin.PublishedApi
  public static final int getProgressionLastElement(int start, int end, int step)
  {
    // Byte code:
    //   0: iload_2
    //   1: ifle +23 -> 24
    //   4: iload_0
    //   5: iload_1
    //   6: if_icmplt +7 -> 13
    //   9: iload_1
    //   10: goto +52 -> 62
    //   13: iload_1
    //   14: iload_1
    //   15: iload_0
    //   16: iload_2
    //   17: invokestatic 23	kotlin/internal/ProgressionUtilKt:differenceModulo	(III)I
    //   20: isub
    //   21: goto +41 -> 62
    //   24: iload_2
    //   25: ifge +24 -> 49
    //   28: iload_0
    //   29: iload_1
    //   30: if_icmpgt +7 -> 37
    //   33: iload_1
    //   34: goto +28 -> 62
    //   37: iload_1
    //   38: iload_0
    //   39: iload_1
    //   40: iload_2
    //   41: ineg
    //   42: invokestatic 23	kotlin/internal/ProgressionUtilKt:differenceModulo	(III)I
    //   45: iadd
    //   46: goto +16 -> 62
    //   49: new 25	java/lang/IllegalArgumentException
    //   52: dup
    //   53: ldc 27
    //   55: invokespecial 31	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   58: checkcast 33	java/lang/Throwable
    //   61: athrow
    //   62: ireturn
    // Line number table:
    //   Java source line #45	-> byte code offset #0
    //   Java source line #46	-> byte code offset #0
    //   Java source line #47	-> byte code offset #24
    //   Java source line #48	-> byte code offset #49
    //   Java source line #45	-> byte code offset #62
    //   Java source line #49	-> byte code offset #62
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	start	int
    //   0	63	1	end	int
    //   0	63	2	step	int
  }
  
  /* Error */
  @kotlin.PublishedApi
  public static final long getProgressionLastElement(long start, long end, long step)
  {
    // Byte code:
    //   0: lload 4
    //   2: lconst_0
    //   3: lcmp
    //   4: ifle +25 -> 29
    //   7: lload_0
    //   8: lload_2
    //   9: lcmp
    //   10: iflt +7 -> 17
    //   13: lload_2
    //   14: goto +58 -> 72
    //   17: lload_2
    //   18: lload_2
    //   19: lload_0
    //   20: lload 4
    //   22: invokestatic 38	kotlin/internal/ProgressionUtilKt:differenceModulo	(JJJ)J
    //   25: lsub
    //   26: goto +46 -> 72
    //   29: lload 4
    //   31: lconst_0
    //   32: lcmp
    //   33: ifge +26 -> 59
    //   36: lload_0
    //   37: lload_2
    //   38: lcmp
    //   39: ifgt +7 -> 46
    //   42: lload_2
    //   43: goto +29 -> 72
    //   46: lload_2
    //   47: lload_0
    //   48: lload_2
    //   49: lload 4
    //   51: lneg
    //   52: invokestatic 38	kotlin/internal/ProgressionUtilKt:differenceModulo	(JJJ)J
    //   55: ladd
    //   56: goto +16 -> 72
    //   59: new 25	java/lang/IllegalArgumentException
    //   62: dup
    //   63: ldc 27
    //   65: invokespecial 31	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   68: checkcast 33	java/lang/Throwable
    //   71: athrow
    //   72: lreturn
    // Line number table:
    //   Java source line #68	-> byte code offset #0
    //   Java source line #69	-> byte code offset #0
    //   Java source line #70	-> byte code offset #29
    //   Java source line #71	-> byte code offset #59
    //   Java source line #68	-> byte code offset #72
    //   Java source line #72	-> byte code offset #72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	start	long
    //   0	73	2	end	long
    //   0	73	4	step	long
  }
}

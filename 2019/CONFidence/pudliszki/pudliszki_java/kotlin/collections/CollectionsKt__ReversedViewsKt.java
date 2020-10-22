package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\030\n\000\n\002\020 \n\000\n\002\020!\n\002\b\002\n\002\020\b\n\002\b\005\032\034\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\001\032#\020\000\032\b\022\004\022\002H\0020\003\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H\007¢\006\002\b\004\032\035\020\005\032\0020\006*\006\022\002\b\0030\0012\006\020\007\032\0020\006H\002¢\006\002\b\b\032\035\020\t\032\0020\006*\006\022\002\b\0030\0012\006\020\007\032\0020\006H\002¢\006\002\b\n¨\006\013"}, d2={"asReversed", "", "T", "", "asReversedMutable", "reverseElementIndex", "", "index", "reverseElementIndex$CollectionsKt__ReversedViewsKt", "reversePositionIndex", "reversePositionIndex$CollectionsKt__ReversedViewsKt", "kotlin-stdlib"}, xs="kotlin/collections/CollectionsKt")
class CollectionsKt__ReversedViewsKt
  extends CollectionsKt__MutableCollectionsKt
{
  /* Error */
  private static final int reverseElementIndex$CollectionsKt__ReversedViewsKt(@NotNull List<?> $receiver, int index)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 13	kotlin/collections/CollectionsKt:getLastIndex	(Ljava/util/List;)I
    //   4: iconst_0
    //   5: iload_1
    //   6: istore_2
    //   7: iload_2
    //   8: if_icmple +7 -> 15
    //   11: pop
    //   12: goto +16 -> 28
    //   15: iload_2
    //   16: if_icmplt +12 -> 28
    //   19: aload_0
    //   20: invokestatic 13	kotlin/collections/CollectionsKt:getLastIndex	(Ljava/util/List;)I
    //   23: iload_1
    //   24: isub
    //   25: goto +60 -> 85
    //   28: new 15	java/lang/IndexOutOfBoundsException
    //   31: dup
    //   32: new 17	java/lang/StringBuilder
    //   35: dup
    //   36: invokespecial 21	java/lang/StringBuilder:<init>	()V
    //   39: ldc 23
    //   41: invokevirtual 27	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: iload_1
    //   45: invokevirtual 30	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   48: ldc 32
    //   50: invokevirtual 27	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: iconst_0
    //   54: istore_2
    //   55: new 34	kotlin/ranges/IntRange
    //   58: dup
    //   59: iload_2
    //   60: aload_0
    //   61: invokestatic 13	kotlin/collections/CollectionsKt:getLastIndex	(Ljava/util/List;)I
    //   64: invokespecial 37	kotlin/ranges/IntRange:<init>	(II)V
    //   67: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   70: ldc 42
    //   72: invokevirtual 27	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: invokevirtual 46	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: invokespecial 49	java/lang/IndexOutOfBoundsException:<init>	(Ljava/lang/String;)V
    //   81: checkcast 51	java/lang/Throwable
    //   84: athrow
    //   85: ireturn
    // Line number table:
    //   Java source line #30	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	$receiver	List
    //   0	86	1	index	int
  }
  
  /* Error */
  private static final int reversePositionIndex$CollectionsKt__ReversedViewsKt(@NotNull List<?> $receiver, int index)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface 62 1 0
    //   6: iconst_0
    //   7: iload_1
    //   8: istore_2
    //   9: iload_2
    //   10: if_icmple +7 -> 17
    //   13: pop
    //   14: goto +18 -> 32
    //   17: iload_2
    //   18: if_icmplt +14 -> 32
    //   21: aload_0
    //   22: invokeinterface 62 1 0
    //   27: iload_1
    //   28: isub
    //   29: goto +62 -> 91
    //   32: new 15	java/lang/IndexOutOfBoundsException
    //   35: dup
    //   36: new 17	java/lang/StringBuilder
    //   39: dup
    //   40: invokespecial 21	java/lang/StringBuilder:<init>	()V
    //   43: ldc 64
    //   45: invokevirtual 27	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: iload_1
    //   49: invokevirtual 30	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   52: ldc 32
    //   54: invokevirtual 27	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: iconst_0
    //   58: istore_2
    //   59: new 34	kotlin/ranges/IntRange
    //   62: dup
    //   63: iload_2
    //   64: aload_0
    //   65: invokeinterface 62 1 0
    //   70: invokespecial 37	kotlin/ranges/IntRange:<init>	(II)V
    //   73: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   76: ldc 42
    //   78: invokevirtual 27	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: invokevirtual 46	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   84: invokespecial 49	java/lang/IndexOutOfBoundsException:<init>	(Ljava/lang/String;)V
    //   87: checkcast 51	java/lang/Throwable
    //   90: athrow
    //   91: ireturn
    // Line number table:
    //   Java source line #33	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	$receiver	List
    //   0	92	1	index	int
  }
  
  @NotNull
  public static final <T> List<T> asReversed(@NotNull List<? extends T> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (List)new ReversedListReadOnly($receiver);
  }
  

  @JvmName(name="asReversedMutable")
  @NotNull
  public static final <T> List<T> asReversedMutable(@NotNull List<T> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (List)new ReversedList($receiver);
  }
  
  public CollectionsKt__ReversedViewsKt() {}
}

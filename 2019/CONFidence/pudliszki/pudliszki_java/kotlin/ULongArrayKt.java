package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;











































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\032\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\b\006\032-\020\000\032\0020\0012\006\020\002\032\0020\0032\022\020\004\032\016\022\004\022\0020\003\022\004\022\0020\0060\005H\bø\001\000¢\006\002\020\007\032\037\020\b\032\0020\0012\n\020\t\032\0020\001\"\0020\006H\bø\001\000¢\006\004\b\n\020\013\002\004\n\002\b\031¨\006\f"}, d2={"ULongArray", "Lkotlin/ULongArray;", "size", "", "init", "Lkotlin/Function1;", "Lkotlin/ULong;", "(ILkotlin/jvm/functions/Function1;)[J", "ulongArrayOf", "elements", "ulongArrayOf-QwZRm1k", "([J)[J", "kotlin-stdlib"})
public final class ULongArrayKt
{
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final long[] ulongArrayOf-QwZRm1k(long... elements)
  {
    ;
    return elements; } @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final long[] ULongArray(int size, Function1<? super Integer, ULong> init) { ; int $i$f$LongArray; long[] result$iv = new long[size];
    int i = 0; for (int j = result$iv.length; i < j;) { int i$iv;
      int k = i$iv;int m = i$iv;long[] arrayOfLong1 = result$iv;
      int $i$a$1$<init>;
      int index;
      long l1 = ((ULong)init.invoke(Integer.valueOf(index))).unbox-impl();long l2 = l1;arrayOfLong1[m] = l2;
      







      i$iv++;
    }
    return ULongArray.constructor-impl(
    










      result$iv);
  }
}

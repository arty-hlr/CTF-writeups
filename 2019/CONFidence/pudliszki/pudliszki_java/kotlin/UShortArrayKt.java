package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;











































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\032\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\b\006\032-\020\000\032\0020\0012\006\020\002\032\0020\0032\022\020\004\032\016\022\004\022\0020\003\022\004\022\0020\0060\005H\bø\001\000¢\006\002\020\007\032\037\020\b\032\0020\0012\n\020\t\032\0020\001\"\0020\006H\bø\001\000¢\006\004\b\n\020\013\002\004\n\002\b\031¨\006\f"}, d2={"UShortArray", "Lkotlin/UShortArray;", "size", "", "init", "Lkotlin/Function1;", "Lkotlin/UShort;", "(ILkotlin/jvm/functions/Function1;)[S", "ushortArrayOf", "elements", "ushortArrayOf-rL5Bavg", "([S)[S", "kotlin-stdlib"})
public final class UShortArrayKt
{
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final short[] ushortArrayOf-rL5Bavg(short... elements)
  {
    ;
    return elements; } @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final short[] UShortArray(int size, Function1<? super Integer, UShort> init) { ; int $i$f$ShortArray; short[] result$iv = new short[size];
    int i = 0; for (int j = result$iv.length; i < j;) { int i$iv;
      int k = i$iv;int n = i$iv;short[] arrayOfShort1 = result$iv;
      int $i$a$1$<init>;
      int index;
      int m = ((UShort)init.invoke(Integer.valueOf(index))).unbox-impl();int i1 = m;arrayOfShort1[n] = i1;
      







      i$iv++;
    }
    return UShortArray.constructor-impl(
    










      result$iv);
  }
}

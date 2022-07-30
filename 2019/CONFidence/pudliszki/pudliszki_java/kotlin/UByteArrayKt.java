package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;











































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\032\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\b\006\032-\020\000\032\0020\0012\006\020\002\032\0020\0032\022\020\004\032\016\022\004\022\0020\003\022\004\022\0020\0060\005H\bø\001\000¢\006\002\020\007\032\037\020\b\032\0020\0012\n\020\t\032\0020\001\"\0020\006H\bø\001\000¢\006\004\b\n\020\013\002\004\n\002\b\031¨\006\f"}, d2={"UByteArray", "Lkotlin/UByteArray;", "size", "", "init", "Lkotlin/Function1;", "Lkotlin/UByte;", "(ILkotlin/jvm/functions/Function1;)[B", "ubyteArrayOf", "elements", "ubyteArrayOf-GBYM_sE", "([B)[B", "kotlin-stdlib"})
public final class UByteArrayKt
{
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final byte[] ubyteArrayOf-GBYM_sE(byte... elements)
  {
    ;
    return elements; } @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final byte[] UByteArray(int size, Function1<? super Integer, UByte> init) { ; int $i$f$ByteArray; byte[] result$iv = new byte[size];
    int i = 0; for (int j = result$iv.length; i < j;) { int i$iv;
      int k = i$iv;int n = i$iv;byte[] arrayOfByte1 = result$iv;
      int $i$a$1$<init>;
      int index;
      int m = ((UByte)init.invoke(Integer.valueOf(index))).unbox-impl();int i1 = m;arrayOfByte1[n] = i1;
      







      i$iv++;
    }
    return UByteArray.constructor-impl(
    










      result$iv);
  }
}

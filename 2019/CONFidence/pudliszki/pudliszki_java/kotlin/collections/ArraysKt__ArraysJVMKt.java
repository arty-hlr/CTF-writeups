package kotlin.collections;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\0002\n\000\n\002\020\021\n\002\b\003\n\002\020\b\n\002\b\002\n\002\020\002\n\002\b\007\n\002\020\016\n\002\020\022\n\000\n\002\030\002\n\000\n\002\020\036\n\002\b\002\032/\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\f\020\003\032\b\022\004\022\002H\0020\0012\006\020\004\032\0020\005H\000¢\006\002\020\006\032\030\020\007\032\0020\b2\006\020\t\032\0020\0052\006\020\004\032\0020\005H\001\032!\020\n\032\0020\005\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\001H\001¢\006\004\b\013\020\f\032,\020\r\032\n\022\006\b\001\022\002H\0020\001\"\006\b\000\020\002\030\001*\f\022\006\b\001\022\002H\002\030\0010\001H\b¢\006\002\020\016\032\025\020\017\032\0020\020*\0020\0212\006\020\022\032\0020\023H\b\032&\020\024\032\b\022\004\022\002H\0020\001\"\006\b\000\020\002\030\001*\b\022\004\022\002H\0020\025H\b¢\006\002\020\026¨\006\027"}, d2={"arrayOfNulls", "", "T", "reference", "size", "", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "copyOfRangeToIndexCheck", "", "toIndex", "contentDeepHashCodeImpl", "contentDeepHashCode", "([Ljava/lang/Object;)I", "orEmpty", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "", "charset", "Ljava/nio/charset/Charset;", "toTypedArray", "", "(Ljava/util/Collection;)[Ljava/lang/Object;", "kotlin-stdlib"}, xs="kotlin/collections/ArraysKt")
class ArraysKt__ArraysJVMKt
{
  /* Error */
  private static final <T> T[] orEmpty(@org.jetbrains.annotations.Nullable T[] $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: ifnull +6 -> 8
    //   5: goto +14 -> 19
    //   8: pop
    //   9: iconst_0
    //   10: iconst_0
    //   11: ldc 9
    //   13: invokestatic 15	kotlin/jvm/internal/Intrinsics:reifiedOperationMarker	(ILjava/lang/String;)V
    //   16: anewarray 4	java/lang/Object
    //   19: areturn
    // Line number table:
    //   Java source line #18	-> byte code offset #0
    //   Java source line #62	-> byte code offset #9
    //   Java source line #63	-> byte code offset #9
    //   Java source line #18	-> byte code offset #19
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	20	0	$receiver	Object[]
    //   0	20	1	$i$f$orEmpty	int
    //   9	10	2	$i$f$emptyArray	int
  }
  
  @InlineOnly
  private static final String toString(@NotNull byte[] $receiver, Charset charset)
  {
    ;
    return new String($receiver, charset);
  }
  



  private static final <T> T[] toTypedArray(@NotNull Collection<? extends T> $receiver)
  {
    ;
    


    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>"); Collection thisCollection = $receiver;
    Intrinsics.reifiedOperationMarker(0, "T?"); Object[] tmp32_27 = thisCollection.toArray(new Object[0]); if (tmp32_27 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>"); return tmp32_27;
  }
  
  @NotNull
  public static final <T> T[] arrayOfNulls(@NotNull T[] reference, int size)
  {
    Intrinsics.checkParameterIsNotNull(reference, "reference"); Object tmp17_14 = Array.newInstance(reference.getClass().getComponentType(), size); if (tmp17_14 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>"); return (Object[])tmp17_14;
  }
  
  @SinceKotlin(version="1.3")
  public static final void copyOfRangeToIndexCheck(int toIndex, int size) {
    if (toIndex > size) { throw ((Throwable)new IndexOutOfBoundsException("toIndex (" + toIndex + ") is greater than size (" + size + ")."));
    }
  }
  


  @SinceKotlin(version="1.3")
  @PublishedApi
  @JvmName(name="contentDeepHashCode")
  public static final <T> int contentDeepHashCode(@NotNull T[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return Arrays.deepHashCode($receiver);
  }
  
  public ArraysKt__ArraysJVMKt() {}
}

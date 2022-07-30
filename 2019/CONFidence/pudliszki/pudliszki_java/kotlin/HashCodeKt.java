package kotlin;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\f\n\000\n\002\020\b\n\002\020\000\n\000\032\017\020\000\032\0020\001*\004\030\0010\002H\b¨\006\003"}, d2={"hashCode", "", "", "kotlin-stdlib"})
public final class HashCodeKt
{
  /* Error */
  @SinceKotlin(version="1.3")
  @kotlin.internal.InlineOnly
  private static final int hashCode(@org.jetbrains.annotations.Nullable Object $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: ifnull +9 -> 11
    //   5: invokevirtual 14	java/lang/Object:hashCode	()I
    //   8: goto +5 -> 13
    //   11: pop
    //   12: iconst_0
    //   13: ireturn
    // Line number table:
    //   Java source line #18	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	14	0	$receiver	Object
    //   0	14	1	$i$f$hashCode	int
  }
}

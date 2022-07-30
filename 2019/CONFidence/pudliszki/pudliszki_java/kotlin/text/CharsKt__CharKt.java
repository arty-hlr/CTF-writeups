package kotlin.text;

import kotlin.Metadata;
import kotlin.internal.InlineOnly;




@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\024\n\000\n\002\020\013\n\002\020\f\n\002\b\004\n\002\020\016\n\000\032\034\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0022\b\b\002\020\004\032\0020\001\032\n\020\005\032\0020\001*\0020\002\032\025\020\006\032\0020\007*\0020\0022\006\020\003\032\0020\007H\n¨\006\b"}, d2={"equals", "", "", "other", "ignoreCase", "isSurrogate", "plus", "", "kotlin-stdlib"}, xs="kotlin/text/CharsKt")
class CharsKt__CharKt
  extends CharsKt__CharJVMKt
{
  @InlineOnly
  private static final String plus(char $receiver, String other)
  {
    ;
    return String.valueOf($receiver) + other;
  }
  










  public static final boolean equals(char $receiver, char other, boolean ignoreCase)
  {
    if ($receiver == other) return true;
    if (!ignoreCase) { return false;
    }
    char c = $receiver;c = other;int i = Character.toUpperCase(c);int j = Character.toUpperCase(c); if (i == j) return true;
    c = $receiver;c = other;i = Character.toLowerCase(c);j = Character.toLowerCase(c); if (i == j) return true;
    return false;
  }
  
  /* Error */
  public static final boolean isSurrogate(char $receiver)
  {
    // Byte code:
    //   0: ldc 55
    //   2: ldc 56
    //   4: iload_0
    //   5: istore_1
    //   6: iload_1
    //   7: if_icmple +7 -> 14
    //   10: pop
    //   11: goto +11 -> 22
    //   14: iload_1
    //   15: if_icmplt +7 -> 22
    //   18: iconst_1
    //   19: goto +4 -> 23
    //   22: iconst_0
    //   23: ireturn
    // Line number table:
    //   Java source line #43	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	24	0	$receiver	char
  }
  
  public CharsKt__CharKt() {}
}

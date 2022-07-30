package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;











@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\bÂ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\020\020\003\032\0020\0048\006X\004¢\006\002\n\000¨\006\005"}, d2={"Lkotlin/text/SystemProperties;", "", "()V", "LINE_SEPARATOR", "", "kotlin-stdlib"})
final class SystemProperties
{
  private SystemProperties() {}
  
  static
  {
    SystemProperties localSystemProperties = new SystemProperties();INSTANCE = localSystemProperties; String 
    

      tmp17_14 = System.getProperty("line.separator");
    

    if (tmp17_14 == null) Intrinsics.throwNpe(); } @JvmField
  @NotNull
  public static final String LINE_SEPARATOR = tmp17_14;
  public static final SystemProperties INSTANCE;
}

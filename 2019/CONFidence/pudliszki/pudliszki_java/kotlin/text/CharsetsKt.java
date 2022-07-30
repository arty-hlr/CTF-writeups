package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\016\n\000\n\002\030\002\n\000\n\002\020\016\n\000\032\021\020\000\032\0020\0012\006\020\002\032\0020\003H\b¨\006\004"}, d2={"charset", "Ljava/nio/charset/Charset;", "charsetName", "", "kotlin-stdlib"})
@JvmName(name="CharsetsKt")
public final class CharsetsKt
{
  @InlineOnly
  private static final Charset charset(String charsetName)
  {
    ;
    Charset tmp4_1 = Charset.forName(charsetName);Intrinsics.checkExpressionValueIsNotNull(tmp4_1, "Charset.forName(charsetName)");return tmp4_1;
  }
}

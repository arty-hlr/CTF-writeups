package kotlin.io;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\020\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\032$\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0032\b\020\005\032\004\030\0010\001H\002¨\006\006"}, d2={"constructMessage", "", "file", "Ljava/io/File;", "other", "reason", "kotlin-stdlib"})
public final class ExceptionsKt
{
  private static final String constructMessage(File file, File other, String reason)
  {
    StringBuilder sb = new StringBuilder(file.toString());
    if (other != null) {
      sb.append(" -> " + other);
    }
    if (reason != null) {
      sb.append(": " + reason);
    }
    String tmp72_69 = sb.toString();Intrinsics.checkExpressionValueIsNotNull(tmp72_69, "sb.toString()");return tmp72_69;
  }
}

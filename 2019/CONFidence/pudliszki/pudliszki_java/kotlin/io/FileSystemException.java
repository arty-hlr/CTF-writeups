package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;









@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\007\b\026\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\003\022\n\b\002\020\005\032\004\030\0010\006¢\006\002\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\n\020\tR\023\020\005\032\004\030\0010\006¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2={"Lkotlin/io/FileSystemException;", "Ljava/io/IOException;", "file", "Ljava/io/File;", "other", "reason", "", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "getOther", "getReason", "()Ljava/lang/String;", "kotlin-stdlib"})
public class FileSystemException
  extends IOException
{
  @NotNull
  private final File file;
  @Nullable
  private final File other;
  @Nullable
  private final String reason;
  
  @NotNull
  public final File getFile() { return file; } @Nullable
  public final File getOther() { return other; } @Nullable
  public final String getReason() { return reason; }
  public FileSystemException(@NotNull File file, @Nullable File other, @Nullable String reason) { super(ExceptionsKt.access$constructMessage(file, other, reason));this.file = file;this.other = other;this.reason = reason;
  }
}

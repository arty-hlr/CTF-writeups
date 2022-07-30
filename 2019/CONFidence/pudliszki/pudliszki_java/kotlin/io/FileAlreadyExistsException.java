package kotlin.io;

import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




























@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\003\022\n\b\002\020\005\032\004\030\0010\006¢\006\002\020\007¨\006\b"}, d2={"Lkotlin/io/FileAlreadyExistsException;", "Lkotlin/io/FileSystemException;", "file", "Ljava/io/File;", "other", "reason", "", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "kotlin-stdlib"})
public final class FileAlreadyExistsException
  extends FileSystemException
{
  public FileAlreadyExistsException(@NotNull File file, @Nullable File other, @Nullable String reason)
  {
    super(file, other, reason);
  }
}

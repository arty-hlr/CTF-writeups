package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;












































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\020\013\n\002\b\004\n\002\020\016\n\002\b\005\n\002\020\b\n\002\b\r\b\b\030\0002\0020\001B\035\b\000\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0030\005¢\006\002\020\006J\t\020\026\032\0020\003HÆ\003J\017\020\027\032\b\022\004\022\0020\0030\005HÆ\003J#\020\030\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0030\005HÆ\001J\023\020\031\032\0020\b2\b\020\032\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\023HÖ\001J\026\020\034\032\0020\0032\006\020\035\032\0020\0232\006\020\036\032\0020\023J\t\020\037\032\0020\rHÖ\001R\021\020\007\032\0020\b8F¢\006\006\032\004\b\007\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\r8F¢\006\006\032\004\b\016\020\017R\027\020\004\032\b\022\004\022\0020\0030\005¢\006\b\n\000\032\004\b\020\020\021R\021\020\022\032\0020\0238F¢\006\006\032\004\b\024\020\025¨\006 "}, d2={"Lkotlin/io/FilePathComponents;", "", "root", "Ljava/io/File;", "segments", "", "(Ljava/io/File;Ljava/util/List;)V", "isRooted", "", "()Z", "getRoot", "()Ljava/io/File;", "rootName", "", "getRootName", "()Ljava/lang/String;", "getSegments", "()Ljava/util/List;", "size", "", "getSize", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "subPath", "beginIndex", "endIndex", "toString", "kotlin-stdlib"})
public final class FilePathComponents
{
  @NotNull
  private final File root;
  @NotNull
  private final List<File> segments;
  
  @NotNull
  public final File getRoot() { return root; } @NotNull
  public final List<File> getSegments() { return segments; } public FilePathComponents(@NotNull File root, @NotNull List<? extends File> segments) { this.root = root;this.segments = segments;
  }
  
  @NotNull
  public final String getRootName() {
    String tmp7_4 = root.getPath();Intrinsics.checkExpressionValueIsNotNull(tmp7_4, "root.path");return tmp7_4;
  }
  
  public final boolean isRooted()
  {
    String tmp7_4 = root.getPath();Intrinsics.checkExpressionValueIsNotNull(tmp7_4, "root.path");CharSequence localCharSequence = (CharSequence)tmp7_4;return localCharSequence.length() > 0;
  }
  
  public final int getSize()
  {
    return segments.size();
  }
  

  @NotNull
  public final File subPath(int beginIndex, int endIndex)
  {
    if ((beginIndex < 0) || (beginIndex > endIndex) || (endIndex > getSize())) {
      throw ((Throwable)new IllegalArgumentException());
    }
    String tmp49_46 = File.separator;Intrinsics.checkExpressionValueIsNotNull(tmp49_46, "File.separator");return new File(CollectionsKt.joinToString$default((Iterable)segments.subList(beginIndex, endIndex), (CharSequence)tmp49_46, null, null, 0, null, null, 62, null));
  }
  
  @NotNull
  public final File component1()
  {
    return root;
  }
  
  @NotNull
  public final List<File> component2()
  {
    return segments;
  }
  
  @NotNull
  public final FilePathComponents copy(@NotNull File root, @NotNull List<? extends File> segments)
  {
    Intrinsics.checkParameterIsNotNull(root, "root");
    Intrinsics.checkParameterIsNotNull(segments, "segments");
    return new FilePathComponents(root, segments);
  }
  
  @NotNull
  public String toString()
  {
    return "FilePathComponents(root=" + root + ", segments=" + segments + ")";
  }
  
  /* Error */
  public int hashCode()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 11	kotlin/io/FilePathComponents:root	Ljava/io/File;
    //   4: dup
    //   5: ifnull +9 -> 14
    //   8: invokevirtual 124	java/lang/Object:hashCode	()I
    //   11: goto +5 -> 16
    //   14: pop
    //   15: iconst_0
    //   16: bipush 31
    //   18: imul
    //   19: aload_0
    //   20: getfield 39	kotlin/io/FilePathComponents:segments	Ljava/util/List;
    //   23: dup
    //   24: ifnull +9 -> 33
    //   27: invokevirtual 124	java/lang/Object:hashCode	()I
    //   30: goto +5 -> 35
    //   33: pop
    //   34: iconst_0
    //   35: iadd
    //   36: ireturn
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof FilePathComponents))
      {
        FilePathComponents localFilePathComponents = (FilePathComponents)paramObject;
        if ((!Intrinsics.areEqual(root, root)) || (!Intrinsics.areEqual(segments, segments))) {}
      }
    }
    else {
      return true;
    }
    return false;
  }
}

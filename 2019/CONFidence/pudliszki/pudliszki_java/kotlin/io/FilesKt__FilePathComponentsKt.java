package kotlin.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;









@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000$\n\000\n\002\020\013\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\003\n\002\020\b\n\002\b\005\n\002\030\002\n\000\032\021\020\013\032\0020\f*\0020\bH\002¢\006\002\b\r\032\034\020\016\032\0020\002*\0020\0022\006\020\017\032\0020\f2\006\020\020\032\0020\fH\000\032\f\020\021\032\0020\022*\0020\002H\000\"\025\020\000\032\0020\001*\0020\0028F¢\006\006\032\004\b\000\020\003\"\030\020\004\032\0020\002*\0020\0028@X\004¢\006\006\032\004\b\005\020\006\"\030\020\007\032\0020\b*\0020\0028@X\004¢\006\006\032\004\b\t\020\n¨\006\023"}, d2={"isRooted", "", "Ljava/io/File;", "(Ljava/io/File;)Z", "root", "getRoot", "(Ljava/io/File;)Ljava/io/File;", "rootName", "", "getRootName", "(Ljava/io/File;)Ljava/lang/String;", "getRootLength", "", "getRootLength$FilesKt__FilePathComponentsKt", "subPath", "beginIndex", "endIndex", "toComponents", "Lkotlin/io/FilePathComponents;", "kotlin-stdlib"}, xs="kotlin/io/FilesKt")
class FilesKt__FilePathComponentsKt
{
  private static final int getRootLength$FilesKt__FilePathComponentsKt(@NotNull String $receiver)
  {
    int first = StringsKt.indexOf$default((CharSequence)$receiver, File.separatorChar, 0, false, 4, null);
    if (first == 0) {
      if (($receiver.length() > 1) && ($receiver.charAt(1) == File.separatorChar))
      {


        first = StringsKt.indexOf$default((CharSequence)$receiver, File.separatorChar, 2, false, 4, null);
        if (first >= 0) {
          first = StringsKt.indexOf$default((CharSequence)$receiver, File.separatorChar, first + 1, false, 4, null);
          if (first >= 0) {
            return first + 1;
          }
          return $receiver.length();
        }
      }
      return 1;
    }
    
    if ((first > 0) && ($receiver.charAt(first - 1) == ':')) {
      first++;
      return first;
    }
    
    if ((first == -1) && (StringsKt.endsWith$default((CharSequence)$receiver, ':', false, 2, null)))
      return $receiver.length();
    return 0;
  }
  











  @NotNull
  public static final String getRootName(@NotNull File $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); String tmp10_7 = $receiver.getPath();Intrinsics.checkExpressionValueIsNotNull(tmp10_7, "path");String str = tmp10_7;int i = 0; String tmp23_20 = $receiver.getPath();Intrinsics.checkExpressionValueIsNotNull(tmp23_20, "path");int j = getRootLength$FilesKt__FilePathComponentsKt(tmp23_20); String tmp34_33 = str; if (tmp34_33 == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.String"); String tmp53_50 = tmp34_33.substring(i, j);Intrinsics.checkExpressionValueIsNotNull(tmp53_50, "(this as java.lang.Strin…ing(startIndex, endIndex)");return tmp53_50;
  }
  

  @NotNull
  public static final File getRoot(@NotNull File $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return new File(FilesKt.getRootName($receiver));
  }
  



  public static final boolean isRooted(@NotNull File $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); String tmp10_7 = $receiver.getPath();Intrinsics.checkExpressionValueIsNotNull(tmp10_7, "path");return getRootLength$FilesKt__FilePathComponentsKt(tmp10_7) > 0;
  }
  






































  @NotNull
  public static final FilePathComponents toComponents(@NotNull File $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");String path = $receiver.getPath(); String 
      tmp12_11 = path;Intrinsics.checkExpressionValueIsNotNull(tmp12_11, "path");int rootLength = getRootLength$FilesKt__FilePathComponentsKt(tmp12_11);
    String str1 = path;int i = 0; String tmp36_33 = str1.substring(i, rootLength);Intrinsics.checkExpressionValueIsNotNull(tmp36_33, "(this as java.lang.Strin…ing(startIndex, endIndex)");String rootName = tmp36_33;
    String str2 = path; String tmp52_49 = str2.substring(rootLength);Intrinsics.checkExpressionValueIsNotNull(tmp52_49, "(this as java.lang.String).substring(startIndex)");String subPath = tmp52_49;
    CharSequence localCharSequence = (CharSequence)subPath;Iterable $receiver$iv = (Iterable)StringsKt.split$default((CharSequence)subPath, new char[] { File.separatorChar }, false, 0, 6, null);
    






    int $i$f$map;
    






    Iterable localIterable1 = $receiver$iv;Collection destination$iv$iv = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault($receiver$iv, 10));
    int $i$f$mapTo; Iterable $receiver$iv$iv; Collection localCollection1; File localFile; for (Iterator localIterator = $receiver$iv$iv.iterator(); localIterator.hasNext(); localCollection1.add(localFile))
    {















      Object item$iv$iv = localIterator.next();
      String str3 = (String)item$iv$iv;localCollection1 = destination$iv$iv;
      int $i$a$1$unknown;
      String p1;
      localFile = 
      
















        new File(p1);
    }
    List list = (localCharSequence.length() == 0 ? 1 : 0) != 0 ? CollectionsKt.emptyList() : 
    

















      (List)destination$iv$iv;return new FilePathComponents(new File(rootName), list);
  }
  







  @NotNull
  public static final File subPath(@NotNull File $receiver, int beginIndex, int endIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return FilesKt.toComponents($receiver).subPath(beginIndex, endIndex);
  }
  
  public FilesKt__FilePathComponentsKt() {}
}

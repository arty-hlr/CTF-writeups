package kotlin.io;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;



@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000<\n\000\n\002\020\016\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\004\n\002\020 \n\000\n\002\030\002\n\002\b\f\032(\020\t\032\0020\0022\b\b\002\020\n\032\0020\0012\n\b\002\020\013\032\004\030\0010\0012\n\b\002\020\f\032\004\030\0010\002\032(\020\r\032\0020\0022\b\b\002\020\n\032\0020\0012\n\b\002\020\013\032\004\030\0010\0012\n\b\002\020\f\032\004\030\0010\002\0328\020\016\032\0020\017*\0020\0022\006\020\020\032\0020\0022\b\b\002\020\021\032\0020\0172\032\b\002\020\022\032\024\022\004\022\0020\002\022\004\022\0020\024\022\004\022\0020\0250\023\032&\020\026\032\0020\002*\0020\0022\006\020\020\032\0020\0022\b\b\002\020\021\032\0020\0172\b\b\002\020\027\032\0020\030\032\n\020\031\032\0020\017*\0020\002\032\022\020\032\032\0020\017*\0020\0022\006\020\033\032\0020\002\032\022\020\032\032\0020\017*\0020\0022\006\020\033\032\0020\001\032\n\020\034\032\0020\002*\0020\002\032\035\020\034\032\b\022\004\022\0020\0020\035*\b\022\004\022\0020\0020\035H\002¢\006\002\b\036\032\021\020\034\032\0020\037*\0020\037H\002¢\006\002\b\036\032\022\020 \032\0020\002*\0020\0022\006\020!\032\0020\002\032\024\020\"\032\004\030\0010\002*\0020\0022\006\020!\032\0020\002\032\022\020#\032\0020\002*\0020\0022\006\020!\032\0020\002\032\022\020$\032\0020\002*\0020\0022\006\020%\032\0020\002\032\022\020$\032\0020\002*\0020\0022\006\020%\032\0020\001\032\022\020&\032\0020\002*\0020\0022\006\020%\032\0020\002\032\022\020&\032\0020\002*\0020\0022\006\020%\032\0020\001\032\022\020'\032\0020\017*\0020\0022\006\020\033\032\0020\002\032\022\020'\032\0020\017*\0020\0022\006\020\033\032\0020\001\032\022\020(\032\0020\001*\0020\0022\006\020!\032\0020\002\032\033\020)\032\004\030\0010\001*\0020\0022\006\020!\032\0020\002H\002¢\006\002\b*\"\025\020\000\032\0020\001*\0020\0028F¢\006\006\032\004\b\003\020\004\"\025\020\005\032\0020\001*\0020\0028F¢\006\006\032\004\b\006\020\004\"\025\020\007\032\0020\001*\0020\0028F¢\006\006\032\004\b\b\020\004¨\006+"}, d2={"extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", "target", "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", "other", "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", "base", "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib"}, xs="kotlin/io/FilesKt")
class FilesKt__UtilsKt
  extends FilesKt__FileTreeWalkKt
{
  @NotNull
  public static final File createTempDir(@NotNull String prefix, @Nullable String suffix, @Nullable File directory)
  {
    Intrinsics.checkParameterIsNotNull(prefix, "prefix");File dir = File.createTempFile(prefix, suffix, directory);
    dir.delete();
    if (dir.mkdir()) {
      File tmp26_25 = dir;Intrinsics.checkExpressionValueIsNotNull(tmp26_25, "dir");return tmp26_25;
    }
    throw ((Throwable)new IOException("Unable to create temporary directory " + dir + '.'));
  }
  











  @NotNull
  public static final File createTempFile(@NotNull String prefix, @Nullable String suffix, @Nullable File directory)
  {
    Intrinsics.checkParameterIsNotNull(prefix, "prefix"); File tmp12_9 = File.createTempFile(prefix, suffix, directory);Intrinsics.checkExpressionValueIsNotNull(tmp12_9, "File.createTempFile(prefix, suffix, directory)");return tmp12_9;
  }
  

  @NotNull
  public static final String getExtension(@NotNull File $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); String tmp10_7 = $receiver.getName();Intrinsics.checkExpressionValueIsNotNull(tmp10_7, "name");return StringsKt.substringAfterLast(tmp10_7, '.', "");
  }
  

  @NotNull
  public static final String getInvariantSeparatorsPath(@NotNull File $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkExpressionValueIsNotNull($receiver.getPath(), "path"); String tmp42_39 = $receiver.getPath();Intrinsics.checkExpressionValueIsNotNull(tmp42_39, "path");return tmp42_39;
  }
  
  @NotNull
  public static final String getNameWithoutExtension(@NotNull File $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); String tmp10_7 = $receiver.getName();Intrinsics.checkExpressionValueIsNotNull(tmp10_7, "name");return StringsKt.substringBeforeLast$default(tmp10_7, ".", null, 2, null);
  }
  

















  @NotNull
  public static final File relativeTo(@NotNull File $receiver, @NotNull File base)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(base, "base");return new File(FilesKt.toRelativeString($receiver, base));
  }
  




















  private static final String toRelativeStringOrNull$FilesKt__UtilsKt(@NotNull File $receiver, File base)
  {
    FilePathComponents thisComponents = normalize$FilesKt__UtilsKt(FilesKt.toComponents($receiver));
    FilePathComponents baseComponents = normalize$FilesKt__UtilsKt(FilesKt.toComponents(base));
    if ((Intrinsics.areEqual(thisComponents.getRoot(), baseComponents.getRoot()) ^ true)) {
      return null;
    }
    
    int baseCount = baseComponents.getSize();
    int thisCount = thisComponents.getSize();
    
    File localFile1 = $receiver;File $receiver = localFile1;
    int $i$a$1$run; int i = 0;
    int i = thisCount;int j = baseCount;int maxSameCount = Math.min(i, j);
    while ((i < maxSameCount) && (Intrinsics.areEqual((File)thisComponents.getSegments().get(i), (File)baseComponents.getSegments().get(i)))) {
      i++;
    }
    int sameCount = 
    



      i;
    


    StringBuilder res = new StringBuilder();
    $receiver = baseCount - 1;i = sameCount; int i; for ($receiver < i;; i--) {
      if (Intrinsics.areEqual(((File)baseComponents.getSegments().get(i)).getName(), "..")) {
        return null;
      }
      
      res.append("..");
      
      if (i != sameCount) {
        res.append(File.separatorChar);
      }
      if (i == i) {
        break;
      }
    }
    








    if (sameCount < thisCount)
    {
      if (sameCount < baseCount) {
        res.append(File.separatorChar);
      }
      String tmp260_257 = File.separator;Intrinsics.checkExpressionValueIsNotNull(tmp260_257, "File.separator");CollectionsKt.joinTo$default((Iterable)CollectionsKt.drop((Iterable)thisComponents.getSegments(), sameCount), (Appendable)res, (CharSequence)tmp260_257, null, null, 0, null, null, 124, null);
    }
    
    return res.toString();
  }
  




































































































































































  public static final boolean startsWith(@NotNull File $receiver, @NotNull File other)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(other, "other");FilePathComponents components = FilesKt.toComponents($receiver);
    FilePathComponents otherComponents = FilesKt.toComponents(other);
    if ((Intrinsics.areEqual(components.getRoot(), otherComponents.getRoot()) ^ true))
      return false;
    return components.getSize() < otherComponents.getSize() ? false : 
      components.getSegments().subList(0, otherComponents.getSize()).equals(otherComponents.getSegments());
  }
  





  public static final boolean startsWith(@NotNull File $receiver, @NotNull String other)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(other, "other");return FilesKt.startsWith($receiver, new File(other));
  }
  







  public static final boolean endsWith(@NotNull File $receiver, @NotNull File other)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(other, "other");FilePathComponents components = FilesKt.toComponents($receiver);
    FilePathComponents otherComponents = FilesKt.toComponents(other);
    if (otherComponents.isRooted())
      return Intrinsics.areEqual($receiver, other);
    int shift = components.getSize() - otherComponents.getSize();
    return shift < 0 ? false : 
      components.getSegments().subList(shift, components.getSize()).equals(otherComponents.getSegments());
  }
  






  public static final boolean endsWith(@NotNull File $receiver, @NotNull String other)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(other, "other");return FilesKt.endsWith($receiver, new File(other));
  }
  



  @NotNull
  public static final File normalize(@NotNull File $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");FilePathComponents localFilePathComponents1 = FilesKt.toComponents($receiver);FilePathComponents $receiver = localFilePathComponents1; int $i$a$1$with; String tmp30_27 = File.separator;Intrinsics.checkExpressionValueIsNotNull(tmp30_27, "File.separator");return FilesKt.resolve($receiver.getRoot(), CollectionsKt.joinToString$default((Iterable)normalize$FilesKt__UtilsKt($receiver.getSegments()), (CharSequence)tmp30_27, null, null, 0, null, null, 62, null));
  }
  
  private static final FilePathComponents normalize$FilesKt__UtilsKt(@NotNull FilePathComponents $receiver) { return new FilePathComponents($receiver.getRoot(), normalize$FilesKt__UtilsKt($receiver.getSegments())); }
  



















  @NotNull
  public static final File resolve(@NotNull File $receiver, @NotNull File relative)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(relative, "relative"); if (FilesKt.isRooted(relative))
      return relative;
    String tmp26_23 = $receiver.toString();Intrinsics.checkExpressionValueIsNotNull(tmp26_23, "this.toString()");String baseName = tmp26_23;
    CharSequence localCharSequence = (CharSequence)baseName; if ((localCharSequence.length() == 0 ? 1 : 0) == 0) {} return StringsKt.endsWith$default((CharSequence)baseName, File.separatorChar, false, 2, null) ? new File(baseName + relative) : new File(baseName + File.separatorChar + relative);
  }
  




  @NotNull
  public static final File resolve(@NotNull File $receiver, @NotNull String relative)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(relative, "relative");return FilesKt.resolve($receiver, new File(relative));
  }
  




  @NotNull
  public static final File resolveSibling(@NotNull File $receiver, @NotNull File relative)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(relative, "relative");FilePathComponents components = FilesKt.toComponents($receiver);
    File parentSubPath = components.getSize() == 0 ? new File("..") : components.subPath(0, components.getSize() - 1);
    return FilesKt.resolve(FilesKt.resolve(components.getRoot(), parentSubPath), relative);
  }
  




  @NotNull
  public static final File resolveSibling(@NotNull File $receiver, @NotNull String relative)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(relative, "relative");return FilesKt.resolveSibling($receiver, new File(relative));
  }
  
  public static final boolean deleteRecursively(@NotNull File $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Sequence localSequence1 = (Sequence)FilesKt.walkBottomUp($receiver);boolean initial$iv = true;
    









































    int $i$f$fold;
    








































    Sequence $receiver$iv;
    








































    boolean accumulator$iv = initial$iv;
    boolean res; int $i$a$1$fold; File it; for (Iterator localIterator = $receiver$iv.iterator(); localIterator.hasNext(); accumulator$iv = ((it.delete()) || (!it.exists())) && (res))
    {






























































































































      Object element$iv = localIterator.next();File localFile1 = (File)element$iv;res = accumulator$iv;
    }
    return 
    































































































































      accumulator$iv;
  }
  
  /* Error */
  @NotNull
  public static final String toRelativeString(@NotNull File $receiver, @NotNull File base)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 84
    //   3: invokestatic 16	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 123
    //   9: invokestatic 16	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: aload_1
    //   14: invokestatic 126	kotlin/io/FilesKt__UtilsKt:toRelativeStringOrNull$FilesKt__UtilsKt	(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;
    //   17: dup
    //   18: ifnull +6 -> 24
    //   21: goto +48 -> 69
    //   24: pop
    //   25: new 128	java/lang/IllegalArgumentException
    //   28: dup
    //   29: new 37	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 41	java/lang/StringBuilder:<init>	()V
    //   36: ldc -126
    //   38: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload_0
    //   42: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   45: ldc -124
    //   47: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: aload_1
    //   51: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   54: bipush 46
    //   56: invokevirtual 53	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   59: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   62: invokespecial 133	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   65: checkcast 62	java/lang/Throwable
    //   68: athrow
    //   69: areturn
    // Line number table:
    //   Java source line #81	-> byte code offset #12
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	$receiver	File
    //   0	70	1	base	File
  }
  
  /* Error */
  @NotNull
  public static final File relativeToOrSelf(@NotNull File $receiver, @NotNull File base)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 84
    //   3: invokestatic 16	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 123
    //   9: invokestatic 16	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: aload_1
    //   14: invokestatic 126	kotlin/io/FilesKt__UtilsKt:toRelativeStringOrNull$FilesKt__UtilsKt	(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;
    //   17: dup
    //   18: ifnull +17 -> 35
    //   21: astore_2
    //   22: aload_2
    //   23: astore_3
    //   24: new 18	java/io/File
    //   27: dup
    //   28: aload_3
    //   29: invokespecial 138	java/io/File:<init>	(Ljava/lang/String;)V
    //   32: goto +5 -> 37
    //   35: pop
    //   36: aload_0
    //   37: areturn
    // Line number table:
    //   Java source line #102	-> byte code offset #12
    //   Java source line #102	-> byte code offset #29
    //   Java source line #102	-> byte code offset #32
    //   Java source line #102	-> byte code offset #36
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	$receiver	File
    //   0	38	1	base	File
    //   24	8	3	p1	String
    //   24	8	4	$i$a$1$unknown	int
  }
  
  /* Error */
  @Nullable
  public static final File relativeToOrNull(@NotNull File $receiver, @NotNull File base)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 84
    //   3: invokestatic 16	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 123
    //   9: invokestatic 16	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: aload_1
    //   14: invokestatic 126	kotlin/io/FilesKt__UtilsKt:toRelativeStringOrNull$FilesKt__UtilsKt	(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;
    //   17: dup
    //   18: ifnull +17 -> 35
    //   21: astore_2
    //   22: aload_2
    //   23: astore_3
    //   24: new 18	java/io/File
    //   27: dup
    //   28: aload_3
    //   29: invokespecial 138	java/io/File:<init>	(Ljava/lang/String;)V
    //   32: goto +5 -> 37
    //   35: pop
    //   36: aconst_null
    //   37: areturn
    // Line number table:
    //   Java source line #112	-> byte code offset #12
    //   Java source line #112	-> byte code offset #29
    //   Java source line #112	-> byte code offset #32
    //   Java source line #112	-> byte code offset #37
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	$receiver	File
    //   0	38	1	base	File
    //   24	8	3	p1	String
    //   24	8	4	$i$a$1$unknown	int
  }
  
  /* Error */
  @NotNull
  public static final File copyTo(@NotNull File $receiver, @NotNull File target, boolean overwrite, int bufferSize)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 84
    //   3: invokestatic 16	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc -37
    //   9: invokestatic 16	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: invokevirtual 222	java/io/File:exists	()Z
    //   16: ifne +20 -> 36
    //   19: new 224	kotlin/io/NoSuchFileException
    //   22: dup
    //   23: aload_0
    //   24: aconst_null
    //   25: ldc -30
    //   27: iconst_2
    //   28: aconst_null
    //   29: invokespecial 229	kotlin/io/NoSuchFileException:<init>	(Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   32: checkcast 62	java/lang/Throwable
    //   35: athrow
    //   36: aload_1
    //   37: invokevirtual 222	java/io/File:exists	()Z
    //   40: ifeq +45 -> 85
    //   43: iload_2
    //   44: ifne +7 -> 51
    //   47: iconst_1
    //   48: goto +15 -> 63
    //   51: aload_1
    //   52: invokevirtual 25	java/io/File:delete	()Z
    //   55: ifne +7 -> 62
    //   58: iconst_1
    //   59: goto +4 -> 63
    //   62: iconst_0
    //   63: istore 4
    //   65: iload 4
    //   67: ifeq +18 -> 85
    //   70: new 231	kotlin/io/FileAlreadyExistsException
    //   73: dup
    //   74: aload_0
    //   75: aload_1
    //   76: ldc -23
    //   78: invokespecial 236	kotlin/io/FileAlreadyExistsException:<init>	(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
    //   81: checkcast 62	java/lang/Throwable
    //   84: athrow
    //   85: aload_0
    //   86: invokevirtual 239	java/io/File:isDirectory	()Z
    //   89: ifeq +28 -> 117
    //   92: aload_1
    //   93: invokevirtual 242	java/io/File:mkdirs	()Z
    //   96: ifne +185 -> 281
    //   99: new 244	kotlin/io/FileSystemException
    //   102: dup
    //   103: aload_0
    //   104: aload_1
    //   105: ldc -10
    //   107: invokespecial 247	kotlin/io/FileSystemException:<init>	(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
    //   110: checkcast 62	java/lang/Throwable
    //   113: athrow
    //   114: nop
    //   115: nop
    //   116: athrow
    //   117: aload_1
    //   118: invokevirtual 250	java/io/File:getParentFile	()Ljava/io/File;
    //   121: dup
    //   122: ifnull +10 -> 132
    //   125: invokevirtual 242	java/io/File:mkdirs	()Z
    //   128: pop
    //   129: goto +4 -> 133
    //   132: pop
    //   133: aload_0
    //   134: astore 4
    //   136: new 252	java/io/FileInputStream
    //   139: dup
    //   140: aload 4
    //   142: invokespecial 255	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   145: checkcast 257	java/io/Closeable
    //   148: astore 4
    //   150: aconst_null
    //   151: checkcast 62	java/lang/Throwable
    //   154: astore 5
    //   156: nop
    //   157: aload 4
    //   159: checkcast 252	java/io/FileInputStream
    //   162: astore 6
    //   164: aload_1
    //   165: astore 8
    //   167: new 259	java/io/FileOutputStream
    //   170: dup
    //   171: aload 8
    //   173: invokespecial 260	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   176: checkcast 257	java/io/Closeable
    //   179: astore 8
    //   181: aconst_null
    //   182: checkcast 62	java/lang/Throwable
    //   185: astore 9
    //   187: nop
    //   188: aload 8
    //   190: checkcast 259	java/io/FileOutputStream
    //   193: astore 10
    //   195: aload 6
    //   197: checkcast 262	java/io/InputStream
    //   200: aload 10
    //   202: checkcast 264	java/io/OutputStream
    //   205: iload_3
    //   206: invokestatic 269	kotlin/io/ByteStreamsKt:copyTo	(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    //   209: lstore 10
    //   211: aload 8
    //   213: aload 9
    //   215: invokestatic 275	kotlin/io/CloseableKt:closeFinally	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   218: lload 10
    //   220: goto +24 -> 244
    //   223: astore 10
    //   225: aload 10
    //   227: astore 9
    //   229: aload 10
    //   231: athrow
    //   232: astore 10
    //   234: aload 8
    //   236: aload 9
    //   238: invokestatic 275	kotlin/io/CloseableKt:closeFinally	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   241: aload 10
    //   243: athrow
    //   244: nop
    //   245: lstore 6
    //   247: aload 4
    //   249: aload 5
    //   251: invokestatic 275	kotlin/io/CloseableKt:closeFinally	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   254: lload 6
    //   256: goto +24 -> 280
    //   259: astore 6
    //   261: aload 6
    //   263: astore 5
    //   265: aload 6
    //   267: athrow
    //   268: astore 6
    //   270: aload 4
    //   272: aload 5
    //   274: invokestatic 275	kotlin/io/CloseableKt:closeFinally	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   277: aload 6
    //   279: athrow
    //   280: pop2
    //   281: aload_1
    //   282: areturn
    // Line number table:
    //   Java source line #182	-> byte code offset #12
    //   Java source line #183	-> byte code offset #19
    //   Java source line #186	-> byte code offset #36
    //   Java source line #187	-> byte code offset #43
    //   Java source line #189	-> byte code offset #65
    //   Java source line #190	-> byte code offset #70
    //   Java source line #191	-> byte code offset #74
    //   Java source line #192	-> byte code offset #75
    //   Java source line #193	-> byte code offset #76
    //   Java source line #190	-> byte code offset #78
    //   Java source line #198	-> byte code offset #85
    //   Java source line #199	-> byte code offset #92
    //   Java source line #200	-> byte code offset #99
    //   Java source line #202	-> byte code offset #117
    //   Java source line #204	-> byte code offset #133
    //   Java source line #204	-> byte code offset #150
    //   Java source line #205	-> byte code offset #164
    //   Java source line #205	-> byte code offset #181
    //   Java source line #206	-> byte code offset #195
    //   Java source line #205	-> byte code offset #209
    //   Java source line #207	-> byte code offset #244
    //   Java source line #204	-> byte code offset #245
    //   Java source line #209	-> byte code offset #281
    //   Java source line #211	-> byte code offset #281
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	283	0	$receiver	File
    //   0	283	1	target	File
    //   0	283	2	overwrite	boolean
    //   0	283	3	bufferSize	int
    //   65	20	4	stillExists	boolean
    //   164	81	6	input	java.io.FileInputStream
    //   195	14	10	output	java.io.FileOutputStream
    //   195	14	12	$i$a$1$use	int
    //   164	81	13	$i$a$1$use	int
    // Exception table:
    //   from	to	target	type
    //   187	211	223	java/lang/Throwable
    //   187	211	232	finally
    //   223	232	232	finally
    //   232	234	232	finally
    //   156	247	259	java/lang/Throwable
    //   156	247	268	finally
    //   259	268	268	finally
    //   268	270	268	finally
  }
  
  /* Error */
  public static final boolean copyRecursively(@NotNull File $receiver, @NotNull File target, boolean overwrite, @NotNull Function2<? super File, ? super IOException, ? extends OnErrorAction> onError)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 84
    //   3: invokestatic 16	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc -37
    //   9: invokestatic 16	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_3
    //   13: ldc_w 294
    //   16: invokestatic 16	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   19: aload_0
    //   20: invokevirtual 222	java/io/File:exists	()Z
    //   23: ifne +38 -> 61
    //   26: aload_3
    //   27: aload_0
    //   28: new 224	kotlin/io/NoSuchFileException
    //   31: dup
    //   32: aload_0
    //   33: aconst_null
    //   34: ldc -30
    //   36: iconst_2
    //   37: aconst_null
    //   38: invokespecial 229	kotlin/io/NoSuchFileException:<init>	(Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   41: invokeinterface 300 3 0
    //   46: checkcast 302	kotlin/io/OnErrorAction
    //   49: getstatic 306	kotlin/io/OnErrorAction:TERMINATE	Lkotlin/io/OnErrorAction;
    //   52: if_acmpeq +7 -> 59
    //   55: iconst_1
    //   56: goto +4 -> 60
    //   59: iconst_0
    //   60: ireturn
    //   61: nop
    //   62: aload_0
    //   63: invokestatic 310	kotlin/io/FilesKt:walkTopDown	(Ljava/io/File;)Lkotlin/io/FileTreeWalk;
    //   66: new 312	kotlin/io/FilesKt__UtilsKt$copyRecursively$2
    //   69: dup
    //   70: aload_3
    //   71: invokespecial 315	kotlin/io/FilesKt__UtilsKt$copyRecursively$2:<init>	(Lkotlin/jvm/functions/Function2;)V
    //   74: checkcast 296	kotlin/jvm/functions/Function2
    //   77: invokevirtual 321	kotlin/io/FileTreeWalk:onFail	(Lkotlin/jvm/functions/Function2;)Lkotlin/io/FileTreeWalk;
    //   80: invokevirtual 325	kotlin/io/FileTreeWalk:iterator	()Ljava/util/Iterator;
    //   83: astore 5
    //   85: aload 5
    //   87: invokeinterface 330 1 0
    //   92: ifeq +262 -> 354
    //   95: aload 5
    //   97: invokeinterface 334 1 0
    //   102: checkcast 18	java/io/File
    //   105: astore 4
    //   107: aload 4
    //   109: invokevirtual 222	java/io/File:exists	()Z
    //   112: ifne +39 -> 151
    //   115: aload_3
    //   116: aload 4
    //   118: new 224	kotlin/io/NoSuchFileException
    //   121: dup
    //   122: aload 4
    //   124: aconst_null
    //   125: ldc -30
    //   127: iconst_2
    //   128: aconst_null
    //   129: invokespecial 229	kotlin/io/NoSuchFileException:<init>	(Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   132: invokeinterface 300 3 0
    //   137: checkcast 302	kotlin/io/OnErrorAction
    //   140: getstatic 306	kotlin/io/OnErrorAction:TERMINATE	Lkotlin/io/OnErrorAction;
    //   143: if_acmpne +208 -> 351
    //   146: iconst_0
    //   147: ireturn
    //   148: nop
    //   149: nop
    //   150: athrow
    //   151: aload 4
    //   153: aload_0
    //   154: invokestatic 137	kotlin/io/FilesKt:toRelativeString	(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;
    //   157: astore 6
    //   159: new 18	java/io/File
    //   162: dup
    //   163: aload_1
    //   164: aload 6
    //   166: invokespecial 337	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   169: astore 7
    //   171: aload 7
    //   173: invokevirtual 222	java/io/File:exists	()Z
    //   176: ifeq +106 -> 282
    //   179: aload 4
    //   181: invokevirtual 239	java/io/File:isDirectory	()Z
    //   184: ifeq +11 -> 195
    //   187: aload 7
    //   189: invokevirtual 239	java/io/File:isDirectory	()Z
    //   192: ifne +90 -> 282
    //   195: iload_2
    //   196: ifne +7 -> 203
    //   199: iconst_1
    //   200: goto +40 -> 240
    //   203: aload 7
    //   205: invokevirtual 239	java/io/File:isDirectory	()Z
    //   208: ifeq +19 -> 227
    //   211: aload 7
    //   213: invokestatic 341	kotlin/io/FilesKt:deleteRecursively	(Ljava/io/File;)Z
    //   216: ifne +7 -> 223
    //   219: iconst_1
    //   220: goto +20 -> 240
    //   223: iconst_0
    //   224: goto +16 -> 240
    //   227: aload 7
    //   229: invokevirtual 25	java/io/File:delete	()Z
    //   232: ifne +7 -> 239
    //   235: iconst_1
    //   236: goto +4 -> 240
    //   239: iconst_0
    //   240: istore 8
    //   242: iload 8
    //   244: ifeq +38 -> 282
    //   247: aload_3
    //   248: aload 7
    //   250: new 231	kotlin/io/FileAlreadyExistsException
    //   253: dup
    //   254: aload 4
    //   256: aload 7
    //   258: ldc -23
    //   260: invokespecial 236	kotlin/io/FileAlreadyExistsException:<init>	(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
    //   263: invokeinterface 300 3 0
    //   268: checkcast 302	kotlin/io/OnErrorAction
    //   271: getstatic 306	kotlin/io/OnErrorAction:TERMINATE	Lkotlin/io/OnErrorAction;
    //   274: if_acmpne +5 -> 279
    //   277: iconst_0
    //   278: ireturn
    //   279: goto +72 -> 351
    //   282: aload 4
    //   284: invokevirtual 239	java/io/File:isDirectory	()Z
    //   287: ifeq +12 -> 299
    //   290: aload 7
    //   292: invokevirtual 242	java/io/File:mkdirs	()Z
    //   295: pop
    //   296: goto +55 -> 351
    //   299: aload 4
    //   301: aload 7
    //   303: iload_2
    //   304: iconst_0
    //   305: iconst_4
    //   306: aconst_null
    //   307: invokestatic 343	kotlin/io/FilesKt:copyTo$default	(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;
    //   310: invokevirtual 347	java/io/File:length	()J
    //   313: aload 4
    //   315: invokevirtual 347	java/io/File:length	()J
    //   318: lcmp
    //   319: ifeq +32 -> 351
    //   322: aload_3
    //   323: aload 4
    //   325: new 35	java/io/IOException
    //   328: dup
    //   329: ldc_w 349
    //   332: invokespecial 60	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   335: invokeinterface 300 3 0
    //   340: checkcast 302	kotlin/io/OnErrorAction
    //   343: getstatic 306	kotlin/io/OnErrorAction:TERMINATE	Lkotlin/io/OnErrorAction;
    //   346: if_acmpne +5 -> 351
    //   349: iconst_0
    //   350: ireturn
    //   351: goto -266 -> 85
    //   354: iconst_1
    //   355: ireturn
    //   356: astore 4
    //   358: iconst_0
    //   359: ireturn
    // Line number table:
    //   Java source line #262	-> byte code offset #19
    //   Java source line #263	-> byte code offset #26
    //   Java source line #264	-> byte code offset #26
    //   Java source line #263	-> byte code offset #26
    //   Java source line #266	-> byte code offset #61
    //   Java source line #268	-> byte code offset #62
    //   Java source line #269	-> byte code offset #107
    //   Java source line #270	-> byte code offset #115
    //   Java source line #271	-> byte code offset #115
    //   Java source line #270	-> byte code offset #115
    //   Java source line #272	-> byte code offset #146
    //   Java source line #274	-> byte code offset #151
    //   Java source line #275	-> byte code offset #159
    //   Java source line #276	-> byte code offset #171
    //   Java source line #277	-> byte code offset #195
    //   Java source line #278	-> byte code offset #203
    //   Java source line #279	-> byte code offset #211
    //   Java source line #281	-> byte code offset #227
    //   Java source line #278	-> byte code offset #240
    //   Java source line #277	-> byte code offset #240
    //   Java source line #284	-> byte code offset #242
    //   Java source line #285	-> byte code offset #247
    //   Java source line #287	-> byte code offset #247
    //   Java source line #285	-> byte code offset #247
    //   Java source line #286	-> byte code offset #256
    //   Java source line #287	-> byte code offset #258
    //   Java source line #285	-> byte code offset #260
    //   Java source line #288	-> byte code offset #277
    //   Java source line #290	-> byte code offset #279
    //   Java source line #294	-> byte code offset #282
    //   Java source line #295	-> byte code offset #290
    //   Java source line #297	-> byte code offset #299
    //   Java source line #298	-> byte code offset #322
    //   Java source line #299	-> byte code offset #349
    //   Java source line #301	-> byte code offset #351
    //   Java source line #302	-> byte code offset #351
    //   Java source line #268	-> byte code offset #351
    //   Java source line #304	-> byte code offset #354
    //   Java source line #305	-> byte code offset #356
    //   Java source line #306	-> byte code offset #358
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	360	0	$receiver	File
    //   0	360	1	target	File
    //   0	360	2	overwrite	boolean
    //   0	360	3	onError	Function2
    //   107	244	4	src	File
    //   358	2	4	e	TerminateException
    //   159	192	6	relPath	String
    //   171	180	7	dstFile	File
    //   242	40	8	stillExists	boolean
    // Exception table:
    //   from	to	target	type
    //   61	148	356	kotlin/io/TerminateException
    //   151	356	356	kotlin/io/TerminateException
  }
  
  /* Error */
  private static final List<File> normalize$FilesKt__UtilsKt(@NotNull List<? extends File> $receiver)
  {
    // Byte code:
    //   0: new 425	java/util/ArrayList
    //   3: dup
    //   4: aload_0
    //   5: invokeinterface 428 1 0
    //   10: invokespecial 431	java/util/ArrayList:<init>	(I)V
    //   13: checkcast 177	java/util/List
    //   16: astore_1
    //   17: aload_0
    //   18: invokeinterface 432 1 0
    //   23: astore_3
    //   24: aload_3
    //   25: invokeinterface 330 1 0
    //   30: ifeq +153 -> 183
    //   33: aload_3
    //   34: invokeinterface 334 1 0
    //   39: checkcast 18	java/io/File
    //   42: astore_2
    //   43: aload_2
    //   44: invokevirtual 87	java/io/File:getName	()Ljava/lang/String;
    //   47: dup
    //   48: ifnonnull +7 -> 55
    //   51: pop
    //   52: goto +120 -> 172
    //   55: astore 4
    //   57: aload 4
    //   59: invokevirtual 435	java/lang/String:hashCode	()I
    //   62: lookupswitch	default:+110->172, 46:+39->101, 1472:+26->88
    //   88: aload 4
    //   90: ldc -73
    //   92: invokevirtual 436	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   95: ifeq +77 -> 172
    //   98: goto +16 -> 114
    //   101: aload 4
    //   103: ldc 115
    //   105: invokevirtual 436	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   108: ifeq +64 -> 172
    //   111: goto +69 -> 180
    //   114: aload_1
    //   115: invokeinterface 439 1 0
    //   120: ifne +41 -> 161
    //   123: aload_1
    //   124: invokestatic 443	kotlin/collections/CollectionsKt:last	(Ljava/util/List;)Ljava/lang/Object;
    //   127: checkcast 18	java/io/File
    //   130: invokevirtual 87	java/io/File:getName	()Ljava/lang/String;
    //   133: ldc -73
    //   135: invokestatic 161	kotlin/jvm/internal/Intrinsics:areEqual	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   138: iconst_1
    //   139: ixor
    //   140: ifeq +21 -> 161
    //   143: aload_1
    //   144: aload_1
    //   145: invokeinterface 428 1 0
    //   150: iconst_1
    //   151: isub
    //   152: invokeinterface 446 2 0
    //   157: pop
    //   158: goto +22 -> 180
    //   161: aload_1
    //   162: aload_2
    //   163: invokeinterface 449 2 0
    //   168: pop
    //   169: goto +11 -> 180
    //   172: aload_1
    //   173: aload_2
    //   174: invokeinterface 449 2 0
    //   179: pop
    //   180: goto -156 -> 24
    //   183: aload_1
    //   184: areturn
    // Line number table:
    //   Java source line #385	-> byte code offset #0
    //   Java source line #386	-> byte code offset #17
    //   Java source line #387	-> byte code offset #43
    //   Java source line #389	-> byte code offset #114
    //   Java source line #390	-> byte code offset #172
    //   Java source line #391	-> byte code offset #180
    //   Java source line #386	-> byte code offset #180
    //   Java source line #393	-> byte code offset #183
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	185	0	$receiver	List
    //   17	168	1	list	List
    //   43	137	2	file	File
  }
  
  public FilesKt__UtilsKt() {}
}

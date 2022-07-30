package kotlin.io;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000z\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\022\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\000\032\022\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004\032\034\020\005\032\0020\001*\0020\0022\006\020\006\032\0020\0072\b\b\002\020\b\032\0020\t\032!\020\n\032\0020\013*\0020\0022\b\b\002\020\b\032\0020\t2\b\b\002\020\f\032\0020\rH\b\032!\020\016\032\0020\017*\0020\0022\b\b\002\020\b\032\0020\t2\b\b\002\020\f\032\0020\rH\b\032B\020\020\032\0020\001*\0020\00226\020\021\0322\022\023\022\0210\004¢\006\f\b\023\022\b\b\024\022\004\b\b(\025\022\023\022\0210\r¢\006\f\b\023\022\b\b\024\022\004\b\b(\026\022\004\022\0020\0010\022\032J\020\020\032\0020\001*\0020\0022\006\020\027\032\0020\r26\020\021\0322\022\023\022\0210\004¢\006\f\b\023\022\b\b\024\022\004\b\b(\025\022\023\022\0210\r¢\006\f\b\023\022\b\b\024\022\004\b\b(\026\022\004\022\0020\0010\022\0327\020\030\032\0020\001*\0020\0022\b\b\002\020\b\032\0020\t2!\020\021\032\035\022\023\022\0210\007¢\006\f\b\023\022\b\b\024\022\004\b\b(\032\022\004\022\0020\0010\031\032\r\020\033\032\0020\034*\0020\002H\b\032\r\020\035\032\0020\036*\0020\002H\b\032\027\020\037\032\0020 *\0020\0022\b\b\002\020\b\032\0020\tH\b\032\n\020!\032\0020\004*\0020\002\032\032\020\"\032\b\022\004\022\0020\0070#*\0020\0022\b\b\002\020\b\032\0020\t\032\024\020$\032\0020\007*\0020\0022\b\b\002\020\b\032\0020\t\032\027\020%\032\0020&*\0020\0022\b\b\002\020\b\032\0020\tH\b\032?\020'\032\002H(\"\004\b\000\020(*\0020\0022\b\b\002\020\b\032\0020\t2\030\020)\032\024\022\n\022\b\022\004\022\0020\0070*\022\004\022\002H(0\031H\bø\001\000¢\006\002\020,\032\022\020-\032\0020\001*\0020\0022\006\020\003\032\0020\004\032\034\020.\032\0020\001*\0020\0022\006\020\006\032\0020\0072\b\b\002\020\b\032\0020\t\032\027\020/\032\00200*\0020\0022\b\b\002\020\b\032\0020\tH\b\002\b\n\006\b\021(+0\001¨\0061"}, d2={"appendBytes", "", "Ljava/io/File;", "array", "", "appendText", "text", "", "charset", "Ljava/nio/charset/Charset;", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "bufferedWriter", "Ljava/io/BufferedWriter;", "forEachBlock", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "buffer", "bytesRead", "blockSize", "forEachLine", "Lkotlin/Function1;", "line", "inputStream", "Ljava/io/FileInputStream;", "outputStream", "Ljava/io/FileOutputStream;", "printWriter", "Ljava/io/PrintWriter;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "useLines", "T", "block", "Lkotlin/sequences/Sequence;", "Requires newer compiler version to be inlined correctly.", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "writeText", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, xs="kotlin/io/FilesKt")
class FilesKt__FileReadWriteKt extends FilesKt__FilePathComponentsKt
{
  @InlineOnly
  private static final java.io.InputStreamReader reader(@NotNull File $receiver, Charset charset)
  {
    ;
    Object localObject = $receiver;localObject = (java.io.InputStream)new FileInputStream((File)localObject);return new java.io.InputStreamReader((java.io.InputStream)localObject, charset);
  }
  

  @InlineOnly
  private static final java.io.BufferedReader bufferedReader(@NotNull File $receiver, Charset charset, int bufferSize)
  {
    ;
    
    Object localObject1 = $receiver;Object localObject2 = localObject1;localObject2 = (java.io.InputStream)new FileInputStream((File)localObject2);localObject1 = (java.io.Reader)new java.io.InputStreamReader((java.io.InputStream)localObject2, charset);return (localObject1 instanceof java.io.BufferedReader) ? (java.io.BufferedReader)localObject1 : new java.io.BufferedReader((java.io.Reader)localObject1, bufferSize);
  }
  
  @InlineOnly
  private static final java.io.OutputStreamWriter writer(@NotNull File $receiver, Charset charset)
  {
    ;
    Object localObject = $receiver;localObject = (java.io.OutputStream)new FileOutputStream((File)localObject);return new java.io.OutputStreamWriter((java.io.OutputStream)localObject, charset);
  }
  

  @InlineOnly
  private static final BufferedWriter bufferedWriter(@NotNull File $receiver, Charset charset, int bufferSize)
  {
    ;
    
    Object localObject1 = $receiver;Object localObject2 = localObject1;localObject2 = (java.io.OutputStream)new FileOutputStream((File)localObject2);localObject1 = (Writer)new java.io.OutputStreamWriter((java.io.OutputStream)localObject2, charset);return (localObject1 instanceof BufferedWriter) ? (BufferedWriter)localObject1 : new BufferedWriter((Writer)localObject1, bufferSize);
  }
  
  @InlineOnly
  private static final java.io.PrintWriter printWriter(@NotNull File $receiver, Charset charset)
  {
    ;
    File localFile = $receiver;int i = 8192;Object localObject1 = localFile;Object localObject2 = localObject1;localObject2 = (java.io.OutputStream)new FileOutputStream((File)localObject2);localObject1 = (Writer)new java.io.OutputStreamWriter((java.io.OutputStream)localObject2, charset);BufferedWriter localBufferedWriter = (localObject1 instanceof BufferedWriter) ? (BufferedWriter)localObject1 : new BufferedWriter((Writer)localObject1, i);Writer localWriter = (Writer)localBufferedWriter;return new java.io.PrintWriter(localWriter);
  }
  
  /* Error */
  @NotNull
  public static final byte[] readBytes(@NotNull File $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 94
    //   3: invokestatic 100	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: new 10	java/io/FileInputStream
    //   11: dup
    //   12: aload_1
    //   13: invokespecial 14	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   16: checkcast 102	java/io/Closeable
    //   19: astore_1
    //   20: aconst_null
    //   21: checkcast 92	java/lang/Throwable
    //   24: astore_2
    //   25: nop
    //   26: aload_1
    //   27: checkcast 10	java/io/FileInputStream
    //   30: astore_3
    //   31: iconst_0
    //   32: istore 4
    //   34: aload_0
    //   35: invokevirtual 106	java/io/File:length	()J
    //   38: lstore 5
    //   40: lload 5
    //   42: lstore 7
    //   44: lload 7
    //   46: ldc 107
    //   48: i2l
    //   49: lcmp
    //   50: ifle +48 -> 98
    //   53: new 109	java/lang/OutOfMemoryError
    //   56: dup
    //   57: new 111	java/lang/StringBuilder
    //   60: dup
    //   61: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   64: ldc 116
    //   66: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: aload_0
    //   70: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   73: ldc 125
    //   75: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: lload 7
    //   80: invokevirtual 128	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   83: ldc -126
    //   85: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   91: invokespecial 137	java/lang/OutOfMemoryError:<init>	(Ljava/lang/String;)V
    //   94: checkcast 92	java/lang/Throwable
    //   97: athrow
    //   98: nop
    //   99: lload 5
    //   101: l2i
    //   102: istore 9
    //   104: iload 9
    //   106: newarray byte
    //   108: astore 5
    //   110: iload 9
    //   112: ifle +40 -> 152
    //   115: aload_3
    //   116: aload 5
    //   118: iload 4
    //   120: iload 9
    //   122: invokevirtual 141	java/io/FileInputStream:read	([BII)I
    //   125: istore 10
    //   127: iload 10
    //   129: ifge +6 -> 135
    //   132: goto +20 -> 152
    //   135: iload 9
    //   137: iload 10
    //   139: isub
    //   140: istore 9
    //   142: iload 4
    //   144: iload 10
    //   146: iadd
    //   147: istore 4
    //   149: goto -39 -> 110
    //   152: iload 9
    //   154: ifne +8 -> 162
    //   157: aload 5
    //   159: goto +20 -> 179
    //   162: aload 5
    //   164: astore 10
    //   166: aload 10
    //   168: iload 4
    //   170: invokestatic 147	java/util/Arrays:copyOf	([BI)[B
    //   173: dup
    //   174: ldc -107
    //   176: invokestatic 152	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   179: nop
    //   180: astore_3
    //   181: aload_1
    //   182: aload_2
    //   183: invokestatic 158	kotlin/io/CloseableKt:closeFinally	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   186: aload_3
    //   187: goto +16 -> 203
    //   190: astore_3
    //   191: aload_3
    //   192: astore_2
    //   193: aload_3
    //   194: athrow
    //   195: astore_3
    //   196: aload_1
    //   197: aload_2
    //   198: invokestatic 158	kotlin/io/CloseableKt:closeFinally	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   201: aload_3
    //   202: athrow
    //   203: areturn
    // Line number table:
    //   Java source line #63	-> byte code offset #6
    //   Java source line #63	-> byte code offset #20
    //   Java source line #64	-> byte code offset #31
    //   Java source line #65	-> byte code offset #34
    //   Java source line #67	-> byte code offset #34
    //   Java source line #65	-> byte code offset #34
    //   Java source line #66	-> byte code offset #44
    //   Java source line #67	-> byte code offset #98
    //   Java source line #65	-> byte code offset #99
    //   Java source line #67	-> byte code offset #101
    //   Java source line #65	-> byte code offset #102
    //   Java source line #68	-> byte code offset #104
    //   Java source line #69	-> byte code offset #110
    //   Java source line #70	-> byte code offset #115
    //   Java source line #71	-> byte code offset #127
    //   Java source line #72	-> byte code offset #135
    //   Java source line #73	-> byte code offset #142
    //   Java source line #69	-> byte code offset #149
    //   Java source line #75	-> byte code offset #152
    //   Java source line #75	-> byte code offset #179
    //   Java source line #63	-> byte code offset #180
    //   Java source line #76	-> byte code offset #203
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	204	0	$receiver	File
    //   31	149	3	input	FileInputStream
    //   34	145	4	offset	int
    //   110	69	5	result	byte[]
    //   44	54	7	length	long
    //   104	75	9	remaining	int
    //   127	22	10	read	int
    //   44	54	11	$i$a$1$also	int
    //   31	149	12	$i$a$1$use	int
    // Exception table:
    //   from	to	target	type
    //   25	181	190	java/lang/Throwable
    //   25	181	195	finally
    //   190	195	195	finally
    //   195	196	195	finally
  }
  
  public static final void writeBytes(@NotNull File $receiver, @NotNull byte[] array)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(array, "array");Closeable localCloseable = (Closeable)new FileOutputStream($receiver);Throwable localThrowable1 = (Throwable)null; try { FileOutputStream it = (FileOutputStream)localCloseable; int $i$a$1$use; it.write(array);it = Unit.INSTANCE; } catch (Throwable localThrowable) { localThrowable1 = localThrowable; throw localThrowable; } finally { CloseableKt.closeFinally(localCloseable, localThrowable1);
    }
  }
  

  public static final void appendBytes(@NotNull File $receiver, @NotNull byte[] array)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(array, "array");Closeable localCloseable = (Closeable)new FileOutputStream($receiver, true);Throwable localThrowable1 = (Throwable)null; try { FileOutputStream it = (FileOutputStream)localCloseable; int $i$a$1$use; it.write(array);it = Unit.INSTANCE; } catch (Throwable localThrowable) { localThrowable1 = localThrowable; throw localThrowable; } finally { CloseableKt.closeFinally(localCloseable, localThrowable1);
    }
  }
  



  @NotNull
  public static final String readText(@NotNull File $receiver, @NotNull Charset charset)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(charset, "charset");byte[] arrayOfByte = FilesKt.readBytes($receiver);return new String(arrayOfByte, charset);
  }
  




  public static final void writeText(@NotNull File $receiver, @NotNull String text, @NotNull Charset charset)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(text, "text");Intrinsics.checkParameterIsNotNull(charset, "charset");String str = text;File localFile = $receiver; byte[] tmp28_25 = str.getBytes(charset);Intrinsics.checkExpressionValueIsNotNull(tmp28_25, "(this as java.lang.String).getBytes(charset)");byte[] arrayOfByte = tmp28_25;FilesKt.writeBytes(localFile, arrayOfByte);
  }
  



  public static final void appendText(@NotNull File $receiver, @NotNull String text, @NotNull Charset charset)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(text, "text");Intrinsics.checkParameterIsNotNull(charset, "charset");String str = text;File localFile = $receiver; byte[] tmp28_25 = str.getBytes(charset);Intrinsics.checkExpressionValueIsNotNull(tmp28_25, "(this as java.lang.String).getBytes(charset)");byte[] arrayOfByte = tmp28_25;FilesKt.appendBytes(localFile, arrayOfByte);
  }
  






  public static final void forEachBlock(@NotNull File $receiver, @NotNull kotlin.jvm.functions.Function2<? super byte[], ? super Integer, Unit> action)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(action, "action");FilesKt.forEachBlock($receiver, 4096, action);
  }
  







  public static final void forEachBlock(@NotNull File $receiver, int blockSize, @NotNull kotlin.jvm.functions.Function2<? super byte[], ? super Integer, Unit> action)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(action, "action");byte[] arr = new byte[kotlin.ranges.RangesKt.coerceAtLeast(blockSize, 512)];
    
    Object localObject = $receiver;localObject = (Closeable)new FileInputStream((File)localObject);Throwable localThrowable1 = (Throwable)null; try { FileInputStream input = (FileInputStream)localObject;
      for (;;) { int $i$a$1$use;
        int size = input.read(arr);
        if (size <= 0) {
          break;
        }
        action.invoke(arr, Integer.valueOf(size));
      }
      input = 
      







        Unit.INSTANCE;
    }
    catch (Throwable localThrowable)
    {
      localThrowable1 = localThrowable; throw localThrowable; } finally { CloseableKt.closeFinally((Closeable)localObject, localThrowable1);
    }
  }
  

















  public static final void forEachLine(@NotNull File $receiver, @NotNull Charset charset, @NotNull kotlin.jvm.functions.Function1<? super String, Unit> action)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(charset, "charset");Intrinsics.checkParameterIsNotNull(action, "action");TextStreamsKt.forEachLine((java.io.Reader)new java.io.BufferedReader((java.io.Reader)new java.io.InputStreamReader((java.io.InputStream)new FileInputStream($receiver), charset)), action);
  }
  

  @InlineOnly
  private static final FileInputStream inputStream(@NotNull File $receiver)
  {
    ;
    return new FileInputStream($receiver);
  }
  

  @InlineOnly
  private static final FileOutputStream outputStream(@NotNull File $receiver)
  {
    ;
    return new FileOutputStream($receiver);
  }
  






  @NotNull
  public static final java.util.List<String> readLines(@NotNull File $receiver, @NotNull Charset charset)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(charset, "charset");java.util.ArrayList result = new java.util.ArrayList();
    FilesKt.forEachLine($receiver, charset, (kotlin.jvm.functions.Function1)new kotlin.jvm.internal.Lambda(result) { public final void invoke(@NotNull String it) { Intrinsics.checkParameterIsNotNull(it, "it");$result.add(it); } });
    return (java.util.List)result;
  }
  
  /* Error */
  public static final <T> T useLines(@NotNull File $receiver, @NotNull Charset charset, @NotNull kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<String>, ? extends T> block)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 94
    //   3: invokestatic 100	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc -65
    //   9: invokestatic 100	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_2
    //   13: ldc_w 303
    //   16: invokestatic 100	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   19: aload_0
    //   20: astore 4
    //   22: sipush 8192
    //   25: istore 5
    //   27: aload 4
    //   29: astore 7
    //   31: aload 7
    //   33: astore 8
    //   35: new 10	java/io/FileInputStream
    //   38: dup
    //   39: aload 8
    //   41: invokespecial 14	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   44: checkcast 16	java/io/InputStream
    //   47: astore 8
    //   49: new 18	java/io/InputStreamReader
    //   52: dup
    //   53: aload 8
    //   55: aload_1
    //   56: invokespecial 21	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   59: checkcast 38	java/io/Reader
    //   62: astore 7
    //   64: aload 7
    //   66: instanceof 40
    //   69: ifeq +11 -> 80
    //   72: aload 7
    //   74: checkcast 40	java/io/BufferedReader
    //   77: goto +14 -> 91
    //   80: new 40	java/io/BufferedReader
    //   83: dup
    //   84: aload 7
    //   86: iload 5
    //   88: invokespecial 43	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   91: checkcast 102	java/io/Closeable
    //   94: astore 4
    //   96: aconst_null
    //   97: checkcast 92	java/lang/Throwable
    //   100: astore 5
    //   102: nop
    //   103: aload 4
    //   105: checkcast 40	java/io/BufferedReader
    //   108: astore 6
    //   110: aload_2
    //   111: aload 6
    //   113: invokestatic 307	kotlin/io/TextStreamsKt:lineSequence	(Ljava/io/BufferedReader;)Lkotlin/sequences/Sequence;
    //   116: invokeinterface 310 2 0
    //   121: astore 6
    //   123: iconst_1
    //   124: invokestatic 316	kotlin/jvm/internal/InlineMarker:finallyStart	(I)V
    //   127: iconst_1
    //   128: iconst_1
    //   129: iconst_0
    //   130: invokestatic 322	kotlin/internal/PlatformImplementationsKt:apiVersionIsAtLeast	(III)Z
    //   133: ifeq +13 -> 146
    //   136: aload 4
    //   138: aload 5
    //   140: invokestatic 158	kotlin/io/CloseableKt:closeFinally	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   143: goto +10 -> 153
    //   146: aload 4
    //   148: invokeinterface 325 1 0
    //   153: iconst_1
    //   154: invokestatic 328	kotlin/jvm/internal/InlineMarker:finallyEnd	(I)V
    //   157: aload 6
    //   159: goto +72 -> 231
    //   162: astore 6
    //   164: aload 6
    //   166: astore 5
    //   168: aload 6
    //   170: athrow
    //   171: astore 6
    //   173: iconst_1
    //   174: invokestatic 316	kotlin/jvm/internal/InlineMarker:finallyStart	(I)V
    //   177: iconst_1
    //   178: iconst_1
    //   179: iconst_0
    //   180: invokestatic 322	kotlin/internal/PlatformImplementationsKt:apiVersionIsAtLeast	(III)Z
    //   183: ifeq +13 -> 196
    //   186: aload 4
    //   188: aload 5
    //   190: invokestatic 158	kotlin/io/CloseableKt:closeFinally	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   193: goto +31 -> 224
    //   196: aload 5
    //   198: ifnonnull +13 -> 211
    //   201: aload 4
    //   203: invokeinterface 325 1 0
    //   208: goto +16 -> 224
    //   211: nop
    //   212: aload 4
    //   214: invokeinterface 325 1 0
    //   219: goto +5 -> 224
    //   222: astore 7
    //   224: iconst_1
    //   225: invokestatic 328	kotlin/jvm/internal/InlineMarker:finallyEnd	(I)V
    //   228: aload 6
    //   230: athrow
    //   231: areturn
    // Line number table:
    //   Java source line #208	-> byte code offset #19
    //   Java source line #208	-> byte code offset #96
    //   Java source line #208	-> byte code offset #110
    //   Java source line #208	-> byte code offset #121
    //   Java source line #208	-> byte code offset #231
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	232	0	$receiver	File
    //   0	232	1	charset	Charset
    //   0	232	2	block	kotlin.jvm.functions.Function1
    //   0	232	3	$i$f$useLines	int
    //   110	11	6	it	java.io.BufferedReader
    //   110	11	7	$i$a$1$use	int
    // Exception table:
    //   from	to	target	type
    //   102	123	162	java/lang/Throwable
    //   102	123	171	finally
    //   162	171	171	finally
    //   171	173	171	finally
    //   211	219	222	java/lang/Throwable
  }
  
  public FilesKt__FileReadWriteKt() {}
}

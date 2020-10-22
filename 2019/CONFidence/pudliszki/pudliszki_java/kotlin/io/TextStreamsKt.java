package kotlin.io;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000X\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\030\002\n\002\030\002\n\000\n\002\020\t\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\022\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\032\027\020\000\032\0020\001*\0020\0022\b\b\002\020\003\032\0020\004H\b\032\027\020\000\032\0020\005*\0020\0062\b\b\002\020\003\032\0020\004H\b\032\034\020\007\032\0020\b*\0020\0022\006\020\t\032\0020\0062\b\b\002\020\003\032\0020\004\032\036\020\n\032\0020\013*\0020\0022\022\020\f\032\016\022\004\022\0020\016\022\004\022\0020\0130\r\032\020\020\017\032\b\022\004\022\0020\0160\020*\0020\001\032\n\020\021\032\0020\022*\0020\023\032\020\020\024\032\b\022\004\022\0020\0160\025*\0020\002\032\n\020\026\032\0020\016*\0020\002\032\027\020\026\032\0020\016*\0020\0232\b\b\002\020\027\032\0020\030H\b\032\r\020\031\032\0020\032*\0020\016H\b\0325\020\033\032\002H\034\"\004\b\000\020\034*\0020\0022\030\020\035\032\024\022\n\022\b\022\004\022\0020\0160\020\022\004\022\002H\0340\rH\bø\001\000¢\006\002\020\037\002\b\n\006\b\021(\0360\001¨\006 "}, d2={"buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", "", "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "copyTo", "", "out", "forEachLine", "", "action", "Lkotlin/Function1;", "", "lineSequence", "Lkotlin/sequences/Sequence;", "readBytes", "", "Ljava/net/URL;", "readLines", "", "readText", "charset", "Ljava/nio/charset/Charset;", "reader", "Ljava/io/StringReader;", "useLines", "T", "block", "Requires newer compiler version to be inlined correctly.", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"})
@kotlin.jvm.JvmName(name="TextStreamsKt")
public final class TextStreamsKt
{
  @kotlin.internal.InlineOnly
  private static final BufferedReader buffered(@NotNull Reader $receiver, int bufferSize)
  {
    ;
    return ($receiver instanceof BufferedReader) ? (BufferedReader)$receiver : new BufferedReader($receiver, bufferSize);
  }
  
  @kotlin.internal.InlineOnly
  private static final java.io.BufferedWriter buffered(@NotNull Writer $receiver, int bufferSize) { ;
    return ($receiver instanceof java.io.BufferedWriter) ? (java.io.BufferedWriter)$receiver : new java.io.BufferedWriter($receiver, bufferSize);
  }
  










  @NotNull
  public static final java.util.List<String> readLines(@NotNull Reader $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");ArrayList result = new ArrayList();
    forEachLine($receiver, (Function1)new kotlin.jvm.internal.Lambda(result) { public final void invoke(@NotNull String it) { Intrinsics.checkParameterIsNotNull(it, "it");$result.add(it); } });
    return (java.util.List)result;
  }
  




  @kotlin.internal.InlineOnly
  private static final java.io.StringReader reader(@NotNull String $receiver)
  {
    ;
    


    return new java.io.StringReader($receiver);
  }
  







  @NotNull
  public static final Sequence<String> lineSequence(@NotNull BufferedReader $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return kotlin.sequences.SequencesKt.constrainOnce((Sequence)new LinesSequence($receiver));
  }
  






























  @NotNull
  public static final String readText(@NotNull Reader $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");java.io.StringWriter buffer = new java.io.StringWriter();
    copyTo$default($receiver, (Writer)buffer, 0, 2, null); String 
      tmp30_27 = buffer.toString();Intrinsics.checkExpressionValueIsNotNull(tmp30_27, "buffer.toString()");return tmp30_27;
  }
  








  public static final long copyTo(@NotNull Reader $receiver, @NotNull Writer out, int bufferSize)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(out, "out");long charsCopied = 0L;
    char[] buffer = new char[bufferSize];
    int chars = $receiver.read(buffer);
    while (chars >= 0) {
      out.write(buffer, 0, chars);
      charsCopied += chars;
      chars = $receiver.read(buffer);
    }
    return charsCopied;
  }
  



  @kotlin.internal.InlineOnly
  private static final String readText(@NotNull java.net.URL $receiver, java.nio.charset.Charset charset)
  {
    ;
    

    byte[] arrayOfByte = readBytes($receiver);return new String(arrayOfByte, charset);
  }
  



  @NotNull
  public static final byte[] readBytes(@NotNull java.net.URL $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");java.io.Closeable localCloseable = (java.io.Closeable)$receiver.openStream();Throwable localThrowable1 = (Throwable)null; try { it = (java.io.InputStream)localCloseable; int $i$a$1$use; java.io.InputStream tmp26_25 = it;Intrinsics.checkExpressionValueIsNotNull(tmp26_25, "it");it = ByteStreamsKt.readBytes(tmp26_25); } catch (Throwable localThrowable) { java.io.InputStream it; localThrowable1 = localThrowable; throw localThrowable; } finally { CloseableKt.closeFinally(localCloseable, localThrowable1); } return it;
  }
  
  public static final void forEachLine(@NotNull Reader $receiver, @NotNull Function1<? super String, kotlin.Unit> action)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(action, "action");Reader $receiver$iv = $receiver;
    





























































    int $i$f$useLines;
    





























































    Object localObject1 = $receiver$iv;int i = 8192;localObject1 = (java.io.Closeable)((localObject1 instanceof BufferedReader) ? (BufferedReader)localObject1 : new BufferedReader((Reader)localObject1, i));Throwable localThrowable1 = (Throwable)null; try { BufferedReader it$iv = (BufferedReader)localObject1; int $i$a$1$use; Sequence it = lineSequence(it$iv);
      int $i$a$1$useLines;
      Sequence localSequence1 = it;Function1 action$iv = action;
      






























      int $i$f$forEach;
      






























      Sequence $receiver$iv;
      






























      Object element$iv;
      





























      for (java.util.Iterator localIterator = $receiver$iv.iterator(); localIterator.hasNext(); action$iv.invoke(element$iv)) element$iv = localIterator.next();
      it$iv = kotlin.Unit.INSTANCE; } catch (Throwable localThrowable) { localThrowable1 = localThrowable; throw localThrowable; } finally { CloseableKt.closeFinally((java.io.Closeable)localObject1, localThrowable1);
    }
  }
  
  /* Error */
  public static final <T> T useLines(@NotNull Reader $receiver, @NotNull Function1<? super Sequence<String>, ? extends T> block)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 38
    //   3: invokestatic 44	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 123
    //   9: invokestatic 44	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: astore_3
    //   14: sipush 8192
    //   17: istore 4
    //   19: aload_3
    //   20: instanceof 13
    //   23: ifeq +10 -> 33
    //   26: aload_3
    //   27: checkcast 13	java/io/BufferedReader
    //   30: goto +13 -> 43
    //   33: new 13	java/io/BufferedReader
    //   36: dup
    //   37: aload_3
    //   38: iload 4
    //   40: invokespecial 17	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   43: checkcast 48	java/io/Closeable
    //   46: astore_3
    //   47: aconst_null
    //   48: checkcast 36	java/lang/Throwable
    //   51: astore 4
    //   53: nop
    //   54: aload_3
    //   55: checkcast 13	java/io/BufferedReader
    //   58: astore 5
    //   60: aload_1
    //   61: aload 5
    //   63: invokestatic 52	kotlin/io/TextStreamsKt:lineSequence	(Ljava/io/BufferedReader;)Lkotlin/sequences/Sequence;
    //   66: invokeinterface 74 2 0
    //   71: astore 5
    //   73: iconst_1
    //   74: invokestatic 129	kotlin/jvm/internal/InlineMarker:finallyStart	(I)V
    //   77: iconst_1
    //   78: iconst_1
    //   79: iconst_0
    //   80: invokestatic 135	kotlin/internal/PlatformImplementationsKt:apiVersionIsAtLeast	(III)Z
    //   83: ifeq +12 -> 95
    //   86: aload_3
    //   87: aload 4
    //   89: invokestatic 86	kotlin/io/CloseableKt:closeFinally	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   92: goto +9 -> 101
    //   95: aload_3
    //   96: invokeinterface 138 1 0
    //   101: iconst_1
    //   102: invokestatic 141	kotlin/jvm/internal/InlineMarker:finallyEnd	(I)V
    //   105: aload 5
    //   107: goto +69 -> 176
    //   110: astore 5
    //   112: aload 5
    //   114: astore 4
    //   116: aload 5
    //   118: athrow
    //   119: astore 5
    //   121: iconst_1
    //   122: invokestatic 129	kotlin/jvm/internal/InlineMarker:finallyStart	(I)V
    //   125: iconst_1
    //   126: iconst_1
    //   127: iconst_0
    //   128: invokestatic 135	kotlin/internal/PlatformImplementationsKt:apiVersionIsAtLeast	(III)Z
    //   131: ifeq +12 -> 143
    //   134: aload_3
    //   135: aload 4
    //   137: invokestatic 86	kotlin/io/CloseableKt:closeFinally	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   140: goto +29 -> 169
    //   143: aload 4
    //   145: ifnonnull +12 -> 157
    //   148: aload_3
    //   149: invokeinterface 138 1 0
    //   154: goto +15 -> 169
    //   157: nop
    //   158: aload_3
    //   159: invokeinterface 138 1 0
    //   164: goto +5 -> 169
    //   167: astore 6
    //   169: iconst_1
    //   170: invokestatic 141	kotlin/jvm/internal/InlineMarker:finallyEnd	(I)V
    //   173: aload 5
    //   175: athrow
    //   176: areturn
    // Line number table:
    //   Java source line #53	-> byte code offset #12
    //   Java source line #53	-> byte code offset #47
    //   Java source line #53	-> byte code offset #60
    //   Java source line #53	-> byte code offset #71
    //   Java source line #53	-> byte code offset #176
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	$receiver	Reader
    //   0	177	1	block	Function1
    //   0	177	2	$i$f$useLines	int
    //   60	11	5	it	BufferedReader
    //   60	11	6	$i$a$1$use	int
    // Exception table:
    //   from	to	target	type
    //   53	73	110	java/lang/Throwable
    //   53	73	119	finally
    //   110	119	119	finally
    //   119	121	119	finally
    //   157	164	167	java/lang/Throwable
  }
}

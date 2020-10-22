package kotlin.io;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000Z\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\000\n\002\020\t\n\002\b\002\n\002\020\022\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\032\027\020\000\032\0020\001*\0020\0022\b\b\002\020\003\032\0020\004H\b\032\027\020\000\032\0020\005*\0020\0062\b\b\002\020\003\032\0020\004H\b\032\027\020\007\032\0020\b*\0020\0022\b\b\002\020\t\032\0020\nH\b\032\027\020\013\032\0020\f*\0020\0062\b\b\002\020\t\032\0020\nH\b\032\027\020\r\032\0020\016*\0020\0172\b\b\002\020\t\032\0020\nH\b\032\034\020\020\032\0020\021*\0020\0022\006\020\022\032\0020\0062\b\b\002\020\003\032\0020\004\032\r\020\023\032\0020\016*\0020\024H\b\032\035\020\023\032\0020\016*\0020\0242\006\020\025\032\0020\0042\006\020\026\032\0020\004H\b\032\r\020\027\032\0020\030*\0020\001H\002\032\f\020\031\032\0020\024*\0020\002H\007\032\026\020\031\032\0020\024*\0020\0022\b\b\002\020\032\032\0020\004H\007\032\027\020\033\032\0020\034*\0020\0022\b\b\002\020\t\032\0020\nH\b\032\027\020\035\032\0020\036*\0020\0062\b\b\002\020\t\032\0020\nH\b¨\006\037"}, d2={"buffered", "Ljava/io/BufferedInputStream;", "Ljava/io/InputStream;", "bufferSize", "", "Ljava/io/BufferedOutputStream;", "Ljava/io/OutputStream;", "bufferedReader", "Ljava/io/BufferedReader;", "charset", "Ljava/nio/charset/Charset;", "bufferedWriter", "Ljava/io/BufferedWriter;", "byteInputStream", "Ljava/io/ByteArrayInputStream;", "", "copyTo", "", "out", "inputStream", "", "offset", "length", "iterator", "Lkotlin/collections/ByteIterator;", "readBytes", "estimatedSize", "reader", "Ljava/io/InputStreamReader;", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"})
@kotlin.jvm.JvmName(name="ByteStreamsKt")
public final class ByteStreamsKt
{
  @NotNull
  public static final kotlin.collections.ByteIterator iterator(@NotNull java.io.BufferedInputStream $receiver)
  {
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");(kotlin.collections.ByteIterator)new kotlin.collections.ByteIterator() {
      public final int getNextByte() {
        return nextByte; } public final void setNextByte(int <set-?>) { nextByte = <set-?>; } private int nextByte = -1;
      
      public final boolean getNextPrepared() { return nextPrepared; } public final void setNextPrepared(boolean <set-?>) { nextPrepared = <set-?>; }
      
      public final boolean getFinished() { return finished; } public final void setFinished(boolean <set-?>) { finished = <set-?>; }
      
      private final void prepareNext() {
        if ((!nextPrepared) && (!finished)) {
          nextByte = $this_iterator.read();
          nextPrepared = true;
          finished = (nextByte == -1);
        }
      }
      
      public boolean hasNext() {
        prepareNext();
        return !finished;
      }
      
      public byte nextByte() {
        prepareNext();
        if (finished)
          throw ((Throwable)new java.util.NoSuchElementException("Input stream is over."));
        byte res = (byte)nextByte;
        nextPrepared = false;
        return res;
      }
    };
  }
  
  @InlineOnly
  private static final java.io.ByteArrayInputStream byteInputStream(@NotNull String $receiver, Charset charset) { ;
    String str = $receiver; String tmp3_2 = str; if (tmp3_2 == null) throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.String"); byte[] tmp21_18 = tmp3_2.getBytes(charset);kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(tmp21_18, "(this as java.lang.String).getBytes(charset)");byte[] arrayOfByte1 = tmp21_18;byte[] arrayOfByte2 = arrayOfByte1;return new java.io.ByteArrayInputStream(arrayOfByte2);
  }
  
  @InlineOnly
  private static final java.io.ByteArrayInputStream inputStream(@NotNull byte[] $receiver) {
    ;
    return new java.io.ByteArrayInputStream($receiver);
  }
  

  @InlineOnly
  private static final java.io.ByteArrayInputStream inputStream(@NotNull byte[] $receiver, int offset, int length)
  {
    ;
    return new java.io.ByteArrayInputStream($receiver, offset, length);
  }
  

  @InlineOnly
  private static final java.io.BufferedInputStream buffered(@NotNull InputStream $receiver, int bufferSize)
  {
    ;
    return ($receiver instanceof java.io.BufferedInputStream) ? (java.io.BufferedInputStream)$receiver : new java.io.BufferedInputStream($receiver, bufferSize); }
  
  @InlineOnly
  private static final java.io.InputStreamReader reader(@NotNull InputStream $receiver, Charset charset) { ;
    return new java.io.InputStreamReader($receiver, charset); }
  
  @InlineOnly
  private static final java.io.BufferedReader bufferedReader(@NotNull InputStream $receiver, Charset charset) { ;
    Object localObject = $receiver;localObject = (java.io.Reader)new java.io.InputStreamReader((InputStream)localObject, charset);int i = 8192;return (localObject instanceof java.io.BufferedReader) ? (java.io.BufferedReader)localObject : new java.io.BufferedReader((java.io.Reader)localObject, i);
  }
  

  @InlineOnly
  private static final java.io.BufferedOutputStream buffered(@NotNull OutputStream $receiver, int bufferSize)
  {
    ;
    return ($receiver instanceof java.io.BufferedOutputStream) ? (java.io.BufferedOutputStream)$receiver : new java.io.BufferedOutputStream($receiver, bufferSize); }
  
  @InlineOnly
  private static final java.io.OutputStreamWriter writer(@NotNull OutputStream $receiver, Charset charset) { ;
    return new java.io.OutputStreamWriter($receiver, charset); }
  
  @InlineOnly
  private static final java.io.BufferedWriter bufferedWriter(@NotNull OutputStream $receiver, Charset charset) { ;
    Object localObject = $receiver;localObject = (java.io.Writer)new java.io.OutputStreamWriter((OutputStream)localObject, charset);int i = 8192;return (localObject instanceof java.io.BufferedWriter) ? (java.io.BufferedWriter)localObject : new java.io.BufferedWriter((java.io.Writer)localObject, i);
  }
  

  private boolean nextPrepared;
  private boolean finished;
  public static final long copyTo(@NotNull InputStream $receiver, @NotNull OutputStream out, int bufferSize)
  {
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(out, "out");long bytesCopied = 0L;
    byte[] buffer = new byte[bufferSize];
    int bytes = $receiver.read(buffer);
    while (bytes >= 0) {
      out.write(buffer, 0, bytes);
      bytesCopied += bytes;
      bytes = $receiver.read(buffer);
    }
    return bytesCopied;
  }
  

  /**
   * @deprecated
   */
  @kotlin.Deprecated(message="Use readBytes() overload without estimatedSize parameter", replaceWith=@kotlin.ReplaceWith(imports={}, expression="readBytes()"))
  @NotNull
  public static final byte[] readBytes(@NotNull InputStream $receiver, int estimatedSize)
  {
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int i = $receiver.available();int j = Math.max(estimatedSize, i);int k = j;java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream(k);
    copyTo$default($receiver, (OutputStream)buffer, 0, 2, null); byte[] 
      tmp48_45 = buffer.toByteArray();kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(tmp48_45, "buffer.toByteArray()");return tmp48_45;
  }
  



  @kotlin.SinceKotlin(version="1.3")
  @NotNull
  public static final byte[] readBytes(@NotNull InputStream $receiver)
  {
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int i = 8192;int j = $receiver.available();int k = Math.max(i, j);int m = k;java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream(m);
    copyTo$default($receiver, (OutputStream)buffer, 0, 2, null); byte[] 
      tmp52_49 = buffer.toByteArray();kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(tmp52_49, "buffer.toByteArray()");return tmp52_49;
  }
}

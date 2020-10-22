package kotlin.io;

import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import kotlin.internal.InlineOnly;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000n\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\020\000\n\002\020\013\n\002\020\005\n\002\020\f\n\002\020\031\n\002\020\006\n\002\020\007\n\002\020\t\n\002\020\n\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\032\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\fH\b\032\021\020\t\032\0020\n2\006\020\013\032\0020\rH\b\032\021\020\t\032\0020\n2\006\020\013\032\0020\016H\b\032\021\020\t\032\0020\n2\006\020\013\032\0020\017H\b\032\021\020\t\032\0020\n2\006\020\013\032\0020\020H\b\032\021\020\t\032\0020\n2\006\020\013\032\0020\021H\b\032\021\020\t\032\0020\n2\006\020\013\032\0020\022H\b\032\021\020\t\032\0020\n2\006\020\013\032\0020\001H\b\032\021\020\t\032\0020\n2\006\020\013\032\0020\023H\b\032\021\020\t\032\0020\n2\006\020\013\032\0020\024H\b\032\t\020\025\032\0020\nH\b\032\023\020\025\032\0020\n2\b\020\013\032\004\030\0010\fH\b\032\021\020\025\032\0020\n2\006\020\013\032\0020\rH\b\032\021\020\025\032\0020\n2\006\020\013\032\0020\016H\b\032\021\020\025\032\0020\n2\006\020\013\032\0020\017H\b\032\021\020\025\032\0020\n2\006\020\013\032\0020\020H\b\032\021\020\025\032\0020\n2\006\020\013\032\0020\021H\b\032\021\020\025\032\0020\n2\006\020\013\032\0020\022H\b\032\021\020\025\032\0020\n2\006\020\013\032\0020\001H\b\032\021\020\025\032\0020\n2\006\020\013\032\0020\023H\b\032\021\020\025\032\0020\n2\006\020\013\032\0020\024H\b\032\b\020\026\032\004\030\0010\027\032\032\020\026\032\004\030\0010\0272\006\020\030\032\0020\0312\006\020\003\032\0020\004H\000\032\f\020\032\032\0020\r*\0020\033H\002\032\f\020\034\032\0020\n*\0020\035H\002\032\030\020\036\032\0020\n*\0020\0332\n\020\037\032\0060 j\002`!H\002\032$\020\"\032\0020\r*\0020\0042\006\020#\032\0020$2\006\020%\032\0020\0332\006\020&\032\0020\rH\002\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\033\020\003\032\0020\0048BX\002¢\006\f\n\004\b\007\020\b\032\004\b\005\020\006¨\006'"}, d2={"BUFFER_SIZE", "", "LINE_SEPARATOR_MAX_LENGTH", "decoder", "Ljava/nio/charset/CharsetDecoder;", "getDecoder", "()Ljava/nio/charset/CharsetDecoder;", "decoder$delegate", "Lkotlin/Lazy;", "print", "", "message", "", "", "", "", "", "", "", "", "", "println", "readLine", "", "inputStream", "Ljava/io/InputStream;", "endsWithLineSeparator", "Ljava/nio/CharBuffer;", "flipBack", "Ljava/nio/Buffer;", "offloadPrefixTo", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "tryDecode", "byteBuffer", "Ljava/nio/ByteBuffer;", "charBuffer", "isEndOfStream", "kotlin-stdlib"})
@kotlin.jvm.JvmName(name="ConsoleKt")
public final class ConsoleKt
{
  private static final int BUFFER_SIZE = 32;
  private static final int LINE_SEPARATOR_MAX_LENGTH = 2;
  
  @InlineOnly
  private static final void print(Object message)
  {
    ;
    System.out.print(message);
  }
  
  @InlineOnly
  private static final void print(int message) {
    ;
    System.out.print(message);
  }
  
  @InlineOnly
  private static final void print(long message) {
    ;
    System.out.print(message);
  }
  
  @InlineOnly
  private static final void print(byte message) {
    ;
    System.out.print(Byte.valueOf(message));
  }
  
  @InlineOnly
  private static final void print(short message) {
    ;
    System.out.print(Short.valueOf(message));
  }
  
  @InlineOnly
  private static final void print(char message) {
    ;
    System.out.print(message);
  }
  
  @InlineOnly
  private static final void print(boolean message) {
    ;
    System.out.print(message);
  }
  
  @InlineOnly
  private static final void print(float message) {
    ;
    System.out.print(message);
  }
  
  @InlineOnly
  private static final void print(double message) {
    ;
    System.out.print(message);
  }
  
  @InlineOnly
  private static final void print(char[] message) {
    ;
    System.out.print(message);
  }
  
  @InlineOnly
  private static final void println(Object message) {
    ;
    System.out.println(message);
  }
  
  @InlineOnly
  private static final void println(int message) {
    ;
    System.out.println(message);
  }
  
  @InlineOnly
  private static final void println(long message) {
    ;
    System.out.println(message);
  }
  
  @InlineOnly
  private static final void println(byte message) {
    ;
    System.out.println(Byte.valueOf(message));
  }
  
  @InlineOnly
  private static final void println(short message) {
    ;
    System.out.println(Short.valueOf(message));
  }
  
  @InlineOnly
  private static final void println(char message) {
    ;
    System.out.println(message);
  }
  
  @InlineOnly
  private static final void println(boolean message) {
    ;
    System.out.println(message);
  }
  
  @InlineOnly
  private static final void println(float message) {
    ;
    System.out.println(message);
  }
  
  @InlineOnly
  private static final void println(double message) {
    ;
    System.out.println(message);
  }
  
  @InlineOnly
  private static final void println(char[] message) {
    ;
    System.out.println(message);
  }
  
  @InlineOnly
  private static final void println() {
    ;
    System.out.println();
  }
  



  private static final kotlin.Lazy decoder$delegate = kotlin.LazyKt.lazy((kotlin.jvm.functions.Function0)decoder.2.INSTANCE);
  
  private static final CharsetDecoder getDecoder() {
    kotlin.Lazy localLazy = decoder$delegate;
    Object localObject = null;
    kotlin.reflect.KProperty localKProperty = $$delegatedProperties[0];
    return (CharsetDecoder)localLazy.getValue();
  }
  
  @org.jetbrains.annotations.Nullable
  public static final String readLine() { java.io.InputStream tmp3_0 = System.in;kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(tmp3_0, "System.`in`");return readLine(tmp3_0, getDecoder()); }
  
  @org.jetbrains.annotations.Nullable
  public static final String readLine(@org.jetbrains.annotations.NotNull java.io.InputStream inputStream, @org.jetbrains.annotations.NotNull CharsetDecoder decoder) { kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(inputStream, "inputStream");kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(decoder, "decoder");int i = decoder.maxCharsPerByte() <= 1 ? 1 : 0; if (i == 0) { int $i$a$1$require; String str = "Encodings with multiple chars per byte are not supported";throw ((Throwable)new IllegalArgumentException(str.toString()));
    }
    ByteBuffer byteBuffer = ByteBuffer.allocate(32);
    CharBuffer charBuffer = CharBuffer.allocate(4);
    StringBuilder stringBuilder = new StringBuilder();
    
    int read = inputStream.read();
    if (read == -1) return null;
    do {
      byteBuffer.put((byte)read); ByteBuffer 
        tmp96_95 = byteBuffer;kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(tmp96_95, "byteBuffer"); CharBuffer tmp103_102 = charBuffer;kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(tmp103_102, "charBuffer"); if (tryDecode(decoder, tmp96_95, tmp103_102, false)) {
        if (endsWithLineSeparator(charBuffer)) {
          break;
        }
        if (charBuffer.remaining() < 2) {
          offloadPrefixTo(charBuffer, stringBuilder);
        }
      }
      read = inputStream.read();
    } while (read != -1);
    
    CharsetDecoder $receiver = decoder;
    int $i$a$2$with; tryDecode($receiver, byteBuffer, charBuffer, true);
    $receiver.reset();
    

    CharBuffer $receiver = charBuffer;
    int $i$a$3$with; int length = $receiver.position();
    if ((length > 0) && ($receiver.get(length - 1) == '\n')) {
      length--;
      if ((length > 0) && ($receiver.get(length - 1) == '\r')) {
        length--;
      }
    }
    $receiver.flip();
    int j = 0; for (int k = length; j < k; j++) { int it = j;
      int $i$a$1$repeat; stringBuilder.append($receiver.get());
    }
    

    return stringBuilder.toString();
  }
  
  private static final boolean tryDecode(@org.jetbrains.annotations.NotNull CharsetDecoder $receiver, ByteBuffer byteBuffer, CharBuffer charBuffer, boolean isEndOfStream) {
    int positionBefore = charBuffer.position();
    byteBuffer.flip();
    java.nio.charset.CoderResult localCoderResult1 = $receiver.decode(byteBuffer, charBuffer, isEndOfStream);java.nio.charset.CoderResult $receiver = localCoderResult1;
    int $i$a$1$with; if ($receiver.isError()) { $receiver.throwException();
    }
    boolean bool1 = charBuffer.position() > positionBefore;boolean isDecoded = bool1;
    int $i$a$2$also; if (isDecoded) byteBuffer.clear(); else flipBack((java.nio.Buffer)byteBuffer);
    return bool1;
  }
  

  private static final boolean endsWithLineSeparator(@org.jetbrains.annotations.NotNull CharBuffer $receiver)
  {
    int p = $receiver.position();
    return (p > 0) && ($receiver.get(p - 1) == '\n');
  }
  
  private static final void flipBack(@org.jetbrains.annotations.NotNull java.nio.Buffer $receiver) {
    $receiver.position($receiver.limit());
    $receiver.limit($receiver.capacity());
  }
  
  private static final void offloadPrefixTo(@org.jetbrains.annotations.NotNull CharBuffer $receiver, StringBuilder builder)
  {
    $receiver.flip();
    int i = $receiver.limit() - 1;int j = 0; for (int k = i; j < k; j++) { int it = j;
      int $i$a$1$repeat; builder.append($receiver.get());
    }
    $receiver.compact();
  }
}

package kotlin.comparisons;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;







@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000(\n\002\b\002\n\002\020\017\n\002\b\005\n\002\020\005\n\002\020\006\n\002\020\007\n\002\020\b\n\002\020\t\n\002\020\n\n\002\b\002\032-\020\000\032\002H\001\"\016\b\000\020\001*\b\022\004\022\002H\0010\0022\006\020\003\032\002H\0012\006\020\004\032\002H\001H\007¢\006\002\020\005\0325\020\000\032\002H\001\"\016\b\000\020\001*\b\022\004\022\002H\0010\0022\006\020\003\032\002H\0012\006\020\004\032\002H\0012\006\020\006\032\002H\001H\007¢\006\002\020\007\032\031\020\000\032\0020\b2\006\020\003\032\0020\b2\006\020\004\032\0020\bH\b\032!\020\000\032\0020\b2\006\020\003\032\0020\b2\006\020\004\032\0020\b2\006\020\006\032\0020\bH\b\032\031\020\000\032\0020\t2\006\020\003\032\0020\t2\006\020\004\032\0020\tH\b\032!\020\000\032\0020\t2\006\020\003\032\0020\t2\006\020\004\032\0020\t2\006\020\006\032\0020\tH\b\032\031\020\000\032\0020\n2\006\020\003\032\0020\n2\006\020\004\032\0020\nH\b\032!\020\000\032\0020\n2\006\020\003\032\0020\n2\006\020\004\032\0020\n2\006\020\006\032\0020\nH\b\032\031\020\000\032\0020\0132\006\020\003\032\0020\0132\006\020\004\032\0020\013H\b\032!\020\000\032\0020\0132\006\020\003\032\0020\0132\006\020\004\032\0020\0132\006\020\006\032\0020\013H\b\032\031\020\000\032\0020\f2\006\020\003\032\0020\f2\006\020\004\032\0020\fH\b\032!\020\000\032\0020\f2\006\020\003\032\0020\f2\006\020\004\032\0020\f2\006\020\006\032\0020\fH\b\032\031\020\000\032\0020\r2\006\020\003\032\0020\r2\006\020\004\032\0020\rH\b\032!\020\000\032\0020\r2\006\020\003\032\0020\r2\006\020\004\032\0020\r2\006\020\006\032\0020\rH\b\032-\020\016\032\002H\001\"\016\b\000\020\001*\b\022\004\022\002H\0010\0022\006\020\003\032\002H\0012\006\020\004\032\002H\001H\007¢\006\002\020\005\0325\020\016\032\002H\001\"\016\b\000\020\001*\b\022\004\022\002H\0010\0022\006\020\003\032\002H\0012\006\020\004\032\002H\0012\006\020\006\032\002H\001H\007¢\006\002\020\007\032\031\020\016\032\0020\b2\006\020\003\032\0020\b2\006\020\004\032\0020\bH\b\032!\020\016\032\0020\b2\006\020\003\032\0020\b2\006\020\004\032\0020\b2\006\020\006\032\0020\bH\b\032\031\020\016\032\0020\t2\006\020\003\032\0020\t2\006\020\004\032\0020\tH\b\032!\020\016\032\0020\t2\006\020\003\032\0020\t2\006\020\004\032\0020\t2\006\020\006\032\0020\tH\b\032\031\020\016\032\0020\n2\006\020\003\032\0020\n2\006\020\004\032\0020\nH\b\032!\020\016\032\0020\n2\006\020\003\032\0020\n2\006\020\004\032\0020\n2\006\020\006\032\0020\nH\b\032\031\020\016\032\0020\0132\006\020\003\032\0020\0132\006\020\004\032\0020\013H\b\032!\020\016\032\0020\0132\006\020\003\032\0020\0132\006\020\004\032\0020\0132\006\020\006\032\0020\013H\b\032\031\020\016\032\0020\f2\006\020\003\032\0020\f2\006\020\004\032\0020\fH\b\032!\020\016\032\0020\f2\006\020\003\032\0020\f2\006\020\004\032\0020\f2\006\020\006\032\0020\fH\b\032\031\020\016\032\0020\r2\006\020\003\032\0020\r2\006\020\004\032\0020\rH\b\032!\020\016\032\0020\r2\006\020\003\032\0020\r2\006\020\004\032\0020\r2\006\020\006\032\0020\rH\b¨\006\017"}, d2={"maxOf", "T", "", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "c", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "minOf", "kotlin-stdlib"}, xs="kotlin/comparisons/ComparisonsKt")
class ComparisonsKt___ComparisonsJvmKt
  extends ComparisonsKt__ComparisonsKt
{
  @SinceKotlin(version="1.1")
  @NotNull
  public static final <T extends Comparable<? super T>> T maxOf(@NotNull T a, @NotNull T b)
  {
    Intrinsics.checkParameterIsNotNull(a, "a");Intrinsics.checkParameterIsNotNull(b, "b");return a.compareTo(b) >= 0 ? a : b;
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final byte maxOf(byte a, byte b)
  {
    ;
    return (byte)Math.max(a, b);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final short maxOf(short a, short b)
  {
    ;
    return (short)Math.max(a, b);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final int maxOf(int a, int b)
  {
    ;
    return Math.max(a, b);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final long maxOf(long a, long b)
  {
    ;
    return Math.max(a, b);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final float maxOf(float a, float b)
  {
    ;
    return Math.max(a, b);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final double maxOf(double a, double b)
  {
    ;
    return Math.max(a, b);
  }
  

  @SinceKotlin(version="1.1")
  @NotNull
  public static final <T extends Comparable<? super T>> T maxOf(@NotNull T a, @NotNull T b, @NotNull T c)
  {
    Intrinsics.checkParameterIsNotNull(a, "a");Intrinsics.checkParameterIsNotNull(b, "b");Intrinsics.checkParameterIsNotNull(c, "c");return ComparisonsKt.maxOf(a, ComparisonsKt.maxOf(b, c));
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final byte maxOf(byte a, byte b, byte c)
  {
    ;
    return (byte)Math.max(a, Math.max(b, c));
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final short maxOf(short a, short b, short c)
  {
    ;
    return (short)Math.max(a, Math.max(b, c));
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final int maxOf(int a, int b, int c)
  {
    ;
    int i = Math.max(b, c);return Math.max(a, i);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final long maxOf(long a, long b, long c)
  {
    ;
    long l = Math.max(b, c);return Math.max(a, l);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final float maxOf(float a, float b, float c)
  {
    ;
    float f = Math.max(b, c);return Math.max(a, f);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final double maxOf(double a, double b, double c)
  {
    ;
    double d = Math.max(b, c);return Math.max(a, d);
  }
  


  @SinceKotlin(version="1.1")
  @NotNull
  public static final <T extends Comparable<? super T>> T minOf(@NotNull T a, @NotNull T b)
  {
    Intrinsics.checkParameterIsNotNull(a, "a");Intrinsics.checkParameterIsNotNull(b, "b");return a.compareTo(b) <= 0 ? a : b;
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final byte minOf(byte a, byte b)
  {
    ;
    return (byte)Math.min(a, b);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final short minOf(short a, short b)
  {
    ;
    return (short)Math.min(a, b);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final int minOf(int a, int b)
  {
    ;
    return Math.min(a, b);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final long minOf(long a, long b)
  {
    ;
    return Math.min(a, b);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final float minOf(float a, float b)
  {
    ;
    return Math.min(a, b);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final double minOf(double a, double b)
  {
    ;
    return Math.min(a, b);
  }
  

  @SinceKotlin(version="1.1")
  @NotNull
  public static final <T extends Comparable<? super T>> T minOf(@NotNull T a, @NotNull T b, @NotNull T c)
  {
    Intrinsics.checkParameterIsNotNull(a, "a");Intrinsics.checkParameterIsNotNull(b, "b");Intrinsics.checkParameterIsNotNull(c, "c");return ComparisonsKt.minOf(a, ComparisonsKt.minOf(b, c));
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final byte minOf(byte a, byte b, byte c)
  {
    ;
    return (byte)Math.min(a, Math.min(b, c));
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final short minOf(short a, short b, short c)
  {
    ;
    return (short)Math.min(a, Math.min(b, c));
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final int minOf(int a, int b, int c)
  {
    ;
    int i = Math.min(b, c);return Math.min(a, i);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final long minOf(long a, long b, long c)
  {
    ;
    long l = Math.min(b, c);return Math.min(a, l);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final float minOf(float a, float b, float c)
  {
    ;
    float f = Math.min(b, c);return Math.min(a, f);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final double minOf(double a, double b, double c)
  {
    ;
    double d = Math.min(b, c);return Math.min(a, d);
  }
  
  public ComparisonsKt___ComparisonsJvmKt() {}
}

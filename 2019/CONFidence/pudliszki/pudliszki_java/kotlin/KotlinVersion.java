package kotlin;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;






@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000&\n\002\030\002\n\002\020\017\n\000\n\002\020\b\n\002\b\f\n\002\020\013\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\003\b\007\030\000 \0272\b\022\004\022\0020\0000\001:\001\027B\027\b\026\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\006\032\0020\003¢\006\002\020\007J\021\020\r\032\0020\0032\006\020\016\032\0020\000H\002J\023\020\017\032\0020\0202\b\020\016\032\004\030\0010\021H\002J\b\020\022\032\0020\003H\026J\026\020\023\032\0020\0202\006\020\002\032\0020\0032\006\020\004\032\0020\003J\036\020\023\032\0020\0202\006\020\002\032\0020\0032\006\020\004\032\0020\0032\006\020\006\032\0020\003J\b\020\024\032\0020\025H\026J \020\026\032\0020\0032\006\020\002\032\0020\0032\006\020\004\032\0020\0032\006\020\006\032\0020\003H\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\n\020\tR\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\013\020\tR\016\020\f\032\0020\003X\004¢\006\002\n\000¨\006\030"}, d2={"Lkotlin/KotlinVersion;", "", "major", "", "minor", "(II)V", "patch", "(III)V", "getMajor", "()I", "getMinor", "getPatch", "version", "compareTo", "other", "equals", "", "", "hashCode", "isAtLeast", "toString", "", "versionOf", "Companion", "kotlin-stdlib"})
@SinceKotlin(version="1.1")
public final class KotlinVersion
  implements Comparable<KotlinVersion>
{
  public final int getMajor() { return major; } public final int getMinor() { return minor; } public final int getPatch() { return patch; }
  
  public KotlinVersion(int major, int minor)
  {
    this(major, minor, 0);
  }
  
  public KotlinVersion(int major, int minor, int patch)
  {
    this.major = major;this.minor = minor;this.patch = patch;
    




    version = versionOf(this.major, this.minor, this.patch);
  }
  






  @NotNull
  public String toString()
  {
    return major + '.' + minor + '.' + patch;
  }
  





  public int hashCode() { return version; }
  
  public int compareTo(@NotNull KotlinVersion other) { Intrinsics.checkParameterIsNotNull(other, "other");return version - version;
  }
  



  public final boolean isAtLeast(int major, int minor)
  {
    return (this.major > major) || ((this.major == major) && (this.minor >= minor));
  }
  




  public final boolean isAtLeast(int major, int minor, int patch)
  {
    return (this.major > major) || ((this.major == major) && ((this.minor > minor) || ((this.minor == minor) && (this.patch >= patch))));
  }
  










  public static final Companion Companion = new Companion(null); @JvmField
  @NotNull
  public static final KotlinVersion CURRENT = new KotlinVersion(1, 3, 21);
  public static final int MAX_COMPONENT_VALUE = 255;
  private final int patch;
  private final int minor;
  private final int major;
  private final int version;
  
  /* Error */
  private final int versionOf(int major, int minor, int patch)
  {
    // Byte code:
    //   0: sipush 255
    //   3: iconst_0
    //   4: iload_1
    //   5: istore 4
    //   7: iload 4
    //   9: if_icmple +7 -> 16
    //   12: pop
    //   13: goto +54 -> 67
    //   16: iload 4
    //   18: if_icmplt +49 -> 67
    //   21: sipush 255
    //   24: iconst_0
    //   25: iload_2
    //   26: istore 4
    //   28: iload 4
    //   30: if_icmple +7 -> 37
    //   33: pop
    //   34: goto +33 -> 67
    //   37: iload 4
    //   39: if_icmplt +28 -> 67
    //   42: sipush 255
    //   45: iconst_0
    //   46: iload_3
    //   47: istore 4
    //   49: iload 4
    //   51: if_icmple +7 -> 58
    //   54: pop
    //   55: goto +12 -> 67
    //   58: iload 4
    //   60: if_icmplt +7 -> 67
    //   63: iconst_1
    //   64: goto +4 -> 68
    //   67: iconst_0
    //   68: istore 4
    //   70: iload 4
    //   72: ifne +58 -> 130
    //   75: new 15	java/lang/StringBuilder
    //   78: dup
    //   79: invokespecial 19	java/lang/StringBuilder:<init>	()V
    //   82: ldc 21
    //   84: invokevirtual 25	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: iload_1
    //   88: invokevirtual 28	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   91: bipush 46
    //   93: invokevirtual 31	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   96: iload_2
    //   97: invokevirtual 28	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   100: bipush 46
    //   102: invokevirtual 31	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   105: iload_3
    //   106: invokevirtual 28	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   109: invokevirtual 35	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   112: astore 6
    //   114: new 37	java/lang/IllegalArgumentException
    //   117: dup
    //   118: aload 6
    //   120: invokevirtual 38	java/lang/Object:toString	()Ljava/lang/String;
    //   123: invokespecial 41	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   126: checkcast 43	java/lang/Throwable
    //   129: athrow
    //   130: iload_1
    //   131: bipush 16
    //   133: ishl
    //   134: iload_2
    //   135: bipush 8
    //   137: ishl
    //   138: iadd
    //   139: iload_3
    //   140: iadd
    //   141: ireturn
    // Line number table:
    //   Java source line #26	-> byte code offset #0
    //   Java source line #27	-> byte code offset #75
    //   Java source line #26	-> byte code offset #112
    //   Java source line #29	-> byte code offset #130
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	this	KotlinVersion
    //   0	142	1	major	int
    //   0	142	2	minor	int
    //   0	142	3	patch	int
    //   75	37	5	$i$a$1$require	int
  }
  
  /* Error */
  public boolean equals(@org.jetbrains.annotations.Nullable Object other)
  {
    // Byte code:
    //   0: aload_0
    //   1: checkcast 2	kotlin/KotlinVersion
    //   4: aload_1
    //   5: if_acmpne +5 -> 10
    //   8: iconst_1
    //   9: ireturn
    //   10: aload_1
    //   11: dup
    //   12: instanceof 2
    //   15: ifne +5 -> 20
    //   18: pop
    //   19: aconst_null
    //   20: checkcast 2	kotlin/KotlinVersion
    //   23: dup
    //   24: ifnull +6 -> 30
    //   27: goto +6 -> 33
    //   30: pop
    //   31: iconst_0
    //   32: ireturn
    //   33: astore_2
    //   34: aload_0
    //   35: getfield 61	kotlin/KotlinVersion:version	I
    //   38: aload_2
    //   39: getfield 61	kotlin/KotlinVersion:version	I
    //   42: if_icmpne +7 -> 49
    //   45: iconst_1
    //   46: goto +4 -> 50
    //   49: iconst_0
    //   50: ireturn
    // Line number table:
    //   Java source line #38	-> byte code offset #0
    //   Java source line #39	-> byte code offset #10
    //   Java source line #40	-> byte code offset #34
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	51	0	this	KotlinVersion
    //   0	51	1	other	Object
    //   34	17	2	otherVersion	KotlinVersion
  }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\020\020\003\032\0020\0048\006X\004¢\006\002\n\000R\016\020\005\032\0020\006XT¢\006\002\n\000¨\006\007"}, d2={"Lkotlin/KotlinVersion$Companion;", "", "()V", "CURRENT", "Lkotlin/KotlinVersion;", "MAX_COMPONENT_VALUE", "", "kotlin-stdlib"})
  public static final class Companion
  {
    private Companion() {}
  }
}

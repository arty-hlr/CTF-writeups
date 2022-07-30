package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\020\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\020\020\003\032\0020\0048\006X\004¢\006\002\n\000R\020\020\005\032\0020\0048\006X\004¢\006\002\n\000R\020\020\006\032\0020\0048\006X\004¢\006\002\n\000R\020\020\007\032\0020\0048\006X\004¢\006\002\n\000R\020\020\b\032\0020\0048\006X\004¢\006\002\n\000R\021\020\t\032\0020\0048G¢\006\006\032\004\b\n\020\013R\021\020\f\032\0020\0048G¢\006\006\032\004\b\r\020\013R\021\020\016\032\0020\0048G¢\006\006\032\004\b\017\020\013R\020\020\020\032\0020\0048\006X\004¢\006\002\n\000R\020\020\021\032\004\030\0010\004X\016¢\006\002\n\000R\020\020\022\032\004\030\0010\004X\016¢\006\002\n\000R\020\020\023\032\004\030\0010\004X\016¢\006\002\n\000¨\006\024"}, d2={"Lkotlin/text/Charsets;", "", "()V", "ISO_8859_1", "Ljava/nio/charset/Charset;", "US_ASCII", "UTF_16", "UTF_16BE", "UTF_16LE", "UTF_32", "UTF32", "()Ljava/nio/charset/Charset;", "UTF_32BE", "UTF32_BE", "UTF_32LE", "UTF32_LE", "UTF_8", "utf_32", "utf_32be", "utf_32le", "kotlin-stdlib"})
public final class Charsets
{
  @JvmField
  @NotNull
  public static final Charset UTF_8;
  @JvmField
  @NotNull
  public static final Charset UTF_16;
  @JvmField
  @NotNull
  public static final Charset UTF_16BE;
  @JvmField
  @NotNull
  public static final Charset UTF_16LE;
  @JvmField
  @NotNull
  public static final Charset US_ASCII;
  
  /* Error */
  @kotlin.jvm.JvmName(name="UTF32")
  @NotNull
  public final Charset UTF32()
  {
    // Byte code:
    //   0: getstatic 20	kotlin/text/Charsets:utf_32	Ljava/nio/charset/Charset;
    //   3: dup
    //   4: ifnull +6 -> 10
    //   7: goto +30 -> 37
    //   10: pop
    //   11: aload_0
    //   12: astore_1
    //   13: aload_1
    //   14: checkcast 2	kotlin/text/Charsets
    //   17: astore_2
    //   18: ldc 22
    //   20: invokestatic 28	java/nio/charset/Charset:forName	(Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   23: dup
    //   24: ldc 30
    //   26: invokestatic 36	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   29: astore_3
    //   30: aload_3
    //   31: putstatic 20	kotlin/text/Charsets:utf_32	Ljava/nio/charset/Charset;
    //   34: aload_3
    //   35: nop
    //   36: nop
    //   37: areturn
    // Line number table:
    //   Java source line #68	-> byte code offset #0
    //   Java source line #69	-> byte code offset #18
    //   Java source line #70	-> byte code offset #30
    //   Java source line #71	-> byte code offset #34
    //   Java source line #68	-> byte code offset #36
    //   Java source line #72	-> byte code offset #37
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	this	Charsets
    //   18	18	2	$receiver	Charsets
    //   30	5	3	charset	Charset
    //   18	18	4	$i$a$1$run	int
  }
  
  /* Error */
  @kotlin.jvm.JvmName(name="UTF32_LE")
  @NotNull
  public final Charset UTF32_LE()
  {
    // Byte code:
    //   0: getstatic 46	kotlin/text/Charsets:utf_32le	Ljava/nio/charset/Charset;
    //   3: dup
    //   4: ifnull +6 -> 10
    //   7: goto +30 -> 37
    //   10: pop
    //   11: aload_0
    //   12: astore_1
    //   13: aload_1
    //   14: checkcast 2	kotlin/text/Charsets
    //   17: astore_2
    //   18: ldc 48
    //   20: invokestatic 28	java/nio/charset/Charset:forName	(Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   23: dup
    //   24: ldc 50
    //   26: invokestatic 36	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   29: astore_3
    //   30: aload_3
    //   31: putstatic 46	kotlin/text/Charsets:utf_32le	Ljava/nio/charset/Charset;
    //   34: aload_3
    //   35: nop
    //   36: nop
    //   37: areturn
    // Line number table:
    //   Java source line #80	-> byte code offset #0
    //   Java source line #81	-> byte code offset #18
    //   Java source line #82	-> byte code offset #30
    //   Java source line #83	-> byte code offset #34
    //   Java source line #80	-> byte code offset #36
    //   Java source line #84	-> byte code offset #37
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	this	Charsets
    //   18	18	2	$receiver	Charsets
    //   30	5	3	charset	Charset
    //   18	18	4	$i$a$1$run	int
  }
  
  /* Error */
  @kotlin.jvm.JvmName(name="UTF32_BE")
  @NotNull
  public final Charset UTF32_BE()
  {
    // Byte code:
    //   0: getstatic 54	kotlin/text/Charsets:utf_32be	Ljava/nio/charset/Charset;
    //   3: dup
    //   4: ifnull +6 -> 10
    //   7: goto +30 -> 37
    //   10: pop
    //   11: aload_0
    //   12: astore_1
    //   13: aload_1
    //   14: checkcast 2	kotlin/text/Charsets
    //   17: astore_2
    //   18: ldc 56
    //   20: invokestatic 28	java/nio/charset/Charset:forName	(Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   23: dup
    //   24: ldc 58
    //   26: invokestatic 36	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   29: astore_3
    //   30: aload_3
    //   31: putstatic 54	kotlin/text/Charsets:utf_32be	Ljava/nio/charset/Charset;
    //   34: aload_3
    //   35: nop
    //   36: nop
    //   37: areturn
    // Line number table:
    //   Java source line #92	-> byte code offset #0
    //   Java source line #93	-> byte code offset #18
    //   Java source line #94	-> byte code offset #30
    //   Java source line #95	-> byte code offset #34
    //   Java source line #92	-> byte code offset #36
    //   Java source line #96	-> byte code offset #37
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	this	Charsets
    //   18	18	2	$receiver	Charsets
    //   30	5	3	charset	Charset
    //   18	18	4	$i$a$1$run	int
  }
  
  private Charsets() {}
  
  static
  {
    Charsets localCharsets = new Charsets();INSTANCE = localCharsets; Charset 
    



      tmp17_14 = Charset.forName("UTF-8");Intrinsics.checkExpressionValueIsNotNull(tmp17_14, "Charset.forName(\"UTF-8\")");UTF_8 = tmp17_14; Charset 
    





      tmp31_28 = Charset.forName("UTF-16");Intrinsics.checkExpressionValueIsNotNull(tmp31_28, "Charset.forName(\"UTF-16\")");UTF_16 = tmp31_28; Charset 
    




      tmp45_42 = Charset.forName("UTF-16BE");Intrinsics.checkExpressionValueIsNotNull(tmp45_42, "Charset.forName(\"UTF-16BE\")");UTF_16BE = tmp45_42; Charset 
    




      tmp59_56 = Charset.forName("UTF-16LE");Intrinsics.checkExpressionValueIsNotNull(tmp59_56, "Charset.forName(\"UTF-16LE\")");UTF_16LE = tmp59_56; Charset 
    





      tmp73_70 = Charset.forName("US-ASCII");Intrinsics.checkExpressionValueIsNotNull(tmp73_70, "Charset.forName(\"US-ASCII\")");US_ASCII = tmp73_70; Charset 
    




      tmp87_84 = Charset.forName("ISO-8859-1");Intrinsics.checkExpressionValueIsNotNull(tmp87_84, "Charset.forName(\"ISO-8859-1\")"); } @JvmField
  @NotNull
  public static final Charset ISO_8859_1 = tmp87_84;
  private static Charset utf_32;
  private static Charset utf_32le;
  private static Charset utf_32be;
  public static final Charsets INSTANCE;
}

package kotlin.text;

import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;


@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000&\n\000\n\002\030\002\n\002\020\f\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\004\n\002\020\013\n\002\b\021\032\020\020\t\032\0020\n2\006\020\013\032\0020\nH\001\032\030\020\f\032\0020\n2\006\020\r\032\0020\0022\006\020\013\032\0020\nH\000\032\r\020\016\032\0020\017*\0020\002H\b\032\r\020\020\032\0020\017*\0020\002H\b\032\r\020\021\032\0020\017*\0020\002H\b\032\r\020\022\032\0020\017*\0020\002H\b\032\r\020\023\032\0020\017*\0020\002H\b\032\r\020\024\032\0020\017*\0020\002H\b\032\r\020\025\032\0020\017*\0020\002H\b\032\r\020\026\032\0020\017*\0020\002H\b\032\r\020\027\032\0020\017*\0020\002H\b\032\r\020\030\032\0020\017*\0020\002H\b\032\r\020\031\032\0020\017*\0020\002H\b\032\r\020\032\032\0020\017*\0020\002H\b\032\r\020\033\032\0020\017*\0020\002H\b\032\n\020\034\032\0020\017*\0020\002\032\r\020\035\032\0020\002*\0020\002H\b\032\r\020\036\032\0020\002*\0020\002H\b\032\r\020\037\032\0020\002*\0020\002H\b\"\025\020\000\032\0020\001*\0020\0028F¢\006\006\032\004\b\003\020\004\"\025\020\005\032\0020\006*\0020\0028F¢\006\006\032\004\b\007\020\b¨\006 "}, d2={"category", "Lkotlin/text/CharCategory;", "", "getCategory", "(C)Lkotlin/text/CharCategory;", "directionality", "Lkotlin/text/CharDirectionality;", "getDirectionality", "(C)Lkotlin/text/CharDirectionality;", "checkRadix", "", "radix", "digitOf", "char", "isDefined", "", "isDigit", "isHighSurrogate", "isISOControl", "isIdentifierIgnorable", "isJavaIdentifierPart", "isJavaIdentifierStart", "isLetter", "isLetterOrDigit", "isLowSurrogate", "isLowerCase", "isTitleCase", "isUpperCase", "isWhitespace", "toLowerCase", "toTitleCase", "toUpperCase", "kotlin-stdlib"}, xs="kotlin/text/CharsKt")
class CharsKt__CharJVMKt
{
  @InlineOnly
  private static final boolean isDefined(char $receiver)
  {
    ;
    return Character.isDefined($receiver);
  }
  
  @InlineOnly
  private static final boolean isLetter(char $receiver)
  {
    ;
    return Character.isLetter($receiver);
  }
  
  @InlineOnly
  private static final boolean isLetterOrDigit(char $receiver)
  {
    ;
    return Character.isLetterOrDigit($receiver);
  }
  
  @InlineOnly
  private static final boolean isDigit(char $receiver)
  {
    ;
    return Character.isDigit($receiver);
  }
  

  @InlineOnly
  private static final boolean isIdentifierIgnorable(char $receiver)
  {
    ;
    return Character.isIdentifierIgnorable($receiver);
  }
  
  @InlineOnly
  private static final boolean isISOControl(char $receiver)
  {
    ;
    return Character.isISOControl($receiver);
  }
  
  @InlineOnly
  private static final boolean isJavaIdentifierPart(char $receiver)
  {
    ;
    return Character.isJavaIdentifierPart($receiver);
  }
  
  @InlineOnly
  private static final boolean isJavaIdentifierStart(char $receiver)
  {
    ;
    return Character.isJavaIdentifierStart($receiver);
  }
  


  public static final boolean isWhitespace(char $receiver)
  {
    return (Character.isWhitespace($receiver)) || (Character.isSpaceChar($receiver));
  }
  
  @InlineOnly
  private static final boolean isUpperCase(char $receiver)
  {
    ;
    return Character.isUpperCase($receiver);
  }
  
  @InlineOnly
  private static final boolean isLowerCase(char $receiver)
  {
    ;
    return Character.isLowerCase($receiver);
  }
  
  @InlineOnly
  private static final char toUpperCase(char $receiver)
  {
    ;
    return Character.toUpperCase($receiver);
  }
  
  @InlineOnly
  private static final char toLowerCase(char $receiver)
  {
    ;
    return Character.toLowerCase($receiver);
  }
  
  @InlineOnly
  private static final boolean isTitleCase(char $receiver)
  {
    ;
    return Character.isTitleCase($receiver);
  }
  

  @InlineOnly
  private static final char toTitleCase(char $receiver)
  {
    ;
    
    return Character.toTitleCase($receiver);
  }
  
  @NotNull
  public static final CharCategory getCategory(char $receiver) {
    return CharCategory.Companion.valueOf(Character.getType($receiver));
  }
  
  @NotNull
  public static final CharDirectionality getDirectionality(char $receiver) {
    return CharDirectionality.Companion.valueOf(Character.getDirectionality($receiver));
  }
  
  @InlineOnly
  private static final boolean isHighSurrogate(char $receiver) {
    ;
    return Character.isHighSurrogate($receiver);
  }
  
  @InlineOnly
  private static final boolean isLowSurrogate(char $receiver) {
    ;
    return Character.isLowSurrogate($receiver);
  }
  





  public static final int digitOf(char char, int radix)
  {
    return Character.digit(char, radix);
  }
  
  /* Error */
  @kotlin.PublishedApi
  public static final int checkRadix(int radix)
  {
    // Byte code:
    //   0: bipush 36
    //   2: iconst_2
    //   3: iload_0
    //   4: istore_1
    //   5: iload_1
    //   6: if_icmpgt +10 -> 16
    //   9: iload_1
    //   10: if_icmpge +57 -> 67
    //   13: goto +4 -> 17
    //   16: pop
    //   17: new 129	java/lang/IllegalArgumentException
    //   20: dup
    //   21: new 131	java/lang/StringBuilder
    //   24: dup
    //   25: invokespecial 135	java/lang/StringBuilder:<init>	()V
    //   28: ldc -119
    //   30: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: iload_0
    //   34: invokevirtual 144	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   37: ldc -110
    //   39: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: iconst_2
    //   43: istore_1
    //   44: new 148	kotlin/ranges/IntRange
    //   47: dup
    //   48: iload_1
    //   49: bipush 36
    //   51: invokespecial 151	kotlin/ranges/IntRange:<init>	(II)V
    //   54: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   57: invokevirtual 158	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   60: invokespecial 161	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   63: checkcast 163	java/lang/Throwable
    //   66: athrow
    //   67: iload_0
    //   68: ireturn
    // Line number table:
    //   Java source line #155	-> byte code offset #0
    //   Java source line #156	-> byte code offset #17
    //   Java source line #158	-> byte code offset #67
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	69	0	radix	int
  }
  
  public CharsKt__CharJVMKt() {}
}

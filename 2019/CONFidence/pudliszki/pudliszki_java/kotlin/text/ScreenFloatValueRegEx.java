package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
































































































































































































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\bÂ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\020\020\003\032\0020\0048\006X\004¢\006\002\n\000¨\006\005"}, d2={"Lkotlin/text/ScreenFloatValueRegEx;", "", "()V", "value", "Lkotlin/text/Regex;", "kotlin-stdlib"})
final class ScreenFloatValueRegEx
{
  @JvmField
  @NotNull
  public static final Regex value;
  public static final ScreenFloatValueRegEx INSTANCE;
  
  private ScreenFloatValueRegEx() {}
  
  static
  {
    ScreenFloatValueRegEx localScreenFloatValueRegEx1 = new ScreenFloatValueRegEx();INSTANCE = localScreenFloatValueRegEx1;
    ScreenFloatValueRegEx localScreenFloatValueRegEx2 = localScreenFloatValueRegEx1;ScreenFloatValueRegEx $receiver = localScreenFloatValueRegEx2;
    int $i$a$1$run; String Digits = "(\\p{Digit}+)";
    String HexDigits = "(\\p{XDigit}+)";
    String Exp = "[eE][+-]?" + Digits;
    
    String HexString = "(0[xX]" + HexDigits + "(\\.)?)|" + "(0[xX]" + 
      HexDigits + "?(\\.)" + HexDigits + ')';
    
    String Number = '(' + Digits + "(\\.)?(" + Digits + "?)(" + Exp + ")?)|" + "(\\.(" + 
      Digits + ")(" + Exp + ")?)|" + "((" + 
      HexString + ")[pP][+-]?" + Digits + ')';
    
    String fpRegex = "[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + Number + ")[fFdD]?))[\\x00-\\x20]*";value = 
    
      new Regex(fpRegex);
  }
}

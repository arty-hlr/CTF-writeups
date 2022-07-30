package kotlin.text;

import kotlin.Metadata;
















@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\026\n\002\030\002\n\002\020\020\n\002\030\002\n\000\n\002\020\b\n\002\b\r\b\001\030\0002\b\022\004\022\0020\0000\0012\0020\002B\031\b\002\022\006\020\003\032\0020\004\022\b\b\002\020\005\032\0020\004¢\006\002\020\006R\024\020\005\032\0020\004X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\t\020\bj\002\b\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017j\002\b\020¨\006\021"}, d2={"Lkotlin/text/RegexOption;", "", "Lkotlin/text/FlagEnum;", "value", "", "mask", "(Ljava/lang/String;III)V", "getMask", "()I", "getValue", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ", "kotlin-stdlib"})
public enum RegexOption
  implements FlagEnum
{
  private final int value;
  private final int mask;
  
  private RegexOption(int value, int mask)
  {
    this.value = value;this.mask = mask; } public int getMask() { return mask; } public int getValue() { return value; }
  
  static
  {
    RegexOption[] tmp6_2 = new RegexOption[7]; void tmp22_19 = new RegexOption("IGNORE_CASE", 0, 2, 0, 2, null);IGNORE_CASE = tmp22_19;tmp6_2[0] = tmp22_19; RegexOption[] tmp27_6 = tmp6_2; void 
    




      tmp44_41 = new RegexOption("MULTILINE", 1, 8, 0, 2, null);MULTILINE = tmp44_41;tmp27_6[1] = tmp44_41; RegexOption[] tmp49_27 = tmp27_6; void 
    






      tmp66_63 = new RegexOption("LITERAL", 2, 16, 0, 2, null);LITERAL = tmp66_63;tmp49_27[2] = tmp66_63; RegexOption[] tmp71_49 = tmp49_27; void 
    





      tmp87_84 = new RegexOption("UNIX_LINES", 3, 1, 0, 2, null);UNIX_LINES = tmp87_84;tmp71_49[3] = tmp87_84; RegexOption[] tmp92_71 = tmp71_49; void 
    

      tmp108_105 = new RegexOption("COMMENTS", 4, 4, 0, 2, null);COMMENTS = tmp108_105;tmp92_71[4] = tmp108_105; RegexOption[] tmp113_92 = tmp92_71; void 
    

      tmp130_127 = new RegexOption("DOT_MATCHES_ALL", 5, 32, 0, 2, null);DOT_MATCHES_ALL = tmp130_127;tmp113_92[5] = tmp130_127; RegexOption[] tmp135_113 = tmp113_92; void 
    

      tmp155_152 = new RegexOption("CANON_EQ", 6, 128, 0, 2, null);CANON_EQ = tmp155_152;tmp135_113[6] = tmp155_152;
  }
}

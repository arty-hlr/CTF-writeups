package kotlin.text;

import kotlin.Lazy;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000&\n\002\030\002\n\002\020\020\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\006\n\002\020\013\n\000\n\002\020\f\n\002\b \b\001\030\000 -2\b\022\004\022\0020\0000\001:\001-B\027\b\002\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\021\020\013\032\0020\f2\006\020\r\032\0020\016H\002R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nj\002\b\017j\002\b\020j\002\b\021j\002\b\022j\002\b\023j\002\b\024j\002\b\025j\002\b\026j\002\b\027j\002\b\030j\002\b\031j\002\b\032j\002\b\033j\002\b\034j\002\b\035j\002\b\036j\002\b\037j\002\b j\002\b!j\002\b\"j\002\b#j\002\b$j\002\b%j\002\b&j\002\b'j\002\b(j\002\b)j\002\b*j\002\b+j\002\b,¨\006."}, d2={"Lkotlin/text/CharCategory;", "", "value", "", "code", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getValue", "()I", "contains", "", "char", "", "UNASSIGNED", "UPPERCASE_LETTER", "LOWERCASE_LETTER", "TITLECASE_LETTER", "MODIFIER_LETTER", "OTHER_LETTER", "NON_SPACING_MARK", "ENCLOSING_MARK", "COMBINING_SPACING_MARK", "DECIMAL_DIGIT_NUMBER", "LETTER_NUMBER", "OTHER_NUMBER", "SPACE_SEPARATOR", "LINE_SEPARATOR", "PARAGRAPH_SEPARATOR", "CONTROL", "FORMAT", "PRIVATE_USE", "SURROGATE", "DASH_PUNCTUATION", "START_PUNCTUATION", "END_PUNCTUATION", "CONNECTOR_PUNCTUATION", "OTHER_PUNCTUATION", "MATH_SYMBOL", "CURRENCY_SYMBOL", "MODIFIER_SYMBOL", "OTHER_SYMBOL", "INITIAL_QUOTE_PUNCTUATION", "FINAL_QUOTE_PUNCTUATION", "Companion", "kotlin-stdlib"})
public enum CharCategory {
  private final int value;
  @org.jetbrains.annotations.NotNull
  private final String code;
  
  public final int getValue() { return value; } @org.jetbrains.annotations.NotNull
  public final String getCode() { return code; } private CharCategory(int value, String code) { this.value = value;this.code = code;
  }
  
  static {
    CharCategory[] tmp6_2 = new CharCategory[30]; void tmp21_18 = new CharCategory("UNASSIGNED", 0, 0, "Cn");UNASSIGNED = tmp21_18;tmp6_2[0] = tmp21_18; CharCategory[] tmp26_6 = tmp6_2; void 
    



      tmp41_38 = new CharCategory("UPPERCASE_LETTER", 1, 1, "Lu");UPPERCASE_LETTER = tmp41_38;tmp26_6[1] = tmp41_38; CharCategory[] tmp46_26 = tmp26_6; void 
    



      tmp61_58 = new CharCategory("LOWERCASE_LETTER", 2, 2, "Ll");LOWERCASE_LETTER = tmp61_58;tmp46_26[2] = tmp61_58; CharCategory[] tmp66_46 = tmp46_26; void 
    



      tmp81_78 = new CharCategory("TITLECASE_LETTER", 3, 3, "Lt");TITLECASE_LETTER = tmp81_78;tmp66_46[3] = tmp81_78; CharCategory[] tmp86_66 = tmp66_46; void 
    



      tmp101_98 = new CharCategory("MODIFIER_LETTER", 4, 4, "Lm");MODIFIER_LETTER = tmp101_98;tmp86_66[4] = tmp101_98; CharCategory[] tmp106_86 = tmp86_66; void 
    



      tmp121_118 = new CharCategory("OTHER_LETTER", 5, 5, "Lo");OTHER_LETTER = tmp121_118;tmp106_86[5] = tmp121_118; CharCategory[] tmp126_106 = tmp106_86; void 
    



      tmp144_141 = new CharCategory("NON_SPACING_MARK", 6, 6, "Mn");NON_SPACING_MARK = tmp144_141;tmp126_106[6] = tmp144_141; CharCategory[] tmp149_126 = tmp126_106; void 
    



      tmp167_164 = new CharCategory("ENCLOSING_MARK", 7, 7, "Me");ENCLOSING_MARK = tmp167_164;tmp149_126[7] = tmp167_164; CharCategory[] tmp172_149 = tmp149_126; void 
    



      tmp190_187 = new CharCategory("COMBINING_SPACING_MARK", 8, 8, "Mc");COMBINING_SPACING_MARK = tmp190_187;tmp172_149[8] = tmp190_187; CharCategory[] tmp195_172 = tmp172_149; void 
    



      tmp213_210 = new CharCategory("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");DECIMAL_DIGIT_NUMBER = tmp213_210;tmp195_172[9] = tmp213_210; CharCategory[] tmp218_195 = tmp195_172; void 
    



      tmp236_233 = new CharCategory("LETTER_NUMBER", 10, 10, "Nl");LETTER_NUMBER = tmp236_233;tmp218_195[10] = tmp236_233; CharCategory[] tmp241_218 = tmp218_195; void 
    



      tmp259_256 = new CharCategory("OTHER_NUMBER", 11, 11, "No");OTHER_NUMBER = tmp259_256;tmp241_218[11] = tmp259_256; CharCategory[] tmp264_241 = tmp241_218; void 
    



      tmp282_279 = new CharCategory("SPACE_SEPARATOR", 12, 12, "Zs");SPACE_SEPARATOR = tmp282_279;tmp264_241[12] = tmp282_279; CharCategory[] tmp287_264 = tmp264_241; void 
    



      tmp305_302 = new CharCategory("LINE_SEPARATOR", 13, 13, "Zl");LINE_SEPARATOR = tmp305_302;tmp287_264[13] = tmp305_302; CharCategory[] tmp310_287 = tmp287_264; void 
    



      tmp328_325 = new CharCategory("PARAGRAPH_SEPARATOR", 14, 14, "Zp");PARAGRAPH_SEPARATOR = tmp328_325;tmp310_287[14] = tmp328_325; CharCategory[] tmp333_310 = tmp310_287; void 
    



      tmp351_348 = new CharCategory("CONTROL", 15, 15, "Cc");CONTROL = tmp351_348;tmp333_310[15] = tmp351_348; CharCategory[] tmp356_333 = tmp333_310; void 
    



      tmp374_371 = new CharCategory("FORMAT", 16, 16, "Cf");FORMAT = tmp374_371;tmp356_333[16] = tmp374_371; CharCategory[] tmp379_356 = tmp356_333; void 
    



      tmp397_394 = new CharCategory("PRIVATE_USE", 17, 18, "Co");PRIVATE_USE = tmp397_394;tmp379_356[17] = tmp397_394; CharCategory[] tmp402_379 = tmp379_356; void 
    



      tmp420_417 = new CharCategory("SURROGATE", 18, 19, "Cs");SURROGATE = tmp420_417;tmp402_379[18] = tmp420_417; CharCategory[] tmp425_402 = tmp402_379; void 
    



      tmp443_440 = new CharCategory("DASH_PUNCTUATION", 19, 20, "Pd");DASH_PUNCTUATION = tmp443_440;tmp425_402[19] = tmp443_440; CharCategory[] tmp448_425 = tmp425_402; void 
    



      tmp466_463 = new CharCategory("START_PUNCTUATION", 20, 21, "Ps");START_PUNCTUATION = tmp466_463;tmp448_425[20] = tmp466_463; CharCategory[] tmp471_448 = tmp448_425; void 
    



      tmp489_486 = new CharCategory("END_PUNCTUATION", 21, 22, "Pe");END_PUNCTUATION = tmp489_486;tmp471_448[21] = tmp489_486; CharCategory[] tmp494_471 = tmp471_448; void 
    



      tmp512_509 = new CharCategory("CONNECTOR_PUNCTUATION", 22, 23, "Pc");CONNECTOR_PUNCTUATION = tmp512_509;tmp494_471[22] = tmp512_509; CharCategory[] tmp517_494 = tmp494_471; void 
    



      tmp535_532 = new CharCategory("OTHER_PUNCTUATION", 23, 24, "Po");OTHER_PUNCTUATION = tmp535_532;tmp517_494[23] = tmp535_532; CharCategory[] tmp540_517 = tmp517_494; void 
    



      tmp558_555 = new CharCategory("MATH_SYMBOL", 24, 25, "Sm");MATH_SYMBOL = tmp558_555;tmp540_517[24] = tmp558_555; CharCategory[] tmp563_540 = tmp540_517; void 
    



      tmp581_578 = new CharCategory("CURRENCY_SYMBOL", 25, 26, "Sc");CURRENCY_SYMBOL = tmp581_578;tmp563_540[25] = tmp581_578; CharCategory[] tmp586_563 = tmp563_540; void 
    



      tmp604_601 = new CharCategory("MODIFIER_SYMBOL", 26, 27, "Sk");MODIFIER_SYMBOL = tmp604_601;tmp586_563[26] = tmp604_601; CharCategory[] tmp609_586 = tmp586_563; void 
    



      tmp627_624 = new CharCategory("OTHER_SYMBOL", 27, 28, "So");OTHER_SYMBOL = tmp627_624;tmp609_586[27] = tmp627_624; CharCategory[] tmp632_609 = tmp609_586; void 
    



      tmp650_647 = new CharCategory("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");INITIAL_QUOTE_PUNCTUATION = tmp650_647;tmp632_609[28] = tmp650_647; CharCategory[] tmp655_632 = tmp632_609; void 
    



      tmp674_671 = new CharCategory("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");FINAL_QUOTE_PUNCTUATION = tmp674_671;tmp655_632[29] = tmp674_671;$VALUES = tmp655_632;Companion = new Companion(null);
  }
  
  public final boolean contains(char char)
  {
    return Character.getType(char) == value;
  }
  

  private static final Lazy categoryMap$delegate = kotlin.LazyKt.lazy((kotlin.jvm.functions.Function0)CharCategory.Companion.categoryMap.2.INSTANCE);
  public static final Companion Companion;
  
  @kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020$\n\002\020\b\n\002\030\002\n\002\b\007\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\013\032\0020\0062\006\020\f\032\0020\005R'\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\0048BX\002¢\006\f\n\004\b\t\020\n\032\004\b\007\020\b¨\006\r"}, d2={"Lkotlin/text/CharCategory$Companion;", "", "()V", "categoryMap", "", "", "Lkotlin/text/CharCategory;", "getCategoryMap", "()Ljava/util/Map;", "categoryMap$delegate", "Lkotlin/Lazy;", "valueOf", "category", "kotlin-stdlib"})
  public static final class Companion
  {
    private final java.util.Map<Integer, CharCategory> getCategoryMap()
    {
      Lazy localLazy = CharCategory.access$getCategoryMap$cp();
      Companion localCompanion = CharCategory.Companion;
      kotlin.reflect.KProperty localKProperty = $$delegatedProperties[0];
      return (java.util.Map)localLazy.getValue();
    }
    
    /* Error */
    @org.jetbrains.annotations.NotNull
    public final CharCategory valueOf(int category)
    {
      // Byte code:
      //   0: aload_0
      //   1: checkcast 2	kotlin/text/CharCategory$Companion
      //   4: invokespecial 36	kotlin/text/CharCategory$Companion:getCategoryMap	()Ljava/util/Map;
      //   7: iload_1
      //   8: invokestatic 41	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   11: invokeinterface 45 2 0
      //   16: checkcast 12	kotlin/text/CharCategory
      //   19: dup
      //   20: ifnull +6 -> 26
      //   23: goto +39 -> 62
      //   26: pop
      //   27: new 47	java/lang/IllegalArgumentException
      //   30: dup
      //   31: new 49	java/lang/StringBuilder
      //   34: dup
      //   35: invokespecial 52	java/lang/StringBuilder:<init>	()V
      //   38: ldc 54
      //   40: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   43: iload_1
      //   44: invokevirtual 61	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   47: ldc 63
      //   49: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   52: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   55: invokespecial 70	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
      //   58: checkcast 72	java/lang/Throwable
      //   61: athrow
      //   62: areturn
      // Line number table:
      //   Java source line #171	-> byte code offset #0
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	63	0	this	Companion
      //   0	63	1	category	int
    }
    
    private Companion() {}
  }
}

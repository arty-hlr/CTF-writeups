package kotlin.text;

import java.util.Map;
import kotlin.Lazy;



@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\b\n\002\b\031\b\001\030\000 \0332\b\022\004\022\0020\0000\001:\001\033B\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021j\002\b\022j\002\b\023j\002\b\024j\002\b\025j\002\b\026j\002\b\027j\002\b\030j\002\b\031j\002\b\032¨\006\034"}, d2={"Lkotlin/text/CharDirectionality;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNDEFINED", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "RIGHT_TO_LEFT_ARABIC", "EUROPEAN_NUMBER", "EUROPEAN_NUMBER_SEPARATOR", "EUROPEAN_NUMBER_TERMINATOR", "ARABIC_NUMBER", "COMMON_NUMBER_SEPARATOR", "NONSPACING_MARK", "BOUNDARY_NEUTRAL", "PARAGRAPH_SEPARATOR", "SEGMENT_SEPARATOR", "WHITESPACE", "OTHER_NEUTRALS", "LEFT_TO_RIGHT_EMBEDDING", "LEFT_TO_RIGHT_OVERRIDE", "RIGHT_TO_LEFT_EMBEDDING", "RIGHT_TO_LEFT_OVERRIDE", "POP_DIRECTIONAL_FORMAT", "Companion", "kotlin-stdlib"})
public enum CharDirectionality
{
  private final int value;
  
  private CharDirectionality(int value) { this.value = value; } public final int getValue() { return value; }
  


  static
  {
    CharDirectionality[] tmp6_2 = new CharDirectionality[20]; void tmp19_16 = new CharDirectionality("UNDEFINED", 0, -1);UNDEFINED = tmp19_16;tmp6_2[0] = tmp19_16; CharDirectionality[] tmp24_6 = tmp6_2; void 
    



      tmp37_34 = new CharDirectionality("LEFT_TO_RIGHT", 1, 0);LEFT_TO_RIGHT = tmp37_34;tmp24_6[1] = tmp37_34; CharDirectionality[] tmp42_24 = tmp24_6; void 
    



      tmp55_52 = new CharDirectionality("RIGHT_TO_LEFT", 2, 1);RIGHT_TO_LEFT = tmp55_52;tmp42_24[2] = tmp55_52; CharDirectionality[] tmp60_42 = tmp42_24; void 
    



      tmp73_70 = new CharDirectionality("RIGHT_TO_LEFT_ARABIC", 3, 2);RIGHT_TO_LEFT_ARABIC = tmp73_70;tmp60_42[3] = tmp73_70; CharDirectionality[] tmp78_60 = tmp60_42; void 
    



      tmp91_88 = new CharDirectionality("EUROPEAN_NUMBER", 4, 3);EUROPEAN_NUMBER = tmp91_88;tmp78_60[4] = tmp91_88; CharDirectionality[] tmp96_78 = tmp78_60; void 
    



      tmp109_106 = new CharDirectionality("EUROPEAN_NUMBER_SEPARATOR", 5, 4);EUROPEAN_NUMBER_SEPARATOR = tmp109_106;tmp96_78[5] = tmp109_106; CharDirectionality[] tmp114_96 = tmp96_78; void 
    



      tmp129_126 = new CharDirectionality("EUROPEAN_NUMBER_TERMINATOR", 6, 5);EUROPEAN_NUMBER_TERMINATOR = tmp129_126;tmp114_96[6] = tmp129_126; CharDirectionality[] tmp134_114 = tmp114_96; void 
    



      tmp150_147 = new CharDirectionality("ARABIC_NUMBER", 7, 6);ARABIC_NUMBER = tmp150_147;tmp134_114[7] = tmp150_147; CharDirectionality[] tmp155_134 = tmp134_114; void 
    



      tmp171_168 = new CharDirectionality("COMMON_NUMBER_SEPARATOR", 8, 7);COMMON_NUMBER_SEPARATOR = tmp171_168;tmp155_134[8] = tmp171_168; CharDirectionality[] tmp176_155 = tmp155_134; void 
    



      tmp192_189 = new CharDirectionality("NONSPACING_MARK", 9, 8);NONSPACING_MARK = tmp192_189;tmp176_155[9] = tmp192_189; CharDirectionality[] tmp197_176 = tmp176_155; void 
    



      tmp213_210 = new CharDirectionality("BOUNDARY_NEUTRAL", 10, 9);BOUNDARY_NEUTRAL = tmp213_210;tmp197_176[10] = tmp213_210; CharDirectionality[] tmp218_197 = tmp197_176; void 
    



      tmp234_231 = new CharDirectionality("PARAGRAPH_SEPARATOR", 11, 10);PARAGRAPH_SEPARATOR = tmp234_231;tmp218_197[11] = tmp234_231; CharDirectionality[] tmp239_218 = tmp218_197; void 
    



      tmp255_252 = new CharDirectionality("SEGMENT_SEPARATOR", 12, 11);SEGMENT_SEPARATOR = tmp255_252;tmp239_218[12] = tmp255_252; CharDirectionality[] tmp260_239 = tmp239_218; void 
    



      tmp276_273 = new CharDirectionality("WHITESPACE", 13, 12);WHITESPACE = tmp276_273;tmp260_239[13] = tmp276_273; CharDirectionality[] tmp281_260 = tmp260_239; void 
    



      tmp297_294 = new CharDirectionality("OTHER_NEUTRALS", 14, 13);OTHER_NEUTRALS = tmp297_294;tmp281_260[14] = tmp297_294; CharDirectionality[] tmp302_281 = tmp281_260; void 
    



      tmp318_315 = new CharDirectionality("LEFT_TO_RIGHT_EMBEDDING", 15, 14);LEFT_TO_RIGHT_EMBEDDING = tmp318_315;tmp302_281[15] = tmp318_315; CharDirectionality[] tmp323_302 = tmp302_281; void 
    



      tmp339_336 = new CharDirectionality("LEFT_TO_RIGHT_OVERRIDE", 16, 15);LEFT_TO_RIGHT_OVERRIDE = tmp339_336;tmp323_302[16] = tmp339_336; CharDirectionality[] tmp344_323 = tmp323_302; void 
    



      tmp360_357 = new CharDirectionality("RIGHT_TO_LEFT_EMBEDDING", 17, 16);RIGHT_TO_LEFT_EMBEDDING = tmp360_357;tmp344_323[17] = tmp360_357; CharDirectionality[] tmp365_344 = tmp344_323; void 
    



      tmp381_378 = new CharDirectionality("RIGHT_TO_LEFT_OVERRIDE", 18, 17);RIGHT_TO_LEFT_OVERRIDE = tmp381_378;tmp365_344[18] = tmp381_378; CharDirectionality[] tmp386_365 = tmp365_344; void 
    



      tmp402_399 = new CharDirectionality("POP_DIRECTIONAL_FORMAT", 19, 18);POP_DIRECTIONAL_FORMAT = tmp402_399;tmp386_365[19] = tmp402_399;$VALUES = tmp386_365;Companion = new Companion(null);
  }
  

  private static final Lazy directionalityMap$delegate = kotlin.LazyKt.lazy((kotlin.jvm.functions.Function0)CharDirectionality.Companion.directionalityMap.2.INSTANCE);
  public static final Companion Companion;
  
  @kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020$\n\002\020\b\n\002\030\002\n\002\b\007\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\013\032\0020\0062\006\020\f\032\0020\005R'\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\0048BX\002¢\006\f\n\004\b\t\020\n\032\004\b\007\020\b¨\006\r"}, d2={"Lkotlin/text/CharDirectionality$Companion;", "", "()V", "directionalityMap", "", "", "Lkotlin/text/CharDirectionality;", "getDirectionalityMap", "()Ljava/util/Map;", "directionalityMap$delegate", "Lkotlin/Lazy;", "valueOf", "directionality", "kotlin-stdlib"})
  public static final class Companion
  {
    private final Map<Integer, CharDirectionality> getDirectionalityMap()
    {
      Lazy localLazy = CharDirectionality.access$getDirectionalityMap$cp();
      Companion localCompanion = CharDirectionality.Companion;
      kotlin.reflect.KProperty localKProperty = $$delegatedProperties[0];
      return (Map)localLazy.getValue();
    }
    
    /* Error */
    @org.jetbrains.annotations.NotNull
    public final CharDirectionality valueOf(int directionality)
    {
      // Byte code:
      //   0: aload_0
      //   1: checkcast 2	kotlin/text/CharDirectionality$Companion
      //   4: invokespecial 36	kotlin/text/CharDirectionality$Companion:getDirectionalityMap	()Ljava/util/Map;
      //   7: iload_1
      //   8: invokestatic 41	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   11: invokeinterface 45 2 0
      //   16: checkcast 12	kotlin/text/CharDirectionality
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
      //   Java source line #120	-> byte code offset #0
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	63	0	this	Companion
      //   0	63	1	directionality	int
    }
    
    private Companion() {}
  }
}

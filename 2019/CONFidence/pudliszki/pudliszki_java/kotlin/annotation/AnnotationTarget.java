package kotlin.annotation;

import kotlin.Metadata;
import kotlin.SinceKotlin;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\f\n\002\030\002\n\002\020\020\n\002\b\021\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021¨\006\022"}, d2={"Lkotlin/annotation/AnnotationTarget;", "", "(Ljava/lang/String;I)V", "CLASS", "ANNOTATION_CLASS", "TYPE_PARAMETER", "PROPERTY", "FIELD", "LOCAL_VARIABLE", "VALUE_PARAMETER", "CONSTRUCTOR", "FUNCTION", "PROPERTY_GETTER", "PROPERTY_SETTER", "TYPE", "EXPRESSION", "FILE", "TYPEALIAS", "kotlin-stdlib"})
public enum AnnotationTarget
{
  static
  {
    AnnotationTarget[] tmp6_2 = new AnnotationTarget[15];
    void tmp18_15 = new AnnotationTarget("CLASS", 0);
    CLASS = tmp18_15;
    tmp6_2[0] = tmp18_15;
    AnnotationTarget[] tmp23_6 = tmp6_2;
    void tmp35_32 = new AnnotationTarget("ANNOTATION_CLASS", 1);
    ANNOTATION_CLASS = tmp35_32;
    tmp23_6[1] = tmp35_32;
    AnnotationTarget[] tmp40_23 = tmp23_6;
    void tmp52_49 = new AnnotationTarget("TYPE_PARAMETER", 2);
    TYPE_PARAMETER = tmp52_49;
    tmp40_23[2] = tmp52_49;
    AnnotationTarget[] tmp57_40 = tmp40_23;
    void tmp69_66 = new AnnotationTarget("PROPERTY", 3);
    PROPERTY = tmp69_66;
    tmp57_40[3] = tmp69_66;
    AnnotationTarget[] tmp74_57 = tmp57_40;
    void tmp86_83 = new AnnotationTarget("FIELD", 4);
    FIELD = tmp86_83;
    tmp74_57[4] = tmp86_83;
    AnnotationTarget[] tmp91_74 = tmp74_57;
    void tmp103_100 = new AnnotationTarget("LOCAL_VARIABLE", 5);
    LOCAL_VARIABLE = tmp103_100;
    tmp91_74[5] = tmp103_100;
    AnnotationTarget[] tmp108_91 = tmp91_74;
    void tmp122_119 = new AnnotationTarget("VALUE_PARAMETER", 6);
    VALUE_PARAMETER = tmp122_119;
    tmp108_91[6] = tmp122_119;
    AnnotationTarget[] tmp127_108 = tmp108_91;
    void tmp141_138 = new AnnotationTarget("CONSTRUCTOR", 7);
    CONSTRUCTOR = tmp141_138;
    tmp127_108[7] = tmp141_138;
    AnnotationTarget[] tmp146_127 = tmp127_108;
    void tmp160_157 = new AnnotationTarget("FUNCTION", 8);
    FUNCTION = tmp160_157;
    tmp146_127[8] = tmp160_157;
    AnnotationTarget[] tmp165_146 = tmp146_127;
    void tmp179_176 = new AnnotationTarget("PROPERTY_GETTER", 9);
    PROPERTY_GETTER = tmp179_176;
    tmp165_146[9] = tmp179_176;
    AnnotationTarget[] tmp184_165 = tmp165_146;
    void tmp198_195 = new AnnotationTarget("PROPERTY_SETTER", 10);
    PROPERTY_SETTER = tmp198_195;
    tmp184_165[10] = tmp198_195;
    AnnotationTarget[] tmp203_184 = tmp184_165;
    void tmp217_214 = new AnnotationTarget("TYPE", 11);
    TYPE = tmp217_214;
    tmp203_184[11] = tmp217_214;
    AnnotationTarget[] tmp222_203 = tmp203_184;
    void tmp236_233 = new AnnotationTarget("EXPRESSION", 12);
    EXPRESSION = tmp236_233;
    tmp222_203[12] = tmp236_233;
    AnnotationTarget[] tmp241_222 = tmp222_203;
    void tmp255_252 = new AnnotationTarget("FILE", 13);
    FILE = tmp255_252;
    tmp241_222[13] = tmp255_252;
    AnnotationTarget[] tmp260_241 = tmp241_222;
    void tmp274_271 = new AnnotationTarget("TYPEALIAS", 14);
    TYPEALIAS = tmp274_271;
    tmp260_241[14] = tmp274_271;
  }
  
  private AnnotationTarget() {}
}

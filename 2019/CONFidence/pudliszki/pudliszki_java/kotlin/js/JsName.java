package kotlin.js;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.OptionalExpectation;

@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER})
@Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\002\b\002\b\"\030\0002\0020\001B\b\022\006\020\002\032\0020\003R\023\020\002\032\0020\003X\004¢\006\006\032\004\b\002\020\004¨\006\005"}, d2={"Lkotlin/js/JsName;", "", "name", "", "()Ljava/lang/String;", "kotlin-stdlib"})
@OptionalExpectation
@interface JsName
{
  String name();
}

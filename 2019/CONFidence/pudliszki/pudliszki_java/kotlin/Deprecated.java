package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.MustBeDocumented;

@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.TYPEALIAS})
@MustBeDocumented
@Documented
@Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\036\n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\002\030\0002\0020\001B\034\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007R\017\020\006\032\0020\007¢\006\006\032\004\b\006\020\bR\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\tR\017\020\004\032\0020\005¢\006\006\032\004\b\004\020\n¨\006\013"}, d2={"Lkotlin/Deprecated;", "", "message", "", "replaceWith", "Lkotlin/ReplaceWith;", "level", "Lkotlin/DeprecationLevel;", "()Lkotlin/DeprecationLevel;", "()Ljava/lang/String;", "()Lkotlin/ReplaceWith;", "kotlin-stdlib"})
public @interface Deprecated
{
  String message();
  
  ReplaceWith replaceWith() default @ReplaceWith(imports={}, expression="");
  
  DeprecationLevel level() default DeprecationLevel.WARNING;
}

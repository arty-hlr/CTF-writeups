package kotlin.internal;

import java.lang.annotation.Annotation;
import java.lang.annotation.RetentionPolicy;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Repeatable;

@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.TYPEALIAS})
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
@Repeatable
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000&\n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\005\b\002\030\0002\0020\001B0\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\005\032\0020\006\022\b\b\002\020\007\032\0020\b\022\b\b\002\020\t\032\0020\nR\017\020\t\032\0020\n¢\006\006\032\004\b\t\020\013R\017\020\005\032\0020\006¢\006\006\032\004\b\005\020\fR\017\020\004\032\0020\003¢\006\006\032\004\b\004\020\rR\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\rR\017\020\007\032\0020\b¢\006\006\032\004\b\007\020\016¨\006\017"}, d2={"Lkotlin/internal/RequireKotlin;", "", "version", "", "message", "level", "Lkotlin/DeprecationLevel;", "versionKind", "Lkotlin/internal/RequireKotlinVersionKind;", "errorCode", "", "()I", "()Lkotlin/DeprecationLevel;", "()Ljava/lang/String;", "()Lkotlin/internal/RequireKotlinVersionKind;", "kotlin-stdlib"})
@SinceKotlin(version="1.2")
public @interface RequireKotlin
{
  String version();
  
  String message() default "";
  
  DeprecationLevel level() default DeprecationLevel.ERROR;
  
  RequireKotlinVersionKind versionKind() default RequireKotlinVersionKind.LANGUAGE_VERSION;
  
  int errorCode() default -1;
}

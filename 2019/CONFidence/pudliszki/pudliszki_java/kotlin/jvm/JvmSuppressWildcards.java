package kotlin.jvm;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.MustBeDocumented;

@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.TYPE})
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Documented
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD})
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\020\033\n\000\n\002\020\013\n\002\b\002\b\002\030\0002\0020\001B\n\022\b\b\002\020\002\032\0020\003R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\004¨\006\005"}, d2={"Lkotlin/jvm/JvmSuppressWildcards;", "", "suppress", "", "()Z", "kotlin-stdlib"})
public @interface JvmSuppressWildcards
{
  boolean suppress() default true;
}

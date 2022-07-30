package kotlin.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

@Target(allowedTargets={AnnotationTarget.ANNOTATION_CLASS})
@MustBeDocumented
@Documented
@Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\026\n\002\030\002\n\002\020\033\n\000\n\002\020\021\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001B\024\022\022\020\002\032\n\022\006\b\001\022\0020\0040\003\"\0020\004R\027\020\002\032\n\022\006\b\001\022\0020\0040\003¢\006\006\032\004\b\002\020\005¨\006\006"}, d2={"Lkotlin/annotation/Target;", "", "allowedTargets", "", "Lkotlin/annotation/AnnotationTarget;", "()[Lkotlin/annotation/AnnotationTarget;", "kotlin-stdlib"})
public @interface Target
{
  AnnotationTarget[] allowedTargets();
}

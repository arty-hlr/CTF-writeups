package kotlin.jvm;

import java.lang.annotation.Annotation;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.CONSTRUCTOR})
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\032\n\002\030\002\n\002\020\033\n\000\n\002\020\021\n\002\030\002\n\002\020\003\n\002\b\002\b\002\030\0002\0020\001B$\022\"\020\002\032\022\022\016\b\001\022\n\022\006\b\001\022\0020\0050\0040\003\"\n\022\006\b\001\022\0020\0050\004R\037\020\002\032\022\022\016\b\001\022\n\022\006\b\001\022\0020\0050\0040\003¢\006\006\032\004\b\002\020\006¨\006\007"}, d2={"Lkotlin/jvm/Throws;", "", "exceptionClasses", "", "Lkotlin/reflect/KClass;", "", "()[Ljava/lang/Class;", "kotlin-stdlib"})
public @interface Throws
{
  Class<? extends Throwable>[] exceptionClasses();
}

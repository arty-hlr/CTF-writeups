package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;

@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.LOCAL_VARIABLE, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.TYPEALIAS})
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\n\n\002\030\002\n\002\020\033\n\000\b\002\030\0002\0020\001B\000ø\001\000\002\007\n\005\b20\001¨\006\002"}, d2={"Lkotlin/ExperimentalUnsignedTypes;", "", "kotlin-stdlib"})
@Experimental(level=Experimental.Level.WARNING)
public @interface ExperimentalUnsignedTypes {}

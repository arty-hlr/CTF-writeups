package kotlin.experimental;

import java.lang.annotation.Annotation;
import java.lang.annotation.RetentionPolicy;
import kotlin.Experimental;
import kotlin.Experimental.Level;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;

@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\n\n\002\030\002\n\002\020\033\n\000\b\002\030\0002\0020\001B\000¨\006\002"}, d2={"Lkotlin/experimental/ExperimentalTypeInference;", "", "kotlin-stdlib"})
@Experimental(level=Experimental.Level.ERROR)
@SinceKotlin(version="1.3")
public @interface ExperimentalTypeInference {}

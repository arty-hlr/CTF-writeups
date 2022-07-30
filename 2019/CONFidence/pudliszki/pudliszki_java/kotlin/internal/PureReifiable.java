package kotlin.internal;

import java.lang.annotation.Annotation;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.TYPE_PARAMETER})
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target({})
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\n\n\002\030\002\n\002\020\033\n\000\b\002\030\0002\0020\001B\000¨\006\002"}, d2={"Lkotlin/internal/PureReifiable;", "", "kotlin-stdlib"})
public @interface PureReifiable {}

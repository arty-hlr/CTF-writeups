package kotlin.jvm;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.MustBeDocumented;

@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.FIELD})
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Documented
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\n\n\002\030\002\n\002\020\033\n\000\b\002\030\0002\0020\001B\000¨\006\002"}, d2={"Lkotlin/jvm/JvmField;", "", "kotlin-stdlib"})
public @interface JvmField {}

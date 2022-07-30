package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\020\033\n\002\b\003\bf\030\0002\0020\001R\030\020\002\032\b\022\004\022\0020\0040\003X¦\004¢\006\006\032\004\b\005\020\006¨\006\007"}, d2={"Lkotlin/reflect/KAnnotatedElement;", "", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "kotlin-stdlib"})
public abstract interface KAnnotatedElement
{
  @NotNull
  public abstract List<Annotation> getAnnotations();
}

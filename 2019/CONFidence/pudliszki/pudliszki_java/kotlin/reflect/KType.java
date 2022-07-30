package kotlin.reflect;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\002\bf\030\0002\0020\001R \020\002\032\b\022\004\022\0020\0040\0038&X§\004¢\006\f\022\004\b\005\020\006\032\004\b\007\020\bR\034\020\t\032\004\030\0010\n8&X§\004¢\006\f\022\004\b\013\020\006\032\004\b\f\020\rR\022\020\016\032\0020\017X¦\004¢\006\006\032\004\b\016\020\020¨\006\021"}, d2={"Lkotlin/reflect/KType;", "Lkotlin/reflect/KAnnotatedElement;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "arguments$annotations", "()V", "getArguments", "()Ljava/util/List;", "classifier", "Lkotlin/reflect/KClassifier;", "classifier$annotations", "getClassifier", "()Lkotlin/reflect/KClassifier;", "isMarkedNullable", "", "()Z", "kotlin-stdlib"})
public abstract interface KType
  extends KAnnotatedElement
{
  @Nullable
  public abstract KClassifier getClassifier();
  
  @NotNull
  public abstract List<KTypeProjection> getArguments();
  
  public abstract boolean isMarkedNullable();
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3)
  public static final class DefaultImpls {}
}

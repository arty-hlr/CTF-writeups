package kotlin.reflect;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\024\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\bf\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002:\001\007R\030\020\003\032\b\022\004\022\0028\0000\004X¦\004¢\006\006\032\004\b\005\020\006¨\006\b"}, d2={"Lkotlin/reflect/KMutableProperty;", "R", "Lkotlin/reflect/KProperty;", "setter", "Lkotlin/reflect/KMutableProperty$Setter;", "getSetter", "()Lkotlin/reflect/KMutableProperty$Setter;", "Setter", "kotlin-stdlib"})
public abstract interface KMutableProperty<R>
  extends KProperty<R>
{
  @NotNull
  public abstract Setter<R> getSetter();
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\024\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\000\bf\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\0020\0040\003¨\006\005"}, d2={"Lkotlin/reflect/KMutableProperty$Setter;", "R", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "", "kotlin-stdlib"})
  public static abstract interface Setter<R>
    extends KProperty.Accessor<R>, KFunction<Unit>
  {}
}

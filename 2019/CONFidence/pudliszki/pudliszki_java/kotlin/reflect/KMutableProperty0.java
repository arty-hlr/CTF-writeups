package kotlin.reflect;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000 \n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\004\bf\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003:\001\fJ\025\020\b\032\0020\t2\006\020\n\032\0028\000H&¢\006\002\020\013R\030\020\004\032\b\022\004\022\0028\0000\005X¦\004¢\006\006\032\004\b\006\020\007¨\006\r"}, d2={"Lkotlin/reflect/KMutableProperty0;", "R", "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/KMutableProperty;", "setter", "Lkotlin/reflect/KMutableProperty0$Setter;", "getSetter", "()Lkotlin/reflect/KMutableProperty0$Setter;", "set", "", "value", "(Ljava/lang/Object;)V", "Setter", "kotlin-stdlib"})
public abstract interface KMutableProperty0<R>
  extends KProperty0<R>, KMutableProperty<R>
{
  public abstract void set(R paramR);
  
  @NotNull
  public abstract Setter<R> getSetter();
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\024\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\000\bf\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\0022\016\022\004\022\002H\001\022\004\022\0020\0040\003¨\006\005"}, d2={"Lkotlin/reflect/KMutableProperty0$Setter;", "R", "Lkotlin/reflect/KMutableProperty$Setter;", "Lkotlin/Function1;", "", "kotlin-stdlib"})
  public static abstract interface Setter<R>
    extends KMutableProperty.Setter<R>, Function1<R, Unit>
  {}
}

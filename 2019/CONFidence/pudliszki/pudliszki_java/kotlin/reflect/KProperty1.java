package kotlin.reflect;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\000\n\002\b\002\bf\030\000*\004\b\000\020\001*\006\b\001\020\002 \0012\b\022\004\022\002H\0020\0032\016\022\004\022\002H\001\022\004\022\002H\0020\004:\001\016J\025\020\t\032\0028\0012\006\020\n\032\0028\000H&¢\006\002\020\013J\027\020\f\032\004\030\0010\r2\006\020\n\032\0028\000H'¢\006\002\020\013R\036\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006X¦\004¢\006\006\032\004\b\007\020\b¨\006\017"}, d2={"Lkotlin/reflect/KProperty1;", "T", "R", "Lkotlin/reflect/KProperty;", "Lkotlin/Function1;", "getter", "Lkotlin/reflect/KProperty1$Getter;", "getGetter", "()Lkotlin/reflect/KProperty1$Getter;", "get", "receiver", "(Ljava/lang/Object;)Ljava/lang/Object;", "getDelegate", "", "Getter", "kotlin-stdlib"})
public abstract interface KProperty1<T, R>
  extends KProperty<R>, Function1<T, R>
{
  public abstract R get(T paramT);
  
  @SinceKotlin(version="1.1")
  @Nullable
  public abstract Object getDelegate(T paramT);
  
  @NotNull
  public abstract Getter<T, R> getGetter();
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\bf\030\000*\004\b\002\020\001*\006\b\003\020\002 \0012\b\022\004\022\002H\0020\0032\016\022\004\022\002H\001\022\004\022\002H\0020\004¨\006\005"}, d2={"Lkotlin/reflect/KProperty1$Getter;", "T", "R", "Lkotlin/reflect/KProperty$Getter;", "Lkotlin/Function1;", "kotlin-stdlib"})
  public static abstract interface Getter<T, R>
    extends KProperty.Getter<R>, Function1<T, R>
  {}
}

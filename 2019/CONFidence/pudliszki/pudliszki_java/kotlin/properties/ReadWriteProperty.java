package kotlin.properties;

import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000 \n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\003\bf\030\000*\006\b\000\020\001 \000*\004\b\001\020\0022\0020\003J\"\020\004\032\0028\0012\006\020\005\032\0028\0002\n\020\006\032\006\022\002\b\0030\007H¦\002¢\006\002\020\bJ*\020\t\032\0020\n2\006\020\005\032\0028\0002\n\020\006\032\006\022\002\b\0030\0072\006\020\013\032\0028\001H¦\002¢\006\002\020\f¨\006\r"}, d2={"Lkotlin/properties/ReadWriteProperty;", "R", "T", "", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "kotlin-stdlib"})
public abstract interface ReadWriteProperty<R, T>
{
  public abstract T getValue(R paramR, @NotNull KProperty<?> paramKProperty);
  
  public abstract void setValue(R paramR, @NotNull KProperty<?> paramKProperty, T paramT);
}

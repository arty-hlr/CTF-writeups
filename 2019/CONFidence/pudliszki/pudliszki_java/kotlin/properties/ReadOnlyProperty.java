package kotlin.properties;

import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\030\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\002\bf\030\000*\006\b\000\020\001 \000*\006\b\001\020\002 \0012\0020\003J\"\020\004\032\0028\0012\006\020\005\032\0028\0002\n\020\006\032\006\022\002\b\0030\007H¦\002¢\006\002\020\b¨\006\t"}, d2={"Lkotlin/properties/ReadOnlyProperty;", "R", "T", "", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "kotlin-stdlib"})
public abstract interface ReadOnlyProperty<R, T>
{
  public abstract T getValue(R paramR, @NotNull KProperty<?> paramKProperty);
}

package kotlin.collections;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;


@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000.\n\002\b\003\n\002\020$\n\002\020\016\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020%\n\002\b\003\n\002\020\002\n\002\b\003\032K\020\000\032\002H\001\"\004\b\000\020\002\"\b\b\001\020\001*\002H\002*\025\022\006\b\000\022\0020\004\022\t\022\007H\002¢\006\002\b\0050\0032\b\020\006\032\004\030\0010\0072\n\020\b\032\006\022\002\b\0030\tH\n¢\006\002\020\n\032@\020\000\032\002H\002\"\004\b\000\020\002*\022\022\006\b\000\022\0020\004\022\006\b\000\022\002H\0020\0132\b\020\006\032\004\030\0010\0072\n\020\b\032\006\022\002\b\0030\tH\b¢\006\004\b\f\020\n\032O\020\000\032\002H\001\"\004\b\000\020\002\"\b\b\001\020\001*\002H\002*\027\022\006\b\000\022\0020\004\022\013\b\001\022\007H\002¢\006\002\b\0050\0132\b\020\006\032\004\030\0010\0072\n\020\b\032\006\022\002\b\0030\tH\n¢\006\004\b\r\020\n\032F\020\016\032\0020\017\"\004\b\000\020\002*\022\022\006\b\000\022\0020\004\022\006\b\000\022\002H\0020\0132\b\020\006\032\004\030\0010\0072\n\020\b\032\006\022\002\b\0030\t2\006\020\020\032\002H\002H\n¢\006\002\020\021¨\006\022"}, d2={"getValue", "V1", "V", "", "", "Lkotlin/internal/Exact;", "thisRef", "", "property", "Lkotlin/reflect/KProperty;", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "", "getVarContravariant", "getVar", "setValue", "", "value", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "kotlin-stdlib"})
@JvmName(name="MapAccessorsKt")
public final class MapAccessorsKt
{
  @InlineOnly
  private static final <V, V1 extends V> V1 getValue(@NotNull Map<? super String, ? extends V> $receiver, Object thisRef, KProperty<?> property)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return MapsKt.getOrImplicitDefaultNullable($receiver, property.getName());
  }
  



  @JvmName(name="getVar")
  @InlineOnly
  private static final <V, V1 extends V> V1 getVar(@NotNull Map<? super String, ? extends V> $receiver, Object thisRef, KProperty<?> property)
  {
    ;
    

    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return MapsKt.getOrImplicitDefaultNullable($receiver, property.getName()); } /**
   * @deprecated
   */
  @Deprecated(message="Use getValue() with two type parameters instead", level=DeprecationLevel.ERROR)
  @JvmName(name="getVarContravariant")
  @LowPriorityInOverloadResolution
  @InlineOnly
  private static final <V> V getVarContravariant(@NotNull Map<? super String, ? super V> $receiver, Object thisRef, KProperty<?> property) { ; return MapsKt.getOrImplicitDefaultNullable($receiver, property.getName());
  }
  


  @InlineOnly
  private static final <V> void setValue(@NotNull Map<? super String, ? super V> $receiver, Object thisRef, KProperty<?> property, V value)
  {
    ;
    
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");$receiver.put(property.getName(), value);
  }
}

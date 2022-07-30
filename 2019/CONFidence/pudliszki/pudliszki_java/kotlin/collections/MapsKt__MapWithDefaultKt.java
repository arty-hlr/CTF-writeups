package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;



















@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\036\n\002\b\003\n\002\020$\n\002\b\005\n\002\030\002\n\002\030\002\n\000\n\002\020%\n\002\b\002\0323\020\000\032\002H\001\"\004\b\000\020\002\"\004\b\001\020\001*\016\022\004\022\002H\002\022\004\022\002H\0010\0032\006\020\004\032\002H\002H\001¢\006\004\b\005\020\006\032Q\020\007\032\016\022\004\022\002H\002\022\004\022\002H\0010\003\"\004\b\000\020\002\"\004\b\001\020\001*\016\022\004\022\002H\002\022\004\022\002H\0010\0032!\020\b\032\035\022\023\022\021H\002¢\006\f\b\n\022\b\b\013\022\004\b\b(\004\022\004\022\002H\0010\t\032X\020\007\032\016\022\004\022\002H\002\022\004\022\002H\0010\f\"\004\b\000\020\002\"\004\b\001\020\001*\016\022\004\022\002H\002\022\004\022\002H\0010\f2!\020\b\032\035\022\023\022\021H\002¢\006\f\b\n\022\b\b\013\022\004\b\b(\004\022\004\022\002H\0010\tH\007¢\006\002\b\r¨\006\016"}, d2={"getOrImplicitDefault", "V", "K", "", "key", "getOrImplicitDefaultNullable", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "withDefault", "defaultValue", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "withDefaultMutable", "kotlin-stdlib"}, xs="kotlin/collections/MapsKt")
class MapsKt__MapWithDefaultKt
{
  @NotNull
  public static final <K, V> Map<K, V> withDefault(@NotNull Map<K, ? extends V> $receiver, @NotNull Function1<? super K, ? extends V> defaultValue)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(defaultValue, "defaultValue");Map localMap = $receiver;
    

    return (localMap instanceof MapWithDefault) ? MapsKt.withDefault(((MapWithDefault)$receiver).getMap(), defaultValue) : (Map)new MapWithDefaultImpl($receiver, defaultValue);
  }
  





  @JvmName(name="withDefaultMutable")
  @NotNull
  public static final <K, V> Map<K, V> withDefaultMutable(@NotNull Map<K, V> $receiver, @NotNull Function1<? super K, ? extends V> defaultValue)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(defaultValue, "defaultValue");Map localMap = $receiver;
    

    return (localMap instanceof MutableMapWithDefault) ? MapsKt.withDefaultMutable(((MutableMapWithDefault)$receiver).getMap(), defaultValue) : (Map)new MutableMapWithDefaultImpl($receiver, defaultValue);
  }
  
  @JvmName(name="getOrImplicitDefaultNullable")
  @PublishedApi
  public static final <K, V> V getOrImplicitDefaultNullable(@NotNull Map<K, ? extends V> $receiver, K key)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); if (($receiver instanceof MapWithDefault)) {
      return ((MapWithDefault)$receiver).getOrImplicitDefault(key);
    }
    Map $receiver$iv = $receiver;
    







































    int $i$f$getOrElseNullable;
    






































    Object value$iv = $receiver$iv.get(key);
    if ((value$iv == null) && (!$receiver$iv.containsKey(key)))
    {
      int $i$a$1$getOrElseNullable;
      throw ((Throwable)new NoSuchElementException("Key " + key + " is missing in the map."));
    }
    



















































































    return value$iv;
  }
  
  public MapsKt__MapWithDefaultKt() {}
}

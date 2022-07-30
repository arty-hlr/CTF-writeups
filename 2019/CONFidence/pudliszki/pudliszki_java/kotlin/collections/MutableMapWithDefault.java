package kotlin.collections;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\024\n\002\030\002\n\002\b\002\n\002\020%\n\002\030\002\n\002\b\004\bb\030\000*\004\b\000\020\001*\004\b\001\020\0022\016\022\004\022\002H\001\022\004\022\002H\0020\0032\016\022\004\022\002H\001\022\004\022\002H\0020\004R\036\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\003X¦\004¢\006\006\032\004\b\006\020\007¨\006\b"}, d2={"Lkotlin/collections/MutableMapWithDefault;", "K", "V", "", "Lkotlin/collections/MapWithDefault;", "map", "getMap", "()Ljava/util/Map;", "kotlin-stdlib"})
abstract interface MutableMapWithDefault<K, V>
  extends Map<K, V>, MapWithDefault<K, V>, KMutableMap
{
  @NotNull
  public abstract Map<K, V> getMap();
}

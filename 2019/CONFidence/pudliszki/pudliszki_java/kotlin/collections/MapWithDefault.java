package kotlin.collections;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\020\n\002\030\002\n\002\b\002\n\002\020$\n\002\b\007\bb\030\000*\004\b\000\020\001*\006\b\001\020\002 \0012\016\022\004\022\002H\001\022\004\022\002H\0020\003J\025\020\007\032\0028\0012\006\020\b\032\0028\000H&¢\006\002\020\tR\036\020\004\032\016\022\004\022\0028\000\022\004\022\0028\0010\003X¦\004¢\006\006\032\004\b\005\020\006¨\006\n"}, d2={"Lkotlin/collections/MapWithDefault;", "K", "V", "", "map", "getMap", "()Ljava/util/Map;", "getOrImplicitDefault", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"})
abstract interface MapWithDefault<K, V>
  extends Map<K, V>, KMappedMarker
{
  @NotNull
  public abstract Map<K, V> getMap();
  
  public abstract V getOrImplicitDefault(K paramK);
}

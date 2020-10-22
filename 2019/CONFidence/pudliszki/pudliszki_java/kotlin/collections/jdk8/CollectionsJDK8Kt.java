package kotlin.collections.jdk8;

import java.util.Map;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;










@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\034\n\002\b\003\n\002\030\002\n\002\020$\n\002\b\004\n\002\020\013\n\002\020%\n\002\b\003\032A\020\000\032\002H\001\"\t\b\000\020\002¢\006\002\b\003\"\004\b\001\020\001*\020\022\006\b\001\022\002H\002\022\004\022\002H\0010\0042\006\020\005\032\002H\0022\006\020\006\032\002H\001H\b¢\006\002\020\007\032H\020\b\032\0020\t\"\t\b\000\020\002¢\006\002\b\003\"\t\b\001\020\001¢\006\002\b\003*\022\022\006\b\001\022\002H\002\022\006\b\001\022\002H\0010\n2\006\020\005\032\002H\0022\006\020\013\032\002H\001H\b¢\006\002\020\f¨\006\r"}, d2={"getOrDefault", "V", "K", "Lkotlin/internal/OnlyInputTypes;", "", "key", "defaultValue", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "", "", "value", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "kotlin-stdlib-jdk8"}, pn="kotlin.collections")
@JvmName(name="CollectionsJDK8Kt")
public final class CollectionsJDK8Kt
{
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final <K, V> V getOrDefault(@NotNull Map<? extends K, ? extends V> $receiver, K key, V defaultValue)
  {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>"); return $receiver.getOrDefault(key, defaultValue);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final <K, V> boolean remove(@NotNull Map<? extends K, ? extends V> $receiver, K key, V value)
  {
    ;
    
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>"); return TypeIntrinsics.asMutableMap($receiver).remove(key, value);
  }
}

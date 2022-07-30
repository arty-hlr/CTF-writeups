package kotlin.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.PublishedApi;
import kotlin.TypeCastException;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000&\n\000\n\002\020$\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020%\n\002\b\003\n\002\030\002\n\002\020&\n\000\0320\020\000\032\016\022\004\022\002H\002\022\004\022\0020\0030\001\"\004\b\000\020\004\"\004\b\001\020\002*\016\022\004\022\002H\004\022\004\022\002H\0020\005H\007\032W\020\006\032\016\022\004\022\002H\002\022\004\022\002H\b0\007\"\004\b\000\020\002\"\004\b\001\020\t\"\004\b\002\020\b*\016\022\004\022\002H\002\022\004\022\002H\t0\0072\036\020\n\032\032\022\020\022\016\022\004\022\002H\002\022\004\022\002H\t0\f\022\004\022\002H\b0\013H\b¨\006\r"}, d2={"eachCount", "", "K", "", "T", "Lkotlin/collections/Grouping;", "mapValuesInPlace", "", "R", "V", "f", "Lkotlin/Function1;", "", "kotlin-stdlib"}, xs="kotlin/collections/GroupingKt")
class GroupingKt__GroupingJVMKt
{
  @kotlin.SinceKotlin(version="1.1")
  @NotNull
  public static final <T, K> Map<K, Integer> eachCount(@NotNull Grouping<T, ? extends K> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Grouping localGrouping1 = $receiver;Map localMap = (Map)new java.util.LinkedHashMap();
    














    int $i$f$foldTo;
    














    Grouping $receiver$iv$iv = (Grouping)$receiver$iv;
    int $i$f$aggregateTo; Iterator localIterator = $receiver$iv$iv.sourceIterator(); Object e$iv$iv; Object key$iv$iv; Object localObject2; Object key$iv; Object localObject7; Object localObject8; for (Object localObject1 = localIterator; ((Iterator)localObject1).hasNext(); localObject2.put(key$iv$iv, key$iv))
    {





























      e$iv$iv = ((Iterator)localObject1).next();
      key$iv$iv = $receiver$iv$iv.keyOf(e$iv$iv);
      Object accumulator$iv$iv = ((Map)destination$iv).get(key$iv$iv);
      localObject2 = destination$iv;int i = (accumulator$iv$iv == null) && (!((Map)destination$iv).containsKey(key$iv$iv)) ? 1 : 0;Object localObject3 = e$iv$iv;Object localObject4 = accumulator$iv$iv;key$iv = key$iv$iv;
      int $i$a$1$aggregateTo;
      Object acc$iv;
      Object e$iv;
      boolean first$iv;
      Object localObject5 = e$iv;Object localObject6 = key$iv;localObject7 = key$iv;
      Object $noName_0;
      localObject8 = new Ref.IntRef();int $i$a$1$foldTo = e$iv;Object $noName_1 = (Ref.IntRef)
      





























        (first$iv ? localObject8 : acc$iv);Object $noName_0 = localObject7;
      int $i$a$2$foldTo; Object $noName_2; Ref.IntRef acc; Ref.IntRef localIntRef1 = acc;Ref.IntRef $receiver = localIntRef1; int $i$a$1$apply; element += 1;key$iv = localIntRef1;
    }
    



























    Object $receiver$iv = 
    




      destination$iv;Object destination$iv = (Iterable)((Map)$receiver$iv).entrySet();
    for ($receiver$iv$iv = ((Iterable)destination$iv).iterator(); $receiver$iv$iv.hasNext(); ((Map.Entry)localObject7).setValue(localObject8)) { key$iv$iv = $receiver$iv$iv.next();localObject1 = (Map.Entry)key$iv$iv; Object tmp242_240 = localObject1; if (tmp242_240 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K, R>"); e$iv$iv = localObject1;localObject7 = TypeIntrinsics.asMutableMapEntry(tmp242_240); int $i$a$3$mapValuesInPlace; Map.Entry it; localObject8 = Integer.valueOf(getValueelement); } return TypeIntrinsics.asMutableMap($receiver$iv);
  }
  








  @PublishedApi
  @InlineOnly
  private static final <K, V, R> Map<K, R> mapValuesInPlace(@NotNull Map<K, V> $receiver, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> f)
  {
    ;
    






    Iterable $receiver$iv = (Iterable)$receiver.entrySet();
    



    int $i$f$forEach;
    


    Map.Entry it;
    


    for (Iterator localIterator = $receiver$iv.iterator(); localIterator.hasNext(); TypeIntrinsics.asMutableMapEntry(tmp46_44).setValue(f.invoke(it)))
    {










      Object element$iv = localIterator.next();it = (Map.Entry)element$iv;
      int $i$a$1$forEach;
      if (it == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K, R>");
    }
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, R>"); return TypeIntrinsics.asMutableMap($receiver);
  }
  
  public GroupingKt__GroupingJVMKt() {}
}

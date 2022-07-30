package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;



@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000D\n\000\n\002\020$\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\020\017\n\000\n\002\020\021\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\016\n\002\b\004\n\002\030\002\n\000\0322\020\000\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\0032\022\020\004\032\016\022\004\022\002H\002\022\004\022\002H\0030\005\032Y\020\006\032\016\022\004\022\002H\002\022\004\022\002H\0030\007\"\016\b\000\020\002*\b\022\004\022\002H\0020\b\"\004\b\001\020\0032*\020\t\032\026\022\022\b\001\022\016\022\004\022\002H\002\022\004\022\002H\0030\0050\n\"\016\022\004\022\002H\002\022\004\022\002H\0030\005¢\006\002\020\013\032@\020\f\032\002H\003\"\004\b\000\020\002\"\004\b\001\020\003*\016\022\004\022\002H\002\022\004\022\002H\0030\r2\006\020\016\032\002H\0022\f\020\017\032\b\022\004\022\002H\0030\020H\b¢\006\002\020\021\032\031\020\022\032\0020\023*\016\022\004\022\0020\024\022\004\022\0020\0240\001H\b\0322\020\025\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\001H\000\0321\020\026\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\016\022\004\022\002H\002\022\004\022\002H\0030\001H\b\032:\020\027\032\016\022\004\022\002H\002\022\004\022\002H\0030\007\"\016\b\000\020\002*\b\022\004\022\002H\0020\b\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\001\032@\020\027\032\016\022\004\022\002H\002\022\004\022\002H\0030\007\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0012\016\020\030\032\n\022\006\b\000\022\002H\0020\031¨\006\032"}, d2={"mapOf", "", "K", "V", "pair", "Lkotlin/Pair;", "sortedMapOf", "Ljava/util/SortedMap;", "", "pairs", "", "([Lkotlin/Pair;)Ljava/util/SortedMap;", "getOrPut", "Ljava/util/concurrent/ConcurrentMap;", "key", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "toProperties", "Ljava/util/Properties;", "", "toSingletonMap", "toSingletonMapOrSelf", "toSortedMap", "comparator", "Ljava/util/Comparator;", "kotlin-stdlib"}, xs="kotlin/collections/MapsKt")
class MapsKt__MapsJVMKt
  extends MapsKt__MapWithDefaultKt
{
  @NotNull
  public static final <K, V> Map<K, V> mapOf(@NotNull Pair<? extends K, ? extends V> pair)
  {
    Intrinsics.checkParameterIsNotNull(pair, "pair"); Map tmp17_14 = Collections.singletonMap(pair.getFirst(), pair.getSecond());Intrinsics.checkExpressionValueIsNotNull(tmp17_14, "java.util.Collections.si…(pair.first, pair.second)");return tmp17_14;
  }
  
  /* Error */
  public static final <K, V> V getOrPut(@NotNull java.util.concurrent.ConcurrentMap<K, V> $receiver, K key, @NotNull kotlin.jvm.functions.Function0<? extends V> defaultValue)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 40
    //   3: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_2
    //   7: ldc 42
    //   9: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: aload_1
    //   14: invokeinterface 48 2 0
    //   19: dup
    //   20: ifnull +6 -> 26
    //   23: goto +35 -> 58
    //   26: pop
    //   27: aload_2
    //   28: invokeinterface 53 1 0
    //   33: astore 4
    //   35: aload 4
    //   37: astore 5
    //   39: aload_0
    //   40: aload_1
    //   41: aload 5
    //   43: invokeinterface 57 3 0
    //   48: dup
    //   49: ifnull +6 -> 55
    //   52: goto +6 -> 58
    //   55: pop
    //   56: aload 5
    //   58: areturn
    // Line number table:
    //   Java source line #41	-> byte code offset #12
    //   Java source line #42	-> byte code offset #27
    //   Java source line #42	-> byte code offset #39
    //   Java source line #42	-> byte code offset #58
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	$receiver	java.util.concurrent.ConcurrentMap
    //   0	59	1	key	Object
    //   0	59	2	defaultValue	kotlin.jvm.functions.Function0
    //   0	59	3	$i$f$getOrPut	int
    //   39	19	5	default	Object
    //   39	19	6	$i$a$1$let	int
  }
  
  @NotNull
  public static final <K extends Comparable<? super K>, V> SortedMap<K, V> toSortedMap(@NotNull Map<? extends K, ? extends V> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (SortedMap)new TreeMap($receiver);
  }
  



  @NotNull
  public static final <K, V> SortedMap<K, V> toSortedMap(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Comparator<? super K> comparator)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(comparator, "comparator");TreeMap localTreeMap1 = new TreeMap(comparator);TreeMap $receiver = localTreeMap1; int $i$a$1$apply; $receiver.putAll($receiver);return (SortedMap)localTreeMap1;
  }
  



  @NotNull
  public static final <K extends Comparable<? super K>, V> SortedMap<K, V> sortedMapOf(@NotNull Pair<? extends K, ? extends V>... pairs)
  {
    Intrinsics.checkParameterIsNotNull(pairs, "pairs");TreeMap localTreeMap1 = new TreeMap();TreeMap $receiver = localTreeMap1; int $i$a$1$apply; MapsKt.putAll((Map)$receiver, pairs);return (SortedMap)localTreeMap1;
  }
  


  @InlineOnly
  private static final Properties toProperties(@NotNull Map<String, String> $receiver)
  {
    ;
    
    Properties localProperties1 = new Properties();Properties $receiver = localProperties1; int $i$a$1$apply; $receiver.putAll($receiver);return localProperties1;
  }
  
  @InlineOnly
  private static final <K, V> Map<K, V> toSingletonMapOrSelf(@NotNull Map<K, ? extends V> $receiver) { ;
    return MapsKt.toSingletonMap($receiver);
  }
  
  @NotNull
  public static final <K, V> Map<K, V> toSingletonMap(@NotNull Map<? extends K, ? extends V> $receiver) { Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Object localObject = $receiver.entrySet().iterator().next();Map.Entry $receiver = (Map.Entry)localObject; int $i$a$1$with; Map tmp43_40 = Collections.singletonMap($receiver.getKey(), $receiver.getValue());Intrinsics.checkExpressionValueIsNotNull(tmp43_40, "java.util.Collections.singletonMap(key, value)"); Map tmp49_43 = tmp43_40;Intrinsics.checkExpressionValueIsNotNull(tmp49_43, "with(entries.iterator().…ingletonMap(key, value) }");return tmp49_43;
  }
  
  public MapsKt__MapsJVMKt() {}
}

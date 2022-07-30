package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Pair;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000h\n\000\n\002\020\013\n\002\b\002\n\002\020$\n\000\n\002\030\002\n\002\020&\n\002\b\002\n\002\020\034\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020 \n\002\b\004\n\002\020\037\n\002\b\003\n\002\020\002\n\002\b\003\n\002\020\000\n\002\b\003\n\002\020\017\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\007\n\002\030\002\n\000\032G\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0042\036\020\005\032\032\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\007\022\004\022\0020\0010\006H\b\032$\020\b\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\004\032G\020\b\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0042\036\020\005\032\032\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\007\022\004\022\0020\0010\006H\b\0329\020\t\032\024\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\0070\n\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\004H\b\0326\020\013\032\024\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\0070\f\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\004\032'\020\r\032\0020\016\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\004H\b\032G\020\r\032\0020\016\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0042\036\020\005\032\032\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\007\022\004\022\0020\0010\006H\b\032Y\020\017\032\b\022\004\022\002H\0210\020\"\004\b\000\020\002\"\004\b\001\020\003\"\004\b\002\020\021*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0042$\020\022\032 \022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\007\022\n\022\b\022\004\022\002H\0210\n0\006H\b\032r\020\023\032\002H\024\"\004\b\000\020\002\"\004\b\001\020\003\"\004\b\002\020\021\"\020\b\003\020\024*\n\022\006\b\000\022\002H\0210\025*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0042\006\020\026\032\002H\0242$\020\022\032 \022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\007\022\n\022\b\022\004\022\002H\0210\n0\006H\b¢\006\002\020\027\032G\020\030\032\0020\031\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0042\036\020\032\032\032\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\007\022\004\022\0020\0310\006H\b\032S\020\033\032\b\022\004\022\002H\0210\020\"\004\b\000\020\002\"\004\b\001\020\003\"\004\b\002\020\021*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0042\036\020\022\032\032\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\007\022\004\022\002H\0210\006H\b\032Y\020\034\032\b\022\004\022\002H\0210\020\"\004\b\000\020\002\"\004\b\001\020\003\"\b\b\002\020\021*\0020\035*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0042 \020\022\032\034\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\007\022\006\022\004\030\001H\0210\006H\b\032r\020\036\032\002H\024\"\004\b\000\020\002\"\004\b\001\020\003\"\b\b\002\020\021*\0020\035\"\020\b\003\020\024*\n\022\006\b\000\022\002H\0210\025*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0042\006\020\026\032\002H\0242 \020\022\032\034\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\007\022\006\022\004\030\001H\0210\006H\b¢\006\002\020\027\032l\020\037\032\002H\024\"\004\b\000\020\002\"\004\b\001\020\003\"\004\b\002\020\021\"\020\b\003\020\024*\n\022\006\b\000\022\002H\0210\025*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0042\006\020\026\032\002H\0242\036\020\022\032\032\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\007\022\004\022\002H\0210\006H\b¢\006\002\020\027\032e\020 \032\020\022\004\022\002H\002\022\004\022\002H\003\030\0010\007\"\004\b\000\020\002\"\004\b\001\020\003\"\016\b\002\020\021*\b\022\004\022\002H\0210!*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0042\036\020\"\032\032\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\007\022\004\022\002H\0210\006H\b\032i\020#\032\020\022\004\022\002H\002\022\004\022\002H\003\030\0010\007\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\00422\020$\032.\022\022\b\000\022\016\022\004\022\002H\002\022\004\022\002H\0030\0070%j\026\022\022\b\000\022\016\022\004\022\002H\002\022\004\022\002H\0030\007`&H\b\032e\020'\032\020\022\004\022\002H\002\022\004\022\002H\003\030\0010\007\"\004\b\000\020\002\"\004\b\001\020\003\"\016\b\002\020\021*\b\022\004\022\002H\0210!*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0042\036\020\"\032\032\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\007\022\004\022\002H\0210\006H\b\032f\020(\032\020\022\004\022\002H\002\022\004\022\002H\003\030\0010\007\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\00422\020$\032.\022\022\b\000\022\016\022\004\022\002H\002\022\004\022\002H\0030\0070%j\026\022\022\b\000\022\016\022\004\022\002H\002\022\004\022\002H\0030\007`&\032$\020)\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\004\032G\020)\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0042\036\020\005\032\032\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\007\022\004\022\0020\0010\006H\b\032V\020*\032\002H+\"\004\b\000\020\002\"\004\b\001\020\003\"\026\b\002\020+*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\004*\002H+2\036\020\032\032\032\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\007\022\004\022\0020\0310\006H\b¢\006\002\020,\0326\020-\032\024\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030.0\020\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\004¨\006/"}, d2={"all", "", "K", "V", "", "predicate", "Lkotlin/Function1;", "", "any", "asIterable", "", "asSequence", "Lkotlin/sequences/Sequence;", "count", "", "flatMap", "", "R", "transform", "flatMapTo", "C", "", "destination", "(Ljava/util/Map;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "forEach", "", "action", "map", "mapNotNull", "", "mapNotNullTo", "mapTo", "maxBy", "", "selector", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "minBy", "minWith", "none", "onEach", "M", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "toList", "Lkotlin/Pair;", "kotlin-stdlib"}, xs="kotlin/collections/MapsKt")
class MapsKt___MapsKt extends MapsKt__MapsKt
{
  @NotNull
  public static final <K, V> List<Pair<K, V>> toList(@NotNull Map<? extends K, ? extends V> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); if ($receiver.size() == 0)
      return CollectionsKt.emptyList();
    Iterator iterator = $receiver.entrySet().iterator();
    if (!iterator.hasNext())
      return CollectionsKt.emptyList();
    Map.Entry first = (Map.Entry)iterator.next();
    if (!iterator.hasNext()) {
      Map.Entry localEntry1 = first;return CollectionsKt.listOf(new Pair(localEntry1.getKey(), localEntry1.getValue())); }
    ArrayList result = new ArrayList($receiver.size());
    Map.Entry localEntry2 = first;ArrayList localArrayList1 = result;Pair localPair = new Pair(localEntry2.getKey(), localEntry2.getValue());localArrayList1.add(localPair);
    do {
      localEntry2 = (Map.Entry)iterator.next();localArrayList1 = result;localPair = new Pair(localEntry2.getKey(), localEntry2.getValue());localArrayList1.add(localPair);
    } while (iterator.hasNext());
    return (List)result;
  }
  




  @NotNull
  public static final <K, V, R, C extends Collection<? super R>> C flatMapTo(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull C destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform)
  {
    ;
    


    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");Intrinsics.checkParameterIsNotNull(transform, "transform");Map localMap = $receiver; for (Map.Entry element : localMap.entrySet()) {
      Iterable list = (Iterable)transform.invoke(element);
      CollectionsKt.addAll(destination, list);
    }
    return destination;
  }
  













  @NotNull
  public static final <K, V, R, C extends Collection<? super R>> C mapTo(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull C destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform)
  {
    ;
    












    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");Intrinsics.checkParameterIsNotNull(transform, "transform");Map localMap = $receiver; for (Map.Entry item : localMap.entrySet())
      destination.add(transform.invoke(item));
    return destination;
  }
  















  public static final <K, V> boolean any(@NotNull Map<? extends K, ? extends V> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return !$receiver.isEmpty();
  }
  






  @InlineOnly
  private static final <K, V> int count(@NotNull Map<? extends K, ? extends V> $receiver)
  {
    ;
    





    return $receiver.size();
  }
  

  public static final <K, V> int count(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(predicate, "predicate"); if ($receiver.isEmpty()) return 0;
    int count = 0;
    Map localMap = $receiver; for (Map.Entry element : localMap.entrySet()) if (((Boolean)predicate.invoke(element)).booleanValue()) count++;
    return count;
  }
  

  @kotlin.internal.HidesMembers
  public static final <K, V> void forEach(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, kotlin.Unit> action)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(action, "action");Map localMap = $receiver; Map.Entry element; for (Iterator localIterator = localMap.entrySet().iterator(); localIterator.hasNext(); action.invoke(element)) { element = (Map.Entry)localIterator.next();
    }
  }
  





  @InlineOnly
  private static final <K, V> Map.Entry<K, V> maxWith(@NotNull Map<? extends K, ? extends V> $receiver, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator)
  {
    ;
    




    return (Map.Entry)CollectionsKt.maxWith((Iterable)$receiver.entrySet(), comparator);
  }
  










  @org.jetbrains.annotations.Nullable
  public static final <K, V> Map.Entry<K, V> minWith(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Comparator<? super Map.Entry<? extends K, ? extends V>> comparator)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(comparator, "comparator");return (Map.Entry)CollectionsKt.minWith((Iterable)$receiver.entrySet(), comparator);
  }
  




  public static final <K, V> boolean none(@NotNull Map<? extends K, ? extends V> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.isEmpty();
  }
  






  @kotlin.SinceKotlin(version="1.1")
  @NotNull
  public static final <K, V, M extends Map<? extends K, ? extends V>> M onEach(@NotNull M $receiver, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, kotlin.Unit> action)
  {
    ;
    




    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(action, "action");Map localMap1 = $receiver;Map $receiver = localMap1; int $i$a$1$apply; Map localMap2 = $receiver; Map.Entry element; for (Iterator localIterator = localMap2.entrySet().iterator(); localIterator.hasNext(); action.invoke(element)) element = (Map.Entry)localIterator.next(); return localMap1;
  }
  

  @InlineOnly
  private static final <K, V> Iterable<Map.Entry<K, V>> asIterable(@NotNull Map<? extends K, ? extends V> $receiver)
  {
    ;
    return (Iterable)$receiver.entrySet();
  }
  

  @NotNull
  public static final <K, V> kotlin.sequences.Sequence<Map.Entry<K, V>> asSequence(@NotNull Map<? extends K, ? extends V> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return CollectionsKt.asSequence((Iterable)$receiver.entrySet());
  }
  
  @NotNull
  public static final <K, V, R> List<R> flatMap(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(transform, "transform");Map localMap1 = $receiver;Collection destination$iv = (Collection)new ArrayList();
    




























































    int $i$f$flatMapTo;
    



























































    Map $receiver$iv;
    



























































    Map localMap2 = $receiver$iv; for (Map.Entry element$iv : localMap2.entrySet()) {
      Iterable list$iv = (Iterable)transform.invoke(element$iv);
      CollectionsKt.addAll(destination$iv, list$iv);
    }
    return (List)destination$iv;
  }
  
  @NotNull
  public static final <K, V, R> List<R> map(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(transform, "transform");Map localMap1 = $receiver;Collection destination$iv = (Collection)new ArrayList($receiver.size());
    























































    int $i$f$mapTo;
    























































    Map $receiver$iv;
    






















































    Map localMap2 = $receiver$iv; for (Map.Entry item$iv : localMap2.entrySet())
      destination$iv.add(transform.invoke(item$iv));
    return (List)destination$iv;
  }
  
  @InlineOnly
  private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> maxBy(@NotNull Map<? extends K, ? extends V> $receiver, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector)
  {
    ;
    Iterable $receiver$iv = (Iterable)$receiver.entrySet();
    









































    int $i$f$maxBy;
    








































    Iterator iterator$iv = $receiver$iv.iterator();
    
    Object maxElem$iv = iterator$iv.next();
    Comparable maxValue$iv = (Comparable)selector.invoke(maxElem$iv);
    while (iterator$iv.hasNext()) {
      Object e$iv = iterator$iv.next();
      Comparable v$iv = (Comparable)selector.invoke(e$iv);
      if (maxValue$iv.compareTo(v$iv) < 0) {
        maxElem$iv = e$iv;
        maxValue$iv = v$iv;
      }
    }
    return (Map.Entry)(!iterator$iv.hasNext() ? null : maxElem$iv);
  }
  
  @org.jetbrains.annotations.Nullable
  public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> minBy(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(selector, "selector");Iterable $receiver$iv = (Iterable)$receiver.entrySet();
    







































    int $i$f$minBy;
    






































    Iterator iterator$iv = $receiver$iv.iterator();
    
    Object minElem$iv = iterator$iv.next();
    Comparable minValue$iv = (Comparable)selector.invoke(minElem$iv);
    while (iterator$iv.hasNext()) {
      Object e$iv = iterator$iv.next();
      Comparable v$iv = (Comparable)selector.invoke(e$iv);
      if (minValue$iv.compareTo(v$iv) > 0) {
        minElem$iv = e$iv;
        minValue$iv = v$iv;
      }
    }
    return (Map.Entry)(!iterator$iv.hasNext() ? null : minElem$iv);
  }
  
  /* Error */
  @NotNull
  public static final <K, V, R> List<R> mapNotNull(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 9
    //   3: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 87
    //   9: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: astore_3
    //   14: new 67	java/util/ArrayList
    //   17: dup
    //   18: invokespecial 90	java/util/ArrayList:<init>	()V
    //   21: checkcast 92	java/util/Collection
    //   24: astore 4
    //   26: aload_3
    //   27: astore 5
    //   29: aload 5
    //   31: astore 6
    //   33: aload 6
    //   35: invokeinterface 31 1 0
    //   40: invokeinterface 37 1 0
    //   45: astore 7
    //   47: aload 7
    //   49: invokeinterface 43 1 0
    //   54: ifeq +55 -> 109
    //   57: aload 7
    //   59: invokeinterface 47 1 0
    //   64: checkcast 49	java/util/Map$Entry
    //   67: astore 8
    //   69: aload 8
    //   71: astore 9
    //   73: aload_1
    //   74: aload 9
    //   76: invokeinterface 98 2 0
    //   81: dup
    //   82: ifnull +22 -> 104
    //   85: astore 10
    //   87: aload 10
    //   89: astore 11
    //   91: aload 4
    //   93: aload 11
    //   95: invokeinterface 124 2 0
    //   100: pop
    //   101: goto +4 -> 105
    //   104: pop
    //   105: nop
    //   106: goto -59 -> 47
    //   109: nop
    //   110: aload 4
    //   112: checkcast 76	java/util/List
    //   115: areturn
    // Line number table:
    //   Java source line #69	-> byte code offset #12
    //   Java source line #234	-> byte code offset #26
    //   Java source line #235	-> byte code offset #29
    //   Java source line #235	-> byte code offset #69
    //   Java source line #234	-> byte code offset #73
    //   Java source line #234	-> byte code offset #91
    //   Java source line #234	-> byte code offset #101
    //   Java source line #234	-> byte code offset #105
    //   Java source line #236	-> byte code offset #109
    //   Java source line #237	-> byte code offset #110
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	$receiver	Map
    //   0	116	1	transform	Function1
    //   0	116	2	$i$f$mapNotNull	int
    //   26	86	3	$receiver$iv	Map
    //   26	86	4	destination$iv	Collection
    //   29	81	5	$receiver$iv$iv	Map
    //   69	37	8	element$iv$iv	Map.Entry
    //   73	32	9	element$iv	Map.Entry
    //   91	9	11	it$iv	Object
    //   91	9	12	$i$a$1$let	int
    //   73	32	13	$i$a$1$forEach	int
    //   29	81	14	$i$f$forEach	int
    //   26	86	15	$i$f$mapNotNullTo	int
  }
  
  /* Error */
  @NotNull
  public static final <K, V, R, C extends Collection<? super R>> C mapNotNullTo(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull C destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 9
    //   3: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 120
    //   9: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_2
    //   13: ldc 87
    //   15: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   18: aload_0
    //   19: astore 4
    //   21: aload 4
    //   23: astore 5
    //   25: aload 5
    //   27: invokeinterface 31 1 0
    //   32: invokeinterface 37 1 0
    //   37: astore 6
    //   39: aload 6
    //   41: invokeinterface 43 1 0
    //   46: ifeq +54 -> 100
    //   49: aload 6
    //   51: invokeinterface 47 1 0
    //   56: checkcast 49	java/util/Map$Entry
    //   59: astore 7
    //   61: aload 7
    //   63: astore 8
    //   65: aload_2
    //   66: aload 8
    //   68: invokeinterface 98 2 0
    //   73: dup
    //   74: ifnull +21 -> 95
    //   77: astore 9
    //   79: aload 9
    //   81: astore 10
    //   83: aload_1
    //   84: aload 10
    //   86: invokeinterface 124 2 0
    //   91: pop
    //   92: goto +4 -> 96
    //   95: pop
    //   96: nop
    //   97: goto -58 -> 39
    //   100: nop
    //   101: aload_1
    //   102: areturn
    // Line number table:
    //   Java source line #77	-> byte code offset #18
    //   Java source line #238	-> byte code offset #21
    //   Java source line #238	-> byte code offset #61
    //   Java source line #77	-> byte code offset #65
    //   Java source line #77	-> byte code offset #83
    //   Java source line #77	-> byte code offset #92
    //   Java source line #77	-> byte code offset #96
    //   Java source line #239	-> byte code offset #100
    //   Java source line #78	-> byte code offset #101
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	$receiver	Map
    //   0	103	1	destination	Collection
    //   0	103	2	transform	Function1
    //   0	103	3	$i$f$mapNotNullTo	int
    //   21	80	4	$receiver$iv	Map
    //   61	36	7	element$iv	Map.Entry
    //   65	31	8	element	Map.Entry
    //   83	8	10	it	Object
    //   83	8	11	$i$a$1$let	int
    //   65	31	12	$i$a$1$forEach	int
    //   21	80	13	$i$f$forEach	int
  }
  
  /* Error */
  public static final <K, V> boolean all(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 9
    //   3: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc -111
    //   9: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: invokeinterface 148 1 0
    //   18: ifeq +5 -> 23
    //   21: iconst_1
    //   22: ireturn
    //   23: aload_0
    //   24: astore 5
    //   26: aload 5
    //   28: invokeinterface 31 1 0
    //   33: invokeinterface 37 1 0
    //   38: astore 4
    //   40: aload 4
    //   42: invokeinterface 43 1 0
    //   47: ifeq +35 -> 82
    //   50: aload 4
    //   52: invokeinterface 47 1 0
    //   57: checkcast 49	java/util/Map$Entry
    //   60: astore_3
    //   61: aload_1
    //   62: aload_3
    //   63: invokeinterface 98 2 0
    //   68: checkcast 150	java/lang/Boolean
    //   71: invokevirtual 153	java/lang/Boolean:booleanValue	()Z
    //   74: ifne -34 -> 40
    //   77: iconst_0
    //   78: ireturn
    //   79: nop
    //   80: nop
    //   81: athrow
    //   82: iconst_1
    //   83: ireturn
    // Line number table:
    //   Java source line #97	-> byte code offset #12
    //   Java source line #98	-> byte code offset #23
    //   Java source line #98	-> byte code offset #61
    //   Java source line #99	-> byte code offset #82
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	$receiver	Map
    //   0	84	1	predicate	Function1
    //   0	84	2	$i$f$all	int
    //   61	18	3	element	Map.Entry
  }
  
  /* Error */
  public static final <K, V> boolean any(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 9
    //   3: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc -111
    //   9: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: invokeinterface 148 1 0
    //   18: ifeq +5 -> 23
    //   21: iconst_0
    //   22: ireturn
    //   23: aload_0
    //   24: astore 5
    //   26: aload 5
    //   28: invokeinterface 31 1 0
    //   33: invokeinterface 37 1 0
    //   38: astore 4
    //   40: aload 4
    //   42: invokeinterface 43 1 0
    //   47: ifeq +35 -> 82
    //   50: aload 4
    //   52: invokeinterface 47 1 0
    //   57: checkcast 49	java/util/Map$Entry
    //   60: astore_3
    //   61: aload_1
    //   62: aload_3
    //   63: invokeinterface 98 2 0
    //   68: checkcast 150	java/lang/Boolean
    //   71: invokevirtual 153	java/lang/Boolean:booleanValue	()Z
    //   74: ifeq -34 -> 40
    //   77: iconst_1
    //   78: ireturn
    //   79: nop
    //   80: nop
    //   81: athrow
    //   82: iconst_0
    //   83: ireturn
    // Line number table:
    //   Java source line #117	-> byte code offset #12
    //   Java source line #118	-> byte code offset #23
    //   Java source line #118	-> byte code offset #61
    //   Java source line #119	-> byte code offset #82
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	$receiver	Map
    //   0	84	1	predicate	Function1
    //   0	84	2	$i$f$any	int
    //   61	18	3	element	Map.Entry
  }
  
  /* Error */
  public static final <K, V> boolean none(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 9
    //   3: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc -111
    //   9: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: invokeinterface 148 1 0
    //   18: ifeq +5 -> 23
    //   21: iconst_1
    //   22: ireturn
    //   23: aload_0
    //   24: astore 5
    //   26: aload 5
    //   28: invokeinterface 31 1 0
    //   33: invokeinterface 37 1 0
    //   38: astore 4
    //   40: aload 4
    //   42: invokeinterface 43 1 0
    //   47: ifeq +35 -> 82
    //   50: aload 4
    //   52: invokeinterface 47 1 0
    //   57: checkcast 49	java/util/Map$Entry
    //   60: astore_3
    //   61: aload_1
    //   62: aload_3
    //   63: invokeinterface 98 2 0
    //   68: checkcast 150	java/lang/Boolean
    //   71: invokevirtual 153	java/lang/Boolean:booleanValue	()Z
    //   74: ifeq -34 -> 40
    //   77: iconst_0
    //   78: ireturn
    //   79: nop
    //   80: nop
    //   81: athrow
    //   82: iconst_1
    //   83: ireturn
    // Line number table:
    //   Java source line #197	-> byte code offset #12
    //   Java source line #198	-> byte code offset #23
    //   Java source line #198	-> byte code offset #61
    //   Java source line #199	-> byte code offset #82
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	$receiver	Map
    //   0	84	1	predicate	Function1
    //   0	84	2	$i$f$none	int
    //   61	18	3	element	Map.Entry
  }
  
  public MapsKt___MapsKt() {}
}

package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.comparisons.ComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;



























@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000x\n\000\n\002\030\002\n\002\020\036\n\002\b\003\n\002\020\b\n\000\n\002\020 \n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020!\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\002\b\005\n\002\020\000\n\002\b\004\n\002\020\002\n\002\b\t\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\017\n\002\b\007\n\002\020\013\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\006\032@\020\013\032\b\022\004\022\002H\0070\b\"\004\b\000\020\0072\006\020\f\032\0020\0062!\020\r\032\035\022\023\022\0210\006¢\006\f\b\017\022\b\b\020\022\004\b\b(\021\022\004\022\002H\0070\016H\b\032@\020\022\032\b\022\004\022\002H\0070\023\"\004\b\000\020\0072\006\020\f\032\0020\0062!\020\r\032\035\022\023\022\0210\006¢\006\f\b\017\022\b\b\020\022\004\b\b(\021\022\004\022\002H\0070\016H\b\032\037\020\024\032\022\022\004\022\002H\0070\025j\b\022\004\022\002H\007`\026\"\004\b\000\020\007H\b\0325\020\024\032\022\022\004\022\002H\0070\025j\b\022\004\022\002H\007`\026\"\004\b\000\020\0072\022\020\027\032\n\022\006\b\001\022\002H\0070\030\"\002H\007¢\006\002\020\031\032\022\020\032\032\b\022\004\022\002H\0070\b\"\004\b\000\020\007\032\025\020\033\032\b\022\004\022\002H\0070\b\"\004\b\000\020\007H\b\032+\020\033\032\b\022\004\022\002H\0070\b\"\004\b\000\020\0072\022\020\027\032\n\022\006\b\001\022\002H\0070\030\"\002H\007¢\006\002\020\034\032%\020\035\032\b\022\004\022\002H\0070\b\"\b\b\000\020\007*\0020\0362\b\020\037\032\004\030\001H\007¢\006\002\020 \0323\020\035\032\b\022\004\022\002H\0070\b\"\b\b\000\020\007*\0020\0362\026\020\027\032\f\022\b\b\001\022\004\030\001H\0070\030\"\004\030\001H\007¢\006\002\020\034\032\025\020!\032\b\022\004\022\002H\0070\023\"\004\b\000\020\007H\b\032+\020!\032\b\022\004\022\002H\0070\023\"\004\b\000\020\0072\022\020\027\032\n\022\006\b\001\022\002H\0070\030\"\002H\007¢\006\002\020\034\032%\020\"\032\0020#2\006\020\f\032\0020\0062\006\020$\032\0020\0062\006\020%\032\0020\006H\002¢\006\002\b&\032\b\020'\032\0020#H\001\032\b\020(\032\0020#H\001\032%\020)\032\b\022\004\022\002H\0070\002\"\004\b\000\020\007*\n\022\006\b\001\022\002H\0070\030H\000¢\006\002\020*\032S\020+\032\0020\006\"\004\b\000\020\007*\b\022\004\022\002H\0070\b2\006\020\037\032\002H\0072\032\020,\032\026\022\006\b\000\022\002H\0070-j\n\022\006\b\000\022\002H\007`.2\b\b\002\020$\032\0020\0062\b\b\002\020%\032\0020\006¢\006\002\020/\032>\020+\032\0020\006\"\004\b\000\020\007*\b\022\004\022\002H\0070\b2\b\b\002\020$\032\0020\0062\b\b\002\020%\032\0020\0062\022\0200\032\016\022\004\022\002H\007\022\004\022\0020\0060\016\032E\020+\032\0020\006\"\016\b\000\020\007*\b\022\004\022\002H\00701*\n\022\006\022\004\030\001H\0070\b2\b\020\037\032\004\030\001H\0072\b\b\002\020$\032\0020\0062\b\b\002\020%\032\0020\006¢\006\002\0202\032d\0203\032\0020\006\"\004\b\000\020\007\"\016\b\001\0204*\b\022\004\022\002H401*\b\022\004\022\002H\0070\b2\b\0205\032\004\030\001H42\b\b\002\020$\032\0020\0062\b\b\002\020%\032\0020\0062\026\b\004\0206\032\020\022\004\022\002H\007\022\006\022\004\030\001H40\016H\b¢\006\002\0207\032,\0208\032\00209\"\t\b\000\020\007¢\006\002\b:*\b\022\004\022\002H\0070\0022\f\020\027\032\b\022\004\022\002H\0070\002H\b\0328\020;\032\002H<\"\020\b\000\020=*\006\022\002\b\0030\002*\002H<\"\004\b\001\020<*\002H=2\f\020>\032\b\022\004\022\002H<0?H\b¢\006\002\020@\032\031\020A\032\00209\"\004\b\000\020\007*\b\022\004\022\002H\0070\002H\b\032,\020B\032\00209\"\004\b\000\020\007*\n\022\004\022\002H\007\030\0010\002H\b\002\016\n\f\b\000\022\002\030\001\032\004\b\003\020\000\032\036\020C\032\b\022\004\022\002H\0070\b\"\004\b\000\020\007*\b\022\004\022\002H\0070\bH\000\032!\020D\032\b\022\004\022\002H\0070\002\"\004\b\000\020\007*\n\022\004\022\002H\007\030\0010\002H\b\032!\020D\032\b\022\004\022\002H\0070\b\"\004\b\000\020\007*\n\022\004\022\002H\007\030\0010\bH\b\"\031\020\000\032\0020\001*\006\022\002\b\0030\0028F¢\006\006\032\004\b\003\020\004\"!\020\005\032\0020\006\"\004\b\000\020\007*\b\022\004\022\002H\0070\b8F¢\006\006\032\004\b\t\020\n¨\006E"}, d2={"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "lastIndex", "", "T", "", "getLastIndex", "(Ljava/util/List;)I", "List", "size", "init", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "MutableList", "", "arrayListOf", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "elements", "", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "emptyList", "listOf", "([Ljava/lang/Object;)Ljava/util/List;", "listOfNotNull", "", "element", "(Ljava/lang/Object;)Ljava/util/List;", "mutableListOf", "rangeCheck", "", "fromIndex", "toIndex", "rangeCheck$CollectionsKt__CollectionsKt", "throwCountOverflow", "throwIndexOverflow", "asCollection", "([Ljava/lang/Object;)Ljava/util/Collection;", "binarySearch", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;II)I", "comparison", "", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "binarySearchBy", "K", "key", "selector", "(Ljava/util/List;Ljava/lang/Comparable;IILkotlin/jvm/functions/Function1;)I", "containsAll", "", "Lkotlin/internal/OnlyInputTypes;", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "isNullOrEmpty", "optimizeReadOnlyList", "orEmpty", "kotlin-stdlib"}, xs="kotlin/collections/CollectionsKt")
class CollectionsKt__CollectionsKt
  extends CollectionsKt__CollectionsJVMKt
{
  @NotNull
  public static final <T> Collection<T> asCollection(@NotNull T[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (Collection)new ArrayAsCollection($receiver, false);
  }
  










  @NotNull
  public static final <T> List<T> emptyList()
  {
    return (List)EmptyList.INSTANCE;
  }
  
  @NotNull
  public static final <T> List<T> listOf(@NotNull T... elements)
  {
    Intrinsics.checkParameterIsNotNull(elements, "elements");return elements.length > 0 ? ArraysKt.asList(elements) : CollectionsKt.emptyList();
  }
  
  @InlineOnly
  private static final <T> List<T> listOf()
  {
    ;
    return CollectionsKt.emptyList();
  }
  
  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <T> List<T> mutableListOf()
  {
    ;
    return (List)new ArrayList();
  }
  
  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <T> ArrayList<T> arrayListOf()
  {
    ;
    return new ArrayList();
  }
  

  @NotNull
  public static final <T> List<T> mutableListOf(@NotNull T... elements)
  {
    Intrinsics.checkParameterIsNotNull(elements, "elements");return elements.length == 0 ? (List)new ArrayList() : (List)new ArrayList((Collection)new ArrayAsCollection(elements, true));
  }
  

  @NotNull
  public static final <T> ArrayList<T> arrayListOf(@NotNull T... elements)
  {
    Intrinsics.checkParameterIsNotNull(elements, "elements");return elements.length == 0 ? new ArrayList() : new ArrayList((Collection)new ArrayAsCollection(elements, true));
  }
  
  @NotNull
  public static final <T> List<T> listOfNotNull(@Nullable T element)
  {
    return element != null ? CollectionsKt.listOf(element) : CollectionsKt.emptyList();
  }
  
  @NotNull
  public static final <T> List<T> listOfNotNull(@NotNull T... elements)
  {
    Intrinsics.checkParameterIsNotNull(elements, "elements");return ArraysKt.filterNotNull(elements);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <T> List<T> List(int size, Function1<? super Integer, ? extends T> init)
  {
    ;
    ArrayList localArrayList = new ArrayList(size);int i = 0; for (int j = size; i < j; i++) { int k = i;localArrayList.add(init.invoke(Integer.valueOf(k))); } return (List)localArrayList;
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <T> List<T> MutableList(int size, Function1<? super Integer, ? extends T> init)
  {
    ;
    
    ArrayList list = new ArrayList(size);
    int i = 0; for (int j = size; i < j; i++) { int index = i; int $i$a$1$repeat; list.add(init.invoke(Integer.valueOf(index))); }
    return (List)list;
  }
  


  @NotNull
  public static final IntRange getIndices(@NotNull Collection<?> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int i = 0;return new IntRange(i, $receiver.size() - 1);
  }
  



  public static final <T> int getLastIndex(@NotNull List<? extends T> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.size() - 1;
  }
  
  @InlineOnly
  private static final <T> boolean isNotEmpty(@NotNull Collection<? extends T> $receiver)
  {
    ;
    return !$receiver.isEmpty();
  }
  



  @SinceKotlin(version="1.3")
  @InlineOnly
  private static final <T> boolean isNullOrEmpty(@Nullable Collection<? extends T> $receiver)
  {
    ;
    

    return ($receiver == null) || ($receiver.isEmpty());
  }
  
  /* Error */
  @InlineOnly
  private static final <T> Collection<T> orEmpty(@Nullable Collection<? extends T> $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: ifnull +6 -> 8
    //   5: goto +10 -> 15
    //   8: pop
    //   9: invokestatic 48	kotlin/collections/CollectionsKt:emptyList	()Ljava/util/List;
    //   12: checkcast 23	java/util/Collection
    //   15: areturn
    // Line number table:
    //   Java source line #189	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	16	0	$receiver	Collection
    //   0	16	1	$i$f$orEmpty	int
  }
  
  /* Error */
  @InlineOnly
  private static final <T> List<T> orEmpty(@Nullable List<? extends T> $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: ifnull +6 -> 8
    //   5: goto +7 -> 12
    //   8: pop
    //   9: invokestatic 48	kotlin/collections/CollectionsKt:emptyList	()Ljava/util/List;
    //   12: areturn
    // Line number table:
    //   Java source line #196	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	13	0	$receiver	List
    //   0	13	1	$i$f$orEmpty	int
  }
  
  @SinceKotlin(version="1.3")
  @InlineOnly
  private static final <C extends Collection<?>,  extends R, R> R ifEmpty(C $receiver, Function0<? extends R> defaultValue)
  {
    ;
    return $receiver.isEmpty() ? defaultValue.invoke() : $receiver;
  }
  


  @InlineOnly
  private static final <T> boolean containsAll(@NotNull Collection<? extends T> $receiver, Collection<? extends T> elements)
  {
    ;
    

    return $receiver.containsAll(elements); }
  @NotNull
  public static final <T> List<T> optimizeReadOnlyList(@NotNull List<? extends T> $receiver) { Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); switch ($receiver.size()) {
    case 0: 
      break;
    case 1:  break; }
    return $receiver;
  }
  














  public static final <T extends Comparable<? super T>> int binarySearch(@NotNull List<? extends T> $receiver, @Nullable T element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");rangeCheck$CollectionsKt__CollectionsKt($receiver.size(), fromIndex, toIndex);
    
    int low = fromIndex;
    int high = toIndex - 1;
    
    while (low <= high) {
      int mid = low + high >>> 1;
      Comparable midVal = (Comparable)$receiver.get(mid);
      int cmp = ComparisonsKt.compareValues(midVal, element);
      
      if (cmp < 0) {
        low = mid + 1;
      } else if (cmp > 0) {
        high = mid - 1;
      } else
        return mid;
    }
    return -(low + 1);
  }
  














  public static final <T> int binarySearch(@NotNull List<? extends T> $receiver, T element, @NotNull Comparator<? super T> comparator, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(comparator, "comparator");rangeCheck$CollectionsKt__CollectionsKt($receiver.size(), fromIndex, toIndex);
    
    int low = fromIndex;
    int high = toIndex - 1;
    
    while (low <= high) {
      int mid = low + high >>> 1;
      Object midVal = $receiver.get(mid);
      int cmp = comparator.compare(midVal, element);
      
      if (cmp < 0) {
        low = mid + 1;
      } else if (cmp > 0) {
        high = mid - 1;
      } else
        return mid;
    }
    return -(low + 1);
  }
  










  public static final <T, K extends Comparable<? super K>> int binarySearchBy(@NotNull List<? extends T> $receiver, @Nullable final K key, int fromIndex, int toIndex, @NotNull Function1<? super T, ? extends K> selector)
  {
    ;
    








    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(selector, "selector");CollectionsKt.binarySearch($receiver, fromIndex, toIndex, (Function1)new Lambda(selector) { public final int invoke(T it) { return ComparisonsKt.compareValues((Comparable)$selector.invoke(it), key); }
    });
  }
  

















  public static final <T> int binarySearch(@NotNull List<? extends T> $receiver, int fromIndex, int toIndex, @NotNull Function1<? super T, Integer> comparison)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(comparison, "comparison");rangeCheck$CollectionsKt__CollectionsKt($receiver.size(), fromIndex, toIndex);
    
    int low = fromIndex;
    int high = toIndex - 1;
    
    while (low <= high) {
      int mid = low + high >>> 1;
      Object midVal = $receiver.get(mid);
      int cmp = ((Number)comparison.invoke(midVal)).intValue();
      
      if (cmp < 0) {
        low = mid + 1;
      } else if (cmp > 0) {
        high = mid - 1;
      } else
        return mid;
    }
    return -(low + 1);
  }
  




  private static final void rangeCheck$CollectionsKt__CollectionsKt(int size, int fromIndex, int toIndex)
  {
    if (fromIndex > toIndex) throw ((Throwable)new IllegalArgumentException("fromIndex (" + fromIndex + ") is greater than toIndex (" + toIndex + ")."));
    if (fromIndex < 0) throw ((Throwable)new IndexOutOfBoundsException("fromIndex (" + fromIndex + ") is less than zero."));
    if (toIndex > size) { throw ((Throwable)new IndexOutOfBoundsException("toIndex (" + toIndex + ") is greater than size (" + size + ")."));
    }
  }
  










  @PublishedApi
  @SinceKotlin(version="1.3")
  public static final void throwIndexOverflow() { throw ((Throwable)new ArithmeticException("Index overflow has happened.")); }
  
  @PublishedApi
  @SinceKotlin(version="1.3")
  public static final void throwCountOverflow() { throw ((Throwable)new ArithmeticException("Count overflow has happened.")); }
  
  public CollectionsKt__CollectionsKt() {}
}

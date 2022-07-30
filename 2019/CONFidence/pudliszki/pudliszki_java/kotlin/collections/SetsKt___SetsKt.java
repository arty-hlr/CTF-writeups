package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;




















@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\034\n\000\n\002\020\"\n\002\b\004\n\002\020\021\n\000\n\002\020\034\n\002\030\002\n\002\b\004\032,\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\006\020\003\032\002H\002H\002¢\006\002\020\004\0324\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\016\020\005\032\n\022\006\b\001\022\002H\0020\006H\002¢\006\002\020\007\032-\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\f\020\005\032\b\022\004\022\002H\0020\bH\002\032-\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\f\020\005\032\b\022\004\022\002H\0020\tH\002\032,\020\n\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\006\020\003\032\002H\002H\b¢\006\002\020\004\032,\020\013\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\006\020\003\032\002H\002H\002¢\006\002\020\004\0324\020\013\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\016\020\005\032\n\022\006\b\001\022\002H\0020\006H\002¢\006\002\020\007\032-\020\013\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\f\020\005\032\b\022\004\022\002H\0020\bH\002\032-\020\013\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\f\020\005\032\b\022\004\022\002H\0020\tH\002\032,\020\f\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\006\020\003\032\002H\002H\b¢\006\002\020\004¨\006\r"}, d2={"minus", "", "T", "element", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "elements", "", "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", "", "Lkotlin/sequences/Sequence;", "minusElement", "plus", "plusElement", "kotlin-stdlib"}, xs="kotlin/collections/SetsKt")
class SetsKt___SetsKt
  extends SetsKt__SetsKt
{
  @NotNull
  public static final <T> Set<T> minus(@NotNull Set<? extends T> $receiver, @NotNull T[] elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");LinkedHashSet result = new LinkedHashSet((Collection)$receiver);
    CollectionsKt.removeAll((Collection)result, elements);
    return (Set)result;
  }
  






  @NotNull
  public static final <T> Set<T> minus(@NotNull Set<? extends T> $receiver, @NotNull Iterable<? extends T> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");Collection other = CollectionsKt.convertToSetForSetOperationWith(elements, (Iterable)$receiver);
    if (other.isEmpty())
      return CollectionsKt.toSet((Iterable)$receiver);
    if ((other instanceof Set)) {
      Iterable localIterable1 = (Iterable)$receiver;Collection destination$iv = (Collection)new LinkedHashSet();
      





























      int $i$f$filterNotTo;
      





























      Iterable $receiver$iv;
      





























      for (Object element$iv : $receiver$iv) { Object it = element$iv;
        int $i$a$2$filterNotTo;
        if (!other.contains(it)) { destination$iv.add(element$iv);
        }
      }
      


























































































      return (Set)destination$iv;
    }
    LinkedHashSet result = new LinkedHashSet((Collection)$receiver);
    result.removeAll(other);
    return (Set)result;
  }
  






  @NotNull
  public static final <T> Set<T> minus(@NotNull Set<? extends T> $receiver, @NotNull Sequence<? extends T> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");LinkedHashSet result = new LinkedHashSet((Collection)$receiver);
    CollectionsKt.removeAll((Collection)result, elements);
    return (Set)result;
  }
  


  @InlineOnly
  private static final <T> Set<T> minusElement(@NotNull Set<? extends T> $receiver, T element)
  {
    ;
    
    return SetsKt.minus($receiver, element);
  }
  



  @NotNull
  public static final <T> Set<T> plus(@NotNull Set<? extends T> $receiver, T element)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity($receiver.size() + 1));
    result.addAll((Collection)$receiver);
    result.add(element);
    return (Set)result;
  }
  




  @NotNull
  public static final <T> Set<T> plus(@NotNull Set<? extends T> $receiver, @NotNull T[] elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity($receiver.size() + elements.length));
    result.addAll((Collection)$receiver);
    CollectionsKt.addAll((Collection)result, elements);
    return (Set)result;
  }
  
















  @NotNull
  public static final <T> Set<T> plus(@NotNull Set<? extends T> $receiver, @NotNull Sequence<? extends T> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity($receiver.size() * 2));
    result.addAll((Collection)$receiver);
    CollectionsKt.addAll((Collection)result, elements);
    return (Set)result;
  }
  


  @InlineOnly
  private static final <T> Set<T> plusElement(@NotNull Set<? extends T> $receiver, T element)
  {
    ;
    
    return SetsKt.plus($receiver, element);
  }
  
  @NotNull
  public static final <T> Set<T> minus(@NotNull Set<? extends T> $receiver, T element)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity($receiver.size()));
    boolean removed = false;
    Iterable $receiver$iv = (Iterable)$receiver;
    



























































    int $i$f$filterTo;
    


























































    for (Object element$iv : $receiver$iv) { Object it = element$iv;
      int $i$a$1$filterTo;
      removed = true; if (((!removed) && (Intrinsics.areEqual(it, element)) ? 0 : 1) != 0) { ((Collection)result).add(element$iv);
      }
    }
    






















































































































    return (Set)result;
  }
  
  /* Error */
  @NotNull
  public static final <T> Set<T> plus(@NotNull Set<? extends T> $receiver, @NotNull Iterable<? extends T> elements)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 9
    //   3: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 79
    //   9: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_1
    //   13: invokestatic 138	kotlin/collections/CollectionsKt:collectionSizeOrNull	(Ljava/lang/Iterable;)Ljava/lang/Integer;
    //   16: dup
    //   17: ifnull +29 -> 46
    //   20: astore_3
    //   21: aload_3
    //   22: checkcast 140	java/lang/Number
    //   25: invokevirtual 143	java/lang/Number:intValue	()I
    //   28: istore 4
    //   30: aload_0
    //   31: invokeinterface 23 1 0
    //   36: iload 4
    //   38: iadd
    //   39: istore 8
    //   41: iload 8
    //   43: goto +12 -> 55
    //   46: pop
    //   47: aload_0
    //   48: invokeinterface 23 1 0
    //   53: iconst_2
    //   54: imul
    //   55: invokestatic 29	kotlin/collections/MapsKt:mapCapacity	(I)I
    //   58: istore 9
    //   60: new 17	java/util/LinkedHashSet
    //   63: dup
    //   64: iload 9
    //   66: invokespecial 33	java/util/LinkedHashSet:<init>	(I)V
    //   69: astore_2
    //   70: aload_2
    //   71: aload_0
    //   72: checkcast 55	java/util/Collection
    //   75: invokevirtual 131	java/util/LinkedHashSet:addAll	(Ljava/util/Collection;)Z
    //   78: pop
    //   79: aload_2
    //   80: checkcast 55	java/util/Collection
    //   83: aload_1
    //   84: invokestatic 146	kotlin/collections/CollectionsKt:addAll	(Ljava/util/Collection;Ljava/lang/Iterable;)Z
    //   87: pop
    //   88: aload_2
    //   89: checkcast 19	java/util/Set
    //   92: areturn
    // Line number table:
    //   Java source line #117	-> byte code offset #12
    //   Java source line #117	-> byte code offset #30
    //   Java source line #117	-> byte code offset #39
    //   Java source line #117	-> byte code offset #47
    //   Java source line #118	-> byte code offset #70
    //   Java source line #119	-> byte code offset #79
    //   Java source line #120	-> byte code offset #88
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	$receiver	Set
    //   0	93	1	elements	Iterable
    //   70	23	2	result	LinkedHashSet
    //   30	9	4	it	int
    //   30	9	5	$i$a$1$let	int
  }
  
  public SetsKt___SetsKt() {}
}

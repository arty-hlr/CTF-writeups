package kotlin.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.random.Random;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000^\n\000\n\002\020\013\n\000\n\002\020\037\n\000\n\002\020\021\n\000\n\002\020\034\n\002\030\002\n\000\n\002\020\035\n\000\n\002\030\002\n\002\b\002\n\002\020!\n\000\n\002\020\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\036\n\002\b\005\n\002\030\002\n\000\n\002\020 \n\000\032-\020\000\032\0020\001\"\004\b\000\020\002*\n\022\006\b\000\022\002H\0020\0032\016\020\004\032\n\022\006\b\001\022\002H\0020\005¢\006\002\020\006\032&\020\000\032\0020\001\"\004\b\000\020\002*\n\022\006\b\000\022\002H\0020\0032\f\020\004\032\b\022\004\022\002H\0020\007\032&\020\000\032\0020\001\"\004\b\000\020\002*\n\022\006\b\000\022\002H\0020\0032\f\020\004\032\b\022\004\022\002H\0020\b\0329\020\t\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\n2\022\020\013\032\016\022\004\022\002H\002\022\004\022\0020\0010\f2\006\020\r\032\0020\001H\002¢\006\002\b\016\0329\020\t\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0172\022\020\013\032\016\022\004\022\002H\002\022\004\022\0020\0010\f2\006\020\r\032\0020\001H\002¢\006\002\b\016\032(\020\020\032\0020\021\"\004\b\000\020\002*\n\022\006\b\000\022\002H\0020\0032\006\020\022\032\002H\002H\n¢\006\002\020\023\032.\020\020\032\0020\021\"\004\b\000\020\002*\n\022\006\b\000\022\002H\0020\0032\f\020\004\032\b\022\004\022\002H\0020\005H\n¢\006\002\020\024\032)\020\020\032\0020\021\"\004\b\000\020\002*\n\022\006\b\000\022\002H\0020\0032\f\020\004\032\b\022\004\022\002H\0020\007H\n\032)\020\020\032\0020\021\"\004\b\000\020\002*\n\022\006\b\000\022\002H\0020\0032\f\020\004\032\b\022\004\022\002H\0020\bH\n\032(\020\025\032\0020\021\"\004\b\000\020\002*\n\022\006\b\000\022\002H\0020\0032\006\020\022\032\002H\002H\n¢\006\002\020\023\032.\020\025\032\0020\021\"\004\b\000\020\002*\n\022\006\b\000\022\002H\0020\0032\f\020\004\032\b\022\004\022\002H\0020\005H\n¢\006\002\020\024\032)\020\025\032\0020\021\"\004\b\000\020\002*\n\022\006\b\000\022\002H\0020\0032\f\020\004\032\b\022\004\022\002H\0020\007H\n\032)\020\025\032\0020\021\"\004\b\000\020\002*\n\022\006\b\000\022\002H\0020\0032\f\020\004\032\b\022\004\022\002H\0020\bH\n\032-\020\026\032\0020\001\"\t\b\000\020\002¢\006\002\b\027*\n\022\006\b\001\022\002H\0020\0032\006\020\022\032\002H\002H\b¢\006\002\020\030\032&\020\026\032\002H\002\"\004\b\000\020\002*\b\022\004\022\002H\0020\0172\006\020\031\032\0020\032H\b¢\006\002\020\033\032-\020\034\032\0020\001\"\004\b\000\020\002*\n\022\006\b\000\022\002H\0020\0032\016\020\004\032\n\022\006\b\001\022\002H\0020\005¢\006\002\020\006\032&\020\034\032\0020\001\"\004\b\000\020\002*\n\022\006\b\000\022\002H\0020\0032\f\020\004\032\b\022\004\022\002H\0020\007\032&\020\034\032\0020\001\"\004\b\000\020\002*\n\022\006\b\000\022\002H\0020\0032\f\020\004\032\b\022\004\022\002H\0020\b\032.\020\034\032\0020\001\"\t\b\000\020\002¢\006\002\b\027*\n\022\006\b\001\022\002H\0020\0032\f\020\004\032\b\022\004\022\002H\0020\035H\b\032*\020\034\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\n2\022\020\013\032\016\022\004\022\002H\002\022\004\022\0020\0010\f\032*\020\034\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0172\022\020\013\032\016\022\004\022\002H\002\022\004\022\0020\0010\f\032-\020\036\032\0020\001\"\004\b\000\020\002*\n\022\006\b\000\022\002H\0020\0032\016\020\004\032\n\022\006\b\001\022\002H\0020\005¢\006\002\020\006\032&\020\036\032\0020\001\"\004\b\000\020\002*\n\022\006\b\000\022\002H\0020\0032\f\020\004\032\b\022\004\022\002H\0020\007\032&\020\036\032\0020\001\"\004\b\000\020\002*\n\022\006\b\000\022\002H\0020\0032\f\020\004\032\b\022\004\022\002H\0020\b\032.\020\036\032\0020\001\"\t\b\000\020\002¢\006\002\b\027*\n\022\006\b\001\022\002H\0020\0032\f\020\004\032\b\022\004\022\002H\0020\035H\b\032*\020\036\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\n2\022\020\013\032\016\022\004\022\002H\002\022\004\022\0020\0010\f\032*\020\036\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0172\022\020\013\032\016\022\004\022\002H\002\022\004\022\0020\0010\f\032\025\020\037\032\0020\001*\006\022\002\b\0030\003H\002¢\006\002\b \032 \020!\032\0020\021\"\004\b\000\020\002*\b\022\004\022\002H\0020\0172\006\020\"\032\0020#H\007\032&\020$\032\b\022\004\022\002H\0020%\"\004\b\000\020\002*\b\022\004\022\002H\0020\0072\006\020\"\032\0020#H\007¨\006&"}, d2={"addAll", "", "T", "", "elements", "", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "Lkotlin/sequences/Sequence;", "filterInPlace", "", "predicate", "Lkotlin/Function1;", "predicateResultToRemove", "filterInPlace$CollectionsKt__MutableCollectionsKt", "", "minusAssign", "", "element", "(Ljava/util/Collection;Ljava/lang/Object;)V", "(Ljava/util/Collection;[Ljava/lang/Object;)V", "plusAssign", "remove", "Lkotlin/internal/OnlyInputTypes;", "(Ljava/util/Collection;Ljava/lang/Object;)Z", "index", "", "(Ljava/util/List;I)Ljava/lang/Object;", "removeAll", "", "retainAll", "retainNothing", "retainNothing$CollectionsKt__MutableCollectionsKt", "shuffle", "random", "Lkotlin/random/Random;", "shuffled", "", "kotlin-stdlib"}, xs="kotlin/collections/CollectionsKt")
class CollectionsKt__MutableCollectionsKt extends CollectionsKt__MutableCollectionsJVMKt
{
  @InlineOnly
  private static final <T> boolean remove(@NotNull Collection<? extends T> $receiver, T element)
  {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>"); return TypeIntrinsics.asMutableCollection($receiver).remove(element);
  }
  


  @InlineOnly
  private static final <T> boolean removeAll(@NotNull Collection<? extends T> $receiver, Collection<? extends T> elements)
  {
    ;
    

    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>"); return TypeIntrinsics.asMutableCollection($receiver).removeAll(elements);
  }
  


  @InlineOnly
  private static final <T> boolean retainAll(@NotNull Collection<? extends T> $receiver, Collection<? extends T> elements)
  {
    ;
    

    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>"); return TypeIntrinsics.asMutableCollection($receiver).retainAll(elements); }
  
  /**
   * @deprecated
   */
  @kotlin.Deprecated(message="Use removeAt(index) instead.", replaceWith=@kotlin.ReplaceWith(imports={}, expression="removeAt(index)"), level=kotlin.DeprecationLevel.ERROR)
  @InlineOnly
  private static final <T> T remove(@NotNull List<T> $receiver, int index) { ;
    return $receiver.remove(index);
  }
  
  @InlineOnly
  private static final <T> void plusAssign(@NotNull Collection<? super T> $receiver, T element)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");$receiver.add(element);
  }
  

  @InlineOnly
  private static final <T> void plusAssign(@NotNull Collection<? super T> $receiver, Iterable<? extends T> elements)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");CollectionsKt.addAll($receiver, elements);
  }
  

  @InlineOnly
  private static final <T> void plusAssign(@NotNull Collection<? super T> $receiver, T[] elements)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");CollectionsKt.addAll($receiver, elements);
  }
  

  @InlineOnly
  private static final <T> void plusAssign(@NotNull Collection<? super T> $receiver, Sequence<? extends T> elements)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");CollectionsKt.addAll($receiver, elements);
  }
  

  @InlineOnly
  private static final <T> void minusAssign(@NotNull Collection<? super T> $receiver, T element)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");$receiver.remove(element);
  }
  

  @InlineOnly
  private static final <T> void minusAssign(@NotNull Collection<? super T> $receiver, Iterable<? extends T> elements)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");CollectionsKt.removeAll($receiver, elements);
  }
  

  @InlineOnly
  private static final <T> void minusAssign(@NotNull Collection<? super T> $receiver, T[] elements)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");CollectionsKt.removeAll($receiver, elements);
  }
  

  @InlineOnly
  private static final <T> void minusAssign(@NotNull Collection<? super T> $receiver, Sequence<? extends T> elements)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");CollectionsKt.removeAll($receiver, elements);
  }
  


  public static final <T> boolean addAll(@NotNull Collection<? super T> $receiver, @NotNull Iterable<? extends T> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");Iterable localIterable = elements;
    if ((localIterable instanceof Collection)) { return $receiver.addAll((Collection)elements);
    }
    boolean result = false;
    for (Object item : elements)
      if ($receiver.add(item)) result = true;
    return result;
  }
  




  public static final <T> boolean addAll(@NotNull Collection<? super T> $receiver, @NotNull Sequence<? extends T> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");boolean result = false;
    for (Object item : elements) {
      if ($receiver.add(item)) result = true;
    }
    return result;
  }
  


  public static final <T> boolean addAll(@NotNull Collection<? super T> $receiver, @NotNull T[] elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");return $receiver.addAll((Collection)ArraysKt.asList(elements));
  }
  

  public static final <T> boolean removeAll(@NotNull Iterable<? extends T> $receiver, @NotNull Function1<? super T, Boolean> predicate)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(predicate, "predicate");return filterInPlace$CollectionsKt__MutableCollectionsKt($receiver, predicate, true);
  }
  
  public static final <T> boolean retainAll(@NotNull Iterable<? extends T> $receiver, @NotNull Function1<? super T, Boolean> predicate)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(predicate, "predicate");return filterInPlace$CollectionsKt__MutableCollectionsKt($receiver, predicate, false);
  }
  
  private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(@NotNull Iterable<? extends T> $receiver, Function1<? super T, Boolean> predicate, boolean predicateResultToRemove) { boolean result = false;
    Iterator localIterator1 = $receiver.iterator();Iterator $receiver = localIterator1;
    int $i$a$1$with; while ($receiver.hasNext()) {
      if (((Boolean)predicate.invoke($receiver.next())).booleanValue() == predicateResultToRemove) {
        $receiver.remove();
        result = true;
      }
    }
    return result;
  }
  

  public static final <T> boolean removeAll(@NotNull List<T> $receiver, @NotNull Function1<? super T, Boolean> predicate)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(predicate, "predicate");return filterInPlace$CollectionsKt__MutableCollectionsKt($receiver, predicate, true);
  }
  
  public static final <T> boolean retainAll(@NotNull List<T> $receiver, @NotNull Function1<? super T, Boolean> predicate)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(predicate, "predicate");return filterInPlace$CollectionsKt__MutableCollectionsKt($receiver, predicate, false);
  }
  
  private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(@NotNull List<T> $receiver, Function1<? super T, Boolean> predicate, boolean predicateResultToRemove) { if (!($receiver instanceof java.util.RandomAccess)) {
      if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableIterable<T>"); return filterInPlace$CollectionsKt__MutableCollectionsKt(TypeIntrinsics.asMutableIterable($receiver), predicate, predicateResultToRemove);
    }
    int writeIndex = 0;
    int i = 0;int j = CollectionsKt.getLastIndex($receiver); int readIndex; for (i > j;; readIndex++) {
      Object element = $receiver.get(readIndex);
      if (((Boolean)predicate.invoke(element)).booleanValue() != predicateResultToRemove)
      {

        if (writeIndex != readIndex) {
          $receiver.set(writeIndex, element);
        }
        writeIndex++;
      }
      if (readIndex == j) {
        break;
      }
    }
    





    if (writeIndex < $receiver.size()) {
      readIndex = CollectionsKt.getLastIndex($receiver);j = writeIndex; int removeIndex; for (readIndex < j;; removeIndex--) {
        $receiver.remove(removeIndex);
        if (removeIndex == j)
          break;
      }
      return true;
    }
    return false;
  }
  



  public static final <T> boolean removeAll(@NotNull Collection<? super T> $receiver, @NotNull Iterable<? extends T> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");Collection localCollection1 = $receiver;Collection localCollection2 = CollectionsKt.convertToSetForSetOperationWith(elements, (Iterable)$receiver);return TypeIntrinsics.asMutableCollection(localCollection1).removeAll(localCollection2);
  }
  


  public static final <T> boolean removeAll(@NotNull Collection<? super T> $receiver, @NotNull Sequence<? extends T> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");HashSet set = kotlin.sequences.SequencesKt.toHashSet(elements);
    Collection localCollection = (Collection)set; if ((!localCollection.isEmpty() ? 1 : 0) != 0) {} return $receiver.removeAll((Collection)set);
  }
  


  public static final <T> boolean removeAll(@NotNull Collection<? super T> $receiver, @NotNull T[] elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");Object[] arrayOfObject1 = elements;Object[] arrayOfObject2 = arrayOfObject1; if (((arrayOfObject2.length == 0 ? 1 : 0) == 0 ? 1 : 0) != 0) {} return $receiver.removeAll((Collection)ArraysKt.toHashSet(elements));
  }
  


  public static final <T> boolean retainAll(@NotNull Collection<? super T> $receiver, @NotNull Iterable<? extends T> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");Collection localCollection1 = $receiver;Collection localCollection2 = CollectionsKt.convertToSetForSetOperationWith(elements, (Iterable)$receiver);return TypeIntrinsics.asMutableCollection(localCollection1).retainAll(localCollection2);
  }
  


  public static final <T> boolean retainAll(@NotNull Collection<? super T> $receiver, @NotNull T[] elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");Object[] arrayOfObject1 = elements;Object[] arrayOfObject2 = arrayOfObject1; if (((arrayOfObject2.length == 0 ? 1 : 0) == 0 ? 1 : 0) != 0) {
      return $receiver.retainAll((Collection)ArraysKt.toHashSet(elements));
    }
    return retainNothing$CollectionsKt__MutableCollectionsKt($receiver);
  }
  


  public static final <T> boolean retainAll(@NotNull Collection<? super T> $receiver, @NotNull Sequence<? extends T> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");HashSet set = kotlin.sequences.SequencesKt.toHashSet(elements);
    Collection localCollection = (Collection)set; if ((!localCollection.isEmpty() ? 1 : 0) != 0) {
      return $receiver.retainAll((Collection)set);
    }
    return retainNothing$CollectionsKt__MutableCollectionsKt($receiver);
  }
  
  private static final boolean retainNothing$CollectionsKt__MutableCollectionsKt(@NotNull Collection<?> $receiver) {
    Collection localCollection = $receiver;boolean result = !localCollection.isEmpty();
    $receiver.clear();
    return result;
  }
  




  @kotlin.SinceKotlin(version="1.3")
  public static final <T> void shuffle(@NotNull List<T> $receiver, @NotNull Random random)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(random, "random");int i = CollectionsKt.getLastIndex($receiver); int i; for (int j = 1; i >= j; i--) {
      int j = random.nextInt(i + 1);
      Object copy = $receiver.get(i);
      $receiver.set(i, $receiver.get(j));
      $receiver.set(j, copy);
    }
  }
  

  @kotlin.SinceKotlin(version="1.3")
  @NotNull
  public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> $receiver, @NotNull Random random)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(random, "random");List localList1 = CollectionsKt.toMutableList($receiver);List $receiver = localList1; int $i$a$1$apply; CollectionsKt.shuffle($receiver, random);return localList1;
  }
  
  public CollectionsKt__MutableCollectionsKt() {}
}

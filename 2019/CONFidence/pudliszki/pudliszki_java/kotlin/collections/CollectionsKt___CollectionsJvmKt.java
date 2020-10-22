package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000>\n\000\n\002\020 \n\000\n\002\020\034\n\000\n\002\030\002\n\002\b\002\n\002\020\037\n\002\b\003\n\002\020\002\n\000\n\002\020!\n\000\n\002\030\002\n\002\020\017\n\000\n\002\030\002\n\002\030\002\n\000\032(\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\006\022\002\b\0030\0032\f\020\004\032\b\022\004\022\002H\0020\005\032A\020\006\032\002H\007\"\020\b\000\020\007*\n\022\006\b\000\022\002H\0020\b\"\004\b\001\020\002*\006\022\002\b\0030\0032\006\020\t\032\002H\0072\f\020\004\032\b\022\004\022\002H\0020\005¢\006\002\020\n\032\026\020\013\032\0020\f\"\004\b\000\020\r*\b\022\004\022\002H\r0\016\032&\020\017\032\b\022\004\022\002H\r0\020\"\016\b\000\020\r*\b\022\004\022\002H\r0\021*\b\022\004\022\002H\r0\003\0328\020\017\032\b\022\004\022\002H\r0\020\"\004\b\000\020\r*\b\022\004\022\002H\r0\0032\032\020\022\032\026\022\006\b\000\022\002H\r0\023j\n\022\006\b\000\022\002H\r`\024¨\006\025"}, d2={"filterIsInstance", "", "R", "", "klass", "Ljava/lang/Class;", "filterIsInstanceTo", "C", "", "destination", "(Ljava/lang/Iterable;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "reverse", "", "T", "", "toSortedSet", "Ljava/util/SortedSet;", "", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "kotlin-stdlib"}, xs="kotlin/collections/CollectionsKt")
class CollectionsKt___CollectionsJvmKt
  extends CollectionsKt__ReversedViewsKt
{
  @NotNull
  public static final <R> List<R> filterIsInstance(@NotNull Iterable<?> $receiver, @NotNull Class<R> klass)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(klass, "klass");return (List)CollectionsKt.filterIsInstanceTo($receiver, (Collection)new ArrayList(), klass);
  }
  


  @NotNull
  public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@NotNull Iterable<?> $receiver, @NotNull C destination, @NotNull Class<R> klass)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");Intrinsics.checkParameterIsNotNull(klass, "klass"); for (Object element : $receiver) if (klass.isInstance(element)) destination.add(element);
    return destination;
  }
  


  public static final <T> void reverse(@NotNull List<T> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Collections.reverse($receiver);
  }
  

  @NotNull
  public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@NotNull Iterable<? extends T> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (SortedSet)CollectionsKt.toCollection($receiver, (Collection)new TreeSet());
  }
  



  @NotNull
  public static final <T> SortedSet<T> toSortedSet(@NotNull Iterable<? extends T> $receiver, @NotNull Comparator<? super T> comparator)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(comparator, "comparator");return (SortedSet)CollectionsKt.toCollection($receiver, (Collection)new TreeSet(comparator));
  }
  
  public CollectionsKt___CollectionsJvmKt() {}
}

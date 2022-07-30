package kotlin.sequences;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;



@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\0000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\037\n\002\b\003\n\002\030\002\n\000\n\002\020\017\n\000\n\002\030\002\n\002\030\002\n\000\032(\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\006\022\002\b\0030\0012\f\020\003\032\b\022\004\022\002H\0020\004\032A\020\005\032\002H\006\"\020\b\000\020\006*\n\022\006\b\000\022\002H\0020\007\"\004\b\001\020\002*\006\022\002\b\0030\0012\006\020\b\032\002H\0062\f\020\003\032\b\022\004\022\002H\0020\004¢\006\002\020\t\032&\020\n\032\b\022\004\022\002H\f0\013\"\016\b\000\020\f*\b\022\004\022\002H\f0\r*\b\022\004\022\002H\f0\001\0328\020\n\032\b\022\004\022\002H\f0\013\"\004\b\000\020\f*\b\022\004\022\002H\f0\0012\032\020\016\032\026\022\006\b\000\022\002H\f0\017j\n\022\006\b\000\022\002H\f`\020¨\006\021"}, d2={"filterIsInstance", "Lkotlin/sequences/Sequence;", "R", "klass", "Ljava/lang/Class;", "filterIsInstanceTo", "C", "", "destination", "(Lkotlin/sequences/Sequence;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "toSortedSet", "Ljava/util/SortedSet;", "T", "", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "kotlin-stdlib"}, xs="kotlin/sequences/SequencesKt")
class SequencesKt___SequencesJvmKt
  extends SequencesKt__SequencesKt
{
  @NotNull
  public static final <R> Sequence<R> filterIsInstance(@NotNull Sequence<?> $receiver, @NotNull Class<R> klass)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(klass, "klass"); Sequence tmp27_24 = SequencesKt.filter($receiver, (Function1)new Lambda(klass)); if (tmp27_24 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.sequences.Sequence<R>"); return tmp27_24;
  }
  




  @NotNull
  public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@NotNull Sequence<?> $receiver, @NotNull C destination, @NotNull Class<R> klass)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");Intrinsics.checkParameterIsNotNull(klass, "klass"); for (Object element : $receiver) if (klass.isInstance(element)) destination.add(element);
    return destination;
  }
  



  @NotNull
  public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@NotNull Sequence<? extends T> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (SortedSet)SequencesKt.toCollection($receiver, (Collection)new TreeSet());
  }
  





  @NotNull
  public static final <T> SortedSet<T> toSortedSet(@NotNull Sequence<? extends T> $receiver, @NotNull Comparator<? super T> comparator)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(comparator, "comparator");return (SortedSet)SequencesKt.toCollection($receiver, (Collection)new TreeSet(comparator));
  }
  
  public SequencesKt___SequencesJvmKt() {}
}

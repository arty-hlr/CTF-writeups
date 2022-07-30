package kotlin.collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000$\n\000\n\002\020\"\n\002\b\004\n\002\030\002\n\000\n\002\020\021\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\032\037\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\002¢\006\002\020\004\032+\020\005\032\b\022\004\022\002H\0020\006\"\004\b\000\020\0022\022\020\007\032\n\022\006\b\001\022\002H\0020\b\"\002H\002¢\006\002\020\t\032G\020\005\032\b\022\004\022\002H\0020\006\"\004\b\000\020\0022\032\020\n\032\026\022\006\b\000\022\002H\0020\013j\n\022\006\b\000\022\002H\002`\f2\022\020\007\032\n\022\006\b\001\022\002H\0020\b\"\002H\002¢\006\002\020\r¨\006\016"}, d2={"setOf", "", "T", "element", "(Ljava/lang/Object;)Ljava/util/Set;", "sortedSetOf", "Ljava/util/TreeSet;", "elements", "", "([Ljava/lang/Object;)Ljava/util/TreeSet;", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/Comparator;[Ljava/lang/Object;)Ljava/util/TreeSet;", "kotlin-stdlib"}, xs="kotlin/collections/SetsKt")
class SetsKt__SetsJVMKt
{
  @NotNull
  public static final <T> Set<T> setOf(T element)
  {
    Set tmp4_1 = java.util.Collections.singleton(element);Intrinsics.checkExpressionValueIsNotNull(tmp4_1, "java.util.Collections.singleton(element)");return tmp4_1;
  }
  
  @NotNull
  public static final <T> TreeSet<T> sortedSetOf(@NotNull T... elements)
  {
    Intrinsics.checkParameterIsNotNull(elements, "elements");return (TreeSet)ArraysKt.toCollection(elements, (Collection)new TreeSet());
  }
  
  @NotNull
  public static final <T> TreeSet<T> sortedSetOf(@NotNull Comparator<? super T> comparator, @NotNull T... elements) {
    Intrinsics.checkParameterIsNotNull(comparator, "comparator");Intrinsics.checkParameterIsNotNull(elements, "elements");return (TreeSet)ArraysKt.toCollection(elements, (Collection)new TreeSet(comparator));
  }
  
  public SetsKt__SetsJVMKt() {}
}

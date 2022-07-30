package kotlin.collections;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\034\n\000\n\002\020\002\n\000\n\002\020(\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\032-\020\000\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\022\020\004\032\016\022\004\022\002H\002\022\004\022\0020\0010\005H\b\032\037\020\006\032\b\022\004\022\002H\0020\003\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H\n\032\"\020\007\032\016\022\n\022\b\022\004\022\002H\0020\b0\003\"\004\b\000\020\002*\b\022\004\022\002H\0020\003¨\006\t"}, d2={"forEach", "", "T", "", "operation", "Lkotlin/Function1;", "iterator", "withIndex", "Lkotlin/collections/IndexedValue;", "kotlin-stdlib"}, xs="kotlin/collections/CollectionsKt")
class CollectionsKt__IteratorsKt extends CollectionsKt__IteratorsJVMKt
{
  @InlineOnly
  private static final <T> Iterator<T> iterator(@NotNull Iterator<? extends T> $receiver)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver;
  }
  

  @NotNull
  public static final <T> Iterator<IndexedValue<T>> withIndex(@NotNull Iterator<? extends T> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (Iterator)new IndexingIterator($receiver);
  }
  

  public static final <T> void forEach(@NotNull Iterator<? extends T> $receiver, @NotNull Function1<? super T, Unit> operation)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(operation, "operation");Iterator localIterator2 = $receiver; Object element; for (Iterator localIterator1 = localIterator2; localIterator1.hasNext(); operation.invoke(element)) element = localIterator1.next();
  }
  
  public CollectionsKt__IteratorsKt() {}
}

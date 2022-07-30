package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000:\n\000\n\002\020\034\n\002\b\002\n\002\030\002\n\002\020(\n\000\n\002\020\b\n\002\b\004\n\002\020\036\n\002\b\003\n\002\020 \n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\002\032+\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\024\b\004\020\003\032\016\022\n\022\b\022\004\022\002H\0020\0050\004H\b\032 \020\006\032\0020\007\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\006\020\b\032\0020\007H\001\032\037\020\t\032\004\030\0010\007\"\004\b\000\020\002*\b\022\004\022\002H\0020\001H\001¢\006\002\020\n\032\036\020\013\032\b\022\004\022\002H\0020\f\"\004\b\000\020\002*\b\022\004\022\002H\0020\001H\000\032,\020\r\032\b\022\004\022\002H\0020\f\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\f\020\016\032\b\022\004\022\002H\0020\001H\000\032\"\020\017\032\b\022\004\022\002H\0020\020\"\004\b\000\020\002*\016\022\n\022\b\022\004\022\002H\0020\0010\001\032\035\020\021\032\0020\022\"\004\b\000\020\002*\b\022\004\022\002H\0020\fH\002¢\006\002\b\023\032@\020\024\032\032\022\n\022\b\022\004\022\002H\0020\020\022\n\022\b\022\004\022\002H\0260\0200\025\"\004\b\000\020\002\"\004\b\001\020\026*\024\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0260\0250\001¨\006\027"}, d2={"Iterable", "", "T", "iterator", "Lkotlin/Function0;", "", "collectionSizeOrDefault", "", "default", "collectionSizeOrNull", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "convertToSetForSetOperation", "", "convertToSetForSetOperationWith", "source", "flatten", "", "safeToConvertToSet", "", "safeToConvertToSet$CollectionsKt__IterablesKt", "unzip", "Lkotlin/Pair;", "R", "kotlin-stdlib"}, xs="kotlin/collections/CollectionsKt")
class CollectionsKt__IterablesKt extends CollectionsKt__CollectionsKt
{
  @kotlin.internal.InlineOnly
  private static final <T> Iterable<T> Iterable(Function0<? extends java.util.Iterator<? extends T>> iterator)
  {
    ;
    (Iterable)new Iterable()
    {
      @NotNull
      public java.util.Iterator<T> iterator()
      {
        return (java.util.Iterator)$iterator.invoke();
      }
    };
  }
  







  @kotlin.PublishedApi
  @org.jetbrains.annotations.Nullable
  public static final <T> Integer collectionSizeOrNull(@NotNull Iterable<? extends T> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return ($receiver instanceof Collection) ? Integer.valueOf(((Collection)$receiver).size()) : null;
  }
  
  @kotlin.PublishedApi
  public static final <T> int collectionSizeOrDefault(@NotNull Iterable<? extends T> $receiver, int default)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return ($receiver instanceof Collection) ? ((Collection)$receiver).size() : default;
  }
  
  private static final <T> boolean safeToConvertToSet$CollectionsKt__IterablesKt(@NotNull Collection<? extends T> $receiver) { return ($receiver.size() > 2) && (($receiver instanceof ArrayList)); }
  
  @NotNull
  public static final <T> Collection<T> convertToSetForSetOperationWith(@NotNull Iterable<? extends T> $receiver, @NotNull Iterable<? extends T> source) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(source, "source");Iterable localIterable = $receiver;
    






    return (localIterable instanceof Collection) ? safeToConvertToSet$CollectionsKt__IterablesKt((Collection)$receiver) ? (Collection)CollectionsKt.toHashSet($receiver) : (Collection)$receiver : ((source instanceof Collection)) && (((Collection)source).size() < 2) ? (Collection)$receiver : (localIterable instanceof java.util.Set) ? (Collection)$receiver : (Collection)CollectionsKt.toHashSet($receiver);
  }
  
  @NotNull
  public static final <T> Collection<T> convertToSetForSetOperation(@NotNull Iterable<? extends T> $receiver) { Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Iterable localIterable = $receiver;
    


    return (localIterable instanceof Collection) ? (Collection)$receiver : safeToConvertToSet$CollectionsKt__IterablesKt((Collection)$receiver) ? (Collection)CollectionsKt.toHashSet($receiver) : (localIterable instanceof java.util.Set) ? (Collection)$receiver : (Collection)CollectionsKt.toHashSet($receiver);
  }
  


  @NotNull
  public static final <T> List<T> flatten(@NotNull Iterable<? extends Iterable<? extends T>> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");ArrayList result = new ArrayList();
    for (Iterable element : $receiver) {
      CollectionsKt.addAll((Collection)result, element);
    }
    return (List)result;
  }
  




  @NotNull
  public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Iterable<? extends Pair<? extends T, ? extends R>> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int expectedSize = CollectionsKt.collectionSizeOrDefault($receiver, 10);
    ArrayList listT = new ArrayList(expectedSize);
    ArrayList listR = new ArrayList(expectedSize);
    for (Pair pair : $receiver) {
      listT.add(pair.getFirst());
      listR.add(pair.getSecond());
    }
    return kotlin.TuplesKt.to(listT, listR);
  }
  
  public CollectionsKt__IterablesKt() {}
}

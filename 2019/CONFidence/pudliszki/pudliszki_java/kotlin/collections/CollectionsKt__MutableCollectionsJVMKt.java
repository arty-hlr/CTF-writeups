package kotlin.collections;

import java.util.List;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000<\n\000\n\002\020\002\n\000\n\002\020!\n\002\b\004\n\002\030\002\n\000\n\002\020 \n\002\020\034\n\000\n\002\020\017\n\000\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\b\002\032&\020\000\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\020\004\032\002H\002H\b¢\006\002\020\005\032\031\020\006\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H\b\032!\020\006\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\020\007\032\0020\bH\b\032\036\020\t\032\b\022\004\022\002H\0020\n\"\004\b\000\020\002*\b\022\004\022\002H\0020\013H\007\032&\020\t\032\b\022\004\022\002H\0020\n\"\004\b\000\020\002*\b\022\004\022\002H\0020\0132\006\020\007\032\0020\bH\007\032 \020\f\032\0020\001\"\016\b\000\020\002*\b\022\004\022\002H\0020\r*\b\022\004\022\002H\0020\003\0323\020\f\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\030\020\016\032\024\022\004\022\002H\002\022\004\022\002H\002\022\004\022\0020\0200\017H\b\0325\020\f\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\032\020\021\032\026\022\006\b\000\022\002H\0020\022j\n\022\006\b\000\022\002H\002`\023H\b\0322\020\024\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\032\020\021\032\026\022\006\b\000\022\002H\0020\022j\n\022\006\b\000\022\002H\002`\023¨\006\025"}, d2={"fill", "", "T", "", "value", "(Ljava/util/List;Ljava/lang/Object;)V", "shuffle", "random", "Ljava/util/Random;", "shuffled", "", "", "sort", "", "comparison", "Lkotlin/Function2;", "", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "sortWith", "kotlin-stdlib"}, xs="kotlin/collections/CollectionsKt")
class CollectionsKt__MutableCollectionsJVMKt extends CollectionsKt__IteratorsKt
{
  /**
   * @deprecated
   */
  @kotlin.Deprecated(message="Use sortWith(comparator) instead.", replaceWith=@kotlin.ReplaceWith(imports={}, expression="this.sortWith(comparator)"), level=kotlin.DeprecationLevel.ERROR)
  @kotlin.internal.InlineOnly
  private static final <T> void sort(@org.jetbrains.annotations.NotNull List<T> $receiver, java.util.Comparator<? super T> comparator) {
    ;
    throw ((Throwable)new kotlin.NotImplementedError(null, 1, null)); } /**
   * @deprecated
   */
  @kotlin.Deprecated(message="Use sortWith(Comparator(comparison)) instead.", replaceWith=@kotlin.ReplaceWith(imports={}, expression="this.sortWith(Comparator(comparison))"), level=kotlin.DeprecationLevel.ERROR)
  @kotlin.internal.InlineOnly
  private static final <T> void sort(@org.jetbrains.annotations.NotNull List<T> $receiver, kotlin.jvm.functions.Function2<? super T, ? super T, Integer> comparison) { ; throw ((Throwable)new kotlin.NotImplementedError(null, 1, null));
  }
  




  public static final <T extends Comparable<? super T>> void sort(@org.jetbrains.annotations.NotNull List<T> $receiver)
  {
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); if ($receiver.size() > 1) { java.util.Collections.sort($receiver);
    }
  }
  



  public static final <T> void sortWith(@org.jetbrains.annotations.NotNull List<T> $receiver, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> comparator)
  {
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(comparator, "comparator"); if ($receiver.size() > 1) { java.util.Collections.sort($receiver, comparator);
    }
  }
  

  @kotlin.internal.InlineOnly
  @kotlin.SinceKotlin(version="1.2")
  private static final <T> void fill(@org.jetbrains.annotations.NotNull List<T> $receiver, T value)
  {
    ;
    
    java.util.Collections.fill($receiver, value);
  }
  

  @kotlin.internal.InlineOnly
  @kotlin.SinceKotlin(version="1.2")
  private static final <T> void shuffle(@org.jetbrains.annotations.NotNull List<T> $receiver)
  {
    ;
    
    java.util.Collections.shuffle($receiver);
  }
  

  @kotlin.internal.InlineOnly
  @kotlin.SinceKotlin(version="1.2")
  private static final <T> void shuffle(@org.jetbrains.annotations.NotNull List<T> $receiver, java.util.Random random)
  {
    ;
    java.util.Collections.shuffle($receiver, random);
  }
  
  @kotlin.SinceKotlin(version="1.2")
  @org.jetbrains.annotations.NotNull
  public static final <T> List<T> shuffled(@org.jetbrains.annotations.NotNull Iterable<? extends T> $receiver)
  {
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");List localList1 = CollectionsKt.toMutableList($receiver);List $receiver = localList1; int $i$a$1$apply; List localList2 = $receiver;java.util.Collections.shuffle(localList2);return localList1;
  }
  
  @kotlin.SinceKotlin(version="1.2")
  @org.jetbrains.annotations.NotNull
  public static final <T> List<T> shuffled(@org.jetbrains.annotations.NotNull Iterable<? extends T> $receiver, @org.jetbrains.annotations.NotNull java.util.Random random)
  {
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(random, "random");List localList1 = CollectionsKt.toMutableList($receiver);List $receiver = localList1; int $i$a$2$apply; List localList2 = $receiver;java.util.Random localRandom = random;java.util.Collections.shuffle(localList2, localRandom);return localList1;
  }
  
  public CollectionsKt__MutableCollectionsJVMKt() {}
}

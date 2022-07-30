package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000<\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\017\n\000\n\002\020\021\n\002\b\005\n\002\020\b\n\002\b\013\n\002\020\000\n\002\b\b\n\002\030\002\n\002\030\002\n\002\b\003\032;\020\000\032\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\003\"\004\b\000\020\0022\032\b\004\020\004\032\024\022\004\022\002H\002\022\n\022\b\022\002\b\003\030\0010\0060\005H\b\032Y\020\000\032\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\003\"\004\b\000\020\00226\020\007\032\034\022\030\b\001\022\024\022\004\022\002H\002\022\n\022\b\022\002\b\003\030\0010\0060\0050\b\"\024\022\004\022\002H\002\022\n\022\b\022\002\b\003\030\0010\0060\005¢\006\002\020\t\032W\020\000\032\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\003\"\004\b\000\020\002\"\004\b\001\020\n2\032\020\013\032\026\022\006\b\000\022\002H\n0\001j\n\022\006\b\000\022\002H\n`\0032\024\b\004\020\004\032\016\022\004\022\002H\002\022\004\022\002H\n0\005H\b\032;\020\f\032\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\003\"\004\b\000\020\0022\032\b\004\020\004\032\024\022\004\022\002H\002\022\n\022\b\022\002\b\003\030\0010\0060\005H\b\032W\020\f\032\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\003\"\004\b\000\020\002\"\004\b\001\020\n2\032\020\013\032\026\022\006\b\000\022\002H\n0\001j\n\022\006\b\000\022\002H\n`\0032\024\b\004\020\004\032\016\022\004\022\002H\002\022\004\022\002H\n0\005H\b\032-\020\r\032\0020\016\"\f\b\000\020\002*\006\022\002\b\0030\0062\b\020\017\032\004\030\001H\0022\b\020\020\032\004\030\001H\002¢\006\002\020\021\032>\020\022\032\0020\016\"\004\b\000\020\0022\006\020\017\032\002H\0022\006\020\020\032\002H\0022\030\020\004\032\024\022\004\022\002H\002\022\n\022\b\022\002\b\003\030\0010\0060\005H\b¢\006\002\020\023\032Y\020\022\032\0020\016\"\004\b\000\020\0022\006\020\017\032\002H\0022\006\020\020\032\002H\00226\020\007\032\034\022\030\b\001\022\024\022\004\022\002H\002\022\n\022\b\022\002\b\003\030\0010\0060\0050\b\"\024\022\004\022\002H\002\022\n\022\b\022\002\b\003\030\0010\0060\005¢\006\002\020\024\032Z\020\022\032\0020\016\"\004\b\000\020\002\"\004\b\001\020\n2\006\020\017\032\002H\0022\006\020\020\032\002H\0022\032\020\013\032\026\022\006\b\000\022\002H\n0\001j\n\022\006\b\000\022\002H\n`\0032\022\020\004\032\016\022\004\022\002H\002\022\004\022\002H\n0\005H\b¢\006\002\020\025\032G\020\026\032\0020\016\"\004\b\000\020\0022\006\020\017\032\002H\0022\006\020\020\032\002H\0022 \020\007\032\034\022\030\b\001\022\024\022\004\022\002H\002\022\n\022\b\022\002\b\003\030\0010\0060\0050\bH\002¢\006\004\b\027\020\024\032&\020\030\032\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\003\"\016\b\000\020\002*\b\022\004\022\002H\0020\006\032-\020\031\032\026\022\006\022\004\030\001H\0020\001j\n\022\006\022\004\030\001H\002`\003\"\016\b\000\020\002*\b\022\004\022\002H\0020\006H\b\032@\020\031\032\026\022\006\022\004\030\001H\0020\001j\n\022\006\022\004\030\001H\002`\003\"\b\b\000\020\002*\0020\0322\032\020\013\032\026\022\006\b\000\022\002H\0020\001j\n\022\006\b\000\022\002H\002`\003\032-\020\033\032\026\022\006\022\004\030\001H\0020\001j\n\022\006\022\004\030\001H\002`\003\"\016\b\000\020\002*\b\022\004\022\002H\0020\006H\b\032@\020\033\032\026\022\006\022\004\030\001H\0020\001j\n\022\006\022\004\030\001H\002`\003\"\b\b\000\020\002*\0020\0322\032\020\013\032\026\022\006\b\000\022\002H\0020\001j\n\022\006\b\000\022\002H\002`\003\032&\020\034\032\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\003\"\016\b\000\020\002*\b\022\004\022\002H\0020\006\0320\020\035\032\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\003\"\004\b\000\020\002*\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\003\032O\020\036\032\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\003\"\004\b\000\020\002*\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\0032\032\020\013\032\026\022\006\b\000\022\002H\0020\001j\n\022\006\b\000\022\002H\002`\003H\004\032O\020\037\032\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\003\"\004\b\000\020\002*\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\0032\032\b\004\020\004\032\024\022\004\022\002H\002\022\n\022\b\022\002\b\003\030\0010\0060\005H\b\032k\020\037\032\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\003\"\004\b\000\020\002\"\004\b\001\020\n*\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\0032\032\020\013\032\026\022\006\b\000\022\002H\n0\001j\n\022\006\b\000\022\002H\n`\0032\024\b\004\020\004\032\016\022\004\022\002H\002\022\004\022\002H\n0\005H\b\032O\020 \032\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\003\"\004\b\000\020\002*\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\0032\032\b\004\020\004\032\024\022\004\022\002H\002\022\n\022\b\022\002\b\003\030\0010\0060\005H\b\032k\020 \032\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\003\"\004\b\000\020\002\"\004\b\001\020\n*\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\0032\032\020\013\032\026\022\006\b\000\022\002H\n0\001j\n\022\006\b\000\022\002H\n`\0032\024\b\004\020\004\032\016\022\004\022\002H\002\022\004\022\002H\n0\005H\b\032m\020!\032\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\003\"\004\b\000\020\002*\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\00328\b\004\020\"\0322\022\023\022\021H\002¢\006\f\b$\022\b\b%\022\004\b\b(\017\022\023\022\021H\002¢\006\f\b$\022\b\b%\022\004\b\b(\020\022\004\022\0020\0160#H\b\032O\020&\032\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\003\"\004\b\000\020\002*\022\022\004\022\002H\0020\001j\b\022\004\022\002H\002`\0032\032\020\013\032\026\022\006\b\000\022\002H\0020\001j\n\022\006\b\000\022\002H\002`\003H\004¨\006'"}, d2={"compareBy", "Ljava/util/Comparator;", "T", "Lkotlin/Comparator;", "selector", "Lkotlin/Function1;", "", "selectors", "", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "K", "comparator", "compareByDescending", "compareValues", "", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "compareValuesBy", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)I", "compareValuesByImpl", "compareValuesByImpl$ComparisonsKt__ComparisonsKt", "naturalOrder", "nullsFirst", "", "nullsLast", "reverseOrder", "reversed", "then", "thenBy", "thenByDescending", "thenComparator", "comparison", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "thenDescending", "kotlin-stdlib"}, xs="kotlin/comparisons/ComparisonsKt")
class ComparisonsKt__ComparisonsKt
{
  public static final <T> int compareValuesBy(T a, T b, @NotNull Function1<? super T, ? extends Comparable<?>>... selectors)
  {
    Intrinsics.checkParameterIsNotNull(selectors, "selectors");int i = selectors.length > 0 ? 1 : 0; if (i == 0) { String str = "Failed requirement.";throw ((Throwable)new IllegalArgumentException(str.toString())); }
    return compareValuesByImpl$ComparisonsKt__ComparisonsKt(a, b, selectors);
  }
  
  private static final <T> int compareValuesByImpl$ComparisonsKt__ComparisonsKt(T a, T b, Function1<? super T, ? extends Comparable<?>>[] selectors) {
    for (Function1 fn : selectors) {
      Comparable v1 = (Comparable)fn.invoke(a);
      Comparable v2 = (Comparable)fn.invoke(b);
      int diff = ComparisonsKt.compareValues(v1, v2);
      if (diff != 0) return diff;
    }
    return 0;
  }
  



  @InlineOnly
  private static final <T> int compareValuesBy(T a, T b, Function1<? super T, ? extends Comparable<?>> selector)
  {
    ;
    

    return ComparisonsKt.compareValues((Comparable)selector.invoke(a), (Comparable)selector.invoke(b));
  }
  



  @InlineOnly
  private static final <T, K> int compareValuesBy(T a, T b, Comparator<? super K> comparator, Function1<? super T, ? extends K> selector)
  {
    ;
    

    return comparator.compare(selector.invoke(a), selector.invoke(b));
  }
  














  public static final <T extends Comparable<?>> int compareValues(@Nullable T a, @Nullable T b)
  {
    if (a == b) return 0;
    if (a == null) return -1;
    if (b == null) { return 1;
    }
    
    return a.compareTo(b);
  }
  






  @NotNull
  public static final <T> Comparator<T> compareBy(@NotNull Function1<? super T, ? extends Comparable<?>>... selectors)
  {
    Intrinsics.checkParameterIsNotNull(selectors, "selectors");int i = selectors.length > 0 ? 1 : 0; if (i == 0) { String str = "Failed requirement.";throw ((Throwable)new IllegalArgumentException(str.toString())); }
    (Comparator)new Comparator() { public final int compare(T a, T b) { return ComparisonsKt__ComparisonsKt.access$compareValuesByImpl(a, b, $selectors); }
    };
  }
  


  @InlineOnly
  private static final <T> Comparator<T> compareBy(Function1<? super T, ? extends Comparable<?>> selector)
  {
    ;
    
    (Comparator)new Comparator() { public final int compare(T a, T b) { return ComparisonsKt.compareValues((Comparable)$selector.invoke(a), (Comparable)$selector.invoke(b)); }
    };
  }
  

  @InlineOnly
  private static final <T, K> Comparator<T> compareBy(Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector)
  {
    ;
    
    (Comparator)new Comparator() { public final int compare(T a, T b) { Comparator localComparator = $comparator;return localComparator.compare(selector.invoke(a), selector.invoke(b));
      }
    };
  }
  
  @InlineOnly
  private static final <T> Comparator<T> compareByDescending(Function1<? super T, ? extends Comparable<?>> selector)
  {
    ;
    (Comparator)new Comparator() { public final int compare(T a, T b) { return ComparisonsKt.compareValues((Comparable)$selector.invoke(b), (Comparable)$selector.invoke(a)); }
    };
  }
  


  @InlineOnly
  private static final <T, K> Comparator<T> compareByDescending(Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector)
  {
    ;
    

    (Comparator)new Comparator() { public final int compare(T a, T b) { Comparator localComparator = $comparator;return localComparator.compare(selector.invoke(b), selector.invoke(a));
      }
    };
  }
  


  @InlineOnly
  private static final <T> Comparator<T> thenBy(@NotNull Comparator<T> $receiver, final Function1<? super T, ? extends Comparable<?>> selector)
  {
    ;
    

    (Comparator)new Comparator()
    {
      public final int compare(T a, T b)
      {
        int previousCompare = $this_thenBy.compare(a, b);
        return previousCompare != 0 ? previousCompare : ComparisonsKt.compareValues((Comparable)selector.invoke(a), (Comparable)selector.invoke(b));
      }
    };
  }
  



  @InlineOnly
  private static final <T, K> Comparator<T> thenBy(@NotNull Comparator<T> $receiver, final Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector)
  {
    ;
    

    (Comparator)new Comparator()
    {
      public final int compare(T a, T b)
      {
        int previousCompare = $this_thenBy.compare(a, b);
        Comparator localComparator = comparator;return previousCompare != 0 ? previousCompare : localComparator.compare(selector.invoke(a), selector.invoke(b));
      }
    };
  }
  



  @InlineOnly
  private static final <T> Comparator<T> thenByDescending(@NotNull Comparator<T> $receiver, final Function1<? super T, ? extends Comparable<?>> selector)
  {
    ;
    

    (Comparator)new Comparator()
    {
      public final int compare(T a, T b)
      {
        int previousCompare = $this_thenByDescending.compare(a, b);
        return previousCompare != 0 ? previousCompare : ComparisonsKt.compareValues((Comparable)selector.invoke(b), (Comparable)selector.invoke(a));
      }
    };
  }
  



  @InlineOnly
  private static final <T, K> Comparator<T> thenByDescending(@NotNull Comparator<T> $receiver, final Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector)
  {
    ;
    

    (Comparator)new Comparator()
    {
      public final int compare(T a, T b)
      {
        int previousCompare = $this_thenByDescending.compare(a, b);
        Comparator localComparator = comparator;return previousCompare != 0 ? previousCompare : localComparator.compare(selector.invoke(b), selector.invoke(a));
      }
    };
  }
  



  @InlineOnly
  private static final <T> Comparator<T> thenComparator(@NotNull Comparator<T> $receiver, final Function2<? super T, ? super T, Integer> comparison)
  {
    ;
    

    (Comparator)new Comparator()
    {
      public final int compare(T a, T b)
      {
        int previousCompare = $this_thenComparator.compare(a, b);
        return previousCompare != 0 ? previousCompare : ((Number)comparison.invoke(a, b)).intValue();
      }
    };
  }
  


  @NotNull
  public static final <T> Comparator<T> then(@NotNull Comparator<T> $receiver, @NotNull final Comparator<? super T> comparator)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(comparator, "comparator");(Comparator)new Comparator() {
      public final int compare(T a, T b) { int previousCompare = $this_then.compare(a, b);
        return previousCompare != 0 ? previousCompare : comparator.compare(a, b);
      }
    };
  }
  


  @NotNull
  public static final <T> Comparator<T> thenDescending(@NotNull Comparator<T> $receiver, @NotNull final Comparator<? super T> comparator)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(comparator, "comparator");(Comparator)new Comparator() {
      public final int compare(T a, T b) { int previousCompare = $this_thenDescending.compare(a, b);
        return previousCompare != 0 ? previousCompare : comparator.compare(b, a);
      }
    };
  }
  



  @NotNull
  public static final <T> Comparator<T> nullsFirst(@NotNull Comparator<? super T> comparator)
  {
    Intrinsics.checkParameterIsNotNull(comparator, "comparator");(Comparator)new Comparator()
    {

      public final int compare(@Nullable T a, @Nullable T b)
      {

        return b == null ? 1 : a == null ? -1 : a == b ? 0 : $comparator.compare(a, b);
      }
    };
  }
  

  @InlineOnly
  private static final <T extends Comparable<? super T>> Comparator<T> nullsFirst()
  {
    ;
    return ComparisonsKt.nullsFirst(ComparisonsKt.naturalOrder());
  }
  



  @NotNull
  public static final <T> Comparator<T> nullsLast(@NotNull Comparator<? super T> comparator)
  {
    Intrinsics.checkParameterIsNotNull(comparator, "comparator");(Comparator)new Comparator()
    {

      public final int compare(@Nullable T a, @Nullable T b)
      {

        return b == null ? -1 : a == null ? 1 : a == b ? 0 : $comparator.compare(a, b);
      }
    };
  }
  

  @InlineOnly
  private static final <T extends Comparable<? super T>> Comparator<T> nullsLast()
  {
    ;
    return ComparisonsKt.nullsLast(ComparisonsKt.naturalOrder());
  }
  

  @NotNull
  public static final <T extends Comparable<? super T>> Comparator<T> naturalOrder()
  {
    NaturalOrderComparator tmp3_0 = NaturalOrderComparator.INSTANCE;
    






















































































































































































































































































    if (tmp3_0 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */"); return (Comparator)tmp3_0;
  }
  

  @NotNull
  public static final <T extends Comparable<? super T>> Comparator<T> reverseOrder()
  {
    ReverseOrderComparator tmp3_0 = ReverseOrderComparator.INSTANCE;
    





























































































































































































































































































    if (tmp3_0 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */"); return (Comparator)tmp3_0;
  }
  

  @NotNull
  public static final <T> Comparator<T> reversed(@NotNull Comparator<T> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Comparator localComparator = $receiver; ReverseOrderComparator 
    
      tmp38_35 = ReverseOrderComparator.INSTANCE;
    
    if (tmp38_35 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
    NaturalOrderComparator tmp71_68 = NaturalOrderComparator.INSTANCE;
    







































































































































































































































































































    if (tmp71_68 == null) { throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
    }
    return Intrinsics.areEqual(localComparator, ReverseOrderComparator.INSTANCE) ? (Comparator)tmp71_68 : Intrinsics.areEqual(localComparator, NaturalOrderComparator.INSTANCE) ? (Comparator)tmp38_35 : (localComparator instanceof ReversedComparator) ? ((ReversedComparator)$receiver).getComparator() : (Comparator)new ReversedComparator($receiver);
  }
  
  public ComparisonsKt__ComparisonsKt() {}
}

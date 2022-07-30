package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;









































































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\020\n\002\b\006\n\002\030\002\n\002\030\002\n\002\b\004\032G\020\000\032\002H\001\"\004\b\000\020\0012\006\020\002\032\002H\0012\006\020\003\032\002H\0012\006\020\004\032\002H\0012\032\020\005\032\026\022\006\b\000\022\002H\0010\006j\n\022\006\b\000\022\002H\001`\007H\007¢\006\002\020\b\032?\020\000\032\002H\001\"\004\b\000\020\0012\006\020\002\032\002H\0012\006\020\003\032\002H\0012\032\020\005\032\026\022\006\b\000\022\002H\0010\006j\n\022\006\b\000\022\002H\001`\007H\007¢\006\002\020\t\032G\020\n\032\002H\001\"\004\b\000\020\0012\006\020\002\032\002H\0012\006\020\003\032\002H\0012\006\020\004\032\002H\0012\032\020\005\032\026\022\006\b\000\022\002H\0010\006j\n\022\006\b\000\022\002H\001`\007H\007¢\006\002\020\b\032?\020\n\032\002H\001\"\004\b\000\020\0012\006\020\002\032\002H\0012\006\020\003\032\002H\0012\032\020\005\032\026\022\006\b\000\022\002H\0010\006j\n\022\006\b\000\022\002H\001`\007H\007¢\006\002\020\t¨\006\013"}, d2={"maxOf", "T", "a", "b", "c", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/lang/Object;", "minOf", "kotlin-stdlib"}, xs="kotlin/comparisons/ComparisonsKt")
class ComparisonsKt___ComparisonsKt
  extends ComparisonsKt___ComparisonsJvmKt
{
  @SinceKotlin(version="1.1")
  public static final <T> T maxOf(T a, T b, T c, @NotNull Comparator<? super T> comparator)
  {
    Intrinsics.checkParameterIsNotNull(comparator, "comparator");return ComparisonsKt.maxOf(a, ComparisonsKt.maxOf(b, c, comparator), comparator);
  }
  



  @SinceKotlin(version="1.1")
  public static final <T> T maxOf(T a, T b, @NotNull Comparator<? super T> comparator)
  {
    Intrinsics.checkParameterIsNotNull(comparator, "comparator");return comparator.compare(a, b) >= 0 ? a : b;
  }
  



































































































  @SinceKotlin(version="1.1")
  public static final <T> T minOf(T a, T b, T c, @NotNull Comparator<? super T> comparator)
  {
    Intrinsics.checkParameterIsNotNull(comparator, "comparator");return ComparisonsKt.minOf(a, ComparisonsKt.minOf(b, c, comparator), comparator);
  }
  



  @SinceKotlin(version="1.1")
  public static final <T> T minOf(T a, T b, @NotNull Comparator<? super T> comparator)
  {
    Intrinsics.checkParameterIsNotNull(comparator, "comparator");return comparator.compare(a, b) <= 0 ? a : b;
  }
  
  public ComparisonsKt___ComparisonsKt() {}
}

package kotlin.random;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;











































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\033\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\b\003*\001\b\b\000\030\0002\0020\001B\005¢\006\002\020\002R\024\020\003\032\0020\0048VX\004¢\006\006\032\004\b\005\020\006R\020\020\007\032\0020\bX\004¢\006\004\n\002\020\t¨\006\n"}, d2={"Lkotlin/random/FallbackThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "()V", "impl", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "implStorage", "kotlin/random/FallbackThreadLocalRandom$implStorage$1", "Lkotlin/random/FallbackThreadLocalRandom$implStorage$1;", "kotlin-stdlib"})
public final class FallbackThreadLocalRandom
  extends AbstractPlatformRandom
{
  private final implStorage.1 implStorage = new ThreadLocal() {
    @NotNull
    protected Random initialValue() { return new Random(); }
  };
  
  @NotNull
  public Random getImpl() { Object tmp7_4 = implStorage.get();Intrinsics.checkExpressionValueIsNotNull(tmp7_4, "implStorage.get()");return (Random)tmp7_4;
  }
  
  public FallbackThreadLocalRandom() {}
}

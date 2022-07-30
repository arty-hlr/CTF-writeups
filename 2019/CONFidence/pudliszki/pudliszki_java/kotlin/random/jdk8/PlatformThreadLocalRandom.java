package kotlin.random.jdk8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000*\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\006\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\t\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\007\032\0020\b2\006\020\t\032\0020\bH\026J\030\020\n\032\0020\0132\006\020\f\032\0020\0132\006\020\t\032\0020\013H\026J\020\020\r\032\0020\0162\006\020\t\032\0020\016H\026J\030\020\r\032\0020\0162\006\020\f\032\0020\0162\006\020\t\032\0020\016H\026R\024\020\003\032\0020\0048VX\004¢\006\006\032\004\b\005\020\006¨\006\017"}, d2={"Lkotlin/random/jdk8/PlatformThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "()V", "impl", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "nextDouble", "", "until", "nextInt", "", "from", "nextLong", "", "kotlin-stdlib-jdk8"})
public final class PlatformThreadLocalRandom extends kotlin.random.AbstractPlatformRandom
{
  @org.jetbrains.annotations.NotNull
  public Random getImpl()
  {
    ThreadLocalRandom tmp3_0 = ThreadLocalRandom.current();Intrinsics.checkExpressionValueIsNotNull(tmp3_0, "ThreadLocalRandom.current()");return (Random)tmp3_0; }
  
  public int nextInt(int from, int until) { return ThreadLocalRandom.current().nextInt(from, until); }
  public long nextLong(long until) { return ThreadLocalRandom.current().nextLong(until); }
  public long nextLong(long from, long until) { return ThreadLocalRandom.current().nextLong(from, until); }
  public double nextDouble(double until) { return ThreadLocalRandom.current().nextDouble(until); }
  
  public PlatformThreadLocalRandom() {}
}

package kotlin.random;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;



















































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000B\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\002\n\002\020\013\n\000\n\002\020\002\n\000\n\002\020\022\n\000\n\002\020\006\n\000\n\002\020\007\n\002\b\003\n\002\020\t\n\002\b\003\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020\007\032\0020\b2\006\020\t\032\0020\bH\024J\b\020\n\032\0020\013H\026J\020\020\f\032\0020\r2\006\020\016\032\0020\017H\026J\b\020\020\032\0020\021H\026J\b\020\022\032\0020\023H\026J\b\020\024\032\0020\bH\026J\020\020\024\032\0020\b2\006\020\025\032\0020\bH\026J\b\020\026\032\0020\027H\026J\020\020\030\032\0020\r2\006\020\031\032\0020\027H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\032"}, d2={"Lkotlin/random/KotlinRandom;", "Ljava/util/Random;", "impl", "Lkotlin/random/Random;", "(Lkotlin/random/Random;)V", "getImpl", "()Lkotlin/random/Random;", "next", "", "bits", "nextBoolean", "", "nextBytes", "", "bytes", "", "nextDouble", "", "nextFloat", "", "nextInt", "bound", "nextLong", "", "setSeed", "seed", "kotlin-stdlib"})
final class KotlinRandom
  extends java.util.Random
{
  @NotNull
  private final Random impl;
  
  @NotNull
  public final Random getImpl() { return impl; } public KotlinRandom(@NotNull Random impl) { this.impl = impl; }
  protected int next(int bits) { return impl.nextBits(bits); }
  public int nextInt() { return impl.nextInt(); }
  public int nextInt(int bound) { return impl.nextInt(bound); }
  public boolean nextBoolean() { return impl.nextBoolean(); }
  public long nextLong() { return impl.nextLong(); }
  public float nextFloat() { return impl.nextFloat(); }
  public double nextDouble() { return impl.nextDouble(); }
  
  public void nextBytes(@NotNull byte[] bytes) {
    Intrinsics.checkParameterIsNotNull(bytes, "bytes");impl.nextBytes(bytes);
  }
  
  public void setSeed(long seed) {
    throw ((Throwable)new UnsupportedOperationException("Setting seed is not supported."));
  }
}

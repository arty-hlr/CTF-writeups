package kotlin.random;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;





























@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000>\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\n\002\020\013\n\000\n\002\020\022\n\002\b\002\n\002\020\006\n\000\n\002\020\007\n\002\b\003\n\002\020\t\n\000\b \030\0002\0020\001B\005¢\006\002\020\002J\020\020\007\032\0020\b2\006\020\t\032\0020\bH\026J\b\020\n\032\0020\013H\026J\020\020\f\032\0020\r2\006\020\016\032\0020\rH\026J\b\020\017\032\0020\020H\026J\b\020\021\032\0020\022H\026J\b\020\023\032\0020\bH\026J\020\020\023\032\0020\b2\006\020\024\032\0020\bH\026J\b\020\025\032\0020\026H\026R\022\020\003\032\0020\004X¦\004¢\006\006\032\004\b\005\020\006¨\006\027"}, d2={"Lkotlin/random/AbstractPlatformRandom;", "Lkotlin/random/Random;", "()V", "impl", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "nextDouble", "", "nextFloat", "", "nextInt", "until", "nextLong", "", "kotlin-stdlib"})
public abstract class AbstractPlatformRandom
  extends Random
{
  @NotNull
  public abstract java.util.Random getImpl();
  
  public int nextBits(int bitCount) { return RandomKt.takeUpperBits(getImpl().nextInt(), bitCount); }
  
  public int nextInt() { return getImpl().nextInt(); }
  public int nextInt(int until) { return getImpl().nextInt(until); }
  public long nextLong() { return getImpl().nextLong(); }
  public boolean nextBoolean() { return getImpl().nextBoolean(); }
  public double nextDouble() { return getImpl().nextDouble(); }
  public float nextFloat() { return getImpl().nextFloat(); } @NotNull
  public byte[] nextBytes(@NotNull byte[] array) { Intrinsics.checkParameterIsNotNull(array, "array");byte[] arrayOfByte1 = array;byte[] it = arrayOfByte1; int $i$a$1$also; getImpl().nextBytes(it);return arrayOfByte1;
  }
  
  public AbstractPlatformRandom() {}
}

package kotlin.random;

import kotlin.Metadata;









@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\r\b\000\030\0002\0020\001B\027\b\020\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005B7\b\000\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\003\022\006\020\t\032\0020\003\022\006\020\n\032\0020\003\022\006\020\013\032\0020\003¢\006\002\020\fJ\020\020\r\032\0020\0032\006\020\016\032\0020\003H\026J\b\020\017\032\0020\003H\026R\016\020\013\032\0020\003X\016¢\006\002\n\000R\016\020\n\032\0020\003X\016¢\006\002\n\000R\016\020\t\032\0020\003X\016¢\006\002\n\000R\016\020\006\032\0020\003X\016¢\006\002\n\000R\016\020\007\032\0020\003X\016¢\006\002\n\000R\016\020\b\032\0020\003X\016¢\006\002\n\000¨\006\020"}, d2={"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "seed1", "", "seed2", "(II)V", "x", "y", "z", "w", "v", "addend", "(IIIIII)V", "nextBits", "bitCount", "nextInt", "kotlin-stdlib"})
public final class XorWowRandom
  extends Random
{
  private int x;
  private int y;
  private int z;
  private int w;
  private int v;
  private int addend;
  
  public XorWowRandom(int seed1, int seed2)
  {
    this(seed1, seed2, 0, 0, seed1 ^ 0xFFFFFFFF, seed1 << 10 ^ seed2 >>> 4);
  }
  
  public XorWowRandom(int x, int y, int z, int w, int v, int addend)
  {
    this.x = x;this.y = y;this.z = z;this.w = w;this.v = v;this.addend = addend;
    




    String str1 = (this.x | this.y | this.z | this.w | this.v) != 0 ? 1 : 0; if (str1 == 0) { str2 = "Initial state must have at least one non-zero element.";throw ((Throwable)new IllegalArgumentException(str2.toString()));
    }
    
    str1 = 64;int $i$a$1$require = 0; for (String str2 = str1; $i$a$1$require < str2; $i$a$1$require++) { int it = $i$a$1$require; int $i$a$2$repeat; nextInt();
    }
  }
  
  public int nextInt() { int t = x;
    t ^= t >>> 2;
    x = y;
    y = z;
    z = w;
    int v0 = v;
    w = v0;
    t = t ^ t << 1 ^ v0 ^ v0 << 4;
    v = t;
    addend += 362437;
    return t + addend;
  }
  
  public int nextBits(int bitCount) {
    return RandomKt.takeUpperBits(nextInt(), bitCount);
  }
}

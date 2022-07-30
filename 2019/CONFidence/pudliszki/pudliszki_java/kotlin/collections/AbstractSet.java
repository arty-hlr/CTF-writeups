package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000&\n\002\030\002\n\000\n\002\030\002\n\002\020\"\n\002\b\002\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b'\030\000 \013*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003:\001\013B\007\b\004¢\006\002\020\004J\023\020\005\032\0020\0062\b\020\007\032\004\030\0010\bH\002J\b\020\t\032\0020\nH\026¨\006\f"}, d2={"Lkotlin/collections/AbstractSet;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "equals", "", "other", "", "hashCode", "", "Companion", "kotlin-stdlib"})
@SinceKotlin(version="1.1")
public abstract class AbstractSet<E>
  extends AbstractCollection<E>
  implements Set<E>, KMappedMarker
{
  public static final Companion Companion = new Companion(null);
  
  public boolean equals(@Nullable Object other)
  {
    if (other == (AbstractSet)this) return true;
    if (!(other instanceof Set)) return false;
    return Companion.setEquals$kotlin_stdlib((Set)this, (Set)other);
  }
  

  public int hashCode()
  {
    return Companion.unorderedHashCode$kotlin_stdlib((Collection)this);
  }
  
  protected AbstractSet() {}
  
  public Iterator<E> iterator()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\000\n\002\020\"\n\002\b\003\n\002\020\b\n\002\020\036\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J%\020\003\032\0020\0042\n\020\005\032\006\022\002\b\0030\0062\n\020\007\032\006\022\002\b\0030\006H\000¢\006\002\b\bJ\031\020\t\032\0020\n2\n\020\005\032\006\022\002\b\0030\013H\000¢\006\002\b\f¨\006\r"}, d2={"Lkotlin/collections/AbstractSet$Companion;", "", "()V", "setEquals", "", "c", "", "other", "setEquals$kotlin_stdlib", "unorderedHashCode", "", "", "unorderedHashCode$kotlin_stdlib", "kotlin-stdlib"})
  public static final class Companion
  {
    /* Error */
    public final int unorderedHashCode$kotlin_stdlib(@NotNull Collection<?> c)
    {
      // Byte code:
      //   0: aload_1
      //   1: ldc 9
      //   3: invokestatic 15	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: iconst_0
      //   7: istore_2
      //   8: aload_1
      //   9: invokeinterface 21 1 0
      //   14: astore 4
      //   16: aload 4
      //   18: invokeinterface 27 1 0
      //   23: ifeq +30 -> 53
      //   26: aload 4
      //   28: invokeinterface 31 1 0
      //   33: astore_3
      //   34: iload_2
      //   35: aload_3
      //   36: dup
      //   37: ifnull +9 -> 46
      //   40: invokevirtual 35	java/lang/Object:hashCode	()I
      //   43: goto +5 -> 48
      //   46: pop
      //   47: iconst_0
      //   48: iadd
      //   49: istore_2
      //   50: goto -34 -> 16
      //   53: iload_2
      //   54: ireturn
      // Line number table:
      //   Java source line #35	-> byte code offset #6
      //   Java source line #36	-> byte code offset #8
      //   Java source line #37	-> byte code offset #34
      //   Java source line #36	-> byte code offset #50
      //   Java source line #39	-> byte code offset #53
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	55	0	this	Companion
      //   0	55	1	c	Collection
      //   8	47	2	hashCode	int
      //   34	16	3	element	Object
    }
    
    public final boolean setEquals$kotlin_stdlib(@NotNull Set<?> c, @NotNull Set<?> other)
    {
      Intrinsics.checkParameterIsNotNull(c, "c");Intrinsics.checkParameterIsNotNull(other, "other"); if (c.size() != other.size()) return false;
      return c.containsAll((Collection)other);
    }
    
    private Companion() {}
  }
}

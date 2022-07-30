package kotlin.collections;

import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UShort;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;





@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\020\n\002\030\002\n\002\020(\n\002\030\002\n\002\b\005\b'\030\0002\b\022\004\022\0020\0020\001B\005¢\006\002\020\003J\f\020\004\032\0020\002H\002ø\001\000J\020\020\005\032\0020\002H&ø\001\000¢\006\002\020\006ø\001\000\002\004\n\002\b\031¨\006\007"}, d2={"Lkotlin/collections/UShortIterator;", "", "Lkotlin/UShort;", "()V", "next", "nextUShort", "()S", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
@ExperimentalUnsignedTypes
public abstract class UShortIterator
  implements Iterator<UShort>, KMappedMarker
{
  @NotNull
  public final UShort next()
  {
    return UShort.box-impl(nextUShort());
  }
  
  public abstract short nextUShort();
  
  public UShortIterator() {}
  
  public void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

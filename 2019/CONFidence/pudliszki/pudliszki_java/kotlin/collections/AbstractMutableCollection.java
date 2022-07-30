package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.KMutableCollection;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\032\n\002\030\002\n\000\n\002\020\037\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\b'\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B\007\b\004¢\006\002\020\004J\025\020\005\032\0020\0062\006\020\007\032\0028\000H&¢\006\002\020\b¨\006\t"}, d2={"Lkotlin/collections/AbstractMutableCollection;", "E", "", "Ljava/util/AbstractCollection;", "()V", "add", "", "element", "(Ljava/lang/Object;)Z", "kotlin-stdlib"})
@SinceKotlin(version="1.1")
public abstract class AbstractMutableCollection<E>
  extends AbstractCollection<E>
  implements Collection<E>, KMutableCollection
{
  public abstract boolean add(E paramE);
  
  protected AbstractMutableCollection() {}
  
  public abstract int getSize();
}

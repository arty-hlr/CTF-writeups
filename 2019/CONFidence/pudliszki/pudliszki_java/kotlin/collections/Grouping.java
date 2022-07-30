package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\026\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\004\n\002\020(\n\000\bg\030\000*\004\b\000\020\001*\006\b\001\020\002 \0012\0020\003J\025\020\004\032\0028\0012\006\020\005\032\0028\000H&¢\006\002\020\006J\016\020\007\032\b\022\004\022\0028\0000\bH&¨\006\t"}, d2={"Lkotlin/collections/Grouping;", "T", "K", "", "keyOf", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "sourceIterator", "", "kotlin-stdlib"})
@SinceKotlin(version="1.1")
public abstract interface Grouping<T, K>
{
  @NotNull
  public abstract Iterator<T> sourceIterator();
  
  public abstract K keyOf(T paramT);
}

package kotlin.jvm.functions;

import kotlin.Function;
import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\020\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\006\bf\030\000*\006\b\000\020\001 \000*\006\b\001\020\002 \000*\006\b\002\020\003 \000*\006\b\003\020\004 \0012\b\022\004\022\002H\0040\005J&\020\006\032\0028\0032\006\020\007\032\0028\0002\006\020\b\032\0028\0012\006\020\t\032\0028\002H¦\002¢\006\002\020\n¨\006\013"}, d2={"Lkotlin/jvm/functions/Function3;", "P1", "P2", "P3", "R", "Lkotlin/Function;", "invoke", "p1", "p2", "p3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"})
public abstract interface Function3<P1, P2, P3, R>
  extends Function<R>
{
  public abstract R invoke(P1 paramP1, P2 paramP2, P3 paramP3);
}

package kotlin.jvm.functions;

import kotlin.Function;
import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\020\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\007\bf\030\000*\006\b\000\020\001 \000*\006\b\001\020\002 \000*\006\b\002\020\003 \000*\006\b\003\020\004 \000*\006\b\004\020\005 \0012\b\022\004\022\002H\0050\006J.\020\007\032\0028\0042\006\020\b\032\0028\0002\006\020\t\032\0028\0012\006\020\n\032\0028\0022\006\020\013\032\0028\003H¦\002¢\006\002\020\f¨\006\r"}, d2={"Lkotlin/jvm/functions/Function4;", "P1", "P2", "P3", "P4", "R", "Lkotlin/Function;", "invoke", "p1", "p2", "p3", "p4", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"})
public abstract interface Function4<P1, P2, P3, P4, R>
  extends Function<R>
{
  public abstract R invoke(P1 paramP1, P2 paramP2, P3 paramP3, P4 paramP4);
}

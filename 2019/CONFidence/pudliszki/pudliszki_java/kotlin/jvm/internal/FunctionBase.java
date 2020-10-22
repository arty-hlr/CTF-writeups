package kotlin.jvm.internal;

import kotlin.Function;
import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\024\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\bf\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\002R\022\020\003\032\0020\004X¦\004¢\006\006\032\004\b\005\020\006¨\006\007"}, d2={"Lkotlin/jvm/internal/FunctionBase;", "R", "Lkotlin/Function;", "arity", "", "getArity", "()I", "kotlin-stdlib"})
public abstract interface FunctionBase<R>
  extends Function<R>
{
  public abstract int getArity();
}

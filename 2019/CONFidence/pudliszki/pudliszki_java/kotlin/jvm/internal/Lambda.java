package kotlin.jvm.internal;

import java.io.Serializable;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\036\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\020\016\n\000\b&\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\0022\0020\003B\r\022\006\020\004\032\0020\005¢\006\002\020\006J\b\020\t\032\0020\nH\026R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\013"}, d2={"Lkotlin/jvm/internal/Lambda;", "R", "Lkotlin/jvm/internal/FunctionBase;", "Ljava/io/Serializable;", "arity", "", "(I)V", "getArity", "()I", "toString", "", "kotlin-stdlib"})
public abstract class Lambda<R>
  implements FunctionBase<R>, Serializable {
  private final int arity;
  
  public Lambda(int arity) { this.arity = arity; } public int getArity() { return arity; } @org.jetbrains.annotations.NotNull
  public String toString() { String tmp4_1 = Reflection.renderLambdaToString(this);Intrinsics.checkExpressionValueIsNotNull(tmp4_1, "Reflection.renderLambdaToString(this)");return tmp4_1;
  }
}

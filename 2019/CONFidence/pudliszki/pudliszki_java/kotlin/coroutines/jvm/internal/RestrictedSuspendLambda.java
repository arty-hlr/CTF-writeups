package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


























































































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\016\n\000\b!\030\0002\0020\0012\n\022\006\022\004\030\0010\0030\0022\0020\004B\017\b\026\022\006\020\005\032\0020\006¢\006\002\020\007B\037\022\006\020\005\032\0020\006\022\020\020\b\032\f\022\006\022\004\030\0010\003\030\0010\t¢\006\002\020\nJ\b\020\r\032\0020\016H\026R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\013\020\f¨\006\017"}, d2={"Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/jvm/internal/FunctionBase;", "", "Lkotlin/coroutines/jvm/internal/SuspendFunction;", "arity", "", "(I)V", "completion", "Lkotlin/coroutines/Continuation;", "(ILkotlin/coroutines/Continuation;)V", "getArity", "()I", "toString", "", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public abstract class RestrictedSuspendLambda
  extends RestrictedContinuationImpl
  implements FunctionBase<Object>, SuspendFunction
{
  private final int arity;
  
  public int getArity() { return arity; }
  
  public RestrictedSuspendLambda(int arity, @Nullable Continuation<Object> completion) { super(completion);this.arity = arity; }
  public RestrictedSuspendLambda(int arity) { this(arity, null); }
  
  @NotNull
  public String toString() {
    String tmp14_11 = Reflection.renderLambdaToString((FunctionBase)this);Intrinsics.checkExpressionValueIsNotNull(tmp14_11, "Reflection.renderLambdaToString(this)");
    
    return getCompletion() == null ? tmp14_11 : super.toString();
  }
}

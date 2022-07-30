package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;


public class FunctionReference
  extends CallableReference
  implements FunctionBase, KFunction
{
  private final int arity;
  
  public FunctionReference(int arity)
  {
    this.arity = arity;
  }
  
  @SinceKotlin(version="1.1")
  public FunctionReference(int arity, Object receiver) {
    super(receiver);
    this.arity = arity;
  }
  
  public int getArity()
  {
    return arity;
  }
  
  @SinceKotlin(version="1.1")
  protected KFunction getReflected()
  {
    return (KFunction)super.getReflected();
  }
  
  @SinceKotlin(version="1.1")
  protected KCallable computeReflected()
  {
    return Reflection.function(this);
  }
  
  @SinceKotlin(version="1.1")
  public boolean isInline()
  {
    return getReflected().isInline();
  }
  
  @SinceKotlin(version="1.1")
  public boolean isExternal()
  {
    return getReflected().isExternal();
  }
  
  @SinceKotlin(version="1.1")
  public boolean isOperator()
  {
    return getReflected().isOperator();
  }
  
  @SinceKotlin(version="1.1")
  public boolean isInfix()
  {
    return getReflected().isInfix();
  }
  
  @SinceKotlin(version="1.1")
  public boolean isSuspend()
  {
    return getReflected().isSuspend();
  }
  
  public boolean equals(Object obj)
  {
    if (obj == this) return true;
    if ((obj instanceof FunctionReference)) {
      FunctionReference other = (FunctionReference)obj;
      
      return (getOwner() == null ? other.getOwner() == null : getOwner().equals(other.getOwner())) && (getName().equals(other.getName())) && (getSignature().equals(other.getSignature())) && (Intrinsics.areEqual(getBoundReceiver(), other.getBoundReceiver()));
    }
    


    if ((obj instanceof KFunction)) {
      return obj.equals(compute());
    }
    return false;
  }
  
  public int hashCode()
  {
    return ((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31 + getSignature().hashCode();
  }
  
  public String toString()
  {
    KCallable reflected = compute();
    if (reflected != this) {
      return reflected.toString();
    }
    

    return "function " + getName() + " (Kotlin reflection is not available)";
  }
}

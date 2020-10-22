package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;




public abstract class PropertyReference
  extends CallableReference
  implements KProperty
{
  public PropertyReference() {}
  
  @SinceKotlin(version="1.1")
  public PropertyReference(Object receiver)
  {
    super(receiver);
  }
  
  @SinceKotlin(version="1.1")
  protected KProperty getReflected()
  {
    return (KProperty)super.getReflected();
  }
  
  @SinceKotlin(version="1.1")
  public boolean isLateinit()
  {
    return getReflected().isLateinit();
  }
  
  @SinceKotlin(version="1.1")
  public boolean isConst()
  {
    return getReflected().isConst();
  }
  
  public boolean equals(Object obj)
  {
    if (obj == this) return true;
    if ((obj instanceof PropertyReference)) {
      PropertyReference other = (PropertyReference)obj;
      return (getOwner().equals(other.getOwner())) && (getName().equals(other.getName())) && (getSignature().equals(other.getSignature())) && (Intrinsics.areEqual(getBoundReceiver(), other.getBoundReceiver()));
    }
    


    if ((obj instanceof KProperty)) {
      return obj.equals(compute());
    }
    return false;
  }
  
  public int hashCode()
  {
    return (getOwner().hashCode() * 31 + getName().hashCode()) * 31 + getSignature().hashCode();
  }
  
  public String toString()
  {
    KCallable reflected = compute();
    if (reflected != this) {
      return reflected.toString();
    }
    
    return "property " + getName() + " (Kotlin reflection is not available)";
  }
}

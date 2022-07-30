package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KMutableProperty0.Setter;
import kotlin.reflect.KProperty0.Getter;

public class MutablePropertyReference0Impl
  extends MutablePropertyReference0
{
  private final KDeclarationContainer owner;
  private final String name;
  private final String signature;
  
  public MutablePropertyReference0Impl(KDeclarationContainer owner, String name, String signature)
  {
    this.owner = owner;
    this.name = name;
    this.signature = signature;
  }
  
  public KDeclarationContainer getOwner()
  {
    return owner;
  }
  
  public String getName()
  {
    return name;
  }
  
  public String getSignature()
  {
    return signature;
  }
  
  public Object get()
  {
    return getGetter().call(new Object[0]);
  }
  
  public void set(Object value)
  {
    getSetter().call(new Object[] { value });
  }
}

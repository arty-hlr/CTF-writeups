package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KMutableProperty2.Setter;
import kotlin.reflect.KProperty2.Getter;

public class MutablePropertyReference2Impl
  extends MutablePropertyReference2
{
  private final KDeclarationContainer owner;
  private final String name;
  private final String signature;
  
  public MutablePropertyReference2Impl(KDeclarationContainer owner, String name, String signature)
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
  
  public Object get(Object receiver1, Object receiver2)
  {
    return getGetter().call(new Object[] { receiver1, receiver2 });
  }
  
  public void set(Object receiver1, Object receiver2, Object value)
  {
    getSetter().call(new Object[] { receiver1, receiver2, value });
  }
}

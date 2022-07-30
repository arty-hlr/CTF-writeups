package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1.Getter;


public class PropertyReference1Impl
  extends PropertyReference1
{
  private final KDeclarationContainer owner;
  private final String name;
  private final String signature;
  
  public PropertyReference1Impl(KDeclarationContainer owner, String name, String signature)
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
  
  public Object get(Object receiver)
  {
    return getGetter().call(new Object[] { receiver });
  }
}

package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KCallable;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;













public abstract class CallableReference
  implements KCallable, Serializable
{
  private transient KCallable reflected;
  @SinceKotlin(version="1.1")
  protected final Object receiver;
  @SinceKotlin(version="1.1")
  public static final Object NO_RECEIVER = NoReceiver.INSTANCE;
  
  @SinceKotlin(version="1.2")
  private static class NoReceiver implements Serializable { private NoReceiver() {}
    private static final NoReceiver INSTANCE = new NoReceiver();
    
    private Object readResolve() throws ObjectStreamException {
      return INSTANCE;
    }
  }
  
  public CallableReference() {
    this(NO_RECEIVER);
  }
  
  @SinceKotlin(version="1.1")
  protected CallableReference(Object receiver) {
    this.receiver = receiver;
  }
  
  protected abstract KCallable computeReflected();
  
  @SinceKotlin(version="1.1")
  public Object getBoundReceiver() {
    return receiver;
  }
  
  @SinceKotlin(version="1.1")
  public KCallable compute() {
    KCallable result = reflected;
    if (result == null) {
      result = computeReflected();
      reflected = result;
    }
    return result;
  }
  
  @SinceKotlin(version="1.1")
  protected KCallable getReflected() {
    KCallable result = compute();
    if (result == this) {
      throw new KotlinReflectionNotSupportedError();
    }
    return result;
  }
  





  public KDeclarationContainer getOwner()
  {
    throw new AbstractMethodError();
  }
  



  public String getName()
  {
    throw new AbstractMethodError();
  }
  







  public String getSignature()
  {
    throw new AbstractMethodError();
  }
  



  public List<KParameter> getParameters()
  {
    return getReflected().getParameters();
  }
  
  public KType getReturnType()
  {
    return getReflected().getReturnType();
  }
  
  public List<Annotation> getAnnotations()
  {
    return getReflected().getAnnotations();
  }
  
  @SinceKotlin(version="1.1")
  public List<KTypeParameter> getTypeParameters()
  {
    return getReflected().getTypeParameters();
  }
  
  public Object call(Object... args)
  {
    return getReflected().call(args);
  }
  
  public Object callBy(Map args)
  {
    return getReflected().callBy(args);
  }
  
  @SinceKotlin(version="1.1")
  public KVisibility getVisibility()
  {
    return getReflected().getVisibility();
  }
  
  @SinceKotlin(version="1.1")
  public boolean isFinal()
  {
    return getReflected().isFinal();
  }
  
  @SinceKotlin(version="1.1")
  public boolean isOpen()
  {
    return getReflected().isOpen();
  }
  
  @SinceKotlin(version="1.1")
  public boolean isAbstract()
  {
    return getReflected().isAbstract();
  }
  
  @SinceKotlin(version="1.3")
  public boolean isSuspend()
  {
    return getReflected().isSuspend();
  }
}

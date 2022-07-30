package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty2;

public class ReflectionFactory
{
  private static final String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";
  
  public ReflectionFactory() {}
  
  public KClass createKotlinClass(Class javaClass)
  {
    return new ClassReference(javaClass);
  }
  
  public KClass createKotlinClass(Class javaClass, String internalName) {
    return new ClassReference(javaClass);
  }
  
  public kotlin.reflect.KDeclarationContainer getOrCreateKotlinPackage(Class javaClass, String moduleName) {
    return new PackageReference(javaClass, moduleName);
  }
  
  public KClass getOrCreateKotlinClass(Class javaClass) {
    return new ClassReference(javaClass);
  }
  
  public KClass getOrCreateKotlinClass(Class javaClass, String internalName) {
    return new ClassReference(javaClass);
  }
  
  @SinceKotlin(version="1.1")
  public String renderLambdaToString(Lambda lambda) {
    return renderLambdaToString(lambda);
  }
  
  @SinceKotlin(version="1.3")
  public String renderLambdaToString(FunctionBase lambda) {
    String result = lambda.getClass().getGenericInterfaces()[0].toString();
    return result.startsWith("kotlin.jvm.functions.") ? result.substring("kotlin.jvm.functions.".length()) : result;
  }
  

  public kotlin.reflect.KFunction function(FunctionReference f)
  {
    return f;
  }
  

  public kotlin.reflect.KProperty0 property0(PropertyReference0 p)
  {
    return p;
  }
  
  public kotlin.reflect.KMutableProperty0 mutableProperty0(MutablePropertyReference0 p) {
    return p;
  }
  
  public kotlin.reflect.KProperty1 property1(PropertyReference1 p) {
    return p;
  }
  
  public kotlin.reflect.KMutableProperty1 mutableProperty1(MutablePropertyReference1 p) {
    return p;
  }
  
  public KProperty2 property2(PropertyReference2 p) {
    return p;
  }
  
  public kotlin.reflect.KMutableProperty2 mutableProperty2(MutablePropertyReference2 p) {
    return p;
  }
}

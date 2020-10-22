package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000p\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\020\033\n\002\b\003\n\002\020\036\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\022\n\002\030\002\n\002\b\007\n\002\020\016\n\002\b\b\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\020\001\n\000\n\002\020\b\n\002\b\004\030\0002\b\022\004\022\0020\0020\0012\0020\003B\021\022\n\020\004\032\006\022\002\b\0030\005¢\006\002\020\006J\023\020B\032\0020\0222\b\020C\032\004\030\0010\002H\002J\b\020D\032\0020EH\002J\b\020F\032\0020GH\026J\022\020H\032\0020\0222\b\020I\032\004\030\0010\002H\027J\b\020J\032\0020-H\026R\032\020\007\032\b\022\004\022\0020\t0\b8VX\004¢\006\006\032\004\b\n\020\013R \020\f\032\016\022\n\022\b\022\004\022\0020\0020\0160\r8VX\004¢\006\006\032\004\b\017\020\020R\032\020\021\032\0020\0228VX\004¢\006\f\022\004\b\023\020\024\032\004\b\021\020\025R\032\020\026\032\0020\0228VX\004¢\006\f\022\004\b\027\020\024\032\004\b\026\020\025R\032\020\030\032\0020\0228VX\004¢\006\f\022\004\b\031\020\024\032\004\b\030\020\025R\032\020\032\032\0020\0228VX\004¢\006\f\022\004\b\033\020\024\032\004\b\032\020\025R\032\020\034\032\0020\0228VX\004¢\006\f\022\004\b\035\020\024\032\004\b\034\020\025R\032\020\036\032\0020\0228VX\004¢\006\f\022\004\b\037\020\024\032\004\b\036\020\025R\032\020 \032\0020\0228VX\004¢\006\f\022\004\b!\020\024\032\004\b \020\025R\030\020\004\032\006\022\002\b\0030\005X\004¢\006\b\n\000\032\004\b\"\020#R\036\020$\032\f\022\b\022\006\022\002\b\0030%0\r8VX\004¢\006\006\032\004\b&\020\020R\036\020'\032\f\022\b\022\006\022\002\b\0030\0010\r8VX\004¢\006\006\032\004\b(\020\020R\026\020)\032\004\030\0010\0028VX\004¢\006\006\032\004\b*\020+R\026\020,\032\004\030\0010-8VX\004¢\006\006\032\004\b.\020/R(\0200\032\020\022\f\022\n\022\006\b\001\022\0020\0020\0010\b8VX\004¢\006\f\022\004\b1\020\024\032\004\b2\020\013R\026\0203\032\004\030\0010-8VX\004¢\006\006\032\004\b4\020/R \0205\032\b\022\004\022\002060\b8VX\004¢\006\f\022\004\b7\020\024\032\004\b8\020\013R \0209\032\b\022\004\022\0020:0\b8VX\004¢\006\f\022\004\b;\020\024\032\004\b<\020\013R\034\020=\032\004\030\0010>8VX\004¢\006\f\022\004\b?\020\024\032\004\b@\020A¨\006K"}, d2={"Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "constructors", "", "Lkotlin/reflect/KFunction;", "getConstructors", "()Ljava/util/Collection;", "isAbstract", "", "isAbstract$annotations", "()V", "()Z", "isCompanion", "isCompanion$annotations", "isData", "isData$annotations", "isFinal", "isFinal$annotations", "isInner", "isInner$annotations", "isOpen", "isOpen$annotations", "isSealed", "isSealed$annotations", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "sealedSubclasses$annotations", "getSealedSubclasses", "simpleName", "getSimpleName", "supertypes", "Lkotlin/reflect/KType;", "supertypes$annotations", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "typeParameters$annotations", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "visibility$annotations", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "error", "", "hashCode", "", "isInstance", "value", "toString", "kotlin-stdlib"})
public final class ClassReference implements kotlin.reflect.KClass<Object>, ClassBasedDeclarationContainer { @NotNull
  private final Class<?> jClass;
  
  @NotNull
  public Class<?> getJClass() { return jClass; } public ClassReference(@NotNull Class<?> jClass) { this.jClass = jClass; }
  @org.jetbrains.annotations.Nullable
  public String getSimpleName() { throw null; }
  
  @org.jetbrains.annotations.Nullable
  public String getQualifiedName() { throw null; }
  
  @NotNull
  public java.util.Collection<kotlin.reflect.KCallable<?>> getMembers() { throw null; }
  
  @NotNull
  public java.util.Collection<kotlin.reflect.KFunction<Object>> getConstructors() { throw null; }
  
  @NotNull
  public java.util.Collection<kotlin.reflect.KClass<?>> getNestedClasses() { throw null; }
  
  @NotNull
  public java.util.List<java.lang.annotation.Annotation> getAnnotations() { throw null; }
  
  @org.jetbrains.annotations.Nullable
  public Object getObjectInstance() { throw null; }
  
  @kotlin.SinceKotlin(version="1.1")
  public boolean isInstance(@org.jetbrains.annotations.Nullable Object value) { throw null; }
  
  @NotNull
  public java.util.List<kotlin.reflect.KTypeParameter> getTypeParameters() {
    throw null;
  }
  
  @NotNull
  public java.util.List<kotlin.reflect.KType> getSupertypes() { throw null; }
  
  @NotNull
  public java.util.List<kotlin.reflect.KClass<? extends Object>> getSealedSubclasses() {
    throw null;
  }
  
  @org.jetbrains.annotations.Nullable
  public kotlin.reflect.KVisibility getVisibility() { throw null; }
  
  public boolean isFinal()
  {
    throw null;
  }
  
  public boolean isOpen() {
    throw null;
  }
  
  public boolean isAbstract() {
    throw null;
  }
  
  public boolean isSealed() {
    throw null;
  }
  
  public boolean isData() {
    throw null;
  }
  
  public boolean isInner() {
    throw null;
  }
  

  public boolean isCompanion() { throw null; }
  
  private final Void error() { throw ((Throwable)new kotlin.jvm.KotlinReflectionNotSupportedError()); }
  
  public boolean equals(@org.jetbrains.annotations.Nullable Object other) {
    return ((other instanceof ClassReference)) && (Intrinsics.areEqual(kotlin.jvm.JvmClassMappingKt.getJavaObjectType(this), kotlin.jvm.JvmClassMappingKt.getJavaObjectType((kotlin.reflect.KClass)other)));
  }
  
  public int hashCode() { return kotlin.jvm.JvmClassMappingKt.getJavaObjectType(this).hashCode(); }
  
  @NotNull
  public String toString() { return getJClass().toString() + " (Kotlin reflection is not available)"; }
}

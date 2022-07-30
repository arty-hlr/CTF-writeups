package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\0008\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\036\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\007\030\0002\0020\001B\031\022\n\020\002\032\006\022\002\b\0030\003\022\006\020\004\032\0020\005¢\006\002\020\006J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021H\002J\b\020\022\032\0020\023H\026J\b\020\024\032\0020\005H\026R\030\020\002\032\006\022\002\b\0030\003X\004¢\006\b\n\000\032\004\b\007\020\bR\036\020\t\032\f\022\b\022\006\022\002\b\0030\0130\n8VX\004¢\006\006\032\004\b\f\020\rR\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\025"}, d2={"Lkotlin/jvm/internal/PackageReference;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "jClass", "Ljava/lang/Class;", "moduleName", "", "(Ljava/lang/Class;Ljava/lang/String;)V", "getJClass", "()Ljava/lang/Class;", "members", "", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-stdlib"})
@kotlin.SinceKotlin(version="1.1")
public final class PackageReference implements ClassBasedDeclarationContainer { @NotNull
  private final Class<?> jClass;
  private final String moduleName;
  
  public PackageReference(@NotNull Class<?> jClass, @NotNull String moduleName) { this.jClass = jClass;this.moduleName = moduleName; } @NotNull
  public Class<?> getJClass() { return jClass; }
  
  @NotNull
  public java.util.Collection<kotlin.reflect.KCallable<?>> getMembers() {
    throw ((Throwable)new kotlin.jvm.KotlinReflectionNotSupportedError());
  }
  
  public boolean equals(@org.jetbrains.annotations.Nullable Object other) { return ((other instanceof PackageReference)) && (Intrinsics.areEqual(getJClass(), ((PackageReference)other).getJClass())); }
  

  public int hashCode() { return getJClass().hashCode(); }
  
  @NotNull
  public String toString() { return getJClass().toString() + " (Kotlin reflection is not available)"; }
}

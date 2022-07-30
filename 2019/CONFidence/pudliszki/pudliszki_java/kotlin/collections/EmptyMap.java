package kotlin.collections;

import java.util.Map;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000L\n\002\030\002\n\002\020$\n\002\020\000\n\002\020\001\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\"\n\002\020&\n\002\b\005\n\002\020\t\n\000\n\002\020\b\n\002\b\003\n\002\020\036\n\002\b\003\n\002\020\013\n\002\b\n\n\002\020\016\n\000\bÂ\002\030\0002\020\022\006\022\004\030\0010\002\022\004\022\0020\0030\0012\0060\004j\002`\005B\007\b\002¢\006\002\020\006J\022\020\030\032\0020\0312\b\020\032\032\004\030\0010\002H\026J\020\020\033\032\0020\0312\006\020\034\032\0020\003H\026J\023\020\035\032\0020\0312\b\020\036\032\004\030\0010\002H\002J\025\020\037\032\004\030\0010\0032\b\020\032\032\004\030\0010\002H\002J\b\020 \032\0020\021H\026J\b\020!\032\0020\031H\026J\b\020\"\032\0020\002H\002J\b\020#\032\0020$H\026R(\020\007\032\026\022\022\022\020\022\006\022\004\030\0010\002\022\004\022\0020\0030\t0\b8VX\004¢\006\006\032\004\b\n\020\013R\034\020\f\032\n\022\006\022\004\030\0010\0020\b8VX\004¢\006\006\032\004\b\r\020\013R\016\020\016\032\0020\017XT¢\006\002\n\000R\024\020\020\032\0020\0218VX\004¢\006\006\032\004\b\022\020\023R\032\020\024\032\b\022\004\022\0020\0030\0258VX\004¢\006\006\032\004\b\026\020\027¨\006%"}, d2={"Lkotlin/collections/EmptyMap;", "", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "serialVersionUID", "", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "containsKey", "", "key", "containsValue", "value", "equals", "other", "get", "hashCode", "isEmpty", "readResolve", "toString", "", "kotlin-stdlib"})
final class EmptyMap implements Map, java.io.Serializable, kotlin.jvm.internal.markers.KMappedMarker
{
  private static final long serialVersionUID = 8246714829545688274L;
  public static final EmptyMap INSTANCE;
  
  static
  {
    EmptyMap localEmptyMap = new EmptyMap();INSTANCE = localEmptyMap;
  }
  
  public boolean equals(@org.jetbrains.annotations.Nullable Object other) { return ((other instanceof Map)) && (((Map)other).isEmpty()); }
  public int hashCode() { return 0; } @org.jetbrains.annotations.NotNull
  public String toString() { return "{}"; }
  
  public int getSize() { return 0; }
  public boolean isEmpty() { return true; }
  
  public boolean containsKey(@org.jetbrains.annotations.Nullable Object key) { return false; }
  public boolean containsValue(@org.jetbrains.annotations.NotNull Void value) { kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");return false; } @org.jetbrains.annotations.Nullable
  public Void get(@org.jetbrains.annotations.Nullable Object key) { return null; } @org.jetbrains.annotations.NotNull
  public java.util.Set<java.util.Map.Entry> getEntries() { return (java.util.Set)EmptySet.INSTANCE; } @org.jetbrains.annotations.NotNull
  public java.util.Set<Object> getKeys() { return (java.util.Set)EmptySet.INSTANCE; } @org.jetbrains.annotations.NotNull
  public java.util.Collection getValues() { return (java.util.Collection)EmptyList.INSTANCE; }
  
  private final Object readResolve() { return INSTANCE; }
  
  private EmptyMap() {}
  
  public void clear()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public Void put(Object paramObject, Void paramVoid)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public void putAll(Map paramMap)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public Object remove(Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

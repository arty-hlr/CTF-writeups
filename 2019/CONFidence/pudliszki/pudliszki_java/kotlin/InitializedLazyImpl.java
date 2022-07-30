package kotlin;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;




















































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\016\n\000\b\000\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\0022\0060\003j\002`\004B\r\022\006\020\005\032\0028\000¢\006\002\020\006J\b\020\n\032\0020\013H\026J\b\020\f\032\0020\rH\026R\026\020\005\032\0028\000X\004¢\006\n\n\002\020\t\032\004\b\007\020\b¨\006\016"}, d2={"Lkotlin/InitializedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "isInitialized", "", "toString", "", "kotlin-stdlib"})
public final class InitializedLazyImpl<T>
  implements Lazy<T>, Serializable
{
  private final T value;
  
  public T getValue() { return value; } public InitializedLazyImpl(T value) { this.value = value; }
  
  public boolean isInitialized() { return true; }
  @NotNull
  public String toString() { return String.valueOf(getValue()); }
}

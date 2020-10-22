package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;














































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\0002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\005\n\002\020\013\n\000\n\002\020\016\n\002\b\003\b\002\030\000 \023*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\0022\0060\003j\002`\004:\001\023B\023\022\f\020\005\032\b\022\004\022\0028\0000\006¢\006\002\020\007J\b\020\016\032\0020\017H\026J\b\020\020\032\0020\021H\026J\b\020\022\032\0020\tH\002R\020\020\b\032\004\030\0010\tX\016¢\006\002\n\000R\016\020\n\032\0020\tX\004¢\006\002\n\000R\026\020\005\032\n\022\004\022\0028\000\030\0010\006X\016¢\006\002\n\000R\024\020\013\032\0028\0008VX\004¢\006\006\032\004\b\f\020\r¨\006\024"}, d2={"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", "final", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "Companion", "kotlin-stdlib"})
final class SafePublicationLazyImpl<T>
  implements Lazy<T>, Serializable
{
  public SafePublicationLazyImpl(@NotNull Function0<? extends T> initializer)
  {
    this.initializer = initializer;
    _value = UNINITIALIZED_VALUE.INSTANCE;
    
    jdField_final = UNINITIALIZED_VALUE.INSTANCE;
  }
  
  public T getValue() {
    Object value = _value;
    if (value != UNINITIALIZED_VALUE.INSTANCE)
    {
      return value;
    }
    
    Function0 initializerValue = initializer;
    
    if (initializerValue != null) {
      Object newValue = initializerValue.invoke();
      if (valueUpdater.compareAndSet(this, UNINITIALIZED_VALUE.INSTANCE, newValue)) {
        initializer = ((Function0)null);
        return newValue;
      }
    }
    
    return _value;
  }
  
  public boolean isInitialized() { return _value != UNINITIALIZED_VALUE.INSTANCE; }
  @NotNull
  public String toString() { return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet."; }
  
  private final Object writeReplace() { return new InitializedLazyImpl(getValue()); }
  


  public static final Companion Companion = new Companion(null);
  private static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> valueUpdater = AtomicReferenceFieldUpdater.newUpdater(
    SafePublicationLazyImpl.class, 
    Object.class, 
    "_value");
  private final Object jdField_final;
  private volatile Object _value;
  private volatile Function0<? extends T> initializer;
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R^\020\003\032R\022\024\022\022\022\002\b\003 \006*\b\022\002\b\003\030\0010\0050\005\022\f\022\n \006*\004\030\0010\0010\001 \006*(\022\024\022\022\022\002\b\003 \006*\b\022\002\b\003\030\0010\0050\005\022\f\022\n \006*\004\030\0010\0010\001\030\0010\0040\004X\004¢\006\002\n\000¨\006\007"}, d2={"Lkotlin/SafePublicationLazyImpl$Companion;", "", "()V", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/SafePublicationLazyImpl;", "kotlin.jvm.PlatformType", "kotlin-stdlib"})
  public static final class Companion
  {
    private Companion() {}
  }
}

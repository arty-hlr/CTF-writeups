package kotlin.properties;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\000\n\002\020\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\b\002\030\000*\b\b\000\020\001*\0020\0022\020\022\006\022\004\030\0010\002\022\004\022\002H\0010\003B\005¢\006\002\020\004J$\020\007\032\0028\0002\b\020\b\032\004\030\0010\0022\n\020\t\032\006\022\002\b\0030\nH\002¢\006\002\020\013J,\020\f\032\0020\r2\b\020\b\032\004\030\0010\0022\n\020\t\032\006\022\002\b\0030\n2\006\020\005\032\0028\000H\002¢\006\002\020\016R\022\020\005\032\004\030\0018\000X\016¢\006\004\n\002\020\006¨\006\017"}, d2={"Lkotlin/properties/NotNullVar;", "T", "", "Lkotlin/properties/ReadWriteProperty;", "()V", "value", "Ljava/lang/Object;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "kotlin-stdlib"})
final class NotNullVar<T>
  implements ReadWriteProperty<Object, T>
{
  private T value;
  
  /* Error */
  @NotNull
  public T getValue(@Nullable Object thisRef, @NotNull KProperty<?> property)
  {
    // Byte code:
    //   0: aload_2
    //   1: ldc 16
    //   3: invokestatic 22	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: getfield 24	kotlin/properties/NotNullVar:value	Ljava/lang/Object;
    //   10: dup
    //   11: ifnull +6 -> 17
    //   14: goto +44 -> 58
    //   17: pop
    //   18: new 26	java/lang/IllegalStateException
    //   21: dup
    //   22: new 28	java/lang/StringBuilder
    //   25: dup
    //   26: invokespecial 32	java/lang/StringBuilder:<init>	()V
    //   29: ldc 34
    //   31: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: aload_2
    //   35: invokeinterface 44 1 0
    //   40: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: ldc 46
    //   45: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: invokevirtual 49	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: invokespecial 52	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   54: checkcast 54	java/lang/Throwable
    //   57: athrow
    //   58: areturn
    // Line number table:
    //   Java source line #62	-> byte code offset #6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	NotNullVar
    //   0	59	1	thisRef	Object
    //   0	59	2	property	KProperty
  }
  
  public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, @NotNull T value)
  {
    Intrinsics.checkParameterIsNotNull(property, "property");Intrinsics.checkParameterIsNotNull(value, "value");this.value = value;
  }
  
  public NotNullVar() {}
}

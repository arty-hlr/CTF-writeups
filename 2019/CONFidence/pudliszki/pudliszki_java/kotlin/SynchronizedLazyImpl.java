package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\0000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\n\002\b\006\n\002\020\013\n\000\n\002\020\016\n\002\b\002\b\002\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\0022\0060\003j\002`\004B\037\022\f\020\005\032\b\022\004\022\0028\0000\006\022\n\b\002\020\007\032\004\030\0010\b¢\006\002\020\tJ\b\020\016\032\0020\017H\026J\b\020\020\032\0020\021H\026J\b\020\022\032\0020\bH\002R\020\020\n\032\004\030\0010\bX\016¢\006\002\n\000R\026\020\005\032\n\022\004\022\0028\000\030\0010\006X\016¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000R\024\020\013\032\0028\0008VX\004¢\006\006\032\004\b\f\020\r¨\006\023"}, d2={"Lkotlin/SynchronizedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "lock", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "_value", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"})
final class SynchronizedLazyImpl<T>
  implements Lazy<T>, Serializable
{
  private Function0<? extends T> initializer;
  private volatile Object _value;
  private final Object lock;
  
  /* Error */
  public T getValue()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 19	kotlin/SynchronizedLazyImpl:_value	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: getstatic 25	kotlin/UNINITIALIZED_VALUE:INSTANCE	Lkotlin/UNINITIALIZED_VALUE;
    //   9: if_acmpeq +5 -> 14
    //   12: aload_1
    //   13: areturn
    //   14: aload_0
    //   15: getfield 27	kotlin/SynchronizedLazyImpl:lock	Ljava/lang/Object;
    //   18: astore_2
    //   19: aload_2
    //   20: monitorenter
    //   21: nop
    //   22: aload_0
    //   23: getfield 19	kotlin/SynchronizedLazyImpl:_value	Ljava/lang/Object;
    //   26: astore_3
    //   27: aload_3
    //   28: getstatic 25	kotlin/UNINITIALIZED_VALUE:INSTANCE	Lkotlin/UNINITIALIZED_VALUE;
    //   31: if_acmpeq +7 -> 38
    //   34: aload_3
    //   35: goto +37 -> 72
    //   38: aload_0
    //   39: getfield 29	kotlin/SynchronizedLazyImpl:initializer	Lkotlin/jvm/functions/Function0;
    //   42: dup
    //   43: ifnonnull +6 -> 49
    //   46: invokestatic 35	kotlin/jvm/internal/Intrinsics:throwNpe	()V
    //   49: invokeinterface 40 1 0
    //   54: astore 4
    //   56: aload_0
    //   57: aload 4
    //   59: putfield 19	kotlin/SynchronizedLazyImpl:_value	Ljava/lang/Object;
    //   62: aload_0
    //   63: aconst_null
    //   64: checkcast 37	kotlin/jvm/functions/Function0
    //   67: putfield 29	kotlin/SynchronizedLazyImpl:initializer	Lkotlin/jvm/functions/Function0;
    //   70: aload 4
    //   72: nop
    //   73: astore 4
    //   75: aload_2
    //   76: monitorexit
    //   77: aload 4
    //   79: goto +10 -> 89
    //   82: astore 4
    //   84: aload_2
    //   85: monitorexit
    //   86: aload 4
    //   88: athrow
    //   89: areturn
    // Line number table:
    //   Java source line #63	-> byte code offset #0
    //   Java source line #64	-> byte code offset #5
    //   Java source line #65	-> byte code offset #12
    //   Java source line #66	-> byte code offset #12
    //   Java source line #69	-> byte code offset #14
    //   Java source line #70	-> byte code offset #22
    //   Java source line #71	-> byte code offset #27
    //   Java source line #72	-> byte code offset #34
    //   Java source line #74	-> byte code offset #38
    //   Java source line #75	-> byte code offset #56
    //   Java source line #76	-> byte code offset #62
    //   Java source line #77	-> byte code offset #70
    //   Java source line #71	-> byte code offset #72
    //   Java source line #78	-> byte code offset #72
    //   Java source line #69	-> byte code offset #73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	SynchronizedLazyImpl
    //   5	85	1	_v1	Object
    //   27	45	3	_v2	Object
    //   56	16	4	typedValue	Object
    //   22	51	5	$i$a$1$synchronized	int
    // Exception table:
    //   from	to	target	type
    //   21	75	82	finally
    //   82	84	82	finally
  }
  
  public boolean isInitialized() { return _value != UNINITIALIZED_VALUE.INSTANCE; }
  @NotNull
  public String toString() { return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet."; }
  
  private final Object writeReplace() { return new InitializedLazyImpl(getValue()); }
  
  /* Error */
  public SynchronizedLazyImpl(@NotNull Function0<? extends T> initializer, @org.jetbrains.annotations.Nullable Object lock)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 76
    //   3: invokestatic 80	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: invokespecial 82	java/lang/Object:<init>	()V
    //   10: aload_0
    //   11: aload_1
    //   12: putfield 29	kotlin/SynchronizedLazyImpl:initializer	Lkotlin/jvm/functions/Function0;
    //   15: aload_0
    //   16: getstatic 25	kotlin/UNINITIALIZED_VALUE:INSTANCE	Lkotlin/UNINITIALIZED_VALUE;
    //   19: putfield 19	kotlin/SynchronizedLazyImpl:_value	Ljava/lang/Object;
    //   22: aload_0
    //   23: aload_2
    //   24: dup
    //   25: ifnull +6 -> 31
    //   28: goto +5 -> 33
    //   31: pop
    //   32: aload_0
    //   33: putfield 27	kotlin/SynchronizedLazyImpl:lock	Ljava/lang/Object;
    //   36: return
    // Line number table:
    //   Java source line #55	-> byte code offset #6
    //   Java source line #56	-> byte code offset #10
    //   Java source line #57	-> byte code offset #15
    //   Java source line #59	-> byte code offset #22
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	this	SynchronizedLazyImpl
    //   0	37	1	initializer	Function0
    //   0	37	2	lock	Object
  }
}

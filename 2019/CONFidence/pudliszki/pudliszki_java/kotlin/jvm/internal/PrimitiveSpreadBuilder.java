package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000$\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\006\n\002\020\021\n\002\b\004\n\002\020\002\n\002\b\t\b&\030\000*\b\b\000\020\001*\0020\0022\0020\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\023\020\017\032\0020\0202\006\020\021\032\0028\000¢\006\002\020\022J\b\020\003\032\0020\004H\004J\035\020\023\032\0028\0002\006\020\024\032\0028\0002\006\020\025\032\0028\000H\004¢\006\002\020\026J\021\020\027\032\0020\004*\0028\000H$¢\006\002\020\030R\032\020\006\032\0020\004X\016¢\006\016\n\000\032\004\b\007\020\b\"\004\b\t\020\005R\016\020\003\032\0020\004X\004¢\006\002\n\000R\036\020\n\032\n\022\006\022\004\030\0018\0000\013X\004¢\006\n\n\002\020\016\022\004\b\f\020\r¨\006\031"}, d2={"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "T", "", "size", "", "(I)V", "position", "getPosition", "()I", "setPosition", "spreads", "", "spreads$annotations", "()V", "[Ljava/lang/Object;", "addSpread", "", "spreadArgument", "(Ljava/lang/Object;)V", "toArray", "values", "result", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getSize", "(Ljava/lang/Object;)I", "kotlin-stdlib"})
public abstract class PrimitiveSpreadBuilder<T> {
  private int position;
  private final T[] spreads;
  private final int size;
  
  protected final int getPosition() { return position; } protected final void setPosition(int <set-?>) { position = <set-?>; }
  
  public PrimitiveSpreadBuilder(int size)
  {
    this.size = size;
    




    spreads = new Object[this.size];
  }
  
  public final void addSpread(@NotNull T spreadArgument) { Intrinsics.checkParameterIsNotNull(spreadArgument, "spreadArgument");int i = tmp15_12;spreads[i] = spreadArgument;
  }
  






  @NotNull
  protected final T toArray(@NotNull T values, @NotNull T result)
  {
    Intrinsics.checkParameterIsNotNull(values, "values");Intrinsics.checkParameterIsNotNull(result, "result");int dstIndex = 0;
    int copyValuesFrom = 0;
    int i = 0;int j = size - 1; int i; for (i > j;; i++) {
      Object spreadArgument = spreads[i];
      if (spreadArgument != null) {
        if (copyValuesFrom < i) {
          System.arraycopy(values, copyValuesFrom, result, dstIndex, i - copyValuesFrom);
          dstIndex += i - copyValuesFrom;
        }
        int spreadSize = getSize(spreadArgument);
        System.arraycopy(spreadArgument, 0, result, dstIndex, spreadSize);
        dstIndex += spreadSize;
        copyValuesFrom = i + 1;
      }
      if (i == j) {
        break;
      }
    }
    








    if (copyValuesFrom < size) {
      System.arraycopy(values, copyValuesFrom, result, dstIndex, size - copyValuesFrom);
    }
    
    return result;
  }
  
  protected abstract int getSize(@NotNull T paramT);
  
  /* Error */
  protected final int size()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: aload_0
    //   5: getfield 41	kotlin/jvm/internal/PrimitiveSpreadBuilder:size	I
    //   8: iconst_1
    //   9: isub
    //   10: istore_3
    //   11: iload_2
    //   12: iload_3
    //   13: if_icmpgt +37 -> 50
    //   16: iload_1
    //   17: aload_0
    //   18: getfield 38	kotlin/jvm/internal/PrimitiveSpreadBuilder:spreads	[Ljava/lang/Object;
    //   21: iload_2
    //   22: aaload
    //   23: dup
    //   24: ifnull +11 -> 35
    //   27: aload_0
    //   28: swap
    //   29: invokevirtual 43	kotlin/jvm/internal/PrimitiveSpreadBuilder:getSize	(Ljava/lang/Object;)I
    //   32: goto +5 -> 37
    //   35: pop
    //   36: iconst_1
    //   37: iadd
    //   38: istore_1
    //   39: iload_2
    //   40: iload_3
    //   41: if_icmpeq +9 -> 50
    //   44: iinc 2 1
    //   47: goto -31 -> 16
    //   50: iload_1
    //   51: ireturn
    // Line number table:
    //   Java source line #21	-> byte code offset #0
    //   Java source line #22	-> byte code offset #2
    //   Java source line #23	-> byte code offset #16
    //   Java source line #22	-> byte code offset #39
    //   Java source line #25	-> byte code offset #50
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	this	PrimitiveSpreadBuilder
    //   2	50	1	totalLength	int
    //   16	31	2	i	int
  }
}

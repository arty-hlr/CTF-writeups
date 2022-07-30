package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;









@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000:\n\000\n\002\020\001\n\000\n\002\020\016\n\000\n\002\020\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\002\032\t\020\000\032\0020\001H\b\032\021\020\000\032\0020\0012\006\020\002\032\0020\003H\b\0320\020\004\032\0020\0052\006\020\006\032\0020\0072\022\020\b\032\016\022\004\022\0020\007\022\004\022\0020\0050\tH\b\002\b\n\006\b\001\022\002\020\002\032/\020\n\032\002H\013\"\004\b\000\020\0132\f\020\f\032\b\022\004\022\002H\0130\rH\b\002\n\n\b\b\001\022\002\020\001 \001¢\006\002\020\016\032H\020\017\032\002H\013\"\004\b\000\020\020\"\004\b\001\020\0132\006\020\021\032\002H\0202\027\020\f\032\023\022\004\022\002H\020\022\004\022\002H\0130\t¢\006\002\b\022H\b\002\n\n\b\b\001\022\002\020\002 \001¢\006\002\020\023\0329\020\024\032\002H\020\"\004\b\000\020\020*\002H\0202\022\020\f\032\016\022\004\022\002H\020\022\004\022\0020\0050\tH\b\002\n\n\b\b\001\022\002\020\001 \001¢\006\002\020\023\032>\020\025\032\002H\020\"\004\b\000\020\020*\002H\0202\027\020\f\032\023\022\004\022\002H\020\022\004\022\0020\0050\t¢\006\002\b\022H\b\002\n\n\b\b\001\022\002\020\001 \001¢\006\002\020\023\032?\020\026\032\002H\013\"\004\b\000\020\020\"\004\b\001\020\013*\002H\0202\022\020\f\032\016\022\004\022\002H\020\022\004\022\002H\0130\tH\b\002\n\n\b\b\001\022\002\020\001 \001¢\006\002\020\023\032D\020\n\032\002H\013\"\004\b\000\020\020\"\004\b\001\020\013*\002H\0202\027\020\f\032\023\022\004\022\002H\020\022\004\022\002H\0130\t¢\006\002\b\022H\b\002\n\n\b\b\001\022\002\020\001 \001¢\006\002\020\023\032;\020\027\032\004\030\001H\020\"\004\b\000\020\020*\002H\0202\022\020\030\032\016\022\004\022\002H\020\022\004\022\0020\0310\tH\b\002\n\n\b\b\001\022\002\020\001 \001¢\006\002\020\023\032;\020\032\032\004\030\001H\020\"\004\b\000\020\020*\002H\0202\022\020\030\032\016\022\004\022\002H\020\022\004\022\0020\0310\tH\b\002\n\n\b\b\001\022\002\020\001 \001¢\006\002\020\023¨\006\033"}, d2={"TODO", "", "reason", "", "repeat", "", "times", "", "action", "Lkotlin/Function1;", "run", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "with", "T", "receiver", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "also", "apply", "let", "takeIf", "predicate", "", "takeUnless", "kotlin-stdlib"}, xs="kotlin/StandardKt")
class StandardKt__StandardKt
{
  @InlineOnly
  private static final Void TODO()
  {
    ;
    throw ((Throwable)new NotImplementedError(null, 1, null));
  }
  

  @InlineOnly
  private static final Void TODO(String reason)
  {
    ;
    throw ((Throwable)new NotImplementedError("An operation is not implemented: " + reason));
  }
  



  @InlineOnly
  private static final <R> R run(Function0<? extends R> block)
  {
    ;
    

    return block.invoke();
  }
  


  @InlineOnly
  private static final <T, R> R run(T $receiver, Function1<? super T, ? extends R> block)
  {
    ;
    

    return block.invoke($receiver);
  }
  


  @InlineOnly
  private static final <T, R> R with(T receiver, Function1<? super T, ? extends R> block)
  {
    ;
    

    return block.invoke(receiver);
  }
  


  @InlineOnly
  private static final <T> T apply(T $receiver, Function1<? super T, Unit> block)
  {
    ;
    

    block.invoke($receiver);
    return $receiver;
  }
  


  @InlineOnly
  @SinceKotlin(version="1.1")
  private static final <T> T also(T $receiver, Function1<? super T, Unit> block)
  {
    ;
    

    block.invoke($receiver);
    return $receiver;
  }
  


  @InlineOnly
  private static final <T, R> R let(T $receiver, Function1<? super T, ? extends R> block)
  {
    ;
    

    return block.invoke($receiver);
  }
  


  @InlineOnly
  @SinceKotlin(version="1.1")
  private static final <T> T takeIf(T $receiver, Function1<? super T, Boolean> predicate)
  {
    ;
    

    return ((Boolean)predicate.invoke($receiver)).booleanValue() ? $receiver : null;
  }
  


  @InlineOnly
  @SinceKotlin(version="1.1")
  private static final <T> T takeUnless(T $receiver, Function1<? super T, Boolean> predicate)
  {
    ;
    

    return !((Boolean)predicate.invoke($receiver)).booleanValue() ? $receiver : null;
  }
  




  @InlineOnly
  private static final void repeat(int times, Function1<? super Integer, Unit> action)
  {
    ;
    


    int i = 0; int index; for (int j = times; i < j; index++) {
      action.invoke(Integer.valueOf(index));
    }
  }
  
  public StandardKt__StandardKt() {}
}

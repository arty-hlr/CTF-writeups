package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;




































































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000:\n\000\n\002\020\000\n\000\n\002\020\003\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\017\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\001\032+\020\004\032\b\022\004\022\002H\0060\005\"\004\b\000\020\0062\f\020\007\032\b\022\004\022\002H\0060\bH\bø\001\000¢\006\002\020\t\032\001\020\n\032\002H\006\"\004\b\000\020\006\"\004\b\001\020\013*\b\022\004\022\002H\0130\0052!\020\f\032\035\022\023\022\021H\013¢\006\f\b\016\022\b\b\017\022\004\b\b(\020\022\004\022\002H\0060\r2!\020\021\032\035\022\023\022\0210\003¢\006\f\b\016\022\b\b\017\022\004\b\b(\002\022\004\022\002H\0060\rH\bø\001\000\002\024\n\b\b\001\022\002\020\001 \000\n\b\b\001\022\002\020\002 \000¢\006\002\020\022\0323\020\023\032\002H\006\"\004\b\000\020\006\"\b\b\001\020\013*\002H\006*\b\022\004\022\002H\0130\0052\006\020\024\032\002H\006H\bø\001\000¢\006\002\020\025\032[\020\026\032\002H\006\"\004\b\000\020\006\"\b\b\001\020\013*\002H\006*\b\022\004\022\002H\0130\0052!\020\021\032\035\022\023\022\0210\003¢\006\f\b\016\022\b\b\017\022\004\b\b(\002\022\004\022\002H\0060\rH\bø\001\000\002\n\n\b\b\001\022\002\020\001 \000¢\006\002\020\027\032!\020\030\032\002H\013\"\004\b\000\020\013*\b\022\004\022\002H\0130\005H\bø\001\000¢\006\002\020\031\032]\020\032\032\b\022\004\022\002H\0060\005\"\004\b\000\020\006\"\004\b\001\020\013*\b\022\004\022\002H\0130\0052!\020\033\032\035\022\023\022\021H\013¢\006\f\b\016\022\b\b\017\022\004\b\b(\020\022\004\022\002H\0060\rH\bø\001\000\002\n\n\b\b\001\022\002\020\001 \000¢\006\002\020\027\032P\020\034\032\b\022\004\022\002H\0060\005\"\004\b\000\020\006\"\004\b\001\020\013*\b\022\004\022\002H\0130\0052!\020\033\032\035\022\023\022\021H\013¢\006\f\b\016\022\b\b\017\022\004\b\b(\020\022\004\022\002H\0060\rH\bø\001\000¢\006\002\020\027\032W\020\021\032\b\022\004\022\002H\0130\005\"\004\b\000\020\013*\b\022\004\022\002H\0130\0052!\020\035\032\035\022\023\022\0210\003¢\006\f\b\016\022\b\b\017\022\004\b\b(\002\022\004\022\0020\0360\rH\bø\001\000\002\n\n\b\b\001\022\002\020\001 \000¢\006\002\020\027\032W\020\f\032\b\022\004\022\002H\0130\005\"\004\b\000\020\013*\b\022\004\022\002H\0130\0052!\020\035\032\035\022\023\022\021H\013¢\006\f\b\016\022\b\b\017\022\004\b\b(\020\022\004\022\0020\0360\rH\bø\001\000\002\n\n\b\b\001\022\002\020\001 \000¢\006\002\020\027\032a\020\037\032\b\022\004\022\002H\0060\005\"\004\b\000\020\006\"\b\b\001\020\013*\002H\006*\b\022\004\022\002H\0130\0052!\020\033\032\035\022\023\022\0210\003¢\006\f\b\016\022\b\b\017\022\004\b\b(\002\022\004\022\002H\0060\rH\bø\001\000\002\n\n\b\b\001\022\002\020\001 \000¢\006\002\020\027\032T\020 \032\b\022\004\022\002H\0060\005\"\004\b\000\020\006\"\b\b\001\020\013*\002H\006*\b\022\004\022\002H\0130\0052!\020\033\032\035\022\023\022\0210\003¢\006\f\b\016\022\b\b\017\022\004\b\b(\002\022\004\022\002H\0060\rH\bø\001\000¢\006\002\020\027\032@\020\004\032\b\022\004\022\002H\0060\005\"\004\b\000\020\013\"\004\b\001\020\006*\002H\0132\027\020\007\032\023\022\004\022\002H\013\022\004\022\002H\0060\r¢\006\002\b!H\bø\001\000¢\006\002\020\027\032\030\020\"\032\0020\036*\006\022\002\b\0030\005H\001ø\001\000¢\006\002\020#\002\004\n\002\b\031¨\006$"}, d2={"createFailure", "", "exception", "", "runCatching", "Lkotlin/Result;", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "fold", "T", "onSuccess", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "onFailure", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getOrDefault", "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getOrThrow", "(Ljava/lang/Object;)Ljava/lang/Object;", "map", "transform", "mapCatching", "action", "", "recover", "recoverCatching", "Lkotlin/ExtensionFunctionType;", "throwOnFailure", "(Ljava/lang/Object;)V", "kotlin-stdlib"})
public final class ResultKt
{
  @PublishedApi
  @SinceKotlin(version="1.3")
  @NotNull
  public static final Object createFailure(@NotNull Throwable exception)
  {
    Intrinsics.checkParameterIsNotNull(exception, "exception");return new Result.Failure(exception);
  }
  



  @PublishedApi
  @SinceKotlin(version="1.3")
  public static final void throwOnFailure(@NotNull Object $receiver)
  {
    if (($receiver instanceof Result.Failure)) throw exception;
  }
  
  @InlineOnly
  @SinceKotlin(version="1.3")
  private static final <R> Object runCatching(Function0<? extends R> block)
  {
    Object localObject1;
    try
    {
      ;
      localObject1 = Result.Companion;Object localObject2 = block.invoke();localObject1 = Result.constructor-impl(localObject2);
    } catch (Throwable e) {
      Result.Companion localCompanion = Result.Companion;localObject1 = Result.constructor-impl(createFailure(e));
    }
    return localObject1;
  }
  


  @InlineOnly
  @SinceKotlin(version="1.3")
  private static final <T, R> Object runCatching(T $receiver, Function1<? super T, ? extends R> block)
  {
    Object localObject1;
    
    try
    {
      ;
      
      localObject1 = Result.Companion;Object localObject2 = block.invoke($receiver);localObject1 = Result.constructor-impl(localObject2);
    } catch (Throwable e) {
      Result.Companion localCompanion = Result.Companion;localObject1 = Result.constructor-impl(createFailure(e));
    }
    return localObject1;
  }
  





  @InlineOnly
  @SinceKotlin(version="1.3")
  private static final <T> T getOrThrow(@NotNull Object $receiver)
  {
    ;
    




    throwOnFailure($receiver);
    return $receiver;
  }
  





  @InlineOnly
  @SinceKotlin(version="1.3")
  private static final <R, T extends R> R getOrElse(@NotNull Object $receiver, Function1<? super Throwable, ? extends R> onFailure)
  {
    ;
    



    Throwable exception = Result.exceptionOrNull-impl($receiver);return exception == null ? 
      $receiver : 
      onFailure.invoke(exception);
  }
  



  @InlineOnly
  @SinceKotlin(version="1.3")
  private static final <R, T extends R> R getOrDefault(@NotNull Object $receiver, R defaultValue)
  {
    ;
    

    if (Result.isFailure-impl($receiver)) return defaultValue;
    return $receiver;
  }
  






  @InlineOnly
  @SinceKotlin(version="1.3")
  private static final <R, T> R fold(@NotNull Object $receiver, Function1<? super T, ? extends R> onSuccess, Function1<? super Throwable, ? extends R> onFailure)
  {
    ;
    




    Throwable exception = Result.exceptionOrNull-impl($receiver);return exception == null ? 
      onSuccess.invoke($receiver) : 
      onFailure.invoke(exception);
  }
  







  @InlineOnly
  @SinceKotlin(version="1.3")
  private static final <R, T> Object map(@NotNull Object $receiver, Function1<? super T, ? extends R> transform)
  {
    ;
    





    Result.Companion localCompanion = Result.Companion;Object localObject = transform.invoke($receiver);return Result.isSuccess-impl($receiver) ? Result.constructor-impl(localObject) : 
      Result.constructor-impl($receiver);
  }
  




  @InlineOnly
  @SinceKotlin(version="1.3")
  private static final <R, T> Object mapCatching(@NotNull Object $receiver, Function1<? super T, ? extends R> transform)
  {
    ;
    



    Object localObject1 = $receiver; Object localObject2; try { localObject2 = Result.Companion;Object $receiver = localObject1;$receiver = transform.invoke($receiver);localObject2 = Result.constructor-impl($receiver); } catch (Throwable localThrowable) { int $i$a$1$runCatching = Result.Companion;localObject2 = Result.constructor-impl(createFailure(localThrowable));
    }
    return 
      Result.isSuccess-impl($receiver) ? localObject2 : 
      Result.constructor-impl($receiver);
  }
  





  @InlineOnly
  @SinceKotlin(version="1.3")
  private static final <R, T extends R> Object recover(@NotNull Object $receiver, Function1<? super Throwable, ? extends R> transform)
  {
    ;
    




    Throwable exception = Result.exceptionOrNull-impl($receiver);
    
    Result.Companion localCompanion = Result.Companion;Object localObject = transform.invoke(exception);return exception == null ? $receiver : Result.constructor-impl(localObject);
  }
  




  @InlineOnly
  @SinceKotlin(version="1.3")
  private static final <R, T extends R> Object recoverCatching(@NotNull Object $receiver, Function1<? super Throwable, ? extends R> transform)
  {
    ;
    


    Object value = $receiver;
    Throwable exception = Result.exceptionOrNull-impl($receiver);
    
    Object localObject1 = $receiver; Object localObject2; try { localObject2 = Result.Companion;Object $receiver = localObject1;$receiver = transform.invoke(exception);localObject2 = Result.constructor-impl($receiver); } catch (Throwable localThrowable1) { int $i$a$1$runCatching = Result.Companion;localObject2 = Result.constructor-impl(createFailure(localThrowable1));
    }
    return exception == null ? 
      $receiver : 
      localObject2;
  }
  
  /* Error */
  @InlineOnly
  @SinceKotlin(version="1.3")
  private static final <T> Object onFailure(@NotNull Object $receiver, Function1<? super Throwable, Unit> action)
  {
    // Byte code:
    //   0: nop
    //   1: aload_0
    //   2: invokestatic 75	kotlin/Result:exceptionOrNull-impl	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   5: dup
    //   6: ifnull +19 -> 25
    //   9: astore_3
    //   10: aload_3
    //   11: astore 4
    //   13: aload_1
    //   14: aload 4
    //   16: invokeinterface 65 2 0
    //   21: pop
    //   22: goto +4 -> 26
    //   25: pop
    //   26: aload_0
    //   27: areturn
    // Line number table:
    //   Java source line #313	-> byte code offset #0
    //   Java source line #316	-> byte code offset #1
    //   Java source line #316	-> byte code offset #13
    //   Java source line #316	-> byte code offset #22
    //   Java source line #317	-> byte code offset #26
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	28	0	$receiver	Object
    //   0	28	1	action	Function1
    //   0	28	2	$i$f$onFailure	int
    //   13	9	4	it	Throwable
    //   13	9	5	$i$a$2$let	int
  }
  
  @InlineOnly
  @SinceKotlin(version="1.3")
  private static final <T> Object onSuccess(@NotNull Object $receiver, Function1<? super T, Unit> action)
  {
    ;
    if (Result.isSuccess-impl($receiver)) action.invoke($receiver);
    return $receiver;
  }
}

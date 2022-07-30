package kotlin.coroutines.experimental.migration;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000:\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\000\n\002\030\002\n\002\030\002\n\000\032\036\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H\007\032\f\020\004\032\0020\005*\0020\006H\007\032\f\020\007\032\0020\b*\0020\tH\007\032\036\020\n\032\b\022\004\022\002H\0020\003\"\004\b\000\020\002*\b\022\004\022\002H\0020\001H\007\032\f\020\013\032\0020\006*\0020\005H\007\032\f\020\f\032\0020\t*\0020\bH\007\032^\020\r\032\"\022\004\022\002H\017\022\004\022\002H\020\022\n\022\b\022\004\022\002H\0210\003\022\006\022\004\030\0010\0220\016\"\004\b\000\020\017\"\004\b\001\020\020\"\004\b\002\020\021*\"\022\004\022\002H\017\022\004\022\002H\020\022\n\022\b\022\004\022\002H\0210\001\022\006\022\004\030\0010\0220\016H\000\032L\020\r\032\034\022\004\022\002H\017\022\n\022\b\022\004\022\002H\0210\003\022\006\022\004\030\0010\0220\023\"\004\b\000\020\017\"\004\b\001\020\021*\034\022\004\022\002H\017\022\n\022\b\022\004\022\002H\0210\001\022\006\022\004\030\0010\0220\023H\000\032:\020\r\032\026\022\n\022\b\022\004\022\002H\0210\003\022\006\022\004\030\0010\0220\024\"\004\b\000\020\021*\026\022\n\022\b\022\004\022\002H\0210\001\022\006\022\004\030\0010\0220\024H\000¨\006\025"}, d2={"toContinuation", "Lkotlin/coroutines/Continuation;", "T", "Lkotlin/coroutines/experimental/Continuation;", "toContinuationInterceptor", "Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/experimental/ContinuationInterceptor;", "toCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/experimental/CoroutineContext;", "toExperimentalContinuation", "toExperimentalContinuationInterceptor", "toExperimentalCoroutineContext", "toExperimentalSuspendFunction", "Lkotlin/Function3;", "T1", "T2", "R", "", "Lkotlin/Function2;", "Lkotlin/Function1;", "kotlin-stdlib_coroutinesExperimental"})
public final class CoroutinesMigrationKt
{
  /* Error */
  @kotlin.SinceKotlin(version="1.3")
  @NotNull
  public static final <T> kotlin.coroutines.experimental.Continuation<T> toExperimentalContinuation(@NotNull kotlin.coroutines.Continuation<? super T> $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 12
    //   3: invokestatic 18	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: dup
    //   8: instanceof 20
    //   11: ifne +5 -> 16
    //   14: pop
    //   15: aconst_null
    //   16: checkcast 20	kotlin/coroutines/experimental/migration/ContinuationMigration
    //   19: dup
    //   20: ifnull +13 -> 33
    //   23: invokevirtual 24	kotlin/coroutines/experimental/migration/ContinuationMigration:getContinuation	()Lkotlin/coroutines/experimental/Continuation;
    //   26: dup
    //   27: ifnull +6 -> 33
    //   30: goto +15 -> 45
    //   33: pop
    //   34: new 26	kotlin/coroutines/experimental/migration/ExperimentalContinuationMigration
    //   37: dup
    //   38: aload_0
    //   39: invokespecial 30	kotlin/coroutines/experimental/migration/ExperimentalContinuationMigration:<init>	(Lkotlin/coroutines/Continuation;)V
    //   42: checkcast 32	kotlin/coroutines/experimental/Continuation
    //   45: areturn
    // Line number table:
    //   Java source line #22	-> byte code offset #6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	$receiver	kotlin.coroutines.Continuation
  }
  
  /* Error */
  @kotlin.SinceKotlin(version="1.3")
  @NotNull
  public static final <T> kotlin.coroutines.Continuation<T> toContinuation(@NotNull kotlin.coroutines.experimental.Continuation<? super T> $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 12
    //   3: invokestatic 18	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: dup
    //   8: instanceof 26
    //   11: ifne +5 -> 16
    //   14: pop
    //   15: aconst_null
    //   16: checkcast 26	kotlin/coroutines/experimental/migration/ExperimentalContinuationMigration
    //   19: dup
    //   20: ifnull +13 -> 33
    //   23: invokevirtual 41	kotlin/coroutines/experimental/migration/ExperimentalContinuationMigration:getContinuation	()Lkotlin/coroutines/Continuation;
    //   26: dup
    //   27: ifnull +6 -> 33
    //   30: goto +15 -> 45
    //   33: pop
    //   34: new 20	kotlin/coroutines/experimental/migration/ContinuationMigration
    //   37: dup
    //   38: aload_0
    //   39: invokespecial 44	kotlin/coroutines/experimental/migration/ContinuationMigration:<init>	(Lkotlin/coroutines/experimental/Continuation;)V
    //   42: checkcast 36	kotlin/coroutines/Continuation
    //   45: areturn
    // Line number table:
    //   Java source line #29	-> byte code offset #6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	$receiver	kotlin.coroutines.experimental.Continuation
  }
  
  /* Error */
  @kotlin.SinceKotlin(version="1.3")
  @NotNull
  public static final kotlin.coroutines.experimental.CoroutineContext toExperimentalCoroutineContext(@NotNull kotlin.coroutines.CoroutineContext $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 12
    //   3: invokestatic 18	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: getstatic 53	kotlin/coroutines/ContinuationInterceptor:Key	Lkotlin/coroutines/ContinuationInterceptor$Key;
    //   10: checkcast 55	kotlin/coroutines/CoroutineContext$Key
    //   13: invokeinterface 61 2 0
    //   18: checkcast 49	kotlin/coroutines/ContinuationInterceptor
    //   21: astore_1
    //   22: aload_0
    //   23: getstatic 66	kotlin/coroutines/experimental/migration/ContextMigration:Key	Lkotlin/coroutines/experimental/migration/ContextMigration$Key;
    //   26: checkcast 55	kotlin/coroutines/CoroutineContext$Key
    //   29: invokeinterface 61 2 0
    //   34: checkcast 63	kotlin/coroutines/experimental/migration/ContextMigration
    //   37: astore_2
    //   38: aload_0
    //   39: getstatic 53	kotlin/coroutines/ContinuationInterceptor:Key	Lkotlin/coroutines/ContinuationInterceptor$Key;
    //   42: checkcast 55	kotlin/coroutines/CoroutineContext$Key
    //   45: invokeinterface 70 2 0
    //   50: getstatic 66	kotlin/coroutines/experimental/migration/ContextMigration:Key	Lkotlin/coroutines/experimental/migration/ContextMigration$Key;
    //   53: checkcast 55	kotlin/coroutines/CoroutineContext$Key
    //   56: invokeinterface 70 2 0
    //   61: astore_3
    //   62: aload_2
    //   63: dup
    //   64: ifnull +13 -> 77
    //   67: invokevirtual 74	kotlin/coroutines/experimental/migration/ContextMigration:getContext	()Lkotlin/coroutines/experimental/CoroutineContext;
    //   70: dup
    //   71: ifnull +6 -> 77
    //   74: goto +10 -> 84
    //   77: pop
    //   78: getstatic 80	kotlin/coroutines/experimental/EmptyCoroutineContext:INSTANCE	Lkotlin/coroutines/experimental/EmptyCoroutineContext;
    //   81: checkcast 82	kotlin/coroutines/experimental/CoroutineContext
    //   84: astore 4
    //   86: aload_3
    //   87: getstatic 87	kotlin/coroutines/EmptyCoroutineContext:INSTANCE	Lkotlin/coroutines/EmptyCoroutineContext;
    //   90: if_acmpne +8 -> 98
    //   93: aload 4
    //   95: goto +21 -> 116
    //   98: aload 4
    //   100: new 89	kotlin/coroutines/experimental/migration/ExperimentalContextMigration
    //   103: dup
    //   104: aload_3
    //   105: invokespecial 92	kotlin/coroutines/experimental/migration/ExperimentalContextMigration:<init>	(Lkotlin/coroutines/CoroutineContext;)V
    //   108: checkcast 82	kotlin/coroutines/experimental/CoroutineContext
    //   111: invokeinterface 96 2 0
    //   116: astore 5
    //   118: aload_1
    //   119: ifnonnull +8 -> 127
    //   122: aload 5
    //   124: goto +17 -> 141
    //   127: aload 5
    //   129: aload_1
    //   130: invokestatic 100	kotlin/coroutines/experimental/migration/CoroutinesMigrationKt:toExperimentalContinuationInterceptor	(Lkotlin/coroutines/ContinuationInterceptor;)Lkotlin/coroutines/experimental/ContinuationInterceptor;
    //   133: checkcast 82	kotlin/coroutines/experimental/CoroutineContext
    //   136: invokeinterface 96 2 0
    //   141: areturn
    // Line number table:
    //   Java source line #36	-> byte code offset #6
    //   Java source line #37	-> byte code offset #22
    //   Java source line #38	-> byte code offset #38
    //   Java source line #39	-> byte code offset #62
    //   Java source line #40	-> byte code offset #86
    //   Java source line #41	-> byte code offset #118
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	$receiver	kotlin.coroutines.CoroutineContext
    //   22	120	1	interceptor	kotlin.coroutines.ContinuationInterceptor
    //   38	104	2	migration	ContextMigration
    //   62	80	3	remainder	kotlin.coroutines.CoroutineContext
    //   86	56	4	original	kotlin.coroutines.experimental.CoroutineContext
    //   118	24	5	result	kotlin.coroutines.experimental.CoroutineContext
  }
  
  /* Error */
  @kotlin.SinceKotlin(version="1.3")
  @NotNull
  public static final kotlin.coroutines.CoroutineContext toCoroutineContext(@NotNull kotlin.coroutines.experimental.CoroutineContext $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 12
    //   3: invokestatic 18	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: getstatic 116	kotlin/coroutines/experimental/ContinuationInterceptor:Key	Lkotlin/coroutines/experimental/ContinuationInterceptor$Key;
    //   10: checkcast 118	kotlin/coroutines/experimental/CoroutineContext$Key
    //   13: invokeinterface 121 2 0
    //   18: checkcast 113	kotlin/coroutines/experimental/ContinuationInterceptor
    //   21: astore_1
    //   22: aload_0
    //   23: getstatic 124	kotlin/coroutines/experimental/migration/ExperimentalContextMigration:Key	Lkotlin/coroutines/experimental/migration/ExperimentalContextMigration$Key;
    //   26: checkcast 118	kotlin/coroutines/experimental/CoroutineContext$Key
    //   29: invokeinterface 121 2 0
    //   34: checkcast 89	kotlin/coroutines/experimental/migration/ExperimentalContextMigration
    //   37: astore_2
    //   38: aload_0
    //   39: getstatic 116	kotlin/coroutines/experimental/ContinuationInterceptor:Key	Lkotlin/coroutines/experimental/ContinuationInterceptor$Key;
    //   42: checkcast 118	kotlin/coroutines/experimental/CoroutineContext$Key
    //   45: invokeinterface 127 2 0
    //   50: getstatic 124	kotlin/coroutines/experimental/migration/ExperimentalContextMigration:Key	Lkotlin/coroutines/experimental/migration/ExperimentalContextMigration$Key;
    //   53: checkcast 118	kotlin/coroutines/experimental/CoroutineContext$Key
    //   56: invokeinterface 127 2 0
    //   61: astore_3
    //   62: aload_2
    //   63: dup
    //   64: ifnull +13 -> 77
    //   67: invokevirtual 130	kotlin/coroutines/experimental/migration/ExperimentalContextMigration:getContext	()Lkotlin/coroutines/CoroutineContext;
    //   70: dup
    //   71: ifnull +6 -> 77
    //   74: goto +10 -> 84
    //   77: pop
    //   78: getstatic 87	kotlin/coroutines/EmptyCoroutineContext:INSTANCE	Lkotlin/coroutines/EmptyCoroutineContext;
    //   81: checkcast 57	kotlin/coroutines/CoroutineContext
    //   84: astore 4
    //   86: aload_3
    //   87: getstatic 80	kotlin/coroutines/experimental/EmptyCoroutineContext:INSTANCE	Lkotlin/coroutines/experimental/EmptyCoroutineContext;
    //   90: if_acmpne +8 -> 98
    //   93: aload 4
    //   95: goto +21 -> 116
    //   98: aload 4
    //   100: new 63	kotlin/coroutines/experimental/migration/ContextMigration
    //   103: dup
    //   104: aload_3
    //   105: invokespecial 133	kotlin/coroutines/experimental/migration/ContextMigration:<init>	(Lkotlin/coroutines/experimental/CoroutineContext;)V
    //   108: checkcast 57	kotlin/coroutines/CoroutineContext
    //   111: invokeinterface 136 2 0
    //   116: astore 5
    //   118: aload_1
    //   119: ifnonnull +8 -> 127
    //   122: aload 5
    //   124: goto +17 -> 141
    //   127: aload 5
    //   129: aload_1
    //   130: invokestatic 140	kotlin/coroutines/experimental/migration/CoroutinesMigrationKt:toContinuationInterceptor	(Lkotlin/coroutines/experimental/ContinuationInterceptor;)Lkotlin/coroutines/ContinuationInterceptor;
    //   133: checkcast 57	kotlin/coroutines/CoroutineContext
    //   136: invokeinterface 136 2 0
    //   141: areturn
    // Line number table:
    //   Java source line #49	-> byte code offset #6
    //   Java source line #50	-> byte code offset #22
    //   Java source line #51	-> byte code offset #38
    //   Java source line #52	-> byte code offset #62
    //   Java source line #53	-> byte code offset #86
    //   Java source line #54	-> byte code offset #118
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	$receiver	kotlin.coroutines.experimental.CoroutineContext
    //   22	120	1	interceptor	kotlin.coroutines.experimental.ContinuationInterceptor
    //   38	104	2	migration	ExperimentalContextMigration
    //   62	80	3	remainder	kotlin.coroutines.experimental.CoroutineContext
    //   86	56	4	original	kotlin.coroutines.CoroutineContext
    //   118	24	5	result	kotlin.coroutines.CoroutineContext
  }
  
  /* Error */
  @kotlin.SinceKotlin(version="1.3")
  @NotNull
  public static final kotlin.coroutines.experimental.ContinuationInterceptor toExperimentalContinuationInterceptor(@NotNull kotlin.coroutines.ContinuationInterceptor $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 12
    //   3: invokestatic 18	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: dup
    //   8: instanceof 144
    //   11: ifne +5 -> 16
    //   14: pop
    //   15: aconst_null
    //   16: checkcast 144	kotlin/coroutines/experimental/migration/ContinuationInterceptorMigration
    //   19: dup
    //   20: ifnull +13 -> 33
    //   23: invokevirtual 148	kotlin/coroutines/experimental/migration/ContinuationInterceptorMigration:getInterceptor	()Lkotlin/coroutines/experimental/ContinuationInterceptor;
    //   26: dup
    //   27: ifnull +6 -> 33
    //   30: goto +15 -> 45
    //   33: pop
    //   34: new 150	kotlin/coroutines/experimental/migration/ExperimentalContinuationInterceptorMigration
    //   37: dup
    //   38: aload_0
    //   39: invokespecial 153	kotlin/coroutines/experimental/migration/ExperimentalContinuationInterceptorMigration:<init>	(Lkotlin/coroutines/ContinuationInterceptor;)V
    //   42: checkcast 113	kotlin/coroutines/experimental/ContinuationInterceptor
    //   45: areturn
    // Line number table:
    //   Java source line #62	-> byte code offset #6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	$receiver	kotlin.coroutines.ContinuationInterceptor
  }
  
  /* Error */
  @kotlin.SinceKotlin(version="1.3")
  @NotNull
  public static final kotlin.coroutines.ContinuationInterceptor toContinuationInterceptor(@NotNull kotlin.coroutines.experimental.ContinuationInterceptor $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 12
    //   3: invokestatic 18	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: dup
    //   8: instanceof 150
    //   11: ifne +5 -> 16
    //   14: pop
    //   15: aconst_null
    //   16: checkcast 150	kotlin/coroutines/experimental/migration/ExperimentalContinuationInterceptorMigration
    //   19: dup
    //   20: ifnull +13 -> 33
    //   23: invokevirtual 156	kotlin/coroutines/experimental/migration/ExperimentalContinuationInterceptorMigration:getInterceptor	()Lkotlin/coroutines/ContinuationInterceptor;
    //   26: dup
    //   27: ifnull +6 -> 33
    //   30: goto +15 -> 45
    //   33: pop
    //   34: new 144	kotlin/coroutines/experimental/migration/ContinuationInterceptorMigration
    //   37: dup
    //   38: aload_0
    //   39: invokespecial 159	kotlin/coroutines/experimental/migration/ContinuationInterceptorMigration:<init>	(Lkotlin/coroutines/experimental/ContinuationInterceptor;)V
    //   42: checkcast 49	kotlin/coroutines/ContinuationInterceptor
    //   45: areturn
    // Line number table:
    //   Java source line #69	-> byte code offset #6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	$receiver	kotlin.coroutines.experimental.ContinuationInterceptor
  }
  
  @NotNull
  public static final <R> Function1<kotlin.coroutines.experimental.Continuation<? super R>, Object> toExperimentalSuspendFunction(@NotNull Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends Object> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (Function1)new ExperimentalSuspendFunction0Migration($receiver); }
  
  @NotNull
  public static final <T1, R> Function2<T1, kotlin.coroutines.experimental.Continuation<? super R>, Object> toExperimentalSuspendFunction(@NotNull Function2<? super T1, ? super kotlin.coroutines.Continuation<? super R>, ? extends Object> $receiver) { Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (Function2)new ExperimentalSuspendFunction1Migration($receiver); }
  
  @NotNull
  public static final <T1, T2, R> Function3<T1, T2, kotlin.coroutines.experimental.Continuation<? super R>, Object> toExperimentalSuspendFunction(@NotNull Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends Object> $receiver) { Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (Function3)new ExperimentalSuspendFunction2Migration($receiver);
  }
}

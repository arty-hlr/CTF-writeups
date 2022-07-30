package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\0000\n\000\n\002\020\b\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\021\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\032\030\020\002\032\0020\0032\006\020\004\032\0020\0012\006\020\005\032\0020\001H\002\032\016\020\006\032\004\030\0010\007*\0020\bH\002\032\f\020\t\032\0020\001*\0020\bH\002\032\031\020\n\032\n\022\004\022\0020\f\030\0010\013*\0020\bH\001¢\006\002\020\r\032\023\020\016\032\004\030\0010\017*\0020\bH\001¢\006\002\b\020\"\016\020\000\032\0020\001XT¢\006\002\n\000¨\006\021"}, d2={"COROUTINES_DEBUG_METADATA_VERSION", "", "checkDebugMetadataVersion", "", "expected", "actual", "getDebugMetadataAnnotation", "Lkotlin/coroutines/jvm/internal/DebugMetadata;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getLabel", "getSpilledVariableFieldMapping", "", "", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)[Ljava/lang/String;", "getStackTraceElementImpl", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "kotlin-stdlib"})
public final class DebugMetadataKt
{
  private static final int COROUTINES_DEBUG_METADATA_VERSION = 1;
  
  /* Error */
  @kotlin.SinceKotlin(version="1.3")
  @kotlin.jvm.JvmName(name="getStackTraceElement")
  @org.jetbrains.annotations.Nullable
  public static final StackTraceElement getStackTraceElement(@NotNull BaseContinuationImpl $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 15
    //   3: invokestatic 21	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: invokestatic 25	kotlin/coroutines/jvm/internal/DebugMetadataKt:getDebugMetadataAnnotation	(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Lkotlin/coroutines/jvm/internal/DebugMetadata;
    //   10: dup
    //   11: ifnull +6 -> 17
    //   14: goto +6 -> 20
    //   17: pop
    //   18: aconst_null
    //   19: areturn
    //   20: astore_1
    //   21: iconst_1
    //   22: aload_1
    //   23: invokeinterface 31 1 0
    //   28: invokestatic 35	kotlin/coroutines/jvm/internal/DebugMetadataKt:checkDebugMetadataVersion	(II)V
    //   31: aload_0
    //   32: invokestatic 39	kotlin/coroutines/jvm/internal/DebugMetadataKt:getLabel	(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)I
    //   35: istore_2
    //   36: iload_2
    //   37: ifge +7 -> 44
    //   40: iconst_m1
    //   41: goto +11 -> 52
    //   44: aload_1
    //   45: invokeinterface 43 1 0
    //   50: iload_2
    //   51: iaload
    //   52: istore_3
    //   53: getstatic 49	kotlin/coroutines/jvm/internal/ModuleNameRetriever:INSTANCE	Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;
    //   56: aload_0
    //   57: invokevirtual 53	kotlin/coroutines/jvm/internal/ModuleNameRetriever:getModuleName	(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/String;
    //   60: astore 4
    //   62: aload 4
    //   64: ifnonnull +12 -> 76
    //   67: aload_1
    //   68: invokeinterface 57 1 0
    //   73: goto +32 -> 105
    //   76: new 59	java/lang/StringBuilder
    //   79: dup
    //   80: invokespecial 63	java/lang/StringBuilder:<init>	()V
    //   83: aload 4
    //   85: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: bipush 47
    //   90: invokevirtual 70	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   93: aload_1
    //   94: invokeinterface 57 1 0
    //   99: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: astore 5
    //   107: new 75	java/lang/StackTraceElement
    //   110: dup
    //   111: aload 5
    //   113: aload_1
    //   114: invokeinterface 78 1 0
    //   119: aload_1
    //   120: invokeinterface 81 1 0
    //   125: iload_3
    //   126: invokespecial 84	java/lang/StackTraceElement:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   129: areturn
    // Line number table:
    //   Java source line #42	-> byte code offset #6
    //   Java source line #43	-> byte code offset #21
    //   Java source line #44	-> byte code offset #31
    //   Java source line #45	-> byte code offset #36
    //   Java source line #46	-> byte code offset #53
    //   Java source line #47	-> byte code offset #62
    //   Java source line #48	-> byte code offset #107
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	$receiver	BaseContinuationImpl
    //   21	109	1	debugMetadata	DebugMetadata
    //   36	94	2	label	int
    //   53	77	3	lineNumber	int
    //   62	68	4	moduleName	String
    //   107	23	5	moduleAndClass	String
  }
  
  private static final DebugMetadata getDebugMetadataAnnotation(@NotNull BaseContinuationImpl $receiver)
  {
    return (DebugMetadata)$receiver.getClass().getAnnotation(DebugMetadata.class);
  }
  
  /* Error */
  private static final int getLabel(@NotNull BaseContinuationImpl $receiver)
  {
    // Byte code:
    //   0: nop
    //   1: aload_0
    //   2: invokevirtual 100	java/lang/Object:getClass	()Ljava/lang/Class;
    //   5: ldc 109
    //   7: invokevirtual 113	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   10: astore_1
    //   11: aload_1
    //   12: dup
    //   13: ldc 115
    //   15: invokestatic 118	kotlin/jvm/internal/Intrinsics:checkExpressionValueIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   18: iconst_1
    //   19: invokevirtual 124	java/lang/reflect/Field:setAccessible	(Z)V
    //   22: aload_1
    //   23: aload_0
    //   24: invokevirtual 128	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   27: dup
    //   28: instanceof 130
    //   31: ifne +5 -> 36
    //   34: pop
    //   35: aconst_null
    //   36: checkcast 130	java/lang/Integer
    //   39: dup
    //   40: ifnull +9 -> 49
    //   43: invokevirtual 133	java/lang/Integer:intValue	()I
    //   46: goto +5 -> 51
    //   49: pop
    //   50: iconst_0
    //   51: iconst_1
    //   52: isub
    //   53: istore_1
    //   54: goto +6 -> 60
    //   57: astore_2
    //   58: iconst_m1
    //   59: istore_1
    //   60: iload_1
    //   61: ireturn
    // Line number table:
    //   Java source line #94	-> byte code offset #0
    //   Java source line #95	-> byte code offset #1
    //   Java source line #96	-> byte code offset #11
    //   Java source line #97	-> byte code offset #22
    //   Java source line #98	-> byte code offset #57
    //   Java source line #99	-> byte code offset #58
    //   Java source line #94	-> byte code offset #60
    //   Java source line #100	-> byte code offset #61
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	$receiver	BaseContinuationImpl
    //   11	42	1	field	java.lang.reflect.Field
    //   58	2	2	e	Exception
    // Exception table:
    //   from	to	target	type
    //   0	54	57	java/lang/Exception
  }
  
  private static final void checkDebugMetadataVersion(int expected, int actual)
  {
    if (actual > expected) {
      String str = "Debug metadata version mismatch. Expected: " + expected + ", got " + actual + ". Please update the Kotlin standard library.";throw ((Throwable)new IllegalStateException(str.toString()));
    }
  }
  
  /* Error */
  @kotlin.SinceKotlin(version="1.3")
  @kotlin.jvm.JvmName(name="getSpilledVariableFieldMapping")
  @org.jetbrains.annotations.Nullable
  public static final String[] getSpilledVariableFieldMapping(@NotNull BaseContinuationImpl $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 15
    //   3: invokestatic 21	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: invokestatic 25	kotlin/coroutines/jvm/internal/DebugMetadataKt:getDebugMetadataAnnotation	(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Lkotlin/coroutines/jvm/internal/DebugMetadata;
    //   10: dup
    //   11: ifnull +6 -> 17
    //   14: goto +6 -> 20
    //   17: pop
    //   18: aconst_null
    //   19: areturn
    //   20: astore_1
    //   21: iconst_1
    //   22: aload_1
    //   23: invokeinterface 31 1 0
    //   28: invokestatic 35	kotlin/coroutines/jvm/internal/DebugMetadataKt:checkDebugMetadataVersion	(II)V
    //   31: new 161	java/util/ArrayList
    //   34: dup
    //   35: invokespecial 162	java/util/ArrayList:<init>	()V
    //   38: astore_2
    //   39: aload_0
    //   40: invokestatic 39	kotlin/coroutines/jvm/internal/DebugMetadataKt:getLabel	(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)I
    //   43: istore_3
    //   44: aload_1
    //   45: invokeinterface 165 1 0
    //   50: astore 6
    //   52: aload 6
    //   54: arraylength
    //   55: istore 7
    //   57: iconst_0
    //   58: istore 4
    //   60: iload 4
    //   62: iload 7
    //   64: if_icmpge +50 -> 114
    //   67: aload 6
    //   69: iload 4
    //   71: iaload
    //   72: istore 5
    //   74: iload 5
    //   76: iload_3
    //   77: if_icmpne +31 -> 108
    //   80: aload_2
    //   81: aload_1
    //   82: invokeinterface 169 1 0
    //   87: iload 4
    //   89: aaload
    //   90: invokevirtual 173	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   93: pop
    //   94: aload_2
    //   95: aload_1
    //   96: invokeinterface 176 1 0
    //   101: iload 4
    //   103: aaload
    //   104: invokevirtual 173	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   107: pop
    //   108: iinc 4 1
    //   111: goto -51 -> 60
    //   114: aload_2
    //   115: checkcast 178	java/util/Collection
    //   118: astore 4
    //   120: aload 4
    //   122: astore 5
    //   124: aload 5
    //   126: iconst_0
    //   127: anewarray 96	java/lang/String
    //   130: invokeinterface 182 2 0
    //   135: dup
    //   136: ifnonnull +13 -> 149
    //   139: new 184	kotlin/TypeCastException
    //   142: dup
    //   143: ldc -70
    //   145: invokespecial 187	kotlin/TypeCastException:<init>	(Ljava/lang/String;)V
    //   148: athrow
    //   149: checkcast 189	[Ljava/lang/String;
    //   152: areturn
    // Line number table:
    //   Java source line #122	-> byte code offset #6
    //   Java source line #123	-> byte code offset #21
    //   Java source line #124	-> byte code offset #31
    //   Java source line #124	-> byte code offset #38
    //   Java source line #125	-> byte code offset #39
    //   Java source line #126	-> byte code offset #44
    //   Java source line #127	-> byte code offset #74
    //   Java source line #128	-> byte code offset #80
    //   Java source line #129	-> byte code offset #94
    //   Java source line #126	-> byte code offset #108
    //   Java source line #132	-> byte code offset #114
    //   Java source line #136	-> byte code offset #120
    //   Java source line #137	-> byte code offset #124
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	153	0	$receiver	BaseContinuationImpl
    //   21	132	1	debugMetadata	DebugMetadata
    //   39	114	2	res	java.util.ArrayList
    //   44	109	3	label	int
    //   74	37	4	i	int
    //   120	29	4	$receiver$iv	java.util.Collection
    //   74	37	5	labelOfIndex	int
    //   124	25	5	thisCollection$iv	java.util.Collection
    //   120	29	6	$i$f$toTypedArray	int
  }
}

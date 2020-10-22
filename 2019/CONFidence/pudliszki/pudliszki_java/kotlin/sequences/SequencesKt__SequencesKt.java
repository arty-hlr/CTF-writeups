package kotlin.sequences;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000@\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020(\n\002\b\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\021\n\002\b\006\n\002\020\034\n\002\b\005\n\002\030\002\n\002\020 \n\000\032+\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\024\b\004\020\003\032\016\022\n\022\b\022\004\022\002H\0020\0050\004H\b\032\022\020\006\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002\032&\020\007\032\b\022\004\022\002H\0020\001\"\b\b\000\020\002*\0020\b2\016\020\t\032\n\022\006\022\004\030\001H\0020\004\032<\020\007\032\b\022\004\022\002H\0020\001\"\b\b\000\020\002*\0020\b2\016\020\n\032\n\022\006\022\004\030\001H\0020\0042\024\020\t\032\020\022\004\022\002H\002\022\006\022\004\030\001H\0020\013\032=\020\007\032\b\022\004\022\002H\0020\001\"\b\b\000\020\002*\0020\b2\b\020\f\032\004\030\001H\0022\024\020\t\032\020\022\004\022\002H\002\022\006\022\004\030\001H\0020\013H\007¢\006\002\020\r\032+\020\016\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\022\020\017\032\n\022\006\b\001\022\002H\0020\020\"\002H\002¢\006\002\020\021\032\034\020\022\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\005\032\034\020\023\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\001\032C\020\024\032\b\022\004\022\002H\0250\001\"\004\b\000\020\002\"\004\b\001\020\025*\b\022\004\022\002H\0020\0012\030\020\003\032\024\022\004\022\002H\002\022\n\022\b\022\004\022\002H\0250\0050\013H\002¢\006\002\b\026\032)\020\024\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\016\022\n\022\b\022\004\022\002H\0020\0270\001H\007¢\006\002\b\030\032\"\020\024\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\016\022\n\022\b\022\004\022\002H\0020\0010\001\0322\020\031\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\022\020\032\032\016\022\n\022\b\022\004\022\002H\0020\0010\004H\007\032!\020\033\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\n\022\004\022\002H\002\030\0010\001H\b\032@\020\034\032\032\022\n\022\b\022\004\022\002H\0020\036\022\n\022\b\022\004\022\002H\0250\0360\035\"\004\b\000\020\002\"\004\b\001\020\025*\024\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0250\0350\001¨\006\037"}, d2={"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "emptySequence", "generateSequence", "", "nextFunction", "seedFunction", "Lkotlin/Function1;", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "asSequence", "constrainOnce", "flatten", "R", "flatten$SequencesKt__SequencesKt", "", "flattenSequenceOfIterable", "ifEmpty", "defaultValue", "orEmpty", "unzip", "Lkotlin/Pair;", "", "kotlin-stdlib"}, xs="kotlin/sequences/SequencesKt")
class SequencesKt__SequencesKt extends SequencesKt__SequencesJVMKt
{
  @kotlin.internal.InlineOnly
  private static final <T> Sequence<T> Sequence(Function0<? extends Iterator<? extends T>> iterator)
  {
    ;
    (Sequence)new Sequence()
    {
      @NotNull
      public Iterator<T> iterator()
      {
        return (Iterator)$iterator.invoke();
      }
    };
  }
  
  @NotNull
  public static final <T> Sequence<T> asSequence(@NotNull Iterator<? extends T> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return SequencesKt.constrainOnce((Sequence)new SequencesKt__SequencesKt.asSequence..inlined.Sequence.1($receiver));
  }
  

  @NotNull
  public static final <T> Sequence<T> sequenceOf(@NotNull T... elements)
  {
    Intrinsics.checkParameterIsNotNull(elements, "elements");Object[] arrayOfObject = elements;return (arrayOfObject.length == 0 ? 1 : 0) != 0 ? SequencesKt.emptySequence() : kotlin.collections.ArraysKt.asSequence(elements);
  }
  
  @NotNull
  public static final <T> Sequence<T> emptySequence() {
    return (Sequence)EmptySequence.INSTANCE;
  }
  
  /* Error */
  @kotlin.SinceKotlin(version="1.3")
  @kotlin.internal.InlineOnly
  private static final <T> Sequence<T> orEmpty(@org.jetbrains.annotations.Nullable Sequence<? extends T> $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: ifnull +6 -> 8
    //   5: goto +7 -> 12
    //   8: pop
    //   9: invokestatic 51	kotlin/sequences/SequencesKt:emptySequence	()Lkotlin/sequences/Sequence;
    //   12: areturn
    // Line number table:
    //   Java source line #54	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	13	0	$receiver	Sequence
    //   0	13	1	$i$f$orEmpty	int
  }
  
  @kotlin.SinceKotlin(version="1.3")
  @NotNull
  public static final <T> Sequence<T> ifEmpty(@NotNull Sequence<? extends T> $receiver, @NotNull final Function0<? extends Sequence<? extends T>> defaultValue)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(defaultValue, "defaultValue");SequencesKt.sequence((kotlin.jvm.functions.Function2)new kotlin.coroutines.jvm.internal.RestrictedSuspendLambda($receiver, defaultValue)
    {
      private SequenceScope p$;
      Object L$0;
      int label;
      
      /* Error */
      @org.jetbrains.annotations.Nullable
      public final Object invokeSuspend(@NotNull Object result)
      {
        // Byte code:
        //   0: invokestatic 35	kotlin/coroutines/intrinsics/IntrinsicsKt:getCOROUTINE_SUSPENDED	()Ljava/lang/Object;
        //   3: astore 4
        //   5: aload_0
        //   6: getfield 39	kotlin/sequences/SequencesKt__SequencesKt$ifEmpty$1:label	I
        //   9: tableswitch	default:+187->196, 0:+27->36, 1:+92->101, 2:+157->166
        //   36: aload_1
        //   37: dup
        //   38: instanceof 41
        //   41: ifeq +10 -> 51
        //   44: checkcast 41	kotlin/Result$Failure
        //   47: getfield 45	kotlin/Result$Failure:exception	Ljava/lang/Throwable;
        //   50: athrow
        //   51: pop
        //   52: aload_0
        //   53: getfield 47	kotlin/sequences/SequencesKt__SequencesKt$ifEmpty$1:p$	Lkotlin/sequences/SequenceScope;
        //   56: astore_2
        //   57: aload_0
        //   58: getfield 51	kotlin/sequences/SequencesKt__SequencesKt$ifEmpty$1:$this_ifEmpty	Lkotlin/sequences/Sequence;
        //   61: invokeinterface 56 1 0
        //   66: astore_3
        //   67: aload_3
        //   68: invokeinterface 62 1 0
        //   73: ifeq +57 -> 130
        //   76: aload_2
        //   77: aload_3
        //   78: aload_0
        //   79: aload_0
        //   80: aload_3
        //   81: putfield 64	kotlin/sequences/SequencesKt__SequencesKt$ifEmpty$1:L$0	Ljava/lang/Object;
        //   84: aload_0
        //   85: iconst_1
        //   86: putfield 39	kotlin/sequences/SequencesKt__SequencesKt$ifEmpty$1:label	I
        //   89: invokevirtual 70	kotlin/sequences/SequenceScope:yieldAll	(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   92: dup
        //   93: aload 4
        //   95: if_acmpne +31 -> 126
        //   98: aload 4
        //   100: areturn
        //   101: aload_0
        //   102: getfield 64	kotlin/sequences/SequencesKt__SequencesKt$ifEmpty$1:L$0	Ljava/lang/Object;
        //   105: checkcast 58	java/util/Iterator
        //   108: astore_3
        //   109: aload_1
        //   110: dup
        //   111: instanceof 41
        //   114: ifeq +10 -> 124
        //   117: checkcast 41	kotlin/Result$Failure
        //   120: getfield 45	kotlin/Result$Failure:exception	Ljava/lang/Throwable;
        //   123: athrow
        //   124: pop
        //   125: aload_1
        //   126: pop
        //   127: goto +65 -> 192
        //   130: aload_2
        //   131: aload_0
        //   132: getfield 74	kotlin/sequences/SequencesKt__SequencesKt$ifEmpty$1:$defaultValue	Lkotlin/jvm/functions/Function0;
        //   135: invokeinterface 79 1 0
        //   140: checkcast 53	kotlin/sequences/Sequence
        //   143: aload_0
        //   144: aload_0
        //   145: aload_3
        //   146: putfield 64	kotlin/sequences/SequencesKt__SequencesKt$ifEmpty$1:L$0	Ljava/lang/Object;
        //   149: aload_0
        //   150: iconst_2
        //   151: putfield 39	kotlin/sequences/SequencesKt__SequencesKt$ifEmpty$1:label	I
        //   154: invokevirtual 82	kotlin/sequences/SequenceScope:yieldAll	(Lkotlin/sequences/Sequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   157: dup
        //   158: aload 4
        //   160: if_acmpne +31 -> 191
        //   163: aload 4
        //   165: areturn
        //   166: aload_0
        //   167: getfield 64	kotlin/sequences/SequencesKt__SequencesKt$ifEmpty$1:L$0	Ljava/lang/Object;
        //   170: checkcast 58	java/util/Iterator
        //   173: astore_3
        //   174: aload_1
        //   175: dup
        //   176: instanceof 41
        //   179: ifeq +10 -> 189
        //   182: checkcast 41	kotlin/Result$Failure
        //   185: getfield 45	kotlin/Result$Failure:exception	Ljava/lang/Throwable;
        //   188: athrow
        //   189: pop
        //   190: aload_1
        //   191: pop
        //   192: getstatic 88	kotlin/Unit:INSTANCE	Lkotlin/Unit;
        //   195: areturn
        //   196: new 90	java/lang/IllegalStateException
        //   199: dup
        //   200: ldc 92
        //   202: invokespecial 96	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
        //   205: athrow
        // Line number table:
        //   Java source line #64	-> byte code offset #3
        //   Java source line #65	-> byte code offset #57
        //   Java source line #66	-> byte code offset #67
        //   Java source line #67	-> byte code offset #76
        //   Java source line #64	-> byte code offset #98
        //   Java source line #69	-> byte code offset #126
        //   Java source line #64	-> byte code offset #163
        //   Java source line #70	-> byte code offset #191
        //   Java source line #71	-> byte code offset #192
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	206	0	this	1
        //   0	206	1	result	Object
        //   67	125	3	iterator	Iterator
      }
      
      @NotNull
      public final Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable Object value, @NotNull Continuation<?> completion)
      {
        Intrinsics.checkParameterIsNotNull(completion, "completion");
        1 local1 = new 1($this_ifEmpty, defaultValue, completion);
        p$ = ((SequenceScope)value);
        return local1;
      }
      
      public final Object invoke(Object paramAnonymousObject1, Object paramAnonymousObject2)
      {
        return ((1)create(paramAnonymousObject1, (Continuation)paramAnonymousObject2)).invokeSuspend(kotlin.Unit.INSTANCE);
      }
    });
  }
  
  @NotNull
  public static final <T> Sequence<T> flatten(@NotNull Sequence<? extends Sequence<? extends T>> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return flatten$SequencesKt__SequencesKt($receiver, (Function1)flatten.1.INSTANCE);
  }
  

  @kotlin.jvm.JvmName(name="flattenSequenceOfIterable")
  @NotNull
  public static final <T> Sequence<T> flattenSequenceOfIterable(@NotNull Sequence<? extends Iterable<? extends T>> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return flatten$SequencesKt__SequencesKt($receiver, (Function1)flatten.2.INSTANCE);
  }
  
  private static final <T, R> Sequence<R> flatten$SequencesKt__SequencesKt(@NotNull Sequence<? extends T> $receiver, Function1<? super T, ? extends Iterator<? extends R>> iterator) { if (($receiver instanceof TransformingSequence)) {
      return ((TransformingSequence)$receiver).flatten$kotlin_stdlib(iterator);
    }
    return (Sequence)new FlatteningSequence($receiver, (Function1)flatten.3.INSTANCE, iterator);
  }
  





  @NotNull
  public static final <T, R> Pair<java.util.List<T>, java.util.List<R>> unzip(@NotNull Sequence<? extends Pair<? extends T, ? extends R>> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");ArrayList listT = new ArrayList();
    ArrayList listR = new ArrayList();
    for (Pair pair : $receiver) {
      listT.add(pair.getFirst());
      listR.add(pair.getSecond());
    }
    return kotlin.TuplesKt.to(listT, listR);
  }
  
















































































































































































































































































































































































































































































  @NotNull
  public static final <T> Sequence<T> constrainOnce(@NotNull Sequence<? extends T> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return ($receiver instanceof ConstrainedOnceSequence) ? $receiver : (Sequence)new ConstrainedOnceSequence($receiver);
  }
  









  @NotNull
  public static final <T> Sequence<T> generateSequence(@NotNull Function0<? extends T> nextFunction)
  {
    Intrinsics.checkParameterIsNotNull(nextFunction, "nextFunction");SequencesKt.constrainOnce((Sequence)new GeneratorSequence(nextFunction, (Function1)new Lambda(nextFunction) { @org.jetbrains.annotations.Nullable
      public final T invoke(@NotNull T it) { Intrinsics.checkParameterIsNotNull(it, "it");return $nextFunction.invoke();
      }
    }));
  }
  









  @kotlin.internal.LowPriorityInOverloadResolution
  @NotNull
  public static final <T> Sequence<T> generateSequence(@org.jetbrains.annotations.Nullable T seed, @NotNull Function1<? super T, ? extends T> nextFunction)
  {
    Intrinsics.checkParameterIsNotNull(nextFunction, "nextFunction");seed == null ? 
      (Sequence)EmptySequence.INSTANCE : 
      
      (Sequence)new GeneratorSequence((Function0)new Lambda(seed) { @org.jetbrains.annotations.Nullable
        public final T invoke() { return $seed; } }, nextFunction);
  }
  










  @NotNull
  public static final <T> Sequence<T> generateSequence(@NotNull Function0<? extends T> seedFunction, @NotNull Function1<? super T, ? extends T> nextFunction)
  {
    Intrinsics.checkParameterIsNotNull(seedFunction, "seedFunction");Intrinsics.checkParameterIsNotNull(nextFunction, "nextFunction");return (Sequence)new GeneratorSequence(seedFunction, nextFunction);
  }
  
  public SequencesKt__SequencesKt() {}
}

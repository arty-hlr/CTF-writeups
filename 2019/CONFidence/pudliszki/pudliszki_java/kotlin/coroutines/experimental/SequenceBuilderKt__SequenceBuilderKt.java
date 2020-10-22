package kotlin.coroutines.experimental;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000:\n\000\n\002\020\b\n\002\030\002\n\002\b\006\n\002\020(\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\020\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\032M\020\b\032\b\022\004\022\002H\n0\t\"\004\b\000\020\n2/\b\001\020\013\032)\b\001\022\n\022\b\022\004\022\002H\n0\r\022\n\022\b\022\004\022\0020\0170\016\022\006\022\004\030\0010\0200\f¢\006\002\b\021H\007ø\001\000¢\006\002\020\022\032M\020\023\032\b\022\004\022\002H\n0\024\"\004\b\000\020\n2/\b\001\020\013\032)\b\001\022\n\022\b\022\004\022\002H\n0\r\022\n\022\b\022\004\022\0020\0170\016\022\006\022\004\030\0010\0200\f¢\006\002\b\021H\007ø\001\000¢\006\002\020\025\"\022\020\000\032\0060\001j\002`\002XT¢\006\002\n\000\"\022\020\003\032\0060\001j\002`\002XT¢\006\002\n\000\"\022\020\004\032\0060\001j\002`\002XT¢\006\002\n\000\"\022\020\005\032\0060\001j\002`\002XT¢\006\002\n\000\"\022\020\006\032\0060\001j\002`\002XT¢\006\002\n\000\"\022\020\007\032\0060\001j\002`\002XT¢\006\002\n\000*\f\b\002\020\026\"\0020\0012\0020\001\002\004\n\002\b\t¨\006\027"}, d2={"State_Done", "", "Lkotlin/coroutines/experimental/State;", "State_Failed", "State_ManyNotReady", "State_ManyReady", "State_NotReady", "State_Ready", "buildIterator", "", "T", "builderAction", "Lkotlin/Function2;", "Lkotlin/coroutines/experimental/SequenceBuilder;", "Lkotlin/coroutines/experimental/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "buildSequence", "Lkotlin/sequences/Sequence;", "(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;", "State", "kotlin-stdlib_coroutinesExperimental"}, xs="kotlin/coroutines/experimental/SequenceBuilderKt")
class SequenceBuilderKt__SequenceBuilderKt
{
  private static final int State_NotReady = 0;
  private static final int State_ManyNotReady = 1;
  private static final int State_ManyReady = 2;
  private static final int State_Ready = 3;
  private static final int State_Done = 4;
  private static final int State_Failed = 5;
  
  @kotlin.SinceKotlin(version="1.1")
  @NotNull
  public static final <T> Sequence<T> buildSequence(@kotlin.BuilderInference @NotNull Function2<? super SequenceBuilder<? super T>, ? super Continuation<? super Unit>, ? extends Object> builderAction)
  {
    Intrinsics.checkParameterIsNotNull(builderAction, "builderAction");return (Sequence)new SequenceBuilderKt__SequenceBuilderKt.buildSequence..inlined.Sequence.1(builderAction);
  }
  




  @kotlin.SinceKotlin(version="1.1")
  @NotNull
  public static final <T> Iterator<T> buildIterator(@kotlin.BuilderInference @NotNull Function2<? super SequenceBuilder<? super T>, ? super Continuation<? super Unit>, ? extends Object> builderAction)
  {
    Intrinsics.checkParameterIsNotNull(builderAction, "builderAction");SequenceBuilderIterator iterator = new SequenceBuilderIterator();
    iterator.setNextStep(kotlin.coroutines.experimental.intrinsics.IntrinsicsKt.createCoroutineUnchecked(builderAction, iterator, (Continuation)iterator));
    return (Iterator)iterator;
  }
  
  public SequenceBuilderKt__SequenceBuilderKt() {}
}

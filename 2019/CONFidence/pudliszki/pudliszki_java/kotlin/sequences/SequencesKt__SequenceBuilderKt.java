package kotlin.sequences;

import java.util.Iterator;
import kotlin.BuilderInference;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000R\n\000\n\002\020\b\n\002\030\002\n\002\b\006\n\002\020(\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\020\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\032N\020\b\032\b\022\004\022\002H\n0\t\"\004\b\000\020\n2/\b\t\020\013\032)\b\001\022\n\022\b\022\004\022\002H\n0\r\022\n\022\b\022\004\022\0020\0170\016\022\006\022\004\030\0010\0200\f¢\006\002\b\021H\bø\001\000¢\006\002\020\022\032N\020\023\032\b\022\004\022\002H\n0\024\"\004\b\000\020\n2/\b\t\020\013\032)\b\001\022\n\022\b\022\004\022\002H\n0\r\022\n\022\b\022\004\022\0020\0170\016\022\006\022\004\030\0010\0200\f¢\006\002\b\021H\bø\001\000¢\006\002\020\025\032M\020\026\032\b\022\004\022\002H\n0\t\"\004\b\000\020\n2/\b\001\020\027\032)\b\001\022\n\022\b\022\004\022\002H\n0\r\022\n\022\b\022\004\022\0020\0170\016\022\006\022\004\030\0010\0200\f¢\006\002\b\021H\007ø\001\000¢\006\002\020\022\032M\020\030\032\b\022\004\022\002H\n0\024\"\004\b\000\020\n2/\b\001\020\027\032)\b\001\022\n\022\b\022\004\022\002H\n0\r\022\n\022\b\022\004\022\0020\0170\016\022\006\022\004\030\0010\0200\f¢\006\002\b\021H\007ø\001\000¢\006\002\020\025\"\022\020\000\032\0060\001j\002`\002XT¢\006\002\n\000\"\022\020\003\032\0060\001j\002`\002XT¢\006\002\n\000\"\022\020\004\032\0060\001j\002`\002XT¢\006\002\n\000\"\022\020\005\032\0060\001j\002`\002XT¢\006\002\n\000\"\022\020\006\032\0060\001j\002`\002XT¢\006\002\n\000\"\022\020\007\032\0060\001j\002`\002XT¢\006\002\n\000*V\b\007\020\031\032\004\b\000\020\n\"\b\022\004\022\002H\n0\r2\b\022\004\022\002H\n0\rB6\b\032\022\b\b\033\022\004\b\b(\034\022\034\b\035\022\030\b\013B\024\b\036\022\006\b\037\022\002\b\f\022\b\b \022\004\b\b(!\022\n\b\"\022\006\b\n0#8$*\f\b\002\020%\"\0020\0012\0020\001\002\004\n\002\b\031¨\006&"}, d2={"State_Done", "", "Lkotlin/sequences/State;", "State_Failed", "State_ManyNotReady", "State_ManyReady", "State_NotReady", "State_Ready", "buildIterator", "", "T", "builderAction", "Lkotlin/Function2;", "Lkotlin/sequences/SequenceScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "buildSequence", "Lkotlin/sequences/Sequence;", "(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;", "iterator", "block", "sequence", "SequenceBuilder", "Lkotlin/Deprecated;", "message", "Use SequenceScope class instead.", "replaceWith", "Lkotlin/ReplaceWith;", "imports", "expression", "SequenceScope<T>", "level", "Lkotlin/DeprecationLevel;", "ERROR", "State", "kotlin-stdlib"}, xs="kotlin/sequences/SequencesKt")
class SequencesKt__SequenceBuilderKt
{
  private static final int State_NotReady = 0;
  private static final int State_ManyNotReady = 1;
  private static final int State_ManyReady = 2;
  private static final int State_Ready = 3;
  private static final int State_Done = 4;
  private static final int State_Failed = 5;
  
  @SinceKotlin(version="1.3")
  @NotNull
  public static final <T> Sequence<T> sequence(@BuilderInference @NotNull Function2<? super SequenceScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> block)
  {
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");return (Sequence)new SequencesKt__SequenceBuilderKt.sequence..inlined.Sequence.1(block); } /**
   * @deprecated
   */
  @kotlin.Deprecated(message="Use 'sequence { }' function instead.", replaceWith=@kotlin.ReplaceWith(imports={}, expression="sequence(builderAction)"), level=kotlin.DeprecationLevel.ERROR)
  @SinceKotlin(version="1.3")
  @kotlin.internal.InlineOnly
  private static final <T> Sequence<T> buildSequence(@BuilderInference Function2<? super SequenceScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> builderAction) { ; return (Sequence)new SequencesKt__SequenceBuilderKt.buildSequence..inlined.Sequence.1(builderAction);
  }
  



  @SinceKotlin(version="1.3")
  @NotNull
  public static final <T> Iterator<T> iterator(@BuilderInference @NotNull Function2<? super SequenceScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> block)
  {
    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");SequenceBuilderIterator iterator = new SequenceBuilderIterator();
    iterator.setNextStep(kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(block, iterator, (Continuation)iterator));
    return (Iterator)iterator; } /**
   * @deprecated
   */
  @kotlin.Deprecated(message="Use 'iterator { }' function instead.", replaceWith=@kotlin.ReplaceWith(imports={}, expression="iterator(builderAction)"), level=kotlin.DeprecationLevel.ERROR)
  @SinceKotlin(version="1.3")
  @kotlin.internal.InlineOnly
  private static final <T> Iterator<T> buildIterator(@BuilderInference Function2<? super SequenceScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> builderAction) { ; return SequencesKt.iterator(builderAction);
  }
  
  public SequencesKt__SequenceBuilderKt() {}
}

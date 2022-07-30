package kotlin.sequences;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\026\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\b`\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002J\026\020\003\032\b\022\004\022\0028\0000\0022\006\020\004\032\0020\005H&J\026\020\006\032\b\022\004\022\0028\0000\0022\006\020\004\032\0020\005H&¨\006\007"}, d2={"Lkotlin/sequences/DropTakeSequence;", "T", "Lkotlin/sequences/Sequence;", "drop", "n", "", "take", "kotlin-stdlib"})
public abstract interface DropTakeSequence<T>
  extends Sequence<T>
{
  @NotNull
  public abstract Sequence<T> drop(int paramInt);
  
  @NotNull
  public abstract Sequence<T> take(int paramInt);
}

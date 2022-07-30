package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyIterator;
import org.jetbrains.annotations.NotNull;



























@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\002\030\002\n\002\020\001\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\020(\n\002\b\002\bÂ\002\030\0002\b\022\004\022\0020\0020\0012\b\022\004\022\0020\0020\003B\007\b\002¢\006\002\020\004J\020\020\005\032\0020\0002\006\020\006\032\0020\007H\026J\017\020\b\032\b\022\004\022\0020\0020\tH\002J\020\020\n\032\0020\0002\006\020\006\032\0020\007H\026¨\006\013"}, d2={"Lkotlin/sequences/EmptySequence;", "Lkotlin/sequences/Sequence;", "", "Lkotlin/sequences/DropTakeSequence;", "()V", "drop", "n", "", "iterator", "", "take", "kotlin-stdlib"})
final class EmptySequence
  implements Sequence, DropTakeSequence
{
  public static final EmptySequence INSTANCE;
  
  static
  {
    EmptySequence localEmptySequence = new EmptySequence();INSTANCE = localEmptySequence; } @NotNull
  public Iterator iterator() { return (Iterator)EmptyIterator.INSTANCE; } @NotNull
  public EmptySequence drop(int n) { return INSTANCE; } @NotNull
  public EmptySequence take(int n) { return INSTANCE; }
  
  private EmptySequence() {}
}

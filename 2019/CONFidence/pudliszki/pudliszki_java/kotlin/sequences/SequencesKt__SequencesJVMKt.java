package kotlin.sequences;

import java.util.Enumeration;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\037\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H\b¨\006\004"}, d2={"asSequence", "Lkotlin/sequences/Sequence;", "T", "Ljava/util/Enumeration;", "kotlin-stdlib"}, xs="kotlin/sequences/SequencesKt")
class SequencesKt__SequencesJVMKt extends SequencesKt__SequenceBuilderKt
{
  @InlineOnly
  private static final <T> Sequence<T> asSequence(@NotNull Enumeration<T> $receiver)
  {
    ;
    return SequencesKt.asSequence(CollectionsKt.iterator($receiver));
  }
  
  public SequencesKt__SequencesJVMKt() {}
}

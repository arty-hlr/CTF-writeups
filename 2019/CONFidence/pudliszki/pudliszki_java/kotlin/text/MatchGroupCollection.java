package kotlin.text;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\026\n\002\030\002\n\002\020\036\n\002\030\002\n\002\b\002\n\002\020\b\n\000\bf\030\0002\n\022\006\022\004\030\0010\0020\001J\023\020\003\032\004\030\0010\0022\006\020\004\032\0020\005H¦\002¨\006\006"}, d2={"Lkotlin/text/MatchGroupCollection;", "", "Lkotlin/text/MatchGroup;", "get", "index", "", "kotlin-stdlib"})
public abstract interface MatchGroupCollection
  extends Collection<MatchGroup>, KMappedMarker
{
  @Nullable
  public abstract MatchGroup get(int paramInt);
}

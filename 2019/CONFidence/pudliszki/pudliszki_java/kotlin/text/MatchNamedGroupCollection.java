package kotlin.text;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\bg\030\0002\0020\001J\023\020\002\032\004\030\0010\0032\006\020\004\032\0020\005H¦\002¨\006\006"}, d2={"Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/text/MatchGroupCollection;", "get", "Lkotlin/text/MatchGroup;", "name", "", "kotlin-stdlib"})
@SinceKotlin(version="1.1")
public abstract interface MatchNamedGroupCollection
  extends MatchGroupCollection
{
  @Nullable
  public abstract MatchGroup get(@NotNull String paramString);
}

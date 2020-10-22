package kotlin.internal;

import java.util.regex.MatchResult;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;
import kotlin.text.MatchGroup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\0002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\020\003\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\b\020\030\0002\0020\001B\005¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\006H\026J\b\020\b\032\0020\tH\026J\032\020\n\032\004\030\0010\0132\006\020\f\032\0020\r2\006\020\016\032\0020\017H\026¨\006\020"}, d2={"Lkotlin/internal/PlatformImplementations;", "", "()V", "addSuppressed", "", "cause", "", "exception", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "kotlin-stdlib"})
public class PlatformImplementations
{
  public void addSuppressed(@NotNull Throwable cause, @NotNull Throwable exception)
  {
    Intrinsics.checkParameterIsNotNull(cause, "cause");Intrinsics.checkParameterIsNotNull(exception, "exception"); }
  
  @Nullable
  public MatchGroup getMatchResultNamedGroup(@NotNull MatchResult matchResult, @NotNull String name) { Intrinsics.checkParameterIsNotNull(matchResult, "matchResult");Intrinsics.checkParameterIsNotNull(name, "name");throw ((Throwable)new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.")); }
  
  @NotNull
  public Random defaultPlatformRandom() { return (Random)new FallbackThreadLocalRandom(); }
  
  public PlatformImplementations() {}
}

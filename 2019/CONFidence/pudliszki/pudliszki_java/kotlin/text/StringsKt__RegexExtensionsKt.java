package kotlin.text;

import java.util.Set;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\030\n\000\n\002\030\002\n\002\020\016\n\000\n\002\020\"\n\002\030\002\n\002\b\002\032\r\020\000\032\0020\001*\0020\002H\b\032\033\020\000\032\0020\001*\0020\0022\f\020\003\032\b\022\004\022\0020\0050\004H\b\032\025\020\000\032\0020\001*\0020\0022\006\020\006\032\0020\005H\b¨\006\007"}, d2={"toRegex", "Lkotlin/text/Regex;", "", "options", "", "Lkotlin/text/RegexOption;", "option", "kotlin-stdlib"}, xs="kotlin/text/StringsKt")
class StringsKt__RegexExtensionsKt extends StringsKt__RegexExtensionsJVMKt
{
  @InlineOnly
  private static final Regex toRegex(@NotNull String $receiver)
  {
    ;
    return new Regex($receiver);
  }
  
  @InlineOnly
  private static final Regex toRegex(@NotNull String $receiver, RegexOption option) {
    ;
    return new Regex($receiver, option);
  }
  
  @InlineOnly
  private static final Regex toRegex(@NotNull String $receiver, Set<? extends RegexOption> options) {
    ;
    return new Regex($receiver, options);
  }
  
  public StringsKt__RegexExtensionsKt() {}
}

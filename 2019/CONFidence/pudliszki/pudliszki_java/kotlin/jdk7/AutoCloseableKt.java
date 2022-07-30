package kotlin.jdk7;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.Nullable;















@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\034\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\003\n\002\b\004\n\002\030\002\n\002\b\002\032\030\020\000\032\0020\001*\004\030\0010\0022\b\020\003\032\004\030\0010\004H\001\0328\020\005\032\002H\006\"\n\b\000\020\007*\004\030\0010\002\"\004\b\001\020\006*\002H\0072\022\020\b\032\016\022\004\022\002H\007\022\004\022\002H\0060\tH\b¢\006\002\020\n¨\006\013"}, d2={"closeFinally", "", "Ljava/lang/AutoCloseable;", "cause", "", "use", "R", "T", "block", "Lkotlin/Function1;", "(Ljava/lang/AutoCloseable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib-jdk7"}, pn="kotlin")
@JvmName(name="AutoCloseableKt")
public final class AutoCloseableKt
{
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final <T extends AutoCloseable, R> R use(T $receiver, Function1<? super T, ? extends R> block)
  {
    ;
    Throwable exception = (Throwable)null;
    try {
      Object localObject = block.invoke($receiver);
      



      return localObject;
    }
    catch (Throwable e)
    {
      exception = e;
      throw e;
    }
    finally {
      InlineMarker.finallyStart(1);closeFinally($receiver, exception);InlineMarker.finallyEnd(1);
    }
  }
  




  @SinceKotlin(version="1.2")
  @PublishedApi
  public static final void closeFinally(@Nullable AutoCloseable $receiver, @Nullable Throwable cause)
  {
    if ($receiver != null) {
      if (cause == null) $receiver.close(); else {
        try
        {
          $receiver.close();
        } catch (Throwable closeException) {
          cause.addSuppressed(closeException);
        }
      }
    }
  }
}

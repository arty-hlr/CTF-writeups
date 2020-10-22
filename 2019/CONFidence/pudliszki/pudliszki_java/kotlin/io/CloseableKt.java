package kotlin.io;

import java.io.Closeable;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\034\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\003\n\002\b\004\n\002\030\002\n\002\b\003\032\030\020\000\032\0020\001*\004\030\0010\0022\b\020\003\032\004\030\0010\004H\001\032;\020\005\032\002H\006\"\n\b\000\020\007*\004\030\0010\002\"\004\b\001\020\006*\002H\0072\022\020\b\032\016\022\004\022\002H\007\022\004\022\002H\0060\tH\bø\001\000¢\006\002\020\013\002\b\n\006\b\021(\n0\001¨\006\f"}, d2={"closeFinally", "", "Ljava/io/Closeable;", "cause", "", "use", "R", "T", "block", "Lkotlin/Function1;", "Requires newer compiler version to be inlined correctly.", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"})
@JvmName(name="CloseableKt")
public final class CloseableKt
{
  @InlineOnly
  private static final <T extends Closeable, R> R use(T $receiver, Function1<? super T, ? extends R> block)
  {
    ;
    Throwable exception = (Throwable)null;
    try {
      Object localObject = block.invoke($receiver);InlineMarker.finallyStart(1);
      




      if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) { closeFinally($receiver, exception);
      } else if ($receiver != null) {
        $receiver.close();
      }
      




      InlineMarker.finallyEnd(1);return localObject;
    }
    catch (Throwable e)
    {
      exception = e;
      throw e;





    }
    finally
    {




      InlineMarker.finallyStart(1);
      if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) { closeFinally($receiver, exception);
      } else if ($receiver != null) {
        if (exception == null) $receiver.close(); else {
          try
          {
            $receiver.close();
          } catch (Throwable localThrowable1) {}
        }
      }
      InlineMarker.finallyEnd(1);
    }
  }
  





  @kotlin.SinceKotlin(version="1.1")
  @PublishedApi
  public static final void closeFinally(@Nullable Closeable $receiver, @Nullable Throwable cause)
  {
    if ($receiver != null) {
      if (cause == null) $receiver.close(); else {
        try
        {
          $receiver.close();
        } catch (Throwable closeException) {
          ExceptionsKt.addSuppressed(cause, closeException);
        }
      }
    }
  }
}

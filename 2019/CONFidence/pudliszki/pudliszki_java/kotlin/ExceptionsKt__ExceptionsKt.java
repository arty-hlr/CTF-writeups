package kotlin;

import java.io.PrintStream;
import java.io.PrintWriter;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementations;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;



@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000&\n\000\n\002\020\021\n\002\030\002\n\002\020\003\n\002\b\005\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\032\022\020\b\032\0020\t*\0020\0032\006\020\n\032\0020\003\032\r\020\013\032\0020\t*\0020\003H\b\032\025\020\013\032\0020\t*\0020\0032\006\020\f\032\0020\rH\b\032\025\020\013\032\0020\t*\0020\0032\006\020\016\032\0020\017H\b\"!\020\000\032\b\022\004\022\0020\0020\001*\0020\0038F¢\006\f\022\004\b\004\020\005\032\004\b\006\020\007¨\006\020"}, d2={"stackTrace", "", "Ljava/lang/StackTraceElement;", "", "stackTrace$annotations", "(Ljava/lang/Throwable;)V", "getStackTrace", "(Ljava/lang/Throwable;)[Ljava/lang/StackTraceElement;", "addSuppressed", "", "exception", "printStackTrace", "stream", "Ljava/io/PrintStream;", "writer", "Ljava/io/PrintWriter;", "kotlin-stdlib"}, xs="kotlin/ExceptionsKt")
class ExceptionsKt__ExceptionsKt
{
  @InlineOnly
  private static final void printStackTrace(@NotNull Throwable $receiver)
  {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.Throwable"); $receiver.printStackTrace();
  }
  
  @InlineOnly
  private static final void printStackTrace(@NotNull Throwable $receiver, PrintWriter writer)
  {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.Throwable"); $receiver.printStackTrace(writer);
  }
  
  @InlineOnly
  private static final void printStackTrace(@NotNull Throwable $receiver, PrintStream stream)
  {
    ;
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.Throwable"); $receiver.printStackTrace(stream);
  }
  


  @NotNull
  public static final StackTraceElement[] getStackTrace(@NotNull Throwable $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); StackTraceElement[] tmp10_7 = $receiver.getStackTrace(); if (tmp10_7 == null) Intrinsics.throwNpe(); return tmp10_7;
  }
  

  public static final void addSuppressed(@NotNull Throwable $receiver, @NotNull Throwable exception)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(exception, "exception");PlatformImplementationsKt.IMPLEMENTATIONS.addSuppressed($receiver, exception);
  }
  
  public ExceptionsKt__ExceptionsKt() {}
}

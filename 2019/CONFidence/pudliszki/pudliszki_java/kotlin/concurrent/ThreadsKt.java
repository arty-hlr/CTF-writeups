package kotlin.concurrent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;











@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000:\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\000\n\002\030\002\n\002\020\002\n\002\b\002\n\002\020\000\n\002\030\002\n\002\b\003\032J\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\n\b\002\020\005\032\004\030\0010\0062\n\b\002\020\007\032\004\030\0010\b2\b\b\002\020\t\032\0020\n2\f\020\013\032\b\022\004\022\0020\r0\f\0320\020\016\032\002H\017\"\b\b\000\020\017*\0020\020*\b\022\004\022\002H\0170\0212\f\020\022\032\b\022\004\022\002H\0170\fH\b¢\006\002\020\023¨\006\024"}, d2={"thread", "Ljava/lang/Thread;", "start", "", "isDaemon", "contextClassLoader", "Ljava/lang/ClassLoader;", "name", "", "priority", "", "block", "Lkotlin/Function0;", "", "getOrSet", "T", "", "Ljava/lang/ThreadLocal;", "default", "(Ljava/lang/ThreadLocal;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlin-stdlib"})
@JvmName(name="ThreadsKt")
public final class ThreadsKt
{
  @NotNull
  public static final Thread thread(boolean start, boolean isDaemon, @Nullable ClassLoader contextClassLoader, @Nullable String name, int priority, @NotNull Function0<Unit> block)
  {
    Intrinsics.checkParameterIsNotNull(block, "block");Thread thread = new Thread() {
      public void run() {
        $block.invoke();
      }
    };
    if (isDaemon)
      thread.setDaemon(true);
    if (priority > 0)
      thread.setPriority(priority);
    if (name != null)
      thread.setName(name);
    if (contextClassLoader != null)
      thread.setContextClassLoader(contextClassLoader);
    if (start)
      thread.start();
    return (Thread)thread;
  }
  
  /* Error */
  @kotlin.internal.InlineOnly
  private static final <T> T getOrSet(@NotNull ThreadLocal<T> $receiver, Function0<? extends T> default)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 73	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   4: dup
    //   5: ifnull +6 -> 11
    //   8: goto +21 -> 29
    //   11: pop
    //   12: aload_1
    //   13: invokeinterface 78 1 0
    //   18: astore_3
    //   19: aload_3
    //   20: astore 4
    //   22: aload_0
    //   23: aload 4
    //   25: invokevirtual 82	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   28: aload_3
    //   29: areturn
    // Line number table:
    //   Java source line #59	-> byte code offset #0
    //   Java source line #59	-> byte code offset #25
    //   Java source line #59	-> byte code offset #28
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	30	0	$receiver	ThreadLocal
    //   0	30	1	default	Function0
    //   0	30	2	$i$f$getOrSet	int
    //   22	6	4	p1	Object
    //   22	6	5	$i$a$1$unknown	int
  }
}

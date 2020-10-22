package kotlin.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\032\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\032&\020\000\032\002H\001\"\004\b\000\020\001*\0020\0022\f\020\003\032\b\022\004\022\002H\0010\004H\b¢\006\002\020\005\032&\020\006\032\002H\001\"\004\b\000\020\001*\0020\0072\f\020\003\032\b\022\004\022\002H\0010\004H\b¢\006\002\020\b\032&\020\t\032\002H\001\"\004\b\000\020\001*\0020\0022\f\020\003\032\b\022\004\022\002H\0010\004H\b¢\006\002\020\005¨\006\n"}, d2={"read", "T", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "action", "Lkotlin/Function0;", "(Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withLock", "Ljava/util/concurrent/locks/Lock;", "(Ljava/util/concurrent/locks/Lock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "write", "kotlin-stdlib"})
@kotlin.jvm.JvmName(name="LocksKt")
public final class LocksKt
{
  @InlineOnly
  private static final <T> T withLock(@org.jetbrains.annotations.NotNull Lock $receiver, Function0<? extends T> action)
  {
    ;
    $receiver.lock();
    try {
      Object localObject1 = action.invoke();
      
      return localObject1;
    } finally { InlineMarker.finallyStart(1);$receiver.unlock();InlineMarker.finallyEnd(1);
    }
  }
  

  @InlineOnly
  private static final <T> T read(@org.jetbrains.annotations.NotNull ReentrantReadWriteLock $receiver, Function0<? extends T> action)
  {
    ;
    ReentrantReadWriteLock.ReadLock rl = $receiver.readLock();
    rl.lock();
    try {
      Object localObject1 = action.invoke();
      
      return localObject1;
    } finally { InlineMarker.finallyStart(1);rl.unlock();InlineMarker.finallyEnd(1);
    }
  }
  





  @InlineOnly
  private static final <T> T write(@org.jetbrains.annotations.NotNull ReentrantReadWriteLock $receiver, Function0<? extends T> action)
  {
    ;
    




    ReentrantReadWriteLock.ReadLock rl = $receiver.readLock();
    
    int readCount = $receiver.getWriteHoldCount() == 0 ? $receiver.getReadHoldCount() : 0;
    int i = 0; int it; int $i$a$1$repeat; for (int j = readCount; i < j; i++) { it = i;rl.unlock();
    }
    ReentrantReadWriteLock.WriteLock wl = $receiver.writeLock();
    wl.lock();
    try {
      Object localObject1 = action.invoke();
      int it;
      int $i$a$2$repeat;
      return localObject1;
    } finally { InlineMarker.finallyStart(1);it = 0;
      for ($i$a$1$repeat = readCount; it < $i$a$1$repeat; it++) { int it = it; int $i$a$2$repeat; rl.lock(); }
      wl.unlock();InlineMarker.finallyEnd(1);
    }
  }
}

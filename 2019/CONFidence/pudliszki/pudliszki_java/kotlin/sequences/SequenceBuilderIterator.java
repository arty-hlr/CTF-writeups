package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Result.Companion;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




















































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000B\n\002\030\002\n\000\n\002\030\002\n\002\020(\n\002\030\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\013\n\002\020\b\n\002\030\002\n\000\n\002\020\003\n\000\n\002\020\013\n\002\b\005\n\002\030\002\n\002\b\b\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\0032\b\022\004\022\0020\0050\004B\005¢\006\002\020\006J\b\020\026\032\0020\027H\002J\t\020\030\032\0020\031H\002J\016\020\032\032\0028\000H\002¢\006\002\020\033J\r\020\034\032\0028\000H\002¢\006\002\020\033J\036\020\035\032\0020\0052\f\020\036\032\b\022\004\022\0020\0050\037H\026ø\001\000¢\006\002\020 J\031\020!\032\0020\0052\006\020\"\032\0028\000H@ø\001\000¢\006\002\020#J\037\020$\032\0020\0052\f\020%\032\b\022\004\022\0028\0000\003H@ø\001\000¢\006\002\020&R\024\020\007\032\0020\b8VX\004¢\006\006\032\004\b\t\020\nR\026\020\013\032\n\022\004\022\0028\000\030\0010\003X\016¢\006\002\n\000R\"\020\f\032\n\022\004\022\0020\005\030\0010\004X\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020R\022\020\021\032\004\030\0018\000X\016¢\006\004\n\002\020\022R\022\020\023\032\0060\024j\002`\025X\016¢\006\002\n\000\002\004\n\002\b\031¨\006'"}, d2={"Lkotlin/sequences/SequenceBuilderIterator;", "T", "Lkotlin/sequences/SequenceScope;", "", "Lkotlin/coroutines/Continuation;", "", "()V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "nextIterator", "nextStep", "getNextStep", "()Lkotlin/coroutines/Continuation;", "setNextStep", "(Lkotlin/coroutines/Continuation;)V", "nextValue", "Ljava/lang/Object;", "state", "", "Lkotlin/sequences/State;", "exceptionalState", "", "hasNext", "", "next", "()Ljava/lang/Object;", "nextNotReady", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "yield", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yieldAll", "iterator", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"})
final class SequenceBuilderIterator<T>
  extends SequenceScope<T>
  implements Iterator<T>, Continuation<Unit>, KMappedMarker
{
  private int state;
  private T nextValue;
  private Iterator<? extends T> nextIterator;
  @Nullable
  private Continuation<? super Unit> nextStep;
  
  @Nullable
  public final Continuation<Unit> getNextStep() { return nextStep; } public final void setNextStep(@Nullable Continuation<? super Unit> <set-?>) { nextStep = <set-?>; }
  
  public boolean hasNext() {
    for (;;) {
      switch (state) {
      case 0: 
        break;
      case 1:  Iterator tmp47_44 = nextIterator;
        
























































































































        if (tmp47_44 == null) Intrinsics.throwNpe(); if (tmp47_44.hasNext()) {
          state = 2;
          return true;
        }
        nextIterator = ((Iterator)null);
        break;
      case 4:  return false;
      case 2: case 3:  return true;
      default:  throw exceptionalState();
      }
      
      state = 5; Continuation 
        tmp98_95 = nextStep;
      if (tmp98_95 == null) Intrinsics.throwNpe(); Continuation step = tmp98_95;
      nextStep = ((Continuation)null);
      Continuation localContinuation1 = step;Unit localUnit = Unit.INSTANCE;Result.Companion localCompanion = Result.Companion;Continuation localContinuation2 = localContinuation1;Object localObject = Result.constructor-impl(localUnit);localContinuation2.resumeWith(localObject);
    }
  }
  
  public T next() {
    switch (state) {
    case 0: case 1:  return nextNotReady();
    case 2: 
      state = 1; Iterator 
        tmp50_47 = nextIterator;
      if (tmp50_47 == null) Intrinsics.throwNpe(); return tmp50_47.next();
    
    case 3: 
      state = 0;
      
      Object result = nextValue;
      nextValue = null;
      return result;
    }
    throw exceptionalState();
  }
  
  private final T nextNotReady()
  {
    if (!hasNext()) throw ((Throwable)new NoSuchElementException()); return next();
  }
  
  private final Throwable exceptionalState() { switch (state) {
    case 4:  new NoSuchElementException(); break;
    case 5:  new IllegalStateException("Iterator has failed."); break;
    }
    return (Throwable)new IllegalStateException("Unexpected state of the iterator: " + state);
  }
  
  @Nullable
  public Object yield(T value, @NotNull Continuation<? super Unit> arg2) { nextValue = value;
    state = 3;
    Continuation c = ???;
    int $i$a$2$suspendCoroutineUninterceptedOrReturn; setNextStep(c); Object tmp20_17 = 
      IntrinsicsKt.getCOROUTINE_SUSPENDED();
    if (tmp20_17 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) DebugProbesKt.probeCoroutineSuspended(???); return tmp20_17;
  }
  

  @Nullable
  public Object yieldAll(@NotNull Iterator<? extends T> iterator, @NotNull Continuation<? super Unit> arg2)
  {
    if (!iterator.hasNext()) return Unit.INSTANCE;
    nextIterator = iterator;
    state = 2;
    Continuation c = ???;
    int $i$a$2$suspendCoroutineUninterceptedOrReturn; setNextStep(c); Object tmp33_30 = 
      IntrinsicsKt.getCOROUTINE_SUSPENDED();
    if (tmp33_30 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) DebugProbesKt.probeCoroutineSuspended(???); return tmp33_30;
  }
  



  public void resumeWith(@NotNull Object result)
  {
    Object localObject = result;ResultKt.throwOnFailure(localObject);
    state = 4;
  }
  
  @NotNull
  public CoroutineContext getContext() { return (CoroutineContext)EmptyCoroutineContext.INSTANCE; }
  
  public SequenceBuilderIterator() {}
  
  public void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}
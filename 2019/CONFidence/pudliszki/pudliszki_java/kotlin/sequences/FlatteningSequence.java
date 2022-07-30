package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




































































































































































































































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\036\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020(\n\002\b\002\b\000\030\000*\004\b\000\020\001*\004\b\001\020\002*\004\b\002\020\0032\b\022\004\022\002H\0030\004BA\022\f\020\005\032\b\022\004\022\0028\0000\004\022\022\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007\022\030\020\b\032\024\022\004\022\0028\001\022\n\022\b\022\004\022\0028\0020\t0\007¢\006\002\020\nJ\017\020\b\032\b\022\004\022\0028\0020\tH\002R \020\b\032\024\022\004\022\0028\001\022\n\022\b\022\004\022\0028\0020\t0\007X\004¢\006\002\n\000R\024\020\005\032\b\022\004\022\0028\0000\004X\004¢\006\002\n\000R\032\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007X\004¢\006\002\n\000¨\006\013"}, d2={"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "iterator", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"})
public final class FlatteningSequence<T, R, E>
  implements Sequence<E>
{
  private final Sequence<T> sequence;
  private final Function1<T, R> transformer;
  private final Function1<R, Iterator<E>> iterator;
  
  public FlatteningSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transformer, @NotNull Function1<? super R, ? extends Iterator<? extends E>> iterator)
  {
    this.sequence = sequence;this.transformer = transformer;this.iterator = iterator;
  }
  































  @NotNull
  public Iterator<E> iterator()
  {
    (Iterator)new Iterator()
    {
      @NotNull
      private final Iterator<T> iterator;
      @Nullable
      private Iterator<? extends E> itemIterator;
      
      @NotNull
      public final Iterator<T> getIterator() { return iterator; } @Nullable
      public final Iterator<E> getItemIterator() { return itemIterator; } public final void setItemIterator(@Nullable Iterator<? extends E> <set-?>) { itemIterator = <set-?>; }
      
      public E next() {
        if (!ensureItemIterator())
          throw ((Throwable)new NoSuchElementException());
        Iterator tmp22_19 = itemIterator;
        



































































































































































































































































        if (tmp22_19 == null) Intrinsics.throwNpe(); return tmp22_19.next();
      }
      
      public boolean hasNext() {
        return ensureItemIterator();
      }
      
      /* Error */
      private final boolean ensureItemIterator()
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 28	kotlin/sequences/FlatteningSequence$iterator$1:itemIterator	Ljava/util/Iterator;
        //   4: dup
        //   5: ifnull +14 -> 19
        //   8: invokeinterface 55 1 0
        //   13: ifne +18 -> 31
        //   16: goto +7 -> 23
        //   19: pop
        //   20: goto +11 -> 31
        //   23: aload_0
        //   24: aconst_null
        //   25: checkcast 7	java/util/Iterator
        //   28: putfield 28	kotlin/sequences/FlatteningSequence$iterator$1:itemIterator	Ljava/util/Iterator;
        //   31: aload_0
        //   32: getfield 28	kotlin/sequences/FlatteningSequence$iterator$1:itemIterator	Ljava/util/Iterator;
        //   35: ifnonnull +75 -> 110
        //   38: aload_0
        //   39: getfield 20	kotlin/sequences/FlatteningSequence$iterator$1:iterator	Ljava/util/Iterator;
        //   42: invokeinterface 55 1 0
        //   47: ifne +5 -> 52
        //   50: iconst_0
        //   51: ireturn
        //   52: aload_0
        //   53: getfield 20	kotlin/sequences/FlatteningSequence$iterator$1:iterator	Ljava/util/Iterator;
        //   56: invokeinterface 52 1 0
        //   61: astore_1
        //   62: aload_0
        //   63: getfield 59	kotlin/sequences/FlatteningSequence$iterator$1:this$0	Lkotlin/sequences/FlatteningSequence;
        //   66: invokestatic 63	kotlin/sequences/FlatteningSequence:access$getIterator$p	(Lkotlin/sequences/FlatteningSequence;)Lkotlin/jvm/functions/Function1;
        //   69: aload_0
        //   70: getfield 59	kotlin/sequences/FlatteningSequence$iterator$1:this$0	Lkotlin/sequences/FlatteningSequence;
        //   73: invokestatic 66	kotlin/sequences/FlatteningSequence:access$getTransformer$p	(Lkotlin/sequences/FlatteningSequence;)Lkotlin/jvm/functions/Function1;
        //   76: aload_1
        //   77: invokeinterface 72 2 0
        //   82: invokeinterface 72 2 0
        //   87: checkcast 7	java/util/Iterator
        //   90: astore_2
        //   91: aload_2
        //   92: invokeinterface 55 1 0
        //   97: ifeq +10 -> 107
        //   100: aload_0
        //   101: aload_2
        //   102: putfield 28	kotlin/sequences/FlatteningSequence$iterator$1:itemIterator	Ljava/util/Iterator;
        //   105: iconst_1
        //   106: ireturn
        //   107: goto -76 -> 31
        //   110: iconst_1
        //   111: ireturn
        // Line number table:
        //   Java source line #269	-> byte code offset #0
        //   Java source line #270	-> byte code offset #23
        //   Java source line #272	-> byte code offset #31
        //   Java source line #273	-> byte code offset #38
        //   Java source line #274	-> byte code offset #50
        //   Java source line #276	-> byte code offset #52
        //   Java source line #277	-> byte code offset #62
        //   Java source line #278	-> byte code offset #91
        //   Java source line #279	-> byte code offset #100
        //   Java source line #280	-> byte code offset #105
        //   Java source line #282	-> byte code offset #107
        //   Java source line #272	-> byte code offset #107
        //   Java source line #284	-> byte code offset #110
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	112	0	this	1
        //   62	45	1	element	Object
        //   91	16	2	nextItemIterator	Iterator
      }
      
      public void remove()
      {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
      }
    };
  }
}

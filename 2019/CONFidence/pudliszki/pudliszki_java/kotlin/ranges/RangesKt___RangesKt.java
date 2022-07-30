package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;



@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000n\n\002\b\002\n\002\020\017\n\002\b\002\n\002\020\005\n\002\020\006\n\002\020\007\n\002\020\b\n\002\020\t\n\002\020\n\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\030\002\n\000\n\002\020\f\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\026\032'\020\000\032\002H\001\"\016\b\000\020\001*\b\022\004\022\002H\0010\002*\002H\0012\006\020\003\032\002H\001¢\006\002\020\004\032\022\020\000\032\0020\005*\0020\0052\006\020\003\032\0020\005\032\022\020\000\032\0020\006*\0020\0062\006\020\003\032\0020\006\032\022\020\000\032\0020\007*\0020\0072\006\020\003\032\0020\007\032\022\020\000\032\0020\b*\0020\b2\006\020\003\032\0020\b\032\022\020\000\032\0020\t*\0020\t2\006\020\003\032\0020\t\032\022\020\000\032\0020\n*\0020\n2\006\020\003\032\0020\n\032'\020\013\032\002H\001\"\016\b\000\020\001*\b\022\004\022\002H\0010\002*\002H\0012\006\020\f\032\002H\001¢\006\002\020\004\032\022\020\013\032\0020\005*\0020\0052\006\020\f\032\0020\005\032\022\020\013\032\0020\006*\0020\0062\006\020\f\032\0020\006\032\022\020\013\032\0020\007*\0020\0072\006\020\f\032\0020\007\032\022\020\013\032\0020\b*\0020\b2\006\020\f\032\0020\b\032\022\020\013\032\0020\t*\0020\t2\006\020\f\032\0020\t\032\022\020\013\032\0020\n*\0020\n2\006\020\f\032\0020\n\0323\020\r\032\002H\001\"\016\b\000\020\001*\b\022\004\022\002H\0010\002*\002H\0012\b\020\003\032\004\030\001H\0012\b\020\f\032\004\030\001H\001¢\006\002\020\016\032/\020\r\032\002H\001\"\016\b\000\020\001*\b\022\004\022\002H\0010\002*\002H\0012\f\020\017\032\b\022\004\022\002H\0010\020H\007¢\006\002\020\021\032-\020\r\032\002H\001\"\016\b\000\020\001*\b\022\004\022\002H\0010\002*\002H\0012\f\020\017\032\b\022\004\022\002H\0010\022¢\006\002\020\023\032\032\020\r\032\0020\005*\0020\0052\006\020\003\032\0020\0052\006\020\f\032\0020\005\032\032\020\r\032\0020\006*\0020\0062\006\020\003\032\0020\0062\006\020\f\032\0020\006\032\032\020\r\032\0020\007*\0020\0072\006\020\003\032\0020\0072\006\020\f\032\0020\007\032\032\020\r\032\0020\b*\0020\b2\006\020\003\032\0020\b2\006\020\f\032\0020\b\032\030\020\r\032\0020\b*\0020\b2\f\020\017\032\b\022\004\022\0020\b0\022\032\032\020\r\032\0020\t*\0020\t2\006\020\003\032\0020\t2\006\020\f\032\0020\t\032\030\020\r\032\0020\t*\0020\t2\f\020\017\032\b\022\004\022\0020\t0\022\032\032\020\r\032\0020\n*\0020\n2\006\020\003\032\0020\n2\006\020\f\032\0020\n\032\034\020\024\032\0020\025*\0020\0262\b\020\027\032\004\030\0010\030H\n¢\006\002\020\031\032 \020\024\032\0020\025*\b\022\004\022\0020\0050\0222\006\020\032\032\0020\006H\002¢\006\002\b\033\032 \020\024\032\0020\025*\b\022\004\022\0020\0050\0222\006\020\032\032\0020\007H\002¢\006\002\b\033\032 \020\024\032\0020\025*\b\022\004\022\0020\0050\0222\006\020\032\032\0020\bH\002¢\006\002\b\033\032 \020\024\032\0020\025*\b\022\004\022\0020\0050\0222\006\020\032\032\0020\tH\002¢\006\002\b\033\032 \020\024\032\0020\025*\b\022\004\022\0020\0050\0222\006\020\032\032\0020\nH\002¢\006\002\b\033\032 \020\024\032\0020\025*\b\022\004\022\0020\0060\0222\006\020\032\032\0020\005H\002¢\006\002\b\034\032 \020\024\032\0020\025*\b\022\004\022\0020\0060\0222\006\020\032\032\0020\007H\002¢\006\002\b\034\032 \020\024\032\0020\025*\b\022\004\022\0020\0060\0222\006\020\032\032\0020\bH\002¢\006\002\b\034\032 \020\024\032\0020\025*\b\022\004\022\0020\0060\0222\006\020\032\032\0020\tH\002¢\006\002\b\034\032 \020\024\032\0020\025*\b\022\004\022\0020\0060\0222\006\020\032\032\0020\nH\002¢\006\002\b\034\032 \020\024\032\0020\025*\b\022\004\022\0020\0070\0222\006\020\032\032\0020\005H\002¢\006\002\b\035\032 \020\024\032\0020\025*\b\022\004\022\0020\0070\0222\006\020\032\032\0020\006H\002¢\006\002\b\035\032 \020\024\032\0020\025*\b\022\004\022\0020\0070\0222\006\020\032\032\0020\bH\002¢\006\002\b\035\032 \020\024\032\0020\025*\b\022\004\022\0020\0070\0222\006\020\032\032\0020\tH\002¢\006\002\b\035\032 \020\024\032\0020\025*\b\022\004\022\0020\0070\0222\006\020\032\032\0020\nH\002¢\006\002\b\035\032 \020\024\032\0020\025*\b\022\004\022\0020\b0\0222\006\020\032\032\0020\005H\002¢\006\002\b\036\032 \020\024\032\0020\025*\b\022\004\022\0020\b0\0222\006\020\032\032\0020\006H\002¢\006\002\b\036\032 \020\024\032\0020\025*\b\022\004\022\0020\b0\0222\006\020\032\032\0020\007H\002¢\006\002\b\036\032 \020\024\032\0020\025*\b\022\004\022\0020\b0\0222\006\020\032\032\0020\tH\002¢\006\002\b\036\032 \020\024\032\0020\025*\b\022\004\022\0020\b0\0222\006\020\032\032\0020\nH\002¢\006\002\b\036\032 \020\024\032\0020\025*\b\022\004\022\0020\t0\0222\006\020\032\032\0020\005H\002¢\006\002\b\037\032 \020\024\032\0020\025*\b\022\004\022\0020\t0\0222\006\020\032\032\0020\006H\002¢\006\002\b\037\032 \020\024\032\0020\025*\b\022\004\022\0020\t0\0222\006\020\032\032\0020\007H\002¢\006\002\b\037\032 \020\024\032\0020\025*\b\022\004\022\0020\t0\0222\006\020\032\032\0020\bH\002¢\006\002\b\037\032 \020\024\032\0020\025*\b\022\004\022\0020\t0\0222\006\020\032\032\0020\nH\002¢\006\002\b\037\032 \020\024\032\0020\025*\b\022\004\022\0020\n0\0222\006\020\032\032\0020\005H\002¢\006\002\b \032 \020\024\032\0020\025*\b\022\004\022\0020\n0\0222\006\020\032\032\0020\006H\002¢\006\002\b \032 \020\024\032\0020\025*\b\022\004\022\0020\n0\0222\006\020\032\032\0020\007H\002¢\006\002\b \032 \020\024\032\0020\025*\b\022\004\022\0020\n0\0222\006\020\032\032\0020\bH\002¢\006\002\b \032 \020\024\032\0020\025*\b\022\004\022\0020\n0\0222\006\020\032\032\0020\tH\002¢\006\002\b \032\034\020\024\032\0020\025*\0020!2\b\020\027\032\004\030\0010\bH\n¢\006\002\020\"\032\034\020\024\032\0020\025*\0020#2\b\020\027\032\004\030\0010\tH\n¢\006\002\020$\032\025\020%\032\0020&*\0020\0052\006\020'\032\0020\005H\004\032\025\020%\032\0020&*\0020\0052\006\020'\032\0020\bH\004\032\025\020%\032\0020(*\0020\0052\006\020'\032\0020\tH\004\032\025\020%\032\0020&*\0020\0052\006\020'\032\0020\nH\004\032\025\020%\032\0020)*\0020\0302\006\020'\032\0020\030H\004\032\025\020%\032\0020&*\0020\b2\006\020'\032\0020\005H\004\032\025\020%\032\0020&*\0020\b2\006\020'\032\0020\bH\004\032\025\020%\032\0020(*\0020\b2\006\020'\032\0020\tH\004\032\025\020%\032\0020&*\0020\b2\006\020'\032\0020\nH\004\032\025\020%\032\0020(*\0020\t2\006\020'\032\0020\005H\004\032\025\020%\032\0020(*\0020\t2\006\020'\032\0020\bH\004\032\025\020%\032\0020(*\0020\t2\006\020'\032\0020\tH\004\032\025\020%\032\0020(*\0020\t2\006\020'\032\0020\nH\004\032\025\020%\032\0020&*\0020\n2\006\020'\032\0020\005H\004\032\025\020%\032\0020&*\0020\n2\006\020'\032\0020\bH\004\032\025\020%\032\0020(*\0020\n2\006\020'\032\0020\tH\004\032\025\020%\032\0020&*\0020\n2\006\020'\032\0020\nH\004\032\r\020*\032\0020\030*\0020\026H\b\032\024\020*\032\0020\030*\0020\0262\006\020*\032\0020+H\007\032\r\020*\032\0020\b*\0020!H\b\032\024\020*\032\0020\b*\0020!2\006\020*\032\0020+H\007\032\r\020*\032\0020\t*\0020#H\b\032\024\020*\032\0020\t*\0020#2\006\020*\032\0020+H\007\032\n\020,\032\0020)*\0020)\032\n\020,\032\0020&*\0020&\032\n\020,\032\0020(*\0020(\032\025\020-\032\0020)*\0020)2\006\020-\032\0020\bH\004\032\025\020-\032\0020&*\0020&2\006\020-\032\0020\bH\004\032\025\020-\032\0020(*\0020(2\006\020-\032\0020\tH\004\032\023\020.\032\004\030\0010\005*\0020\006H\000¢\006\002\020/\032\023\020.\032\004\030\0010\005*\0020\007H\000¢\006\002\0200\032\023\020.\032\004\030\0010\005*\0020\bH\000¢\006\002\0201\032\023\020.\032\004\030\0010\005*\0020\tH\000¢\006\002\0202\032\023\020.\032\004\030\0010\005*\0020\nH\000¢\006\002\0203\032\023\0204\032\004\030\0010\b*\0020\006H\000¢\006\002\0205\032\023\0204\032\004\030\0010\b*\0020\007H\000¢\006\002\0206\032\023\0204\032\004\030\0010\b*\0020\tH\000¢\006\002\0207\032\023\0208\032\004\030\0010\t*\0020\006H\000¢\006\002\0209\032\023\0208\032\004\030\0010\t*\0020\007H\000¢\006\002\020:\032\023\020;\032\004\030\0010\n*\0020\006H\000¢\006\002\020<\032\023\020;\032\004\030\0010\n*\0020\007H\000¢\006\002\020=\032\023\020;\032\004\030\0010\n*\0020\bH\000¢\006\002\020>\032\023\020;\032\004\030\0010\n*\0020\tH\000¢\006\002\020?\032\025\020@\032\0020!*\0020\0052\006\020'\032\0020\005H\004\032\025\020@\032\0020!*\0020\0052\006\020'\032\0020\bH\004\032\025\020@\032\0020#*\0020\0052\006\020'\032\0020\tH\004\032\025\020@\032\0020!*\0020\0052\006\020'\032\0020\nH\004\032\025\020@\032\0020\026*\0020\0302\006\020'\032\0020\030H\004\032\025\020@\032\0020!*\0020\b2\006\020'\032\0020\005H\004\032\025\020@\032\0020!*\0020\b2\006\020'\032\0020\bH\004\032\025\020@\032\0020#*\0020\b2\006\020'\032\0020\tH\004\032\025\020@\032\0020!*\0020\b2\006\020'\032\0020\nH\004\032\025\020@\032\0020#*\0020\t2\006\020'\032\0020\005H\004\032\025\020@\032\0020#*\0020\t2\006\020'\032\0020\bH\004\032\025\020@\032\0020#*\0020\t2\006\020'\032\0020\tH\004\032\025\020@\032\0020#*\0020\t2\006\020'\032\0020\nH\004\032\025\020@\032\0020!*\0020\n2\006\020'\032\0020\005H\004\032\025\020@\032\0020!*\0020\n2\006\020'\032\0020\bH\004\032\025\020@\032\0020#*\0020\n2\006\020'\032\0020\tH\004\032\025\020@\032\0020!*\0020\n2\006\020'\032\0020\nH\004¨\006A"}, d2={"coerceAtLeast", "T", "", "minimumValue", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "coerceAtMost", "maximumValue", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "Lkotlin/ranges/ClosedRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "contains", "", "Lkotlin/ranges/CharRange;", "element", "", "(Lkotlin/ranges/CharRange;Ljava/lang/Character;)Z", "value", "byteRangeContains", "doubleRangeContains", "floatRangeContains", "intRangeContains", "longRangeContains", "shortRangeContains", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;)Z", "Lkotlin/ranges/LongRange;", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;)Z", "downTo", "Lkotlin/ranges/IntProgression;", "to", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/CharProgression;", "random", "Lkotlin/random/Random;", "reversed", "step", "toByteExactOrNull", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "toIntExactOrNull", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "(J)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "until", "kotlin-stdlib"}, xs="kotlin/ranges/RangesKt")
class RangesKt___RangesKt
  extends RangesKt__RangesKt
{
  @SinceKotlin(version="1.3")
  @InlineOnly
  private static final int random(@NotNull IntRange $receiver)
  {
    ;
    return RangesKt.random($receiver, (Random)Random.Default);
  }
  


  @SinceKotlin(version="1.3")
  @InlineOnly
  private static final long random(@NotNull LongRange $receiver)
  {
    ;
    
    return RangesKt.random($receiver, (Random)Random.Default);
  }
  


  @SinceKotlin(version="1.3")
  @InlineOnly
  private static final char random(@NotNull CharRange $receiver)
  {
    ;
    
    return RangesKt.random($receiver, (Random)Random.Default);
  }
  




  @SinceKotlin(version="1.3")
  public static final int random(@NotNull IntRange $receiver, @NotNull Random random)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(random, "random");
    try { return RandomKt.nextInt(random, $receiver);
    } catch (IllegalArgumentException e) {
      throw ((Throwable)new NoSuchElementException(e.getMessage()));
    }
  }
  




  @SinceKotlin(version="1.3")
  public static final long random(@NotNull LongRange $receiver, @NotNull Random random)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(random, "random");
    try { return RandomKt.nextLong(random, $receiver);
    } catch (IllegalArgumentException e) {
      throw ((Throwable)new NoSuchElementException(e.getMessage()));
    }
  }
  




  @SinceKotlin(version="1.3")
  public static final char random(@NotNull CharRange $receiver, @NotNull Random random)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(random, "random");
    try { return (char)random.nextInt($receiver.getFirst(), $receiver.getLast() + '\001');
    } catch (IllegalArgumentException e) {
      throw ((Throwable)new NoSuchElementException(e.getMessage()));
    }
  }
  


  @SinceKotlin(version="1.3")
  @InlineOnly
  private static final boolean contains(@NotNull IntRange $receiver, Integer element)
  {
    ;
    
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (element != null) && ($receiver.contains(element.intValue()));
  }
  


  @SinceKotlin(version="1.3")
  @InlineOnly
  private static final boolean contains(@NotNull LongRange $receiver, Long element)
  {
    ;
    
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (element != null) && ($receiver.contains(element.longValue()));
  }
  


  @SinceKotlin(version="1.3")
  @InlineOnly
  private static final boolean contains(@NotNull CharRange $receiver, Character element)
  {
    ;
    
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (element != null) && ($receiver.contains(element.charValue()));
  }
  


  @JvmName(name="intRangeContains")
  public static final boolean intRangeContains(@NotNull ClosedRange<Integer> $receiver, byte value)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.contains((Comparable)Integer.valueOf(value));
  }
  


  @JvmName(name="longRangeContains")
  public static final boolean longRangeContains(@NotNull ClosedRange<Long> $receiver, byte value)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.contains((Comparable)Long.valueOf(value));
  }
  


  @JvmName(name="shortRangeContains")
  public static final boolean shortRangeContains(@NotNull ClosedRange<Short> $receiver, byte value)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.contains((Comparable)Short.valueOf((short)value));
  }
  
  /**
   * @deprecated
   */
  @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
  @JvmName(name="doubleRangeContains")
  public static final boolean doubleRangeContains(@NotNull ClosedRange<Double> $receiver, byte value) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.contains((Comparable)Double.valueOf(value));
  }
  
  /**
   * @deprecated
   */
  @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
  @JvmName(name="floatRangeContains")
  public static final boolean floatRangeContains(@NotNull ClosedRange<Float> $receiver, byte value) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.contains((Comparable)Float.valueOf(value));
  }
  
  /**
   * @deprecated
   */
  @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
  @JvmName(name="intRangeContains")
  public static final boolean intRangeContains(@NotNull ClosedRange<Integer> $receiver, double value) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Integer localInteger1 = RangesKt.toIntExactOrNull(value);Integer it = localInteger1; int $i$a$1$let; return it != null ? $receiver.contains((Comparable)it) : false;
  }
  
  /**
   * @deprecated
   */
  @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
  @JvmName(name="longRangeContains")
  public static final boolean longRangeContains(@NotNull ClosedRange<Long> $receiver, double value) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Long localLong1 = RangesKt.toLongExactOrNull(value);Long it = localLong1; int $i$a$2$let; return it != null ? $receiver.contains((Comparable)it) : false;
  }
  
  /**
   * @deprecated
   */
  @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
  @JvmName(name="byteRangeContains")
  public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> $receiver, double value) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Byte localByte1 = RangesKt.toByteExactOrNull(value);Byte it = localByte1; int $i$a$3$let; return it != null ? $receiver.contains((Comparable)it) : false;
  }
  
  /**
   * @deprecated
   */
  @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
  @JvmName(name="shortRangeContains")
  public static final boolean shortRangeContains(@NotNull ClosedRange<Short> $receiver, double value) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Short localShort1 = RangesKt.toShortExactOrNull(value);Short it = localShort1; int $i$a$4$let; return it != null ? $receiver.contains((Comparable)it) : false;
  }
  


  @JvmName(name="floatRangeContains")
  public static final boolean floatRangeContains(@NotNull ClosedRange<Float> $receiver, double value)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.contains((Comparable)Float.valueOf((float)value));
  }
  
  /**
   * @deprecated
   */
  @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
  @JvmName(name="intRangeContains")
  public static final boolean intRangeContains(@NotNull ClosedRange<Integer> $receiver, float value) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Integer localInteger1 = RangesKt.toIntExactOrNull(value);Integer it = localInteger1; int $i$a$5$let; return it != null ? $receiver.contains((Comparable)it) : false;
  }
  
  /**
   * @deprecated
   */
  @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
  @JvmName(name="longRangeContains")
  public static final boolean longRangeContains(@NotNull ClosedRange<Long> $receiver, float value) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Long localLong1 = RangesKt.toLongExactOrNull(value);Long it = localLong1; int $i$a$6$let; return it != null ? $receiver.contains((Comparable)it) : false;
  }
  
  /**
   * @deprecated
   */
  @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
  @JvmName(name="byteRangeContains")
  public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> $receiver, float value) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Byte localByte1 = RangesKt.toByteExactOrNull(value);Byte it = localByte1; int $i$a$7$let; return it != null ? $receiver.contains((Comparable)it) : false;
  }
  
  /**
   * @deprecated
   */
  @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
  @JvmName(name="shortRangeContains")
  public static final boolean shortRangeContains(@NotNull ClosedRange<Short> $receiver, float value) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Short localShort1 = RangesKt.toShortExactOrNull(value);Short it = localShort1; int $i$a$8$let; return it != null ? $receiver.contains((Comparable)it) : false;
  }
  


  @JvmName(name="doubleRangeContains")
  public static final boolean doubleRangeContains(@NotNull ClosedRange<Double> $receiver, float value)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.contains((Comparable)Double.valueOf(value));
  }
  


  @JvmName(name="longRangeContains")
  public static final boolean longRangeContains(@NotNull ClosedRange<Long> $receiver, int value)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.contains((Comparable)Long.valueOf(value));
  }
  


  @JvmName(name="byteRangeContains")
  public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> $receiver, int value)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Byte localByte1 = RangesKt.toByteExactOrNull(value);Byte it = localByte1; int $i$a$9$let; return it != null ? $receiver.contains((Comparable)it) : false;
  }
  


  @JvmName(name="shortRangeContains")
  public static final boolean shortRangeContains(@NotNull ClosedRange<Short> $receiver, int value)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Short localShort1 = RangesKt.toShortExactOrNull(value);Short it = localShort1; int $i$a$10$let; return it != null ? $receiver.contains((Comparable)it) : false;
  }
  
  /**
   * @deprecated
   */
  @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
  @JvmName(name="doubleRangeContains")
  public static final boolean doubleRangeContains(@NotNull ClosedRange<Double> $receiver, int value) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.contains((Comparable)Double.valueOf(value));
  }
  
  /**
   * @deprecated
   */
  @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
  @JvmName(name="floatRangeContains")
  public static final boolean floatRangeContains(@NotNull ClosedRange<Float> $receiver, int value) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.contains((Comparable)Float.valueOf(value));
  }
  


  @JvmName(name="intRangeContains")
  public static final boolean intRangeContains(@NotNull ClosedRange<Integer> $receiver, long value)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Integer localInteger1 = RangesKt.toIntExactOrNull(value);Integer it = localInteger1; int $i$a$11$let; return it != null ? $receiver.contains((Comparable)it) : false;
  }
  


  @JvmName(name="byteRangeContains")
  public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> $receiver, long value)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Byte localByte1 = RangesKt.toByteExactOrNull(value);Byte it = localByte1; int $i$a$12$let; return it != null ? $receiver.contains((Comparable)it) : false;
  }
  


  @JvmName(name="shortRangeContains")
  public static final boolean shortRangeContains(@NotNull ClosedRange<Short> $receiver, long value)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Short localShort1 = RangesKt.toShortExactOrNull(value);Short it = localShort1; int $i$a$13$let; return it != null ? $receiver.contains((Comparable)it) : false;
  }
  
  /**
   * @deprecated
   */
  @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
  @JvmName(name="doubleRangeContains")
  public static final boolean doubleRangeContains(@NotNull ClosedRange<Double> $receiver, long value) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.contains((Comparable)Double.valueOf(value));
  }
  
  /**
   * @deprecated
   */
  @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
  @JvmName(name="floatRangeContains")
  public static final boolean floatRangeContains(@NotNull ClosedRange<Float> $receiver, long value) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.contains((Comparable)Float.valueOf((float)value));
  }
  


  @JvmName(name="intRangeContains")
  public static final boolean intRangeContains(@NotNull ClosedRange<Integer> $receiver, short value)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.contains((Comparable)Integer.valueOf(value));
  }
  


  @JvmName(name="longRangeContains")
  public static final boolean longRangeContains(@NotNull ClosedRange<Long> $receiver, short value)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.contains((Comparable)Long.valueOf(value));
  }
  


  @JvmName(name="byteRangeContains")
  public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> $receiver, short value)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Byte localByte1 = RangesKt.toByteExactOrNull(value);Byte it = localByte1; int $i$a$14$let; return it != null ? $receiver.contains((Comparable)it) : false;
  }
  
  /**
   * @deprecated
   */
  @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
  @JvmName(name="doubleRangeContains")
  public static final boolean doubleRangeContains(@NotNull ClosedRange<Double> $receiver, short value) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.contains((Comparable)Double.valueOf(value));
  }
  
  /**
   * @deprecated
   */
  @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
  @JvmName(name="floatRangeContains")
  public static final boolean floatRangeContains(@NotNull ClosedRange<Float> $receiver, short value) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.contains((Comparable)Float.valueOf(value));
  }
  




  @NotNull
  public static final IntProgression downTo(int $receiver, byte to)
  {
    return IntProgression.Companion.fromClosedRange($receiver, to, -1);
  }
  




  @NotNull
  public static final LongProgression downTo(long $receiver, byte to)
  {
    return LongProgression.Companion.fromClosedRange($receiver, to, -1L);
  }
  




  @NotNull
  public static final IntProgression downTo(byte $receiver, byte to)
  {
    return IntProgression.Companion.fromClosedRange($receiver, to, -1);
  }
  




  @NotNull
  public static final IntProgression downTo(short $receiver, byte to)
  {
    return IntProgression.Companion.fromClosedRange($receiver, to, -1);
  }
  




  @NotNull
  public static final CharProgression downTo(char $receiver, char to)
  {
    return CharProgression.Companion.fromClosedRange($receiver, to, -1);
  }
  




  @NotNull
  public static final IntProgression downTo(int $receiver, int to)
  {
    return IntProgression.Companion.fromClosedRange($receiver, to, -1);
  }
  




  @NotNull
  public static final LongProgression downTo(long $receiver, int to)
  {
    return LongProgression.Companion.fromClosedRange($receiver, to, -1L);
  }
  




  @NotNull
  public static final IntProgression downTo(byte $receiver, int to)
  {
    return IntProgression.Companion.fromClosedRange($receiver, to, -1);
  }
  




  @NotNull
  public static final IntProgression downTo(short $receiver, int to)
  {
    return IntProgression.Companion.fromClosedRange($receiver, to, -1);
  }
  




  @NotNull
  public static final LongProgression downTo(int $receiver, long to)
  {
    return LongProgression.Companion.fromClosedRange($receiver, to, -1L);
  }
  




  @NotNull
  public static final LongProgression downTo(long $receiver, long to)
  {
    return LongProgression.Companion.fromClosedRange($receiver, to, -1L);
  }
  




  @NotNull
  public static final LongProgression downTo(byte $receiver, long to)
  {
    return LongProgression.Companion.fromClosedRange($receiver, to, -1L);
  }
  




  @NotNull
  public static final LongProgression downTo(short $receiver, long to)
  {
    return LongProgression.Companion.fromClosedRange($receiver, to, -1L);
  }
  




  @NotNull
  public static final IntProgression downTo(int $receiver, short to)
  {
    return IntProgression.Companion.fromClosedRange($receiver, to, -1);
  }
  




  @NotNull
  public static final LongProgression downTo(long $receiver, short to)
  {
    return LongProgression.Companion.fromClosedRange($receiver, to, -1L);
  }
  




  @NotNull
  public static final IntProgression downTo(byte $receiver, short to)
  {
    return IntProgression.Companion.fromClosedRange($receiver, to, -1);
  }
  




  @NotNull
  public static final IntProgression downTo(short $receiver, short to)
  {
    return IntProgression.Companion.fromClosedRange($receiver, to, -1);
  }
  

  @NotNull
  public static final IntProgression reversed(@NotNull IntProgression $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return IntProgression.Companion.fromClosedRange($receiver.getLast(), $receiver.getFirst(), -$receiver.getStep());
  }
  

  @NotNull
  public static final LongProgression reversed(@NotNull LongProgression $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return LongProgression.Companion.fromClosedRange($receiver.getLast(), $receiver.getFirst(), -$receiver.getStep());
  }
  

  @NotNull
  public static final CharProgression reversed(@NotNull CharProgression $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return CharProgression.Companion.fromClosedRange($receiver.getLast(), $receiver.getFirst(), -$receiver.getStep());
  }
  

  @NotNull
  public static final IntProgression step(@NotNull IntProgression $receiver, int step)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");RangesKt.checkStepIsPositive(step > 0, (Number)Integer.valueOf(step));
    return IntProgression.Companion.fromClosedRange($receiver.getFirst(), $receiver.getLast(), $receiver.getStep() > 0 ? step : -step);
  }
  

  @NotNull
  public static final LongProgression step(@NotNull LongProgression $receiver, long step)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");RangesKt.checkStepIsPositive(step > 0L, (Number)Long.valueOf(step));
    return LongProgression.Companion.fromClosedRange($receiver.getFirst(), $receiver.getLast(), $receiver.getStep() > 0L ? step : -step);
  }
  

  @NotNull
  public static final CharProgression step(@NotNull CharProgression $receiver, int step)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");RangesKt.checkStepIsPositive(step > 0, (Number)Integer.valueOf(step));
    return CharProgression.Companion.fromClosedRange($receiver.getFirst(), $receiver.getLast(), $receiver.getStep() > 0 ? step : -step);
  }
  
  /* Error */
  @Nullable
  public static final Byte toByteExactOrNull(int $receiver)
  {
    // Byte code:
    //   0: bipush 127
    //   2: bipush -128
    //   4: iload_0
    //   5: istore_1
    //   6: iload_1
    //   7: if_icmple +7 -> 14
    //   10: pop
    //   11: goto +15 -> 26
    //   14: iload_1
    //   15: if_icmplt +11 -> 26
    //   18: iload_0
    //   19: i2b
    //   20: invokestatic 332	java/lang/Byte:valueOf	(B)Ljava/lang/Byte;
    //   23: goto +4 -> 27
    //   26: aconst_null
    //   27: areturn
    // Line number table:
    //   Java source line #598	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	28	0	$receiver	int
  }
  
  /* Error */
  @Nullable
  public static final Byte toByteExactOrNull(long $receiver)
  {
    // Byte code:
    //   0: bipush -128
    //   2: i2l
    //   3: bipush 127
    //   5: i2l
    //   6: dup2_x2
    //   7: pop2
    //   8: lload_0
    //   9: lstore_2
    //   10: lload_2
    //   11: lcmp
    //   12: ifle +7 -> 19
    //   15: pop2
    //   16: goto +17 -> 33
    //   19: lload_2
    //   20: lcmp
    //   21: iflt +12 -> 33
    //   24: lload_0
    //   25: l2i
    //   26: i2b
    //   27: invokestatic 332	java/lang/Byte:valueOf	(B)Ljava/lang/Byte;
    //   30: goto +4 -> 34
    //   33: aconst_null
    //   34: areturn
    // Line number table:
    //   Java source line #602	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	35	0	$receiver	long
  }
  
  /* Error */
  @Nullable
  public static final Byte toByteExactOrNull(short $receiver)
  {
    // Byte code:
    //   0: bipush -128
    //   2: i2s
    //   3: bipush 127
    //   5: i2s
    //   6: swap
    //   7: iload_0
    //   8: istore_1
    //   9: iload_1
    //   10: if_icmple +7 -> 17
    //   13: pop
    //   14: goto +15 -> 29
    //   17: iload_1
    //   18: if_icmplt +11 -> 29
    //   21: iload_0
    //   22: i2b
    //   23: invokestatic 332	java/lang/Byte:valueOf	(B)Ljava/lang/Byte;
    //   26: goto +4 -> 30
    //   29: aconst_null
    //   30: areturn
    // Line number table:
    //   Java source line #606	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	$receiver	short
  }
  
  @Nullable
  public static final Byte toByteExactOrNull(double $receiver)
  {
    double d2 = Byte.MIN_VALUE;double d3 = 127;double d1 = $receiver;return (d1 >= d2) && (d1 <= d3) ? Byte.valueOf((byte)(int)$receiver) : null;
  }
  
  @Nullable
  public static final Byte toByteExactOrNull(float $receiver) { float f2 = Byte.MIN_VALUE;float f3 = 127;float f1 = $receiver;return (f1 >= f2) && (f1 <= f3) ? Byte.valueOf((byte)(int)$receiver) : null;
  }
  
  /* Error */
  @Nullable
  public static final Integer toIntExactOrNull(long $receiver)
  {
    // Byte code:
    //   0: ldc_w 333
    //   3: i2l
    //   4: ldc_w 334
    //   7: i2l
    //   8: dup2_x2
    //   9: pop2
    //   10: lload_0
    //   11: lstore_2
    //   12: lload_2
    //   13: lcmp
    //   14: ifle +7 -> 21
    //   17: pop2
    //   18: goto +16 -> 34
    //   21: lload_2
    //   22: lcmp
    //   23: iflt +11 -> 34
    //   26: lload_0
    //   27: l2i
    //   28: invokestatic 131	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   31: goto +4 -> 35
    //   34: aconst_null
    //   35: areturn
    // Line number table:
    //   Java source line #618	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	$receiver	long
  }
  
  @Nullable
  public static final Integer toIntExactOrNull(double $receiver)
  {
    double d2 = Integer.MIN_VALUE;double d3 = Integer.MAX_VALUE;double d1 = $receiver;return (d1 >= d2) && (d1 <= d3) ? Integer.valueOf((int)$receiver) : null;
  }
  
  @Nullable
  public static final Integer toIntExactOrNull(float $receiver) { float f2 = Integer.MIN_VALUE;float f3 = Integer.MAX_VALUE;float f1 = $receiver;return (f1 >= f2) && (f1 <= f3) ? Integer.valueOf((int)$receiver) : null;
  }
  
  @Nullable
  public static final Long toLongExactOrNull(double $receiver) { double d2 = Long.MIN_VALUE;double d3 = Long.MAX_VALUE;double d1 = $receiver;return (d1 >= d2) && (d1 <= d3) ? Long.valueOf($receiver) : null;
  }
  
  @Nullable
  public static final Long toLongExactOrNull(float $receiver) { float f2 = (float)Long.MIN_VALUE;float f3 = (float)Long.MAX_VALUE;float f1 = $receiver;return (f1 >= f2) && (f1 <= f3) ? Long.valueOf($receiver) : null;
  }
  
  /* Error */
  @Nullable
  public static final Short toShortExactOrNull(int $receiver)
  {
    // Byte code:
    //   0: sipush 32767
    //   3: sipush 32768
    //   6: iload_0
    //   7: istore_1
    //   8: iload_1
    //   9: if_icmple +7 -> 16
    //   12: pop
    //   13: goto +15 -> 28
    //   16: iload_1
    //   17: if_icmplt +11 -> 28
    //   20: iload_0
    //   21: i2s
    //   22: invokestatic 151	java/lang/Short:valueOf	(S)Ljava/lang/Short;
    //   25: goto +4 -> 29
    //   28: aconst_null
    //   29: areturn
    // Line number table:
    //   Java source line #638	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	30	0	$receiver	int
  }
  
  /* Error */
  @Nullable
  public static final Short toShortExactOrNull(long $receiver)
  {
    // Byte code:
    //   0: sipush 32768
    //   3: i2l
    //   4: sipush 32767
    //   7: i2l
    //   8: dup2_x2
    //   9: pop2
    //   10: lload_0
    //   11: lstore_2
    //   12: lload_2
    //   13: lcmp
    //   14: ifle +7 -> 21
    //   17: pop2
    //   18: goto +17 -> 35
    //   21: lload_2
    //   22: lcmp
    //   23: iflt +12 -> 35
    //   26: lload_0
    //   27: l2i
    //   28: i2s
    //   29: invokestatic 151	java/lang/Short:valueOf	(S)Ljava/lang/Short;
    //   32: goto +4 -> 36
    //   35: aconst_null
    //   36: areturn
    // Line number table:
    //   Java source line #642	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	$receiver	long
  }
  
  @Nullable
  public static final Short toShortExactOrNull(double $receiver)
  {
    double d2 = '耀';double d3 = '翿';double d1 = $receiver;return (d1 >= d2) && (d1 <= d3) ? Short.valueOf((short)(int)$receiver) : null;
  }
  
  @Nullable
  public static final Short toShortExactOrNull(float $receiver) { float f2 = '耀';float f3 = '翿';float f1 = $receiver;return (f1 >= f2) && (f1 <= f3) ? Short.valueOf((short)(int)$receiver) : null;
  }
  



  @NotNull
  public static final IntRange until(int $receiver, byte to)
  {
    int i = $receiver;return new IntRange(i, to - 1);
  }
  



  @NotNull
  public static final LongRange until(long $receiver, byte to)
  {
    long l = $receiver;return new LongRange(l, to - 1L);
  }
  



  @NotNull
  public static final IntRange until(byte $receiver, byte to)
  {
    int i = $receiver;return new IntRange(i, to - 1);
  }
  



  @NotNull
  public static final IntRange until(short $receiver, byte to)
  {
    int i = $receiver;return new IntRange(i, to - 1);
  }
  



  @NotNull
  public static final CharRange until(char $receiver, char to)
  {
    if (to <= 0) return CharRange.Companion.getEMPTY();
    char c = $receiver;return new CharRange(c, (char)(to - '\001'));
  }
  



  @NotNull
  public static final IntRange until(int $receiver, int to)
  {
    if (to <= Integer.MIN_VALUE) return IntRange.Companion.getEMPTY();
    int i = $receiver;return new IntRange(i, to - 1);
  }
  



  @NotNull
  public static final LongRange until(long $receiver, int to)
  {
    long l = $receiver;return new LongRange(l, to - 1L);
  }
  



  @NotNull
  public static final IntRange until(byte $receiver, int to)
  {
    if (to <= Integer.MIN_VALUE) return IntRange.Companion.getEMPTY();
    int i = $receiver;return new IntRange(i, to - 1);
  }
  



  @NotNull
  public static final IntRange until(short $receiver, int to)
  {
    if (to <= Integer.MIN_VALUE) return IntRange.Companion.getEMPTY();
    int i = $receiver;return new IntRange(i, to - 1);
  }
  



  @NotNull
  public static final LongRange until(int $receiver, long to)
  {
    if (to <= Long.MIN_VALUE) return LongRange.Companion.getEMPTY();
    long l = $receiver;return new LongRange(l, to - 1L);
  }
  



  @NotNull
  public static final LongRange until(long $receiver, long to)
  {
    if (to <= Long.MIN_VALUE) return LongRange.Companion.getEMPTY();
    long l = $receiver;return new LongRange(l, to - 1L);
  }
  



  @NotNull
  public static final LongRange until(byte $receiver, long to)
  {
    if (to <= Long.MIN_VALUE) return LongRange.Companion.getEMPTY();
    long l = $receiver;return new LongRange(l, to - 1L);
  }
  



  @NotNull
  public static final LongRange until(short $receiver, long to)
  {
    if (to <= Long.MIN_VALUE) return LongRange.Companion.getEMPTY();
    long l = $receiver;return new LongRange(l, to - 1L);
  }
  



  @NotNull
  public static final IntRange until(int $receiver, short to)
  {
    int i = $receiver;return new IntRange(i, to - 1);
  }
  



  @NotNull
  public static final LongRange until(long $receiver, short to)
  {
    long l = $receiver;return new LongRange(l, to - 1L);
  }
  



  @NotNull
  public static final IntRange until(byte $receiver, short to)
  {
    int i = $receiver;return new IntRange(i, to - 1);
  }
  



  @NotNull
  public static final IntRange until(short $receiver, short to)
  {
    int i = $receiver;return new IntRange(i, to - 1);
  }
  





  @NotNull
  public static final <T extends Comparable<? super T>> T coerceAtLeast(@NotNull T $receiver, @NotNull T minimumValue)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(minimumValue, "minimumValue");return $receiver.compareTo(minimumValue) < 0 ? minimumValue : $receiver;
  }
  






  public static final byte coerceAtLeast(byte $receiver, byte minimumValue)
  {
    return $receiver < minimumValue ? minimumValue : $receiver;
  }
  






  public static final short coerceAtLeast(short $receiver, short minimumValue)
  {
    return $receiver < minimumValue ? minimumValue : $receiver;
  }
  






  public static final int coerceAtLeast(int $receiver, int minimumValue)
  {
    return $receiver < minimumValue ? minimumValue : $receiver;
  }
  






  public static final long coerceAtLeast(long $receiver, long minimumValue)
  {
    return $receiver < minimumValue ? minimumValue : $receiver;
  }
  






  public static final float coerceAtLeast(float $receiver, float minimumValue)
  {
    return $receiver < minimumValue ? minimumValue : $receiver;
  }
  






  public static final double coerceAtLeast(double $receiver, double minimumValue)
  {
    return $receiver < minimumValue ? minimumValue : $receiver;
  }
  





  @NotNull
  public static final <T extends Comparable<? super T>> T coerceAtMost(@NotNull T $receiver, @NotNull T maximumValue)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(maximumValue, "maximumValue");return $receiver.compareTo(maximumValue) > 0 ? maximumValue : $receiver;
  }
  






  public static final byte coerceAtMost(byte $receiver, byte maximumValue)
  {
    return $receiver > maximumValue ? maximumValue : $receiver;
  }
  






  public static final short coerceAtMost(short $receiver, short maximumValue)
  {
    return $receiver > maximumValue ? maximumValue : $receiver;
  }
  






  public static final int coerceAtMost(int $receiver, int maximumValue)
  {
    return $receiver > maximumValue ? maximumValue : $receiver;
  }
  






  public static final long coerceAtMost(long $receiver, long maximumValue)
  {
    return $receiver > maximumValue ? maximumValue : $receiver;
  }
  






  public static final float coerceAtMost(float $receiver, float maximumValue)
  {
    return $receiver > maximumValue ? maximumValue : $receiver;
  }
  






  public static final double coerceAtMost(double $receiver, double maximumValue)
  {
    return $receiver > maximumValue ? maximumValue : $receiver;
  }
  
  /* Error */
  @NotNull
  public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T $receiver, @Nullable T minimumValue, @Nullable T maximumValue)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 40
    //   3: invokestatic 46	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ifnull +90 -> 97
    //   10: aload_2
    //   11: ifnull +86 -> 97
    //   14: aload_1
    //   15: aload_2
    //   16: invokeinterface 398 2 0
    //   21: ifle +49 -> 70
    //   24: new 38	java/lang/IllegalArgumentException
    //   27: dup
    //   28: new 411	java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial 414	java/lang/StringBuilder:<init>	()V
    //   35: ldc_w 416
    //   38: invokevirtual 420	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload_2
    //   42: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   45: ldc_w 425
    //   48: invokevirtual 420	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: aload_1
    //   52: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   55: bipush 46
    //   57: invokevirtual 428	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   60: invokevirtual 431	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: invokespecial 432	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   66: checkcast 65	java/lang/Throwable
    //   69: athrow
    //   70: aload_0
    //   71: aload_1
    //   72: invokeinterface 398 2 0
    //   77: ifge +5 -> 82
    //   80: aload_1
    //   81: areturn
    //   82: aload_0
    //   83: aload_2
    //   84: invokeinterface 398 2 0
    //   89: ifle +40 -> 129
    //   92: aload_2
    //   93: areturn
    //   94: nop
    //   95: nop
    //   96: athrow
    //   97: aload_1
    //   98: ifnull +15 -> 113
    //   101: aload_0
    //   102: aload_1
    //   103: invokeinterface 398 2 0
    //   108: ifge +5 -> 113
    //   111: aload_1
    //   112: areturn
    //   113: aload_2
    //   114: ifnull +15 -> 129
    //   117: aload_0
    //   118: aload_2
    //   119: invokeinterface 398 2 0
    //   124: ifle +5 -> 129
    //   127: aload_2
    //   128: areturn
    //   129: aload_0
    //   130: areturn
    // Line number table:
    //   Java source line #976	-> byte code offset #6
    //   Java source line #977	-> byte code offset #14
    //   Java source line #978	-> byte code offset #70
    //   Java source line #979	-> byte code offset #82
    //   Java source line #982	-> byte code offset #97
    //   Java source line #983	-> byte code offset #113
    //   Java source line #984	-> byte code offset #129
    //   Java source line #985	-> byte code offset #129
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	$receiver	Comparable
    //   0	131	1	minimumValue	Comparable
    //   0	131	2	maximumValue	Comparable
  }
  
  public static final byte coerceIn(byte $receiver, byte minimumValue, byte maximumValue)
  {
    if (minimumValue > maximumValue) throw ((Throwable)new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.'));
    if ($receiver < minimumValue) return minimumValue;
    if ($receiver > maximumValue) return maximumValue;
    return $receiver;
  }
  






  public static final short coerceIn(short $receiver, short minimumValue, short maximumValue)
  {
    if (minimumValue > maximumValue) throw ((Throwable)new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.'));
    if ($receiver < minimumValue) return minimumValue;
    if ($receiver > maximumValue) return maximumValue;
    return $receiver;
  }
  






  public static final int coerceIn(int $receiver, int minimumValue, int maximumValue)
  {
    if (minimumValue > maximumValue) throw ((Throwable)new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.'));
    if ($receiver < minimumValue) return minimumValue;
    if ($receiver > maximumValue) return maximumValue;
    return $receiver;
  }
  






  public static final long coerceIn(long $receiver, long minimumValue, long maximumValue)
  {
    if (minimumValue > maximumValue) throw ((Throwable)new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.'));
    if ($receiver < minimumValue) return minimumValue;
    if ($receiver > maximumValue) return maximumValue;
    return $receiver;
  }
  






  public static final float coerceIn(float $receiver, float minimumValue, float maximumValue)
  {
    if (minimumValue > maximumValue) throw ((Throwable)new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.'));
    if ($receiver < minimumValue) return minimumValue;
    if ($receiver > maximumValue) return maximumValue;
    return $receiver;
  }
  






  public static final double coerceIn(double $receiver, double minimumValue, double maximumValue)
  {
    if (minimumValue > maximumValue) throw ((Throwable)new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.'));
    if ($receiver < minimumValue) return minimumValue;
    if ($receiver > maximumValue) return maximumValue;
    return $receiver;
  }
  





  @SinceKotlin(version="1.1")
  @NotNull
  public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T $receiver, @NotNull ClosedFloatingPointRange<T> range)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(range, "range"); if (range.isEmpty()) throw ((Throwable)new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.'));
    return 
    


      (range.lessThanOrEquals(range.getEndInclusive(), $receiver)) && (!range.lessThanOrEquals($receiver, range.getEndInclusive())) ? range.getEndInclusive() : (range.lessThanOrEquals($receiver, range.getStart())) && (!range.lessThanOrEquals(range.getStart(), $receiver)) ? range.getStart() : 
      $receiver;
  }
  






  @NotNull
  public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T $receiver, @NotNull ClosedRange<T> range)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(range, "range"); if ((range instanceof ClosedFloatingPointRange)) {
      return RangesKt.coerceIn($receiver, (ClosedFloatingPointRange)range);
    }
    if (range.isEmpty()) throw ((Throwable)new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.'));
    return 
    
      $receiver.compareTo(range.getEndInclusive()) > 0 ? range.getEndInclusive() : $receiver.compareTo(range.getStart()) < 0 ? range.getStart() : 
      $receiver;
  }
  







  public static final int coerceIn(int $receiver, @NotNull ClosedRange<Integer> range)
  {
    Intrinsics.checkParameterIsNotNull(range, "range"); if ((range instanceof ClosedFloatingPointRange)) {
      return ((Number)RangesKt.coerceIn((Comparable)Integer.valueOf($receiver), (ClosedFloatingPointRange)range)).intValue();
    }
    if (range.isEmpty()) throw ((Throwable)new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.'));
    return 
    
      $receiver > ((Number)range.getEndInclusive()).intValue() ? ((Number)range.getEndInclusive()).intValue() : $receiver < ((Number)range.getStart()).intValue() ? ((Number)range.getStart()).intValue() : 
      $receiver;
  }
  







  public static final long coerceIn(long $receiver, @NotNull ClosedRange<Long> range)
  {
    Intrinsics.checkParameterIsNotNull(range, "range"); if ((range instanceof ClosedFloatingPointRange)) {
      return ((Number)RangesKt.coerceIn((Comparable)Long.valueOf($receiver), (ClosedFloatingPointRange)range)).longValue();
    }
    if (range.isEmpty()) throw ((Throwable)new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.'));
    return 
    
      $receiver > ((Number)range.getEndInclusive()).longValue() ? ((Number)range.getEndInclusive()).longValue() : $receiver < ((Number)range.getStart()).longValue() ? ((Number)range.getStart()).longValue() : 
      $receiver;
  }
  
  public RangesKt___RangesKt() {}
}

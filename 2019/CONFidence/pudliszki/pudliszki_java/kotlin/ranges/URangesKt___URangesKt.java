package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.URandomKt;
import org.jetbrains.annotations.NotNull;



@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000N\n\000\n\002\020\013\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\005\n\002\020\b\n\002\020\t\n\002\b\n\032\037\020\000\032\0020\001*\0020\0022\b\020\003\032\004\030\0010\004H\nø\001\000¢\006\002\b\005\032\037\020\000\032\0020\001*\0020\0062\b\020\003\032\004\030\0010\007H\nø\001\000¢\006\002\b\b\032\037\020\t\032\0020\n*\0020\0132\006\020\f\032\0020\013H\004ø\001\000¢\006\004\b\r\020\016\032\037\020\t\032\0020\n*\0020\0042\006\020\f\032\0020\004H\004ø\001\000¢\006\004\b\017\020\020\032\037\020\t\032\0020\021*\0020\0072\006\020\f\032\0020\007H\004ø\001\000¢\006\004\b\022\020\023\032\037\020\t\032\0020\n*\0020\0242\006\020\f\032\0020\024H\004ø\001\000¢\006\004\b\025\020\026\032\025\020\027\032\0020\004*\0020\002H\bø\001\000¢\006\002\020\030\032\034\020\027\032\0020\004*\0020\0022\006\020\027\032\0020\031H\007ø\001\000¢\006\002\020\032\032\025\020\027\032\0020\007*\0020\006H\bø\001\000¢\006\002\020\033\032\034\020\027\032\0020\007*\0020\0062\006\020\027\032\0020\031H\007ø\001\000¢\006\002\020\034\032\f\020\035\032\0020\n*\0020\nH\007\032\f\020\035\032\0020\021*\0020\021H\007\032\025\020\036\032\0020\n*\0020\n2\006\020\036\032\0020\037H\004\032\025\020\036\032\0020\021*\0020\0212\006\020\036\032\0020 H\004\032\037\020!\032\0020\002*\0020\0132\006\020\f\032\0020\013H\004ø\001\000¢\006\004\b\"\020#\032\037\020!\032\0020\002*\0020\0042\006\020\f\032\0020\004H\004ø\001\000¢\006\004\b$\020%\032\037\020!\032\0020\006*\0020\0072\006\020\f\032\0020\007H\004ø\001\000¢\006\004\b&\020'\032\037\020!\032\0020\002*\0020\0242\006\020\f\032\0020\024H\004ø\001\000¢\006\004\b(\020)\002\004\n\002\b\031¨\006*"}, d2={"contains", "", "Lkotlin/ranges/UIntRange;", "element", "Lkotlin/UInt;", "contains-biwQdVI", "Lkotlin/ranges/ULongRange;", "Lkotlin/ULong;", "contains-GYNo2lE", "downTo", "Lkotlin/ranges/UIntProgression;", "Lkotlin/UByte;", "to", "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ULongProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "Lkotlin/UShort;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "random", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;)J", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "reversed", "step", "", "", "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, xs="kotlin/ranges/URangesKt")
class URangesKt___URangesKt
{
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final int random(@NotNull UIntRange $receiver)
  {
    ;
    return URangesKt.random($receiver, (Random)Random.Default);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final long random(@NotNull ULongRange $receiver)
  {
    ;
    
    return URangesKt.random($receiver, (Random)Random.Default);
  }
  




  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final int random(@NotNull UIntRange $receiver, @NotNull Random random)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(random, "random");
    try { return URandomKt.nextUInt(random, $receiver);
    } catch (IllegalArgumentException e) {
      throw ((Throwable)new NoSuchElementException(e.getMessage()));
    }
  }
  




  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final long random(@NotNull ULongRange $receiver, @NotNull Random random)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(random, "random");
    try { return URandomKt.nextULong(random, $receiver);
    } catch (IllegalArgumentException e) {
      throw ((Throwable)new NoSuchElementException(e.getMessage()));
    }
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final boolean contains-biwQdVI(@NotNull UIntRange $receiver, UInt element)
  {
    ;
    
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (element != null) && ($receiver.contains-WZ4Q5Ns(element.unbox-impl()));
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final boolean contains-GYNo2lE(@NotNull ULongRange $receiver, ULong element)
  {
    ;
    
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (element != null) && ($receiver.contains-VKZWuLQ(element.unbox-impl()));
  }
  




  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final UIntProgression downTo-Kr8caGY(byte $receiver, byte to)
  {
    int i = $receiver;UIntProgression.Companion localCompanion = UIntProgression.Companion;int j = UInt.constructor-impl(i & 0xFF);i = to;j = j;localCompanion = localCompanion;int k = UInt.constructor-impl(i & 0xFF);return localCompanion.fromClosedRange-Nkh28Cs(j, k, -1);
  }
  




  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final UIntProgression downTo-J1ME1BU(int $receiver, int to)
  {
    return UIntProgression.Companion.fromClosedRange-Nkh28Cs($receiver, to, -1);
  }
  




  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final ULongProgression downTo-eb3DHEI(long $receiver, long to)
  {
    return ULongProgression.Companion.fromClosedRange-7ftBX0g($receiver, to, -1L);
  }
  




  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final UIntProgression downTo-5PvTz6A(short $receiver, short to)
  {
    int i = $receiver;UIntProgression.Companion localCompanion = UIntProgression.Companion;int j = UInt.constructor-impl(i & 0xFFFF);i = to;j = j;localCompanion = localCompanion;int k = UInt.constructor-impl(i & 0xFFFF);return localCompanion.fromClosedRange-Nkh28Cs(j, k, -1);
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final UIntProgression reversed(@NotNull UIntProgression $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return UIntProgression.Companion.fromClosedRange-Nkh28Cs($receiver.getLast(), $receiver.getFirst(), -$receiver.getStep());
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final ULongProgression reversed(@NotNull ULongProgression $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return ULongProgression.Companion.fromClosedRange-7ftBX0g($receiver.getLast(), $receiver.getFirst(), -$receiver.getStep());
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final UIntProgression step(@NotNull UIntProgression $receiver, int step)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");RangesKt.checkStepIsPositive(step > 0, (Number)Integer.valueOf(step));
    return UIntProgression.Companion.fromClosedRange-Nkh28Cs($receiver.getFirst(), $receiver.getLast(), $receiver.getStep() > 0 ? step : -step);
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final ULongProgression step(@NotNull ULongProgression $receiver, long step)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");RangesKt.checkStepIsPositive(step > 0L, (Number)Long.valueOf(step));
    return ULongProgression.Companion.fromClosedRange-7ftBX0g($receiver.getFirst(), $receiver.getLast(), $receiver.getStep() > 0L ? step : -step);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final UIntRange until-Kr8caGY(byte $receiver, byte to)
  {
    int i = $receiver;i = UInt.constructor-impl(i & 0xFF);int j = to;j = UInt.constructor-impl(j & 0xFF);int k = 1;j = UInt.constructor-impl(j - k);j = j;return new UIntRange(i, j, null);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final UIntRange until-J1ME1BU(int $receiver, int to)
  {
    int i = to;int j = 0; if (UnsignedKt.uintCompare(i, j) <= 0) return UIntRange.Companion.getEMPTY();
    i = $receiver;j = to;int k = 1;j = UInt.constructor-impl(j - k);j = j;return new UIntRange(i, j, null);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final ULongRange until-eb3DHEI(long $receiver, long to)
  {
    long l1 = to;long l2 = 0L; if (UnsignedKt.ulongCompare(l1, l2) <= 0) return ULongRange.Companion.getEMPTY();
    l1 = $receiver;l2 = to;int i = 1;long l3 = l2;int j = i;long l4 = ULong.constructor-impl(j & 0xFFFFFFFF);l2 = ULong.constructor-impl(l3 - l4);l2 = l2;return new ULongRange(l1, l2, null);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final UIntRange until-5PvTz6A(short $receiver, short to)
  {
    int i = $receiver;i = UInt.constructor-impl(i & 0xFFFF);int j = to;j = UInt.constructor-impl(j & 0xFFFF);int k = 1;j = UInt.constructor-impl(j - k);j = j;return new UIntRange(i, j, null);
  }
  
  public URangesKt___URangesKt() {}
}

package kotlin.streams.jdk8;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000.\n\000\n\002\030\002\n\002\020\006\n\002\030\002\n\002\020\b\n\002\030\002\n\002\020\t\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\000\032\022\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\007\032\022\020\000\032\b\022\004\022\0020\0040\001*\0020\005H\007\032\022\020\000\032\b\022\004\022\0020\0060\001*\0020\007H\007\032\036\020\000\032\b\022\004\022\002H\b0\001\"\004\b\000\020\b*\b\022\004\022\002H\b0\tH\007\032\036\020\n\032\b\022\004\022\002H\b0\t\"\004\b\000\020\b*\b\022\004\022\002H\b0\001H\007\032\022\020\013\032\b\022\004\022\0020\0020\f*\0020\003H\007\032\022\020\013\032\b\022\004\022\0020\0040\f*\0020\005H\007\032\022\020\013\032\b\022\004\022\0020\0060\f*\0020\007H\007\032\036\020\013\032\b\022\004\022\002H\b0\f\"\004\b\000\020\b*\b\022\004\022\002H\b0\tH\007¨\006\r"}, d2={"asSequence", "Lkotlin/sequences/Sequence;", "", "Ljava/util/stream/DoubleStream;", "", "Ljava/util/stream/IntStream;", "", "Ljava/util/stream/LongStream;", "T", "Ljava/util/stream/Stream;", "asStream", "toList", "", "kotlin-stdlib-jdk8"}, pn="kotlin.streams")
@JvmName(name="StreamsKt")
public final class StreamsKt
{
  @SinceKotlin(version="1.2")
  @NotNull
  public static final <T> Sequence<T> asSequence(@NotNull Stream<T> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (Sequence)new StreamsKt.asSequence..inlined.Sequence.1($receiver);
  }
  
  @SinceKotlin(version="1.2")
  @NotNull
  public static final Sequence<Integer> asSequence(@NotNull IntStream $receiver) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (Sequence)new StreamsKt.asSequence..inlined.Sequence.2($receiver);
  }
  
  @SinceKotlin(version="1.2")
  @NotNull
  public static final Sequence<Long> asSequence(@NotNull LongStream $receiver) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (Sequence)new StreamsKt.asSequence..inlined.Sequence.3($receiver);
  }
  
  @SinceKotlin(version="1.2")
  @NotNull
  public static final Sequence<Double> asSequence(@NotNull DoubleStream $receiver) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (Sequence)new StreamsKt.asSequence..inlined.Sequence.4($receiver);
  }
  
  @SinceKotlin(version="1.2")
  @NotNull
  public static final <T> Stream<T> asStream(@NotNull Sequence<? extends T> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); Stream tmp23_20 = StreamSupport.stream((Supplier)new Supplier(), 16, false);Intrinsics.checkExpressionValueIsNotNull(tmp23_20, "StreamSupport.stream({ S…literator.ORDERED, false)");return tmp23_20;
  }
  
  @SinceKotlin(version="1.2")
  @NotNull
  public static final <T> List<T> toList(@NotNull Stream<T> $receiver) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); Object tmp15_10 = $receiver.collect(Collectors.toList());Intrinsics.checkExpressionValueIsNotNull(tmp15_10, "collect(Collectors.toList<T>())");return (List)tmp15_10;
  }
  
  @SinceKotlin(version="1.2")
  @NotNull
  public static final List<Integer> toList(@NotNull IntStream $receiver) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); int[] tmp12_7 = $receiver.toArray();Intrinsics.checkExpressionValueIsNotNull(tmp12_7, "toArray()");return ArraysKt.asList(tmp12_7);
  }
  
  @SinceKotlin(version="1.2")
  @NotNull
  public static final List<Long> toList(@NotNull LongStream $receiver) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); long[] tmp12_7 = $receiver.toArray();Intrinsics.checkExpressionValueIsNotNull(tmp12_7, "toArray()");return ArraysKt.asList(tmp12_7);
  }
  
  @SinceKotlin(version="1.2")
  @NotNull
  public static final List<Double> toList(@NotNull DoubleStream $receiver) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); double[] tmp12_7 = $receiver.toArray();Intrinsics.checkExpressionValueIsNotNull(tmp12_7, "toArray()");return ArraysKt.asList(tmp12_7);
  }
}

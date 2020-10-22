package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.collections.BooleanIterator;
import kotlin.collections.ByteIterator;
import kotlin.collections.CharIterator;
import kotlin.collections.DoubleIterator;
import kotlin.collections.FloatIterator;
import kotlin.collections.IntIterator;
import kotlin.collections.LongIterator;
import kotlin.collections.ShortIterator;
import org.jetbrains.annotations.NotNull;







































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000F\n\000\n\002\030\002\n\000\n\002\020\030\n\002\030\002\n\002\020\022\n\002\030\002\n\002\020\031\n\002\030\002\n\002\020\023\n\002\030\002\n\002\020\024\n\002\030\002\n\002\020\025\n\002\030\002\n\002\020\026\n\002\030\002\n\002\020\027\n\000\032\016\020\000\032\0020\0012\006\020\002\032\0020\003\032\016\020\000\032\0020\0042\006\020\002\032\0020\005\032\016\020\000\032\0020\0062\006\020\002\032\0020\007\032\016\020\000\032\0020\b2\006\020\002\032\0020\t\032\016\020\000\032\0020\n2\006\020\002\032\0020\013\032\016\020\000\032\0020\f2\006\020\002\032\0020\r\032\016\020\000\032\0020\0162\006\020\002\032\0020\017\032\016\020\000\032\0020\0202\006\020\002\032\0020\021¨\006\022"}, d2={"iterator", "Lkotlin/collections/BooleanIterator;", "array", "", "Lkotlin/collections/ByteIterator;", "", "Lkotlin/collections/CharIterator;", "", "Lkotlin/collections/DoubleIterator;", "", "Lkotlin/collections/FloatIterator;", "", "Lkotlin/collections/IntIterator;", "", "Lkotlin/collections/LongIterator;", "", "Lkotlin/collections/ShortIterator;", "", "kotlin-stdlib"})
public final class ArrayIteratorsKt
{
  @NotNull
  public static final ByteIterator iterator(@NotNull byte[] array)
  {
    Intrinsics.checkParameterIsNotNull(array, "array");return (ByteIterator)new ArrayByteIterator(array); } @NotNull
  public static final CharIterator iterator(@NotNull char[] array) { Intrinsics.checkParameterIsNotNull(array, "array");return (CharIterator)new ArrayCharIterator(array); } @NotNull
  public static final ShortIterator iterator(@NotNull short[] array) { Intrinsics.checkParameterIsNotNull(array, "array");return (ShortIterator)new ArrayShortIterator(array); } @NotNull
  public static final IntIterator iterator(@NotNull int[] array) { Intrinsics.checkParameterIsNotNull(array, "array");return (IntIterator)new ArrayIntIterator(array); } @NotNull
  public static final LongIterator iterator(@NotNull long[] array) { Intrinsics.checkParameterIsNotNull(array, "array");return (LongIterator)new ArrayLongIterator(array); } @NotNull
  public static final FloatIterator iterator(@NotNull float[] array) { Intrinsics.checkParameterIsNotNull(array, "array");return (FloatIterator)new ArrayFloatIterator(array); } @NotNull
  public static final DoubleIterator iterator(@NotNull double[] array) { Intrinsics.checkParameterIsNotNull(array, "array");return (DoubleIterator)new ArrayDoubleIterator(array); } @NotNull
  public static final BooleanIterator iterator(@NotNull boolean[] array) { Intrinsics.checkParameterIsNotNull(array, "array");return (BooleanIterator)new ArrayBooleanIterator(array);
  }
}

package kotlin.collections;

import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000z\n\000\n\002\020\022\n\002\030\002\n\002\b\003\n\002\020\025\n\002\030\002\n\002\b\003\n\002\020\026\n\002\030\002\n\002\b\003\n\002\020\027\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\n\n\002\020\b\n\002\b\t\n\002\020\016\n\002\b/\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\r\n\002\020\021\n\002\b\r\032\027\020\000\032\0020\001*\0020\002H\bø\001\000¢\006\004\b\003\020\004\032\027\020\005\032\0020\006*\0020\007H\bø\001\000¢\006\004\b\b\020\t\032\027\020\n\032\0020\013*\0020\fH\bø\001\000¢\006\004\b\r\020\016\032\027\020\017\032\0020\020*\0020\021H\bø\001\000¢\006\004\b\022\020\023\032\025\020\024\032\0020\002*\0020\001H\bø\001\000¢\006\002\020\004\032\025\020\025\032\0020\007*\0020\006H\bø\001\000¢\006\002\020\t\032\025\020\026\032\0020\f*\0020\013H\bø\001\000¢\006\002\020\016\032\025\020\027\032\0020\021*\0020\020H\bø\001\000¢\006\002\020\023\032\037\020\030\032\0020\031*\0020\0022\006\020\032\032\0020\002H\004ø\001\000¢\006\004\b\033\020\034\032\037\020\030\032\0020\031*\0020\0072\006\020\032\032\0020\007H\004ø\001\000¢\006\004\b\035\020\036\032\037\020\030\032\0020\031*\0020\f2\006\020\032\032\0020\fH\004ø\001\000¢\006\004\b\037\020 \032\037\020\030\032\0020\031*\0020\0212\006\020\032\032\0020\021H\004ø\001\000¢\006\004\b!\020\"\032\026\020#\032\0020$*\0020\002H\007ø\001\000¢\006\004\b%\020&\032\026\020#\032\0020$*\0020\007H\007ø\001\000¢\006\004\b'\020(\032\026\020#\032\0020$*\0020\fH\007ø\001\000¢\006\004\b)\020*\032\026\020#\032\0020$*\0020\021H\007ø\001\000¢\006\004\b+\020,\032\026\020-\032\0020.*\0020\002H\007ø\001\000¢\006\004\b/\0200\032\026\020-\032\0020.*\0020\007H\007ø\001\000¢\006\004\b1\0202\032\026\020-\032\0020.*\0020\fH\007ø\001\000¢\006\004\b3\0204\032\026\020-\032\0020.*\0020\021H\007ø\001\000¢\006\004\b5\0206\032=\0207\032\0020\002*\0020\0022\006\0208\032\0020\0022\b\b\002\0209\032\0020$2\b\b\002\020:\032\0020$2\b\b\002\020;\032\0020$H\bø\001\000¢\006\004\b<\020=\032=\0207\032\0020\007*\0020\0072\006\0208\032\0020\0072\b\b\002\0209\032\0020$2\b\b\002\020:\032\0020$2\b\b\002\020;\032\0020$H\bø\001\000¢\006\004\b>\020?\032=\0207\032\0020\f*\0020\f2\006\0208\032\0020\f2\b\b\002\0209\032\0020$2\b\b\002\020:\032\0020$2\b\b\002\020;\032\0020$H\bø\001\000¢\006\004\b@\020A\032=\0207\032\0020\021*\0020\0212\006\0208\032\0020\0212\b\b\002\0209\032\0020$2\b\b\002\020:\032\0020$2\b\b\002\020;\032\0020$H\bø\001\000¢\006\004\bB\020C\032\027\020D\032\0020\002*\0020\002H\bø\001\000¢\006\004\bE\020\004\032\037\020D\032\0020\002*\0020\0022\006\020F\032\0020$H\bø\001\000¢\006\004\bG\020H\032\027\020D\032\0020\007*\0020\007H\bø\001\000¢\006\004\bI\020\t\032\037\020D\032\0020\007*\0020\0072\006\020F\032\0020$H\bø\001\000¢\006\004\bJ\020K\032\027\020D\032\0020\f*\0020\fH\bø\001\000¢\006\004\bL\020\016\032\037\020D\032\0020\f*\0020\f2\006\020F\032\0020$H\bø\001\000¢\006\004\bM\020N\032\027\020D\032\0020\021*\0020\021H\bø\001\000¢\006\004\bO\020\023\032\037\020D\032\0020\021*\0020\0212\006\020F\032\0020$H\bø\001\000¢\006\004\bP\020Q\032'\020R\032\0020\002*\0020\0022\006\020S\032\0020$2\006\020T\032\0020$H\bø\001\000¢\006\004\bU\020V\032'\020R\032\0020\007*\0020\0072\006\020S\032\0020$2\006\020T\032\0020$H\bø\001\000¢\006\004\bW\020X\032'\020R\032\0020\f*\0020\f2\006\020S\032\0020$2\006\020T\032\0020$H\bø\001\000¢\006\004\bY\020Z\032'\020R\032\0020\021*\0020\0212\006\020S\032\0020$2\006\020T\032\0020$H\bø\001\000¢\006\004\b[\020\\\032\027\020]\032\0020^*\0020\002H\bø\001\000¢\006\004\b_\020`\032\036\020]\032\0020^*\0020\0022\006\020]\032\0020aH\007ø\001\000¢\006\004\bb\020c\032\027\020]\032\0020d*\0020\007H\bø\001\000¢\006\004\be\020(\032\036\020]\032\0020d*\0020\0072\006\020]\032\0020aH\007ø\001\000¢\006\004\bf\020g\032\027\020]\032\0020h*\0020\fH\bø\001\000¢\006\004\bi\020j\032\036\020]\032\0020h*\0020\f2\006\020]\032\0020aH\007ø\001\000¢\006\004\bk\020l\032\027\020]\032\0020m*\0020\021H\bø\001\000¢\006\004\bn\020o\032\036\020]\032\0020m*\0020\0212\006\020]\032\0020aH\007ø\001\000¢\006\004\bp\020q\032\027\020r\032\0020\001*\0020\002H\bø\001\000¢\006\004\bs\020\004\032\027\020t\032\0020\006*\0020\007H\bø\001\000¢\006\004\bu\020\t\032\027\020v\032\0020\013*\0020\fH\bø\001\000¢\006\004\bw\020\016\032\027\020x\032\0020\020*\0020\021H\bø\001\000¢\006\004\by\020\023\032\034\020z\032\b\022\004\022\0020^0{*\0020\002H\007ø\001\000¢\006\004\b|\020}\032\034\020z\032\b\022\004\022\0020d0{*\0020\007H\007ø\001\000¢\006\004\b~\020\032\036\020z\032\b\022\004\022\0020h0{*\0020\fH\007ø\001\000¢\006\006\b\001\020\001\032\036\020z\032\b\022\004\022\0020m0{*\0020\021H\007ø\001\000¢\006\006\b\001\020\001\032\026\020\001\032\0020\002*\0020\001H\bø\001\000¢\006\002\020\004\032\026\020\001\032\0020\007*\0020\006H\bø\001\000¢\006\002\020\t\032\026\020\001\032\0020\f*\0020\013H\bø\001\000¢\006\002\020\016\032\026\020\001\032\0020\021*\0020\020H\bø\001\000¢\006\002\020\023\002\004\n\002\b\031¨\006\001"}, d2={"asByteArray", "", "Lkotlin/UByteArray;", "asByteArray-GBYM_sE", "([B)[B", "asIntArray", "", "Lkotlin/UIntArray;", "asIntArray--ajY-9A", "([I)[I", "asLongArray", "", "Lkotlin/ULongArray;", "asLongArray-QwZRm1k", "([J)[J", "asShortArray", "", "Lkotlin/UShortArray;", "asShortArray-rL5Bavg", "([S)[S", "asUByteArray", "asUIntArray", "asULongArray", "asUShortArray", "contentEquals", "", "other", "contentEquals-kdPth3s", "([B[B)Z", "contentEquals-ctEhBpI", "([I[I)Z", "contentEquals-us8wMrg", "([J[J)Z", "contentEquals-mazbYpA", "([S[S)Z", "contentHashCode", "", "contentHashCode-GBYM_sE", "([B)I", "contentHashCode--ajY-9A", "([I)I", "contentHashCode-QwZRm1k", "([J)I", "contentHashCode-rL5Bavg", "([S)I", "contentToString", "", "contentToString-GBYM_sE", "([B)Ljava/lang/String;", "contentToString--ajY-9A", "([I)Ljava/lang/String;", "contentToString-QwZRm1k", "([J)Ljava/lang/String;", "contentToString-rL5Bavg", "([S)Ljava/lang/String;", "copyInto", "destination", "destinationOffset", "startIndex", "endIndex", "copyInto-FUQE5sA", "([B[BIII)[B", "copyInto-sIZ3KeM", "([I[IIII)[I", "copyInto--B0-L2c", "([J[JIII)[J", "copyInto-9-ak10g", "([S[SIII)[S", "copyOf", "copyOf-GBYM_sE", "newSize", "copyOf-PpDY95g", "([BI)[B", "copyOf--ajY-9A", "copyOf-qFRl0hI", "([II)[I", "copyOf-QwZRm1k", "copyOf-r7IrZao", "([JI)[J", "copyOf-rL5Bavg", "copyOf-nggk6HY", "([SI)[S", "copyOfRange", "fromIndex", "toIndex", "copyOfRange-4UcCI2c", "([BII)[B", "copyOfRange-oBK06Vg", "([III)[I", "copyOfRange--nroSd4", "([JII)[J", "copyOfRange-Aa5vz7o", "([SII)[S", "random", "Lkotlin/UByte;", "random-GBYM_sE", "([B)B", "Lkotlin/random/Random;", "random-oSF2wD8", "([BLkotlin/random/Random;)B", "Lkotlin/UInt;", "random--ajY-9A", "random-2D5oskM", "([ILkotlin/random/Random;)I", "Lkotlin/ULong;", "random-QwZRm1k", "([J)J", "random-JzugnMA", "([JLkotlin/random/Random;)J", "Lkotlin/UShort;", "random-rL5Bavg", "([S)S", "random-s5X_as8", "([SLkotlin/random/Random;)S", "toByteArray", "toByteArray-GBYM_sE", "toIntArray", "toIntArray--ajY-9A", "toLongArray", "toLongArray-QwZRm1k", "toShortArray", "toShortArray-rL5Bavg", "toTypedArray", "", "toTypedArray-GBYM_sE", "([B)[Lkotlin/UByte;", "toTypedArray--ajY-9A", "([I)[Lkotlin/UInt;", "toTypedArray-QwZRm1k", "([J)[Lkotlin/ULong;", "toTypedArray-rL5Bavg", "([S)[Lkotlin/UShort;", "toUByteArray", "toUIntArray", "toULongArray", "toUShortArray", "kotlin-stdlib"}, xs="kotlin/collections/UArraysKt")
class UArraysKt___UArraysKt
{
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final int random--ajY-9A(@NotNull int[] $receiver)
  {
    ;
    return UArraysKt.random-2D5oskM($receiver, (Random)Random.Default);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final long random-QwZRm1k(@NotNull long[] $receiver)
  {
    ;
    
    return UArraysKt.random-JzugnMA($receiver, (Random)Random.Default);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final byte random-GBYM_sE(@NotNull byte[] $receiver)
  {
    ;
    
    return UArraysKt.random-oSF2wD8($receiver, (Random)Random.Default);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final short random-rL5Bavg(@NotNull short[] $receiver)
  {
    ;
    
    return UArraysKt.random-s5X_as8($receiver, (Random)Random.Default);
  }
  




  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final int random-2D5oskM(@NotNull int[] $receiver, @NotNull Random random)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(random, "random"); if (UIntArray.isEmpty-impl($receiver))
      throw ((Throwable)new NoSuchElementException("Array is empty."));
    return UIntArray.get-impl($receiver, random.nextInt(UIntArray.getSize-impl($receiver)));
  }
  




  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final long random-JzugnMA(@NotNull long[] $receiver, @NotNull Random random)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(random, "random"); if (ULongArray.isEmpty-impl($receiver))
      throw ((Throwable)new NoSuchElementException("Array is empty."));
    return ULongArray.get-impl($receiver, random.nextInt(ULongArray.getSize-impl($receiver)));
  }
  




  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final byte random-oSF2wD8(@NotNull byte[] $receiver, @NotNull Random random)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(random, "random"); if (UByteArray.isEmpty-impl($receiver))
      throw ((Throwable)new NoSuchElementException("Array is empty."));
    return UByteArray.get-impl($receiver, random.nextInt(UByteArray.getSize-impl($receiver)));
  }
  




  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final short random-s5X_as8(@NotNull short[] $receiver, @NotNull Random random)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(random, "random"); if (UShortArray.isEmpty-impl($receiver))
      throw ((Throwable)new NoSuchElementException("Array is empty."));
    return UShortArray.get-impl($receiver, random.nextInt(UShortArray.getSize-impl($receiver)));
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final byte[] asByteArray-GBYM_sE(@NotNull byte[] $receiver)
  {
    ;
    
    return $receiver;
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final int[] asIntArray--ajY-9A(@NotNull int[] $receiver)
  {
    ;
    
    return $receiver;
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final long[] asLongArray-QwZRm1k(@NotNull long[] $receiver)
  {
    ;
    
    return $receiver;
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final short[] asShortArray-rL5Bavg(@NotNull short[] $receiver)
  {
    ;
    
    return $receiver;
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final byte[] asUByteArray(@NotNull byte[] $receiver)
  {
    ;
    
    return UByteArray.constructor-impl($receiver);
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final int[] asUIntArray(@NotNull int[] $receiver)
  {
    ;
    
    return UIntArray.constructor-impl($receiver);
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final long[] asULongArray(@NotNull long[] $receiver)
  {
    ;
    
    return ULongArray.constructor-impl($receiver);
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final short[] asUShortArray(@NotNull short[] $receiver)
  {
    ;
    
    return UShortArray.constructor-impl($receiver);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final boolean contentEquals-ctEhBpI(@NotNull int[] $receiver, @NotNull int[] other)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(other, "other");int[] arrayOfInt1 = $receiver;int[] arrayOfInt2 = other;return Arrays.equals(arrayOfInt1, arrayOfInt2);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final boolean contentEquals-us8wMrg(@NotNull long[] $receiver, @NotNull long[] other)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(other, "other");long[] arrayOfLong1 = $receiver;long[] arrayOfLong2 = other;return Arrays.equals(arrayOfLong1, arrayOfLong2);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final boolean contentEquals-kdPth3s(@NotNull byte[] $receiver, @NotNull byte[] other)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(other, "other");byte[] arrayOfByte1 = $receiver;byte[] arrayOfByte2 = other;return Arrays.equals(arrayOfByte1, arrayOfByte2);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final boolean contentEquals-mazbYpA(@NotNull short[] $receiver, @NotNull short[] other)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(other, "other");short[] arrayOfShort1 = $receiver;short[] arrayOfShort2 = other;return Arrays.equals(arrayOfShort1, arrayOfShort2);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final int contentHashCode--ajY-9A(@NotNull int[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int[] arrayOfInt = $receiver;return Arrays.hashCode(arrayOfInt);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final int contentHashCode-QwZRm1k(@NotNull long[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");long[] arrayOfLong = $receiver;return Arrays.hashCode(arrayOfLong);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final int contentHashCode-GBYM_sE(@NotNull byte[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");byte[] arrayOfByte = $receiver;return Arrays.hashCode(arrayOfByte);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final int contentHashCode-rL5Bavg(@NotNull short[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");short[] arrayOfShort = $receiver;return Arrays.hashCode(arrayOfShort);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final String contentToString--ajY-9A(@NotNull int[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return CollectionsKt.joinToString$default(UIntArray.box-impl($receiver), (CharSequence)", ", (CharSequence)"[", (CharSequence)"]", 0, null, null, 56, null);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final String contentToString-QwZRm1k(@NotNull long[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return CollectionsKt.joinToString$default(ULongArray.box-impl($receiver), (CharSequence)", ", (CharSequence)"[", (CharSequence)"]", 0, null, null, 56, null);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final String contentToString-GBYM_sE(@NotNull byte[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return CollectionsKt.joinToString$default(UByteArray.box-impl($receiver), (CharSequence)", ", (CharSequence)"[", (CharSequence)"]", 0, null, null, 56, null);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final String contentToString-rL5Bavg(@NotNull short[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return CollectionsKt.joinToString$default(UShortArray.box-impl($receiver), (CharSequence)", ", (CharSequence)"[", (CharSequence)"]", 0, null, null, 56, null);
  }
  







  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final int[] copyInto-sIZ3KeM(@NotNull int[] $receiver, int[] destination, int destinationOffset, int startIndex, int endIndex)
  {
    ;
    






    ArraysKt.copyInto($receiver, destination, destinationOffset, startIndex, endIndex);
    return destination;
  }
  







  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final long[] copyInto--B0-L2c(@NotNull long[] $receiver, long[] destination, int destinationOffset, int startIndex, int endIndex)
  {
    ;
    






    ArraysKt.copyInto($receiver, destination, destinationOffset, startIndex, endIndex);
    return destination;
  }
  







  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final byte[] copyInto-FUQE5sA(@NotNull byte[] $receiver, byte[] destination, int destinationOffset, int startIndex, int endIndex)
  {
    ;
    






    ArraysKt.copyInto($receiver, destination, destinationOffset, startIndex, endIndex);
    return destination;
  }
  







  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final short[] copyInto-9-ak10g(@NotNull short[] $receiver, short[] destination, int destinationOffset, int startIndex, int endIndex)
  {
    ;
    






    ArraysKt.copyInto($receiver, destination, destinationOffset, startIndex, endIndex);
    return destination;
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final int[] copyOf--ajY-9A(@NotNull int[] $receiver)
  {
    ;
    
    int[] arrayOfInt = $receiver; int[] tmp8_5 = Arrays.copyOf(arrayOfInt, arrayOfInt.length);Intrinsics.checkExpressionValueIsNotNull(tmp8_5, "java.util.Arrays.copyOf(this, size)");return UIntArray.constructor-impl(tmp8_5);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final long[] copyOf-QwZRm1k(@NotNull long[] $receiver)
  {
    ;
    
    long[] arrayOfLong = $receiver; long[] tmp8_5 = Arrays.copyOf(arrayOfLong, arrayOfLong.length);Intrinsics.checkExpressionValueIsNotNull(tmp8_5, "java.util.Arrays.copyOf(this, size)");return ULongArray.constructor-impl(tmp8_5);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final byte[] copyOf-GBYM_sE(@NotNull byte[] $receiver)
  {
    ;
    
    byte[] arrayOfByte = $receiver; byte[] tmp8_5 = Arrays.copyOf(arrayOfByte, arrayOfByte.length);Intrinsics.checkExpressionValueIsNotNull(tmp8_5, "java.util.Arrays.copyOf(this, size)");return UByteArray.constructor-impl(tmp8_5);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final short[] copyOf-rL5Bavg(@NotNull short[] $receiver)
  {
    ;
    
    short[] arrayOfShort = $receiver; short[] tmp8_5 = Arrays.copyOf(arrayOfShort, arrayOfShort.length);Intrinsics.checkExpressionValueIsNotNull(tmp8_5, "java.util.Arrays.copyOf(this, size)");return UShortArray.constructor-impl(tmp8_5);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final int[] copyOf-qFRl0hI(@NotNull int[] $receiver, int newSize)
  {
    ;
    

    int[] arrayOfInt = $receiver; int[] tmp7_4 = Arrays.copyOf(arrayOfInt, newSize);Intrinsics.checkExpressionValueIsNotNull(tmp7_4, "java.util.Arrays.copyOf(this, newSize)");return UIntArray.constructor-impl(tmp7_4);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final long[] copyOf-r7IrZao(@NotNull long[] $receiver, int newSize)
  {
    ;
    

    long[] arrayOfLong = $receiver; long[] tmp7_4 = Arrays.copyOf(arrayOfLong, newSize);Intrinsics.checkExpressionValueIsNotNull(tmp7_4, "java.util.Arrays.copyOf(this, newSize)");return ULongArray.constructor-impl(tmp7_4);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final byte[] copyOf-PpDY95g(@NotNull byte[] $receiver, int newSize)
  {
    ;
    

    byte[] arrayOfByte = $receiver; byte[] tmp7_4 = Arrays.copyOf(arrayOfByte, newSize);Intrinsics.checkExpressionValueIsNotNull(tmp7_4, "java.util.Arrays.copyOf(this, newSize)");return UByteArray.constructor-impl(tmp7_4);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final short[] copyOf-nggk6HY(@NotNull short[] $receiver, int newSize)
  {
    ;
    

    short[] arrayOfShort = $receiver; short[] tmp7_4 = Arrays.copyOf(arrayOfShort, newSize);Intrinsics.checkExpressionValueIsNotNull(tmp7_4, "java.util.Arrays.copyOf(this, newSize)");return UShortArray.constructor-impl(tmp7_4);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final int[] copyOfRange-oBK06Vg(@NotNull int[] $receiver, int fromIndex, int toIndex)
  {
    ;
    

    int[] arrayOfInt = $receiver; if (toIndex > arrayOfInt.length) throw ((Throwable)new IndexOutOfBoundsException("toIndex: " + toIndex + ", size: " + arrayOfInt.length)); int[] tmp79_76 = Arrays.copyOfRange(arrayOfInt, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp79_76, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return UIntArray.constructor-impl(tmp79_76);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final long[] copyOfRange--nroSd4(@NotNull long[] $receiver, int fromIndex, int toIndex)
  {
    ;
    

    long[] arrayOfLong = $receiver; if (toIndex > arrayOfLong.length) throw ((Throwable)new IndexOutOfBoundsException("toIndex: " + toIndex + ", size: " + arrayOfLong.length)); long[] tmp79_76 = Arrays.copyOfRange(arrayOfLong, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp79_76, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return ULongArray.constructor-impl(tmp79_76);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final byte[] copyOfRange-4UcCI2c(@NotNull byte[] $receiver, int fromIndex, int toIndex)
  {
    ;
    

    byte[] arrayOfByte = $receiver; if (toIndex > arrayOfByte.length) throw ((Throwable)new IndexOutOfBoundsException("toIndex: " + toIndex + ", size: " + arrayOfByte.length)); byte[] tmp79_76 = Arrays.copyOfRange(arrayOfByte, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp79_76, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return UByteArray.constructor-impl(tmp79_76);
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final short[] copyOfRange-Aa5vz7o(@NotNull short[] $receiver, int fromIndex, int toIndex)
  {
    ;
    

    short[] arrayOfShort = $receiver; if (toIndex > arrayOfShort.length) throw ((Throwable)new IndexOutOfBoundsException("toIndex: " + toIndex + ", size: " + arrayOfShort.length)); short[] tmp79_76 = Arrays.copyOfRange(arrayOfShort, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp79_76, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return UShortArray.constructor-impl(tmp79_76);
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final byte[] toByteArray-GBYM_sE(@NotNull byte[] $receiver)
  {
    ;
    
    byte[] arrayOfByte = $receiver; byte[] tmp8_5 = Arrays.copyOf(arrayOfByte, arrayOfByte.length);Intrinsics.checkExpressionValueIsNotNull(tmp8_5, "java.util.Arrays.copyOf(this, size)");return tmp8_5;
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final int[] toIntArray--ajY-9A(@NotNull int[] $receiver)
  {
    ;
    
    int[] arrayOfInt = $receiver; int[] tmp8_5 = Arrays.copyOf(arrayOfInt, arrayOfInt.length);Intrinsics.checkExpressionValueIsNotNull(tmp8_5, "java.util.Arrays.copyOf(this, size)");return tmp8_5;
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final long[] toLongArray-QwZRm1k(@NotNull long[] $receiver)
  {
    ;
    
    long[] arrayOfLong = $receiver; long[] tmp8_5 = Arrays.copyOf(arrayOfLong, arrayOfLong.length);Intrinsics.checkExpressionValueIsNotNull(tmp8_5, "java.util.Arrays.copyOf(this, size)");return tmp8_5;
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final short[] toShortArray-rL5Bavg(@NotNull short[] $receiver)
  {
    ;
    
    short[] arrayOfShort = $receiver; short[] tmp8_5 = Arrays.copyOf(arrayOfShort, arrayOfShort.length);Intrinsics.checkExpressionValueIsNotNull(tmp8_5, "java.util.Arrays.copyOf(this, size)");return tmp8_5;
  }
  



















  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final byte[] toUByteArray(@NotNull byte[] $receiver)
  {
    ;
    


















    byte[] arrayOfByte = $receiver; byte[] tmp8_5 = Arrays.copyOf(arrayOfByte, arrayOfByte.length);Intrinsics.checkExpressionValueIsNotNull(tmp8_5, "java.util.Arrays.copyOf(this, size)");return UByteArray.constructor-impl(tmp8_5);
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final int[] toUIntArray(@NotNull int[] $receiver)
  {
    ;
    
    int[] arrayOfInt = $receiver; int[] tmp8_5 = Arrays.copyOf(arrayOfInt, arrayOfInt.length);Intrinsics.checkExpressionValueIsNotNull(tmp8_5, "java.util.Arrays.copyOf(this, size)");return UIntArray.constructor-impl(tmp8_5);
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final long[] toULongArray(@NotNull long[] $receiver)
  {
    ;
    
    long[] arrayOfLong = $receiver; long[] tmp8_5 = Arrays.copyOf(arrayOfLong, arrayOfLong.length);Intrinsics.checkExpressionValueIsNotNull(tmp8_5, "java.util.Arrays.copyOf(this, size)");return ULongArray.constructor-impl(tmp8_5);
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @InlineOnly
  private static final short[] toUShortArray(@NotNull short[] $receiver)
  {
    ;
    
    short[] arrayOfShort = $receiver; short[] tmp8_5 = Arrays.copyOf(arrayOfShort, arrayOfShort.length);Intrinsics.checkExpressionValueIsNotNull(tmp8_5, "java.util.Arrays.copyOf(this, size)");return UShortArray.constructor-impl(tmp8_5);
  }
  
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final kotlin.UInt[] toTypedArray--ajY-9A(@NotNull int[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int size$iv = UIntArray.getSize-impl($receiver);
    








































    int $i$f$Array;
    







































    Object[] result$iv = new kotlin.UInt[size$iv];
    int i = 0; for (int j = result$iv.length; i < j;) { int i$iv;
      int k = i$iv;int m = i$iv;Object[] arrayOfObject1 = result$iv;
      int $i$a$1$<init>;
      int index;
      kotlin.UInt localUInt = kotlin.UInt.box-impl(UIntArray.get-impl($receiver, index));arrayOfObject1[m] = localUInt;
      


















































































      i$iv++;
    }
    
    return result$iv;
  }
  
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final kotlin.ULong[] toTypedArray-QwZRm1k(@NotNull long[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int size$iv = ULongArray.getSize-impl($receiver);
    






































    int $i$f$Array;
    





































    Object[] result$iv = new kotlin.ULong[size$iv];
    int i = 0; for (int j = result$iv.length; i < j;) { int i$iv;
      int k = i$iv;int m = i$iv;Object[] arrayOfObject1 = result$iv;
      int $i$a$2$<init>;
      int index;
      kotlin.ULong localULong = kotlin.ULong.box-impl(ULongArray.get-impl($receiver, index));arrayOfObject1[m] = localULong;
      














































































      i$iv++;
    }
    
    return result$iv;
  }
  
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final UByte[] toTypedArray-GBYM_sE(@NotNull byte[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int size$iv = UByteArray.getSize-impl($receiver);
    




































    int $i$f$Array;
    



































    Object[] result$iv = new UByte[size$iv];
    int i = 0; for (int j = result$iv.length; i < j;) { int i$iv;
      int k = i$iv;int m = i$iv;Object[] arrayOfObject1 = result$iv;
      int $i$a$3$<init>;
      int index;
      UByte localUByte = UByte.box-impl(UByteArray.get-impl($receiver, index));arrayOfObject1[m] = localUByte;
      










































































      i$iv++;
    }
    
    return result$iv;
  }
  
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final UShort[] toTypedArray-rL5Bavg(@NotNull short[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int size$iv = UShortArray.getSize-impl($receiver);
    


































    int $i$f$Array;
    

































    Object[] result$iv = new UShort[size$iv];
    int i = 0; for (int j = result$iv.length; i < j;) { int i$iv;
      int k = i$iv;int m = i$iv;Object[] arrayOfObject1 = result$iv;
      int $i$a$4$<init>;
      int index;
      UShort localUShort = UShort.box-impl(UShortArray.get-impl($receiver, index));arrayOfObject1[m] = localUShort;
      






































































      i$iv++;
    }
    
    return result$iv;
  }
  
  public UArraysKt___UArraysKt() {}
}

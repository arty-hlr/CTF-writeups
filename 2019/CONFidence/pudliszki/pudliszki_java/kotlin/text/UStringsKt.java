package kotlin.text;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000,\n\000\n\002\020\016\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\023\032\036\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\007ø\001\000¢\006\004\b\005\020\006\032\036\020\000\032\0020\001*\0020\0072\006\020\003\032\0020\004H\007ø\001\000¢\006\004\b\b\020\t\032\036\020\000\032\0020\001*\0020\n2\006\020\003\032\0020\004H\007ø\001\000¢\006\004\b\013\020\f\032\036\020\000\032\0020\001*\0020\r2\006\020\003\032\0020\004H\007ø\001\000¢\006\004\b\016\020\017\032\024\020\020\032\0020\002*\0020\001H\007ø\001\000¢\006\002\020\021\032\034\020\020\032\0020\002*\0020\0012\006\020\003\032\0020\004H\007ø\001\000¢\006\002\020\022\032\021\020\023\032\004\030\0010\002*\0020\001H\007ø\001\000\032\031\020\023\032\004\030\0010\002*\0020\0012\006\020\003\032\0020\004H\007ø\001\000\032\024\020\024\032\0020\007*\0020\001H\007ø\001\000¢\006\002\020\025\032\034\020\024\032\0020\007*\0020\0012\006\020\003\032\0020\004H\007ø\001\000¢\006\002\020\026\032\021\020\027\032\004\030\0010\007*\0020\001H\007ø\001\000\032\031\020\027\032\004\030\0010\007*\0020\0012\006\020\003\032\0020\004H\007ø\001\000\032\024\020\030\032\0020\n*\0020\001H\007ø\001\000¢\006\002\020\031\032\034\020\030\032\0020\n*\0020\0012\006\020\003\032\0020\004H\007ø\001\000¢\006\002\020\032\032\021\020\033\032\004\030\0010\n*\0020\001H\007ø\001\000\032\031\020\033\032\004\030\0010\n*\0020\0012\006\020\003\032\0020\004H\007ø\001\000\032\024\020\034\032\0020\r*\0020\001H\007ø\001\000¢\006\002\020\035\032\034\020\034\032\0020\r*\0020\0012\006\020\003\032\0020\004H\007ø\001\000¢\006\002\020\036\032\021\020\037\032\004\030\0010\r*\0020\001H\007ø\001\000\032\031\020\037\032\004\030\0010\r*\0020\0012\006\020\003\032\0020\004H\007ø\001\000\002\004\n\002\b\031¨\006 "}, d2={"toString", "", "Lkotlin/UByte;", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUByteOrNull", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toUIntOrNull", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toULongOrNull", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUShortOrNull", "kotlin-stdlib"})
@kotlin.jvm.JvmName(name="UStringsKt")
public final class UStringsKt
{
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final String toString-LxnNnR4(byte $receiver, int radix)
  {
    int i = $receiver;i &= 0xFF; String tmp16_13 = Integer.toString(i, CharsKt.checkRadix(radix));Intrinsics.checkExpressionValueIsNotNull(tmp16_13, "java.lang.Integer.toStri…(this, checkRadix(radix))");return tmp16_13;
  }
  


  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final String toString-olVBNx4(short $receiver, int radix)
  {
    int i = $receiver;i &= 0xFFFF; String tmp15_12 = Integer.toString(i, CharsKt.checkRadix(radix));Intrinsics.checkExpressionValueIsNotNull(tmp15_12, "java.lang.Integer.toStri…(this, checkRadix(radix))");return tmp15_12;
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final String toString-V7xB4Y4(int $receiver, int radix)
  {
    int i = $receiver;long l = i & 0xFFFFFFFF; String tmp17_14 = Long.toString(l, CharsKt.checkRadix(radix));Intrinsics.checkExpressionValueIsNotNull(tmp17_14, "java.lang.Long.toString(this, checkRadix(radix))");return tmp17_14;
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @NotNull
  public static final String toString-JSWoG40(long $receiver, int radix)
  {
    long l = $receiver;return kotlin.UnsignedKt.ulongToString(l, CharsKt.checkRadix(radix));
  }
  
  /* Error */
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final byte toUByte(@NotNull String $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 63
    //   3: invokestatic 66	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: invokestatic 70	kotlin/text/UStringsKt:toUByteOrNull	(Ljava/lang/String;)Lkotlin/UByte;
    //   10: dup
    //   11: ifnull +9 -> 20
    //   14: invokevirtual 76	kotlin/UByte:unbox-impl	()B
    //   17: goto +10 -> 27
    //   20: pop
    //   21: aload_0
    //   22: invokestatic 82	kotlin/text/StringsKt:numberFormatError	(Ljava/lang/String;)Ljava/lang/Void;
    //   25: aconst_null
    //   26: athrow
    //   27: ireturn
    // Line number table:
    //   Java source line #57	-> byte code offset #6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	28	0	$receiver	String
  }
  
  /* Error */
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final byte toUByte(@NotNull String $receiver, int radix)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 63
    //   3: invokestatic 66	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: iload_1
    //   8: invokestatic 87	kotlin/text/UStringsKt:toUByteOrNull	(Ljava/lang/String;I)Lkotlin/UByte;
    //   11: dup
    //   12: ifnull +9 -> 21
    //   15: invokevirtual 76	kotlin/UByte:unbox-impl	()B
    //   18: goto +10 -> 28
    //   21: pop
    //   22: aload_0
    //   23: invokestatic 82	kotlin/text/StringsKt:numberFormatError	(Ljava/lang/String;)Ljava/lang/Void;
    //   26: aconst_null
    //   27: athrow
    //   28: ireturn
    // Line number table:
    //   Java source line #66	-> byte code offset #6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	29	0	$receiver	String
    //   0	29	1	radix	int
  }
  
  /* Error */
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final short toUShort(@NotNull String $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 63
    //   3: invokestatic 66	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: invokestatic 93	kotlin/text/UStringsKt:toUShortOrNull	(Ljava/lang/String;)Lkotlin/UShort;
    //   10: dup
    //   11: ifnull +9 -> 20
    //   14: invokevirtual 98	kotlin/UShort:unbox-impl	()S
    //   17: goto +10 -> 27
    //   20: pop
    //   21: aload_0
    //   22: invokestatic 82	kotlin/text/StringsKt:numberFormatError	(Ljava/lang/String;)Ljava/lang/Void;
    //   25: aconst_null
    //   26: athrow
    //   27: ireturn
    // Line number table:
    //   Java source line #75	-> byte code offset #6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	28	0	$receiver	String
  }
  
  /* Error */
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final short toUShort(@NotNull String $receiver, int radix)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 63
    //   3: invokestatic 66	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: iload_1
    //   8: invokestatic 102	kotlin/text/UStringsKt:toUShortOrNull	(Ljava/lang/String;I)Lkotlin/UShort;
    //   11: dup
    //   12: ifnull +9 -> 21
    //   15: invokevirtual 98	kotlin/UShort:unbox-impl	()S
    //   18: goto +10 -> 28
    //   21: pop
    //   22: aload_0
    //   23: invokestatic 82	kotlin/text/StringsKt:numberFormatError	(Ljava/lang/String;)Ljava/lang/Void;
    //   26: aconst_null
    //   27: athrow
    //   28: ireturn
    // Line number table:
    //   Java source line #84	-> byte code offset #6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	29	0	$receiver	String
    //   0	29	1	radix	int
  }
  
  /* Error */
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final int toUInt(@NotNull String $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 63
    //   3: invokestatic 66	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: invokestatic 108	kotlin/text/UStringsKt:toUIntOrNull	(Ljava/lang/String;)Lkotlin/UInt;
    //   10: dup
    //   11: ifnull +9 -> 20
    //   14: invokevirtual 113	kotlin/UInt:unbox-impl	()I
    //   17: goto +10 -> 27
    //   20: pop
    //   21: aload_0
    //   22: invokestatic 82	kotlin/text/StringsKt:numberFormatError	(Ljava/lang/String;)Ljava/lang/Void;
    //   25: aconst_null
    //   26: athrow
    //   27: ireturn
    // Line number table:
    //   Java source line #92	-> byte code offset #6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	28	0	$receiver	String
  }
  
  /* Error */
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final int toUInt(@NotNull String $receiver, int radix)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 63
    //   3: invokestatic 66	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: iload_1
    //   8: invokestatic 117	kotlin/text/UStringsKt:toUIntOrNull	(Ljava/lang/String;I)Lkotlin/UInt;
    //   11: dup
    //   12: ifnull +9 -> 21
    //   15: invokevirtual 113	kotlin/UInt:unbox-impl	()I
    //   18: goto +10 -> 28
    //   21: pop
    //   22: aload_0
    //   23: invokestatic 82	kotlin/text/StringsKt:numberFormatError	(Ljava/lang/String;)Ljava/lang/Void;
    //   26: aconst_null
    //   27: athrow
    //   28: ireturn
    // Line number table:
    //   Java source line #101	-> byte code offset #6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	29	0	$receiver	String
    //   0	29	1	radix	int
  }
  
  /* Error */
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final long toULong(@NotNull String $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 63
    //   3: invokestatic 66	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: invokestatic 123	kotlin/text/UStringsKt:toULongOrNull	(Ljava/lang/String;)Lkotlin/ULong;
    //   10: dup
    //   11: ifnull +9 -> 20
    //   14: invokevirtual 128	kotlin/ULong:unbox-impl	()J
    //   17: goto +10 -> 27
    //   20: pop
    //   21: aload_0
    //   22: invokestatic 82	kotlin/text/StringsKt:numberFormatError	(Ljava/lang/String;)Ljava/lang/Void;
    //   25: aconst_null
    //   26: athrow
    //   27: lreturn
    // Line number table:
    //   Java source line #109	-> byte code offset #6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	28	0	$receiver	String
  }
  
  /* Error */
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  public static final long toULong(@NotNull String $receiver, int radix)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 63
    //   3: invokestatic 66	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: iload_1
    //   8: invokestatic 132	kotlin/text/UStringsKt:toULongOrNull	(Ljava/lang/String;I)Lkotlin/ULong;
    //   11: dup
    //   12: ifnull +9 -> 21
    //   15: invokevirtual 128	kotlin/ULong:unbox-impl	()J
    //   18: goto +10 -> 28
    //   21: pop
    //   22: aload_0
    //   23: invokestatic 82	kotlin/text/StringsKt:numberFormatError	(Ljava/lang/String;)Ljava/lang/Void;
    //   26: aconst_null
    //   27: athrow
    //   28: lreturn
    // Line number table:
    //   Java source line #118	-> byte code offset #6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	29	0	$receiver	String
    //   0	29	1	radix	int
  }
  
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @org.jetbrains.annotations.Nullable
  public static final kotlin.UByte toUByteOrNull(@NotNull String $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return toUByteOrNull($receiver, 10);
  }
  
  /* Error */
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @org.jetbrains.annotations.Nullable
  public static final kotlin.UByte toUByteOrNull(@NotNull String $receiver, int radix)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 63
    //   3: invokestatic 66	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: iload_1
    //   8: invokestatic 117	kotlin/text/UStringsKt:toUIntOrNull	(Ljava/lang/String;I)Lkotlin/UInt;
    //   11: dup
    //   12: ifnull +9 -> 21
    //   15: invokevirtual 113	kotlin/UInt:unbox-impl	()I
    //   18: goto +6 -> 24
    //   21: pop
    //   22: aconst_null
    //   23: areturn
    //   24: istore_2
    //   25: iload_2
    //   26: istore_3
    //   27: iconst_m1
    //   28: istore 4
    //   30: iload_3
    //   31: istore 5
    //   33: iload 4
    //   35: istore 6
    //   37: iload 6
    //   39: sipush 255
    //   42: iand
    //   43: invokestatic 136	kotlin/UInt:constructor-impl	(I)I
    //   46: istore 6
    //   48: iload 5
    //   50: iload 6
    //   52: invokestatic 140	kotlin/UnsignedKt:uintCompare	(II)I
    //   55: ifle +5 -> 60
    //   58: aconst_null
    //   59: areturn
    //   60: iload_2
    //   61: istore_3
    //   62: iload_3
    //   63: istore 4
    //   65: iload 4
    //   67: i2b
    //   68: invokestatic 143	kotlin/UByte:constructor-impl	(B)B
    //   71: invokestatic 147	kotlin/UByte:box-impl	(B)Lkotlin/UByte;
    //   74: areturn
    // Line number table:
    //   Java source line #141	-> byte code offset #6
    //   Java source line #142	-> byte code offset #25
    //   Java source line #142	-> byte code offset #58
    //   Java source line #143	-> byte code offset #60
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	$receiver	String
    //   0	75	1	radix	int
    //   25	50	2	int	int
  }
  
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @org.jetbrains.annotations.Nullable
  public static final kotlin.UShort toUShortOrNull(@NotNull String $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return toUShortOrNull($receiver, 10);
  }
  
  /* Error */
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @org.jetbrains.annotations.Nullable
  public static final kotlin.UShort toUShortOrNull(@NotNull String $receiver, int radix)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 63
    //   3: invokestatic 66	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: iload_1
    //   8: invokestatic 117	kotlin/text/UStringsKt:toUIntOrNull	(Ljava/lang/String;I)Lkotlin/UInt;
    //   11: dup
    //   12: ifnull +9 -> 21
    //   15: invokevirtual 113	kotlin/UInt:unbox-impl	()I
    //   18: goto +6 -> 24
    //   21: pop
    //   22: aconst_null
    //   23: areturn
    //   24: istore_2
    //   25: iload_2
    //   26: istore_3
    //   27: iconst_m1
    //   28: istore 4
    //   30: iload_3
    //   31: istore 5
    //   33: iload 4
    //   35: istore 6
    //   37: iload 6
    //   39: ldc 41
    //   41: iand
    //   42: invokestatic 136	kotlin/UInt:constructor-impl	(I)I
    //   45: istore 6
    //   47: iload 5
    //   49: iload 6
    //   51: invokestatic 140	kotlin/UnsignedKt:uintCompare	(II)I
    //   54: ifle +5 -> 59
    //   57: aconst_null
    //   58: areturn
    //   59: iload_2
    //   60: istore_3
    //   61: iload_3
    //   62: istore 4
    //   64: iload 4
    //   66: i2s
    //   67: invokestatic 153	kotlin/UShort:constructor-impl	(S)S
    //   70: invokestatic 156	kotlin/UShort:box-impl	(S)Lkotlin/UShort;
    //   73: areturn
    // Line number table:
    //   Java source line #163	-> byte code offset #6
    //   Java source line #164	-> byte code offset #25
    //   Java source line #164	-> byte code offset #57
    //   Java source line #165	-> byte code offset #59
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	$receiver	String
    //   0	74	1	radix	int
    //   25	49	2	int	int
  }
  
  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @org.jetbrains.annotations.Nullable
  public static final UInt toUIntOrNull(@NotNull String $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return toUIntOrNull($receiver, 10);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @org.jetbrains.annotations.Nullable
  public static final UInt toUIntOrNull(@NotNull String $receiver, int radix)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");CharsKt.checkRadix(radix);
    
    int length = $receiver.length();
    if (length == 0) { return null;
    }
    int limit = -1;
    
    int start;
    char firstChar = $receiver.charAt(0);
    if (firstChar < '0') {
      if ((length == 1) || (firstChar != '+')) return null;
      start = 1;
    } else {
      start = 0;
    }
    
    int i = radix;int uradix = UInt.constructor-impl(i);
    int j = limit;int limitBeforeMul = kotlin.UnsignedKt.uintDivide-J1ME1BU(j, uradix);
    int result = 0;
    int k = start; int i; for (int m = length; k < m; i++) {
      int digit = CharsKt.digitOf($receiver.charAt(i), radix);
      
      if (digit < 0) return null;
      int n = result; if (kotlin.UnsignedKt.uintCompare(n, limitBeforeMul) > 0) { return null;
      }
      n = result;result = UInt.constructor-impl(n * uradix);
      
      int beforeAdding = result;
      int i1 = result;int i2 = digit;i2 = UInt.constructor-impl(i2);result = UInt.constructor-impl(i1 + i2);
      i1 = result; if (kotlin.UnsignedKt.uintCompare(i1, beforeAdding) < 0) { return null;
      }
    }
    return UInt.box-impl(result);
  }
  

  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @org.jetbrains.annotations.Nullable
  public static final kotlin.ULong toULongOrNull(@NotNull String $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return toULongOrNull($receiver, 10);
  }
  



  @SinceKotlin(version="1.3")
  @ExperimentalUnsignedTypes
  @org.jetbrains.annotations.Nullable
  public static final kotlin.ULong toULongOrNull(@NotNull String $receiver, int radix)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");CharsKt.checkRadix(radix);
    
    int length = $receiver.length();
    if (length == 0) { return null;
    }
    long limit = -1L;
    
    int start;
    char firstChar = $receiver.charAt(0);
    if (firstChar < '0') {
      if ((length == 1) || (firstChar != '+')) return null;
      start = 1;
    } else {
      start = 0;
    }
    

    int i = radix;int uradix = UInt.constructor-impl(i);
    long l1 = limit;long l2 = l1;int m = uradix;long l3 = kotlin.ULong.constructor-impl(m & 0xFFFFFFFF);long limitBeforeMul = kotlin.UnsignedKt.ulongDivide-eb3DHEI(l2, l3);
    long result = 0L;
    int j = start; int i; for (int k = length; j < k; i++) {
      int digit = CharsKt.digitOf($receiver.charAt(i), radix);
      
      if (digit < 0) return null;
      l3 = result; if (kotlin.UnsignedKt.ulongCompare(l3, limitBeforeMul) > 0) { return null;
      }
      l3 = result;long l4 = l3;int n = uradix;long l5 = kotlin.ULong.constructor-impl(n & 0xFFFFFFFF);result = kotlin.ULong.constructor-impl(l4 * l5);
      
      long beforeAdding = result;
      l4 = result;n = digit;n = UInt.constructor-impl(n);l5 = l4;int i1 = n;long l6 = kotlin.ULong.constructor-impl(i1 & 0xFFFFFFFF);result = kotlin.ULong.constructor-impl(l5 + l6);
      l4 = result; if (kotlin.UnsignedKt.ulongCompare(l4, beforeAdding) < 0) { return null;
      }
    }
    return kotlin.ULong.box-impl(result);
  }
}

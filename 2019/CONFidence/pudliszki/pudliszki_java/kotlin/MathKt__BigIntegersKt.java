package kotlin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;


@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000(\n\000\n\002\030\002\n\002\b\013\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\t\n\002\b\003\032\025\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\001H\f\032\r\020\003\032\0020\001*\0020\001H\n\032\025\020\004\032\0020\001*\0020\0012\006\020\002\032\0020\001H\n\032\r\020\005\032\0020\001*\0020\001H\n\032\r\020\006\032\0020\001*\0020\001H\b\032\025\020\007\032\0020\001*\0020\0012\006\020\002\032\0020\001H\n\032\025\020\b\032\0020\001*\0020\0012\006\020\002\032\0020\001H\f\032\025\020\t\032\0020\001*\0020\0012\006\020\002\032\0020\001H\n\032\025\020\n\032\0020\001*\0020\0012\006\020\002\032\0020\001H\n\032\025\020\013\032\0020\001*\0020\0012\006\020\f\032\0020\rH\f\032\025\020\016\032\0020\001*\0020\0012\006\020\f\032\0020\rH\f\032\025\020\017\032\0020\001*\0020\0012\006\020\002\032\0020\001H\n\032\r\020\020\032\0020\021*\0020\001H\b\032!\020\020\032\0020\021*\0020\0012\b\b\002\020\022\032\0020\r2\b\b\002\020\023\032\0020\024H\b\032\r\020\025\032\0020\001*\0020\rH\b\032\r\020\025\032\0020\001*\0020\026H\b\032\r\020\027\032\0020\001*\0020\001H\n\032\025\020\030\032\0020\001*\0020\0012\006\020\002\032\0020\001H\f¨\006\031"}, d2={"and", "Ljava/math/BigInteger;", "other", "dec", "div", "inc", "inv", "minus", "or", "plus", "rem", "shl", "n", "", "shr", "times", "toBigDecimal", "Ljava/math/BigDecimal;", "scale", "mathContext", "Ljava/math/MathContext;", "toBigInteger", "", "unaryMinus", "xor", "kotlin-stdlib"}, xs="kotlin/MathKt")
class MathKt__BigIntegersKt
  extends MathKt__BigDecimalsKt
{
  @InlineOnly
  private static final BigInteger plus(@NotNull BigInteger $receiver, BigInteger other)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); BigInteger tmp11_8 = $receiver.add(other);Intrinsics.checkExpressionValueIsNotNull(tmp11_8, "this.add(other)");return tmp11_8;
  }
  
  @InlineOnly
  private static final BigInteger minus(@NotNull BigInteger $receiver, BigInteger other) {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); BigInteger tmp11_8 = $receiver.subtract(other);Intrinsics.checkExpressionValueIsNotNull(tmp11_8, "this.subtract(other)");return tmp11_8;
  }
  
  @InlineOnly
  private static final BigInteger times(@NotNull BigInteger $receiver, BigInteger other) {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); BigInteger tmp11_8 = $receiver.multiply(other);Intrinsics.checkExpressionValueIsNotNull(tmp11_8, "this.multiply(other)");return tmp11_8;
  }
  
  @InlineOnly
  private static final BigInteger div(@NotNull BigInteger $receiver, BigInteger other) {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); BigInteger tmp11_8 = $receiver.divide(other);Intrinsics.checkExpressionValueIsNotNull(tmp11_8, "this.divide(other)");return tmp11_8;
  }
  
  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final BigInteger rem(@NotNull BigInteger $receiver, BigInteger other) {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); BigInteger tmp11_8 = $receiver.remainder(other);Intrinsics.checkExpressionValueIsNotNull(tmp11_8, "this.remainder(other)");return tmp11_8;
  }
  
  @InlineOnly
  private static final BigInteger unaryMinus(@NotNull BigInteger $receiver) {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); BigInteger tmp10_7 = $receiver.negate();Intrinsics.checkExpressionValueIsNotNull(tmp10_7, "this.negate()");return tmp10_7;
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigInteger inc(@NotNull BigInteger $receiver) {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); BigInteger tmp13_10 = $receiver.add(BigInteger.ONE);Intrinsics.checkExpressionValueIsNotNull(tmp13_10, "this.add(BigInteger.ONE)");return tmp13_10;
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigInteger dec(@NotNull BigInteger $receiver) {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); BigInteger tmp13_10 = $receiver.subtract(BigInteger.ONE);Intrinsics.checkExpressionValueIsNotNull(tmp13_10, "this.subtract(BigInteger.ONE)");return tmp13_10; }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigInteger inv(@NotNull BigInteger $receiver) { ;
    BigInteger tmp4_1 = $receiver.not();Intrinsics.checkExpressionValueIsNotNull(tmp4_1, "this.not()");return tmp4_1; }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigInteger and(@NotNull BigInteger $receiver, BigInteger other) { ;
    BigInteger tmp5_2 = $receiver.and(other);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "this.and(other)");return tmp5_2; }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigInteger or(@NotNull BigInteger $receiver, BigInteger other) { ;
    BigInteger tmp5_2 = $receiver.or(other);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "this.or(other)");return tmp5_2; }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigInteger xor(@NotNull BigInteger $receiver, BigInteger other) { ;
    BigInteger tmp5_2 = $receiver.xor(other);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "this.xor(other)");return tmp5_2; }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigInteger shl(@NotNull BigInteger $receiver, int n) { ;
    BigInteger tmp5_2 = $receiver.shiftLeft(n);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "this.shiftLeft(n)");return tmp5_2; }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigInteger shr(@NotNull BigInteger $receiver, int n) { ;
    BigInteger tmp5_2 = $receiver.shiftRight(n);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "this.shiftRight(n)");return tmp5_2;
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigInteger toBigInteger(int $receiver)
  {
    ;
    BigInteger tmp5_2 = BigInteger.valueOf($receiver);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "BigInteger.valueOf(this.toLong())");return tmp5_2;
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigInteger toBigInteger(long $receiver) {
    ;
    BigInteger tmp4_1 = BigInteger.valueOf($receiver);Intrinsics.checkExpressionValueIsNotNull(tmp4_1, "BigInteger.valueOf(this)");return tmp4_1;
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigDecimal toBigDecimal(@NotNull BigInteger $receiver) {
    ;
    return new BigDecimal($receiver);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigDecimal toBigDecimal(@NotNull BigInteger $receiver, int scale, MathContext mathContext)
  {
    ;
    

    return new BigDecimal($receiver, scale, mathContext);
  }
  
  public MathKt__BigIntegersKt() {}
}

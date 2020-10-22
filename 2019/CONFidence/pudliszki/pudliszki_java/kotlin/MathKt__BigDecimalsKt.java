package kotlin;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;



@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000$\n\000\n\002\030\002\n\002\b\t\n\002\020\006\n\000\n\002\030\002\n\002\020\007\n\002\020\b\n\002\020\t\n\002\b\002\032\r\020\000\032\0020\001*\0020\001H\n\032\025\020\002\032\0020\001*\0020\0012\006\020\003\032\0020\001H\n\032\r\020\004\032\0020\001*\0020\001H\n\032\025\020\005\032\0020\001*\0020\0012\006\020\003\032\0020\001H\n\032\025\020\006\032\0020\001*\0020\0012\006\020\003\032\0020\001H\n\032\025\020\007\032\0020\001*\0020\0012\006\020\003\032\0020\001H\n\032\025\020\b\032\0020\001*\0020\0012\006\020\003\032\0020\001H\n\032\025\020\t\032\0020\001*\0020\0012\006\020\003\032\0020\001H\n\032\r\020\n\032\0020\001*\0020\013H\b\032\025\020\n\032\0020\001*\0020\0132\006\020\f\032\0020\rH\b\032\r\020\n\032\0020\001*\0020\016H\b\032\025\020\n\032\0020\001*\0020\0162\006\020\f\032\0020\rH\b\032\r\020\n\032\0020\001*\0020\017H\b\032\025\020\n\032\0020\001*\0020\0172\006\020\f\032\0020\rH\b\032\r\020\n\032\0020\001*\0020\020H\b\032\025\020\n\032\0020\001*\0020\0202\006\020\f\032\0020\rH\b\032\r\020\021\032\0020\001*\0020\001H\n¨\006\022"}, d2={"dec", "Ljava/math/BigDecimal;", "div", "other", "inc", "minus", "mod", "plus", "rem", "times", "toBigDecimal", "", "mathContext", "Ljava/math/MathContext;", "", "", "", "unaryMinus", "kotlin-stdlib"}, xs="kotlin/MathKt")
class MathKt__BigDecimalsKt
{
  @InlineOnly
  private static final BigDecimal plus(@NotNull BigDecimal $receiver, BigDecimal other)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); BigDecimal tmp11_8 = $receiver.add(other);Intrinsics.checkExpressionValueIsNotNull(tmp11_8, "this.add(other)");return tmp11_8;
  }
  
  @InlineOnly
  private static final BigDecimal minus(@NotNull BigDecimal $receiver, BigDecimal other) {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); BigDecimal tmp11_8 = $receiver.subtract(other);Intrinsics.checkExpressionValueIsNotNull(tmp11_8, "this.subtract(other)");return tmp11_8;
  }
  
  @InlineOnly
  private static final BigDecimal times(@NotNull BigDecimal $receiver, BigDecimal other) {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); BigDecimal tmp11_8 = $receiver.multiply(other);Intrinsics.checkExpressionValueIsNotNull(tmp11_8, "this.multiply(other)");return tmp11_8;
  }
  

  @InlineOnly
  private static final BigDecimal div(@NotNull BigDecimal $receiver, BigDecimal other)
  {
    ;
    
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); BigDecimal tmp14_11 = $receiver.divide(other, RoundingMode.HALF_EVEN);Intrinsics.checkExpressionValueIsNotNull(tmp14_11, "this.divide(other, RoundingMode.HALF_EVEN)");return tmp14_11; }
  
  /**
   * @deprecated
   */
  @Deprecated(message="Use rem(other) instead", replaceWith=@ReplaceWith(imports={}, expression="rem(other)"), level=DeprecationLevel.ERROR)
  @InlineOnly
  private static final BigDecimal mod(@NotNull BigDecimal $receiver, BigDecimal other) { ; Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); BigDecimal tmp11_8 = $receiver.remainder(other);Intrinsics.checkExpressionValueIsNotNull(tmp11_8, "this.remainder(other)");return tmp11_8;
  }
  
  @InlineOnly
  private static final BigDecimal rem(@NotNull BigDecimal $receiver, BigDecimal other) {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); BigDecimal tmp11_8 = $receiver.remainder(other);Intrinsics.checkExpressionValueIsNotNull(tmp11_8, "this.remainder(other)");return tmp11_8;
  }
  
  @InlineOnly
  private static final BigDecimal unaryMinus(@NotNull BigDecimal $receiver) {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); BigDecimal tmp10_7 = $receiver.negate();Intrinsics.checkExpressionValueIsNotNull(tmp10_7, "this.negate()");return tmp10_7;
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigDecimal inc(@NotNull BigDecimal $receiver) {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); BigDecimal tmp13_10 = $receiver.add(BigDecimal.ONE);Intrinsics.checkExpressionValueIsNotNull(tmp13_10, "this.add(BigDecimal.ONE)");return tmp13_10;
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigDecimal dec(@NotNull BigDecimal $receiver) {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); BigDecimal tmp13_10 = $receiver.subtract(BigDecimal.ONE);Intrinsics.checkExpressionValueIsNotNull(tmp13_10, "this.subtract(BigDecimal.ONE)");return tmp13_10;
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigDecimal toBigDecimal(int $receiver) {
    ;
    BigDecimal tmp5_2 = BigDecimal.valueOf($receiver);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "BigDecimal.valueOf(this.toLong())");return tmp5_2;
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigDecimal toBigDecimal(int $receiver, MathContext mathContext)
  {
    ;
    return new BigDecimal($receiver, mathContext);
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigDecimal toBigDecimal(long $receiver) {
    ;
    BigDecimal tmp4_1 = BigDecimal.valueOf($receiver);Intrinsics.checkExpressionValueIsNotNull(tmp4_1, "BigDecimal.valueOf(this)");return tmp4_1;
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigDecimal toBigDecimal(long $receiver, MathContext mathContext)
  {
    ;
    return new BigDecimal($receiver, mathContext);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigDecimal toBigDecimal(float $receiver)
  {
    ;
    
    return new BigDecimal(String.valueOf($receiver));
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigDecimal toBigDecimal(float $receiver, MathContext mathContext)
  {
    ;
    
    return new BigDecimal(String.valueOf($receiver), mathContext);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigDecimal toBigDecimal(double $receiver)
  {
    ;
    return new BigDecimal(String.valueOf($receiver));
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final BigDecimal toBigDecimal(double $receiver, MathContext mathContext)
  {
    ;
    
    return new BigDecimal(String.valueOf($receiver), mathContext);
  }
  
  public MathKt__BigDecimalsKt() {}
}

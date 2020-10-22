package kotlin.math;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\"\n\000\n\002\020\006\n\002\b\004\n\002\020\007\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\t\n\002\b7\032\021\020\026\032\0020\0012\006\020\027\032\0020\001H\b\032\021\020\026\032\0020\0062\006\020\027\032\0020\006H\b\032\021\020\026\032\0020\t2\006\020\030\032\0020\tH\b\032\021\020\026\032\0020\f2\006\020\030\032\0020\fH\b\032\021\020\031\032\0020\0012\006\020\027\032\0020\001H\b\032\021\020\031\032\0020\0062\006\020\027\032\0020\006H\b\032\020\020\032\032\0020\0012\006\020\027\032\0020\001H\007\032\021\020\032\032\0020\0062\006\020\027\032\0020\006H\b\032\021\020\033\032\0020\0012\006\020\027\032\0020\001H\b\032\021\020\033\032\0020\0062\006\020\027\032\0020\006H\b\032\020\020\034\032\0020\0012\006\020\027\032\0020\001H\007\032\021\020\034\032\0020\0062\006\020\027\032\0020\006H\b\032\021\020\035\032\0020\0012\006\020\027\032\0020\001H\b\032\021\020\035\032\0020\0062\006\020\027\032\0020\006H\b\032\031\020\036\032\0020\0012\006\020\037\032\0020\0012\006\020\027\032\0020\001H\b\032\031\020\036\032\0020\0062\006\020\037\032\0020\0062\006\020\027\032\0020\006H\b\032\020\020 \032\0020\0012\006\020\027\032\0020\001H\007\032\021\020 \032\0020\0062\006\020\027\032\0020\006H\b\032\021\020!\032\0020\0012\006\020\027\032\0020\001H\b\032\021\020!\032\0020\0062\006\020\027\032\0020\006H\b\032\021\020\"\032\0020\0012\006\020\027\032\0020\001H\b\032\021\020\"\032\0020\0062\006\020\027\032\0020\006H\b\032\021\020#\032\0020\0012\006\020\027\032\0020\001H\b\032\021\020#\032\0020\0062\006\020\027\032\0020\006H\b\032\021\020$\032\0020\0012\006\020\027\032\0020\001H\b\032\021\020$\032\0020\0062\006\020\027\032\0020\006H\b\032\021\020%\032\0020\0012\006\020\027\032\0020\001H\b\032\021\020%\032\0020\0062\006\020\027\032\0020\006H\b\032\021\020&\032\0020\0012\006\020\027\032\0020\001H\b\032\021\020&\032\0020\0062\006\020\027\032\0020\006H\b\032\031\020'\032\0020\0012\006\020\027\032\0020\0012\006\020\037\032\0020\001H\b\032\031\020'\032\0020\0062\006\020\027\032\0020\0062\006\020\037\032\0020\006H\b\032\021\020(\032\0020\0012\006\020\027\032\0020\001H\b\032\021\020(\032\0020\0062\006\020\027\032\0020\006H\b\032\021\020)\032\0020\0012\006\020\027\032\0020\001H\b\032\021\020)\032\0020\0062\006\020\027\032\0020\006H\b\032\030\020*\032\0020\0012\006\020\027\032\0020\0012\006\020+\032\0020\001H\007\032\030\020*\032\0020\0062\006\020\027\032\0020\0062\006\020+\032\0020\006H\007\032\021\020,\032\0020\0012\006\020\027\032\0020\001H\b\032\021\020,\032\0020\0062\006\020\027\032\0020\006H\b\032\020\020-\032\0020\0012\006\020\027\032\0020\001H\007\032\020\020-\032\0020\0062\006\020\027\032\0020\006H\007\032\031\020.\032\0020\0012\006\020/\032\0020\0012\006\0200\032\0020\001H\b\032\031\020.\032\0020\0062\006\020/\032\0020\0062\006\0200\032\0020\006H\b\032\031\020.\032\0020\t2\006\020/\032\0020\t2\006\0200\032\0020\tH\b\032\031\020.\032\0020\f2\006\020/\032\0020\f2\006\0200\032\0020\fH\b\032\031\0201\032\0020\0012\006\020/\032\0020\0012\006\0200\032\0020\001H\b\032\031\0201\032\0020\0062\006\020/\032\0020\0062\006\0200\032\0020\006H\b\032\031\0201\032\0020\t2\006\020/\032\0020\t2\006\0200\032\0020\tH\b\032\031\0201\032\0020\f2\006\020/\032\0020\f2\006\0200\032\0020\fH\b\032\021\0202\032\0020\0012\006\020\027\032\0020\001H\b\032\021\0202\032\0020\0062\006\020\027\032\0020\006H\b\032\021\020\017\032\0020\0012\006\020\027\032\0020\001H\b\032\021\020\017\032\0020\0062\006\020\027\032\0020\006H\b\032\021\0203\032\0020\0012\006\020\027\032\0020\001H\b\032\021\0203\032\0020\0062\006\020\027\032\0020\006H\b\032\021\0204\032\0020\0012\006\020\027\032\0020\001H\b\032\021\0204\032\0020\0062\006\020\027\032\0020\006H\b\032\021\0205\032\0020\0012\006\020\027\032\0020\001H\b\032\021\0205\032\0020\0062\006\020\027\032\0020\006H\b\032\021\0206\032\0020\0012\006\020\027\032\0020\001H\b\032\021\0206\032\0020\0062\006\020\027\032\0020\006H\b\032\021\0207\032\0020\0012\006\020\027\032\0020\001H\b\032\021\0207\032\0020\0062\006\020\027\032\0020\006H\b\032\020\0208\032\0020\0012\006\020\027\032\0020\001H\007\032\020\0208\032\0020\0062\006\020\027\032\0020\006H\007\032\025\0209\032\0020\001*\0020\0012\006\020:\032\0020\001H\b\032\025\0209\032\0020\006*\0020\0062\006\020:\032\0020\006H\b\032\r\020;\032\0020\001*\0020\001H\b\032\r\020;\032\0020\006*\0020\006H\b\032\025\020<\032\0020\001*\0020\0012\006\020=\032\0020\001H\b\032\025\020<\032\0020\006*\0020\0062\006\020=\032\0020\006H\b\032\r\020>\032\0020\001*\0020\001H\b\032\r\020>\032\0020\006*\0020\006H\b\032\025\020?\032\0020\001*\0020\0012\006\020\027\032\0020\001H\b\032\025\020?\032\0020\001*\0020\0012\006\020\030\032\0020\tH\b\032\025\020?\032\0020\006*\0020\0062\006\020\027\032\0020\006H\b\032\025\020?\032\0020\006*\0020\0062\006\020\030\032\0020\tH\b\032\f\020@\032\0020\t*\0020\001H\007\032\f\020@\032\0020\t*\0020\006H\007\032\f\020A\032\0020\f*\0020\001H\007\032\f\020A\032\0020\f*\0020\006H\007\032\025\020B\032\0020\001*\0020\0012\006\020\017\032\0020\001H\b\032\025\020B\032\0020\001*\0020\0012\006\020\017\032\0020\tH\b\032\025\020B\032\0020\006*\0020\0062\006\020\017\032\0020\006H\b\032\025\020B\032\0020\006*\0020\0062\006\020\017\032\0020\tH\b\"\037\020\000\032\0020\001*\0020\0018Æ\002X\004¢\006\f\022\004\b\002\020\003\032\004\b\004\020\005\"\037\020\000\032\0020\006*\0020\0068Æ\002X\004¢\006\f\022\004\b\002\020\007\032\004\b\004\020\b\"\037\020\000\032\0020\t*\0020\t8Æ\002X\004¢\006\f\022\004\b\002\020\n\032\004\b\004\020\013\"\037\020\000\032\0020\f*\0020\f8Æ\002X\004¢\006\f\022\004\b\002\020\r\032\004\b\004\020\016\"\037\020\017\032\0020\001*\0020\0018Æ\002X\004¢\006\f\022\004\b\020\020\003\032\004\b\021\020\005\"\037\020\017\032\0020\006*\0020\0068Æ\002X\004¢\006\f\022\004\b\020\020\007\032\004\b\021\020\b\"\036\020\017\032\0020\t*\0020\t8FX\004¢\006\f\022\004\b\020\020\n\032\004\b\021\020\013\"\036\020\017\032\0020\t*\0020\f8FX\004¢\006\f\022\004\b\020\020\r\032\004\b\021\020\022\"\037\020\023\032\0020\001*\0020\0018Æ\002X\004¢\006\f\022\004\b\024\020\003\032\004\b\025\020\005\"\037\020\023\032\0020\006*\0020\0068Æ\002X\004¢\006\f\022\004\b\024\020\007\032\004\b\025\020\b¨\006C"}, d2={"absoluteValue", "", "absoluteValue$annotations", "(D)V", "getAbsoluteValue", "(D)D", "", "(F)V", "(F)F", "", "(I)V", "(I)I", "", "(J)V", "(J)J", "sign", "sign$annotations", "getSign", "(J)I", "ulp", "ulp$annotations", "getUlp", "abs", "x", "n", "acos", "acosh", "asin", "asinh", "atan", "atan2", "y", "atanh", "ceil", "cos", "cosh", "exp", "expm1", "floor", "hypot", "ln", "ln1p", "log", "base", "log10", "log2", "max", "a", "b", "min", "round", "sin", "sinh", "sqrt", "tan", "tanh", "truncate", "IEEErem", "divisor", "nextDown", "nextTowards", "to", "nextUp", "pow", "roundToInt", "roundToLong", "withSign", "kotlin-stdlib"}, xs="kotlin/math/MathKt")
class MathKt__MathJVMKt
  extends MathKt__MathHKt
{
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double sin(double x)
  {
    ;
    return Math.sin(x);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double cos(double x)
  {
    ;
    return Math.cos(x);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double tan(double x)
  {
    ;
    return Math.tan(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double asin(double x)
  {
    ;
    
    return Math.asin(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double acos(double x)
  {
    ;
    
    return Math.acos(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double atan(double x)
  {
    ;
    
    return Math.atan(x);
  }
  






  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double atan2(double y, double x)
  {
    ;
    





    return Math.atan2(y, x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double sinh(double x)
  {
    ;
    

    return Math.sinh(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double cosh(double x)
  {
    ;
    
    return Math.cosh(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double tanh(double x)
  {
    ;
    

    return Math.tanh(x);
  }
  




























  @SinceKotlin(version="1.2")
  public static final double asinh(double x)
  {
    double result = x;
    if (Math.abs(x) >= Constants.taylor_2_bound)
    {
      result -= x * x * x / 6;
    }
    

    return x <= -Constants.taylor_n_bound ? -MathKt.asinh(-x) : x >= Constants.taylor_n_bound ? Math.log(x + Math.sqrt(x * x + 1)) : x > Constants.upper_taylor_n_bound ? Math.log(x * 2 + 1 / (x * 2)) : x > Constants.upper_taylor_2_bound ? Math.log(x) + Constants.LN2 : result;
  }
  




















  @SinceKotlin(version="1.2")
  public static final double acosh(double x)
  {
    double y = Math.sqrt(x - 1);
    
    double result = y;
    if (y >= Constants.taylor_2_bound)
    {
      result -= y * y * y / 12;
    }
    


    return x - 1 >= Constants.taylor_n_bound ? Math.log(x + Math.sqrt(x * x - 1)) : x > Constants.upper_taylor_2_bound ? Math.log(x) + Constants.LN2 : x < 1 ? DoubleCompanionObject.INSTANCE.getNaN() : Math.sqrt(2.0D) * result;
  }
  









  @SinceKotlin(version="1.2")
  public static final double atanh(double x)
  {
    if (Math.abs(x) < Constants.taylor_n_bound) {
      double result = x;
      if (Math.abs(x) > Constants.taylor_2_bound) {
        result += x * x * x / 3;
      }
      return result;
    }
    return Math.log((1 + x) / (1 - x)) / 2;
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double hypot(double x, double y)
  {
    ;
    

    return Math.hypot(x, y);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double sqrt(double x)
  {
    ;
    
    return Math.sqrt(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double exp(double x)
  {
    ;
    

    return Math.exp(x);
  }
  




  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double expm1(double x)
  {
    ;
    



    return Math.expm1(x);
  }
  










  @SinceKotlin(version="1.2")
  public static final double log(double x, double base)
  {
    if ((base <= 0.0D) || (base == 1.0D)) return DoubleCompanionObject.INSTANCE.getNaN();
    return Math.log(x) / Math.log(base);
  }
  



  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double ln(double x)
  {
    ;
    


    return Math.log(x);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double log10(double x)
  {
    ;
    return Math.log10(x);
  }
  


  @SinceKotlin(version="1.2")
  public static final double log2(double x)
  {
    return Math.log(x) / Constants.LN2;
  }
  





  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double ln1p(double x)
  {
    ;
    




    return Math.log1p(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double ceil(double x)
  {
    ;
    

    return Math.ceil(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double floor(double x)
  {
    ;
    

    return Math.floor(x);
  }
  






  @SinceKotlin(version="1.2")
  public static final double truncate(double x)
  {
    double d = x; if (!Double.isNaN(d)) { d = x;
    }
    
    return x > 0 ? Math.floor(x) : Double.isInfinite(d) ? x : Math.ceil(x);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double round(double x)
  {
    ;
    
    return Math.rint(x);
  }
  



  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double abs(double x)
  {
    ;
    

    return Math.abs(x);
  }
  



  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double sign(double x)
  {
    ;
    

    return Math.signum(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double min(double a, double b)
  {
    ;
    
    return Math.min(a, b);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double max(double a, double b)
  {
    ;
    return Math.max(a, b);
  }
  





  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double pow(double $receiver, double x)
  {
    ;
    




    return Math.pow($receiver, x);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double pow(double $receiver, int n)
  {
    ;
    return Math.pow($receiver, n);
  }
  




  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double IEEErem(double $receiver, double divisor)
  {
    ;
    



    return Math.IEEEremainder($receiver, divisor);
  }
  



  private static final double getAbsoluteValue(double $receiver)
  {
    ;
    


    return Math.abs($receiver);
  }
  




  private static final double getSign(double $receiver)
  {
    ;
    


    return Math.signum($receiver);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double withSign(double $receiver, double sign)
  {
    ;
    return Math.copySign($receiver, sign);
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double withSign(double $receiver, int sign) {
    ;
    return Math.copySign($receiver, sign);
  }
  




  private static final double getUlp(double $receiver)
  {
    ;
    



    return Math.ulp($receiver);
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double nextUp(double $receiver) {
    ;
    return Math.nextUp($receiver);
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double nextDown(double $receiver) {
    ;
    return Math.nextAfter($receiver, DoubleCompanionObject.INSTANCE.getNEGATIVE_INFINITY());
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final double nextTowards(double $receiver, double to)
  {
    ;
    

    return Math.nextAfter($receiver, to);
  }
  








  @SinceKotlin(version="1.2")
  public static final int roundToInt(double $receiver)
  {
    double d = $receiver; if (Double.isNaN(d)) { throw ((Throwable)new IllegalArgumentException("Cannot round NaN value."));
    }
    

    return $receiver < Integer.MIN_VALUE ? Integer.MIN_VALUE : $receiver > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)Math.round($receiver);
  }
  








  @SinceKotlin(version="1.2")
  public static final long roundToLong(double $receiver)
  {
    double d = $receiver; if (Double.isNaN(d)) throw ((Throwable)new IllegalArgumentException("Cannot round NaN value.")); return Math.round($receiver);
  }
  




  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float sin(float x)
  {
    ;
    


    return (float)Math.sin(x);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float cos(float x)
  {
    ;
    return (float)Math.cos(x);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float tan(float x)
  {
    ;
    return (float)Math.tan(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float asin(float x)
  {
    ;
    
    return (float)Math.asin(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float acos(float x)
  {
    ;
    
    return (float)Math.acos(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float atan(float x)
  {
    ;
    
    return (float)Math.atan(x);
  }
  






  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float atan2(float y, float x)
  {
    ;
    





    return (float)Math.atan2(y, x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float sinh(float x)
  {
    ;
    

    return (float)Math.sinh(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float cosh(float x)
  {
    ;
    
    return (float)Math.cosh(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float tanh(float x)
  {
    ;
    

    return (float)Math.tanh(x);
  }
  



  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float asinh(float x)
  {
    ;
    


    return (float)MathKt.asinh(x);
  }
  



  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float acosh(float x)
  {
    ;
    


    return (float)MathKt.acosh(x);
  }
  




  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float atanh(float x)
  {
    ;
    


    return (float)MathKt.atanh(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float hypot(float x, float y)
  {
    ;
    
    return (float)Math.hypot(x, y);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float sqrt(float x)
  {
    ;
    
    return (float)Math.sqrt(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float exp(float x)
  {
    ;
    

    return (float)Math.exp(x);
  }
  




  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float expm1(float x)
  {
    ;
    



    return (float)Math.expm1(x);
  }
  










  @SinceKotlin(version="1.2")
  public static final float log(float x, float base)
  {
    if ((base <= 0.0F) || (base == 1.0F)) return FloatCompanionObject.INSTANCE.getNaN();
    return (float)(Math.log(x) / Math.log(base));
  }
  



  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float ln(float x)
  {
    ;
    


    return (float)Math.log(x);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float log10(float x)
  {
    ;
    return (float)Math.log10(x);
  }
  


  @SinceKotlin(version="1.2")
  public static final float log2(float x)
  {
    return (float)(Math.log(x) / Constants.LN2);
  }
  





  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float ln1p(float x)
  {
    ;
    




    return (float)Math.log1p(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float ceil(float x)
  {
    ;
    

    return (float)Math.ceil(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float floor(float x)
  {
    ;
    

    return (float)Math.floor(x);
  }
  






  @SinceKotlin(version="1.2")
  public static final float truncate(float x)
  {
    float f = x; if (!Float.isNaN(f)) { f = x;
    }
    
    return x > 0 ? (float)Math.floor(x) : Float.isInfinite(f) ? x : (float)Math.ceil(x);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float round(float x)
  {
    ;
    
    return (float)Math.rint(x);
  }
  



  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float abs(float x)
  {
    ;
    

    return Math.abs(x);
  }
  



  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float sign(float x)
  {
    ;
    

    return Math.signum(x);
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float min(float a, float b)
  {
    ;
    
    return Math.min(a, b);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float max(float a, float b)
  {
    ;
    return Math.max(a, b);
  }
  





  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float pow(float $receiver, float x)
  {
    ;
    




    return (float)Math.pow($receiver, x);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float pow(float $receiver, int n)
  {
    ;
    return (float)Math.pow($receiver, n);
  }
  




  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float IEEErem(float $receiver, float divisor)
  {
    ;
    



    return (float)Math.IEEEremainder($receiver, divisor);
  }
  



  private static final float getAbsoluteValue(float $receiver)
  {
    ;
    


    return Math.abs($receiver);
  }
  




  private static final float getSign(float $receiver)
  {
    ;
    


    return Math.signum($receiver);
  }
  

  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float withSign(float $receiver, float sign)
  {
    ;
    return Math.copySign($receiver, sign);
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float withSign(float $receiver, int sign) {
    ;
    return Math.copySign($receiver, sign);
  }
  




  private static final float getUlp(float $receiver)
  {
    ;
    



    return Math.ulp($receiver);
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float nextUp(float $receiver) {
    ;
    return Math.nextUp($receiver);
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float nextDown(float $receiver) {
    ;
    return Math.nextAfter($receiver, DoubleCompanionObject.INSTANCE.getNEGATIVE_INFINITY());
  }
  


  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final float nextTowards(float $receiver, float to)
  {
    ;
    

    return Math.nextAfter($receiver, to);
  }
  








  @SinceKotlin(version="1.2")
  public static final int roundToInt(float $receiver)
  {
    float f = $receiver; if (Float.isNaN(f)) throw ((Throwable)new IllegalArgumentException("Cannot round NaN value.")); return Math.round($receiver);
  }
  







  @SinceKotlin(version="1.2")
  public static final long roundToLong(float $receiver)
  {
    return MathKt.roundToLong($receiver);
  }
  





  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final int abs(int n)
  {
    ;
    




    return Math.abs(n);
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final int min(int a, int b) {
    ;
    return Math.min(a, b);
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final int max(int a, int b) {
    ;
    return Math.max(a, b);
  }
  



  private static final int getAbsoluteValue(int $receiver)
  {
    ;
    


    return Math.abs($receiver);
  }
  








  public static final int getSign(int $receiver)
  {
    return $receiver > 0 ? 1 : $receiver < 0 ? -1 : 0;
  }
  



  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final long abs(long n)
  {
    ;
    


    return Math.abs(n);
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final long min(long a, long b) {
    ;
    return Math.min(a, b);
  }
  
  @SinceKotlin(version="1.2")
  @InlineOnly
  private static final long max(long a, long b) {
    ;
    return Math.max(a, b);
  }
  



  private static final long getAbsoluteValue(long $receiver)
  {
    ;
    


    return Math.abs($receiver);
  }
  








  public static final int getSign(long $receiver)
  {
    return $receiver > 0L ? 1 : $receiver < 0L ? -1 : 0;
  }
  
  public MathKt__MathJVMKt() {}
}

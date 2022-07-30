package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.DeprecationLevel;
import kotlin.Function;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;

@Deprecated
@kotlin.Deprecated(message="This class is no longer supported, do not use it.", level=DeprecationLevel.ERROR)
public abstract class FunctionImpl implements Function, Serializable, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function4, kotlin.jvm.functions.Function5, kotlin.jvm.functions.Function6, kotlin.jvm.functions.Function7, Function8, Function9, kotlin.jvm.functions.Function10, Function11, Function12, Function13, Function14, kotlin.jvm.functions.Function15, kotlin.jvm.functions.Function16, kotlin.jvm.functions.Function17, kotlin.jvm.functions.Function18, Function19, Function20, Function21, Function22
{
  public FunctionImpl() {}
  
  public abstract int getArity();
  
  public Object invokeVararg(Object... p)
  {
    throw new UnsupportedOperationException();
  }
  
  private void checkArity(int expected) {
    if (getArity() != expected) {
      throwWrongArity(expected);
    }
  }
  
  private void throwWrongArity(int expected) {
    throw new IllegalStateException("Wrong function arity, expected: " + expected + ", actual: " + getArity());
  }
  
  public Object invoke()
  {
    checkArity(0);
    return invokeVararg(new Object[0]);
  }
  
  public Object invoke(Object p1)
  {
    checkArity(1);
    return invokeVararg(new Object[] { p1 });
  }
  
  public Object invoke(Object p1, Object p2)
  {
    checkArity(2);
    return invokeVararg(new Object[] { p1, p2 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3)
  {
    checkArity(3);
    return invokeVararg(new Object[] { p1, p2, p3 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4)
  {
    checkArity(4);
    return invokeVararg(new Object[] { p1, p2, p3, p4 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5)
  {
    checkArity(5);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6)
  {
    checkArity(6);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5, p6 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7)
  {
    checkArity(7);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5, p6, p7 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8)
  {
    checkArity(8);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5, p6, p7, p8 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9)
  {
    checkArity(9);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5, p6, p7, p8, p9 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10)
  {
    checkArity(10);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11)
  {
    checkArity(11);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12)
  {
    checkArity(12);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13)
  {
    checkArity(13);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14)
  {
    checkArity(14);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15)
  {
    checkArity(15);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16)
  {
    checkArity(16);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, Object p17)
  {
    checkArity(17);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, Object p17, Object p18)
  {
    checkArity(18);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, Object p17, Object p18, Object p19)
  {
    checkArity(19);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, Object p17, Object p18, Object p19, Object p20)
  {
    checkArity(20);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, Object p17, Object p18, Object p19, Object p20, Object p21)
  {
    checkArity(21);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21 });
  }
  
  public Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, Object p17, Object p18, Object p19, Object p20, Object p21, Object p22)
  {
    checkArity(22);
    return invokeVararg(new Object[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22 });
  }
}

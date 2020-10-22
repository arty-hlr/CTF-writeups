package kotlin.math;

import kotlin.Metadata;
import kotlin.jvm.JvmField;





@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\006\n\002\b\006\bÂ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\020\020\003\032\0020\0048\000X\004¢\006\002\n\000R\020\020\005\032\0020\0048\000X\004¢\006\002\n\000R\020\020\006\032\0020\0048\000X\004¢\006\002\n\000R\020\020\007\032\0020\0048\000X\004¢\006\002\n\000R\020\020\b\032\0020\0048\000X\004¢\006\002\n\000R\020\020\t\032\0020\0048\000X\004¢\006\002\n\000¨\006\n"}, d2={"Lkotlin/math/Constants;", "", "()V", "LN2", "", "epsilon", "taylor_2_bound", "taylor_n_bound", "upper_taylor_2_bound", "upper_taylor_n_bound", "kotlin-stdlib"})
final class Constants
{
  @JvmField
  public static final double LN2;
  
  private Constants() {}
  
  static
  {
    Constants localConstants = new Constants();INSTANCE = localConstants;
    


    double d = 2.0D;LN2 = Math.log(d); }
  
  @JvmField
  public static final double epsilon = Math.ulp(1.0D);
  @JvmField
  public static final double taylor_2_bound = Math.sqrt(epsilon);
  @JvmField
  public static final double taylor_n_bound = Math.sqrt(taylor_2_bound);
  @JvmField
  public static final double upper_taylor_2_bound = 1 / taylor_2_bound;
  @JvmField
  public static final double upper_taylor_n_bound = 1 / taylor_n_bound;
  public static final Constants INSTANCE;
}

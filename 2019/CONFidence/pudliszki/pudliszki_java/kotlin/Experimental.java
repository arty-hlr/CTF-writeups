package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;

@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\020\033\n\000\n\002\030\002\n\002\b\003\b\002\030\0002\0020\001:\001\005B\n\022\b\b\002\020\002\032\0020\003R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\004ø\001\000\002\007\n\005\b20\001¨\006\006"}, d2={"Lkotlin/Experimental;", "", "level", "Lkotlin/Experimental$Level;", "()Lkotlin/Experimental$Level;", "Level", "kotlin-stdlib"})
@SinceKotlin(version="1.2")
public @interface Experimental
{
  Level level() default Level.ERROR;
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\f\n\002\030\002\n\002\020\020\n\002\b\004\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\005"}, d2={"Lkotlin/Experimental$Level;", "", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "kotlin-stdlib"})
  public static enum Level
  {
    static
    {
      Level[] tmp5_1 = new Level[2];
      void tmp17_14 = new Level("WARNING", 0);
      WARNING = tmp17_14;
      tmp5_1[0] = tmp17_14;
      Level[] tmp22_5 = tmp5_1;
      void tmp34_31 = new Level("ERROR", 1);
      ERROR = tmp34_31;
      tmp22_5[1] = tmp34_31;
    }
    
    private Level() {}
  }
}

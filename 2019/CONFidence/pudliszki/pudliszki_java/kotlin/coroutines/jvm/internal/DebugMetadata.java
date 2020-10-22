package kotlin.coroutines.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;

@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000$\n\002\030\002\n\002\020\033\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\025\n\000\n\002\020\021\n\002\b\021\b\002\030\0002\0020\001B\\\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007\022\016\b\002\020\b\032\b\022\004\022\0020\0050\t\022\016\b\002\020\n\032\b\022\004\022\0020\0050\t\022\b\b\002\020\013\032\0020\007\022\b\b\002\020\f\032\0020\005\022\b\b\002\020\r\032\0020\005R\021\020\r\032\0020\0058\007¢\006\006\032\004\b\016\020\017R\021\020\013\032\0020\0078\007¢\006\006\032\004\b\020\020\021R\021\020\006\032\0020\0078\007¢\006\006\032\004\b\022\020\021R\027\020\b\032\b\022\004\022\0020\0050\t8\007¢\006\006\032\004\b\023\020\024R\021\020\f\032\0020\0058\007¢\006\006\032\004\b\025\020\017R\021\020\004\032\0020\0058\007¢\006\006\032\004\b\026\020\017R\027\020\n\032\b\022\004\022\0020\0050\t8\007¢\006\006\032\004\b\027\020\024R\021\020\002\032\0020\0038\007¢\006\006\032\004\b\030\020\031¨\006\032"}, d2={"Lkotlin/coroutines/jvm/internal/DebugMetadata;", "", "version", "", "sourceFile", "", "lineNumbers", "", "localNames", "", "spilled", "indexToLabel", "methodName", "className", "c", "()Ljava/lang/String;", "i", "()[I", "l", "n", "()[Ljava/lang/String;", "m", "f", "s", "v", "()I", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public @interface DebugMetadata
{
  @JvmName(name="v")
  int v() default 1;
  
  @JvmName(name="f")
  String f() default "";
  
  @JvmName(name="l")
  int[] l() default {};
  
  @JvmName(name="n")
  String[] n() default {};
  
  @JvmName(name="s")
  String[] s() default {};
  
  @JvmName(name="i")
  int[] i() default {};
  
  @JvmName(name="m")
  String m() default "";
  
  @JvmName(name="c")
  String c() default "";
}

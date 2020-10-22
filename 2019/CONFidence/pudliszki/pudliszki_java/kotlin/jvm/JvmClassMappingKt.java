package kotlin.jvm;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;









@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000,\n\000\n\002\030\002\n\000\n\002\020\033\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\000\n\002\b\013\n\002\020\013\n\002\020\021\n\002\b\002\032\037\020\030\032\0020\031\"\n\b\000\020\002\030\001*\0020\r*\006\022\002\b\0030\032¢\006\002\020\033\"'\020\000\032\n\022\006\b\001\022\002H\0020\001\"\b\b\000\020\002*\0020\003*\002H\0028F¢\006\006\032\004\b\004\020\005\"-\020\006\032\b\022\004\022\002H\0020\007\"\004\b\000\020\002*\b\022\004\022\002H\0020\0018G¢\006\f\022\004\b\b\020\t\032\004\b\n\020\013\"&\020\f\032\b\022\004\022\002H\0020\007\"\b\b\000\020\002*\0020\r*\002H\0028Æ\002¢\006\006\032\004\b\n\020\016\";\020\f\032\016\022\n\022\b\022\004\022\002H\0020\0010\007\"\b\b\000\020\002*\0020\r*\b\022\004\022\002H\0020\0018Ç\002X\004¢\006\f\022\004\b\017\020\t\032\004\b\020\020\013\"+\020\021\032\b\022\004\022\002H\0020\007\"\b\b\000\020\002*\0020\r*\b\022\004\022\002H\0020\0018F¢\006\006\032\004\b\022\020\013\"-\020\023\032\n\022\004\022\002H\002\030\0010\007\"\b\b\000\020\002*\0020\r*\b\022\004\022\002H\0020\0018F¢\006\006\032\004\b\024\020\013\"+\020\025\032\b\022\004\022\002H\0020\001\"\b\b\000\020\002*\0020\r*\b\022\004\022\002H\0020\0078G¢\006\006\032\004\b\026\020\027¨\006\034"}, d2={"annotationClass", "Lkotlin/reflect/KClass;", "T", "", "getAnnotationClass", "(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;", "java", "Ljava/lang/Class;", "java$annotations", "(Lkotlin/reflect/KClass;)V", "getJavaClass", "(Lkotlin/reflect/KClass;)Ljava/lang/Class;", "javaClass", "", "(Ljava/lang/Object;)Ljava/lang/Class;", "javaClass$annotations", "getRuntimeClassOfKClassInstance", "javaObjectType", "getJavaObjectType", "javaPrimitiveType", "getJavaPrimitiveType", "kotlin", "getKotlinClass", "(Ljava/lang/Class;)Lkotlin/reflect/KClass;", "isArrayOf", "", "", "([Ljava/lang/Object;)Z", "kotlin-stdlib"})
@JvmName(name="JvmClassMappingKt")
public final class JvmClassMappingKt
{
  @JvmName(name="getJavaClass")
  @NotNull
  public static final <T> Class<T> getJavaClass(@NotNull KClass<T> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); Class tmp15_10 = ((ClassBasedDeclarationContainer)$receiver).getJClass(); if (tmp15_10 == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>"); return tmp15_10;
  }
  
  /* Error */
  @org.jetbrains.annotations.Nullable
  public static final <T> Class<T> getJavaPrimitiveType(@NotNull KClass<T> $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 14
    //   3: invokestatic 20	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: checkcast 22	kotlin/jvm/internal/ClassBasedDeclarationContainer
    //   10: invokeinterface 26 1 0
    //   15: astore_1
    //   16: aload_1
    //   17: invokevirtual 44	java/lang/Class:isPrimitive	()Z
    //   20: ifeq +19 -> 39
    //   23: aload_1
    //   24: dup
    //   25: ifnonnull +13 -> 38
    //   28: new 28	kotlin/TypeCastException
    //   31: dup
    //   32: ldc 30
    //   34: invokespecial 34	kotlin/TypeCastException:<init>	(Ljava/lang/String;)V
    //   37: athrow
    //   38: areturn
    //   39: aload_1
    //   40: invokevirtual 48	java/lang/Class:getName	()Ljava/lang/String;
    //   43: dup
    //   44: ifnonnull +7 -> 51
    //   47: pop
    //   48: goto +254 -> 302
    //   51: astore_2
    //   52: aload_2
    //   53: invokevirtual 54	java/lang/String:hashCode	()I
    //   56: lookupswitch	default:+246->302, -2056817302:+180->236, -527879800:+84->140, -515992664:+144->200, 155276373:+108->164, 344809556:+156->212, 398507100:+168->224, 398795216:+120->176, 399092968:+96->152, 761287205:+132->188
    //   140: aload_2
    //   141: ldc 56
    //   143: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   146: ifeq +156 -> 302
    //   149: goto +129 -> 278
    //   152: aload_2
    //   153: ldc 62
    //   155: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   158: ifeq +144 -> 302
    //   161: goto +135 -> 296
    //   164: aload_2
    //   165: ldc 64
    //   167: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   170: ifeq +132 -> 302
    //   173: goto +81 -> 254
    //   176: aload_2
    //   177: ldc 66
    //   179: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   182: ifeq +120 -> 302
    //   185: goto +99 -> 284
    //   188: aload_2
    //   189: ldc 68
    //   191: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   194: ifeq +108 -> 302
    //   197: goto +93 -> 290
    //   200: aload_2
    //   201: ldc 70
    //   203: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   206: ifeq +96 -> 302
    //   209: goto +57 -> 266
    //   212: aload_2
    //   213: ldc 72
    //   215: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   218: ifeq +84 -> 302
    //   221: goto +27 -> 248
    //   224: aload_2
    //   225: ldc 74
    //   227: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   230: ifeq +72 -> 302
    //   233: goto +27 -> 260
    //   236: aload_2
    //   237: ldc 76
    //   239: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   242: ifeq +60 -> 302
    //   245: goto +27 -> 272
    //   248: getstatic 82	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   251: goto +52 -> 303
    //   254: getstatic 85	java/lang/Character:TYPE	Ljava/lang/Class;
    //   257: goto +46 -> 303
    //   260: getstatic 88	java/lang/Byte:TYPE	Ljava/lang/Class;
    //   263: goto +40 -> 303
    //   266: getstatic 91	java/lang/Short:TYPE	Ljava/lang/Class;
    //   269: goto +34 -> 303
    //   272: getstatic 94	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   275: goto +28 -> 303
    //   278: getstatic 97	java/lang/Float:TYPE	Ljava/lang/Class;
    //   281: goto +22 -> 303
    //   284: getstatic 100	java/lang/Long:TYPE	Ljava/lang/Class;
    //   287: goto +16 -> 303
    //   290: getstatic 103	java/lang/Double:TYPE	Ljava/lang/Class;
    //   293: goto +10 -> 303
    //   296: getstatic 106	java/lang/Void:TYPE	Ljava/lang/Class;
    //   299: goto +4 -> 303
    //   302: aconst_null
    //   303: areturn
    // Line number table:
    //   Java source line #35	-> byte code offset #6
    //   Java source line #36	-> byte code offset #16
    //   Java source line #38	-> byte code offset #39
    //   Java source line #39	-> byte code offset #248
    //   Java source line #40	-> byte code offset #254
    //   Java source line #41	-> byte code offset #260
    //   Java source line #42	-> byte code offset #266
    //   Java source line #43	-> byte code offset #272
    //   Java source line #44	-> byte code offset #278
    //   Java source line #45	-> byte code offset #284
    //   Java source line #46	-> byte code offset #290
    //   Java source line #47	-> byte code offset #296
    //   Java source line #48	-> byte code offset #302
    //   Java source line #38	-> byte code offset #303
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	304	0	$receiver	KClass
    //   16	288	1	thisJClass	Class
  }
  
  /* Error */
  @NotNull
  public static final <T> Class<T> getJavaObjectType(@NotNull KClass<T> $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 14
    //   3: invokestatic 20	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: checkcast 22	kotlin/jvm/internal/ClassBasedDeclarationContainer
    //   10: invokeinterface 26 1 0
    //   15: astore_1
    //   16: aload_1
    //   17: invokevirtual 44	java/lang/Class:isPrimitive	()Z
    //   20: ifne +19 -> 39
    //   23: aload_1
    //   24: dup
    //   25: ifnonnull +13 -> 38
    //   28: new 28	kotlin/TypeCastException
    //   31: dup
    //   32: ldc 30
    //   34: invokespecial 34	kotlin/TypeCastException:<init>	(Ljava/lang/String;)V
    //   37: athrow
    //   38: areturn
    //   39: aload_1
    //   40: invokevirtual 48	java/lang/Class:getName	()Ljava/lang/String;
    //   43: dup
    //   44: ifnonnull +7 -> 51
    //   47: pop
    //   48: goto +245 -> 293
    //   51: astore_2
    //   52: aload_2
    //   53: invokevirtual 54	java/lang/String:hashCode	()I
    //   56: lookupswitch	default:+237->293, -1325958191:+120->176, 104431:+168->224, 3039496:+108->164, 3052374:+132->188, 3327612:+180->236, 3625364:+96->152, 64711720:+84->140, 97526364:+156->212, 109413500:+144->200
    //   140: aload_2
    //   141: ldc 112
    //   143: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   146: ifeq +147 -> 293
    //   149: goto +99 -> 248
    //   152: aload_2
    //   153: ldc 114
    //   155: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   158: ifeq +135 -> 293
    //   161: goto +127 -> 288
    //   164: aload_2
    //   165: ldc 116
    //   167: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   170: ifeq +123 -> 293
    //   173: goto +85 -> 258
    //   176: aload_2
    //   177: ldc 118
    //   179: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   182: ifeq +111 -> 293
    //   185: goto +98 -> 283
    //   188: aload_2
    //   189: ldc 120
    //   191: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   194: ifeq +99 -> 293
    //   197: goto +56 -> 253
    //   200: aload_2
    //   201: ldc 122
    //   203: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   206: ifeq +87 -> 293
    //   209: goto +54 -> 263
    //   212: aload_2
    //   213: ldc 124
    //   215: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   218: ifeq +75 -> 293
    //   221: goto +52 -> 273
    //   224: aload_2
    //   225: ldc 126
    //   227: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   230: ifeq +63 -> 293
    //   233: goto +35 -> 268
    //   236: aload_2
    //   237: ldc -128
    //   239: invokevirtual 60	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   242: ifeq +51 -> 293
    //   245: goto +33 -> 278
    //   248: ldc 78
    //   250: goto +44 -> 294
    //   253: ldc 84
    //   255: goto +39 -> 294
    //   258: ldc 87
    //   260: goto +34 -> 294
    //   263: ldc 90
    //   265: goto +29 -> 294
    //   268: ldc 93
    //   270: goto +24 -> 294
    //   273: ldc 96
    //   275: goto +19 -> 294
    //   278: ldc 99
    //   280: goto +14 -> 294
    //   283: ldc 102
    //   285: goto +9 -> 294
    //   288: ldc 105
    //   290: goto +4 -> 294
    //   293: aload_1
    //   294: dup
    //   295: ifnonnull +13 -> 308
    //   298: new 28	kotlin/TypeCastException
    //   301: dup
    //   302: ldc 30
    //   304: invokespecial 34	kotlin/TypeCastException:<init>	(Ljava/lang/String;)V
    //   307: athrow
    //   308: areturn
    // Line number table:
    //   Java source line #58	-> byte code offset #6
    //   Java source line #59	-> byte code offset #16
    //   Java source line #61	-> byte code offset #39
    //   Java source line #62	-> byte code offset #248
    //   Java source line #63	-> byte code offset #253
    //   Java source line #64	-> byte code offset #258
    //   Java source line #65	-> byte code offset #263
    //   Java source line #66	-> byte code offset #268
    //   Java source line #67	-> byte code offset #273
    //   Java source line #68	-> byte code offset #278
    //   Java source line #69	-> byte code offset #283
    //   Java source line #70	-> byte code offset #288
    //   Java source line #71	-> byte code offset #293
    //   Java source line #61	-> byte code offset #294
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	309	0	$receiver	KClass
    //   16	293	1	thisJClass	Class
  }
  
  @JvmName(name="getKotlinClass")
  @NotNull
  public static final <T> KClass<T> getKotlinClass(@NotNull Class<T> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return Reflection.getOrCreateKotlinClass($receiver);
  }
  

  @NotNull
  public static final <T> Class<T> getJavaClass(@NotNull T $receiver)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); Class tmp10_7 = $receiver.getClass(); if (tmp10_7 == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>"); return tmp10_7; }
  /**
   * @deprecated
   */
  @JvmName(name="getRuntimeClassOfKClassInstance")
  @NotNull
  public static final <T> Class<KClass<T>> getRuntimeClassOfKClassInstance(@NotNull KClass<T> $receiver) { ; Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); Class tmp13_10 = ((Object)$receiver).getClass(); if (tmp13_10 == null) throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T>>"); return tmp13_10;
  }
  


  private static final <T> boolean isArrayOf(@NotNull Object[] $receiver)
  {
    Intrinsics.reifiedOperationMarker(4, "T");return Object.class.isAssignableFrom($receiver.getClass().getComponentType());
  }
  
  @NotNull
  public static final <T extends Annotation> KClass<? extends T> getAnnotationClass(@NotNull T $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); Class tmp12_7 = $receiver.annotationType();Intrinsics.checkExpressionValueIsNotNull(tmp12_7, "(this as java.lang.annot…otation).annotationType()"); KClass tmp21_18 = getKotlinClass(tmp12_7); if (tmp21_18 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.KClass<out T>"); return tmp21_18;
  }
}

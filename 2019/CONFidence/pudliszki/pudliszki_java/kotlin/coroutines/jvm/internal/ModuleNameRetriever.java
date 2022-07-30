package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;







































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\bÂ\002\030\0002\0020\001:\001\013B\007\b\002¢\006\002\020\002J\020\020\006\032\0020\0042\006\020\007\032\0020\bH\002J\020\020\t\032\004\030\0010\n2\006\020\007\032\0020\bR\024\020\003\032\004\030\0010\0048\006@\006X\016¢\006\002\n\000R\016\020\005\032\0020\004X\004¢\006\002\n\000¨\006\f"}, d2={"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;", "", "()V", "cache", "Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "notOnJava9", "buildCache", "continuation", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getModuleName", "", "Cache", "kotlin-stdlib"})
final class ModuleNameRetriever
{
  static
  {
    ModuleNameRetriever localModuleNameRetriever = new ModuleNameRetriever();INSTANCE = localModuleNameRetriever; } @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\004\b\002\030\0002\0020\001B#\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\005\032\004\030\0010\003¢\006\002\020\006R\022\020\004\032\004\030\0010\0038\006X\004¢\006\002\n\000R\022\020\002\032\004\030\0010\0038\006X\004¢\006\002\n\000R\022\020\005\032\004\030\0010\0038\006X\004¢\006\002\n\000¨\006\007"}, d2={"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "", "getModuleMethod", "Ljava/lang/reflect/Method;", "getDescriptorMethod", "nameMethod", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-stdlib"})
  private static final class Cache { @JvmField
    @Nullable
    public final Method getModuleMethod; @JvmField
    @Nullable
    public final Method getDescriptorMethod; public Cache(@Nullable Method getModuleMethod, @Nullable Method getDescriptorMethod, @Nullable Method nameMethod) { this.getModuleMethod = getModuleMethod;this.getDescriptorMethod = getDescriptorMethod;this.nameMethod = nameMethod;
    }
    

    @JvmField
    @Nullable
    public final Method nameMethod;
  }
  
  private static final Cache notOnJava9 = new Cache(null, null, null);
  

  private ModuleNameRetriever() {}
  

  @JvmField
  @Nullable
  public static Cache cache;
  
  public static final ModuleNameRetriever INSTANCE;
  
  private final Cache buildCache(BaseContinuationImpl continuation)
  {
    Class methodClass;
    try
    {
      Method getModuleMethod = Class.class.getDeclaredMethod("getModule", new Class[0]);
      methodClass = continuation.getClass().getClassLoader().loadClass("java.lang.Module");
      Method getDescriptorMethod = methodClass.getDeclaredMethod("getDescriptor", new Class[0]);
      Class moduleDescriptorClass = continuation.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor");
      Method nameMethod = moduleDescriptorClass.getDeclaredMethod("name", new Class[0]);
      Cache localCache1 = new Cache(getModuleMethod, getDescriptorMethod, nameMethod);Cache it = localCache1; int $i$a$1$also; cache = it;return localCache1;
    } catch (Exception ignored) {
      methodClass = notOnJava9;Cache it = methodClass; int $i$a$2$also; cache = it; } return methodClass;
  }
  
  /* Error */
  @Nullable
  public final String getModuleName(@org.jetbrains.annotations.NotNull BaseContinuationImpl continuation)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 14
    //   3: invokestatic 20	kotlin/jvm/internal/Intrinsics:checkParameterIsNotNull	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: getstatic 22	kotlin/coroutines/jvm/internal/ModuleNameRetriever:cache	Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;
    //   9: dup
    //   10: ifnull +6 -> 16
    //   13: goto +9 -> 22
    //   16: pop
    //   17: aload_0
    //   18: aload_1
    //   19: invokespecial 26	kotlin/coroutines/jvm/internal/ModuleNameRetriever:buildCache	(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;
    //   22: astore_2
    //   23: aload_2
    //   24: getstatic 28	kotlin/coroutines/jvm/internal/ModuleNameRetriever:notOnJava9	Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;
    //   27: if_acmpne +5 -> 32
    //   30: aconst_null
    //   31: areturn
    //   32: aload_2
    //   33: getfield 34	kotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache:getModuleMethod	Ljava/lang/reflect/Method;
    //   36: dup
    //   37: ifnull +21 -> 58
    //   40: aload_1
    //   41: invokevirtual 38	java/lang/Object:getClass	()Ljava/lang/Class;
    //   44: iconst_0
    //   45: anewarray 4	java/lang/Object
    //   48: invokevirtual 44	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   51: dup
    //   52: ifnull +6 -> 58
    //   55: goto +6 -> 61
    //   58: pop
    //   59: aconst_null
    //   60: areturn
    //   61: astore_3
    //   62: aload_2
    //   63: getfield 47	kotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache:getDescriptorMethod	Ljava/lang/reflect/Method;
    //   66: dup
    //   67: ifnull +18 -> 85
    //   70: aload_3
    //   71: iconst_0
    //   72: anewarray 4	java/lang/Object
    //   75: invokevirtual 44	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   78: dup
    //   79: ifnull +6 -> 85
    //   82: goto +6 -> 88
    //   85: pop
    //   86: aconst_null
    //   87: areturn
    //   88: astore 4
    //   90: aload_2
    //   91: getfield 50	kotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache:nameMethod	Ljava/lang/reflect/Method;
    //   94: dup
    //   95: ifnull +15 -> 110
    //   98: aload 4
    //   100: iconst_0
    //   101: anewarray 4	java/lang/Object
    //   104: invokevirtual 44	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   107: goto +5 -> 112
    //   110: pop
    //   111: aconst_null
    //   112: dup
    //   113: instanceof 52
    //   116: ifne +5 -> 121
    //   119: pop
    //   120: aconst_null
    //   121: checkcast 52	java/lang/String
    //   124: areturn
    // Line number table:
    //   Java source line #67	-> byte code offset #6
    //   Java source line #68	-> byte code offset #23
    //   Java source line #69	-> byte code offset #30
    //   Java source line #71	-> byte code offset #32
    //   Java source line #72	-> byte code offset #62
    //   Java source line #73	-> byte code offset #90
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	this	ModuleNameRetriever
    //   0	125	1	continuation	BaseContinuationImpl
    //   23	102	2	cache	Cache
    //   62	63	3	module	Object
    //   90	35	4	descriptor	Object
  }
}

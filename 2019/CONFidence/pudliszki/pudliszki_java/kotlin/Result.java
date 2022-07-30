package kotlin; import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\0006\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\000\n\002\b\003\n\002\020\013\n\002\b\t\n\002\020\003\n\002\b\005\n\002\020\b\n\000\n\002\020\016\n\002\b\005\b@\030\000 \036*\006\b\000\020\001 \0012\0060\002j\002`\003:\002\036\037B\026\b\001\022\b\020\004\032\004\030\0010\005ø\001\000¢\006\004\b\006\020\007J\023\020\020\032\0020\t2\b\020\021\032\004\030\0010\005HÖ\003J\017\020\022\032\004\030\0010\023¢\006\004\b\024\020\025J\022\020\026\032\004\030\0018\000H\b¢\006\004\b\027\020\007J\t\020\030\032\0020\031HÖ\001J\017\020\032\032\0020\033H\026¢\006\004\b\034\020\035R\021\020\b\032\0020\t8F¢\006\006\032\004\b\n\020\013R\021\020\f\032\0020\t8F¢\006\006\032\004\b\r\020\013R\030\020\004\032\004\030\0010\0058\000X\004¢\006\b\n\000\022\004\b\016\020\017ø\001\000\002\004\n\002\b\031¨\006 "}, d2={"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "value", "", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "isFailure", "", "isFailure-impl", "(Ljava/lang/Object;)Z", "isSuccess", "isSuccess-impl", "value$annotations", "()V", "equals", "other", "exceptionOrNull", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getOrNull", "getOrNull-impl", "hashCode", "", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "Companion", "Failure", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public final class Result<T> implements java.io.Serializable { @org.jetbrains.annotations.NotNull
  public String toString() { return toString-impl(value); } public int hashCode() { return hashCode-impl(value); } public boolean equals(Object paramObject) { return equals-impl(value, paramObject); }
  




  @Nullable
  private final Object value;
  


  public static final Companion Companion = new Companion(null);
  


  @PublishedApi
  @org.jetbrains.annotations.NotNull
  public static Object constructor-impl(@Nullable Object value)
  {
    return value;
  }
  





  public static final boolean isSuccess-impl(Object $this)
  {
    return !($this instanceof Failure);
  }
  

  public static final boolean isFailure-impl(Object $this)
  {
    return $this instanceof Failure;
  }
  





  @kotlin.internal.InlineOnly
  private static final T getOrNull-impl(Object $this)
  {
    ;
    



    return isFailure-impl($this) ? null : $this;
  }
  



  @Nullable
  public static final Throwable exceptionOrNull-impl(Object $this)
  {
    Object localObject = $this;
    

    return (localObject instanceof Failure) ? exception : null;
  }
  


  @org.jetbrains.annotations.NotNull
  public static String toString-impl(Object $this)
  {
    Object localObject = $this;
    

    return "Success(" + $this + ')';
  }
  
  /* Error */
  public static int hashCode-impl(Object arg0)
  {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: ifnull +9 -> 11
    //   5: invokevirtual 84	java/lang/Object:hashCode	()I
    //   8: goto +5 -> 13
    //   11: pop
    //   12: iconst_0
    //   13: ireturn
  }
  
  public static boolean equals-impl(Object paramObject1, @Nullable Object paramObject2)
  {
    if ((paramObject2 instanceof Result))
    {
      Object localObject = ((Result)paramObject2).unbox-impl();
      if (kotlin.jvm.internal.Intrinsics.areEqual(paramObject1, localObject)) {
        return true;
      }
    }
    return false;
  }
  
  public static final boolean equals-impl0(@Nullable Object p1, @Nullable Object p2)
  {
    throw null;
  }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\003\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J%\020\003\032\b\022\004\022\002H\0050\004\"\004\b\001\020\0052\006\020\006\032\0020\007H\bø\001\000¢\006\002\020\bJ%\020\t\032\b\022\004\022\002H\0050\004\"\004\b\001\020\0052\006\020\n\032\002H\005H\bø\001\000¢\006\002\020\013\002\004\n\002\b\031¨\006\f"}, d2={"Lkotlin/Result$Companion;", "", "()V", "failure", "Lkotlin/Result;", "T", "exception", "", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "success", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"})
  public static final class Companion
  {
    @kotlin.internal.InlineOnly
    private final <T> Object success(T value)
    {
      ;
      return Result.constructor-impl(value);
    }
    
    @kotlin.internal.InlineOnly
    private final <T> Object failure(Throwable exception)
    {
      ;
      return Result.constructor-impl(ResultKt.createFailure(exception)); }
    private Companion() {} }
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000.\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\003\n\002\b\002\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\000\030\0002\0060\001j\002`\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\023\020\006\032\0020\0072\b\020\b\032\004\030\0010\tH\002J\b\020\n\032\0020\013H\026J\b\020\f\032\0020\rH\026R\020\020\003\032\0020\0048\006X\004¢\006\002\n\000¨\006\016"}, d2={"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "exception", "", "(Ljava/lang/Throwable;)V", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"})
  public static final class Failure implements java.io.Serializable { public Failure(@org.jetbrains.annotations.NotNull Throwable exception) { this.exception = exception; }
    


    public boolean equals(@Nullable Object other) { return ((other instanceof Failure)) && (kotlin.jvm.internal.Intrinsics.areEqual(exception, exception)); }
    public int hashCode() { return exception.hashCode(); } @org.jetbrains.annotations.NotNull
    public String toString() { return "Failure(" + exception + ')'; }
    
    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final Throwable exception;
  }
}

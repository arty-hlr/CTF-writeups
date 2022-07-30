package kotlin;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\024\n\002\030\002\n\000\n\002\020\000\n\002\b\004\n\002\020\013\n\000\bf\030\000*\006\b\000\020\001 \0012\0020\002J\b\020\006\032\0020\007H&R\022\020\003\032\0028\000X¦\004¢\006\006\032\004\b\004\020\005¨\006\b"}, d2={"Lkotlin/Lazy;", "T", "", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "kotlin-stdlib"})
public abstract interface Lazy<T>
{
  public abstract T getValue();
  
  public abstract boolean isInitialized();
}

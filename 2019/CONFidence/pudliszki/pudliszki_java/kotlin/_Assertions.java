package kotlin;

import kotlin.jvm.JvmField;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\002\b\002\bÁ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\026\020\003\032\0020\0048\000X\004¢\006\b\n\000\022\004\b\005\020\002¨\006\006"}, d2={"Lkotlin/_Assertions;", "", "()V", "ENABLED", "", "ENABLED$annotations", "kotlin-stdlib"})
@PublishedApi
public final class _Assertions {
  private _Assertions() {}
  
  static {
    _Assertions local_Assertions = new _Assertions();INSTANCE = local_Assertions;
    

    ENABLED = local_Assertions.getClass().desiredAssertionStatus();
  }
  
  @JvmField
  public static final boolean ENABLED;
  public static final _Assertions INSTANCE;
}

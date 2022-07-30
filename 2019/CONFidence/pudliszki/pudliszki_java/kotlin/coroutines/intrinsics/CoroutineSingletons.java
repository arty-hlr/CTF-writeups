package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\006"}, d2={"Lkotlin/coroutines/intrinsics/CoroutineSingletons;", "", "(Ljava/lang/String;I)V", "COROUTINE_SUSPENDED", "UNDECIDED", "RESUMED", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
@PublishedApi
public enum CoroutineSingletons
{
  static
  {
    CoroutineSingletons[] tmp5_1 = new CoroutineSingletons[3];
    void tmp17_14 = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);
    COROUTINE_SUSPENDED = tmp17_14;
    tmp5_1[0] = tmp17_14;
    CoroutineSingletons[] tmp22_5 = tmp5_1;
    void tmp34_31 = new CoroutineSingletons("UNDECIDED", 1);
    UNDECIDED = tmp34_31;
    tmp22_5[1] = tmp34_31;
    CoroutineSingletons[] tmp39_22 = tmp22_5;
    void tmp51_48 = new CoroutineSingletons("RESUMED", 2);
    RESUMED = tmp51_48;
    tmp39_22[2] = tmp51_48;
  }
  
  private CoroutineSingletons() {}
}

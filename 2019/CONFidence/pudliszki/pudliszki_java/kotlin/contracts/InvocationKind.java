package kotlin.contracts;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.ContractsDsl;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\f\n\002\030\002\n\002\020\020\n\002\b\006\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006¨\006\007"}, d2={"Lkotlin/contracts/InvocationKind;", "", "(Ljava/lang/String;I)V", "AT_MOST_ONCE", "AT_LEAST_ONCE", "EXACTLY_ONCE", "UNKNOWN", "kotlin-stdlib"})
@ContractsDsl
@ExperimentalContracts
@SinceKotlin(version="1.3")
public enum InvocationKind
{
  static
  {
    InvocationKind[] tmp5_1 = new InvocationKind[4];
    void tmp17_14 = new InvocationKind("AT_MOST_ONCE", 0);
    AT_MOST_ONCE = tmp17_14;
    tmp5_1[0] = tmp17_14;
    InvocationKind[] tmp22_5 = tmp5_1;
    void tmp34_31 = new InvocationKind("AT_LEAST_ONCE", 1);
    AT_LEAST_ONCE = tmp34_31;
    tmp22_5[1] = tmp34_31;
    InvocationKind[] tmp39_22 = tmp22_5;
    void tmp51_48 = new InvocationKind("EXACTLY_ONCE", 2);
    EXACTLY_ONCE = tmp51_48;
    tmp39_22[2] = tmp51_48;
    InvocationKind[] tmp56_39 = tmp39_22;
    void tmp68_65 = new InvocationKind("UNKNOWN", 3);
    UNKNOWN = tmp68_65;
    tmp56_39[3] = tmp68_65;
  }
  
  private InvocationKind() {}
}

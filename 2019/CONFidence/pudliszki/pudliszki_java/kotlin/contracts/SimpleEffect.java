package kotlin.contracts;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.ContractsDsl;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\bg\030\0002\0020\001J\021\020\002\032\0020\0032\006\020\004\032\0020\005H§\004¨\006\006"}, d2={"Lkotlin/contracts/SimpleEffect;", "Lkotlin/contracts/Effect;", "implies", "Lkotlin/contracts/ConditionalEffect;", "booleanExpression", "", "kotlin-stdlib"})
@ContractsDsl
@ExperimentalContracts
@SinceKotlin(version="1.3")
public abstract interface SimpleEffect
  extends Effect
{
  @ContractsDsl
  @ExperimentalContracts
  @NotNull
  public abstract ConditionalEffect implies(boolean paramBoolean);
}

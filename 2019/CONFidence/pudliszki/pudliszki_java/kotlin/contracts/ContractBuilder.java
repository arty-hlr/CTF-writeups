package kotlin.contracts;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.ContractsDsl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\bg\030\0002\0020\001J&\020\002\032\0020\003\"\004\b\000\020\0042\f\020\005\032\b\022\004\022\002H\0040\0062\b\b\002\020\007\032\0020\bH'J\b\020\t\032\0020\nH'J\022\020\t\032\0020\n2\b\020\013\032\004\030\0010\001H'J\b\020\f\032\0020\rH'¨\006\016"}, d2={"Lkotlin/contracts/ContractBuilder;", "", "callsInPlace", "Lkotlin/contracts/CallsInPlace;", "R", "lambda", "Lkotlin/Function;", "kind", "Lkotlin/contracts/InvocationKind;", "returns", "Lkotlin/contracts/Returns;", "value", "returnsNotNull", "Lkotlin/contracts/ReturnsNotNull;", "kotlin-stdlib"})
@ContractsDsl
@ExperimentalContracts
@SinceKotlin(version="1.3")
public abstract interface ContractBuilder
{
  @ContractsDsl
  @NotNull
  public abstract Returns returns();
  
  @ContractsDsl
  @NotNull
  public abstract Returns returns(@Nullable Object paramObject);
  
  @ContractsDsl
  @NotNull
  public abstract ReturnsNotNull returnsNotNull();
  
  @ContractsDsl
  @NotNull
  public abstract <R> CallsInPlace callsInPlace(@NotNull Function<? extends R> paramFunction, @NotNull InvocationKind paramInvocationKind);
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3)
  public static final class DefaultImpls {}
}

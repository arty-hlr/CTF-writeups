package kotlin.reflect;

import java.util.Collection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\020\036\n\002\030\002\n\002\b\003\bf\030\0002\0020\001R\034\020\002\032\f\022\b\022\006\022\002\b\0030\0040\003X¦\004¢\006\006\032\004\b\005\020\006¨\006\007"}, d2={"Lkotlin/reflect/KDeclarationContainer;", "", "members", "", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "kotlin-stdlib"})
public abstract interface KDeclarationContainer
{
  @NotNull
  public abstract Collection<KCallable<?>> getMembers();
}

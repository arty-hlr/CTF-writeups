package kotlin.reflect;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\0002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\004\bf\030\0002\0020\001:\001\030R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\006\020\bR\032\020\t\032\0020\0078&X§\004¢\006\f\022\004\b\n\020\013\032\004\b\t\020\bR\022\020\f\032\0020\rX¦\004¢\006\006\032\004\b\016\020\017R\024\020\020\032\004\030\0010\021X¦\004¢\006\006\032\004\b\022\020\023R\022\020\024\032\0020\025X¦\004¢\006\006\032\004\b\026\020\027¨\006\031"}, d2={"Lkotlin/reflect/KParameter;", "Lkotlin/reflect/KAnnotatedElement;", "index", "", "getIndex", "()I", "isOptional", "", "()Z", "isVararg", "isVararg$annotations", "()V", "kind", "Lkotlin/reflect/KParameter$Kind;", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "name", "", "getName", "()Ljava/lang/String;", "type", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "Kind", "kotlin-stdlib"})
public abstract interface KParameter
  extends KAnnotatedElement
{
  public abstract int getIndex();
  
  @Nullable
  public abstract String getName();
  
  @NotNull
  public abstract KType getType();
  
  @NotNull
  public abstract Kind getKind();
  
  public abstract boolean isOptional();
  
  public abstract boolean isVararg();
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\006"}, d2={"Lkotlin/reflect/KParameter$Kind;", "", "(Ljava/lang/String;I)V", "INSTANCE", "EXTENSION_RECEIVER", "VALUE", "kotlin-stdlib"})
  public static enum Kind
  {
    static
    {
      Kind[] tmp5_1 = new Kind[3];
      void tmp17_14 = new Kind("INSTANCE", 0);
      INSTANCE = tmp17_14;
      tmp5_1[0] = tmp17_14;
      Kind[] tmp22_5 = tmp5_1;
      void tmp34_31 = new Kind("EXTENSION_RECEIVER", 1);
      EXTENSION_RECEIVER = tmp34_31;
      tmp22_5[1] = tmp34_31;
      Kind[] tmp39_22 = tmp22_5;
      void tmp51_48 = new Kind("VALUE", 2);
      VALUE = tmp51_48;
      tmp39_22[2] = tmp51_48;
    }
    
    private Kind() {}
  }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3)
  public static final class DefaultImpls {}
}

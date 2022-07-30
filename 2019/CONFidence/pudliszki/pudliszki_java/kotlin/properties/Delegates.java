package kotlin.properties;

import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\0002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\002\n\002\020\013\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\003\032\020\022\006\022\004\030\0010\001\022\004\022\002H\0050\004\"\b\b\000\020\005*\0020\001J}\020\006\032\020\022\006\022\004\030\0010\001\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\002H\0052Q\b\004\020\b\032K\022\027\022\025\022\002\b\0030\n¢\006\f\b\013\022\b\b\f\022\004\b\b(\r\022\023\022\021H\005¢\006\f\b\013\022\b\b\f\022\004\b\b(\016\022\023\022\021H\005¢\006\f\b\013\022\b\b\f\022\004\b\b(\017\022\004\022\0020\0200\tH\b¢\006\002\020\021J}\020\022\032\020\022\006\022\004\030\0010\001\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\002H\0052Q\b\004\020\b\032K\022\027\022\025\022\002\b\0030\n¢\006\f\b\013\022\b\b\f\022\004\b\b(\r\022\023\022\021H\005¢\006\f\b\013\022\b\b\f\022\004\b\b(\016\022\023\022\021H\005¢\006\f\b\013\022\b\b\f\022\004\b\b(\017\022\004\022\0020\0230\tH\b¢\006\002\020\021¨\006\024"}, d2={"Lkotlin/properties/Delegates;", "", "()V", "notNull", "Lkotlin/properties/ReadWriteProperty;", "T", "observable", "initialValue", "onChange", "Lkotlin/Function3;", "Lkotlin/reflect/KProperty;", "Lkotlin/ParameterName;", "name", "property", "oldValue", "newValue", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlin/properties/ReadWriteProperty;", "vetoable", "", "kotlin-stdlib"})
public final class Delegates
{
  public static final Delegates INSTANCE;
  
  static
  {
    Delegates localDelegates = new Delegates();INSTANCE = localDelegates;
  }
  


  @NotNull
  public final <T> ReadWriteProperty<Object, T> notNull()
  {
    return (ReadWriteProperty)new NotNullVar();
  }
  



  @NotNull
  public final <T> ReadWriteProperty<Object, T> observable(final T initialValue, @NotNull Function3<? super kotlin.reflect.KProperty<?>, ? super T, ? super T, kotlin.Unit> onChange)
  {
    ;
    

    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onChange, "onChange");(ReadWriteProperty)new ObservableProperty(onChange) {
      protected void afterChange(@NotNull kotlin.reflect.KProperty<?> property, T oldValue, T newValue) { kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(property, "property");$onChange.invoke(property, oldValue, newValue);
      }
    };
  }
  




  @NotNull
  public final <T> ReadWriteProperty<Object, T> vetoable(final T initialValue, @NotNull Function3<? super kotlin.reflect.KProperty<?>, ? super T, ? super T, Boolean> onChange)
  {
    ;
    



    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onChange, "onChange");(ReadWriteProperty)new ObservableProperty(onChange) {
      protected boolean beforeChange(@NotNull kotlin.reflect.KProperty<?> property, T oldValue, T newValue) { kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(property, "property");return ((Boolean)$onChange.invoke(property, oldValue, newValue)).booleanValue();
      }
    };
  }
  
  private Delegates() {}
}

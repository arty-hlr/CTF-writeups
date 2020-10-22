package kotlin.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.PublishedApi;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\0002\n\000\n\002\020\b\n\002\b\004\n\002\020\021\n\002\020\000\n\000\n\002\020\036\n\002\b\005\n\002\020 \n\002\b\004\n\002\020\013\n\002\b\002\n\002\030\002\n\000\032\021\020\000\032\0020\0012\006\020\002\032\0020\001H\b\032\021\020\003\032\0020\0012\006\020\004\032\0020\001H\b\032\"\020\005\032\n\022\006\022\004\030\0010\0070\0062\n\020\b\032\006\022\002\b\0030\tH\b¢\006\002\020\n\0324\020\005\032\b\022\004\022\002H\0130\006\"\004\b\000\020\0132\n\020\b\032\006\022\002\b\0030\t2\f\020\f\032\b\022\004\022\002H\0130\006H\b¢\006\002\020\r\032\037\020\016\032\b\022\004\022\002H\0130\017\"\004\b\000\020\0132\006\020\020\032\002H\013¢\006\002\020\021\0321\020\022\032\f\022\b\b\001\022\004\030\0010\0070\006\"\004\b\000\020\013*\n\022\006\b\001\022\002H\0130\0062\006\020\023\032\0020\024H\000¢\006\002\020\025\032\037\020\026\032\b\022\004\022\002H\0130\017\"\004\b\000\020\013*\b\022\004\022\002H\0130\027H\b¨\006\030"}, d2={"checkCountOverflow", "", "count", "checkIndexOverflow", "index", "copyToArrayImpl", "", "", "collection", "", "(Ljava/util/Collection;)[Ljava/lang/Object;", "T", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "listOf", "", "element", "(Ljava/lang/Object;)Ljava/util/List;", "copyToArrayOfAny", "isVarargs", "", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "toList", "Ljava/util/Enumeration;", "kotlin-stdlib"}, xs="kotlin/collections/CollectionsKt")
class CollectionsKt__CollectionsJVMKt
{
  @NotNull
  public static final <T> List<T> listOf(T element)
  {
    List tmp4_1 = Collections.singletonList(element);Intrinsics.checkExpressionValueIsNotNull(tmp4_1, "java.util.Collections.singletonList(element)");return tmp4_1;
  }
  

  @InlineOnly
  private static final <T> List<T> toList(@NotNull java.util.Enumeration<T> $receiver)
  {
    ;
    
    java.util.ArrayList tmp4_1 = Collections.list($receiver);Intrinsics.checkExpressionValueIsNotNull(tmp4_1, "java.util.Collections.list(this)");return (List)tmp4_1;
  }
  
  @InlineOnly
  private static final Object[] copyToArrayImpl(Collection<?> collection) { ;
    return CollectionToArray.toArray(collection);
  }
  
  @InlineOnly
  private static final <T> T[] copyToArrayImpl(Collection<?> collection, T[] array) { ;
    Object[] tmp2_1 = array;
    




































    if (tmp2_1 == null) throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"); Object[] tmp19_16 = CollectionToArray.toArray(collection, tmp2_1);
    




































    if (tmp19_16 == null) throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>"); return tmp19_16;
  }
  
  @NotNull
  public static final <T> Object[] copyToArrayOfAny(@NotNull T[] $receiver, boolean isVarargs) { Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); Object[] 
    


      tmp34_31 = java.util.Arrays.copyOf($receiver, $receiver.length, [Ljava.lang.Object.class);Intrinsics.checkExpressionValueIsNotNull(tmp34_31, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");return tmp34_31;
  }
  
  @PublishedApi
  @kotlin.SinceKotlin(version="1.3")
  @InlineOnly
  private static final int checkIndexOverflow(int index) { ;
    if (index < 0) {
      if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
        CollectionsKt.throwIndexOverflow();
      } else
        throw ((Throwable)new ArithmeticException("Index overflow has happened."));
    }
    return index;
  }
  
  @PublishedApi
  @kotlin.SinceKotlin(version="1.3")
  @InlineOnly
  private static final int checkCountOverflow(int count) { ;
    if (count < 0) {
      if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
        CollectionsKt.throwCountOverflow();
      } else
        throw ((Throwable)new ArithmeticException("Count overflow has happened."));
    }
    return count;
  }
  
  public CollectionsKt__CollectionsJVMKt() {}
}

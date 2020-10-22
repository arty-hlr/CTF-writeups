package kotlin.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;















@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\0000\n\000\n\002\020\"\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020#\n\002\b\005\032\022\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002\032\037\020\003\032\022\022\004\022\002H\0020\004j\b\022\004\022\002H\002`\005\"\004\b\000\020\002H\b\0325\020\003\032\022\022\004\022\002H\0020\004j\b\022\004\022\002H\002`\005\"\004\b\000\020\0022\022\020\006\032\n\022\006\b\001\022\002H\0020\007\"\002H\002¢\006\002\020\b\032\037\020\t\032\022\022\004\022\002H\0020\nj\b\022\004\022\002H\002`\013\"\004\b\000\020\002H\b\0325\020\t\032\022\022\004\022\002H\0020\nj\b\022\004\022\002H\002`\013\"\004\b\000\020\0022\022\020\006\032\n\022\006\b\001\022\002H\0020\007\"\002H\002¢\006\002\020\f\032\025\020\r\032\b\022\004\022\002H\0020\016\"\004\b\000\020\002H\b\032+\020\r\032\b\022\004\022\002H\0020\016\"\004\b\000\020\0022\022\020\006\032\n\022\006\b\001\022\002H\0020\007\"\002H\002¢\006\002\020\017\032\025\020\020\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002H\b\032+\020\020\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\022\020\006\032\n\022\006\b\001\022\002H\0020\007\"\002H\002¢\006\002\020\017\032\036\020\021\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\001H\000\032!\020\022\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\n\022\004\022\002H\002\030\0010\001H\b¨\006\023"}, d2={"emptySet", "", "T", "hashSetOf", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "elements", "", "([Ljava/lang/Object;)Ljava/util/HashSet;", "linkedSetOf", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "mutableSetOf", "", "([Ljava/lang/Object;)Ljava/util/Set;", "setOf", "optimizeReadOnlySet", "orEmpty", "kotlin-stdlib"}, xs="kotlin/collections/SetsKt")
class SetsKt__SetsKt
  extends SetsKt__SetsJVMKt
{
  @NotNull
  public static final <T> Set<T> emptySet()
  {
    return (Set)EmptySet.INSTANCE;
  }
  


  @NotNull
  public static final <T> Set<T> setOf(@NotNull T... elements)
  {
    Intrinsics.checkParameterIsNotNull(elements, "elements");return elements.length > 0 ? ArraysKt.toSet(elements) : SetsKt.emptySet();
  }
  
  @InlineOnly
  private static final <T> Set<T> setOf()
  {
    ;
    return SetsKt.emptySet();
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <T> Set<T> mutableSetOf()
  {
    ;
    
    return (Set)new LinkedHashSet();
  }
  

  @NotNull
  public static final <T> Set<T> mutableSetOf(@NotNull T... elements)
  {
    Intrinsics.checkParameterIsNotNull(elements, "elements");return (Set)ArraysKt.toCollection(elements, (Collection)new LinkedHashSet(MapsKt.mapCapacity(elements.length))); }
  
  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <T> HashSet<T> hashSetOf() { ;
    return new HashSet(); }
  
  @NotNull
  public static final <T> HashSet<T> hashSetOf(@NotNull T... elements) { Intrinsics.checkParameterIsNotNull(elements, "elements");return (HashSet)ArraysKt.toCollection(elements, (Collection)new HashSet(MapsKt.mapCapacity(elements.length))); }
  
  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <T> LinkedHashSet<T> linkedSetOf() { ;
    return new LinkedHashSet();
  }
  
  @NotNull
  public static final <T> LinkedHashSet<T> linkedSetOf(@NotNull T... elements)
  {
    Intrinsics.checkParameterIsNotNull(elements, "elements");return (LinkedHashSet)ArraysKt.toCollection(elements, (Collection)new LinkedHashSet(MapsKt.mapCapacity(elements.length)));
  }
  
  /* Error */
  @InlineOnly
  private static final <T> Set<T> orEmpty(@org.jetbrains.annotations.Nullable Set<? extends T> $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: ifnull +6 -> 8
    //   5: goto +7 -> 12
    //   8: pop
    //   9: invokestatic 34	kotlin/collections/SetsKt:emptySet	()Ljava/util/Set;
    //   12: areturn
    // Line number table:
    //   Java source line #89	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	13	0	$receiver	Set
    //   0	13	1	$i$f$orEmpty	int
  }
  
  @NotNull
  public static final <T> Set<T> optimizeReadOnlySet(@NotNull Set<? extends T> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); switch ($receiver.size()) {
    case 0: 
      break;
    case 1:  break; }
    return $receiver;
  }
  
  public SetsKt__SetsKt() {}
}

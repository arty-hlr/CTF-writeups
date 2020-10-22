package team.p4.pudliszki;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000:\n\000\n\002\020\b\n\000\n\002\020$\n\002\020\f\n\002\020 \n\002\b\003\n\002\020\002\n\000\n\002\020\021\n\002\020\016\n\002\b\002\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\003\032 \020\000\032\0020\0012\030\020\002\032\024\022\004\022\0020\004\022\n\022\b\022\004\022\0020\0010\0050\003\032\024\020\006\032\0020\0012\f\020\007\032\b\022\004\022\0020\0010\005\032\031\020\b\032\0020\t2\f\020\n\032\b\022\004\022\0020\f0\013¢\006\002\020\r\032\037\020\016\032\0020\017\"\006\b\000\020\020\030\0012\f\020\021\032\b\022\004\022\002H\0200\022H\b\032\016\020\023\032\0020\0012\006\020\024\032\0020\f¨\006\025"}, d2={"checksum", "", "grouped", "", "", "", "compress", "value", "main", "", "args", "", "", "([Ljava/lang/String;)V", "validateChar", "", "T", "c", "Lteam/p4/pudliszki/FlagChar;", "validateFlag", "flag", "pudliszki"})
public final class FlagCheckerKt
{
  public static final void main(@NotNull String[] args)
  {
    Intrinsics.checkParameterIsNotNull(args, "args");String[] $receiver = args;int $i$a$-with-FlagCheckerKt$main$1 = 0;
    SizeResult localSizeResult = SizeResultFactory.Companion.check($receiver.length, A.class);
    if ((localSizeResult instanceof Correct)) { String str1;
      if (validateFlag($receiver[0]) == 0) {
        str1 = "Nice!";System.out.print(str1);
      } else {
        str1 = "Not today";System.out.print(str1);
        int i = -1;System.exit(i);throw ((Throwable)new RuntimeException("System.exit returned normally, while it was supposed to halt JVM."));
      }
    }
    else if ((localSizeResult instanceof Incorrect)) {
      String str2 = "Failed";System.out.print(str2);
      int j = -1;System.exit(j);throw ((Throwable)new RuntimeException("System.exit returned normally, while it was supposed to halt JVM."));
    }
  }
  

  public static final int validateFlag(@NotNull String flag)
  {
    Intrinsics.checkParameterIsNotNull(flag, "flag");SizeResult localSizeResult = SizeResultFactory.Companion.check(flag.length(), IllegalMonitorStateException.class);
    Object $receiver$iv; if ((localSizeResult instanceof Correct))
    {


      Sequence localSequence1 = SequencesKt.mapIndexed(SequencesKt.filter(SequencesKt.map(kotlin.text.StringsKt.asSequence((CharSequence)flag), (Function1)validateFlag.1.INSTANCE), (Function1)validateFlag.2.INSTANCE), (Function2)validateFlag.3.INSTANCE);
      










































      int $i$f$groupBy;
      









































      Object localObject1 = $receiver$iv;Map destination$iv$iv = (Map)new LinkedHashMap();
      int $i$f$groupByTo; Sequence $receiver$iv$iv; List localList1; Integer localInteger; for (Iterator localIterator = $receiver$iv$iv.iterator(); localIterator.hasNext(); localList1.add(localInteger))
      {





















































































        Object element$iv$iv = localIterator.next();
        Pair c = (Pair)element$iv$iv;int $i$a$-groupBy-FlagCheckerKt$validateFlag$4 = 0;Object key$iv$iv = Character.valueOf(((Character)((FlagChar)c.getFirst()).getC()).charValue());
        Map $receiver$iv$iv$iv = destination$iv$iv;
        int $i$f$getOrPut; Object value$iv$iv$iv = $receiver$iv$iv$iv.get(key$iv$iv);
        int $i$a$2$getOrPut;
        Object answer$iv$iv$iv = new ArrayList();
        


        $receiver$iv$iv$iv.put(key$iv$iv, answer$iv$iv$iv);List list$iv$iv = (List)(value$iv$iv$iv == null ? 
          answer$iv$iv$iv : 
          
          value$iv$iv$iv);
        c = (Pair)element$iv$iv;localList1 = list$iv$iv; Pair c; int $i$a$-groupBy-FlagCheckerKt$validateFlag$5 = 0;localInteger = Integer.valueOf(((Number)c.getSecond()).intValue());
      }
      return checksum(
      






































































































        destination$iv$iv);
    }
    if ((localSizeResult instanceof Incorrect)) {
      $receiver$iv = "Failed";System.out.print($receiver$iv);
      int i = -1;System.exit(i);throw ((Throwable)new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.")); } throw new NoWhenBranchMatchedException();
  }
  

  private static final <T> boolean validateChar(FlagChar<T> c)
  {
    int $i$f$validateChar = 0;Object localObject = c.getC();
    if ((localObject instanceof Character)) return true;
    if ((localObject instanceof String)) { return false;
    }
    return false;
  }
  




















  public static final int checksum(@NotNull Map<Character, ? extends List<Integer>> grouped)
  {
    Intrinsics.checkParameterIsNotNull(grouped, "grouped");
    try { Map localMap = grouped;
      





























      int $i$f$map;
      




























      Object localObject1 = $receiver$iv;Collection destination$iv$iv = (Collection)new ArrayList(((Map)$receiver$iv).size());
      int $i$f$mapTo; Object localObject2 = $receiver$iv$iv; Map.Entry item$iv$iv; Collection localCollection1; int $i$a$-map-FlagCheckerKt$checksum$1; Object localObject3; for (Iterator localIterator = ((Map)localObject2).entrySet().iterator(); localIterator.hasNext(); localCollection1.add(localObject3))
      {



























































        item$iv$iv = (Map.Entry)localIterator.next();
        Map.Entry localEntry1 = item$iv$iv;localCollection1 = destination$iv$iv; Map.Entry entry; $i$a$-map-FlagCheckerKt$checksum$1 = 0;localObject3 = new Pair(Class.forName("team.p4.pudliszki." + String.valueOf(((Character)entry.getKey()).charValue())).newInstance(), Integer.valueOf(compress((List)entry.getValue()))); }
      Object $receiver$iv = (Iterable)destination$iv$iv;
      int $i$f$map; Iterable $receiver$iv; Object $receiver$iv$iv = $receiver$iv;Collection destination$iv$iv = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault($receiver$iv, 10));
      int $i$f$mapTo; for (localObject2 = ((Iterable)$receiver$iv$iv).iterator(); ((Iterator)localObject2).hasNext(); localCollection1.add(localObject3))
      {








































        Object item$iv$iv = ((Iterator)localObject2).next();
        item$iv$iv = (Pair)item$iv$iv;localCollection1 = destination$iv$iv; Pair entry; int $i$a$-map-FlagCheckerKt$checksum$2 = 0;$i$a$-map-FlagCheckerKt$checksum$1 = entry.getFirst();localObject3 = Integer.valueOf(($i$a$-map-FlagCheckerKt$checksum$1 instanceof }) ? ((Number)entry.getSecond()).intValue() - 27 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof _) ? ((Number)entry.getSecond()).intValue() - 19849 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof u) ? ((Number)entry.getSecond()).intValue() - 25 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof t) ? ((Number)entry.getSecond()).intValue() - 5 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof s) ? ((Number)entry.getSecond()).intValue() - 11 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof n) ? ((Number)entry.getSecond()).intValue() - 8 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof l) ? ((Number)entry.getSecond()).intValue() - 486 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof k) ? ((Number)entry.getSecond()).intValue() - 643 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof i) ? ((Number)entry.getSecond()).intValue() - 16 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof h) ? ((Number)entry.getSecond()).intValue() - 786 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof e) ? ((Number)entry.getSecond()).intValue() - 21 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof c) ? ((Number)entry.getSecond()).intValue() - 23 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof 7) ? ((Number)entry.getSecond()).intValue() - 22 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof 5) ? ((Number)entry.getSecond()).intValue() - 17 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof 1) ? ((Number)entry.getSecond()).intValue() - 327 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof 0) ? ((Number)entry.getSecond()).intValue() - 452 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof {) ? ((Number)entry.getSecond()).intValue() - 2 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof 4) ? ((Number)entry.getSecond()).intValue() - 1 : ($i$a$-map-FlagCheckerKt$checksum$1 instanceof p) ? ((Number)entry.getSecond()).intValue() - 27040 : 64199);
      }
      return CollectionsKt.sumOfInt(
      








































        (Iterable)destination$iv$iv);
    }
    catch (ClassNotFoundException e)
    {
      Object $receiver$iv$iv = "Failed";System.out.print($receiver$iv$iv);
      int i = -1;System.exit(i);throw ((Throwable)new RuntimeException("System.exit returned normally, while it was supposed to halt JVM."));
    }
  }
  






  public static final int compress(@NotNull List<Integer> value)
  {
    Intrinsics.checkParameterIsNotNull(value, "value");Multiplier m = new Multiplier(0, 1, null);
    


    SequencesKt.sumOfInt(SequencesKt.map(CollectionsKt.asSequence((Iterable)value), (Function1)new Lambda(m) { public final int invoke(int v) { return v * $m.get(); }
    }));
  }
}

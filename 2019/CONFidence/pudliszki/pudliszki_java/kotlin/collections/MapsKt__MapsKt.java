package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;





@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000~\n\000\n\002\020\b\n\000\n\002\020$\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\006\n\002\020%\n\000\n\002\020&\n\002\b\003\n\002\020\013\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\f\n\002\030\002\n\002\b\n\n\002\020(\n\002\020)\n\002\020'\n\002\b\n\n\002\020\034\n\002\030\002\n\000\n\002\020\002\n\002\b\026\032\036\020\002\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005\0321\020\006\032\036\022\004\022\002H\004\022\004\022\002H\0050\007j\016\022\004\022\002H\004\022\004\022\002H\005`\b\"\004\b\000\020\004\"\004\b\001\020\005H\b\032_\020\006\032\036\022\004\022\002H\004\022\004\022\002H\0050\007j\016\022\004\022\002H\004\022\004\022\002H\005`\b\"\004\b\000\020\004\"\004\b\001\020\0052*\020\t\032\026\022\022\b\001\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130\n\"\016\022\004\022\002H\004\022\004\022\002H\0050\013¢\006\002\020\f\0321\020\r\032\036\022\004\022\002H\004\022\004\022\002H\0050\016j\016\022\004\022\002H\004\022\004\022\002H\005`\017\"\004\b\000\020\004\"\004\b\001\020\005H\b\032_\020\r\032\036\022\004\022\002H\004\022\004\022\002H\0050\016j\016\022\004\022\002H\004\022\004\022\002H\005`\017\"\004\b\000\020\004\"\004\b\001\020\0052*\020\t\032\026\022\022\b\001\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130\n\"\016\022\004\022\002H\004\022\004\022\002H\0050\013¢\006\002\020\020\032\020\020\021\032\0020\0012\006\020\022\032\0020\001H\001\032!\020\023\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005H\b\032O\020\023\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\0052*\020\t\032\026\022\022\b\001\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130\n\"\016\022\004\022\002H\004\022\004\022\002H\0050\013¢\006\002\020\024\032!\020\025\032\016\022\004\022\002H\004\022\004\022\002H\0050\026\"\004\b\000\020\004\"\004\b\001\020\005H\b\032O\020\025\032\016\022\004\022\002H\004\022\004\022\002H\0050\026\"\004\b\000\020\004\"\004\b\001\020\0052*\020\t\032\026\022\022\b\001\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130\n\"\016\022\004\022\002H\004\022\004\022\002H\0050\013¢\006\002\020\024\032*\020\027\032\002H\004\"\004\b\000\020\004\"\004\b\001\020\005*\016\022\004\022\002H\004\022\004\022\002H\0050\030H\n¢\006\002\020\031\032*\020\032\032\002H\005\"\004\b\000\020\004\"\004\b\001\020\005*\016\022\004\022\002H\004\022\004\022\002H\0050\030H\n¢\006\002\020\031\0329\020\033\032\0020\034\"\t\b\000\020\004¢\006\002\b\035\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\006\020\036\032\002H\004H\n¢\006\002\020\037\0321\020 \032\0020\034\"\t\b\000\020\004¢\006\002\b\035*\016\022\006\b\001\022\002H\004\022\002\b\0030\0032\006\020\036\032\002H\004H\b¢\006\002\020\037\0327\020!\032\0020\034\"\004\b\000\020\004\"\t\b\001\020\005¢\006\002\b\035*\016\022\004\022\002H\004\022\004\022\002H\0050\0032\006\020\"\032\002H\005H\b¢\006\002\020\037\032S\020#\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\036\020$\032\032\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\030\022\004\022\0020\0340%H\b\032G\020&\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\022\020$\032\016\022\004\022\002H\004\022\004\022\0020\0340%H\b\032S\020'\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\036\020$\032\032\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\030\022\004\022\0020\0340%H\b\032n\020(\032\002H)\"\004\b\000\020\004\"\004\b\001\020\005\"\030\b\002\020)*\022\022\006\b\000\022\002H\004\022\006\b\000\022\002H\0050\026*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\006\020*\032\002H)2\036\020$\032\032\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\030\022\004\022\0020\0340%H\b¢\006\002\020+\032n\020,\032\002H)\"\004\b\000\020\004\"\004\b\001\020\005\"\030\b\002\020)*\022\022\006\b\000\022\002H\004\022\006\b\000\022\002H\0050\026*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\006\020*\032\002H)2\036\020$\032\032\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\030\022\004\022\0020\0340%H\b¢\006\002\020+\032G\020-\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\022\020$\032\016\022\004\022\002H\005\022\004\022\0020\0340%H\b\032;\020.\032\004\030\001H\005\"\t\b\000\020\004¢\006\002\b\035\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\006\020\036\032\002H\004H\n¢\006\002\020/\032@\0200\032\002H\005\"\004\b\000\020\004\"\004\b\001\020\005*\016\022\004\022\002H\004\022\004\022\002H\0050\0032\006\020\036\032\002H\0042\f\0201\032\b\022\004\022\002H\00502H\b¢\006\002\0203\032@\0204\032\002H\005\"\004\b\000\020\004\"\004\b\001\020\005*\016\022\004\022\002H\004\022\004\022\002H\0050\0032\006\020\036\032\002H\0042\f\0201\032\b\022\004\022\002H\00502H\b¢\006\002\0203\032@\0205\032\002H\005\"\004\b\000\020\004\"\004\b\001\020\005*\016\022\004\022\002H\004\022\004\022\002H\0050\0262\006\020\036\032\002H\0042\f\0201\032\b\022\004\022\002H\00502H\b¢\006\002\0203\0321\0206\032\002H\005\"\004\b\000\020\004\"\004\b\001\020\005*\016\022\004\022\002H\004\022\004\022\002H\0050\0032\006\020\036\032\002H\004H\007¢\006\002\020/\032<\0207\032\002H8\"\024\b\000\020)*\n\022\002\b\003\022\002\b\0030\003*\002H8\"\004\b\001\0208*\002H)2\f\0201\032\b\022\004\022\002H802H\b¢\006\002\0209\032'\020:\032\0020\034\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\003H\b\032:\020;\032\0020\034\"\004\b\000\020\004\"\004\b\001\020\005*\022\022\006\b\001\022\002H\004\022\004\022\002H\005\030\0010\003H\b\002\016\n\f\b\000\022\002\030\001\032\004\b\003\020\000\0329\020<\032\024\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\0300=\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\003H\n\032<\020<\032\024\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050?0>\"\004\b\000\020\004\"\004\b\001\020\005*\016\022\004\022\002H\004\022\004\022\002H\0050\026H\n¢\006\002\b@\032Y\020A\032\016\022\004\022\002H8\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005\"\004\b\002\0208*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\036\020B\032\032\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\030\022\004\022\002H80%H\b\032t\020C\032\002H)\"\004\b\000\020\004\"\004\b\001\020\005\"\004\b\002\0208\"\030\b\003\020)*\022\022\006\b\000\022\002H8\022\006\b\000\022\002H\0050\026*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\006\020*\032\002H)2\036\020B\032\032\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\030\022\004\022\002H80%H\b¢\006\002\020+\032Y\020D\032\016\022\004\022\002H\004\022\004\022\002H80\003\"\004\b\000\020\004\"\004\b\001\020\005\"\004\b\002\0208*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\036\020B\032\032\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\030\022\004\022\002H80%H\b\032t\020E\032\002H)\"\004\b\000\020\004\"\004\b\001\020\005\"\004\b\002\0208\"\030\b\003\020)*\022\022\006\b\000\022\002H\004\022\006\b\000\022\002H80\026*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\006\020*\032\002H)2\036\020B\032\032\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\030\022\004\022\002H80%H\b¢\006\002\020+\032@\020F\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\006\020\036\032\002H\004H\002¢\006\002\020G\032H\020F\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\016\020H\032\n\022\006\b\001\022\002H\0040\nH\002¢\006\002\020I\032A\020F\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\f\020H\032\b\022\004\022\002H\0040JH\002\032A\020F\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\f\020H\032\b\022\004\022\002H\0040KH\002\0322\020L\032\0020M\"\004\b\000\020\004\"\004\b\001\020\005*\016\022\004\022\002H\004\022\004\022\002H\0050\0262\006\020\036\032\002H\004H\n¢\006\002\020N\032:\020L\032\0020M\"\004\b\000\020\004\"\004\b\001\020\005*\016\022\004\022\002H\004\022\004\022\002H\0050\0262\016\020H\032\n\022\006\b\001\022\002H\0040\nH\n¢\006\002\020O\0323\020L\032\0020M\"\004\b\000\020\004\"\004\b\001\020\005*\016\022\004\022\002H\004\022\004\022\002H\0050\0262\f\020H\032\b\022\004\022\002H\0040JH\n\0323\020L\032\0020M\"\004\b\000\020\004\"\004\b\001\020\005*\016\022\004\022\002H\004\022\004\022\002H\0050\0262\f\020H\032\b\022\004\022\002H\0040KH\n\0320\020P\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\016\022\004\022\002H\004\022\004\022\002H\0050\003H\000\0323\020Q\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\004\022\002H\004\022\004\022\002H\005\030\0010\003H\b\032T\020R\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\032\020\t\032\026\022\022\b\001\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130\nH\002¢\006\002\020S\032G\020R\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\022\020T\032\016\022\004\022\002H\004\022\004\022\002H\0050\013H\002\032M\020R\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\030\020\t\032\024\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130JH\002\032I\020R\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\024\020U\032\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\003H\002\032M\020R\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\030\020\t\032\024\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130KH\002\032J\020V\032\0020M\"\004\b\000\020\004\"\004\b\001\020\005*\022\022\006\b\000\022\002H\004\022\006\b\000\022\002H\0050\0262\032\020\t\032\026\022\022\b\001\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130\nH\n¢\006\002\020W\032=\020V\032\0020M\"\004\b\000\020\004\"\004\b\001\020\005*\022\022\006\b\000\022\002H\004\022\006\b\000\022\002H\0050\0262\022\020T\032\016\022\004\022\002H\004\022\004\022\002H\0050\013H\n\032C\020V\032\0020M\"\004\b\000\020\004\"\004\b\001\020\005*\022\022\006\b\000\022\002H\004\022\006\b\000\022\002H\0050\0262\030\020\t\032\024\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130JH\n\032=\020V\032\0020M\"\004\b\000\020\004\"\004\b\001\020\005*\022\022\006\b\000\022\002H\004\022\006\b\000\022\002H\0050\0262\022\020U\032\016\022\004\022\002H\004\022\004\022\002H\0050\003H\n\032C\020V\032\0020M\"\004\b\000\020\004\"\004\b\001\020\005*\022\022\006\b\000\022\002H\004\022\006\b\000\022\002H\0050\0262\030\020\t\032\024\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130KH\n\032G\020X\032\0020M\"\004\b\000\020\004\"\004\b\001\020\005*\022\022\006\b\000\022\002H\004\022\006\b\000\022\002H\0050\0262\032\020\t\032\026\022\022\b\001\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130\n¢\006\002\020W\032@\020X\032\0020M\"\004\b\000\020\004\"\004\b\001\020\005*\022\022\006\b\000\022\002H\004\022\006\b\000\022\002H\0050\0262\030\020\t\032\024\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130J\032@\020X\032\0020M\"\004\b\000\020\004\"\004\b\001\020\005*\022\022\006\b\000\022\002H\004\022\006\b\000\022\002H\0050\0262\030\020\t\032\024\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130K\032;\020Y\032\004\030\001H\005\"\t\b\000\020\004¢\006\002\b\035\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0262\006\020\036\032\002H\004H\b¢\006\002\020/\032:\020Z\032\0020M\"\004\b\000\020\004\"\004\b\001\020\005*\016\022\004\022\002H\004\022\004\022\002H\0050\0262\006\020\036\032\002H\0042\006\020\"\032\002H\005H\n¢\006\002\020[\032;\020\\\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\026\022\022\b\001\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130\n¢\006\002\020\024\032Q\020\\\032\002H)\"\004\b\000\020\004\"\004\b\001\020\005\"\030\b\002\020)*\022\022\006\b\000\022\002H\004\022\006\b\000\022\002H\0050\026*\026\022\022\b\001\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130\n2\006\020*\032\002H)¢\006\002\020]\0324\020\\\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\024\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130J\032O\020\\\032\002H)\"\004\b\000\020\004\"\004\b\001\020\005\"\030\b\002\020)*\022\022\006\b\000\022\002H\004\022\006\b\000\022\002H\0050\026*\024\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130J2\006\020*\032\002H)¢\006\002\020^\0322\020\\\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\003H\007\032M\020\\\032\002H)\"\004\b\000\020\004\"\004\b\001\020\005\"\030\b\002\020)*\022\022\006\b\000\022\002H\004\022\006\b\000\022\002H\0050\026*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\0032\006\020*\032\002H)H\007¢\006\002\020_\0324\020\\\032\016\022\004\022\002H\004\022\004\022\002H\0050\003\"\004\b\000\020\004\"\004\b\001\020\005*\024\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130K\032O\020\\\032\002H)\"\004\b\000\020\004\"\004\b\001\020\005\"\030\b\002\020)*\022\022\006\b\000\022\002H\004\022\006\b\000\022\002H\0050\026*\024\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0050\0130K2\006\020*\032\002H)¢\006\002\020`\0322\020a\032\016\022\004\022\002H\004\022\004\022\002H\0050\026\"\004\b\000\020\004\"\004\b\001\020\005*\020\022\006\b\001\022\002H\004\022\004\022\002H\0050\003H\007\0321\020b\032\016\022\004\022\002H\004\022\004\022\002H\0050\013\"\004\b\000\020\004\"\004\b\001\020\005*\016\022\004\022\002H\004\022\004\022\002H\0050\030H\b\"\016\020\000\032\0020\001XT¢\006\002\n\000¨\006c"}, d2={"INT_MAX_POWER_OF_TWO", "", "emptyMap", "", "K", "V", "hashMapOf", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Ljava/util/HashMap;", "linkedMapOf", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "([Lkotlin/Pair;)Ljava/util/LinkedHashMap;", "mapCapacity", "expectedSize", "mapOf", "([Lkotlin/Pair;)Ljava/util/Map;", "mutableMapOf", "", "component1", "", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "component2", "contains", "", "Lkotlin/internal/OnlyInputTypes;", "key", "(Ljava/util/Map;Ljava/lang/Object;)Z", "containsKey", "containsValue", "value", "filter", "predicate", "Lkotlin/Function1;", "filterKeys", "filterNot", "filterNotTo", "M", "destination", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "filterTo", "filterValues", "get", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrElseNullable", "getOrPut", "getValue", "ifEmpty", "R", "(Ljava/util/Map;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "isNullOrEmpty", "iterator", "", "", "", "mutableIterator", "mapKeys", "transform", "mapKeysTo", "mapValues", "mapValuesTo", "minus", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;", "keys", "(Ljava/util/Map;[Ljava/lang/Object;)Ljava/util/Map;", "", "Lkotlin/sequences/Sequence;", "minusAssign", "", "(Ljava/util/Map;Ljava/lang/Object;)V", "(Ljava/util/Map;[Ljava/lang/Object;)V", "optimizeReadOnlyMap", "orEmpty", "plus", "(Ljava/util/Map;[Lkotlin/Pair;)Ljava/util/Map;", "pair", "map", "plusAssign", "(Ljava/util/Map;[Lkotlin/Pair;)V", "putAll", "remove", "set", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V", "toMap", "([Lkotlin/Pair;Ljava/util/Map;)Ljava/util/Map;", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "(Lkotlin/sequences/Sequence;Ljava/util/Map;)Ljava/util/Map;", "toMutableMap", "toPair", "kotlin-stdlib"}, xs="kotlin/collections/MapsKt")
class MapsKt__MapsKt
  extends MapsKt__MapsJVMKt
{
  private static final int INT_MAX_POWER_OF_TWO = 1073741824;
  
  @NotNull
  public static final <K, V> Map<K, V> emptyMap()
  {
    EmptyMap tmp3_0 = EmptyMap.INSTANCE;
    





































    if (tmp3_0 == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>"); return (Map)tmp3_0;
  }
  









  @NotNull
  public static final <K, V> Map<K, V> mapOf(@NotNull Pair<? extends K, ? extends V>... pairs)
  {
    Intrinsics.checkParameterIsNotNull(pairs, "pairs");return pairs.length > 0 ? MapsKt.toMap(pairs, (Map)new LinkedHashMap(MapsKt.mapCapacity(pairs.length))) : MapsKt.emptyMap();
  }
  

  @InlineOnly
  private static final <K, V> Map<K, V> mapOf()
  {
    ;
    
    return MapsKt.emptyMap();
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <K, V> Map<K, V> mutableMapOf()
  {
    ;
    
    return (Map)new LinkedHashMap();
  }
  








  @NotNull
  public static final <K, V> Map<K, V> mutableMapOf(@NotNull Pair<? extends K, ? extends V>... pairs)
  {
    Intrinsics.checkParameterIsNotNull(pairs, "pairs");LinkedHashMap localLinkedHashMap1 = new LinkedHashMap(MapsKt.mapCapacity(pairs.length));LinkedHashMap $receiver = localLinkedHashMap1; int $i$a$1$apply; MapsKt.putAll((Map)$receiver, pairs);return (Map)localLinkedHashMap1;
  }
  
  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <K, V> HashMap<K, V> hashMapOf() {
    ;
    return new HashMap();
  }
  


  @NotNull
  public static final <K, V> HashMap<K, V> hashMapOf(@NotNull Pair<? extends K, ? extends V>... pairs)
  {
    Intrinsics.checkParameterIsNotNull(pairs, "pairs");HashMap localHashMap1 = new HashMap(MapsKt.mapCapacity(pairs.length));HashMap $receiver = localHashMap1; int $i$a$1$apply; MapsKt.putAll((Map)$receiver, pairs);return localHashMap1;
  }
  
  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <K, V> LinkedHashMap<K, V> linkedMapOf() {
    ;
    return new LinkedHashMap();
  }
  






  @NotNull
  public static final <K, V> LinkedHashMap<K, V> linkedMapOf(@NotNull Pair<? extends K, ? extends V>... pairs)
  {
    Intrinsics.checkParameterIsNotNull(pairs, "pairs");return (LinkedHashMap)MapsKt.toMap(pairs, (Map)new LinkedHashMap(MapsKt.mapCapacity(pairs.length)));
  }
  



  @PublishedApi
  public static final int mapCapacity(int expectedSize)
  {
    if (expectedSize < 3) {
      return expectedSize + 1;
    }
    if (expectedSize < 1073741824) {
      return expectedSize + expectedSize / 3;
    }
    return Integer.MAX_VALUE;
  }
  
  @InlineOnly
  private static final <K, V> boolean isNotEmpty(@NotNull Map<? extends K, ? extends V> $receiver)
  {
    ;
    return !$receiver.isEmpty();
  }
  



  @SinceKotlin(version="1.3")
  @InlineOnly
  private static final <K, V> boolean isNullOrEmpty(@Nullable Map<? extends K, ? extends V> $receiver)
  {
    ;
    

    return ($receiver == null) || ($receiver.isEmpty());
  }
  






  @SinceKotlin(version="1.3")
  @InlineOnly
  private static final <M extends Map<?, ?>,  extends R, R> R ifEmpty(M $receiver, Function0<? extends R> defaultValue)
  {
    ;
    





    return $receiver.isEmpty() ? defaultValue.invoke() : $receiver;
  }
  

  @InlineOnly
  private static final <K, V> boolean contains(@NotNull Map<? extends K, ? extends V> $receiver, K key)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Map localMap = $receiver;return localMap.containsKey(key);
  }
  
  @InlineOnly
  private static final <K, V> V get(@NotNull Map<? extends K, ? extends V> $receiver, K key)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.get(key);
  }
  
  @InlineOnly
  private static final <K, V> void set(@NotNull Map<K, V> $receiver, K key, V value)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");$receiver.put(key, value);
  }
  


  @InlineOnly
  private static final <K> boolean containsKey(@NotNull Map<? extends K, ?> $receiver, K key)
  {
    ;
    
    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>"); return $receiver.containsKey(key);
  }
  


  @InlineOnly
  private static final <K, V> boolean containsValue(@NotNull Map<K, ? extends V> $receiver, V value)
  {
    ;
    

    return $receiver.containsValue(value);
  }
  



  @InlineOnly
  private static final <K, V> V remove(@NotNull Map<? extends K, V> $receiver, K key)
  {
    ;
    

    if ($receiver == null) throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>"); return TypeIntrinsics.asMutableMap($receiver).remove(key);
  }
  



  @InlineOnly
  private static final <K, V> K component1(@NotNull Map.Entry<? extends K, ? extends V> $receiver)
  {
    ;
    


    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.getKey();
  }
  



  @InlineOnly
  private static final <K, V> V component2(@NotNull Map.Entry<? extends K, ? extends V> $receiver)
  {
    ;
    


    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.getValue();
  }
  
  @InlineOnly
  private static final <K, V> Pair<K, V> toPair(@NotNull Map.Entry<? extends K, ? extends V> $receiver) {
    ;
    return new Pair($receiver.getKey(), $receiver.getValue());
  }
  



  public static final <K, V> V getOrElseNullable(@NotNull Map<K, ? extends V> $receiver, K key, @NotNull Function0<? extends V> defaultValue)
  {
    ;
    


    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(defaultValue, "defaultValue");Object value = $receiver.get(key);
    if ((value == null) && (!$receiver.containsKey(key))) {
      return defaultValue.invoke();
    }
    
    return value;
  }
  








  @SinceKotlin(version="1.1")
  public static final <K, V> V getValue(@NotNull Map<K, ? extends V> $receiver, K key)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return MapsKt.getOrImplicitDefaultNullable($receiver, key);
  }
  



  public static final <K, V> V getOrPut(@NotNull Map<K, V> $receiver, K key, @NotNull Function0<? extends V> defaultValue)
  {
    ;
    

    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(defaultValue, "defaultValue");Object value = $receiver.get(key);
    
    Object answer = defaultValue.invoke();
    $receiver.put(key, answer);return value == null ? 
      answer : 
      
      value;
  }
  


  @InlineOnly
  private static final <K, V> Iterator<Map.Entry<K, V>> iterator(@NotNull Map<? extends K, ? extends V> $receiver)
  {
    ;
    
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.entrySet().iterator();
  }
  
  @JvmName(name="mutableIterator")
  @InlineOnly
  private static final <K, V> Iterator<Map.Entry<K, V>> mutableIterator(@NotNull Map<K, V> $receiver)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.entrySet().iterator();
  }
  




















  public static final <K, V> void putAll(@NotNull Map<? super K, ? super V> $receiver, @NotNull Pair<? extends K, ? extends V>[] pairs)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(pairs, "pairs"); for (Pair localPair : pairs) { Object key = localPair.component1();Object value = localPair.component2();
      $receiver.put(key, value);
    }
  }
  


  public static final <K, V> void putAll(@NotNull Map<? super K, ? super V> $receiver, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(pairs, "pairs"); for (Pair localPair : pairs) { Object key = localPair.component1();Object value = localPair.component2();
      $receiver.put(key, value);
    }
  }
  


  public static final <K, V> void putAll(@NotNull Map<? super K, ? super V> $receiver, @NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(pairs, "pairs"); for (Pair localPair : pairs) { Object key = localPair.component1();Object value = localPair.component2();
      $receiver.put(key, value);
    }
  }
  















  @NotNull
  public static final <K, V> Map<K, V> filterKeys(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Function1<? super K, Boolean> predicate)
  {
    ;
    














    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(predicate, "predicate");LinkedHashMap result = new LinkedHashMap();
    Map localMap = $receiver; for (Map.Entry entry : localMap.entrySet()) {
      if (((Boolean)predicate.invoke(entry.getKey())).booleanValue()) {
        result.put(entry.getKey(), entry.getValue());
      }
    }
    return (Map)result;
  }
  


  @NotNull
  public static final <K, V> Map<K, V> filterValues(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Function1<? super V, Boolean> predicate)
  {
    ;
    
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(predicate, "predicate");LinkedHashMap result = new LinkedHashMap();
    Map localMap = $receiver; for (Map.Entry entry : localMap.entrySet()) {
      if (((Boolean)predicate.invoke(entry.getValue())).booleanValue()) {
        result.put(entry.getKey(), entry.getValue());
      }
    }
    return (Map)result;
  }
  


  @NotNull
  public static final <K, V, M extends Map<? super K, ? super V>> M filterTo(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull M destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate)
  {
    ;
    

    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");Intrinsics.checkParameterIsNotNull(predicate, "predicate");Map localMap = $receiver; for (Map.Entry element : localMap.entrySet()) {
      if (((Boolean)predicate.invoke(element)).booleanValue()) {
        destination.put(element.getKey(), element.getValue());
      }
    }
    return destination;
  }
  







  @NotNull
  public static final <K, V, M extends Map<? super K, ? super V>> M filterNotTo(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull M destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate)
  {
    ;
    





    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");Intrinsics.checkParameterIsNotNull(predicate, "predicate");Map localMap = $receiver; for (Map.Entry element : localMap.entrySet()) {
      if (!((Boolean)predicate.invoke(element)).booleanValue()) {
        destination.put(element.getKey(), element.getValue());
      }
    }
    return destination;
  }
  














  @NotNull
  public static final <K, V> Map<K, V> toMap(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); if (($receiver instanceof Collection)) {
      switch (((Collection)$receiver).size()) {
      case 0:  tmpTernaryOp = MapsKt.emptyMap(); break;
      case 1:  tmpTernaryOp = MapsKt.mapOf(($receiver instanceof List) ? (Pair)((List)$receiver).get(0) : (Pair)$receiver.iterator().next()); break;
      }
      return 
      

        MapsKt.toMap($receiver, (Map)new LinkedHashMap(MapsKt.mapCapacity(((Collection)$receiver).size())));
    }
    
    return MapsKt.optimizeReadOnlyMap(MapsKt.toMap($receiver, (Map)new LinkedHashMap()));
  }
  

  @NotNull
  public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> $receiver, @NotNull M destination)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");Map localMap1 = destination;Map $receiver = localMap1; int $i$a$1$apply; MapsKt.putAll($receiver, $receiver);return localMap1;
  }
  


  @NotNull
  public static final <K, V> Map<K, V> toMap(@NotNull Pair<? extends K, ? extends V>[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); switch ($receiver.length) {
    case 0: 
      break;
    case 1:  break; }
    return MapsKt.toMap($receiver, (Map)new LinkedHashMap(MapsKt.mapCapacity($receiver.length)));
  }
  
  @NotNull
  public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Pair<? extends K, ? extends V>[] $receiver, @NotNull M destination)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");Map localMap1 = destination;Map $receiver = localMap1; int $i$a$2$apply; MapsKt.putAll($receiver, $receiver);return localMap1;
  }
  


  @NotNull
  public static final <K, V> Map<K, V> toMap(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return MapsKt.optimizeReadOnlyMap(MapsKt.toMap($receiver, (Map)new LinkedHashMap()));
  }
  
  @NotNull
  public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> $receiver, @NotNull M destination)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");Map localMap1 = destination;Map $receiver = localMap1; int $i$a$3$apply; MapsKt.putAll($receiver, $receiver);return localMap1;
  }
  

  @SinceKotlin(version="1.1")
  @NotNull
  public static final <K, V> Map<K, V> toMap(@NotNull Map<? extends K, ? extends V> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); switch ($receiver.size()) {
    case 0: 
      break;
    case 1:  break; }
    return MapsKt.toMutableMap($receiver);
  }
  

  @SinceKotlin(version="1.1")
  @NotNull
  public static final <K, V> Map<K, V> toMutableMap(@NotNull Map<? extends K, ? extends V> $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (Map)new LinkedHashMap($receiver);
  }
  
  @SinceKotlin(version="1.1")
  @NotNull
  public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull M destination)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");Map localMap1 = destination;Map $receiver = localMap1; int $i$a$4$apply; $receiver.putAll($receiver);return localMap1;
  }
  



  @NotNull
  public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Pair<? extends K, ? extends V> pair)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(pair, "pair");LinkedHashMap localLinkedHashMap1 = new LinkedHashMap($receiver);LinkedHashMap $receiver = localLinkedHashMap1; int $i$a$1$apply; $receiver.put(pair.getFirst(), pair.getSecond());return $receiver.isEmpty() ? MapsKt.mapOf(pair) : (Map)localLinkedHashMap1;
  }
  



  @NotNull
  public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(pairs, "pairs");LinkedHashMap localLinkedHashMap1 = new LinkedHashMap($receiver);LinkedHashMap $receiver = localLinkedHashMap1; int $i$a$2$apply; MapsKt.putAll((Map)$receiver, pairs);return $receiver.isEmpty() ? MapsKt.toMap(pairs) : (Map)localLinkedHashMap1;
  }
  



  @NotNull
  public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Pair<? extends K, ? extends V>[] pairs)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(pairs, "pairs");LinkedHashMap localLinkedHashMap1 = new LinkedHashMap($receiver);LinkedHashMap $receiver = localLinkedHashMap1; int $i$a$3$apply; MapsKt.putAll((Map)$receiver, pairs);return $receiver.isEmpty() ? MapsKt.toMap(pairs) : (Map)localLinkedHashMap1;
  }
  



  @NotNull
  public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(pairs, "pairs");LinkedHashMap localLinkedHashMap1 = new LinkedHashMap($receiver);LinkedHashMap $receiver = localLinkedHashMap1; int $i$a$4$apply; MapsKt.putAll((Map)$receiver, pairs);return MapsKt.optimizeReadOnlyMap((Map)localLinkedHashMap1);
  }
  



  @NotNull
  public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Map<? extends K, ? extends V> map)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(map, "map");LinkedHashMap localLinkedHashMap1 = new LinkedHashMap($receiver);LinkedHashMap $receiver = localLinkedHashMap1; int $i$a$5$apply; $receiver.putAll(map);return (Map)localLinkedHashMap1;
  }
  

  @InlineOnly
  private static final <K, V> void plusAssign(@NotNull Map<? super K, ? super V> $receiver, Pair<? extends K, ? extends V> pair)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");$receiver.put(pair.getFirst(), pair.getSecond());
  }
  

  @InlineOnly
  private static final <K, V> void plusAssign(@NotNull Map<? super K, ? super V> $receiver, Iterable<? extends Pair<? extends K, ? extends V>> pairs)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");MapsKt.putAll($receiver, pairs);
  }
  

  @InlineOnly
  private static final <K, V> void plusAssign(@NotNull Map<? super K, ? super V> $receiver, Pair<? extends K, ? extends V>[] pairs)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");MapsKt.putAll($receiver, pairs);
  }
  

  @InlineOnly
  private static final <K, V> void plusAssign(@NotNull Map<? super K, ? super V> $receiver, Sequence<? extends Pair<? extends K, ? extends V>> pairs)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");MapsKt.putAll($receiver, pairs);
  }
  

  @InlineOnly
  private static final <K, V> void plusAssign(@NotNull Map<? super K, ? super V> $receiver, Map<K, ? extends V> map)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");$receiver.putAll(map);
  }
  



  @SinceKotlin(version="1.1")
  @NotNull
  public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> $receiver, K key)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Map localMap1 = MapsKt.toMutableMap($receiver);Map $receiver = localMap1; int $i$a$1$apply; Map localMap2 = $receiver;Object localObject = key;localMap2.remove(localObject);return MapsKt.optimizeReadOnlyMap(localMap1);
  }
  



  @SinceKotlin(version="1.1")
  @NotNull
  public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Iterable<? extends K> keys)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(keys, "keys");Map localMap1 = MapsKt.toMutableMap($receiver);Map $receiver = localMap1; int $i$a$2$apply; Map localMap2 = $receiver;Iterable localIterable = keys;CollectionsKt.removeAll((Collection)localMap2.keySet(), localIterable);return MapsKt.optimizeReadOnlyMap(localMap1);
  }
  



  @SinceKotlin(version="1.1")
  @NotNull
  public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull K[] keys)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(keys, "keys");Map localMap1 = MapsKt.toMutableMap($receiver);Map $receiver = localMap1; int $i$a$3$apply; Map localMap2 = $receiver;Object[] arrayOfObject = keys;CollectionsKt.removeAll((Collection)localMap2.keySet(), arrayOfObject);return MapsKt.optimizeReadOnlyMap(localMap1);
  }
  



  @SinceKotlin(version="1.1")
  @NotNull
  public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Sequence<? extends K> keys)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(keys, "keys");Map localMap1 = MapsKt.toMutableMap($receiver);Map $receiver = localMap1; int $i$a$4$apply; Map localMap2 = $receiver;Sequence localSequence = keys;CollectionsKt.removeAll((Collection)localMap2.keySet(), localSequence);return MapsKt.optimizeReadOnlyMap(localMap1);
  }
  
  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <K, V> void minusAssign(@NotNull Map<K, V> $receiver, K key)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");$receiver.remove(key);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <K, V> void minusAssign(@NotNull Map<K, V> $receiver, Iterable<? extends K> keys)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");CollectionsKt.removeAll((Collection)$receiver.keySet(), keys);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <K, V> void minusAssign(@NotNull Map<K, V> $receiver, K[] keys)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");CollectionsKt.removeAll((Collection)$receiver.keySet(), keys);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <K, V> void minusAssign(@NotNull Map<K, V> $receiver, Sequence<? extends K> keys)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");CollectionsKt.removeAll((Collection)$receiver.keySet(), keys);
  }
  
  @NotNull
  public static final <K, V> Map<K, V> optimizeReadOnlyMap(@NotNull Map<K, ? extends V> $receiver) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); Map localMap; switch ($receiver.size()) {
    case 0: 
      break; case 1:  localMap = $receiver; break;
    }
    return $receiver;
  }
  
  @NotNull
  public static final <K, V, R, M extends Map<? super K, ? super R>> M mapValuesTo(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull M destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");Intrinsics.checkParameterIsNotNull(transform, "transform");Iterable $receiver$iv = (Iterable)$receiver.entrySet();
    















































































    int $i$f$associateByTo;
    















































































    Object element$iv;
    














































































    Map localMap;
    














































































    Object localObject1;
    














































































    for (Iterator localIterator = $receiver$iv.iterator(); localIterator.hasNext(); localMap.put(localObject1, transform.invoke(element$iv)))
    {
















































































































































































































































































































































































































      element$iv = localIterator.next();
      Map.Entry localEntry1 = (Map.Entry)element$iv;localMap = destination;
      int $i$a$1$associateByTo;
      Map.Entry it;
      localObject1 = it.getKey();
    }
    


















































































































































































































































































































































































































    return destination;
  }
  
  @NotNull
  public static final <K, V, R, M extends Map<? super R, ? super V>> M mapKeysTo(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull M destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");Intrinsics.checkParameterIsNotNull(transform, "transform");Iterable $receiver$iv = (Iterable)$receiver.entrySet();
    













































































    int $i$f$associateByTo;
    













































































    Object localObject1;
    













































































    Map localMap;
    













































































    Object localObject2;
    













































































    for (Iterator localIterator = $receiver$iv.iterator(); localIterator.hasNext(); localMap.put(localObject1, localObject2))
    {









































































































































































































































































































































































































      Object element$iv = localIterator.next();
      Map.Entry localEntry1 = (Map.Entry)element$iv;localObject1 = transform.invoke(element$iv);localMap = destination;
      int $i$a$1$associateByTo;
      Map.Entry it;
      localObject2 = it.getValue();
    }
    











































































































































































































































































































































































































    return destination;
  }
  
  @NotNull
  public static final <K, V, R> Map<K, R> mapValues(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(transform, "transform");Map localMap1 = $receiver;Map destination$iv = (Map)new LinkedHashMap(MapsKt.mapCapacity($receiver.size()));
    






















































































































    int $i$f$mapValuesTo;
    






















































































































    Map $receiver$iv;
    






















































































































    Iterable $receiver$iv$iv = (Iterable)$receiver$iv.entrySet();
    int $i$f$associateByTo; Object element$iv$iv; Map localMap2; Object localObject1; for (Iterator localIterator = $receiver$iv$iv.iterator(); localIterator.hasNext(); localMap2.put(localObject1, transform.invoke(element$iv$iv))) {
      element$iv$iv = localIterator.next();
      Map.Entry localEntry1 = (Map.Entry)element$iv$iv;localMap2 = destination$iv;
      int $i$a$1$associateByTo;
      Map.Entry it$iv;
      localObject1 = it$iv.getKey();
    }
    

    return destination$iv;
  }
  
  @NotNull
  public static final <K, V, R> Map<R, V> mapKeys(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(transform, "transform");Map localMap1 = $receiver;Map destination$iv = (Map)new LinkedHashMap(MapsKt.mapCapacity($receiver.size()));
    



















































































































    int $i$f$mapKeysTo;
    



















































































































    Map $receiver$iv;
    


















































































































    Iterable $receiver$iv$iv = (Iterable)$receiver$iv.entrySet();
    int $i$f$associateByTo; Object localObject1; Map localMap2; Object localObject2; for (Iterator localIterator = $receiver$iv$iv.iterator(); localIterator.hasNext(); localMap2.put(localObject1, localObject2)) {
      Object element$iv$iv = localIterator.next();
      Map.Entry localEntry1 = (Map.Entry)element$iv$iv;localObject1 = transform.invoke(element$iv$iv);localMap2 = destination$iv;
      int $i$a$1$associateByTo;
      Map.Entry it$iv;
      localObject2 = it$iv.getValue();
    }
    

    return destination$iv;
  }
  
  @NotNull
  public static final <K, V> Map<K, V> filter(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(predicate, "predicate");Map localMap1 = $receiver;Map destination$iv = (Map)new LinkedHashMap();
    

































































































    int $i$f$filterTo;
    

































































































    Map $receiver$iv;
    

































































































    Map localMap2 = $receiver$iv; for (Map.Entry element$iv : localMap2.entrySet()) {
      if (((Boolean)predicate.invoke(element$iv)).booleanValue()) {
        destination$iv.put(element$iv.getKey(), element$iv.getValue());
      }
    }
    return destination$iv;
  }
  
  @NotNull
  public static final <K, V> Map<K, V> filterNot(@NotNull Map<? extends K, ? extends V> $receiver, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate)
  {
    ;
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(predicate, "predicate");Map localMap1 = $receiver;Map destination$iv = (Map)new LinkedHashMap();
    



























































































    int $i$f$filterNotTo;
    



























































































    Map $receiver$iv;
    


























































































    Map localMap2 = $receiver$iv; for (Map.Entry element$iv : localMap2.entrySet()) {
      if (!((Boolean)predicate.invoke(element$iv)).booleanValue()) {
        destination$iv.put(element$iv.getKey(), element$iv.getValue());
      }
    }
    return destination$iv;
  }
  
  /* Error */
  @InlineOnly
  private static final <K, V> Map<K, V> orEmpty(@Nullable Map<K, ? extends V> $receiver)
  {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: ifnull +6 -> 8
    //   5: goto +7 -> 12
    //   8: pop
    //   9: invokestatic 50	kotlin/collections/MapsKt:emptyMap	()Ljava/util/Map;
    //   12: areturn
    // Line number table:
    //   Java source line #165	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	13	0	$receiver	Map
    //   0	13	1	$i$f$orEmpty	int
  }
  
  /* Error */
  @InlineOnly
  private static final <K, V> V getOrElse(@NotNull Map<K, ? extends V> $receiver, K key, Function0<? extends V> defaultValue)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokeinterface 131 2 0
    //   7: dup
    //   8: ifnull +6 -> 14
    //   11: goto +10 -> 21
    //   14: pop
    //   15: aload_2
    //   16: invokeinterface 110 1 0
    //   21: areturn
    // Line number table:
    //   Java source line #271	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	22	0	$receiver	Map
    //   0	22	1	key	Object
    //   0	22	2	defaultValue	Function0
    //   0	22	3	$i$f$getOrElse	int
  }
  
  public MapsKt__MapsKt() {}
}

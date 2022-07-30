package kotlin.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=5, xi=1, d1={"\000\001\n\000\n\002\020 \n\000\n\002\020\021\n\000\n\002\020\013\n\002\020\030\n\002\020\005\n\002\020\022\n\002\020\f\n\002\020\031\n\002\020\006\n\002\020\023\n\002\020\007\n\002\020\024\n\002\020\b\n\002\020\025\n\002\020\t\n\002\020\026\n\002\020\n\n\002\020\027\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\f\n\002\020\016\n\002\b\024\n\002\020\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\037\n\002\b\005\n\002\020\036\n\002\b\004\n\002\020\017\n\002\b\006\n\002\030\002\n\002\b\f\032#\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\003¢\006\002\020\004\032\020\020\000\032\b\022\004\022\0020\0050\001*\0020\006\032\020\020\000\032\b\022\004\022\0020\0070\001*\0020\b\032\020\020\000\032\b\022\004\022\0020\t0\001*\0020\n\032\020\020\000\032\b\022\004\022\0020\0130\001*\0020\f\032\020\020\000\032\b\022\004\022\0020\r0\001*\0020\016\032\020\020\000\032\b\022\004\022\0020\0170\001*\0020\020\032\020\020\000\032\b\022\004\022\0020\0210\001*\0020\022\032\020\020\000\032\b\022\004\022\0020\0230\001*\0020\024\032U\020\025\032\0020\017\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\0032\006\020\026\032\002H\0022\032\020\027\032\026\022\006\b\000\022\002H\0020\030j\n\022\006\b\000\022\002H\002`\0312\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017¢\006\002\020\034\0329\020\025\032\0020\017\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\0032\006\020\026\032\002H\0022\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017¢\006\002\020\035\032&\020\025\032\0020\017*\0020\b2\006\020\026\032\0020\0072\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032&\020\025\032\0020\017*\0020\n2\006\020\026\032\0020\t2\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032&\020\025\032\0020\017*\0020\f2\006\020\026\032\0020\0132\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032&\020\025\032\0020\017*\0020\0162\006\020\026\032\0020\r2\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032&\020\025\032\0020\017*\0020\0202\006\020\026\032\0020\0172\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032&\020\025\032\0020\017*\0020\0222\006\020\026\032\0020\0212\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032&\020\025\032\0020\017*\0020\0242\006\020\026\032\0020\0232\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\0322\020\036\032\0020\005\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\0032\016\020\037\032\n\022\006\b\001\022\002H\0020\003H\f¢\006\004\b \020!\032\"\020\"\032\0020\017\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\003H\b¢\006\004\b#\020$\032\"\020%\032\0020&\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\003H\b¢\006\004\b'\020(\0320\020)\032\0020\005\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\0032\016\020\037\032\n\022\006\b\001\022\002H\0020\003H\f¢\006\002\020!\032\025\020)\032\0020\005*\0020\0062\006\020\037\032\0020\006H\f\032\025\020)\032\0020\005*\0020\b2\006\020\037\032\0020\bH\f\032\025\020)\032\0020\005*\0020\n2\006\020\037\032\0020\nH\f\032\025\020)\032\0020\005*\0020\f2\006\020\037\032\0020\fH\f\032\025\020)\032\0020\005*\0020\0162\006\020\037\032\0020\016H\f\032\025\020)\032\0020\005*\0020\0202\006\020\037\032\0020\020H\f\032\025\020)\032\0020\005*\0020\0222\006\020\037\032\0020\022H\f\032\025\020)\032\0020\005*\0020\0242\006\020\037\032\0020\024H\f\032 \020*\032\0020\017\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\003H\b¢\006\002\020$\032\r\020*\032\0020\017*\0020\006H\b\032\r\020*\032\0020\017*\0020\bH\b\032\r\020*\032\0020\017*\0020\nH\b\032\r\020*\032\0020\017*\0020\fH\b\032\r\020*\032\0020\017*\0020\016H\b\032\r\020*\032\0020\017*\0020\020H\b\032\r\020*\032\0020\017*\0020\022H\b\032\r\020*\032\0020\017*\0020\024H\b\032 \020+\032\0020&\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\003H\b¢\006\002\020(\032\r\020+\032\0020&*\0020\006H\b\032\r\020+\032\0020&*\0020\bH\b\032\r\020+\032\0020&*\0020\nH\b\032\r\020+\032\0020&*\0020\fH\b\032\r\020+\032\0020&*\0020\016H\b\032\r\020+\032\0020&*\0020\020H\b\032\r\020+\032\0020&*\0020\022H\b\032\r\020+\032\0020&*\0020\024H\b\032Q\020,\032\b\022\004\022\002H\0020\003\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\0032\f\020-\032\b\022\004\022\002H\0020\0032\b\b\002\020.\032\0020\0172\b\b\002\020/\032\0020\0172\b\b\002\0200\032\0020\017H\007¢\006\002\0201\0322\020,\032\0020\006*\0020\0062\006\020-\032\0020\0062\b\b\002\020.\032\0020\0172\b\b\002\020/\032\0020\0172\b\b\002\0200\032\0020\017H\007\0322\020,\032\0020\b*\0020\b2\006\020-\032\0020\b2\b\b\002\020.\032\0020\0172\b\b\002\020/\032\0020\0172\b\b\002\0200\032\0020\017H\007\0322\020,\032\0020\n*\0020\n2\006\020-\032\0020\n2\b\b\002\020.\032\0020\0172\b\b\002\020/\032\0020\0172\b\b\002\0200\032\0020\017H\007\0322\020,\032\0020\f*\0020\f2\006\020-\032\0020\f2\b\b\002\020.\032\0020\0172\b\b\002\020/\032\0020\0172\b\b\002\0200\032\0020\017H\007\0322\020,\032\0020\016*\0020\0162\006\020-\032\0020\0162\b\b\002\020.\032\0020\0172\b\b\002\020/\032\0020\0172\b\b\002\0200\032\0020\017H\007\0322\020,\032\0020\020*\0020\0202\006\020-\032\0020\0202\b\b\002\020.\032\0020\0172\b\b\002\020/\032\0020\0172\b\b\002\0200\032\0020\017H\007\0322\020,\032\0020\022*\0020\0222\006\020-\032\0020\0222\b\b\002\020.\032\0020\0172\b\b\002\020/\032\0020\0172\b\b\002\0200\032\0020\017H\007\0322\020,\032\0020\024*\0020\0242\006\020-\032\0020\0242\b\b\002\020.\032\0020\0172\b\b\002\020/\032\0020\0172\b\b\002\0200\032\0020\017H\007\032$\0202\032\b\022\004\022\002H\0020\003\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H\b¢\006\002\0203\032.\0202\032\n\022\006\022\004\030\001H\0020\003\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\0204\032\0020\017H\b¢\006\002\0205\032\r\0202\032\0020\006*\0020\006H\b\032\025\0202\032\0020\006*\0020\0062\006\0204\032\0020\017H\b\032\r\0202\032\0020\b*\0020\bH\b\032\025\0202\032\0020\b*\0020\b2\006\0204\032\0020\017H\b\032\r\0202\032\0020\n*\0020\nH\b\032\025\0202\032\0020\n*\0020\n2\006\0204\032\0020\017H\b\032\r\0202\032\0020\f*\0020\fH\b\032\025\0202\032\0020\f*\0020\f2\006\0204\032\0020\017H\b\032\r\0202\032\0020\016*\0020\016H\b\032\025\0202\032\0020\016*\0020\0162\006\0204\032\0020\017H\b\032\r\0202\032\0020\020*\0020\020H\b\032\025\0202\032\0020\020*\0020\0202\006\0204\032\0020\017H\b\032\r\0202\032\0020\022*\0020\022H\b\032\025\0202\032\0020\022*\0020\0222\006\0204\032\0020\017H\b\032\r\0202\032\0020\024*\0020\024H\b\032\025\0202\032\0020\024*\0020\0242\006\0204\032\0020\017H\b\0326\0206\032\b\022\004\022\002H\0020\003\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\020\032\032\0020\0172\006\020\033\032\0020\017H\b¢\006\004\b7\0208\032\"\0206\032\0020\006*\0020\0062\006\020\032\032\0020\0172\006\020\033\032\0020\017H\b¢\006\002\b7\032\"\0206\032\0020\b*\0020\b2\006\020\032\032\0020\0172\006\020\033\032\0020\017H\b¢\006\002\b7\032\"\0206\032\0020\n*\0020\n2\006\020\032\032\0020\0172\006\020\033\032\0020\017H\b¢\006\002\b7\032\"\0206\032\0020\f*\0020\f2\006\020\032\032\0020\0172\006\020\033\032\0020\017H\b¢\006\002\b7\032\"\0206\032\0020\016*\0020\0162\006\020\032\032\0020\0172\006\020\033\032\0020\017H\b¢\006\002\b7\032\"\0206\032\0020\020*\0020\0202\006\020\032\032\0020\0172\006\020\033\032\0020\017H\b¢\006\002\b7\032\"\0206\032\0020\022*\0020\0222\006\020\032\032\0020\0172\006\020\033\032\0020\017H\b¢\006\002\b7\032\"\0206\032\0020\024*\0020\0242\006\020\032\032\0020\0172\006\020\033\032\0020\017H\b¢\006\002\b7\0325\0209\032\b\022\004\022\002H\0020\003\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\020\032\032\0020\0172\006\020\033\032\0020\017H\001¢\006\004\b6\0208\032!\0209\032\0020\006*\0020\0062\006\020\032\032\0020\0172\006\020\033\032\0020\017H\001¢\006\002\b6\032!\0209\032\0020\b*\0020\b2\006\020\032\032\0020\0172\006\020\033\032\0020\017H\001¢\006\002\b6\032!\0209\032\0020\n*\0020\n2\006\020\032\032\0020\0172\006\020\033\032\0020\017H\001¢\006\002\b6\032!\0209\032\0020\f*\0020\f2\006\020\032\032\0020\0172\006\020\033\032\0020\017H\001¢\006\002\b6\032!\0209\032\0020\016*\0020\0162\006\020\032\032\0020\0172\006\020\033\032\0020\017H\001¢\006\002\b6\032!\0209\032\0020\020*\0020\0202\006\020\032\032\0020\0172\006\020\033\032\0020\017H\001¢\006\002\b6\032!\0209\032\0020\022*\0020\0222\006\020\032\032\0020\0172\006\020\033\032\0020\017H\001¢\006\002\b6\032!\0209\032\0020\024*\0020\0242\006\020\032\032\0020\0172\006\020\033\032\0020\017H\001¢\006\002\b6\0327\020:\032\0020;\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\020\026\032\002H\0022\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017¢\006\002\020<\032&\020:\032\0020;*\0020\0062\006\020\026\032\0020\0052\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032&\020:\032\0020;*\0020\b2\006\020\026\032\0020\0072\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032&\020:\032\0020;*\0020\n2\006\020\026\032\0020\t2\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032&\020:\032\0020;*\0020\f2\006\020\026\032\0020\0132\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032&\020:\032\0020;*\0020\0162\006\020\026\032\0020\r2\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032&\020:\032\0020;*\0020\0202\006\020\026\032\0020\0172\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032&\020:\032\0020;*\0020\0222\006\020\026\032\0020\0212\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032&\020:\032\0020;*\0020\0242\006\020\026\032\0020\0232\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032-\020=\032\b\022\004\022\002H>0\001\"\004\b\000\020>*\006\022\002\b\0030\0032\f\020?\032\b\022\004\022\002H>0@¢\006\002\020A\032A\020B\032\002HC\"\020\b\000\020C*\n\022\006\b\000\022\002H>0D\"\004\b\001\020>*\006\022\002\b\0030\0032\006\020-\032\002HC2\f\020?\032\b\022\004\022\002H>0@¢\006\002\020E\032,\020F\032\b\022\004\022\002H\0020\003\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\020\026\032\002H\002H\002¢\006\002\020G\0324\020F\032\b\022\004\022\002H\0020\003\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\016\020H\032\n\022\006\b\001\022\002H\0020\003H\002¢\006\002\020I\0322\020F\032\b\022\004\022\002H\0020\003\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\f\020H\032\b\022\004\022\002H\0020JH\002¢\006\002\020K\032\025\020F\032\0020\006*\0020\0062\006\020\026\032\0020\005H\002\032\025\020F\032\0020\006*\0020\0062\006\020H\032\0020\006H\002\032\033\020F\032\0020\006*\0020\0062\f\020H\032\b\022\004\022\0020\0050JH\002\032\025\020F\032\0020\b*\0020\b2\006\020\026\032\0020\007H\002\032\025\020F\032\0020\b*\0020\b2\006\020H\032\0020\bH\002\032\033\020F\032\0020\b*\0020\b2\f\020H\032\b\022\004\022\0020\0070JH\002\032\025\020F\032\0020\n*\0020\n2\006\020\026\032\0020\tH\002\032\025\020F\032\0020\n*\0020\n2\006\020H\032\0020\nH\002\032\033\020F\032\0020\n*\0020\n2\f\020H\032\b\022\004\022\0020\t0JH\002\032\025\020F\032\0020\f*\0020\f2\006\020\026\032\0020\013H\002\032\025\020F\032\0020\f*\0020\f2\006\020H\032\0020\fH\002\032\033\020F\032\0020\f*\0020\f2\f\020H\032\b\022\004\022\0020\0130JH\002\032\025\020F\032\0020\016*\0020\0162\006\020\026\032\0020\rH\002\032\025\020F\032\0020\016*\0020\0162\006\020H\032\0020\016H\002\032\033\020F\032\0020\016*\0020\0162\f\020H\032\b\022\004\022\0020\r0JH\002\032\025\020F\032\0020\020*\0020\0202\006\020\026\032\0020\017H\002\032\025\020F\032\0020\020*\0020\0202\006\020H\032\0020\020H\002\032\033\020F\032\0020\020*\0020\0202\f\020H\032\b\022\004\022\0020\0170JH\002\032\025\020F\032\0020\022*\0020\0222\006\020\026\032\0020\021H\002\032\025\020F\032\0020\022*\0020\0222\006\020H\032\0020\022H\002\032\033\020F\032\0020\022*\0020\0222\f\020H\032\b\022\004\022\0020\0210JH\002\032\025\020F\032\0020\024*\0020\0242\006\020\026\032\0020\023H\002\032\025\020F\032\0020\024*\0020\0242\006\020H\032\0020\024H\002\032\033\020F\032\0020\024*\0020\0242\f\020H\032\b\022\004\022\0020\0230JH\002\032,\020L\032\b\022\004\022\002H\0020\003\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\020\026\032\002H\002H\b¢\006\002\020G\032\035\020M\032\0020;\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\003¢\006\002\020N\032*\020M\032\0020;\"\016\b\000\020\002*\b\022\004\022\002H\0020O*\n\022\006\b\001\022\002H\0020\003H\b¢\006\002\020P\0321\020M\032\0020;\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\0032\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017¢\006\002\020Q\032\n\020M\032\0020;*\0020\b\032\036\020M\032\0020;*\0020\b2\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032\n\020M\032\0020;*\0020\n\032\036\020M\032\0020;*\0020\n2\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032\n\020M\032\0020;*\0020\f\032\036\020M\032\0020;*\0020\f2\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032\n\020M\032\0020;*\0020\016\032\036\020M\032\0020;*\0020\0162\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032\n\020M\032\0020;*\0020\020\032\036\020M\032\0020;*\0020\0202\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032\n\020M\032\0020;*\0020\022\032\036\020M\032\0020;*\0020\0222\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\032\n\020M\032\0020;*\0020\024\032\036\020M\032\0020;*\0020\0242\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017\0329\020R\032\0020;\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\0032\032\020\027\032\026\022\006\b\000\022\002H\0020\030j\n\022\006\b\000\022\002H\002`\031¢\006\002\020S\032M\020R\032\0020;\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\0032\032\020\027\032\026\022\006\b\000\022\002H\0020\030j\n\022\006\b\000\022\002H\002`\0312\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017¢\006\002\020T\032-\020U\032\b\022\004\022\002H\0020V\"\016\b\000\020\002*\b\022\004\022\002H\0020O*\n\022\006\b\001\022\002H\0020\003¢\006\002\020W\032?\020U\032\b\022\004\022\002H\0020V\"\004\b\000\020\002*\n\022\006\b\001\022\002H\0020\0032\032\020\027\032\026\022\006\b\000\022\002H\0020\030j\n\022\006\b\000\022\002H\002`\031¢\006\002\020X\032\020\020U\032\b\022\004\022\0020\0050V*\0020\006\032\020\020U\032\b\022\004\022\0020\0070V*\0020\b\032\020\020U\032\b\022\004\022\0020\t0V*\0020\n\032\020\020U\032\b\022\004\022\0020\0130V*\0020\f\032\020\020U\032\b\022\004\022\0020\r0V*\0020\016\032\020\020U\032\b\022\004\022\0020\0170V*\0020\020\032\020\020U\032\b\022\004\022\0020\0210V*\0020\022\032\020\020U\032\b\022\004\022\0020\0230V*\0020\024\032\025\020Y\032\b\022\004\022\0020\0050\003*\0020\006¢\006\002\020Z\032\025\020Y\032\b\022\004\022\0020\0070\003*\0020\b¢\006\002\020[\032\025\020Y\032\b\022\004\022\0020\t0\003*\0020\n¢\006\002\020\\\032\025\020Y\032\b\022\004\022\0020\0130\003*\0020\f¢\006\002\020]\032\025\020Y\032\b\022\004\022\0020\r0\003*\0020\016¢\006\002\020^\032\025\020Y\032\b\022\004\022\0020\0170\003*\0020\020¢\006\002\020_\032\025\020Y\032\b\022\004\022\0020\0210\003*\0020\022¢\006\002\020`\032\025\020Y\032\b\022\004\022\0020\0230\003*\0020\024¢\006\002\020a¨\006b"}, d2={"asList", "", "T", "", "([Ljava/lang/Object;)Ljava/util/List;", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "binarySearch", "element", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "fromIndex", "toIndex", "([Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;II)I", "([Ljava/lang/Object;Ljava/lang/Object;II)I", "contentDeepEquals", "other", "contentDeepEqualsInline", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "contentDeepHashCode", "contentDeepHashCodeInline", "([Ljava/lang/Object;)I", "contentDeepToString", "", "contentDeepToStringInline", "([Ljava/lang/Object;)Ljava/lang/String;", "contentEquals", "contentHashCode", "contentToString", "copyInto", "destination", "destinationOffset", "startIndex", "endIndex", "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;", "copyOf", "([Ljava/lang/Object;)[Ljava/lang/Object;", "newSize", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "copyOfRange", "copyOfRangeInline", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "copyOfRangeImpl", "fill", "", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "filterIsInstance", "R", "klass", "Ljava/lang/Class;", "([Ljava/lang/Object;Ljava/lang/Class;)Ljava/util/List;", "filterIsInstanceTo", "C", "", "([Ljava/lang/Object;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "plus", "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "elements", "([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;", "", "([Ljava/lang/Object;Ljava/util/Collection;)[Ljava/lang/Object;", "plusElement", "sort", "([Ljava/lang/Object;)V", "", "([Ljava/lang/Comparable;)V", "([Ljava/lang/Object;II)V", "sortWith", "([Ljava/lang/Object;Ljava/util/Comparator;)V", "([Ljava/lang/Object;Ljava/util/Comparator;II)V", "toSortedSet", "Ljava/util/SortedSet;", "([Ljava/lang/Comparable;)Ljava/util/SortedSet;", "([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/SortedSet;", "toTypedArray", "([Z)[Ljava/lang/Boolean;", "([B)[Ljava/lang/Byte;", "([C)[Ljava/lang/Character;", "([D)[Ljava/lang/Double;", "([F)[Ljava/lang/Float;", "([I)[Ljava/lang/Integer;", "([J)[Ljava/lang/Long;", "([S)[Ljava/lang/Short;", "kotlin-stdlib"}, xs="kotlin/collections/ArraysKt")
class ArraysKt___ArraysJvmKt extends ArraysKt__ArraysKt
{
  @NotNull
  public static final <R> List<R> filterIsInstance(@NotNull Object[] $receiver, @NotNull Class<R> klass)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(klass, "klass");return (List)ArraysKt.filterIsInstanceTo($receiver, (Collection)new java.util.ArrayList(), klass);
  }
  


  @NotNull
  public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@NotNull Object[] $receiver, @NotNull C destination, @NotNull Class<R> klass)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");Intrinsics.checkParameterIsNotNull(klass, "klass"); for (Object element : $receiver) if (klass.isInstance(element)) destination.add(element);
    return destination;
  }
  

  @NotNull
  public static final <T> List<T> asList(@NotNull T[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); List tmp10_7 = ArraysUtilJVM.asList($receiver);Intrinsics.checkExpressionValueIsNotNull(tmp10_7, "ArraysUtilJVM.asList(this)");return tmp10_7;
  }
  

  @NotNull
  public static final List<Byte> asList(@NotNull byte[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");(List)new AbstractList() {
      public int getSize() { return $this_asList.length; }
      public boolean isEmpty() { byte[] arrayOfByte = $this_asList;return arrayOfByte.length == 0; }
      public boolean contains(byte element) { return ArraysKt.contains($this_asList, element); } @NotNull
      public Byte get(int index) { return Byte.valueOf($this_asList[index]); }
      public int indexOf(byte element) { return ArraysKt.indexOf($this_asList, element); }
      public int lastIndexOf(byte element) { return ArraysKt.lastIndexOf($this_asList, element); }
    };
  }
  

  @NotNull
  public static final List<Short> asList(@NotNull short[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");(List)new AbstractList() {
      public int getSize() { return $this_asList.length; }
      public boolean isEmpty() { short[] arrayOfShort = $this_asList;return arrayOfShort.length == 0; }
      public boolean contains(short element) { return ArraysKt.contains($this_asList, element); } @NotNull
      public Short get(int index) { return Short.valueOf($this_asList[index]); }
      public int indexOf(short element) { return ArraysKt.indexOf($this_asList, element); }
      public int lastIndexOf(short element) { return ArraysKt.lastIndexOf($this_asList, element); }
    };
  }
  

  @NotNull
  public static final List<Integer> asList(@NotNull int[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");(List)new AbstractList() {
      public int getSize() { return $this_asList.length; }
      public boolean isEmpty() { int[] arrayOfInt = $this_asList;return arrayOfInt.length == 0; }
      public boolean contains(int element) { return ArraysKt.contains($this_asList, element); } @NotNull
      public Integer get(int index) { return Integer.valueOf($this_asList[index]); }
      public int indexOf(int element) { return ArraysKt.indexOf($this_asList, element); }
      public int lastIndexOf(int element) { return ArraysKt.lastIndexOf($this_asList, element); }
    };
  }
  

  @NotNull
  public static final List<Long> asList(@NotNull long[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");(List)new AbstractList() {
      public int getSize() { return $this_asList.length; }
      public boolean isEmpty() { long[] arrayOfLong = $this_asList;return arrayOfLong.length == 0; }
      public boolean contains(long element) { return ArraysKt.contains($this_asList, element); } @NotNull
      public Long get(int index) { return Long.valueOf($this_asList[index]); }
      public int indexOf(long element) { return ArraysKt.indexOf($this_asList, element); }
      public int lastIndexOf(long element) { return ArraysKt.lastIndexOf($this_asList, element); }
    };
  }
  

  @NotNull
  public static final List<Float> asList(@NotNull float[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");(List)new AbstractList() {
      public int getSize() { return $this_asList.length; }
      public boolean isEmpty() { float[] arrayOfFloat = $this_asList;return arrayOfFloat.length == 0; }
      public boolean contains(float element) { return ArraysKt.contains($this_asList, element); } @NotNull
      public Float get(int index) { return Float.valueOf($this_asList[index]); }
      public int indexOf(float element) { return ArraysKt.indexOf($this_asList, element); }
      public int lastIndexOf(float element) { return ArraysKt.lastIndexOf($this_asList, element); }
    };
  }
  

  @NotNull
  public static final List<Double> asList(@NotNull double[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");(List)new AbstractList() {
      public int getSize() { return $this_asList.length; }
      public boolean isEmpty() { double[] arrayOfDouble = $this_asList;return arrayOfDouble.length == 0; }
      public boolean contains(double element) { return ArraysKt.contains($this_asList, element); } @NotNull
      public Double get(int index) { return Double.valueOf($this_asList[index]); }
      public int indexOf(double element) { return ArraysKt.indexOf($this_asList, element); }
      public int lastIndexOf(double element) { return ArraysKt.lastIndexOf($this_asList, element); }
    };
  }
  

  @NotNull
  public static final List<Boolean> asList(@NotNull boolean[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");(List)new AbstractList() {
      public int getSize() { return $this_asList.length; }
      public boolean isEmpty() { boolean[] arrayOfBoolean = $this_asList;return arrayOfBoolean.length == 0; }
      public boolean contains(boolean element) { return ArraysKt.contains($this_asList, element); } @NotNull
      public Boolean get(int index) { return Boolean.valueOf($this_asList[index]); }
      public int indexOf(boolean element) { return ArraysKt.indexOf($this_asList, element); }
      public int lastIndexOf(boolean element) { return ArraysKt.lastIndexOf($this_asList, element); }
    };
  }
  

  @NotNull
  public static final List<Character> asList(@NotNull char[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");(List)new AbstractList() {
      public int getSize() { return $this_asList.length; }
      public boolean isEmpty() { char[] arrayOfChar = $this_asList;return arrayOfChar.length == 0; }
      public boolean contains(char element) { return ArraysKt.contains($this_asList, element); } @NotNull
      public Character get(int index) { return Character.valueOf($this_asList[index]); }
      public int indexOf(char element) { return ArraysKt.indexOf($this_asList, element); }
      public int lastIndexOf(char element) { return ArraysKt.lastIndexOf($this_asList, element); }
    };
  }
  










  public static final <T> int binarySearch(@NotNull T[] $receiver, T element, @NotNull java.util.Comparator<? super T> comparator, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(comparator, "comparator");return Arrays.binarySearch($receiver, fromIndex, toIndex, element, comparator);
  }
  










  public static final <T> int binarySearch(@NotNull T[] $receiver, T element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return Arrays.binarySearch($receiver, fromIndex, toIndex, element);
  }
  










  public static final int binarySearch(@NotNull byte[] $receiver, byte element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return Arrays.binarySearch($receiver, fromIndex, toIndex, element);
  }
  










  public static final int binarySearch(@NotNull short[] $receiver, short element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return Arrays.binarySearch($receiver, fromIndex, toIndex, element);
  }
  










  public static final int binarySearch(@NotNull int[] $receiver, int element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return Arrays.binarySearch($receiver, fromIndex, toIndex, element);
  }
  










  public static final int binarySearch(@NotNull long[] $receiver, long element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return Arrays.binarySearch($receiver, fromIndex, toIndex, element);
  }
  










  public static final int binarySearch(@NotNull float[] $receiver, float element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return Arrays.binarySearch($receiver, fromIndex, toIndex, element);
  }
  










  public static final int binarySearch(@NotNull double[] $receiver, double element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return Arrays.binarySearch($receiver, fromIndex, toIndex, element);
  }
  










  public static final int binarySearch(@NotNull char[] $receiver, char element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return Arrays.binarySearch($receiver, fromIndex, toIndex, element);
  }
  




  @SinceKotlin(version="1.1")
  @JvmName(name="contentDeepEqualsInline")
  @InlineOnly
  private static final <T> boolean contentDeepEqualsInline(@NotNull T[] $receiver, T[] other)
  {
    ;
    



    if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      return ArraysKt.contentDeepEquals($receiver, other);
    }
    return Arrays.deepEquals($receiver, other);
  }
  


  @SinceKotlin(version="1.1")
  @JvmName(name="contentDeepHashCodeInline")
  @InlineOnly
  private static final <T> int contentDeepHashCodeInline(@NotNull T[] $receiver)
  {
    ;
    

    if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      return ArraysKt.contentDeepHashCode($receiver);
    }
    return Arrays.deepHashCode($receiver);
  }
  




  @SinceKotlin(version="1.1")
  @JvmName(name="contentDeepToStringInline")
  @InlineOnly
  private static final <T> String contentDeepToStringInline(@NotNull T[] $receiver)
  {
    ;
    


    if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
      return ArraysKt.contentDeepToString($receiver);
    }
    String tmp18_15 = Arrays.deepToString($receiver);Intrinsics.checkExpressionValueIsNotNull(tmp18_15, "java.util.Arrays.deepToString(this)");return tmp18_15;
  }
  



  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <T> boolean contentEquals(@NotNull T[] $receiver, T[] other)
  {
    ;
    

    return Arrays.equals($receiver, other);
  }
  



  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final boolean contentEquals(@NotNull byte[] $receiver, byte[] other)
  {
    ;
    

    return Arrays.equals($receiver, other);
  }
  



  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final boolean contentEquals(@NotNull short[] $receiver, short[] other)
  {
    ;
    

    return Arrays.equals($receiver, other);
  }
  



  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final boolean contentEquals(@NotNull int[] $receiver, int[] other)
  {
    ;
    

    return Arrays.equals($receiver, other);
  }
  



  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final boolean contentEquals(@NotNull long[] $receiver, long[] other)
  {
    ;
    

    return Arrays.equals($receiver, other);
  }
  



  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final boolean contentEquals(@NotNull float[] $receiver, float[] other)
  {
    ;
    

    return Arrays.equals($receiver, other);
  }
  



  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final boolean contentEquals(@NotNull double[] $receiver, double[] other)
  {
    ;
    

    return Arrays.equals($receiver, other);
  }
  



  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final boolean contentEquals(@NotNull boolean[] $receiver, boolean[] other)
  {
    ;
    

    return Arrays.equals($receiver, other);
  }
  



  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final boolean contentEquals(@NotNull char[] $receiver, char[] other)
  {
    ;
    

    return Arrays.equals($receiver, other);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <T> int contentHashCode(@NotNull T[] $receiver)
  {
    ;
    return Arrays.hashCode($receiver);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final int contentHashCode(@NotNull byte[] $receiver)
  {
    ;
    return Arrays.hashCode($receiver);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final int contentHashCode(@NotNull short[] $receiver)
  {
    ;
    return Arrays.hashCode($receiver);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final int contentHashCode(@NotNull int[] $receiver)
  {
    ;
    return Arrays.hashCode($receiver);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final int contentHashCode(@NotNull long[] $receiver)
  {
    ;
    return Arrays.hashCode($receiver);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final int contentHashCode(@NotNull float[] $receiver)
  {
    ;
    return Arrays.hashCode($receiver);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final int contentHashCode(@NotNull double[] $receiver)
  {
    ;
    return Arrays.hashCode($receiver);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final int contentHashCode(@NotNull boolean[] $receiver)
  {
    ;
    return Arrays.hashCode($receiver);
  }
  

  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final int contentHashCode(@NotNull char[] $receiver)
  {
    ;
    return Arrays.hashCode($receiver);
  }
  


  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final <T> String contentToString(@NotNull T[] $receiver)
  {
    ;
    
    String tmp4_1 = Arrays.toString($receiver);Intrinsics.checkExpressionValueIsNotNull(tmp4_1, "java.util.Arrays.toString(this)");return tmp4_1;
  }
  


  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final String contentToString(@NotNull byte[] $receiver)
  {
    ;
    
    String tmp4_1 = Arrays.toString($receiver);Intrinsics.checkExpressionValueIsNotNull(tmp4_1, "java.util.Arrays.toString(this)");return tmp4_1;
  }
  


  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final String contentToString(@NotNull short[] $receiver)
  {
    ;
    
    String tmp4_1 = Arrays.toString($receiver);Intrinsics.checkExpressionValueIsNotNull(tmp4_1, "java.util.Arrays.toString(this)");return tmp4_1;
  }
  


  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final String contentToString(@NotNull int[] $receiver)
  {
    ;
    
    String tmp4_1 = Arrays.toString($receiver);Intrinsics.checkExpressionValueIsNotNull(tmp4_1, "java.util.Arrays.toString(this)");return tmp4_1;
  }
  


  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final String contentToString(@NotNull long[] $receiver)
  {
    ;
    
    String tmp4_1 = Arrays.toString($receiver);Intrinsics.checkExpressionValueIsNotNull(tmp4_1, "java.util.Arrays.toString(this)");return tmp4_1;
  }
  


  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final String contentToString(@NotNull float[] $receiver)
  {
    ;
    
    String tmp4_1 = Arrays.toString($receiver);Intrinsics.checkExpressionValueIsNotNull(tmp4_1, "java.util.Arrays.toString(this)");return tmp4_1;
  }
  


  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final String contentToString(@NotNull double[] $receiver)
  {
    ;
    
    String tmp4_1 = Arrays.toString($receiver);Intrinsics.checkExpressionValueIsNotNull(tmp4_1, "java.util.Arrays.toString(this)");return tmp4_1;
  }
  


  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final String contentToString(@NotNull boolean[] $receiver)
  {
    ;
    
    String tmp4_1 = Arrays.toString($receiver);Intrinsics.checkExpressionValueIsNotNull(tmp4_1, "java.util.Arrays.toString(this)");return tmp4_1;
  }
  


  @SinceKotlin(version="1.1")
  @InlineOnly
  private static final String contentToString(@NotNull char[] $receiver)
  {
    ;
    
    String tmp4_1 = Arrays.toString($receiver);Intrinsics.checkExpressionValueIsNotNull(tmp4_1, "java.util.Arrays.toString(this)");return tmp4_1;
  }
  















  @SinceKotlin(version="1.3")
  @NotNull
  public static final <T> T[] copyInto(@NotNull T[] $receiver, @NotNull T[] destination, int destinationOffset, int startIndex, int endIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");System.arraycopy($receiver, startIndex, destination, destinationOffset, endIndex - startIndex);
    return destination;
  }
  















  @SinceKotlin(version="1.3")
  @NotNull
  public static final byte[] copyInto(@NotNull byte[] $receiver, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");System.arraycopy($receiver, startIndex, destination, destinationOffset, endIndex - startIndex);
    return destination;
  }
  















  @SinceKotlin(version="1.3")
  @NotNull
  public static final short[] copyInto(@NotNull short[] $receiver, @NotNull short[] destination, int destinationOffset, int startIndex, int endIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");System.arraycopy($receiver, startIndex, destination, destinationOffset, endIndex - startIndex);
    return destination;
  }
  















  @SinceKotlin(version="1.3")
  @NotNull
  public static final int[] copyInto(@NotNull int[] $receiver, @NotNull int[] destination, int destinationOffset, int startIndex, int endIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");System.arraycopy($receiver, startIndex, destination, destinationOffset, endIndex - startIndex);
    return destination;
  }
  















  @SinceKotlin(version="1.3")
  @NotNull
  public static final long[] copyInto(@NotNull long[] $receiver, @NotNull long[] destination, int destinationOffset, int startIndex, int endIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");System.arraycopy($receiver, startIndex, destination, destinationOffset, endIndex - startIndex);
    return destination;
  }
  















  @SinceKotlin(version="1.3")
  @NotNull
  public static final float[] copyInto(@NotNull float[] $receiver, @NotNull float[] destination, int destinationOffset, int startIndex, int endIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");System.arraycopy($receiver, startIndex, destination, destinationOffset, endIndex - startIndex);
    return destination;
  }
  















  @SinceKotlin(version="1.3")
  @NotNull
  public static final double[] copyInto(@NotNull double[] $receiver, @NotNull double[] destination, int destinationOffset, int startIndex, int endIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");System.arraycopy($receiver, startIndex, destination, destinationOffset, endIndex - startIndex);
    return destination;
  }
  















  @SinceKotlin(version="1.3")
  @NotNull
  public static final boolean[] copyInto(@NotNull boolean[] $receiver, @NotNull boolean[] destination, int destinationOffset, int startIndex, int endIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");System.arraycopy($receiver, startIndex, destination, destinationOffset, endIndex - startIndex);
    return destination;
  }
  















  @SinceKotlin(version="1.3")
  @NotNull
  public static final char[] copyInto(@NotNull char[] $receiver, @NotNull char[] destination, int destinationOffset, int startIndex, int endIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(destination, "destination");System.arraycopy($receiver, startIndex, destination, destinationOffset, endIndex - startIndex);
    return destination;
  }
  


  @InlineOnly
  private static final <T> T[] copyOf(@NotNull T[] $receiver)
  {
    ;
    
    Object[] tmp6_3 = Arrays.copyOf($receiver, $receiver.length);Intrinsics.checkExpressionValueIsNotNull(tmp6_3, "java.util.Arrays.copyOf(this, size)");return tmp6_3;
  }
  


  @InlineOnly
  private static final byte[] copyOf(@NotNull byte[] $receiver)
  {
    ;
    
    byte[] tmp6_3 = Arrays.copyOf($receiver, $receiver.length);Intrinsics.checkExpressionValueIsNotNull(tmp6_3, "java.util.Arrays.copyOf(this, size)");return tmp6_3;
  }
  


  @InlineOnly
  private static final short[] copyOf(@NotNull short[] $receiver)
  {
    ;
    
    short[] tmp6_3 = Arrays.copyOf($receiver, $receiver.length);Intrinsics.checkExpressionValueIsNotNull(tmp6_3, "java.util.Arrays.copyOf(this, size)");return tmp6_3;
  }
  


  @InlineOnly
  private static final int[] copyOf(@NotNull int[] $receiver)
  {
    ;
    
    int[] tmp6_3 = Arrays.copyOf($receiver, $receiver.length);Intrinsics.checkExpressionValueIsNotNull(tmp6_3, "java.util.Arrays.copyOf(this, size)");return tmp6_3;
  }
  


  @InlineOnly
  private static final long[] copyOf(@NotNull long[] $receiver)
  {
    ;
    
    long[] tmp6_3 = Arrays.copyOf($receiver, $receiver.length);Intrinsics.checkExpressionValueIsNotNull(tmp6_3, "java.util.Arrays.copyOf(this, size)");return tmp6_3;
  }
  


  @InlineOnly
  private static final float[] copyOf(@NotNull float[] $receiver)
  {
    ;
    
    float[] tmp6_3 = Arrays.copyOf($receiver, $receiver.length);Intrinsics.checkExpressionValueIsNotNull(tmp6_3, "java.util.Arrays.copyOf(this, size)");return tmp6_3;
  }
  


  @InlineOnly
  private static final double[] copyOf(@NotNull double[] $receiver)
  {
    ;
    
    double[] tmp6_3 = Arrays.copyOf($receiver, $receiver.length);Intrinsics.checkExpressionValueIsNotNull(tmp6_3, "java.util.Arrays.copyOf(this, size)");return tmp6_3;
  }
  


  @InlineOnly
  private static final boolean[] copyOf(@NotNull boolean[] $receiver)
  {
    ;
    
    boolean[] tmp6_3 = Arrays.copyOf($receiver, $receiver.length);Intrinsics.checkExpressionValueIsNotNull(tmp6_3, "java.util.Arrays.copyOf(this, size)");return tmp6_3;
  }
  


  @InlineOnly
  private static final char[] copyOf(@NotNull char[] $receiver)
  {
    ;
    
    char[] tmp6_3 = Arrays.copyOf($receiver, $receiver.length);Intrinsics.checkExpressionValueIsNotNull(tmp6_3, "java.util.Arrays.copyOf(this, size)");return tmp6_3;
  }
  




  @InlineOnly
  private static final byte[] copyOf(@NotNull byte[] $receiver, int newSize)
  {
    ;
    


    byte[] tmp5_2 = Arrays.copyOf($receiver, newSize);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "java.util.Arrays.copyOf(this, newSize)");return tmp5_2;
  }
  




  @InlineOnly
  private static final short[] copyOf(@NotNull short[] $receiver, int newSize)
  {
    ;
    


    short[] tmp5_2 = Arrays.copyOf($receiver, newSize);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "java.util.Arrays.copyOf(this, newSize)");return tmp5_2;
  }
  




  @InlineOnly
  private static final int[] copyOf(@NotNull int[] $receiver, int newSize)
  {
    ;
    


    int[] tmp5_2 = Arrays.copyOf($receiver, newSize);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "java.util.Arrays.copyOf(this, newSize)");return tmp5_2;
  }
  




  @InlineOnly
  private static final long[] copyOf(@NotNull long[] $receiver, int newSize)
  {
    ;
    


    long[] tmp5_2 = Arrays.copyOf($receiver, newSize);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "java.util.Arrays.copyOf(this, newSize)");return tmp5_2;
  }
  




  @InlineOnly
  private static final float[] copyOf(@NotNull float[] $receiver, int newSize)
  {
    ;
    


    float[] tmp5_2 = Arrays.copyOf($receiver, newSize);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "java.util.Arrays.copyOf(this, newSize)");return tmp5_2;
  }
  




  @InlineOnly
  private static final double[] copyOf(@NotNull double[] $receiver, int newSize)
  {
    ;
    


    double[] tmp5_2 = Arrays.copyOf($receiver, newSize);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "java.util.Arrays.copyOf(this, newSize)");return tmp5_2;
  }
  




  @InlineOnly
  private static final boolean[] copyOf(@NotNull boolean[] $receiver, int newSize)
  {
    ;
    


    boolean[] tmp5_2 = Arrays.copyOf($receiver, newSize);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "java.util.Arrays.copyOf(this, newSize)");return tmp5_2;
  }
  




  @InlineOnly
  private static final char[] copyOf(@NotNull char[] $receiver, int newSize)
  {
    ;
    


    char[] tmp5_2 = Arrays.copyOf($receiver, newSize);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "java.util.Arrays.copyOf(this, newSize)");return tmp5_2;
  }
  




  @InlineOnly
  private static final <T> T[] copyOf(@NotNull T[] $receiver, int newSize)
  {
    ;
    


    Object[] tmp5_2 = Arrays.copyOf($receiver, newSize);Intrinsics.checkExpressionValueIsNotNull(tmp5_2, "java.util.Arrays.copyOf(this, newSize)");return tmp5_2;
  }
  




  @JvmName(name="copyOfRangeInline")
  @InlineOnly
  private static final <T> T[] copyOfRangeInline(@NotNull T[] $receiver, int fromIndex, int toIndex)
  {
    ;
    


    if (toIndex > $receiver.length) throw ((Throwable)new IndexOutOfBoundsException("toIndex: " + toIndex + ", size: " + $receiver.length));
    Object[] tmp72_69 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp72_69, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp72_69;
  }
  




  @JvmName(name="copyOfRangeInline")
  @InlineOnly
  private static final byte[] copyOfRangeInline(@NotNull byte[] $receiver, int fromIndex, int toIndex)
  {
    ;
    



    if (toIndex > $receiver.length) throw ((Throwable)new IndexOutOfBoundsException("toIndex: " + toIndex + ", size: " + $receiver.length));
    byte[] tmp72_69 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp72_69, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp72_69;
  }
  




  @JvmName(name="copyOfRangeInline")
  @InlineOnly
  private static final short[] copyOfRangeInline(@NotNull short[] $receiver, int fromIndex, int toIndex)
  {
    ;
    



    if (toIndex > $receiver.length) throw ((Throwable)new IndexOutOfBoundsException("toIndex: " + toIndex + ", size: " + $receiver.length));
    short[] tmp72_69 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp72_69, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp72_69;
  }
  




  @JvmName(name="copyOfRangeInline")
  @InlineOnly
  private static final int[] copyOfRangeInline(@NotNull int[] $receiver, int fromIndex, int toIndex)
  {
    ;
    



    if (toIndex > $receiver.length) throw ((Throwable)new IndexOutOfBoundsException("toIndex: " + toIndex + ", size: " + $receiver.length));
    int[] tmp72_69 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp72_69, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp72_69;
  }
  




  @JvmName(name="copyOfRangeInline")
  @InlineOnly
  private static final long[] copyOfRangeInline(@NotNull long[] $receiver, int fromIndex, int toIndex)
  {
    ;
    



    if (toIndex > $receiver.length) throw ((Throwable)new IndexOutOfBoundsException("toIndex: " + toIndex + ", size: " + $receiver.length));
    long[] tmp72_69 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp72_69, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp72_69;
  }
  




  @JvmName(name="copyOfRangeInline")
  @InlineOnly
  private static final float[] copyOfRangeInline(@NotNull float[] $receiver, int fromIndex, int toIndex)
  {
    ;
    



    if (toIndex > $receiver.length) throw ((Throwable)new IndexOutOfBoundsException("toIndex: " + toIndex + ", size: " + $receiver.length));
    float[] tmp72_69 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp72_69, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp72_69;
  }
  




  @JvmName(name="copyOfRangeInline")
  @InlineOnly
  private static final double[] copyOfRangeInline(@NotNull double[] $receiver, int fromIndex, int toIndex)
  {
    ;
    



    if (toIndex > $receiver.length) throw ((Throwable)new IndexOutOfBoundsException("toIndex: " + toIndex + ", size: " + $receiver.length));
    double[] tmp72_69 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp72_69, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp72_69;
  }
  




  @JvmName(name="copyOfRangeInline")
  @InlineOnly
  private static final boolean[] copyOfRangeInline(@NotNull boolean[] $receiver, int fromIndex, int toIndex)
  {
    ;
    



    if (toIndex > $receiver.length) throw ((Throwable)new IndexOutOfBoundsException("toIndex: " + toIndex + ", size: " + $receiver.length));
    boolean[] tmp72_69 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp72_69, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp72_69;
  }
  




  @JvmName(name="copyOfRangeInline")
  @InlineOnly
  private static final char[] copyOfRangeInline(@NotNull char[] $receiver, int fromIndex, int toIndex)
  {
    ;
    



    if (toIndex > $receiver.length) throw ((Throwable)new IndexOutOfBoundsException("toIndex: " + toIndex + ", size: " + $receiver.length));
    char[] tmp72_69 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp72_69, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp72_69;
  }
  
  @SinceKotlin(version="1.3")
  @kotlin.PublishedApi
  @JvmName(name="copyOfRange")
  @NotNull
  public static final <T> T[] copyOfRange(@NotNull T[] $receiver, int fromIndex, int toIndex) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");ArraysKt.copyOfRangeToIndexCheck(toIndex, $receiver.length); Object[] 
      tmp18_15 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp18_15, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp18_15;
  }
  
  @SinceKotlin(version="1.3")
  @kotlin.PublishedApi
  @JvmName(name="copyOfRange")
  @NotNull
  public static final byte[] copyOfRange(@NotNull byte[] $receiver, int fromIndex, int toIndex) { Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");ArraysKt.copyOfRangeToIndexCheck(toIndex, $receiver.length); byte[] 
      tmp18_15 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp18_15, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp18_15;
  }
  
  @SinceKotlin(version="1.3")
  @kotlin.PublishedApi
  @JvmName(name="copyOfRange")
  @NotNull
  public static final short[] copyOfRange(@NotNull short[] $receiver, int fromIndex, int toIndex) { Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");ArraysKt.copyOfRangeToIndexCheck(toIndex, $receiver.length); short[] 
      tmp18_15 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp18_15, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp18_15;
  }
  
  @SinceKotlin(version="1.3")
  @kotlin.PublishedApi
  @JvmName(name="copyOfRange")
  @NotNull
  public static final int[] copyOfRange(@NotNull int[] $receiver, int fromIndex, int toIndex) { Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");ArraysKt.copyOfRangeToIndexCheck(toIndex, $receiver.length); int[] 
      tmp18_15 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp18_15, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp18_15;
  }
  
  @SinceKotlin(version="1.3")
  @kotlin.PublishedApi
  @JvmName(name="copyOfRange")
  @NotNull
  public static final long[] copyOfRange(@NotNull long[] $receiver, int fromIndex, int toIndex) { Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");ArraysKt.copyOfRangeToIndexCheck(toIndex, $receiver.length); long[] 
      tmp18_15 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp18_15, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp18_15;
  }
  
  @SinceKotlin(version="1.3")
  @kotlin.PublishedApi
  @JvmName(name="copyOfRange")
  @NotNull
  public static final float[] copyOfRange(@NotNull float[] $receiver, int fromIndex, int toIndex) { Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");ArraysKt.copyOfRangeToIndexCheck(toIndex, $receiver.length); float[] 
      tmp18_15 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp18_15, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp18_15;
  }
  
  @SinceKotlin(version="1.3")
  @kotlin.PublishedApi
  @JvmName(name="copyOfRange")
  @NotNull
  public static final double[] copyOfRange(@NotNull double[] $receiver, int fromIndex, int toIndex) { Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");ArraysKt.copyOfRangeToIndexCheck(toIndex, $receiver.length); double[] 
      tmp18_15 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp18_15, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp18_15;
  }
  
  @SinceKotlin(version="1.3")
  @kotlin.PublishedApi
  @JvmName(name="copyOfRange")
  @NotNull
  public static final boolean[] copyOfRange(@NotNull boolean[] $receiver, int fromIndex, int toIndex) { Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");ArraysKt.copyOfRangeToIndexCheck(toIndex, $receiver.length); boolean[] 
      tmp18_15 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp18_15, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp18_15;
  }
  
  @SinceKotlin(version="1.3")
  @kotlin.PublishedApi
  @JvmName(name="copyOfRange")
  @NotNull
  public static final char[] copyOfRange(@NotNull char[] $receiver, int fromIndex, int toIndex) { Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");ArraysKt.copyOfRangeToIndexCheck(toIndex, $receiver.length); char[] 
      tmp18_15 = Arrays.copyOfRange($receiver, fromIndex, toIndex);Intrinsics.checkExpressionValueIsNotNull(tmp18_15, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");return tmp18_15;
  }
  


  public static final <T> void fill(@NotNull T[] $receiver, T element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Arrays.fill($receiver, fromIndex, toIndex, element);
  }
  


  public static final void fill(@NotNull byte[] $receiver, byte element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Arrays.fill($receiver, fromIndex, toIndex, element);
  }
  


  public static final void fill(@NotNull short[] $receiver, short element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Arrays.fill($receiver, fromIndex, toIndex, element);
  }
  


  public static final void fill(@NotNull int[] $receiver, int element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Arrays.fill($receiver, fromIndex, toIndex, element);
  }
  


  public static final void fill(@NotNull long[] $receiver, long element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Arrays.fill($receiver, fromIndex, toIndex, element);
  }
  


  public static final void fill(@NotNull float[] $receiver, float element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Arrays.fill($receiver, fromIndex, toIndex, element);
  }
  


  public static final void fill(@NotNull double[] $receiver, double element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Arrays.fill($receiver, fromIndex, toIndex, element);
  }
  


  public static final void fill(@NotNull boolean[] $receiver, boolean element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Arrays.fill($receiver, fromIndex, toIndex, element);
  }
  


  public static final void fill(@NotNull char[] $receiver, char element, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Arrays.fill($receiver, fromIndex, toIndex, element);
  }
  

  @NotNull
  public static final <T> T[] plus(@NotNull T[] $receiver, T element)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int index = $receiver.length;
    Object[] result = Arrays.copyOf($receiver, index + 1);
    result[index] = element; Object[] 
      tmp22_21 = result;Intrinsics.checkExpressionValueIsNotNull(tmp22_21, "result");return tmp22_21;
  }
  

  @NotNull
  public static final byte[] plus(@NotNull byte[] $receiver, byte element)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int index = $receiver.length;
    byte[] result = Arrays.copyOf($receiver, index + 1);
    result[index] = element; byte[] 
      tmp22_21 = result;Intrinsics.checkExpressionValueIsNotNull(tmp22_21, "result");return tmp22_21;
  }
  

  @NotNull
  public static final short[] plus(@NotNull short[] $receiver, short element)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int index = $receiver.length;
    short[] result = Arrays.copyOf($receiver, index + 1);
    result[index] = element; short[] 
      tmp22_21 = result;Intrinsics.checkExpressionValueIsNotNull(tmp22_21, "result");return tmp22_21;
  }
  

  @NotNull
  public static final int[] plus(@NotNull int[] $receiver, int element)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int index = $receiver.length;
    int[] result = Arrays.copyOf($receiver, index + 1);
    result[index] = element; int[] 
      tmp22_21 = result;Intrinsics.checkExpressionValueIsNotNull(tmp22_21, "result");return tmp22_21;
  }
  

  @NotNull
  public static final long[] plus(@NotNull long[] $receiver, long element)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int index = $receiver.length;
    long[] result = Arrays.copyOf($receiver, index + 1);
    result[index] = element; long[] 
      tmp25_23 = result;Intrinsics.checkExpressionValueIsNotNull(tmp25_23, "result");return tmp25_23;
  }
  

  @NotNull
  public static final float[] plus(@NotNull float[] $receiver, float element)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int index = $receiver.length;
    float[] result = Arrays.copyOf($receiver, index + 1);
    result[index] = element; float[] 
      tmp22_21 = result;Intrinsics.checkExpressionValueIsNotNull(tmp22_21, "result");return tmp22_21;
  }
  

  @NotNull
  public static final double[] plus(@NotNull double[] $receiver, double element)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int index = $receiver.length;
    double[] result = Arrays.copyOf($receiver, index + 1);
    result[index] = element; double[] 
      tmp25_23 = result;Intrinsics.checkExpressionValueIsNotNull(tmp25_23, "result");return tmp25_23;
  }
  

  @NotNull
  public static final boolean[] plus(@NotNull boolean[] $receiver, boolean element)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int index = $receiver.length;
    boolean[] result = Arrays.copyOf($receiver, index + 1);
    result[index] = element; boolean[] 
      tmp22_21 = result;Intrinsics.checkExpressionValueIsNotNull(tmp22_21, "result");return tmp22_21;
  }
  

  @NotNull
  public static final char[] plus(@NotNull char[] $receiver, char element)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");int index = $receiver.length;
    char[] result = Arrays.copyOf($receiver, index + 1);
    result[index] = element; char[] 
      tmp22_21 = result;Intrinsics.checkExpressionValueIsNotNull(tmp22_21, "result");return tmp22_21;
  }
  

  @NotNull
  public static final <T> T[] plus(@NotNull T[] $receiver, @NotNull Collection<? extends T> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int index = $receiver.length;
    Object[] result = Arrays.copyOf($receiver, index + elements.size());
    Object element; for (Iterator localIterator = elements.iterator(); localIterator.hasNext(); result[(index++)] = element) element = localIterator.next();
    Object[] tmp68_67 = result;Intrinsics.checkExpressionValueIsNotNull(tmp68_67, "result");return tmp68_67;
  }
  

  @NotNull
  public static final byte[] plus(@NotNull byte[] $receiver, @NotNull Collection<Byte> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int index = $receiver.length;
    byte[] result = Arrays.copyOf($receiver, index + elements.size());
    byte element; for (Iterator localIterator = elements.iterator(); localIterator.hasNext(); result[(index++)] = element) element = ((Number)localIterator.next()).byteValue();
    byte[] tmp74_73 = result;Intrinsics.checkExpressionValueIsNotNull(tmp74_73, "result");return tmp74_73;
  }
  

  @NotNull
  public static final short[] plus(@NotNull short[] $receiver, @NotNull Collection<Short> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int index = $receiver.length;
    short[] result = Arrays.copyOf($receiver, index + elements.size());
    short element; for (Iterator localIterator = elements.iterator(); localIterator.hasNext(); result[(index++)] = element) element = ((Number)localIterator.next()).shortValue();
    short[] tmp74_73 = result;Intrinsics.checkExpressionValueIsNotNull(tmp74_73, "result");return tmp74_73;
  }
  

  @NotNull
  public static final int[] plus(@NotNull int[] $receiver, @NotNull Collection<Integer> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int index = $receiver.length;
    int[] result = Arrays.copyOf($receiver, index + elements.size());
    int element; for (Iterator localIterator = elements.iterator(); localIterator.hasNext(); result[(index++)] = element) element = ((Number)localIterator.next()).intValue();
    int[] tmp74_73 = result;Intrinsics.checkExpressionValueIsNotNull(tmp74_73, "result");return tmp74_73;
  }
  

  @NotNull
  public static final long[] plus(@NotNull long[] $receiver, @NotNull Collection<Long> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int index = $receiver.length;
    long[] result = Arrays.copyOf($receiver, index + elements.size());
    long element; for (Iterator localIterator = elements.iterator(); localIterator.hasNext(); result[(index++)] = element) element = ((Number)localIterator.next()).longValue();
    long[] tmp74_73 = result;Intrinsics.checkExpressionValueIsNotNull(tmp74_73, "result");return tmp74_73;
  }
  

  @NotNull
  public static final float[] plus(@NotNull float[] $receiver, @NotNull Collection<Float> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int index = $receiver.length;
    float[] result = Arrays.copyOf($receiver, index + elements.size());
    float element; for (Iterator localIterator = elements.iterator(); localIterator.hasNext(); result[(index++)] = element) element = ((Number)localIterator.next()).floatValue();
    float[] tmp74_73 = result;Intrinsics.checkExpressionValueIsNotNull(tmp74_73, "result");return tmp74_73;
  }
  

  @NotNull
  public static final double[] plus(@NotNull double[] $receiver, @NotNull Collection<Double> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int index = $receiver.length;
    double[] result = Arrays.copyOf($receiver, index + elements.size());
    double element; for (Iterator localIterator = elements.iterator(); localIterator.hasNext(); result[(index++)] = element) element = ((Number)localIterator.next()).doubleValue();
    double[] tmp74_73 = result;Intrinsics.checkExpressionValueIsNotNull(tmp74_73, "result");return tmp74_73;
  }
  

  @NotNull
  public static final boolean[] plus(@NotNull boolean[] $receiver, @NotNull Collection<Boolean> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int index = $receiver.length;
    boolean[] result = Arrays.copyOf($receiver, index + elements.size());
    boolean element; for (Iterator localIterator = elements.iterator(); localIterator.hasNext(); result[(index++)] = element) element = ((Boolean)localIterator.next()).booleanValue();
    boolean[] tmp74_73 = result;Intrinsics.checkExpressionValueIsNotNull(tmp74_73, "result");return tmp74_73;
  }
  

  @NotNull
  public static final char[] plus(@NotNull char[] $receiver, @NotNull Collection<Character> elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int index = $receiver.length;
    char[] result = Arrays.copyOf($receiver, index + elements.size());
    char element; for (Iterator localIterator = elements.iterator(); localIterator.hasNext(); result[(index++)] = element) element = ((Character)localIterator.next()).charValue();
    char[] tmp74_73 = result;Intrinsics.checkExpressionValueIsNotNull(tmp74_73, "result");return tmp74_73;
  }
  

  @NotNull
  public static final <T> T[] plus(@NotNull T[] $receiver, @NotNull T[] elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int thisSize = $receiver.length;
    int arraySize = elements.length;
    Object[] result = Arrays.copyOf($receiver, thisSize + arraySize);
    System.arraycopy(elements, 0, result, thisSize, arraySize); Object[] 
      tmp39_37 = result;Intrinsics.checkExpressionValueIsNotNull(tmp39_37, "result");return tmp39_37;
  }
  

  @NotNull
  public static final byte[] plus(@NotNull byte[] $receiver, @NotNull byte[] elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int thisSize = $receiver.length;
    int arraySize = elements.length;
    byte[] result = Arrays.copyOf($receiver, thisSize + arraySize);
    System.arraycopy(elements, 0, result, thisSize, arraySize); byte[] 
      tmp39_37 = result;Intrinsics.checkExpressionValueIsNotNull(tmp39_37, "result");return tmp39_37;
  }
  

  @NotNull
  public static final short[] plus(@NotNull short[] $receiver, @NotNull short[] elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int thisSize = $receiver.length;
    int arraySize = elements.length;
    short[] result = Arrays.copyOf($receiver, thisSize + arraySize);
    System.arraycopy(elements, 0, result, thisSize, arraySize); short[] 
      tmp39_37 = result;Intrinsics.checkExpressionValueIsNotNull(tmp39_37, "result");return tmp39_37;
  }
  

  @NotNull
  public static final int[] plus(@NotNull int[] $receiver, @NotNull int[] elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int thisSize = $receiver.length;
    int arraySize = elements.length;
    int[] result = Arrays.copyOf($receiver, thisSize + arraySize);
    System.arraycopy(elements, 0, result, thisSize, arraySize); int[] 
      tmp39_37 = result;Intrinsics.checkExpressionValueIsNotNull(tmp39_37, "result");return tmp39_37;
  }
  

  @NotNull
  public static final long[] plus(@NotNull long[] $receiver, @NotNull long[] elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int thisSize = $receiver.length;
    int arraySize = elements.length;
    long[] result = Arrays.copyOf($receiver, thisSize + arraySize);
    System.arraycopy(elements, 0, result, thisSize, arraySize); long[] 
      tmp39_37 = result;Intrinsics.checkExpressionValueIsNotNull(tmp39_37, "result");return tmp39_37;
  }
  

  @NotNull
  public static final float[] plus(@NotNull float[] $receiver, @NotNull float[] elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int thisSize = $receiver.length;
    int arraySize = elements.length;
    float[] result = Arrays.copyOf($receiver, thisSize + arraySize);
    System.arraycopy(elements, 0, result, thisSize, arraySize); float[] 
      tmp39_37 = result;Intrinsics.checkExpressionValueIsNotNull(tmp39_37, "result");return tmp39_37;
  }
  

  @NotNull
  public static final double[] plus(@NotNull double[] $receiver, @NotNull double[] elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int thisSize = $receiver.length;
    int arraySize = elements.length;
    double[] result = Arrays.copyOf($receiver, thisSize + arraySize);
    System.arraycopy(elements, 0, result, thisSize, arraySize); double[] 
      tmp39_37 = result;Intrinsics.checkExpressionValueIsNotNull(tmp39_37, "result");return tmp39_37;
  }
  

  @NotNull
  public static final boolean[] plus(@NotNull boolean[] $receiver, @NotNull boolean[] elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int thisSize = $receiver.length;
    int arraySize = elements.length;
    boolean[] result = Arrays.copyOf($receiver, thisSize + arraySize);
    System.arraycopy(elements, 0, result, thisSize, arraySize); boolean[] 
      tmp39_37 = result;Intrinsics.checkExpressionValueIsNotNull(tmp39_37, "result");return tmp39_37;
  }
  

  @NotNull
  public static final char[] plus(@NotNull char[] $receiver, @NotNull char[] elements)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(elements, "elements");int thisSize = $receiver.length;
    int arraySize = elements.length;
    char[] result = Arrays.copyOf($receiver, thisSize + arraySize);
    System.arraycopy(elements, 0, result, thisSize, arraySize); char[] 
      tmp39_37 = result;Intrinsics.checkExpressionValueIsNotNull(tmp39_37, "result");return tmp39_37;
  }
  

  @InlineOnly
  private static final <T> T[] plusElement(@NotNull T[] $receiver, T element)
  {
    ;
    return ArraysKt.plus($receiver, element);
  }
  


  public static final void sort(@NotNull int[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); if ($receiver.length > 1) { Arrays.sort($receiver);
    }
  }
  

  public static final void sort(@NotNull long[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); if ($receiver.length > 1) { Arrays.sort($receiver);
    }
  }
  

  public static final void sort(@NotNull byte[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); if ($receiver.length > 1) { Arrays.sort($receiver);
    }
  }
  

  public static final void sort(@NotNull short[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); if ($receiver.length > 1) { Arrays.sort($receiver);
    }
  }
  

  public static final void sort(@NotNull double[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); if ($receiver.length > 1) { Arrays.sort($receiver);
    }
  }
  

  public static final void sort(@NotNull float[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); if ($receiver.length > 1) { Arrays.sort($receiver);
    }
  }
  

  public static final void sort(@NotNull char[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); if ($receiver.length > 1) { Arrays.sort($receiver);
    }
  }
  


  @InlineOnly
  private static final <T extends Comparable<? super T>> void sort(@NotNull T[] $receiver)
  {
    ;
    
    if ($receiver == null) throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"); ArraysKt.sort((Object[])$receiver);
  }
  






  public static final <T> void sort(@NotNull T[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0"); if ($receiver.length > 1) { Arrays.sort($receiver);
    }
  }
  



  public static final <T> void sort(@NotNull T[] $receiver, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Arrays.sort($receiver, fromIndex, toIndex);
  }
  


  public static final void sort(@NotNull byte[] $receiver, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Arrays.sort($receiver, fromIndex, toIndex);
  }
  


  public static final void sort(@NotNull short[] $receiver, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Arrays.sort($receiver, fromIndex, toIndex);
  }
  


  public static final void sort(@NotNull int[] $receiver, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Arrays.sort($receiver, fromIndex, toIndex);
  }
  


  public static final void sort(@NotNull long[] $receiver, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Arrays.sort($receiver, fromIndex, toIndex);
  }
  


  public static final void sort(@NotNull float[] $receiver, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Arrays.sort($receiver, fromIndex, toIndex);
  }
  


  public static final void sort(@NotNull double[] $receiver, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Arrays.sort($receiver, fromIndex, toIndex);
  }
  


  public static final void sort(@NotNull char[] $receiver, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Arrays.sort($receiver, fromIndex, toIndex);
  }
  




  public static final <T> void sortWith(@NotNull T[] $receiver, @NotNull java.util.Comparator<? super T> comparator)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(comparator, "comparator"); if ($receiver.length > 1) { Arrays.sort($receiver, comparator);
    }
  }
  



  public static final <T> void sortWith(@NotNull T[] $receiver, @NotNull java.util.Comparator<? super T> comparator, int fromIndex, int toIndex)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(comparator, "comparator");Arrays.sort($receiver, fromIndex, toIndex, comparator);
  }
  

  @NotNull
  public static final Byte[] toTypedArray(@NotNull byte[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Byte[] result = new Byte[$receiver.length];
    int i = 0; int index; for (int j = $receiver.length; i < j; index++) {
      result[index] = Byte.valueOf($receiver[index]);
    }
    return result;
  }
  

  @NotNull
  public static final Short[] toTypedArray(@NotNull short[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Short[] result = new Short[$receiver.length];
    int i = 0; int index; for (int j = $receiver.length; i < j; index++) {
      result[index] = Short.valueOf($receiver[index]);
    }
    return result;
  }
  

  @NotNull
  public static final Integer[] toTypedArray(@NotNull int[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Integer[] result = new Integer[$receiver.length];
    int i = 0; int index; for (int j = $receiver.length; i < j; index++) {
      result[index] = Integer.valueOf($receiver[index]);
    }
    return result;
  }
  

  @NotNull
  public static final Long[] toTypedArray(@NotNull long[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Long[] result = new Long[$receiver.length];
    int i = 0; int index; for (int j = $receiver.length; i < j; index++) {
      result[index] = Long.valueOf($receiver[index]);
    }
    return result;
  }
  

  @NotNull
  public static final Float[] toTypedArray(@NotNull float[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Float[] result = new Float[$receiver.length];
    int i = 0; int index; for (int j = $receiver.length; i < j; index++) {
      result[index] = Float.valueOf($receiver[index]);
    }
    return result;
  }
  

  @NotNull
  public static final Double[] toTypedArray(@NotNull double[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Double[] result = new Double[$receiver.length];
    int i = 0; int index; for (int j = $receiver.length; i < j; index++) {
      result[index] = Double.valueOf($receiver[index]);
    }
    return result;
  }
  

  @NotNull
  public static final Boolean[] toTypedArray(@NotNull boolean[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Boolean[] result = new Boolean[$receiver.length];
    int i = 0; int index; for (int j = $receiver.length; i < j; index++) {
      result[index] = Boolean.valueOf($receiver[index]);
    }
    return result;
  }
  

  @NotNull
  public static final Character[] toTypedArray(@NotNull char[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Character[] result = new Character[$receiver.length];
    int i = 0; int index; for (int j = $receiver.length; i < j; index++) {
      result[index] = Character.valueOf($receiver[index]);
    }
    return result;
  }
  

  @NotNull
  public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@NotNull T[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (SortedSet)ArraysKt.toCollection($receiver, (Collection)new TreeSet());
  }
  

  @NotNull
  public static final SortedSet<Byte> toSortedSet(@NotNull byte[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (SortedSet)ArraysKt.toCollection($receiver, (Collection)new TreeSet());
  }
  

  @NotNull
  public static final SortedSet<Short> toSortedSet(@NotNull short[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (SortedSet)ArraysKt.toCollection($receiver, (Collection)new TreeSet());
  }
  

  @NotNull
  public static final SortedSet<Integer> toSortedSet(@NotNull int[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (SortedSet)ArraysKt.toCollection($receiver, (Collection)new TreeSet());
  }
  

  @NotNull
  public static final SortedSet<Long> toSortedSet(@NotNull long[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (SortedSet)ArraysKt.toCollection($receiver, (Collection)new TreeSet());
  }
  

  @NotNull
  public static final SortedSet<Float> toSortedSet(@NotNull float[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (SortedSet)ArraysKt.toCollection($receiver, (Collection)new TreeSet());
  }
  

  @NotNull
  public static final SortedSet<Double> toSortedSet(@NotNull double[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (SortedSet)ArraysKt.toCollection($receiver, (Collection)new TreeSet());
  }
  

  @NotNull
  public static final SortedSet<Boolean> toSortedSet(@NotNull boolean[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (SortedSet)ArraysKt.toCollection($receiver, (Collection)new TreeSet());
  }
  

  @NotNull
  public static final SortedSet<Character> toSortedSet(@NotNull char[] $receiver)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return (SortedSet)ArraysKt.toCollection($receiver, (Collection)new TreeSet());
  }
  



  @NotNull
  public static final <T> SortedSet<T> toSortedSet(@NotNull T[] $receiver, @NotNull java.util.Comparator<? super T> comparator)
  {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");Intrinsics.checkParameterIsNotNull(comparator, "comparator");return (SortedSet)ArraysKt.toCollection($receiver, (Collection)new TreeSet(comparator));
  }
  
  public ArraysKt___ArraysJvmKt() {}
}

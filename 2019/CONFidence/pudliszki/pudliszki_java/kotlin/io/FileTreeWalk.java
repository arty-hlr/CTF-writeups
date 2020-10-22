package kotlin.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin._Assertions;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;






@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000L\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\013\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020(\n\002\b\006\030\0002\b\022\004\022\0020\0020\001:\003\032\033\034B\031\b\020\022\006\020\003\032\0020\002\022\b\b\002\020\004\032\0020\005¢\006\002\020\006B\001\b\002\022\006\020\003\032\0020\002\022\b\b\002\020\004\032\0020\005\022\024\020\007\032\020\022\004\022\0020\002\022\004\022\0020\t\030\0010\b\022\024\020\n\032\020\022\004\022\0020\002\022\004\022\0020\013\030\0010\b\0228\020\f\0324\022\023\022\0210\002¢\006\f\b\016\022\b\b\017\022\004\b\b(\020\022\023\022\0210\021¢\006\f\b\016\022\b\b\017\022\004\b\b(\022\022\004\022\0020\013\030\0010\r\022\b\b\002\020\023\032\0020\024¢\006\002\020\025J\017\020\026\032\b\022\004\022\0020\0020\027H\002J\016\020\023\032\0020\0002\006\020\030\032\0020\024J\032\020\007\032\0020\0002\022\020\031\032\016\022\004\022\0020\002\022\004\022\0020\t0\bJ \020\f\032\0020\0002\030\020\031\032\024\022\004\022\0020\002\022\004\022\0020\021\022\004\022\0020\0130\rJ\032\020\n\032\0020\0002\022\020\031\032\016\022\004\022\0020\002\022\004\022\0020\0130\bR\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\023\032\0020\024X\004¢\006\002\n\000R\034\020\007\032\020\022\004\022\0020\002\022\004\022\0020\t\030\0010\bX\004¢\006\002\n\000R@\020\f\0324\022\023\022\0210\002¢\006\f\b\016\022\b\b\017\022\004\b\b(\020\022\023\022\0210\021¢\006\f\b\016\022\b\b\017\022\004\b\b(\022\022\004\022\0020\013\030\0010\rX\004¢\006\002\n\000R\034\020\n\032\020\022\004\022\0020\002\022\004\022\0020\013\030\0010\bX\004¢\006\002\n\000R\016\020\003\032\0020\002X\004¢\006\002\n\000¨\006\035"}, d2={"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", "direction", "Lkotlin/io/FileWalkDirection;", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "onEnter", "Lkotlin/Function1;", "", "onLeave", "", "onFail", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "f", "Ljava/io/IOException;", "e", "maxDepth", "", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "iterator", "", "depth", "function", "DirectoryState", "FileTreeWalkIterator", "WalkState", "kotlin-stdlib"})
public final class FileTreeWalk
  implements Sequence<File>
{
  private final File start;
  private final FileWalkDirection direction;
  private final Function1<File, Boolean> onEnter;
  private final Function1<File, Unit> onLeave;
  private final Function2<File, IOException, Unit> onFail;
  private final int maxDepth;
  
  private FileTreeWalk(File start, FileWalkDirection direction, Function1<? super File, Boolean> onEnter, Function1<? super File, Unit> onLeave, Function2<? super File, ? super IOException, Unit> onFail, int maxDepth)
  {
    this.start = start;this.direction = direction;this.onEnter = onEnter;this.onLeave = onLeave;this.onFail = onFail;this.maxDepth = maxDepth;
  }
  




  public FileTreeWalk(@NotNull File start, @NotNull FileWalkDirection direction)
  {
    this(start, direction, null, null, null, 0, 32, null);
  }
  
  @NotNull
  public Iterator<File> iterator() { return (Iterator)new FileTreeWalkIterator(); }
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\b\"\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\n\020\007\032\004\030\0010\003H&R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\b"}, d2={"Lkotlin/io/FileTreeWalk$WalkState;", "", "root", "Ljava/io/File;", "(Ljava/io/File;)V", "getRoot", "()Ljava/io/File;", "step", "kotlin-stdlib"})
  private static abstract class WalkState { @NotNull
    private final File root; public WalkState(@NotNull File root) { this.root = root; } @NotNull
    public final File getRoot() { return root; }
    
    @Nullable
    public abstract File step(); }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\"\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004¨\006\005"}, d2={"Lkotlin/io/FileTreeWalk$DirectoryState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootDir", "Ljava/io/File;", "(Ljava/io/File;)V", "kotlin-stdlib"})
  private static abstract class DirectoryState extends FileTreeWalk.WalkState { public DirectoryState(@NotNull File rootDir) { super();
      
      if (_Assertions.ENABLED) {
        boolean bool = rootDir.isDirectory(); if ((_Assertions.ENABLED) && (!bool)) { int $i$a$1$assert; String str = "rootDir must be verified to be directory beforehand.";throw ((Throwable)new AssertionError(str));
        }
      } } }
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\006\b\004\030\0002\b\022\004\022\0020\0020\001:\003\r\016\017B\005¢\006\002\020\003J\b\020\007\032\0020\bH\024J\020\020\t\032\0020\n2\006\020\013\032\0020\002H\002J\013\020\f\032\004\030\0010\002H\020R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000¨\006\020"}, d2={"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk;)V", "state", "Ljava/util/ArrayDeque;", "Lkotlin/io/FileTreeWalk$WalkState;", "computeNext", "", "directoryState", "Lkotlin/io/FileTreeWalk$DirectoryState;", "root", "gotoNext", "BottomUpDirectoryState", "SingleFileState", "TopDownDirectoryState", "kotlin-stdlib"})
  private final class FileTreeWalkIterator extends AbstractIterator<File> { private final ArrayDeque<FileTreeWalk.WalkState> state;
    
    public FileTreeWalkIterator() { state = new ArrayDeque();
      


      if (FileTreeWalk.access$getStart$p($outer).isDirectory()) { state.push(directoryState(FileTreeWalk.access$getStart$p($outer)));
      } else if (FileTreeWalk.access$getStart$p($outer).isFile()) state.push(new SingleFileState(FileTreeWalk.access$getStart$p($outer))); else {
        done();
      }
    }
    
    protected void computeNext() {
      File nextFile = gotoNext();
      if (nextFile != null) {
        setNext(nextFile);
      } else {
        done();
      }
    }
    
    private final FileTreeWalk.DirectoryState directoryState(File root) {
      switch (FileTreeWalk.FileTreeWalkIterator.WhenMappings.$EnumSwitchMapping$0[FileTreeWalk.access$getDirection$p(this$0).ordinal()]) {
      case 1:  new TopDownDirectoryState(root); break;
      case 2:  break; default:  throw new NoWhenBranchMatchedException();
      }
      return 
      
        (FileTreeWalk.DirectoryState)new BottomUpDirectoryState(root);
    }
    
    /* Error */
    private final File gotoNext()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 69	kotlin/io/FileTreeWalk$FileTreeWalkIterator:state	Ljava/util/ArrayDeque;
      //   4: invokevirtual 75	java/util/ArrayDeque:peek	()Ljava/lang/Object;
      //   7: checkcast 77	kotlin/io/FileTreeWalk$WalkState
      //   10: dup
      //   11: ifnull +6 -> 17
      //   14: goto +6 -> 20
      //   17: pop
      //   18: aconst_null
      //   19: areturn
      //   20: astore_1
      //   21: aload_1
      //   22: invokevirtual 80	kotlin/io/FileTreeWalk$WalkState:step	()Ljava/io/File;
      //   25: astore_2
      //   26: aload_2
      //   27: ifnonnull +14 -> 41
      //   30: aload_0
      //   31: getfield 69	kotlin/io/FileTreeWalk$FileTreeWalkIterator:state	Ljava/util/ArrayDeque;
      //   34: invokevirtual 83	java/util/ArrayDeque:pop	()Ljava/lang/Object;
      //   37: pop
      //   38: goto -38 -> 0
      //   41: aload_2
      //   42: aload_1
      //   43: invokevirtual 86	kotlin/io/FileTreeWalk$WalkState:getRoot	()Ljava/io/File;
      //   46: invokestatic 92	kotlin/jvm/internal/Intrinsics:areEqual	(Ljava/lang/Object;Ljava/lang/Object;)Z
      //   49: ifne +27 -> 76
      //   52: aload_2
      //   53: invokevirtual 96	java/io/File:isDirectory	()Z
      //   56: ifeq +20 -> 76
      //   59: aload_0
      //   60: getfield 69	kotlin/io/FileTreeWalk$FileTreeWalkIterator:state	Ljava/util/ArrayDeque;
      //   63: invokevirtual 99	java/util/ArrayDeque:size	()I
      //   66: aload_0
      //   67: getfield 33	kotlin/io/FileTreeWalk$FileTreeWalkIterator:this$0	Lkotlin/io/FileTreeWalk;
      //   70: invokestatic 103	kotlin/io/FileTreeWalk:access$getMaxDepth$p	(Lkotlin/io/FileTreeWalk;)I
      //   73: if_icmplt +5 -> 78
      //   76: aload_2
      //   77: areturn
      //   78: aload_0
      //   79: getfield 69	kotlin/io/FileTreeWalk$FileTreeWalkIterator:state	Ljava/util/ArrayDeque;
      //   82: aload_0
      //   83: aload_2
      //   84: invokespecial 105	kotlin/io/FileTreeWalk$FileTreeWalkIterator:directoryState	(Ljava/io/File;)Lkotlin/io/FileTreeWalk$DirectoryState;
      //   87: invokevirtual 108	java/util/ArrayDeque:push	(Ljava/lang/Object;)V
      //   90: goto -90 -> 0
      // Line number table:
      //   Java source line #97	-> byte code offset #0
      //   Java source line #98	-> byte code offset #21
      //   Java source line #99	-> byte code offset #26
      //   Java source line #101	-> byte code offset #30
      //   Java source line #102	-> byte code offset #38
      //   Java source line #105	-> byte code offset #41
      //   Java source line #107	-> byte code offset #76
      //   Java source line #110	-> byte code offset #78
      //   Java source line #111	-> byte code offset #90
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	93	0	this	FileTreeWalkIterator
      //   21	72	1	topState	FileTreeWalk.WalkState
      //   26	67	2	file	File
    }
    
    @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\b\n\000\n\002\020\021\n\002\b\004\b\004\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\n\020\r\032\004\030\0010\003H\026R\016\020\005\032\0020\006X\016¢\006\002\n\000R\016\020\007\032\0020\bX\016¢\006\002\n\000R\030\020\t\032\n\022\004\022\0020\003\030\0010\nX\016¢\006\004\n\002\020\013R\016\020\f\032\0020\006X\016¢\006\002\n\000¨\006\016"}, d2={"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "failed", "", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "step", "kotlin-stdlib"})
    private final class BottomUpDirectoryState
      extends FileTreeWalk.DirectoryState
    {
      private boolean rootVisited;
      private File[] fileList;
      private int fileIndex;
      private boolean failed;
      
      /* Error */
      @Nullable
      public File step()
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 16	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:failed	Z
        //   4: ifne +121 -> 125
        //   7: aload_0
        //   8: getfield 18	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:fileList	[Ljava/io/File;
        //   11: ifnonnull +114 -> 125
        //   14: aload_0
        //   15: getfield 22	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:this$0	Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;
        //   18: getfield 27	kotlin/io/FileTreeWalk$FileTreeWalkIterator:this$0	Lkotlin/io/FileTreeWalk;
        //   21: invokestatic 33	kotlin/io/FileTreeWalk:access$getOnEnter$p	(Lkotlin/io/FileTreeWalk;)Lkotlin/jvm/functions/Function1;
        //   24: dup
        //   25: ifnull +24 -> 49
        //   28: aload_0
        //   29: invokevirtual 36	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:getRoot	()Ljava/io/File;
        //   32: invokeinterface 42 2 0
        //   37: checkcast 44	java/lang/Boolean
        //   40: invokevirtual 48	java/lang/Boolean:booleanValue	()Z
        //   43: ifne +12 -> 55
        //   46: goto +7 -> 53
        //   49: pop
        //   50: goto +5 -> 55
        //   53: aconst_null
        //   54: areturn
        //   55: aload_0
        //   56: aload_0
        //   57: invokevirtual 36	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:getRoot	()Ljava/io/File;
        //   60: invokevirtual 54	java/io/File:listFiles	()[Ljava/io/File;
        //   63: putfield 18	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:fileList	[Ljava/io/File;
        //   66: aload_0
        //   67: getfield 18	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:fileList	[Ljava/io/File;
        //   70: ifnonnull +55 -> 125
        //   73: aload_0
        //   74: getfield 22	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:this$0	Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;
        //   77: getfield 27	kotlin/io/FileTreeWalk$FileTreeWalkIterator:this$0	Lkotlin/io/FileTreeWalk;
        //   80: invokestatic 58	kotlin/io/FileTreeWalk:access$getOnFail$p	(Lkotlin/io/FileTreeWalk;)Lkotlin/jvm/functions/Function2;
        //   83: dup
        //   84: ifnull +35 -> 119
        //   87: aload_0
        //   88: invokevirtual 36	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:getRoot	()Ljava/io/File;
        //   91: new 60	kotlin/io/AccessDeniedException
        //   94: dup
        //   95: aload_0
        //   96: invokevirtual 36	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:getRoot	()Ljava/io/File;
        //   99: aconst_null
        //   100: ldc 62
        //   102: iconst_2
        //   103: aconst_null
        //   104: invokespecial 66	kotlin/io/AccessDeniedException:<init>	(Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   107: invokeinterface 71 3 0
        //   112: checkcast 73	kotlin/Unit
        //   115: pop
        //   116: goto +4 -> 120
        //   119: pop
        //   120: aload_0
        //   121: iconst_1
        //   122: putfield 16	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:failed	Z
        //   125: aload_0
        //   126: getfield 18	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:fileList	[Ljava/io/File;
        //   129: ifnull +48 -> 177
        //   132: aload_0
        //   133: getfield 75	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:fileIndex	I
        //   136: aload_0
        //   137: getfield 18	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:fileList	[Ljava/io/File;
        //   140: dup
        //   141: ifnonnull +6 -> 147
        //   144: invokestatic 81	kotlin/jvm/internal/Intrinsics:throwNpe	()V
        //   147: arraylength
        //   148: if_icmpge +29 -> 177
        //   151: aload_0
        //   152: getfield 18	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:fileList	[Ljava/io/File;
        //   155: dup
        //   156: ifnonnull +6 -> 162
        //   159: invokestatic 81	kotlin/jvm/internal/Intrinsics:throwNpe	()V
        //   162: aload_0
        //   163: dup
        //   164: getfield 75	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:fileIndex	I
        //   167: dup
        //   168: istore_1
        //   169: iconst_1
        //   170: iadd
        //   171: putfield 75	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:fileIndex	I
        //   174: iload_1
        //   175: aaload
        //   176: areturn
        //   177: aload_0
        //   178: getfield 83	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:rootVisited	Z
        //   181: ifne +13 -> 194
        //   184: aload_0
        //   185: iconst_1
        //   186: putfield 83	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:rootVisited	Z
        //   189: aload_0
        //   190: invokevirtual 36	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:getRoot	()Ljava/io/File;
        //   193: areturn
        //   194: aload_0
        //   195: getfield 22	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:this$0	Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;
        //   198: getfield 27	kotlin/io/FileTreeWalk$FileTreeWalkIterator:this$0	Lkotlin/io/FileTreeWalk;
        //   201: invokestatic 86	kotlin/io/FileTreeWalk:access$getOnLeave$p	(Lkotlin/io/FileTreeWalk;)Lkotlin/jvm/functions/Function1;
        //   204: dup
        //   205: ifnull +19 -> 224
        //   208: aload_0
        //   209: invokevirtual 36	kotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState:getRoot	()Ljava/io/File;
        //   212: invokeinterface 42 2 0
        //   217: checkcast 73	kotlin/Unit
        //   220: pop
        //   221: goto +4 -> 225
        //   224: pop
        //   225: aconst_null
        //   226: areturn
        // Line number table:
        //   Java source line #129	-> byte code offset #0
        //   Java source line #130	-> byte code offset #14
        //   Java source line #131	-> byte code offset #53
        //   Java source line #134	-> byte code offset #55
        //   Java source line #135	-> byte code offset #66
        //   Java source line #136	-> byte code offset #73
        //   Java source line #137	-> byte code offset #120
        //   Java source line #140	-> byte code offset #125
        //   Java source line #142	-> byte code offset #151
        //   Java source line #143	-> byte code offset #177
        //   Java source line #145	-> byte code offset #184
        //   Java source line #146	-> byte code offset #189
        //   Java source line #149	-> byte code offset #194
        //   Java source line #150	-> byte code offset #225
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	227	0	this	BottomUpDirectoryState
      }
      
      public BottomUpDirectoryState()
      {
        super();
      }
    }
    
    @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000(\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\020\021\n\002\b\002\n\002\020\013\n\002\b\002\b\004\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\n\020\f\032\004\030\0010\003H\026R\016\020\005\032\0020\006X\016¢\006\002\n\000R\030\020\007\032\n\022\004\022\0020\003\030\0010\bX\016¢\006\004\n\002\020\tR\016\020\n\032\0020\013X\016¢\006\002\n\000¨\006\r"}, d2={"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "", "step", "kotlin-stdlib"})
    private final class TopDownDirectoryState
      extends FileTreeWalk.DirectoryState
    {
      private boolean rootVisited;
      private File[] fileList;
      private int fileIndex;
      
      /* Error */
      @Nullable
      public File step()
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 15	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:rootVisited	Z
        //   4: ifne +54 -> 58
        //   7: aload_0
        //   8: getfield 19	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:this$0	Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;
        //   11: getfield 24	kotlin/io/FileTreeWalk$FileTreeWalkIterator:this$0	Lkotlin/io/FileTreeWalk;
        //   14: invokestatic 30	kotlin/io/FileTreeWalk:access$getOnEnter$p	(Lkotlin/io/FileTreeWalk;)Lkotlin/jvm/functions/Function1;
        //   17: dup
        //   18: ifnull +24 -> 42
        //   21: aload_0
        //   22: invokevirtual 33	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:getRoot	()Ljava/io/File;
        //   25: invokeinterface 39 2 0
        //   30: checkcast 41	java/lang/Boolean
        //   33: invokevirtual 45	java/lang/Boolean:booleanValue	()Z
        //   36: ifne +12 -> 48
        //   39: goto +7 -> 46
        //   42: pop
        //   43: goto +5 -> 48
        //   46: aconst_null
        //   47: areturn
        //   48: aload_0
        //   49: iconst_1
        //   50: putfield 15	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:rootVisited	Z
        //   53: aload_0
        //   54: invokevirtual 33	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:getRoot	()Ljava/io/File;
        //   57: areturn
        //   58: aload_0
        //   59: getfield 47	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:fileList	[Ljava/io/File;
        //   62: ifnull +22 -> 84
        //   65: aload_0
        //   66: getfield 49	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:fileIndex	I
        //   69: aload_0
        //   70: getfield 47	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:fileList	[Ljava/io/File;
        //   73: dup
        //   74: ifnonnull +6 -> 80
        //   77: invokestatic 55	kotlin/jvm/internal/Intrinsics:throwNpe	()V
        //   80: arraylength
        //   81: if_icmpge +156 -> 237
        //   84: aload_0
        //   85: getfield 47	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:fileList	[Ljava/io/File;
        //   88: ifnonnull +123 -> 211
        //   91: aload_0
        //   92: aload_0
        //   93: invokevirtual 33	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:getRoot	()Ljava/io/File;
        //   96: invokevirtual 61	java/io/File:listFiles	()[Ljava/io/File;
        //   99: putfield 47	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:fileList	[Ljava/io/File;
        //   102: aload_0
        //   103: getfield 47	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:fileList	[Ljava/io/File;
        //   106: ifnonnull +50 -> 156
        //   109: aload_0
        //   110: getfield 19	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:this$0	Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;
        //   113: getfield 24	kotlin/io/FileTreeWalk$FileTreeWalkIterator:this$0	Lkotlin/io/FileTreeWalk;
        //   116: invokestatic 65	kotlin/io/FileTreeWalk:access$getOnFail$p	(Lkotlin/io/FileTreeWalk;)Lkotlin/jvm/functions/Function2;
        //   119: dup
        //   120: ifnull +35 -> 155
        //   123: aload_0
        //   124: invokevirtual 33	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:getRoot	()Ljava/io/File;
        //   127: new 67	kotlin/io/AccessDeniedException
        //   130: dup
        //   131: aload_0
        //   132: invokevirtual 33	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:getRoot	()Ljava/io/File;
        //   135: aconst_null
        //   136: ldc 69
        //   138: iconst_2
        //   139: aconst_null
        //   140: invokespecial 73	kotlin/io/AccessDeniedException:<init>	(Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   143: invokeinterface 78 3 0
        //   148: checkcast 80	kotlin/Unit
        //   151: pop
        //   152: goto +4 -> 156
        //   155: pop
        //   156: aload_0
        //   157: getfield 47	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:fileList	[Ljava/io/File;
        //   160: ifnull +18 -> 178
        //   163: aload_0
        //   164: getfield 47	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:fileList	[Ljava/io/File;
        //   167: dup
        //   168: ifnonnull +6 -> 174
        //   171: invokestatic 55	kotlin/jvm/internal/Intrinsics:throwNpe	()V
        //   174: arraylength
        //   175: ifne +36 -> 211
        //   178: aload_0
        //   179: getfield 19	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:this$0	Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;
        //   182: getfield 24	kotlin/io/FileTreeWalk$FileTreeWalkIterator:this$0	Lkotlin/io/FileTreeWalk;
        //   185: invokestatic 83	kotlin/io/FileTreeWalk:access$getOnLeave$p	(Lkotlin/io/FileTreeWalk;)Lkotlin/jvm/functions/Function1;
        //   188: dup
        //   189: ifnull +19 -> 208
        //   192: aload_0
        //   193: invokevirtual 33	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:getRoot	()Ljava/io/File;
        //   196: invokeinterface 39 2 0
        //   201: checkcast 80	kotlin/Unit
        //   204: pop
        //   205: goto +4 -> 209
        //   208: pop
        //   209: aconst_null
        //   210: areturn
        //   211: aload_0
        //   212: getfield 47	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:fileList	[Ljava/io/File;
        //   215: dup
        //   216: ifnonnull +6 -> 222
        //   219: invokestatic 55	kotlin/jvm/internal/Intrinsics:throwNpe	()V
        //   222: aload_0
        //   223: dup
        //   224: getfield 49	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:fileIndex	I
        //   227: dup
        //   228: istore_1
        //   229: iconst_1
        //   230: iadd
        //   231: putfield 49	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:fileIndex	I
        //   234: iload_1
        //   235: aaload
        //   236: areturn
        //   237: aload_0
        //   238: getfield 19	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:this$0	Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;
        //   241: getfield 24	kotlin/io/FileTreeWalk$FileTreeWalkIterator:this$0	Lkotlin/io/FileTreeWalk;
        //   244: invokestatic 83	kotlin/io/FileTreeWalk:access$getOnLeave$p	(Lkotlin/io/FileTreeWalk;)Lkotlin/jvm/functions/Function1;
        //   247: dup
        //   248: ifnull +19 -> 267
        //   251: aload_0
        //   252: invokevirtual 33	kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState:getRoot	()Ljava/io/File;
        //   255: invokeinterface 39 2 0
        //   260: checkcast 80	kotlin/Unit
        //   263: pop
        //   264: goto +4 -> 268
        //   267: pop
        //   268: aconst_null
        //   269: areturn
        // Line number table:
        //   Java source line #166	-> byte code offset #0
        //   Java source line #168	-> byte code offset #7
        //   Java source line #169	-> byte code offset #46
        //   Java source line #172	-> byte code offset #48
        //   Java source line #173	-> byte code offset #53
        //   Java source line #174	-> byte code offset #58
        //   Java source line #175	-> byte code offset #84
        //   Java source line #177	-> byte code offset #91
        //   Java source line #178	-> byte code offset #102
        //   Java source line #179	-> byte code offset #109
        //   Java source line #181	-> byte code offset #156
        //   Java source line #182	-> byte code offset #178
        //   Java source line #183	-> byte code offset #209
        //   Java source line #187	-> byte code offset #211
        //   Java source line #190	-> byte code offset #237
        //   Java source line #191	-> byte code offset #268
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	270	0	this	TopDownDirectoryState
      }
      
      public TopDownDirectoryState()
      {
        super();
      }
    }
    














    @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\b\004\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\n\020\007\032\004\030\0010\003H\026R\016\020\005\032\0020\006X\016¢\006\002\n\000¨\006\b"}, d2={"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootFile", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "visited", "", "step", "kotlin-stdlib"})
    private final class SingleFileState
      extends FileTreeWalk.WalkState
    {
      private boolean visited;
      














      public SingleFileState()
      {
        super();
        


        if (_Assertions.ENABLED) {
          boolean bool = rootFile.isFile(); if ((_Assertions.ENABLED) && (!bool)) { int $i$a$1$assert; String str = "rootFile must be verified to be file beforehand.";throw ((Throwable)new AssertionError(str));
          } } }
      
      @Nullable
      public File step() { if (visited) return null;
        visited = true;
        return getRoot();
      }
    }
  }
  





  @NotNull
  public final FileTreeWalk onEnter(@NotNull Function1<? super File, Boolean> function)
  {
    Intrinsics.checkParameterIsNotNull(function, "function");return new FileTreeWalk(start, direction, function, onLeave, onFail, maxDepth);
  }
  

  @NotNull
  public final FileTreeWalk onLeave(@NotNull Function1<? super File, Unit> function)
  {
    Intrinsics.checkParameterIsNotNull(function, "function");return new FileTreeWalk(start, direction, onEnter, function, onFail, maxDepth);
  }
  



  @NotNull
  public final FileTreeWalk onFail(@NotNull Function2<? super File, ? super IOException, Unit> function)
  {
    Intrinsics.checkParameterIsNotNull(function, "function");return new FileTreeWalk(start, direction, onEnter, onLeave, function, maxDepth);
  }
  






  @NotNull
  public final FileTreeWalk maxDepth(int depth)
  {
    if (depth <= 0)
      throw ((Throwable)new IllegalArgumentException("depth must be positive, but was " + depth + '.'));
    return new FileTreeWalk(start, direction, onEnter, onLeave, onFail, depth);
  }
}

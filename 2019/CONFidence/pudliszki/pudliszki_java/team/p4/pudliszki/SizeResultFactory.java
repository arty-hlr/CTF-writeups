package team.p4.pudliszki;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\030\000 \0032\0020\001:\001\003B\005¢\006\002\020\002¨\006\004"}, d2={"Lteam/p4/pudliszki/SizeResultFactory;", "", "()V", "Companion", "pudliszki"})
public final class SizeResultFactory
{
  public static final Companion Companion = new Companion(null);
  
  public SizeResultFactory() {}
  
  @Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\"\020\003\032\0020\004\"\004\b\000\020\0052\006\020\006\032\0020\0072\f\020\b\032\b\022\004\022\002H\0050\t¨\006\n"}, d2={"Lteam/p4/pudliszki/SizeResultFactory$Companion;", "", "()V", "check", "Lteam/p4/pudliszki/SizeResult;", "T", "i", "", "c", "Ljava/lang/Class;", "pudliszki"})
  public static final class Companion {
    @org.jetbrains.annotations.NotNull
    public final <T> SizeResult check(int i, @org.jetbrains.annotations.NotNull Class<T> c) {
      kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");return i == c.getSimpleName().length() ? 
        (SizeResult)Correct.INSTANCE : 
        
        (SizeResult)Incorrect.INSTANCE;
    }
    
    private Companion() {}
  }
}

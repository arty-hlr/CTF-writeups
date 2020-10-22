package kotlin.jvm.internal.unsafe;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\020\n\000\n\002\020\002\n\000\n\002\020\000\n\002\b\002\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\002\032\020\020\004\032\0020\0012\006\020\002\032\0020\003H\002¨\006\005"}, d2={"monitorEnter", "", "monitor", "", "monitorExit", "kotlin-stdlib"})
public final class MonitorKt
{
  private static final void monitorEnter(Object monitor) {
    throw ((Throwable)new UnsupportedOperationException("This function can only be used privately"));
  }
  
  private static final void monitorExit(Object monitor) { throw ((Throwable)new UnsupportedOperationException("This function can only be used privately")); }
}

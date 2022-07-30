package kotlin.experimental;

import kotlin.internal.InlineOnly;

@kotlin.Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\000\020\n\000\n\002\020\005\n\000\n\002\020\n\n\002\b\004\032\025\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\001H\f\032\025\020\000\032\0020\003*\0020\0032\006\020\002\032\0020\003H\f\032\r\020\004\032\0020\001*\0020\001H\b\032\r\020\004\032\0020\003*\0020\003H\b\032\025\020\005\032\0020\001*\0020\0012\006\020\002\032\0020\001H\f\032\025\020\005\032\0020\003*\0020\0032\006\020\002\032\0020\003H\f\032\025\020\006\032\0020\001*\0020\0012\006\020\002\032\0020\001H\f\032\025\020\006\032\0020\003*\0020\0032\006\020\002\032\0020\003H\f¨\006\007"}, d2={"and", "", "other", "", "inv", "or", "xor", "kotlin-stdlib"})
public final class BitwiseOperationsKt {
  @kotlin.SinceKotlin(version="1.1")
  @InlineOnly
  private static final byte and(byte $receiver, byte other) {
    ;
    return (byte)($receiver & other); }
  
  @kotlin.SinceKotlin(version="1.1")
  @InlineOnly
  private static final byte or(byte $receiver, byte other) { ;
    return (byte)($receiver | other); }
  
  @kotlin.SinceKotlin(version="1.1")
  @InlineOnly
  private static final byte xor(byte $receiver, byte other) { ;
    return (byte)($receiver ^ other); }
  
  @kotlin.SinceKotlin(version="1.1")
  @InlineOnly
  private static final byte inv(byte $receiver) { ;
    return (byte)($receiver ^ 0xFFFFFFFF);
  }
  
  @kotlin.SinceKotlin(version="1.1")
  @InlineOnly
  private static final short and(short $receiver, short other) { ;
    return (short)($receiver & other); }
  
  @kotlin.SinceKotlin(version="1.1")
  @InlineOnly
  private static final short or(short $receiver, short other) { ;
    return (short)($receiver | other); }
  
  @kotlin.SinceKotlin(version="1.1")
  @InlineOnly
  private static final short xor(short $receiver, short other) { ;
    return (short)($receiver ^ other); }
  
  @kotlin.SinceKotlin(version="1.1")
  @InlineOnly
  private static final short inv(short $receiver) { ;
    return (short)($receiver ^ 0xFFFFFFFF);
  }
}

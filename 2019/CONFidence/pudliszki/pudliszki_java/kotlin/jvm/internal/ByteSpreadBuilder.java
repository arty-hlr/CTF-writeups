package kotlin.jvm.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;







































@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\000$\n\002\030\002\n\002\030\002\n\002\020\022\n\000\n\002\020\b\n\002\b\003\n\002\020\002\n\000\n\002\020\005\n\002\b\003\030\0002\b\022\004\022\0020\0020\001B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\016\020\007\032\0020\b2\006\020\t\032\0020\nJ\006\020\013\032\0020\002J\f\020\f\032\0020\004*\0020\002H\024R\016\020\006\032\0020\002X\004¢\006\002\n\000¨\006\r"}, d2={"Lkotlin/jvm/internal/ByteSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "size", "", "(I)V", "values", "add", "", "value", "", "toArray", "getSize", "kotlin-stdlib"})
public final class ByteSpreadBuilder
  extends PrimitiveSpreadBuilder<byte[]>
{
  private final byte[] values;
  
  public ByteSpreadBuilder(int size)
  {
    super(size);
    values = new byte[size]; }
  protected int getSize(@NotNull byte[] $receiver) { Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");return $receiver.length; }
  
  public final void add(byte value) { int i;
    setPosition((i = getPosition()) + 1);values[i] = value; }
  
  @NotNull
  public final byte[] toArray() { return (byte[])toArray(values, new byte[size()]); }
}
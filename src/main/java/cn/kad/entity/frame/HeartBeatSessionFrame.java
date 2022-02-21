package cn.kad.entity.frame;

public class HeartBeatSessionFrame extends AbstractSessionFrame{

    @Override
    public byte[] getBytes() {
        setDataLength(11);
        setFlag((byte) 0x0F);
        setCsmPacket(null);
        byte[] data = new byte[]{(byte)0XFF,(byte)0XFF,(byte)0XFF,(byte)0XFF,(byte)0XFF,(byte)0XFF,
                (byte)0XFF,(byte)0XFF,(byte)0XFF,(byte)0XFF,(byte)0XFF};
        return new byte[0];
    }

    @Override
    public void variableAssignments() {

    }
}

package cn.kad.entity.packet;

import cn.kad.constant.CSMConstant;
import cn.kad.entity.frame.DataSessionFrame;

public abstract class AbstractCSMPacket extends DataSessionFrame {
  /*  private byte[] dest = new byte[3];
    private byte[] src = new byte[3];
    private byte CSM_PACKET_TYPE = CSMConstant.CSMPacketConstant.TYPE_COMMAND;
    private byte */
    private long dest;
    private long src;
    private boolean isCommand;
    private byte protocolVersion;
    private byte dateType;
    private byte[] data;

}

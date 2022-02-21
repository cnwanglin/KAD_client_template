package cn.kad.entity.frame;

import cn.kad.entity.packet.AbstractCSMPacket;
import lombok.Data;

@Data
public abstract class AbstractSessionFrame {
    private int dataLength; //数据域 csmPacket长度
    private byte flag; //是否时心跳包
    private AbstractCSMPacket csmPacket; //data域
    public abstract byte[] getBytes(); //将对象装换位byte数组，用来发送出去
    public abstract void variableAssignments();//利用byte数组，给对象赋值

}

package cn.kad.entity.frame;

import cn.kad.entity.packet.AbstractCSMPacket;
import lombok.Data;

import java.io.IOException;
import java.io.Serializable;
/**
 * @Classname HeartBeatSessionFrameTest
 * @Description TODO
 * @Date 2022/2/22 10:24
 * @Created by zzq
 */
@Data
public abstract class AbstractSessionFrame implements Serializable {
    private int dataLength; //数据域 csmPacket长度
    private byte flag; //是否时心跳包
    public abstract byte[] getBytes() throws IOException; //将对象装换位byte数组，用来发送出去
    public abstract void variableAssignments();//利用byte数组，给对象赋值

}

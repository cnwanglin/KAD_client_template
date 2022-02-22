package cn.kad.entity.frame;

import cn.kad.constant.CSMConstant;
import cn.kad.utils.BytesUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname HeartBeatSessionFrameTest
 * @Description TODO
 * @Date 2022/2/22 10:24
 * @Created by zzq
 */
public class HeartBeatSessionFrame extends AbstractSessionFrame{

    @Override
    public byte[] getBytes(){
        int length = 0;
        byte[] bytes = new byte[1024];
        setDataLength(11);//设置心跳包属性
        setFlag((byte) CSMConstant.CSMSessionFrameConstant.TYPE_HEART_BEAT_FRAME);
        byte[] tempBytes = BytesUtil.intToBytes(this.getDataLength());
        System.arraycopy(tempBytes,0,bytes,length,tempBytes.length);
        length += tempBytes.length;
        bytes[length] = getFlag();// 拼接flag标识
        length++;
        byte[] dataBytes = new byte[]{(byte)0XFF,(byte)0XFF,(byte)0XFF,(byte)0XFF,(byte)0XFF,(byte)0XFF,
                (byte)0XFF,(byte)0XFF,(byte)0XFF,(byte)0XFF,(byte)0XFF};//心跳包data域11个0xff
        System.arraycopy(dataBytes,0,bytes,length,dataBytes.length);// 拼接心跳包data数据
        length += dataBytes.length;
        return Arrays.copyOf(bytes,length);
    }

    @Override
    public void variableAssignments() {

    }
}

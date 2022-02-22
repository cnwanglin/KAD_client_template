package cn.kad.entity.frame;

import cn.kad.constant.CSMConstant;
import cn.kad.utils.BytesUtil;

import java.util.Arrays;

/**
 * @Classname DataSessionFrame
 * @Description TODO
 * @Date 2022/2/22 10:24
 * @Created by zzq
 */
public class DataSessionFrame extends AbstractSessionFrame{
    /*
    返回byte数组（数组中不包含data域内容，需要到子类中拼接）
     */
    @Override
    public byte[] getBytes() {
        int length = 0;
        byte[] bytes = new byte[1024];
        setFlag((byte) CSMConstant.CSMSessionFrameConstant.TYPE_DATA_FRAME);
        byte[] tempBytes = BytesUtil.intToBytes(this.getDataLength());
        System.arraycopy(tempBytes,0,bytes,length,tempBytes.length);
        length += tempBytes.length;
        bytes[length] = getFlag();
        length++;
        return Arrays.copyOf(bytes,length);
    }

    @Override
    public void variableAssignments() {

    }
}

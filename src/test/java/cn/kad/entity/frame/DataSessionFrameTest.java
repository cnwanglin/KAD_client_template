package cn.kad.entity.frame;

import cn.kad.utils.BytesUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Classname DataSessionFrameTest
 * @Description TODO
 * @Date 2022/2/22 11:50
 * @Created by zzq
 */
class DataSessionFrameTest {

    @Test
    void getBytes() {
        DataSessionFrame dataSessionFrame = new DataSessionFrame();
        byte[] bytes = dataSessionFrame.getBytes();
        System.out.printf(BytesUtil.bytesToHex(bytes));
    }
}
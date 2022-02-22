package cn.kad.entity.frame;

import cn.kad.utils.BytesUtil;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Classname HeartBeatSessionFrameTest
 * @Description TODO
 * @Date 2022/2/22 10:24
 * @Created by zzq
 */
class HeartBeatSessionFrameTest {

    @Test
    void getBytes() {
        HeartBeatSessionFrame heartBeatSessionFrame = new HeartBeatSessionFrame();
        byte[] bytes = heartBeatSessionFrame.getBytes();
        System.out.printf(BytesUtil.bytesToHex(bytes));

    }
}
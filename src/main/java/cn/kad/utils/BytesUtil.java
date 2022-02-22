package cn.kad.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname HeartBeatSessionFrameTest
 * @Description TODO
 * @Date 2022/2/22 10:24
 * @Created by zzq
 */

public class BytesUtil {

    //int 类型转bytes数组 低字节在前，高字节在后
    public static byte[] intToBytes(int n) {
        byte[] b = new byte[4];
        b[0] = (byte) (n & 0xff);
        b[1] = (byte) (n >> 8 & 0xff);
        b[2] = (byte) (n >> 16 & 0xff);
        b[3] = (byte) (n >> 24 & 0xff);
        return b;
    }

    //bytes数组转int 低字节在前，高字节在后
    public int bytesToInt(byte[] b){
        int res = 0;
        for(int i=0;i<b.length;i++){
            res += (b[i] & 0xff) << (i*8);
        }
        return res;
    }

    //java int类型为4个字节，目的和源电报码为3个字节，需要扔掉一个高位字节
    public static byte[] intTo3Bytes(int n){
        byte[] bytes = intToBytes(n);
        return Arrays.copyOf(bytes,3);
    }

    //3个byte转换成int
    public static int 3BytesToInt(){

    }

    //bytes数组转换成string方便打印
    public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        String tmp = null;
        for (byte b : bytes) {
            // 将每个字节与0xFF进行与运算，然后转化为10进制，然后借助于Integer再转化为16进制
            tmp = Integer.toHexString(0xFF & b);
            if (tmp.length() == 1) {
                tmp = "0" + tmp;
            }
            sb.append(tmp);
        }
        return sb.toString();

    }

    public static List<Byte> bytesToList(byte[] bytes){
        List<Byte> byteList = new ArrayList<>();
        for (byte b:bytes) {
            byteList.add(b);
        }
        return byteList;

    }

    public static byte[] objectToBytes(Object o) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(o);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        return bytes;
    }
 }

package cn.kad.entity.recv;

import lombok.Data;

//表示层
@Data
public class PresentEntity {
    private byte [] destCode = new byte [3];   //data域长度,3Byte
    private byte flag;                        //用来区分数据帧，还是新跳帧
}

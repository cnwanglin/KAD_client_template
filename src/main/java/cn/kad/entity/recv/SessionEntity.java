package cn.kad.entity.recv;

import lombok.Data;

//会话层
@Data
public class SessionEntity {
    private byte [] data_len = new byte [4];   //data域长度,4Byte
    private byte flag;                         //用来区分数据帧，还是心跳帧，1Byte
    private PresentEntity data;               //数据

}

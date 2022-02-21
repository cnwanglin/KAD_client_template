package cn.kad.constant;

public class CSMConstant {
    // 包类型
    public static class CSMPacketConstant{
        public static final int TYPE_DATA = 0X00; // 数据包
        public static final int TYPE_COMMAND = 0X01;//命令包
    }
    // 区分协议的版本
    public static class CSMProtocolVersion{
        public static final int TYPE_FROM_SERVER_TO_TRAIN_MACHINE = 0XE0; //服务器向站机取数据，车站响应数据或主动上送的数据
        public static final int TYPE_FROM_CLIENT_TO_SERVER = 0XE1; //终端向服务器取数据
        public static final int TYPE_FROM_SERVER_TO_TRAIN_MACHINE_AUTHENTICATION = 0XE2; //服务器向站机发送的验证数据
    }

    // 数据类型
    public static class CSMDataType{
        public static final int TYPE_AQ_REAL_TIME_VALUE = 0X11;//模拟量实时值
        public static final int TYPE_AQ_LATEST_VALUE = 0X12;//模拟量最新值
        public static final int TYPE_AQ_DAILY_SHEET = 0X13;//模拟量日报表
        public static final int TYPE_AQ_HISTORICAL_CURVE = 0X15;//模拟量历史曲线
        public static final int TYPE_AQ_DATA_PLAYBACK = 0X16;//数据回放
        public static final int TYPE_SWITCH_REAL_TIME_VALUE = 0X17;//实时开关量
        public static final int TYPE_RECORDING_CURVE = 0X18;//记录曲线
        public static final int TYPE_STATISTICAL_INFORMATION = 0X19;//统计信息
        public static final int TYPE_SIGNAL_EQUIPMENT_ALARM = 0X1A;//信号设备报警
        public static final int TYPE_TRAIN_CONTROL_INFORMATION = 0X1C;//列控信息
        public static final int TYPE_SYSTEM_INFORMATION = 0X1D;//系统状态
        public static final int TYPE_JOB_RECORD= 0X1E;//工作日志
        public static final int TYPE_TRAIN_MACHINE_START_INFORMATION= 0X1F;//站机启动信息
        public static final int TYPE_NETWORK_STATE = 0X23;//网络状态
    }
}

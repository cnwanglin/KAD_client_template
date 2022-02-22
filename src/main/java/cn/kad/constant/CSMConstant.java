package cn.kad.constant;
/**
 * @Classname HeartBeatSessionFrameTest
 * @Description TODO
 * @Date 2022/2/22 10:24
 * @Created by zzq
 */
public class CSMConstant {
    // 会话帧类型
    public static class CSMSessionFrameConstant{
        public static final int TYPE_DATA_FRAME = 0X8F; // 数据帧
        public static final int TYPE_HEART_BEAT_FRAME = 0X0F;//心跳帧
        public static final int TYPE_DATA_FRAME_END_CODE = 0XFF;//数据帧结尾
    }
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
   //压缩类型
    public static class CSMRARType{
        public static final int TYPE_FILE = 0X00;//文件压缩
        public static final int TYPE_MEMORY = 0X01;//内存压缩
        public static final int TYPE_8KB = 0XF0;//数据包长度大于8kb
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
        public static final int TYPE_HF_AQ_HISTORICAL_CURVE = 0X30;//高频模拟量历史曲线
        public static final int TYPE_HF_AQ_PLAYBACK = 0X31;//高频模拟量回放
        public static final int TYPE_AQ_HISTORICAL_CURVE_EXTEND = 0X32;//模拟量历史曲线扩展
        public static final int TYPE_TRAIN_AC_CONTROL = 0X33;//站机空调远程控制
        public static final int TYPE_RECORDING_CURVE_DURATION = 0X34;//记录曲线时长
        public static final int TYPE_RECORDING_CURVE_TIME_CUSTOM = 0X37;//自定义时间段内记录曲线时间
        public static final int TYPE_TRIGGERED_REQUEST = 0X38;//请求触发
        public static final int TYPE_INTELLIGENT_ANALYSIS = 0X39;//智能分析
        public static final int TYPE_KEY_FEATURES = 0X40;//特色功能
        public static final int TYPE_AQ_REAL_TIME_EXTEND = 0X41;//模拟量实时扩展
        public static final int TYPE_AQ_DAILY_SHEET_EXTEND = 0X45;//模拟量日报表数据扩展
        public static final int TYPE_MULTIPLE_STATE_CONFIGURE = 0X50;//多状态信息
        public static final int TYPE_C2_TRAIN_CONTROL = 0X51;//C2及以上客专列控信息
        public static final int TYPE_CONFIGURATION_FILES_UPLOAD = 0X52;//配置文件上送
        public static final int TYPE_VIDEO_FILES_LIST = 0X60;//视频缺口文件列表
        public static final int TYPE_VIDEO_FILES = 0X61;//视频缺口文件
    }

    //模拟量子类型
    public static class CSMSubAQDataType{
        public static final int TYPE_AQ_SUPPLY_PANEL_V =0X10;//电源屏电压
        /**
         * more
         */
    }

    //记录曲线分类
    public static class CSMHistoricalCurveType{
        public static final int TYPE_TW_ACTION_CURVE =0X10;//道岔动作曲线
        /**
         * more
         */
    }

    //报警子类型
    public static class CSMSignalEquipmentAlarmType{
        public static final int TYPE_SJ_LOCK =0X01;//SJ锁闭封联报警
        /**
         * more
         */
    }

    //工作日志子类型
    public static class CSMJobRecordType{
        public static final int TYPE_SYSTEM =0X03;//系统工作日志
        /**
         * more
         */
    }

    //统计子类型
    public static class CSMStatisticalType{
        public static final int TYPE_TW_ACTION_COUNT =0X60;//道岔动作次数
        /**
         * more
         */
    }

    //特色功能子类型
    public static class CSMKeyFeaturesType{
        public static final int TYPE_KSK_1 =0X01;//卡斯克信号——1
        public static final int TYPE_KSK_22 =0X22;//卡斯克信号——22
        public static final int TYPE_HW =0X02;//河南辉煌
        /**
         * more
         */
    }

    //视频缺口文件类型
    public static class CSMVideoType{
        public static final int TYPE_REAL_TIME =0X01;//实时图像
        /**
         * more
         */
    }
}

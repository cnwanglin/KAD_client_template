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
    }//

    //模拟量子类型
    public static class CSMSubAQDataType{

        //电源
        public static final int TYPE_AQ_SUPPLY_PANEL_V =0X10;//电源屏电压
        /**
         * more
         */
        public static final int TYPE_AQ_EXTERNAL_GRID_M = 0X11;//外电网监测
        public static final int TYPE_AQ_UPS = 0X12;//UPS

        //轨道
        public static final int TYPE_AQ_TRACK_V = 0X20;//轨道电压
        public static final int TYPE_AQ_ORBITAL_PHASE_A = 0X21;//轨道相位角
        public static final int TYPE_AQ_TRACK_C = 0X22;//轨道电流
        public static final int TYPE_AQ_HIGH_VOLTAGE_A = 0X23;//高压不对称
        public static final int TYPE_AQ_SHUNT_RESIDUAL_V = 0X24;//分录残压
        public static final int TYPE_AQ_AXLE_C = 0X25;//计轴
        public static final int TYPE_AQ_TRACK_DC_V = 0X26;//轨道直流电压
        public static final int TYPE_AQ_TRACTION_CURRENT_INTERFERENCE_VOLTAGE_RES = 0XF5;//牵引电流干扰电压（预留）

        //道岔
        public static final int TYPE_AQ_TURNOUT_INDICATION_V = 0X30;//道岔表示电压
        public static final int TYPE_AQ_ANALOG_QUANTITY_OF_TURNOUT_G = 0X31;//道岔缺口模拟量
        public static final int TYPE_AQ_SWITCH_MACHINE_P = 0X32;//转辙机功率
        public static final int TYPE_AQ_OIL_LEVEL_ANALOG_QUANTITY = 0X33;//油位模拟量

        //信号机、半自动闭塞、站联电压信息
        public static final int TYPE_AQ_FILAMENT_RELAY_C = 0X40;//灯丝继电器电流
        public static final int TYPE_AQ_FILAMENT_RELAY_VOLTAGE_RES = 0X41;//灯丝继电器电压(预留)
        public static final int TYPE_AQ_SEMI_AUTOMATIC_B = 0X42;//半自动闭塞
        public static final int TYPE_AQ_STATION_CONNECTION_V = 0X43;//站联电压

        //站内电码化区间移频
        public static final int TYPE_AQ_CODED_TRANSMISSION_V = 0X50;//电码化发送电压
        public static final int TYPE_AQ_CODED_TRANSMISSION_C = 0X51;//电码化发送电流
        public static final int TYPE_AQ_CODED_CARRIER_FREQUENCY_CF = 0X52;//电码化载频（电码化频率）
        public static final int TYPE_AQ_CODED_LOW_F = 0X54;//电码化低频
        public static final int TYPE_AQ_CODED_UPPER_SIDE_F = 0X55;//电码化上边频
        public static final int TYPE_AQ_CODED_LOWER_SIDE_F = 0X56;//电码化下边频

        public static final int TYPE_AQ_FREQUENCY_SHIFT_TRANSMITTER_SENDING_V = 0X58;//移频发送器发送电压
        public static final int TYPE_AQ_FREQUENCY_SHIFT_TRANSMITTER_SENDING_C = 0X59;//移频发送器发送电流
        public static final int TYPE_AQ_CARRIER_FREQUENCY_OF_FREQUENCY_SHIFT_TRANSMITTER_FStF = 0X5A;//移频发送器载频（移频发送频率）
        public static final int TYPE_AQ_FREQUENCY_SHIFT_TRANSMISSION_LOW_F = 0X5B;//移频发送低频
        public static final int TYPE_AQ_MAIN_RAIL_IN_VOLTAGE_FSRV = 0X5C;//主轨轨入电压（移频接收电压）
        public static final int TYPE_AQ_MAIN_RAIL_IN_CARRIER_FREQUENCY_FSRF = 0X5D;//主轨轨入载频（移频接收频率）
        public static final int TYPE_AQ_MAIN_RAIL_IN_LOW_F = 0X5E;//主轨轨入低频
        public static final int TYPE_AQ_RAIL_OUT_1_VOLTAGE_FS = 0X5F;//（移频）轨出1电压
        public static final int TYPE_AQ_TRACK_OUT_1_CARRIER_FREQUENCY_MR = 0X60;//（主轨）轨出1载频
        public static final int TYPE_AQ_RAIL_OUT_1_LOW_FREQUENCY_MR = 0X61;//（主轨）轨出1低频
        public static final int TYPE_AQ_RAIL_OUT_2_VOLTAGE_FS = 0X62;//（移频）轨出2电压
        public static final int TYPE_AQ_TRACK_OUT_2_CARRIER_FREQUENCY_ST = 0X63;//轨出2载频（小轨）
        public static final int TYPE_AQ_TRACK_OUT_2_LOW_FREQUENCY_ST = 0X64;//轨出2低频（小轨）
        public static final int TYPE_AQ_FREQUENCY_SHIFT_TRANSMISSION_CABLE_SIDE_V = 0X65;//移频发送电缆侧电压
        public static final int TYPE_AQ_FREQUENCY_SHIFT_RECEIVING_CABLE_SIDE_V = 0X66;//移频接收电缆侧电压
        public static final int TYPE_AQ_RAIL_OUT_1_UPPER_SIDE_FREQUENCY_MR = 0X67;//（主轨）轨出1上边频
        public static final int TYPE_AQ_RAIL_OUT_1_LOWER_SIDE_FREQUENCY_MR = 0X68;//（主轨）轨出1下边频
        public static final int TYPE_AQ_FREQUENCY_SHIFT_TRANSMISSION_CABLE_SIDE_C = 0X69;//移频发送电缆侧电流
        public static final int TYPE_AQ_BALLAST_BED_R = 0X6A;//道床电阻
        public static final int TYPE_AQ_RAIL_OUT_1_SHUNT_RESIDUAL_V = 0X6B;//轨出1分路残压（0.15欧姆）
        public static final int TYPE_AQ_SMALL_RAIL_INPUT_V = 0X6C;//小轨轨入电压
        public static final int TYPE_AQ_ZPW_2000_INTERFACE_INFORMATION = 0X90;//ZPW-2000接口信息
        public static final int TYPE_AQ_TRACK_CODING = 0X92;//轨道编码
        public static final int TYPE_AQ_FREQUENCY_SHIFT_TRANSMISSION_CABLE_SIDE_CARRIER_F = 0X6D;//移频发送电缆侧载频
        public static final int TYPE_AQ_FREQUENCY_SHIFT_TRANSMISSION_CABLE_SIDE_LOWER_F = 0X6E;//移频发送电缆侧低频
        public static final int TYPE_AQ_FREQUENCY_SHIFT_RECEIVING_CABLE_SIDE_CARRIER_F = 0X6F;//移频接收电缆侧载频
        public static final int TYPE_AQ_FREQUENCY_SHIFT_RECEIVING_CABLE_SIDE_LOWER_F = 0X76;//移频接收电缆低载频
        public static final int TYPE_AQ_RECEIVING_END_CABLE_SIDE_SMALL_RAIL_CARRIER_F = 0X72;//受端电缆侧小轨载频
        public static final int TYPE_AQ_RECEIVING_END_CABLE_SIDE_SMALL_RAIL_LOWER_F = 0X73;//受端电缆侧小轨低频
        public static final int TYPE_AQ_SMALL_RAIL_IN_CARRIER_F = 0X74;//小轨轨入载频
        public static final int TYPE_AQ_SMALL_RAIL_IN_LOWER_F = 0X75;//小轨轨入低频
        public static final int TYPE_AQ_RECEIVING_END_CABLE_SIDE_SMALL_RAIL_V = 0X78;//受端电缆侧小轨电压

        //环境监测
        public static final int TYPE_AQ_ENVIRONMENTAL_ANALOG_QUANTITY = 0X70;//环境模拟量（含空调电压）
        public static final int TYPE_AQ_AIR_CONDITIONING_PARAMETERS = 0X71;//空调参数

        //电缆绝缘及电源漏流
        public static final int TYPE_AQ_CABLE_INSULATION = 0X80;//
        public static final int TYPE_AQ_POWER_LEAKAGE = 0X81;//

        //新增模拟量
        public static final int TYPE_AQ_RELAY_TERMINAL_V = 0X91;//异物继电器端电压
        public static final int TYPE_AQ_OUTDOOR_MONITORING_TRACK_ANALOG_QUANTITY = 0X93;//室外监测轨道模拟量（指ZPW-2000室外采集）
        public static final int TYPE_AQ_OUTDOOR_MONITORING_TRACK_V = 0X94;//室外监测轨道电压（指25 Hz/50 Hz轨道电路室外采集）
        public static final int TYPE_AQ_OUTDOOR_MONITORING_SIGNAL = 0X95;//室外监测信号机
        public static final int TYPE_AQ_OUTDOOR_MONITORING_SWITCH_INDICATION_V = 0X96;//室外监测道岔表示电压


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

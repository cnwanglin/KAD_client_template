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
        public static final int TYPE_ACTION_CURVE =0X10;//道岔动作曲线
        public static final int TYPE_FUEL_PRESSURE =0X11;    //道岔油压
        public static final int TYPE_PULL =0X12;    //道岔拉力
        public static final int TYPE_HIGH_VOLT_WAVE =0X13;  //高压不对成波形
        public static final int TYPE_SUDDEN_OFF_CURVE =0X20;    //外电网瞬间断电曲线
        public static final int TYPE_FUEL_PRESSURE_CURVE =0X21; //油压曲线
        public static final int TYPE_INPUT_MUTATION_CRUVE =0X22; //电源屏输入突变曲线
    }

    //报警子类型
    public static class CSMSignalEquipmentAlarmType {
        public static final int TYPE_SJ_ALARM = 0X01;//SJ锁闭封联报警
        public static final int TYPE_TW_REPRESENT_NOT_SAME = 0X02;//道岔表示不一致（保留）
        public static final int TYPE_TW_CROWD = 0X03;//挤岔
        public static final int TYPE_TRAIN_ABNORMAL_CLOSE = 0X04;//列车信号非正常关闭
        public static final int TYPE_FIRE = 0X05;//火灾
        public static final int TYPE_BREAKDOWN_BTN = 0X06;//故障通知按钮
        public static final int TYPE_INPUT_POWER_OFF_ALARM = 0X07;//外电网输入电源断相/断电报警
        public static final int TYPE_THREE_POWER_WRONG_SEQ = 0X08;//外电网三相电源错序报警
        public static final int TYPE_INPUT_POWER_SUDDEN_OFF_ALARM = 0X09;//外电网输入电源瞬间断电报警
        public static final int TYPE_TRAIN_BROKEN_WIRE_ALARM = 0X0A;//列车主灯丝断丝报警
        public static final int TYPE_BROKEN_WIRE_ALARM = 0X0B;//熔丝断丝报警
        public static final int TYPE_SWITCH_MACHINE_REPRESENT_GAP_ALARM = 0X0C;//转辙机表示缺口报警
        public static final int TYPE_INTREVAL_EQUITMENT_ALARM = 0X0D;//区间设备报警
        public static final int TYPE_SIGNAL_CENTRAL_COLLECT_ALARM = 0X0E;//信号集中检测内部采集通信故障报警
        public static final int TYPE_ENV_ALARM = 0X0F;//环境监测报警
        public static final int TYPE_TDCS_CTC_ALARM = 0X10;//TDCS/CTC系统报警
        public static final int TYPE_TRAIN_CONTRL_ALARM = 0X11;//列控系统报警
        public static final int TYPE_UNION_lOCK_ALARM = 0X12;//计算机联锁系统报警
        public static final int TYPE_ELECTRIC_LIMIT_ALARM = 0X13;//电气特性超限报警
        public static final int TYPE_OTHER_COMMUNICATION_ALARM = 0X14;//检测御其他系统通信接口故障报警
        public static final int TYPE_TW_COUNT_LIMIT = 0X16;//道岔运用次数超限报警
        public static final int TYPE_COMPENSATION_CAPACITANCE_ALARM = 0X17;//补偿电容断线预警
        public static final int TYPE_ZPW_ALARM = 0X18;//ZPW-2000 系统报警应答器

        public static final int TYPE_RESPONSER_ALARM = 0X1A;//应答器报警
        public static final int TYPE_TV_ALARM = 0X1B;//智能电源屏报警
        public static final int TYPE_INTREVAL_WATCH_ALARM = 0X1C;//区间综合监控系统报警
        public static final int TYPE_DISASTER_ALIEN_ALARM = 0X22;//防灾异物侵限报警
        public static final int TYPE_TSRS_ALARM = 0X26;//TSRS设备报警
        public static final int TYPE_RBC_ALARM = 0X27;//RBC报警
        public static final int TYPE_TV_OUT_OFF_ALARM = 0X28;//电源屏输出断电报警
        public static final int TYPE_TW_NO_PRESENT_ALARM = 0X29;//道岔无表示报警
        public static final int TYPE_ANALOG_PREDICT = 0X30;//各种设备模拟量变化趋势、突变、异常波动预警
        public static final int TYPE_CONTROL_BTN_RECORD = 0X53;//控制台按钮操作记录
        public static final int TYPE_TW_LONG_BUSY_ALARM = 0X58;//轨道长时间占用报警
        public static final int TYPE_ANALYSIS_PRIDICT = 0X62;//智能分析预警（预留）
        public static final int TYPE_ANALYSIS_DIAGNOSIS = 0X64;//智能分析故障诊断（预留）
        public static final int TYPE_TW_STATE_NOT_SAME_ALARM = 0X70;//ZPW-2000 轨道状态不一致报警
        public static final int TYPE_TWO_POWER_OFF = 0X90;//外电网双路断电报警
        public static final int TYPE_OUT_WATCH_PREDICT = 0XA0;//ZPW-2000 区间轨道电路室外监控预警
        public static final int TYPE_OUT_WATCH_ALARM = 0XA1;//ZPW-2000 区间轨道电路室外监控报警
        public static final int TYPE_TV_OUT_OFF_PHASE = 0XA2;//电源屏输出断相
        public static final int TYPE_TV_OUT_WRONG_SEQ = 0XA3;//电源屏输出错序
    }
    //工作日志子类型
    public static class CSMJobRecordType {
        public static final int TYPE_SYSTEM_WORK = 0X03;//系统工作日志
        public static final int TYPE_USER_OPERATE = 0X04;//用户操作日志
        public static final int TYPE_SKYLIGHT_WORK = 0X05;//天窗作业日志
        public static final int TYPE_CLOCK_TIMING = 0X06;//时钟校时日志
        public static final int TYPE_BUTTON_OPERATE_RECORD = 0X07;//按钮操作记录日志
    }

    //统计子类型
    public static class CSMStatisticalType {
        public static final int TYPE_TW_ACTION_COUNT = 0X60;//道岔动作次数
        public static final int TYPE_SECTION_APPLICATION_COUNT = 0X61;//区段运用次数/时间
        public static final int TYPE_SIGNAL_OPENING_COUNT = 0X62;//信号开放次数/时间
        public static final int TYPE_TRAIN_BUTTON_COUNT = 0X63;//列车、调车按钮次数/时间统计
        public static final int TYPE_BREAKING_BUTTON_COUNT = 0X64;//破封按钮使用次数/时间统计
        public static final int TYPE_EQUIPMENT_FAILURE_STATISTIC = 0X65;//设备故障统计

    }

    //特色功能子类型
    public static class CSMKeyFeaturesType {
        public static final int TYPE_KSK_1 = 0X01;//卡斯克信号——1
        public static final int TYPE_KSK_22 = 0X22;//卡斯克信号——22
        public static final int TYPE_HNHH = 0X02;//河南辉煌科技
        public static final int TYPE_BJQL = 0X03;//北京全路通信信号研究设计院集团有限公司
        public static final int TYPE_SHTD = 0X04;//上海铁大电信科技股份有限公司
        public static final int TYPE_ZGTD = 0X05;//中国铁道科学研究院集团有限公司
        public static final int TYPE_SZCL = 0X06;//深圳长龙铁路电子工程有限公司
        public static final int TYPE_SCWD = 0X07;//四川网达科技有限公司
        public static final int TYPE_NCLT = 0X08;//南昌路通高新技术有限责任公司
        public static final int TYPE_BJJD = 0X09;//北京交大微联科技有限公司

    }

    //视频缺口文件类型
    public static class CSMVideoType {
        public static final int TYPE_REAL_TIME_IMG = 0X01;//实时图像
        public static final int TYPE_WARING_ING = 0X02;//报警图像
        public static final int TYPE_WRAING_RECOVERY_IMG = 0X03;//报警恢复图像
        public static final int TYPE_PASS_CAR_IMG = 0X04;//过车图像
        public static final int TYPE_VIBRATION_IMG = 0X05;//振动图像
        public static final int TYPE_STATIC_IMG = 0X06;//静态图像
        public static final int TYPE_PASS_CAR_VIDEO = 0X07;//过车视频
        public static final int TYPE_PULL_VIDEO = 0X08;//扳动视频

    }
}

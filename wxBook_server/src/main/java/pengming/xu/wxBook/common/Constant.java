package pengming.xu.wxBook.common;

/**
 * @ClassName Constant
 * @Description 常量保存类
 * @Author xupm
 * @Date 2019/6/19 001922:39
 * @Since V1.0
 */
public class Constant {

    private Constant(){}

    //分隔符
    public static final String DEFAULT_SEPARATOR = ",";

    //默认的日期格式，年月日
    public static final String DEFAULT_Y_M_D = "yyyy-MM-dd";

    public static final String INDEX_SUFFIX_DATE = "yyyy.MM.dd";

    //默认日期格式，年月日时分秒
    public static final String DEFAULT_Y_M_D_H_M_S = "yyyy-MM-dd HH:mm:ss";

    //默认日期格式，年月日时分秒毫秒
    public static final String DEFAULT_Y_M_D_H_M_S_SSS = "yyyy-MM-dd HH:mm:ss.SSS";

    //默认的日期格式，年月
    public static final String DEFAULT_Y_M = "yyyy-MM";

    //默认的日期格式，年
    public static final String DEFAULT_Y = "yyyy";

    //每天的第一秒
    public static final String DAY_FIRST_SECOND = " 00:00:00";

    //每天的最后一秒
    public static final String DAY_LAST_SECOND = " 23:59:59";

    //空对象
    public static final Object NULL_OBJECT = null;

    //空字符串
    public static final String EMPTY_STRING = "";

    // int 类型 0
    public static final Integer ZERO = 0;

    //取top时，默认为所有的值
    public static final Integer TOP_ALL = 0;

    public static final Integer TYPE_OF_ALL = 0;

    // 默认取前面长度
    public static final Integer DEFAULT_TOP_SIZE = 10;

    public static final String DEFAULT_TOP = "10";

    //不存在相关值
    public static final Integer NOT_EXIST = -1;

    //表示所有的ID
    public static final Integer ID_OF_ALL = -1;

    //默认权限安全级别
    public static final String DEFAULT_PERM_SECURITY_LEVEL = "all";

    //未知错误
    public static final String UNKNOWN_ERROR = "unknown error";
}

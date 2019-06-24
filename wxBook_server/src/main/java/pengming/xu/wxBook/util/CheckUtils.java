package pengming.xu.wxBook.util;

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName CheckUtils
 * @Description 检验工具类
 * @Author xupm
 * @Date 2019-6-24 14:01
 * @Since 1.0
 **/
public class CheckUtils {

    private Logger logger = LogManager.getLogger(this.getClass());

    /**
     * @Description 电话号码校验工具
     * @Param
     * @Return
     * @Date 2019-6-24 14:02
     * @Author xupm
     * @Since
     **/
    public static boolean checkPhone(String telephone){
        if(StringUtils.isNotEmpty(telephone)){
            String regex = "^1[34578][0-9]{9}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(telephone);
            return matcher.matches();
        }
        return false;
    }
}

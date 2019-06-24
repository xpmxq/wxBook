package pengming.xu.wxBook.controller;

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;
import pengming.xu.wxBook.bean.LoginBean;
import pengming.xu.wxBook.common.ApiCode;
import pengming.xu.wxBook.common.ApiResult;
import pengming.xu.wxBook.util.CheckUtils;

/**
 * @ClassName LoginController
 * @Description 登录控制器
 * @Author xupm
 * @Date 2019/6/19 22:22
 * @Since V1.0
 */
@RestController
@RequestMapping("login")
public class LoginController {

    private Logger logger = LogManager.getLogger(this.getClass());

    /**
     * @Description 微信登录，用户存在，登录成功返回token，用户不存在，则注册后登录
     * @Param [telephone, code]
     * @Return pengming.xu.wxBook.common.ApiResult
     * @Date 2019-6-24 13:50
     * @Author xupm
     * @Version 1.0
     **/
    @PostMapping("wx")
    public ApiResult wxLogin(@RequestParam("telephone") String telephone, @RequestParam("code") String code){
        logger.debug("接口请求通过微信登录,telephone:"+telephone+",code:"+code);
        if (StringUtils.isEmpty(telephone) || StringUtils.isEmpty(code) || !CheckUtils.checkPhone(telephone)){
            return ApiResult.fail(ApiCode.REQUEST_PARAM_ERROR);
        }
        return ApiResult.success();
    }

}

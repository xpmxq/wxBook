package pengming.xu.wxBook.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;
import pengming.xu.wxBook.bean.LoginBean;
import pengming.xu.wxBook.common.ApiResult;

/**
 * @ClassName LoginController
 * @Description 登录控制器
 * @Author xupm
 * @Date 2019/6/19 001922:22
 * @Since V1.0
 */
@RestController
@RequestMapping("login")
public class LoginController {

    private Logger logger = LogManager.getLogger(this.getClass());

    /**
      * @Author xupm
      * @Description 微信登录
      * @Date 2019/6/19 0019 22:54
      * @throws
      * @return ${return_type}
      */
    @PostMapping("wx")
    public ApiResult wxLogin(@RequestParam("telephone") String telephone, @RequestParam("code") String code){
        logger.debug("接口请求通过微信登录,telephone:"+telephone+",code:"+code);
        return ApiResult.success();
    }

}

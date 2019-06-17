package pengming.xu.wxBook.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AccountController
 * @Description 账号管理控制器
 * @Author xupm
 * @Date 2019-06-17 17:38
 * @Since 1.1.0
 */
@RestController
@RequestMapping("account")
public class AccountController {

    private Logger logger = LogManager.getLogger(this.getClass());
}

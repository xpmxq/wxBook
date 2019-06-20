package pengming.xu.wxBook.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pengming.xu.wxBook.bean.UserBean;
import pengming.xu.wxBook.serveice.UserService;

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

    @Autowired
    private UserService userServiceImpl;

    @GetMapping("test")
    public void test(@RequestParam("userId")String userId){
        logger.debug("test");
        UserBean userBean = userServiceImpl.getUserById(userId);
        logger.debug("user:"+userBean);
    }
}

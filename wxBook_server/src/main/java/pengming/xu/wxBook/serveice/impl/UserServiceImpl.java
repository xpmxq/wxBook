package pengming.xu.wxBook.serveice.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pengming.xu.wxBook.bean.UserBean;
import pengming.xu.wxBook.dao.UserDAO;
import pengming.xu.wxBook.serveice.UserService;

/**
 * @ClassName UserServiceImpl
 * @Description 用户管理类
 * @Author xupm
 * @Date 2019/6/20 002022:38
 * @Since V1.0
 */
@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LogManager.getLogger(this.getClass());

    @Autowired
    private UserDAO userDAO;

    /**
      * @Author xupm
      * @Description 根据用户ID查询用户信息
      * @Date 2019/6/20 0020 22:42
      * @throws
      * @return ${return_type}
      */
    @Override
    public UserBean getUserById(String userId) {
        logger.debug("业务请求根据用户ID查询用户信息,userId:"+userId);
        return userDAO.selectUserById(userId);
    }
}

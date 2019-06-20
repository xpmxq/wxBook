package pengming.xu.wxBook.serveice;

import pengming.xu.wxBook.bean.UserBean;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author xupm
 * @Date 2019/6/20 002022:38
 * @Since V1.0
 */
public interface UserService {

    /**
      * @Author xupm
      * @Description 根据用户ID查询用户信息
      * @Date 2019/6/20 0020 22:41
      * @throws
      * @return ${return_type}
      */
    UserBean getUserById(String userId);
}

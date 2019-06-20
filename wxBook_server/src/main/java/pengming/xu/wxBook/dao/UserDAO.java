package pengming.xu.wxBook.dao;

import pengming.xu.wxBook.bean.UserBean;

/**
 * @ClassName UserDAO
 * @Description 用户对象持久化类
 * @Author xupm
 * @Date 2019/6/20 002022:24
 * @Since V1.0
 */
public interface UserDAO {

    /**
      * @Author xupm
      * @Description 通过userID查询用户对象
      * @Date 2019/6/20 0020 22:28
      * @throws
      * @return ${return_type}
      */
    UserBean selectUserById(String userId);
}

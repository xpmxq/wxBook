package pengming.xu.wxBook.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;

/**
 * @ClassName MybatisConfigeration
 * @Description mybatis数据源初始化bean
 * @Author xupm
 * @Date 2019-06-17 17:56
 * @Since 1.1.0
 */
@SpringBootConfiguration
@MapperScan("pengming.xu.wxBook.dao")
public class MybatisConfiguration {


}

package pengming.xu.wxBook.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

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

    @Value("${mybatis.mapper-locations}")
    private String mybatisMapperLocations;

    @Value("${mybatis.config-location}")
    private String mybatisConfigLocation;

    /** 
    * @Description: 重新定义SQLSessionFactory 
    * @Param: [] 
    * @return: org.apache.ibatis.session.SqlSessionFactory 
    * @Author: xupm
    * @Date: 2019/6/17 22:08
    */ 
    @Bean
    public SqlSessionFactory SqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());

        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(mybatisMapperLocations));
        sqlSessionFactoryBean.setConfigLocation(resolver.getResource(mybatisConfigLocation));

        return sqlSessionFactoryBean.getObject();
    }

    /** 
    * @Description: 重新定义数据源，采用druid连接 
    * @Param: [] 
    * @return: javax.sql.DataSource 
    * @Author: xupm
    * @Date: 2019/6/17 22:07
    */ 
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource(){
        return new DruidDataSource();
    }
}

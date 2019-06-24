package pengming.xu.wxBook.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import pengming.xu.wxBook.interceptor.ServiceTokenInterceptor;

import java.nio.charset.Charset;
import java.util.List;

/**
 * @ClassName WxBookConfigeration
 * @Description 重写web配置中心，增加拦截器
 * @Author xupm
 * @Date 2019/6/19 001922:14
 * @Since V1.0
 */
@SpringBootConfiguration
public class WxBookWebConfiguration extends WebMvcConfigurationSupport {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ServiceTokenInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/error","/login/wx")
                .excludePathPatterns("/static/**");
        super.addInterceptors(registry);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }

    /**
      * @Author xupm
      * @Description 设置返回编码为utf-8，解决乱码问题
      * @Date 2019/6/19 0019 22:17
      * @throws
      * @return ${return_type}
      */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        converters.add(responseBodyConverter());
    }

    @Bean
    public HttpMessageConverter<String> responseBodyConverter() {
        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        return converter;
    }

    /**
     * @Description: 设置Access-Control-Allow-Origin 解决跨域访问问题
     * @Param: []
     * @return: org.springframework.web.cors.CorsConfiguration
     * @Author: pengming.xu
     * @Date: 2018/11/20 16:47
     */
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*"); // 允许任何域名使用
        corsConfiguration.addAllowedHeader("*"); // 允许任何头
        corsConfiguration.addAllowedMethod("*"); // 允许任何方法（post、get等）
        return corsConfiguration;
    }

    /**
     * @Description: 利用corsFileter过滤器，过滤所有请求，处理跨域设置
     * @Param: []
     * @return: org.springframework.web.filter.CorsFilter
     * @Author: pengming.xu
     * @Date: 2018/11/20 16:48
     */
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig()); // 对接口配置跨域设置
        return new CorsFilter(source);
    }
}

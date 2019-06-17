package pengming.xu.wxBook.interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName ServiceTokenInterceptor
 * @Description Token验证拦截器
 * @Author xupm
 * @Date 2019-06-17 17:41
 * @Since 1.1.0
 */
public class ServiceTokenInterceptor extends HandlerInterceptorAdapter{

    private Logger logger = LogManager.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.debug("开始验证token");
        return super.preHandle(request, response, handler);
    }
}

package pengming.xu.wxBook.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RestemplateConfiguration
 * @Description
 * @Author xupm
 * @Date 2019/6/24 002421:52
 * @Since V1.0
 */
@SpringBootConfiguration
@Order(1)
public class RestemplateConfiguration {

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

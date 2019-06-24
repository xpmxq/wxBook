package pengming.xu.wxBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"file:config/database.properties","file:config/redis.properties","file:config/wx.properties"})
public class WxBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxBookApplication.class, args);
	}

}

package pengming.xu.wxBook.sao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pengming.xu.wxBook.bean.WxOpenIdBean;
import pengming.xu.wxBook.common.Constant;

import java.util.Optional;

/**
 * @ClassName WxApiSao
 * @Description 微信API接口请求类
 * @Author xupm
 * @Date 2019/6/24 002421:19
 * @Since V1.0
 */
@Service
public class WxApiSao {

    private Logger logger = LogManager.getLogger(this.getClass());

    @Value("${wx.api.code.to.openid.url}")
    private String codeToOpenId;

    @Autowired
    private RestTemplate restTemplate;


    /**
      * @Author xupm
      * @Description 通过微信API用code换取openId
      * @Date 2019/6/24 21:38
      * @throws
      * @return ${return_type}
      */
    public Optional<WxOpenIdBean> getOpenIdByCode(String code, String appId, String secret){
        logger.debug("业务请求通过code获取openId，code:"+code+",appId:"+appId+",secret:"+secret);
        String result = restTemplate.getForObject(codeToOpenId,String.class,appId,secret,code, Constant.WX_CODE_TO_SESSION_GRANT_TYPE);
        logger.debug(result);
        return null;
    }
}

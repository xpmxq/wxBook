package pengming.xu.wxBook.bean;

/**
 * @ClassName WXOpenIdBean
 * @Description 微信openId返回对象
 * @Author xupm
 * @Date 2019/6/24 21:14
 * @Since V1.0
 */
public class WxOpenIdBean {

    private String openId;

    private String sessionKey;

    private String unionId;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    @Override
    public String toString() {
        return "WXOpenIdBean{" +
                "openId='" + openId + '\'' +
                ", sessionKey='" + sessionKey + '\'' +
                ", unionId='" + unionId + '\'' +
                '}';
    }
}

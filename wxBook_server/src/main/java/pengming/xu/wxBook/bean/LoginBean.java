package pengming.xu.wxBook.bean;

/**
 * @ClassName LoginBean
 * @Description 登录对象
 * @Author xupm
 * @Date 2019/6/19 001922:47
 * @Since V1.0
 */
public class LoginBean {

    //手机号码
    private String telephone;

    //微信小程序code
    private String code;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "telephone='" + telephone + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}

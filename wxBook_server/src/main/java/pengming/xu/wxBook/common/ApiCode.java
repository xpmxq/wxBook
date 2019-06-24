package pengming.xu.wxBook.common;

/**
 * @ClassName ApiCode
 * @Description TODO
 * @Author xupm
 * @Date 2019/6/19 001922:32
 * @Since V1.0
 */
public enum ApiCode {

    SUCCESS("WXBOOK-01","请求成功"),
    FAIL("WXBOOK-99","请求失败"),
    SYSTEM_ERROR("WXBOOK-02","系统异常"),
    REQUEST_PARAM_ERROR("WXBOOK-03","请求参数异常");

    private String code;

    private String msg;

    ApiCode(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }}

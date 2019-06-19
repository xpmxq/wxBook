package pengming.xu.wxBook.common;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @ClassName ApiResult
 * @Description 接口返回对象
 * @Author xupm
 * @Date 2019/6/19 001922:26
 * @Since V1.0
 */
public class ApiResult<T> implements Serializable {

    //是否成功
    private boolean isSuccess;

    //返回码
    private String resCode;

    //返回消息
    private String message;

    //原因
    private String cause;

    //返回体
    private T body;

    private ApiResult(){}

    private ApiResult(boolean isSuccess, String resCode, String message, String cause, T body) {
        this.isSuccess = isSuccess;
        this.resCode = resCode;
        this.message = message;
        this.cause = cause;
        this.body = body;
    }

    /**
      * @Author xupm
      * @Description 请求操作成功
      * @Date 2019/6/19 0019 22:41
      * @throws
      * @return ${return_type}
      */
    public static ApiResult success(Object body){
        return new ApiResult(true,ApiCode.SUCCESS.getCode(),ApiCode.SUCCESS.getMsg(),Constant.EMPTY_STRING,body);
    }

    /**
      * @Author xupm
      * @Description 请求操作成功，无返回体
      * @Date 2019/6/19 0019 22:46
      * @throws
      * @return ${return_type}
      */
    public static ApiResult success(){
        return new ApiResult(true,ApiCode.SUCCESS.getCode(),ApiCode.SUCCESS.getMsg(),Constant.EMPTY_STRING,Constant.NULL_OBJECT);
    }

    /**
      * @Author xupm
      * @Description 请求失败返回
      * @Date 2019/6/19 0019 22:43
      * @throws
      * @return ${return_type}
      */
    public static ApiResult fail(Object body){
        return new ApiResult(false,ApiCode.FAIL.getCode(),ApiCode.FAIL.getMsg(),ApiCode.FAIL.getMsg(),body);
    }

    /**
      * @Author xupm
      * @Description 请求操作失败，无返回包体
      * @Date 2019/6/19 0019 22:45
      * @throws
      * @return ${return_type}
      */
    public static ApiResult fail(){
        return fail(Constant.NULL_OBJECT);
    }

    /**
      * @Author xupm
      * @Description 请求操作失败，带失败原因，无返回包体
      * @Date 2019/6/19 0019 22:46
      * @throws
      * @return ${return_type}
      */
    public static ApiResult fail(@NotNull ApiCode reason){
        return new ApiResult(false,reason.getCode(),reason.getMsg(),reason.getMsg(), Constant.NULL_OBJECT);
    }

    /**
      * @Author xupm
      * @Description 请求操作失败，带失败原因，无返回包体
      * @Date 2019/6/19 0019 22:46
      * @throws
      * @return ${return_type}
      */
    public static ApiResult fail(@NotNull ApiCode reason,@NotNull Throwable throwable){
        return new ApiResult(false,reason.getCode(),reason.getMsg(),throwable.getMessage(), Constant.NULL_OBJECT);
    }

    /**
      * @Author xupm
      * @Description 返回结果
      * @Date 2019/6/19 0019 22:47
      * @throws
      * @return ${return_type}
      */
    public static ApiResult result(@NotNull ApiCode apiCode, Object body){
        return new ApiResult(false,apiCode.getCode(),apiCode.getMsg(),apiCode.getMsg(),body);
    }

    /**
      * @Author xupm
      * @Description 系统错误
      * @Date 2019/6/19 0019 22:47
      * @throws
      * @return ${return_type}
      */
    public static ApiResult systemError(@NotNull Throwable ex){
        return new ApiResult(false,ApiCode.SYSTEM_ERROR.getCode(),ApiCode.SYSTEM_ERROR.getMsg(),ex.getMessage(),Constant.NULL_OBJECT);
    }

    /**
      * @Author xupm
      * @Description 系统错误
      * @Date 2019/6/19 0019 22:47
      * @throws
      * @return ${return_type}
      */
    public static ApiResult systemError(){
        return new ApiResult(false,ApiCode.SYSTEM_ERROR.getCode(),ApiCode.SYSTEM_ERROR.getMsg(),Constant.UNKNOWN_ERROR,Constant.NULL_OBJECT);
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}

package pengming.xu.wxBook.bean;

/**
 * @ClassName UserBean
 * @Description 用户对象
 * @Author xupm
 * @Date 2019/6/20 002022:25
 * @Since V1.0
 */
    public class UserBean {

        private String userId;

        private String userName;

        private String telephone;

        private String openId;

        private String headImage;

        private String nickName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", telephone='" + telephone + '\'' +
                ", openId='" + openId + '\'' +
                ", headImage='" + headImage + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

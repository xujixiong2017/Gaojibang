package ningzhi.com.user.Model;

/**
 * 保存用户登录的结果等信息
 * <p/>
 * Created by admin on 2016/8/2.
 */

public class Login_Model {

    //用户名
    private String passworld;
    //密码
    private String username;
    //用户登录的状态
    private int statue;
    //用户的属性，包括游客，普通用户，维修师傅，和商家。
    private int level;

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public int getStatue() {
        return statue;
    }

    public void setStatue(int statue) {
        this.statue = statue;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
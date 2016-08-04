package ningzhi.com.Base;

import android.app.Application;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by admin on 2016/8/3.
 */
public interface IBaseActivity {

    /**
     * 拉取Application对象
     *
     * @return
     */
    public abstract Application getApplication();

    /**
     * 开启服务
     */
    public abstract void startService();

    /**
     * 关闭服务
     */
    public abstract void stopService();

    /**
     * 判断网络连接情况
     *
     * @return
     */
    public abstract boolean validateInternet();

    /**
     * 退出应用
     */
    public abstract void isExit();

    /**
     * 判断GPS是否打开
     *
     * @return
     */
    public abstract boolean hasLocationGPS();

    /**
     * 检查内存卡.
     */
    public abstract void checkMemoryCard();

    /**
     * 读取静进度条
     *
     * @return
     */
    public abstract ProgressDialog getProgressDialog();

    /**
     * 返回Activity上下文
     *
     * @return
     */
    public abstract Context getContext();

    /**
     * 获取当前登录用户的SharedPreferences配置.
     *
     * @return
     */
    public SharedPreferences getLoginUserSharedPre();

    /**
     * 用户是否在线（当前网络是否重连成功）
     *
     * @return
     */
    public boolean getUserOnlineState();


    /**
     * 设置用户在线状态 true 在线 false 不在线
     *
     * @param isOnline
     */
    public void setUserOnlineState(boolean isOnline);

    /**
     * 设置标题
     */
    public void setTitle(String title);
}

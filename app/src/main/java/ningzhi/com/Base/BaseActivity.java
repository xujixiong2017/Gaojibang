package ningzhi.com.Base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/**
 * Created by admin on 2016/8/2.
 */

public class BaseActivity extends Activity implements IBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void startService() {

    }

    @Override
    public void stopService() {

    }

    @Override
    public boolean validateInternet() {
        return false;
    }

    @Override
    public void isExit() {

    }

    @Override
    public boolean hasLocationGPS() {
        return false;
    }

    @Override
    public void checkMemoryCard() {

    }

    @Override
    public ProgressDialog getProgressDialog() {
        return null;
    }

    @Override
    public Context getContext() {
        return null;
    }

    @Override
    public SharedPreferences getLoginUserSharedPre() {
        return null;
    }

    @Override
    public boolean getUserOnlineState() {
        return false;
    }

    @Override
    public void setUserOnlineState(boolean isOnline) {

    }

    @Override
    public void setTitle(String title) {

    }
}

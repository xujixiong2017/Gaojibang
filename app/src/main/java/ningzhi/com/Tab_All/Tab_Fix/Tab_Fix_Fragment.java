package ningzhi.com.Tab_All.Tab_Fix;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ningzhi.com.gaojibang.R;

/**
 * Created by admin on 2016/8/4.
 */
public class Tab_Fix_Fragment extends Fragment {

    //初始化layout文件
    private View Fix_layout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fix_layout = inflater.inflate(R.layout.fix_fragment, null);

        return Fix_layout;
    }

    //初始化fix_fragment.xml界面信息
    public void init() {

    }
}

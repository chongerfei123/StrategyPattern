package st.zlei.com.strategypattern;

import android.util.Log;

import java.util.Random;

/**
 * Created by zl on 2017/7/24.
 */

public class CStrategy extends StrategyAbs {
    private static final String TAG = "Strategy";

    @Override
    boolean DoWork() {

        Log.d(TAG, "DoWork: i am C,i am working now");

        return true;
    }
}

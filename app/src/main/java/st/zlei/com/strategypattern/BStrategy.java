package st.zlei.com.strategypattern;

import android.util.Log;

import java.util.Random;

/**
 * Created by zl on 2017/7/24.
 */

public class BStrategy extends StrategyAbs {
    private static final String TAG = "Strategy";

    @Override
    boolean DoWork() {
        Random random = new Random();
        boolean b = random.nextBoolean();
        if (b){
            Log.d(TAG, "DoWork: i am B,i am working now");
        }else {
            Log.d(TAG, "DoWork: i am B,i am busying");
        }
        return b;
    }
}

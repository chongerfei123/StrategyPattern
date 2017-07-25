package st.zlei.com.strategypattern;

/**
 * Created by zl on 2017/7/24.
 */

class OverALlStrategy extends StrategyAbs {
    AStrategy aStrategy = new AStrategy();
    BStrategy bStrategy = new BStrategy();
    CStrategy cStrategy = new CStrategy();
    @Override
    boolean DoWork() {
        if (!aStrategy.DoWork()) {
            if (!bStrategy.DoWork()) {
                cStrategy.DoWork();
            }
        }
        return false;
    }
}

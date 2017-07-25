package st.zlei.com.strategypattern;

/**
 * Created by zl on 2017/7/24.
 */

class StrategyUtil {
    private StrategyAbs strategyAbs;

    //调用者在这里传进来的就是调用者想要使用的A，还是B还是C
    //传进来的都是StrategyAbs的子类，所以用StrategyAbs可以统一接收
    public void setStrategyType(StrategyAbs strategyType) {
        strategyAbs = strategyType;
    }

    //调用子类的方法
    public void work() {
        strategyAbs.DoWork();
    }
}

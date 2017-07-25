package st.zlei.com.strategypattern;

/**
 * Created by zl on 2017/7/24.
 */

//算法的抽象父类
public abstract class StrategyAbs {

    //每一个算法中都应该有的方法
    abstract boolean DoWork();
}

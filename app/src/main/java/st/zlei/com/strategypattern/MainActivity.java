package st.zlei.com.strategypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button a_button;
    private Button b_button;
    private Button c_button;
    private Button overAll_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a_button = (Button) findViewById(R.id.a_button);
        b_button = (Button) findViewById(R.id.b_button);
        c_button = (Button) findViewById(R.id.c_button);
        overAll_button = (Button) findViewById(R.id.overAll_button);


        a_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取对象
                StrategyUtil strategyUtil = new StrategyUtil();
                //通过setStrategyType注入想要采用策略类型
                strategyUtil.setStrategyType(new AStrategy());
                //调用策略的方法
                strategyUtil.work();
            }
        });

        b_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StrategyUtil strategyUtil = new StrategyUtil();
                strategyUtil.setStrategyType(new BStrategy());
                strategyUtil.work();
            }
        });

        c_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StrategyUtil strategyUtil = new StrategyUtil();
                strategyUtil.setStrategyType(new CStrategy());
                strategyUtil.work();
            }
        });

        overAll_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StrategyUtil strategyUtil = new StrategyUtil();
                strategyUtil.setStrategyType(new OverALlStrategy());
                strategyUtil.work();
            }
        });
    }
}

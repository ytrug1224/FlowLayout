package com.xin.flowlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;

import com.xin.flowlayout.view.FlowLayout;

public class MainActivity extends AppCompatActivity {

    private String mNames[] = {
            "welcome","android","TextView",
            "apple","jamy","kobe bryant",
            "jordan","layout","viewgroup",
            "margin","padding","text",
            "name","type","search","logcat"
    };

    private FlowLayout mFlowLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFlowLayout = (FlowLayout) findViewById(R.id.flowlayout);
        initDatas();
    }

    private void initDatas() {
        for (int i = 0; i < mNames.length; i++) {
            Button btn = new Button(this);
            MarginLayoutParams lp = new MarginLayoutParams(
                    LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT
            );

            btn.setText(mNames[i]);
            mFlowLayout.addView(btn, lp);
        }

    }
}

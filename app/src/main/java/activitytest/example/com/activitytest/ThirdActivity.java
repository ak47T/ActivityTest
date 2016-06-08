package activitytest.example.com.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by tanglubin on 2016/6/8.
 */
public class ThirdActivity extends BaseActivity {
    @Override
    protected void onCreate (Bundle savedInstancesState){
        super.onCreate(savedInstancesState);
        Log.d("3","task id is "+getTaskId());
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.third_layout);
        Button button3=(Button) findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();
            }
        });
    }
}

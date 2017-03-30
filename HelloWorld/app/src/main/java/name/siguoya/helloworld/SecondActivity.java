package name.siguoya.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    private static final String TAG="SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btn1=(Button) findViewById(R.id.button_2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //销毁当前活动，与返回按键的作用类似
                finish();
            }
        });
        Button btn11=(Button) findViewById(R.id.button_11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //销毁当前活动，与返回按键的作用类似
                Intent intent=getIntent();
                Toast.makeText(SecondActivity.this, "前一Activity的传参是：" + intent.getStringExtra("args"), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

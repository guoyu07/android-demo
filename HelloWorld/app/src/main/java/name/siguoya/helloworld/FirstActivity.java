package name.siguoya.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private static final String TAG="FirstActivity";

    //活动主界面
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        Button btn1=(Button) findViewById(R.id.button_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显示环境、显示文字、显示时长
                Toast.makeText(FirstActivity.this, "你点击了TOAST提醒", Toast.LENGTH_SHORT).show();
            }
        });
        Button btn3=(Button) findViewById(R.id.button_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //销毁当前活动，与返回按键的作用类似
                finish();
            }
        });
        Button btn4=(Button) findViewById(R.id.button_4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //活动跳转
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    //菜单注册事件
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //第一个参数用于指定菜单资源，第二个参数用于指定菜单项添加到哪一个菜单对象中
        getMenuInflater().inflate(R.menu.main, menu);
        //true：显示菜单
        //false: 隐藏菜单
        return true;
    }

    //菜单选取事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.add_item:
                //显示环境、显示文字、显示时长
                Toast.makeText(this, "You clicked add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You clicked remove", Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }
}
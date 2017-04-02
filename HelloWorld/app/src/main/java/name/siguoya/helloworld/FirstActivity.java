package name.siguoya.helloworld;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
        Log.d(TAG, "onCreate: 创建活动");
        if(savedInstanceState != null) {
            //获取本页在销毁前保留的数据
            String tempData=savedInstanceState.getString("data_key");
            Log.d(TAG, "onCreate: 临时数据：" + tempData);
        }
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
                Intent intent=new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        Button btn5=(Button) findViewById(R.id.button_5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //活动跳转
                Intent intent=new Intent("name.siguoya.helloworld.ACTION_START");
                intent.addCategory("name.siguoya.helloworld.MY_CATEGORY");
                startActivity(intent);
            }
        });
        Button btn6=(Button) findViewById(R.id.button_6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //活动跳转
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com/"));
                startActivity(intent);
            }
        });
        Button btn7=(Button) findViewById(R.id.button_7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //活动跳转
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:15521190637"));
                startActivity(intent);
            }
        });
        Button btn8=(Button) findViewById(R.id.button_8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //活动跳转
                Intent intent=new Intent();
                intent.setData(Uri.parse("baidumap://map/show?center=40.057406655722,116.29644071728&zoom=11&traffic=on&bounds=37.8608310000,112.5963090000,42.1942670000,118.9491260000"));
                startActivity(intent);

            }
        });
        Button btn9=(Button) findViewById(R.id.button_9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //活动跳转
                Intent intent=new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("args", "传递参数");
                startActivity(intent);

            }
        });
        Button btn10=(Button) findViewById(R.id.button_10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //活动跳转
                Intent intent=new Intent(FirstActivity.this, FourthActivity.class);
                //参数2用于判断回调的数据来源
                startActivityForResult(intent, 1);

            }
        });
        Button btn12=(Button) findViewById(R.id.button_12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //活动跳转
                Intent intent=new Intent(FirstActivity.this, NormalActivity.class);
                //参数2用于判断回调的数据来源
                startActivity(intent);

            }
        });
        Button btn14=(Button) findViewById(R.id.button_14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //活动跳转
                Intent intent=new Intent(FirstActivity.this, DialogActivity.class);
                //参数2用于判断回调的数据来源
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch(requestCode) {
            case 1:
                if(resultCode == RESULT_OK) {
                    String returnData=data.getStringExtra("data_return");
                    Toast.makeText(FirstActivity.this, "回调的数据是" + returnData, Toast.LENGTH_SHORT).show();
                }
                break;
            default:

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: 启动活动");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: 恢复活动");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: 暂停活动");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: 停止活动");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: 销毁活动");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: 重启活动");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        //避免在用户启动其他活动的时候，由于本活动占用内存过高，被系统自动清理掉，用户再回到本活动时，丢失了信息或状态的情况
        super.onSaveInstanceState(outState);
        String tempData="你想持久化的数据";
        outState.putString("data_key", tempData);
    }
}

package name.siguoya.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * AppCompatActivity能够向下兼容Android以往的版本
 * AppCompatActivity是Activity的子类，所有的活动类都需要继承自Activity类或它的子类
 */

public class HelloWorldActivity extends AppCompatActivity {

    //使用logt可以自动生成此行代码
    private static final String TAG="HelloWorldActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //使用logd可以自动生成此行代码
        Log.d(TAG, "onCreate: 调试");
        super.onCreate(savedInstanceState);
        //Android程序的设计讲究逻辑和视图分离
        setContentView(R.layout.hello_world_layout);
    }
}

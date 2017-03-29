package name.siguoya.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * AppCompatActivity能够向下兼容Android以往的版本
 * AppCompatActivity是Activity的子类，所有的活动类都需要继承自Activity类或它的子类
 */
public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("1234213","cccc");
        super.onCreate(savedInstanceState);
        //Android程序的设计讲究逻辑和视图分离
        setContentView(R.layout.hello_world_layout);
    }
}

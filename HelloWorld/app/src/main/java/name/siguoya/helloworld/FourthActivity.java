package name.siguoya.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Button btn13=(Button) findViewById(R.id.button_13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                intent.putExtra("data_return", "Hello FirstActivity");
                //参数1用于设置响应状态，通常为 RESULT_OK,RESULT_CANCELED这两种
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}

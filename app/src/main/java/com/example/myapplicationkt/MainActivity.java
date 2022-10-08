package com.example.myapplicationkt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //액티비티 또는 프래그먼트가 생성 되었을 때 이곳 내부구문들을 실행
        Log.e("onCreate", "ENTER");

        findViewById(R.id.btn_move).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                //main -> sub
                startActivity(new Intent(MainActivity.this, subActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart", "ENTER");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume", "ENTER");
        // 중지 되어있던 액티비티가 다시 재개(재 실행) 되는 시점에서 이곳 내부구문들을 실행
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause", "ENTER");
        // 중지 상태(홈 버튼을 눌러서 바깥으로 잠깐 빠져나갔을 때, 다른 액티비티가 활성화 되어있을 때)일 때 이곳 내부구문들을 실행
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop", "ENTER");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy", "ENTER");
        // 화면이 파괴되어서 소멸했을 때의 시점 일 때 이곳 내부구문들을 실행
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart", "ENTER");
    }
}
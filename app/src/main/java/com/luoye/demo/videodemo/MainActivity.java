package com.luoye.demo.videodemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick(View v) {
        switch (v.getId()) {
            case R.id.surfaceview:
                startActivity(new Intent(MainActivity.this, Surfaceview.class));
                break;
            case R.id.videoview:
                startActivity(new Intent(MainActivity.this, Videoview.class));
                break;
        }
    }
}

package com.leon.touchdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.leon.touchdemo.view.MyLayoutActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ConstraintLayout constraintLayout1;
    private ConstraintLayout constraintLayout2;
    private TextView tv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }



    private void initView() {
        constraintLayout1 = findViewById(R.id.vg_1);
        constraintLayout2 = findViewById(R.id.vg_2);
        tv = findViewById(R.id.tv);
        constraintLayout1.setOnClickListener(v->{
            Log.d(TAG, "initView: constraintLayout1-->onClick()");
        });
        constraintLayout2.setOnClickListener(v->{
            Log.d(TAG, "initView: constraintLayout2-->onClick()");
        });
        tv.setOnClickListener(v->{
            Log.d(TAG, "initView: tv-->onClick()");
            Intent intent = new Intent(MainActivity.this, MyLayoutActivity.class);
            startActivity(intent);
        });

        constraintLayout1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d(TAG, "onTouch: constraintLayout1 ,   event : "+motionEvent.getAction());
                return false;
            }
        });
        constraintLayout2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d(TAG, "onTouch: constraintLayout1 ,   event : "+motionEvent.getAction());
                return false;
            }
        });
        tv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d(TAG, "onTouch: tv ,   event : "+motionEvent.getAction());
                return false;
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "onTouchEvent: ");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, "dispatchTouchEvent: ");
        return super.dispatchTouchEvent(ev);
    }
}
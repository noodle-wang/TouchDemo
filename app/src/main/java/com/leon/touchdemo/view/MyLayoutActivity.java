package com.leon.touchdemo.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.leon.touchdemo.R;

public class MyLayoutActivity extends AppCompatActivity {

    private static final String TAG = "MyLayoutActivity";
    private MyLayout myLayout;
    private MyButton button1;
    private MyButton button2;
    private MyImageView myImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_layout);
        initView();
    }

    private void initView() {
        myLayout = findViewById(R.id.my_layout);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        myImageView = findViewById(R.id.image);

        myLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
//                Log.d(TAG, "myLayout on touch");
                return false;
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "You clicked button1");
            }
        });
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG, "You clicked button2");
//            }
//        });
        myImageView.setOnClickListener(v->{
            Log.d(TAG, "You clicked imageview");
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, "dispatchTouchEvent: ");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "onTouchEvent: ");
        return super.onTouchEvent(event);
    }


}
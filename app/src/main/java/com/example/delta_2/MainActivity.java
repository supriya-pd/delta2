package com.example.delta_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity implements Interfaces.Frag_1_Listener, Interfaces.Frag_2_Listener {

    CustomView2 customView2;
    CustomView1 customView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customView2=findViewById(R.id.custom2);
        customView1=findViewById(R.id.custom1);
    }

    @Override
    public void sendInputTo2(MotionEvent motionEvent, float x, float y) {
                 customView2.update2(motionEvent, x, y);
    }

    @Override
    public void sendInputTo1(MotionEvent motionEvent, float x, float y) {
        customView1.update1(motionEvent,x,y);
    }
}
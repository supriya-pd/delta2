package com.example.delta_2;

import android.view.MotionEvent;

public class Interfaces {


    public interface Frag_1_Listener
    {
        void sendInputTo2(MotionEvent motionEvent, float x, float y);
    }

    public interface Frag_2_Listener{
        void sendInputTo1(MotionEvent motionEvent,float x,float y);
    }


}

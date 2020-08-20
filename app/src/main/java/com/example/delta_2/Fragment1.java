package com.example.delta_2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import static android.content.ContentValues.TAG;

public class Fragment1 extends Fragment {
    CustomView1 customView1;


    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_1, container, false);
        customView1=view.findViewById(R.id.custom1);

        if(getContext() instanceof Interfaces.Frag_1_Listener){
            customView1.frag_1_listener =(Interfaces.Frag_1_Listener)getContext();
        }

        return view;

    }

}


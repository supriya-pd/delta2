package com.example.delta_2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

 CustomView2 customView2;

    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
   View view=inflater.inflate(R.layout.fragment_2, container, false);
   customView2=view.findViewById(R.id.custom2);

   if(getContext() instanceof Interfaces.Frag_2_Listener){
       customView2.frag_2_listener=(Interfaces.Frag_2_Listener)getContext();
   }

        return view;

    }
   }


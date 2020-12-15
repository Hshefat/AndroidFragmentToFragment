package com.example.fragmenttofragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment /*implements BackPressedFragment*/  {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_one, container, false);

        LinearLayout linearLayout = view.findViewById(R.id.textLayoutOne);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayoutContainer, new FragmentTwo()).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        LinearLayout linearLayout1 = view.findViewById(R.id.textLayoutTwo);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayoutContainer, new FragmentTwo());
                fragmentTransaction.commit();
            }
        });


        LinearLayout linearLayout2 = view.findViewById(R.id.textLayoutThree);
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayoutContainer, new FragmentTwo());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });



        return view;
    }
   /* public void onPopBackStack() {
        *//* Your code goes here, do anything you want. *//*
        getActivity().getSupportFragmentManager().popBackStack();
    }*/



}

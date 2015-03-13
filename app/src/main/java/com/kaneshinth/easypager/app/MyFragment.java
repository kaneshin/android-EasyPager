package com.kaneshinth.easypager.app;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kaneshin on 3/13/15.
 */
public class MyFragment extends Fragment {

    public static int UNKNOWN = 0;
    public static int RED = 1;
    public static int GREEN = 2;
    public static int BLUE = 3;

    private int mColor = UNKNOWN;

    public void setColor(int color) {
        if (RED <= color && color <= BLUE) {
            mColor = color;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment, container, false);
        if (mColor == RED) {
            view.setBackgroundColor(Color.RED);
        } else if (mColor == GREEN) {
            view.setBackgroundColor(Color.GREEN);
        } else if (mColor == BLUE) {
            view.setBackgroundColor(Color.BLUE);
        } else {
            view.setBackgroundColor(Color.WHITE);
        }
        return view;
    }

}

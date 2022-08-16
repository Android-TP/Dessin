package com.daniel.dessin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class evenements extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MotionEventView(this, null));
    }
}
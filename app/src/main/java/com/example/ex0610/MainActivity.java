package com.example.ex0610;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    Switch sw:
    Button bt;
    LinearLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = findViewById(R.id.tb);
        sw = findViewById(R.id.sw);
        bt = findViewById(R.id.bt);
        main = findViewById(R.id.main);
    }


    public void go(View view) {
        if (tb.isChecked() && sw.isChecked()) {
            main.setBackgroundColor(Color.CYAN);
        } else if (!tb.isChecked() && !sw.isChecked()) {
            main.setBackgroundColor(Color.DKGRAY);
        } else if (!tb.isChecked() && sw.isChecked()) {
            main.setBackgroundColor(Color.MAGENTA);
        } else {
            main.setBackgroundColor(Color.GREEN);
        }
    }
}
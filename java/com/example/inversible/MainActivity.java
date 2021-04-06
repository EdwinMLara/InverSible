package com.example.inversible;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.TaskStackBuilder;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimerTask coin = new TimerTask() {
            @Override
            public void run() {
                Intent in = new Intent(MainActivity.this,InverSible.class);
                startActivity(in);
                finish();
            }
        };
        Timer tiempo = new Timer();
        tiempo.schedule(coin,3000);
    }
}
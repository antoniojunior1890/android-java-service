package com.example.servicebroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i("Script", "app OK");

        setContentView(R.layout.activity_main);

        final Button startServiceButton = findViewById(R.id.button1);
        final Button stopServiceButton = findViewById(R.id.button2);


        startServiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(view);
            }
        });

        stopServiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(view);
            }
        });
    }

    public void startService(View view){

        Log.i("Script", "startService");

        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }

    public void stopService(View view){
        Log.i("Script", "stopService");

        Intent intent = new Intent(this, MyService.class);
        stopService(intent);
    }
}

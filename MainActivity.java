package com.example.intent06;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button button_start_activity_1,button_start_activity_2;

    Button button_set_group;
    Group group_01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        button_start_activity_1 = findViewById(R.id.button_start_activity_1);
        button_start_activity_2 = findViewById(R.id.button_start_activity_2);

        button_start_activity_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Activity_One.class);
                startActivity(i);
            }
        });

        button_start_activity_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Activity_Two.class);
                startActivity(i);
            }
        });

        button_set_group = findViewById(R.id.button_set_group);
        group_01 = findViewById(R.id.group_01);
        button_set_group.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                group_01.setVisibility(View.INVISIBLE);

                Handler h = new Handler();
                h.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        group_01.setVisibility(View.VISIBLE);
                    }
                },3000);
            }
        });

        Log.d("Intent06 : ","MainActivity - OnCreate() 被執行");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Intent06 : ","MainActivity - OnStart() 被執行");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Intent06 : ","MainActivity - OnResume() 被執行");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("Intent06 : ","MainActivity - OnPause() 被執行");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Intent06 : ","MainActivity - OnStop() 被執行");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("Intent06 : ","MainActivity - OnRestart() 被執行");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Intent06 : ","MainActivity - OnDestroy() 被執行");
    }
}
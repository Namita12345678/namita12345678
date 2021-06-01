package com.example.personactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ContactActivity extends AppCompatActivity {


      Button next_btn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);


        next_btn2 = (Button) findViewById(R.id.next_2);
        next_btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContactActivity.this, FinalActivity.class);
                startActivity(i);
            }

        });
    }

    private void openFinalActivity() {
    }

    private void openContactActivityActivity() {
    }


    protected void onCreate() {
        Bundle savedInstanceState = new Bundle();
        super.onCreate(savedInstanceState);
        Log.v("Activity_Lifecycyle","First Activity :onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Activity_Lifecycyle","First Activity :onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();



        Log.v("Activity_Lifecycyle","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Activity_Lifecycyle","onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();

        Log.v("Activity_Lifecycyle","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.v("Activity_Lifecycyle","First Activity :onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Activity_Lifecycyle","First Activity :onDestroy");


    }
}
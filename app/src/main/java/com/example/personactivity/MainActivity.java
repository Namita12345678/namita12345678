package com.example.personactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    Button next_btn;
    EditText username,password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("Activity_Lifecycyle","First Activity :onCreate");


        next_btn=(Button)findViewById(R.id.button);
        username = findViewById(R.id.edt_username);
        password = findViewById(R.id.edt_password);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 Intent i = new Intent(MainActivity.this, AddressActivity.class);
            startActivity(i);

            i.putExtra("Username", "" + username.getText().toString());
             i.putExtra("Password", "" + password.getText().toString());

            finish();
        }

        });
        }
        @Override
    protected void onStart() {
        super.onStart();
        Log.v("Activity_Lifecycyle","First Activity :onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Activity_Lifecycyle","First Activity: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Activity_Lifecycyle","First Activity: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Activity_Lifecycyle","First Activity: onStop");
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




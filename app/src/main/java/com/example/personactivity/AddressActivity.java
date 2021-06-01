package com.example.personactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Address;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class AddressActivity extends AppCompatActivity {

    String state_array[]={"a", "b", "c", "d"};

    String username, password;
    Button next_btn1;
    Spinner mySpinner;
    TextView Address, State, PinCode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        username = getIntent().getStringExtra("Username");
        password = getIntent().getStringExtra("Password");

        next_btn1= findViewById(R.id.next_1);
        Address = findViewById(R.id.txt_address);
        State=findViewById(R.id.state);
        PinCode=findViewById(R.id.pin);


        Spinner mySpinner=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String>myAdapter=new ArrayAdapter<String>(AddressActivity.this, android.R.layout.activity_list_item, state_array);
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);


         next_btn1 = (Button) findViewById(R.id.next_1);
        next_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AddressActivity.this, ContactActivity.class);
                startActivity(i);


                i.putExtra("Username", "" + username);
                i.putExtra("Password", "" + password);
                i.putExtra( "State", "" + State.getText().toString());
                i.putExtra("Address", ""+ Address.getText().toString());
                i.putExtra("PinCode", ""+ PinCode.getText().toString());


                finish();
            }

        });
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


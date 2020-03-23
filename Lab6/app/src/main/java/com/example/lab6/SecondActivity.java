package com.example.lab6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    MySharedPreference pref;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        pref=new MySharedPreference(this);
        TextView text=findViewById(R.id.scrieText);
        text.setText(pref.getValue());

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if(extras != null) {
            String getString= extras.getString("STRING_I_NEED");
            Toast.makeText(this,getString, Toast.LENGTH_LONG).show();
        }
    }


}

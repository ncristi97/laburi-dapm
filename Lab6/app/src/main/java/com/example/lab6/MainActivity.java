package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button save;
    Button next;
    MySharedPreference preferinte ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferinte = new MySharedPreference(this);
        save=findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }
        });
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextButton();
            }
        });

    }


    public void save(){
        EditText temp=findViewById(R.id.completeaza);
        preferinte.save(temp.getText().toString());
        Toast.makeText(this,"Preferinta salvata", Toast.LENGTH_LONG).show();
    }

    public void nextButton(){
        Intent intent= new Intent(this, com.example.lab6.SecondActivity.class);
        intent.putExtra("STRING_I_NEED", "Stati in casa");
        startActivity(intent);
    }
}

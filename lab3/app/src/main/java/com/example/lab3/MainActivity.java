package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    String str="lab3";

    public void trecere(View view){

        final EditText name =  (EditText) findViewById(R.id.editText);
        String n=name.getText().toString();
        final EditText psw =  (EditText) findViewById(R.id.editText2);
        String p=psw.getText().toString();
        if(n.equals("student") && p.equals("student")) {
            Intent intent = new Intent(this, FindTheNumberActivity.class);
            startActivity(intent);
        }
        else
            Toast.makeText(MainActivity.this,  name.getText().toString()+psw.getText().toString(), Toast.LENGTH_LONG).show();
        }

}

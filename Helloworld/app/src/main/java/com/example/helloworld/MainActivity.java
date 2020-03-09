package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button2= findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myFancyMethod(v);
            }
        });
        Log.i("onCreate","Create");



    }
    protected void onStart(){
        super.onStart();
        Log.i("onStart","Start");
    };
    protected void onRestart(){
        super.onRestart();
        Log.i("onRestart","Restart");
    };

    protected void onResume(){
        super.onResume();
        Log.i("onResume","Resume");
    };

    protected void onPause(){
        super.onPause();
        Log.i("onPause","Pause");
    };

    protected void onStop(){
        super.onStop();
        Log.i("onStop","Stop");
    };

    protected void onDestroy(){
        super.onDestroy();
        Log.i("onDestroy","Destroy");
    };
    public void push(View view){
        Toast.makeText(this, "You pushed the button from push function", Toast.LENGTH_SHORT).show();
    }
    public void myFancyMethod(View view) {
        Toast.makeText(MainActivity.this, "You pushed the button from on create", Toast.LENGTH_LONG).show();
    }


}

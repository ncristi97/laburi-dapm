package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FindTheNumberActivity  extends AppCompatActivity {

    int number;
    Random random = new Random();
    //private List<Integer> colors = new ArrayList<>(Arrays.asList(Color.RED, Color.BLUE));

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_number);
        this.Randomm();
        /*Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String getString = extras.getString("String");
        }*/
    }

    public void AAA(View view) {

        EditText nr = findViewById(R.id.editText3);
        int numar = Integer.parseInt(nr.getText().toString());
        /*Button btn = findViewById(R.id.button2);
        btn.setBackgroundColor(this.colors.get(this.random.nextInt(2)));*/

        if (numar < number)
            Toast.makeText(FindTheNumberActivity.this, "Incearca mai mic", Toast.LENGTH_LONG).show();
        else if (numar > number)
            Toast.makeText(FindTheNumberActivity.this, "Incearca mai mare", Toast.LENGTH_LONG).show();
        else
        {
            Toast.makeText(FindTheNumberActivity.this, "Felicitari", Toast.LENGTH_LONG).show();
            this.Randomm();
        }

    }

    public void Randomm() {
        this.number = this.random.nextInt(11);
    }
}

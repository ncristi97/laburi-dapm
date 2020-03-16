package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ListView listOfCars;
    CarAdapter carAdapter;
    private EditText addNewCar;
    private Button addButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1
        listOfCars = findViewById(R.id.lv_list_cars);
        //2
        carAdapter = new CarAdapter(this);
        //3
        listOfCars.setAdapter(carAdapter);
        //4
        carAdapter.addCar("Dacia",R.drawable.lab5_car_icon);
        carAdapter.addCar("Dacia1",R.drawable.lab5_car_icon);
        carAdapter.addCar("Dacia2",R.drawable.lab5_car_icon);
        carAdapter.addCar("Dacia3",R.drawable.lab5_car_icon);

        addNewCar=findViewById(R.id.ed_new_car);
        addButton = findViewById(R.id.b_add_car);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = addNewCar.getText().toString();
                carAdapter.addCar(text, R.drawable.lab5_car_icon);
                addNewCar.setText("");
            }
        });
    }
}
class Car{
    String name;
    int imageResource;
}
class TagCar{
    TextView name;
    ImageView image;
}
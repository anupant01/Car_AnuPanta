package com.car_anupanta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    EditText txtMake, txtYear, txtColor, txtPrice, txtEngineSize;
    Button btnCreateCar, btnCreateDisel;
    TextView txtOutput;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        txtMake = findViewById(R.id.txtMake);
        txtColor = findViewById(R.id.txtColor);
        txtYear = findViewById(R.id.txtYear);
        txtPrice = findViewById(R.id.txtPrice);
        txtEngineSize = findViewById(R.id.txtEngineSize);
        txtOutput = findViewById(R.id.txtOutput);
        btnCreateCar = findViewById(R.id.btnCreateCar);
        btnCreateDisel = findViewById(R.id.btnCreateDiesel);

        btnCreateCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String make = txtMake.getText().toString();
                String color = txtColor.getText().toString();
                String year = txtYear.getText().toString();
                String price = txtPrice.getText().toString();
                String size = txtEngineSize.getText().toString();
                count++;
                txtOutput.append(
                        "This is vechile No." + count +
                                "Manufacturer:" + make +
                                "Current Value: " + price +
                                "Effective Engine Size: " + size +
                                "Color: " + color + "\n" + "\n"
                );
            }
        });
        btnCreateDisel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String make = txtMake.getText().toString();
                String color = txtColor.getText().toString();
                String year = txtYear.getText().toString();
                String price = txtPrice.getText().toString();
                String size = txtEngineSize.getText().toString();
                count++;
                txtOutput.append(
                        "This is vechile No." + count +
                                "Manufacturer:" + make +
                                "Current Value: " + price +
                                "Effective Engine Size: " + size +
                                "Color: " + color + "\n" + "\n" + "\n"
                );
            }
        });
    }
}
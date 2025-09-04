package com.example.repairorder;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class RepairOrderActivity extends AppCompatActivity {

    double numbers = 0.0;
    Button submitB; //1. Create Button
    TextView subtotalTV;
    TextView taxTV;
    TextView totalTV;

    EditText orderET;
    EditText techET;
    EditText paintET;
    EditText partsET;
    EditText laborET;

    View.OnClickListener buttonListener = new View.OnClickListener() { //2. Create Anonymous Listener
        @Override
        public void onClick(View v) {
            Random gen = new Random();

            double number = gen.nextDouble();
            String v1 = "$ " + number;

            subtotalTV.setText(v1);

            //String value = subtotalTV.getText().toString();

            //Log.i("TEST", value);

            String orderTypeValue = orderET.getText().toString();
            String techTypeValue = techET.getText().toString();
            //Integer it = Integer.getInteger(orderTypeValue);
            //Double et = Double.parseDouble(OrderTypeValue);
            Double partsTypeValue = Double.parseDouble(orderTypeValue);
            Double paintTypeValue = Double.parseDouble(orderTypeValue);
            Double laborTypeValue = Double.parseDouble(orderTypeValue);

            double sum = 0;

            sum = partsTypeValue + paintTypeValue + laborTypeValue;

            String sums = "$ " +sum;


            totalTV.setText(sums);




        }
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_repair_order);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



         subtotalTV = findViewById(R.id.SubTotalOutput); // How we find the reference to a widget within a ui
        taxTV = findViewById(R.id.TaxOutput);
        totalTV = findViewById(R.id.TotalOutput);


        submitB = findViewById(R.id.submitButton);
        submitB.setOnClickListener(buttonListener); //3. Register listener to the button

        orderET = findViewById(R.id.OrderInput);
        techET = findViewById(R.id.TechnicianInput);
        paintET = findViewById(R.id.PaintInput);
        partsET = findViewById(R.id.PartsInput);
        laborET = findViewById(R.id.LaborInput);







    }
}
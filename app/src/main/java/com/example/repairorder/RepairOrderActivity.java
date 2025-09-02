package com.example.repairorder;

import android.os.Bundle;
import android.util.Log;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class RepairOrderActivity extends AppCompatActivity {

    double numbers = 0.0;

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


        TextView totalTV = findViewById(R.id.TotalOutput); // How we find the reference to a widget within a ui

        Random gen = new Random();

        double number = gen.nextDouble();
        String v1 = "$ " + number;

        totalTV.setText(v1);

        String value = totalTV.getText().toString();

        Log.i("TEST", value);



    }
}
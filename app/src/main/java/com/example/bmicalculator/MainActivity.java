package com.example.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button calculate;
    private TextView resultBMI;
    private EditText etHeight, etWeight;
    private Weight wt = new Weight();
    private Height ht = new Height();
    private Calculation cal = new Calculation();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculate = findViewById(R.id.btnCalculate);
        resultBMI = findViewById(R.id.tvBM);
        etWeight = findViewById(R.id.etWeight);
        etHeight = findViewById(R.id.etHeight);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wt.setWeight(Double.parseDouble(etWeight.getText().toString()));
                ht.setHeight(Double.parseDouble(etHeight.getText().toString()));
                double a = cal.calc();
                resultBMI.setText("fsdf");

            }
        });

    }

}


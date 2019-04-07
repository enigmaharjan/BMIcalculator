package com.example.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnCalculate;
    private TextView tvBMIresult;
    private EditText etHeight, etWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvBMIresult = findViewById(R.id.tvBM);
        etHeight = findViewById(R.id.etHeight);
        etWeight = findViewById(R.id.etWeight);

        btnCalculate.setOnClickListener(this);


    }

    public boolean validate(){
        boolean flag = true;
        if(TextUtils.isEmpty(etHeight.getText().toString())){
            etHeight.setError("Enter Your Height");
            etHeight.requestFocus();
            flag = false;
        }
        else if(TextUtils.isEmpty(etWeight.getText().toString())){
            etWeight.setError("Enter Your Weight");
            etWeight.requestFocus();
            flag = false;
        }
        return flag;
    }

    @Override
    public void onClick(View v) {
        if (validate()) {
            double height = Double.parseDouble(etHeight.getText().toString());
            double weight = Double.parseDouble(etWeight.getText().toString());
            if (v.getId() == R.id.btnCalculate) {
                Calculation cal = new Calculation();

                cal.setWeight(weight);
                cal.setHeight(height);
//            cal.setHeight(Double.parseDouble(etHeight.getText().toString()));
//            cal.setHeight(Double.parseDouble(etHeight.getText().toString()));
                tvBMIresult.setText(Double.toString(cal.calculate()));
                double res = cal.calculate();
                if (res < 18.5) {
                    Toast.makeText(MainActivity.this, "You are Underweight", Toast.LENGTH_LONG).show();
                } else if (res >= 18.5 && res <= 24.9) {
                    Toast.makeText(MainActivity.this, "Your weight is Normal.", Toast.LENGTH_LONG).show();
                } else if (res >= 25 && res <= 29.9) {
                    Toast.makeText(MainActivity.this, "You are Overweight", Toast.LENGTH_LONG).show();
                } else if (res > 30) {
                    Toast.makeText(MainActivity.this, "You are Obese", Toast.LENGTH_LONG).show();
                }

            }
        }
    }
}


package com.example.a89502.calculatorlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Trigonometric extends AppCompatActivity {
    EditText result;
    Button tan, cos, sin, sqr, sqrt, ctg, exp, ln, fact, clean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trigonometric);
        result = findViewById(R.id.textView2);
        tan = findViewById(R.id.btnTan);
        cos = findViewById(R.id.btnCos);
        sin = findViewById(R.id.btnSin);
        sqr = findViewById(R.id.btnSqr);
        sqrt = findViewById(R.id.btnSqrt);
        ctg = findViewById(R.id.btnCtg);
        exp = findViewById(R.id.btnExp);
        ln = findViewById(R.id.btnLn);
        fact = findViewById(R.id.btnFact);
        clean = findViewById(R.id.btnResult);

        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = Double.valueOf(result.getText().toString());
                result.setText(String.valueOf(Math.tan(tmp)));
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = Double.valueOf(result.getText().toString());
                result.setText(String.valueOf(Math.cos(tmp)));
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = Double.valueOf(result.getText().toString());
                result.setText(String.valueOf(Math.sin(tmp)));
            }
        });
        sqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = Double.valueOf(result.getText().toString());
                result.setText(String.valueOf(tmp*tmp));
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = Double.valueOf(result.getText().toString());
                result.setText(String.valueOf(Math.sqrt(tmp)));
            }
        });
        ctg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = Double.valueOf(result.getText().toString());
                result.setText(String.valueOf(1/Math.tan(tmp)));
            }
        });
        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = Double.valueOf(result.getText().toString());
                result.setText(String.valueOf(Math.exp(tmp)));
            }
        });
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tmp = Double.valueOf(result.getText().toString());
                result.setText(String.valueOf(Math.log(tmp)));
            }
        });
        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tmp = Integer.valueOf(result.getText().toString());
                for(int i=tmp-1; i>0; i--){
                    tmp = i * tmp;
                }
                result.setText(String.valueOf(tmp));
            }
        });


    }
}

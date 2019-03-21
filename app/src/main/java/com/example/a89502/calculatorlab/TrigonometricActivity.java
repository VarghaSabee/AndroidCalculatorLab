package com.example.a89502.calculatorlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TrigonometricActivity extends AppCompatActivity {
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
        clean = findViewById(R.id.clearBtn);

        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double tmp = Double.valueOf(result.getText().toString());
                    result.setText(String.valueOf(Math.tan(tmp)));
                } catch (Exception e) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            e.getMessage(),
                            Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double tmp = Double.valueOf(result.getText().toString());
                    result.setText(String.valueOf(Math.cos(tmp)));
                } catch (Exception e) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            e.getMessage(),
                            Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            }

        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double tmp = Double.valueOf(result.getText().toString());
                    result.setText(String.valueOf(Math.sin(tmp)));
                } catch (Exception e) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            e.getMessage(),
                            Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            }
        });
        sqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    double tmp = Double.valueOf(result.getText().toString());
                    result.setText(String.valueOf(tmp * tmp));
                } catch (Exception e) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            e.getMessage(),
                            Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double tmp = Double.valueOf(result.getText().toString());
                    result.setText(String.valueOf(Math.sqrt(tmp)));
                } catch (Exception e) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            e.getMessage(),
                            Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            }
        });
        ctg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    double tmp = Double.valueOf(result.getText().toString());
                    result.setText(String.valueOf(1 / Math.tan(tmp)));
                } catch (Exception e) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            e.getMessage(),
                            Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            }
        });
        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    double tmp = Double.valueOf(result.getText().toString());
                    result.setText(String.valueOf(Math.exp(tmp)));
                } catch (Exception e) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            e.getMessage(),
                            Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            }
        });
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    double tmp = Double.valueOf(result.getText().toString());
                    result.setText(String.valueOf(Math.log(tmp)));
                } catch (Exception e) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            e.getMessage(),
                            Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            }
        });
        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    int tmp = Integer.valueOf(result.getText().toString());
                    for (int i = tmp - 1; i > 0; i--) {
                        tmp = i * tmp;
                    }
                    result.setText(String.valueOf(tmp));
                } catch (Exception e) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            e.getMessage(),
                            Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.trig_menu:
                Intent intent = new Intent(getApplicationContext(), TrigonometricActivity.class);
                startActivity(intent);
                break;
            case R.id.about_menu:
                Intent about_intent = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(about_intent);
                break;
            case R.id.home_menu:
                Intent home_intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(home_intent);
                break;
            case R.id.exit_menu:
                moveTaskToBack(true);
                finish();
                break;

        }
        return true;
    }
}

package com.example.a89502.calculatorlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
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
//                android.os.Process.killProcess(android.os.Process.myPid());
//                System.exit(1);
                moveTaskToBack(true);
                finish();
                break;
            }
        return true;
    }
}

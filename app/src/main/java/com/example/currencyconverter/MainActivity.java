package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View v) {

        EditText inr = (EditText) findViewById(R.id.editTextTextPersonName3);
        double d = Double.parseDouble(inr.getText().toString());
        Toast.makeText(this, "Rs." + String.format("%.2f",d) + " in Dollars is $" + String.format("%.2f", d*74.90) ,
                Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
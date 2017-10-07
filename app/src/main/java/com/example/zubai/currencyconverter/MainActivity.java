package com.example.zubai.currencyconverter;

import android.content.Context;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void convert (View view){
        EditText euroField = (EditText) findViewById(R.id.euroField);

        double euroAmount = Double.parseDouble(euroField.getText().toString());
        double gbpAmount = euroAmount * 0.88;
      //  Log.i("euroField ", String.valueOf(gbpAmount));
        Toast.makeText(getApplicationContext(), "£" + String.valueOf(gbpAmount), Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

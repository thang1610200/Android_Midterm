package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
    }

    String input = "";
    public void SetZero(View view){
        EditText edittext = (EditText)findViewById(R.id.edit);
         input += "0";
         edittext.setText(input);
    }

    public void SetOne(View view){
        EditText edittext = (EditText)findViewById(R.id.edit);
        input += "1";
        edittext.setText(input);
    }

    public void SetTwo(View view){
        EditText edittext = (EditText)findViewById(R.id.edit);
        input += "2";
        edittext.setText(input);
    }

    public void SetThree(View view){
        EditText edittext = (EditText)findViewById(R.id.edit);
        input += "3";
        edittext.setText(input);
    }

    public void SetFour(View view){
        EditText edittext = (EditText)findViewById(R.id.edit);
        input += "4";
        edittext.setText(input);
    }

    public void SetFive(View view){
        EditText edittext = (EditText)findViewById(R.id.edit);
        input += "5";
        edittext.setText(input);
    }

    public void SetSix(View view){
        EditText edittext = (EditText)findViewById(R.id.edit);
        input += "6";
        edittext.setText(input);
    }

    public void SetSeven(View view){
        EditText edittext = (EditText)findViewById(R.id.edit);
        input += "7";
        edittext.setText(input);
    }

    public void SetEight(View view){
        EditText edittext = (EditText)findViewById(R.id.edit);
        input += "8";
        edittext.setText(input);
    }

    public void SetNine(View view){
        EditText edittext = (EditText)findViewById(R.id.edit);
        input += "9";
        edittext.setText(input);
    }
}
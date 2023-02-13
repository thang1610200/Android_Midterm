package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
    }

    String input = "";
    String operator = "";
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

    private float Add(float a, float b){
        return a + b;
    }

    private float Sub(float a, float b){
        return a - b;
    }

    private float Mul(float a, float b){
        return a * b;
    }

    private float Div(float a, float b){
        return a / b;
    }

    public void SetSub(View view){
        operator += "-";
        input += "-";
        EditText editText = (EditText)findViewById(R.id.edit);
        editText.setText(input);
    }
    public void SetCalculate(View view){
        String[] array = new String[5];
        if(operator.equals("-")) {
            array = input.split("\\-");
        }
        else if(operator.equals("/")){
            array = input.split("\\/");
        }
        EditText editText = (EditText) findViewById(R.id.edit);
        if(array.length < 2){
            editText.setText(input);
        }
        else {
            float a = Integer.parseInt(array[0]);
            float b = Integer.parseInt(array[1]);
            if(operator.equals("-")) {
                input = input + "= " + Round(Sub(a, b));
            }
            else if(operator.equals("/")){
                input = input + "= " + Round(Div(a, b));
            }
            editText.setText(input);
        }
    }

    public void SetDeleteNumber(View view){
        EditText editText = (EditText) findViewById(R.id.edit);
        if(editText.getText().toString().equals("")) {
            editText.setText("");
        }
        else {
            if (input.charAt(input.length() - 1) == '-') {
                operator = "";
            }
            input = input.substring(0, input.length() - 1);
            editText.setText(input);
        }
    }

    public void SetDeleteAll(View view){
        input = "";
        operator = "";
        EditText editText = (EditText) findViewById(R.id.edit);
        editText.setText(input);
    }

    private String Round(float a){
        String temp = String.valueOf(a);
        String save = temp;
        if(a - (int)a == 0){
            save = temp.substring(0,temp.length() - 2);
        }
        return save;
    }

    public void SetDivide(View view){
        operator += "/";
        input += "/";
        EditText editText = (EditText)findViewById(R.id.edit);
        editText.setText(input);
    }
}
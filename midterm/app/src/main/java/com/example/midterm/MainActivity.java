package com.example.midterm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
    }

    String input = ""; // lưu đoạn text
    String operator = ""; // lưu phép toán

    Boolean negative = false; // Số âm
    float result = 0;

    public void SetZero(View view){
        EditText editText = (EditText)findViewById(R.id.edit);
        if(input.indexOf('=') > 0){
            input = "";
            operator = "";
            input += "0";
        }
        else {
            input += "0";
        }
         editText.setText(input);
        editText.setSelection(input.length());
    }

    public void SetOne(View view){
        EditText editText = (EditText)findViewById(R.id.edit);
        if(input.indexOf('=') > 0){
            input = "";
            operator = "";
            input += "1";
        }
        else {
            input += "1";
        }
        editText.setText(input);
        editText.setSelection(input.length());
    }

    public void SetTwo(View view){
        EditText editText = (EditText)findViewById(R.id.edit);
        if(input.indexOf('=') > 0){
            input = "";
            operator = "";
            input += "2";
        }
        else {
            input += "2";
        }
        editText.setText(input);
        editText.setSelection(input.length());
    }

    public void SetThree(View view){
        EditText editText = (EditText)findViewById(R.id.edit);
        if(input.indexOf('=') > 0){
            input = "";
            operator = "";
            input += "3";
        }
        else {
            input += "3";
        }
        editText.setText(input);
        editText.setSelection(input.length());
    }

    public void SetFour(View view){
        EditText editText = (EditText)findViewById(R.id.edit);
        if(input.indexOf('=') > 0){
            input = "";
            operator = "";
            input += "4";
        }
        else {
            input += "4";
        }
        editText.setText(input);
        editText.setSelection(input.length());
    }

    public void SetFive(View view){
        EditText editText = (EditText)findViewById(R.id.edit);
        if(input.indexOf('=') > 0){
            input = "";
            operator = "";
            input += "5";
        }
        else {
            input += "5";
        }
        editText.setText(input);
        editText.setSelection(input.length());
    }

    public void SetSix(View view){
        EditText editText = (EditText)findViewById(R.id.edit);
        if(input.indexOf('=') > 0){
            input = "";
            operator = "";
            input += "6";
        }
        else {
            input += "6";
        }
        editText.setText(input);
        editText.setSelection(input.length());
    }

    public void SetSeven(View view){
        EditText editText = (EditText)findViewById(R.id.edit);
        if(input.indexOf('=') > 0){
            input = "";
            operator = "";
            input += "7";
        }
        else {
            input += "7";
        }
        editText.setText(input);
        editText.setSelection(input.length());
    }
    public void SetEight(View view){
        EditText editText = (EditText)findViewById(R.id.edit);
        if(input.indexOf('=') > 0){
            input = "";
            operator = "";
            input += "8";
        }
        else {
            input += "8";
        }
        editText.setText(input);
        editText.setSelection(input.length());
    }

    public void SetNine(View view){
        EditText editText = (EditText)findViewById(R.id.edit);
        if(input.indexOf('=') > 0){
            input = "";
            operator = "";
            input += "9";
        }
        else {
            input += "9";
        }
        editText.setText(input);
        editText.setSelection(input.length());
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
        EditText editText = (EditText)findViewById(R.id.edit);
        if(input.indexOf('=') > 0){
            input = "";
            operator = "";
            operator += "-";
            input = input + Round(result) + "-";
            editText.setText(input);
        }
        else {
            // Xử lý khi nhập 1 số âm: VD: -1
            // Nếu chuỗi rỗng thì không lưu "-" vào operator
            // dấu "-" này thể hiện 1 số âm
            if (input.length() == 0) {
                negative = true;
                input += "-";
            }
            else if(input.charAt(input.length() - 1) == '-'){
                input += "";
            }else {
                //Nếu chưa sử dụng phép tính thì lưu phép tính đó vào operator
                if (operator.length() == 0) {
                    operator += "-";
                    input += "-";
                } else { // Ngược lại là nếu có 1 phép tính đã được sử dụng rồi thì phép trừ này sẽ thay thế phép tính đó
                    operator = "";
                    operator += "-";
                    input = input.substring(0, input.length() - 1);
                    input += "-";
                }
            }
            editText.setText(input);
        }
        editText.setSelection(input.length());
    }

    public void SetCalculate(View view){
        String[] array = new String[5];
        // Tách số trước và sau 1 phép tính
        if(operator.equals("-")) {
            if(negative) {
                String temp = input.substring(1,input.length());
                array = temp.split("\\-");
            }
            else{
                array = input.split("\\-");
            }
        }
        else if(operator.equals("/")){
            array = input.split("\\/");
        }
        else if(operator.equals("*")){
            array = input.split("\\*");
        }
        else if(operator.equals("+")){
            array = input.split("\\+");
        }
        EditText editText = (EditText) findViewById(R.id.edit);
        // Nếu mảng vừa được tách
        if(array.length != 2){
            editText.setText(input);
        }
        else {
                float a = Float.parseFloat(array[0]);
                float b = Float.parseFloat(array[1]);
                if (operator.equals("-")) {
                    if (negative) {
                        result = Sub(-a, b);
                    } else {
                        result = Sub(a, b);
                    }
                    input = input + "= " + Round(result);
                } else if (operator.equals("/")) {
                    if (b != 0) {
                        result = Div(a, b);
                        input = input + "= " + Round(result);
                    } else {
                        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                        alertDialog.setTitle("Notice");
                        alertDialog.setMessage("Invalid calculation");
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        dialogInterface.dismiss();
                                    }
                                });
                        alertDialog.show();

                    }
                } else if (operator.equals("*")) {
                    result = Mul(a, b);
                    input = input + "= " + Round(result);
                } else if (operator.equals("+")) {
                    result = Add(a, b);
                    input = input + "= " + Round(result);
                }
                editText.setText(input);
            }
        editText.setSelection(input.length());
    }

    public void SetDeleteNumber(View view){
        EditText editText = (EditText) findViewById(R.id.edit);
        if(editText.getText().toString().equals("") || input.length() == 1) {
            input = "";
            negative = false;
            editText.setText(input);
        }
        else {
            if (input.charAt(input.length() - 1) == '-') {
                operator = "";
            }
            else if (input.charAt(input.length() - 1) == '/') {
                operator = "";
            }
            else if (input.charAt(input.length() - 1) == '*') {
                operator = "";
            }
            else if (input.charAt(input.length() - 1) == '+') {
                operator = "";
            }
            input = input.substring(0, input.length() - 1);
            editText.setText(input);
        }
        editText.setSelection(input.length());
    }

    public void SetDeleteAll(View view){
        input = "";
        operator = "";
        result = 0;
        negative = false;
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
        EditText editText = (EditText)findViewById(R.id.edit);
        if(input.indexOf('=') > 0){
            input = "";
            operator = "";
            operator += "/";
            input = input + Round(result) + "/";
            editText.setText(input);
        }
        else {
            // Không cho nhập phép chia khi input rỗng
            if (input.length() == 0) {
                input += "";
            } else {
                if (operator.length() == 0) {
                    operator += "/";
                    input += "/";
                } else {
                    operator = "";
                    operator += "/";
                    input = input.substring(0, input.length() - 1);
                    input += "/";
                }
            }
            editText.setText(input);
        }
        editText.setSelection(input.length());
    }


    public void SetMul(View view){
        EditText editText = (EditText)findViewById(R.id.edit);
        if(input.indexOf('=') > 0){
            input = "";
            operator = "";
            operator += "*";
            input = input + Round(result) + "*";
            editText.setText(input);
        }
        else {
            // Không cho nhập phép nhân khi input rỗng
            if (input.length() == 0) {
                input += "";
            } else {
                if (operator.length() == 0) {
                    operator += "*";
                    input += "*";
                } else {
                    operator = "";
                    operator += "*";
                    input = input.substring(0, input.length() - 1);
                    input += "*";
                }
            }
            editText.setText(input);
        }
        editText.setSelection(input.length());
    }


    public void SetAdd(View view){
        EditText editText = (EditText)findViewById(R.id.edit);
        if(input.indexOf('=') > 0){
            input = "";
            operator = "";
            operator += "+";
            input = input + Round(result) + "+";
            editText.setText(input);
        }
        else {
            // Không cho nhập phép cộng khi input rỗng or phía trước là dấu âm
            if (input.length() == 0) {
                input += "";
            } else {
                if (operator.length() == 0) {
                    operator += "+";
                    input += "+";
                } else {
                    operator = "";
                    operator += "+";
                    input = input.substring(0, input.length() - 1);
                    input += "+";
                }
            }
            editText.setText(input);
        }
        editText.setSelection(input.length());
    }
    public void SetDot(View view){
        if (input.length() == 0 || input.charAt(input.length() - 1) == '.') {
            input += "";
        }
        else {
            input += ".";
        }
        EditText editText = (EditText) findViewById(R.id.edit);
        editText.setText(input);
        editText.setSelection(input.length());
    }
}
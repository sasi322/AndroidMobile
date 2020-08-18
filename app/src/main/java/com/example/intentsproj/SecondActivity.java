package com.example.intentsproj;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private EditText txt1 , txt2;
    private TextView display;
    String input1 , input2 , displayAns;
    private int n1,n2,ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt1 = findViewById(R.id.editText);
        txt2 = findViewById(R.id.editText4);
        display = findViewById(R.id.textView5);

        Intent intent = getIntent();

        input1=intent.getStringExtra(FirstActivity.NUMBER1);
        input2=intent.getStringExtra(FirstActivity.NUMBER2);

        txt1.setText(input1);
        txt2.setText(input2);

        n1 = Integer.parseInt(input1);
        n2 = Integer.parseInt(input2);

    }
    public void addNumbers(View view){
        ans = n1 + n2;
        displayAns = input1 + "  +  " + input2 + " = " + ans;
        displayAnswer(displayAns);
    }
    public void subtractNumbers(View view){
        ans = n1-n2;
        displayAns = input1 + " - " + input2 + " = " + ans;
        displayAnswer(displayAns);
    }
    public void multiplyNumbers(View view){
        ans = n1*n2;
        displayAns = input1 + " * " + input2 + " = " + ans;
        displayAnswer(displayAns);
    }
    public void divideNumbers(View view){
        ans = n1/n2;
        displayAns = input1 + " / " + input2 + " = " + ans;
        displayAnswer(displayAns);
    }

    public void displayAnswer(String displayAns){
        display.setText(displayAns);
    }
}

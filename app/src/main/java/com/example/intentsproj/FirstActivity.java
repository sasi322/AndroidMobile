package com.example.intentsproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    public static final String NUMBER1 = "1";
    public static final String NUMBER2 = "2";


    private EditText txt1 , txt2;
    String no1 , no2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        txt1= findViewById(R.id.editText2);
        txt2= findViewById(R.id.editText3);
    }
    public void onClick(View view){
        no1 = txt1.getText().toString();
        no2= txt2.getText().toString();

        Intent intent = new Intent( this, SecondActivity.class);
        intent.putExtra(NUMBER1,no1);
        intent.putExtra(NUMBER2,no2);
        startActivity(intent);

    }


}
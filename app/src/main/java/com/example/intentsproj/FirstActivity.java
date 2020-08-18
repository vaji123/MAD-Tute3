package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.Objects;


public class FirstActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Integer no1,no2;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        textView=(TextView)findViewById(R.id.textResult);
       Button button=(Button)findViewById(R.id.btnAdd);
       Button button1=(Button)findViewById(R.id.btnSub);
       Button button2=(Button)findViewById(R.id.btnDivi);
       Button button3=(Button)findViewById(R.id.btnMulti);

        num1=(EditText)findViewById(R.id.editTextTextPersonName);
        num2=(EditText)findViewById(R.id.editTextTextPersonName2);

        Intent intent=getIntent();
        /* no1= Objects.requireNonNull(getIntent().getExtras()).getInt("num1");
        num1.setText(no1);


         no2=getIntent().getExtras().getInt("num2");
        num2.setText(no2);*/

        String numb1 = intent.getStringExtra("n1");
        String numb2 = intent.getStringExtra("n2");

        num1.setText(numb1);
        num2.setText(numb2);


        //convert to intet=rger valus

        no1= Integer.parseInt(numb1);
        no2 = Integer.parseInt(numb2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(no1+"+"+no2+"="+(no1+no2));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(no1+"-"+no2+"="+(no1-no2));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(no1+"/"+no2+"="+(no1/no2));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(no1+"*"+no2+"="+(no1*no2));
            }
        });


    }
}


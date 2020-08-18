package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText num1;
    EditText num2;
    Integer no1,no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonListner();

    }
    public void ButtonListner(){
        btn=(Button)findViewById(R.id.button);
         num1=(EditText)findViewById(R.id.editTextTextPersonName);

         num2=(EditText)findViewById(R.id.editTextTextPersonName2);


        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Toast toast;
                        Context context=getApplicationContext();
                        CharSequence text="You just clicked the OK button";
                        int duration=Toast.LENGTH_SHORT;

                        toast=Toast.makeText(context,text,duration);
                        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                        toast.show();

                        /*Intent intent=new Intent(MainActivity.this,FirstActivity.class);
                        no1=Integer.parseInt(num1.getText().toString());
                        intent.putExtra("num1",no1);
                         no2=Integer.parseInt(num2.getText().toString());
                        intent.putExtra("num2",no2);
                        startActivity(intent);
                        //finish();*/

                        Intent intent = new Intent(MainActivity.this,FirstActivity.class);
                        intent.putExtra("n1",num1.getText().toString());
                        intent.putExtra("n2",num2.getText().toString());
                        startActivity(intent);

                    }
                }
        );
    }
}
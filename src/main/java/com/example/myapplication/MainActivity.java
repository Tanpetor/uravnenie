package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView text,text1;
    Button ur;
    EditText ed1,ed2,ed3,ed4;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ur = findViewById(R.id.ur);
        text = findViewById(R.id.text);
        text1 = findViewById(R.id.text1);
        ed1 = findViewById(R.id.num1);
        ed2 = findViewById(R.id.num2);
        ed3 = findViewById(R.id.num3);
        ur.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String t1 = ed1.getText().toString();
        String t2 = ed2.getText().toString();
        String t3 = ed3.getText().toString();
        double a = Double.parseDouble(t1);
        double b = Double.parseDouble(t2);
        double c = Double.parseDouble(t3);
        Double x, d, x1;
        if(a == 0){
            text.setText("NO");
            text1.setText("NO");
        }else if(a == 0 && b == 0 && c == 0){
            text.setText("R");
            text1.setText("R");
        }else{
            d = b * b - 4 * a * c;
            if(d < 0){
                text.setText("NO");
                text1.setText("NO");
            }else if(d == 0){
                x = (-b) / (2 * a);
                text.setText(String.valueOf(x));
            }else{
                d = Math.sqrt(d);
                x = (-b + d) / 2 * a;
                x1 = (-b - d) / 2 * a;
                text.setText(String.valueOf(x));
                text1.setText(String.valueOf(x1));
            }
        }
    }
}
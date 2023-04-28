package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    int a,b,c,d;
    double x1,x2;
    String tg,tg1;
    TextView t3,t4,t5;
    Button c1b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t3 = (TextView) findViewById(R.id.t3);
        t4 = (TextView) findViewById(R.id.t4);
        t5 = (TextView) findViewById(R.id.t5);
        c1b1 = (Button) findViewById(R.id.c1b1);
        Intent i2 = getIntent();

        a = i2.getIntExtra("a", 15);
        b = i2.getIntExtra("b", 17);
        c = i2.getIntExtra("c", 17);
        if (a == 0 && b == 0 && c == 0) {
            t3.setText("Vô số nghiệm");
            t4.setText("");
        }
        if (a == 0 && b == 0 && c != 0) {
            t3.setText("Vô nghiệm");
            t4.setText("");
        }
        if (a == 0 && b != 0) {
            x1 = -c / b;
            tg = String.valueOf(x1);
            t3.setText(tg);
            t4.setText("");
        }
        if (a != 0) {
            d = b * b - 4 * c * a;
            if (d < 0) {
                t3.setText("Vô nghiệm");
                t4.setText("");
                tg1 = String.valueOf(d);
                t5.setText(tg1);
            }
            if (d == 0) {
                x1 = -b / (2 * a);
                tg = String.valueOf(x1);
                t3.setText("x1 = x2 = " + tg);
                t4.setText("");
                t5.setText("0");
            }
            if (d > 0) {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                tg = String.valueOf(x1);
                t3.setText("x1 =  " + tg);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                tg = String.valueOf(x2);
                t4.setText("x2 =  " + tg);
                tg1 = String.valueOf(d);
                t5.setText(tg1);

            }
        }
        c1b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
                onStop();
                finish();
            }
        });
    }
}

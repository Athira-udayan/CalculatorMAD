package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   EditText editText;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0,
            buttonP, buttonAdd, buttonSub, buttonMull, buttonDiv, buttonEq,buttonCl;
    Float mValueone,mValuetwo;
    boolean Addition, Subtraction, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edt);
        button1 = findViewById(R.id.bt1);
        button2 = findViewById(R.id.bt2);
        button3 = findViewById(R.id.bt3);
        button4 = findViewById(R.id.bt4);
        button5 = findViewById(R.id.bt5);
        button6 = findViewById(R.id.bt6);
        button7 = findViewById(R.id.bt7);
        button8 = findViewById(R.id.bt8);
        button9 = findViewById(R.id.bt9);
        button0 = findViewById(R.id.bt0);
        buttonP = findViewById(R.id.btdot);
        buttonAdd = findViewById(R.id.btAdd);
        buttonDiv = findViewById(R.id.btDiv);
        buttonMull = findViewById(R.id.btMul);
        buttonSub = findViewById(R.id.btSub);
        buttonEq = findViewById(R.id.btEq);
        buttonCl = findViewById(R.id.btC);

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText.setText(editText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText.setText(editText.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });
        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });
        buttonCl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueone = Float.parseFloat(editText.getText() + "");
                Addition = true;
                editText.setText(null);
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueone = Float.parseFloat(editText.getText() + "");
                Subtraction = true;
                editText.setText(null);
            }
        });
        buttonMull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueone = Float.parseFloat(editText.getText() + "");
                Multiplication = true;
                editText.setText(null);
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueone = Float.parseFloat(editText.getText() + "");
                Division = true;
                editText.setText(null);
            }
        });

        buttonEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValuetwo = Float.parseFloat(editText.getText() + "");

                if (Addition == true)
                {
                    editText.setText(mValueone+mValuetwo + "");
                    Addition = false;
                }
                if (Subtraction == true)
                {
                    editText.setText(mValueone-mValuetwo + "");
                    Subtraction = false;
                }
                if (Multiplication == true)
                {
                    editText.setText(mValueone*mValuetwo + "");
                    Multiplication = false;
                }
                if (Division == true)
                {
                    editText.setText(mValueone/mValuetwo + "");
                    Division = false;
                }
            }
        });
    }
}
package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    EditText Edt1,Edt2;
    Button btn1,btn2,btn3,btn4,btn5;
    TextView open1;
    String strNum1,strNum2;
    double result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");
        Edt1=(EditText)findViewById(R.id.Edit1);
        Edt2=(EditText)findViewById(R.id.Edit2);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        open1=(TextView)findViewById(R.id.open1);

        //터치와 클릭이 있는데, 클릭으로 작업했다.
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strNum1=Edt1.getText().toString();
                strNum2=Edt2.getText().toString();
                //trim()공백 오류 제거기

                if (strNum1.trim().equals("")|| strNum2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"입력값이 비었습니다.",Toast.LENGTH_SHORT).show();
                } else {
                    result=Double.parseDouble(strNum1)+Double.parseDouble(strNum2);
                    open1.setText("계산결과 :"+result);
                }

            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strNum1 = Edt1.getText().toString();
                strNum2 = Edt2.getText().toString();
                if (strNum1.trim().equals("") || strNum2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력값이 비었습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(strNum1) - Double.parseDouble(strNum2);
                    open1.setText("계산결과 :" + result);
                }
            }
                });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strNum1=Edt1.getText().toString();
                strNum2=Edt2.getText().toString();
                    if (strNum1.trim().equals("")|| strNum2.trim().equals("")){
                        Toast.makeText(getApplicationContext(),"입력값이 비었습니다.",Toast.LENGTH_SHORT).show();
                    } else {
                        result=Double.parseDouble(strNum1)*Double.parseDouble(strNum2);
                        open1.setText("계산결과 :"+result);}
            }
        });

        //나누기는 0으로 나누면 오류가 발생하기 때문에 else if 로 한번 더 조건을 발생
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strNum1=Edt1.getText().toString();
                strNum2=Edt2.getText().toString();
                if (strNum1.trim().equals("")|| strNum2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"입력값이 비었습니다.",Toast.LENGTH_SHORT).show();
                } else if(strNum2.trim().equals("0")) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                }else{

                    result=Double.parseDouble(strNum1)/Double.parseDouble(strNum2);

                    open1.setText("계산결과 :" +Math.round(result*100)/100d);}
            }
        });


        //                    result=(int)(result*100)/100.0;
        //                    open1.setText("계산결과 :" + result);
        //                    소숫점 2째자리 다른 정답


         //나머지 값 구하기

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strNum1=Edt1.getText().toString();
                strNum2=Edt2.getText().toString();
                if (strNum1.trim().equals("")|| strNum2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"입력값이 비었습니다.",Toast.LENGTH_SHORT).show();
                } else if(strNum2.trim().equals("0")) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                }else{

                    result=Double.parseDouble(strNum1)%Double.parseDouble(strNum2);
                    open1.setText("계산결과 :"+result);}
            }
        });




    }
    }


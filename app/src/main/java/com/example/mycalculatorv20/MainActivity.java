package com.example.mycalculatorv20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private String input="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickEquals(View view){
        Calculate postfix=new Calculate();
        CalculatePostfix solve = new CalculatePostfix();
        String s=postfix.changeToPostfix(input);
        input=solve.solution(s);
        //input+='\n';
        //input+=s;
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClick1(View view){
        input+="1";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClick2(View view){
        input+="2";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClick3(View view){
        input+="3";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClick4(View view){
        input+="4";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClick5(View view){
        input+="5";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClick6(View view){
        input+="6";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClick7(View view){
        input+="7";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClick8(View view){
        input+="8";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClick9(View view){
        input+="9";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClick0(View view){
        input+="0";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClickMult(View view){
        input+="*";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClickDiv(View view){
        input+="/";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClickAdd(View view){
        input+="+";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClickSub(View view){
        input+="-";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClickDot(View view){
        input+=".";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClickop(View view){
        input+="(";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClickcp(View view){
        input+=")";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClickDel(View view){
        input=input.substring(0,input.length()-1);
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
    public void onClickAC(View view){
        input="";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(input);
    }
}

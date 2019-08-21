package com.example.mycalculatorv20;

import java.util.*;

public class CalculatePostfix {
    public String solution(String s){
        if(s.equals("Invalid Expression")){
            return s;
        }
        Stack<Double> stack = new Stack<Double>();
        StringTokenizer st = new StringTokenizer(s,"+-/*^:",true);
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            if(str.charAt(0)==':'){
            }
            else if(str.charAt(0)=='+'||str.charAt(0)=='-'||str.charAt(0)=='*'||str.charAt(0)=='/'||str.charAt(0)=='^'){
                if(stack.isEmpty()){
                    return "Invalid Expression";
                }
                double a = stack.pop();
                if(stack.isEmpty()){
                    return "Invalid Expression";
                }
                double b = stack.pop();
                double result=0;
                if(str.charAt(0)=='+'){
                    result=a+b;
                }
                else if(str.charAt(0)=='-'){
                    result=b-a;
                }
                else if(str.charAt(0)=='*'){
                    result=a*b;
                }
                else if(str.charAt(0)=='/'){
                    result=b/a;
                }
                else if(str.charAt(0)=='^'){
                    result=(int)Math.pow(b,a);
                }
                stack.push(result);
            }
            else{
                double n = new Double(str);
                stack.push(n);
            }
        }
        String result = Double.toString(stack.pop());
        return result;
    }
}

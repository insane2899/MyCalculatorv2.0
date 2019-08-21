package com.example.mycalculatorv20;

import java.util.*;

public class Calculate {
    public static int preference(char ch){
        if(ch=='+'||ch=='-'){
            return 1;
        }
        else if(ch=='*'||ch=='/'){
            return 2;
        }
        else if(ch=='^'){
            return 3;
        }
        else {
            return -1;
        }
    }
    public String changeToPostfix(String s){
        StringTokenizer st = new StringTokenizer(s,"+-*/()",true);
        String postfix="";
        Stack<Character> stack = new Stack<Character>();
        while(st.hasMoreTokens()) {
            String str = st.nextToken();
            if (str.charAt(0) == '(') {
                stack.push(str.charAt(0));
            }
            else if (str.charAt(0)=='+'||str.charAt(0)=='-'||str.charAt(0)=='*'||str.charAt(0)=='/'||str.charAt(0)=='^'){
                if(stack.isEmpty()){
                    stack.push(str.charAt(0));
                }
                else{
                    while(!stack.isEmpty()&&preference(stack.peek())>=preference(str.charAt(0))){
                        if(stack.peek()=='('){
                            return "Invalid Expression";
                        }
                        postfix+=stack.pop();
                    }
                    stack.push(str.charAt(0));
                }
            }
            else if(str.charAt(0)==')'){
                while(!stack.isEmpty()&&stack.peek()!='('){
                    postfix+=stack.pop();
                }
                if(!stack.isEmpty()&&stack.peek()!='('){
                    return "Invalid Expression";
                }
                stack.pop();
            }
            else{
                int x = new Integer(str);
                postfix+=x;
                postfix+=':';
            }
        }
        while(!stack.isEmpty()){
            if(stack.peek()=='('){
                return "Invalid Expression";
            }
            postfix+=stack.pop();
        }
        return postfix;
    }
}

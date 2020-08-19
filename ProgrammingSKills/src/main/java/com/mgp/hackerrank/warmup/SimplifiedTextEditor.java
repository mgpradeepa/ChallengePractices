package com.mgp.hackerrank.warmup;

import java.util.Scanner;
import java.util.Stack;

public class SimplifiedTextEditor {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s = "";
        Stack<String> st =new Stack<String>();
        st.push(s);
        for(int i=0;i<n;i++){
            int t=in.nextInt();
            if(t==1){ s = s+in.next();st.push(s);
            }
            else if(t==2){s=s.substring(0,s.length()-in.nextInt());st.push(s);}
            else if(t==3){System.out.println(s.charAt(in.nextInt()-1)); }
            else{st.pop();s=st.peek();}
        }
    }
}

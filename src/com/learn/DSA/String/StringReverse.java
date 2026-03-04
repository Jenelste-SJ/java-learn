package com.learn.DSA.String;

import java.util.Scanner;


/* OUTPUT
Hello How are you
olleH woH era uoy
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<arr.length;i++){
            String s = arr[i];
            char[] charArray = s.toCharArray();
            char[] revArr = new char[s.length()];
            int k= revArr.length-1;
            for(int j=0;j<s.length();j++){
                revArr[j] = charArray[k];
                k--;
            }
            sb.append(revArr);
            if(i!=arr.length-1){
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}

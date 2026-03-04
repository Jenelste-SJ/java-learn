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
            char[] chars = s.toCharArray();
            char[] chArr = new char[s.length()];
            int k=chArr.length-1;
            for(int j=0;j<s.length();j++){
                chArr[j] = chars[k];
                k--;
            }
            sb.append(chArr);
            if(i!=arr.length-1){
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}

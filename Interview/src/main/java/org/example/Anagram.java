package org.example;


import java.util.Arrays;

public class Anagram {
    static void main() {

    String str = "lokesh";
    String str1= "shekol";

       char [] arr= str.toCharArray();
       char [] arr1= str1.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(String.valueOf(arr).equalsIgnoreCase(String.valueOf(arr1))){
            System.out.println("strings are anagram");
        }else{
            System.out.println("not");
        }

    }
}

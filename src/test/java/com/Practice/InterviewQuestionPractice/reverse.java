package com.Practice.InterviewQuestionPractice;

public class reverse {

    public static String reverse(String str){

        String reverseStr = "";

        for(int i=str.length()-1; i>=0; i--){

            reverseStr += str.toCharArray()[i];
        }
        return reverseStr;
    }

    public static String palindrome (String str){
        String reverseStr = "";

        for(int i=str.length()-1; i>=0; i--){

            reverseStr += str.toCharArray()[i];

        }
        String answer = "";
        if(!reverseStr.equals(str)) reverseStr = "not a palindrome"; else reverseStr = "is a palindrome";
        System.out.println(reverseStr);

        return answer;
    }

    public static void main(String[] args) {

        String song = "madam";

        System.out.println(reverse(song));
        System.out.println(palindrome(song));
    }
}

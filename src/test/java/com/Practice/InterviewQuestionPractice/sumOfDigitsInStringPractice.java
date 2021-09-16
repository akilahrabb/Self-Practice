package com.Practice.InterviewQuestionPractice;

public class sumOfDigitsInStringPractice {

    public static int sumInString(String str){

        int sum = 0;
        char[] arr = str.toCharArray();

        for(char each: arr){
            if(Character.isDigit(each)){
                sum += Integer.valueOf(""+each);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String string = " The 1619 Commission";

        System.out.println(sumInString(string));

    }

}

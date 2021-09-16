package com.Practice.InterviewQuestionPractice;

import java.util.Arrays;

public class sameLettersPractice {

    public static boolean same(String a, String b) {

        a = a.toLowerCase(); // first we will make all letters lower case
        b = b.toLowerCase();

        char[] ch1 = a.toCharArray(); // then we will turn each string into a char Array

        char[]  ch2 = b.toCharArray();

        Arrays.sort(ch1); // then sort each array in ascending order

        Arrays.sort(ch2);

        String a1="", a2=""; // next, define an empty string to receive info from each array

        for(char each: ch1) // for each character in ch1, concatenate it to the string a1

            a1 +=each;
        a1 = a1.trim(); // trim all the spaces from the beginning or end of a1


        for(char each: ch2)

            a2 +=each;
        a2 = a2.trim();


        return  a1.equals(a2) ; // a1.equals(a2) is a boolean expression

    }
}

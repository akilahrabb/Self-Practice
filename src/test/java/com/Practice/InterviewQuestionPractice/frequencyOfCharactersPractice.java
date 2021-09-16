package com.Practice.InterviewQuestionPractice;

public class frequencyOfCharactersPractice {

    /*
    Write a return method that finds the frequency of characters in a string.
     */

    public static String frequencyOfChar(String sample){

        String foc = "";

        char[] sampleChar = sample.toCharArray();


        for(int j=0; j<sample.length(); j++) {
            int count = 0;

            for (int i = 0; i < sample.length(); i++) {
                if (sample.charAt(i) == sample.charAt(j)) {
                    count++;
                }
            }

            foc += sample.charAt(j) + "" + count;
            sample = sample.replace(""+sample.charAt(j), "");
        }

        return foc;
    }


    public static void main(String[] args) {

        String sample = "markthemarket";

        System.out.println(frequencyOfChar(sample));

    }
}

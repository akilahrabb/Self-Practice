package com.Practice.InterviewQuestionPractice;

public class strReversePractice {

        public  static String  Reverse(String str) {

            return new StringBuffer(str).reverse().toString();

        }

    public static void main(String[] args) {
        System.out.println(Reverse("76543"));
    }
}

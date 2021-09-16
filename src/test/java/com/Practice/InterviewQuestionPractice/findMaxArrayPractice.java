package com.Practice.InterviewQuestionPractice;

import java.util.Arrays;

public class findMaxArrayPractice {

    public static int findMax(int[] arr){

        Arrays.sort(arr);

        return arr[arr.length-1];
    }

    public static void main(String[] args) {

        int[] array = {9,8,7,6,5,4};

        System.out.println(Arrays.toString(array));

        System.out.println(findMax(array));
    }
}

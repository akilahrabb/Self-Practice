package com.Practice.InterviewQuestionPractice;

import java.util.Arrays;

public class findMinArrayPractice {

    public static int findMin(int[] arr){

        Arrays.sort(arr);

        return arr[0];
    }

    public static void main(String[] args) {

        int[] array = {4,7,4,7,-4,-9,0};

        System.out.println(findMin(array));
    }
}

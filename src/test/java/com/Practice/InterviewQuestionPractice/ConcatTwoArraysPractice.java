package com.Practice.InterviewQuestionPractice;

import java.util.Arrays;

public class ConcatTwoArraysPractice {

    public static int[] concatTwoArrays (int[] arr1, int[] arr2, int[] arr3){

        int[] concat = new int[arr1.length+ arr2.length + arr3.length];

        int i = 0;

        for(int each: arr1){
            concat[i] += each;
            i++;
        }
        // adding to the concat array at concat's index [i].
        // [arr1[0], arr[1], ..., arr1[arr1.length]]
        for(int each: arr2){
            concat[i] += each;
            i++;
        }
        // adding to the concat array at concat's index i=[arr1.length+1].
        // [arr1[0], arr[1], ..., arr1[arr1.length], arr2[0], arr2[1], ..., arr2[arr2.length]]

        for(int each: arr3){
            concat[i] += each;
            i++;
        }
        return concat;
    }

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {7,8,9};
        int[] array3 = {101, 102, 103, 104, 105, 987};

        System.out.println(Arrays.toString(concatTwoArrays(array1, array2, array3)));
    }
}

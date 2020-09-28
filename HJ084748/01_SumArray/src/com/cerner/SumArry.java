package com.cerner;

import java.util.Arrays;
import java.util.Scanner;

public class SumArry {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the expected output value: ");
        int output = scanner.nextInt();
        int arraySize = array.length;
        int out = compareArray(array, arraySize, output);
        System.out.println(out);
        compareArry(array, arraySize, output);

    }

    public static int compareArray(int array[], int arraySize, int sum) {
        Arrays.sort(array);
        int left = 0;
        int right = arraySize -1;
        while (left < right) {
            if ((array[left] + array[right]) == sum) {
                System.out.println(left + " + " + right + " --> " + sum);
                return sum;
            } else if ((array[left] + array[right]) < sum){
                left++;
            } else {
                right--;
            }
        }
        return -1;
    }

    public static int compareArry(int array[], int arraySize, int sum) {
        Arrays.sort(array);
        int left = 0;
        int middle = arraySize / 2;
        int right = arraySize -1;

        while (left < right) {
            if ((array[left] + array[middle] + array[right]) == sum) {
                System.out.println(left + " + " + middle + " + " + right + " --> " + sum);
                return 1;
            } else if ((array[left] + array[middle] + array[right]) < sum){
                left++;
            } else {
                right--;
            }
        }
        return -1;
    }
}

package com.cerner;

public class Main {

    public static void main(String[] args) {
        int array[] = {2,7,9,3,1};
        int output = robbery(array);
        int output1 = robbery1(array);
        System.out.println("Total amount you can rob is " + output);
        System.out.println("Total amount you can rob is " + output1);

    }

    public static int robbery(int[] number) {
        if(number == null || number.length == 0) {
            return 0;
        } else if(number.length == 1) {
            return number[0];
        }

        int[] array = new int[number.length];
        array[0]=number[0];
        array[1]=Math.max(number[0], number[1]);
        for(int i=2; i<number.length; i++){
            array[i] = Math.max(number[i] + array[i-2], array[i-1]);
        }
        return array[number.length-1];
    }


    public static int robbery1(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }else if (numbers.length == 1) {
            return numbers[0];
        } else if (numbers.length == 2)
            return Math.max(numbers[0], numbers[1]);

        int a = 0;
        int b = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                 b = b + numbers[i];
                b = Math.max(a, b);
            } else {
                a = a + numbers[i];
                a = Math.max(a, b);
            }
        }

        return Math.max(a, b);

    }
}

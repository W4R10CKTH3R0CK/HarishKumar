package com.cerner;

import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int array[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println("Enter the output value: ");
        int output = scanner.nextInt();
        findArray(array, output);
    }

    public static int findArray(int array[], int num) {
        ArrayList<Integer> lst = new ArrayList<>();
//        LinkedList<Integer> lst = new LinkedList<>();
//        HashSet<Integer> lst = new HashSet<>();
        for (int i=0; i<array.length; i++) {
            int check = num - array[i];
            if (lst.contains(check)) {
                System.out.println(array[i] + " + " + check + " --> " + num);
//                return 1;
            }
            lst.add(array[i]);
        }
//        return -1;
        return 1;
    }
}

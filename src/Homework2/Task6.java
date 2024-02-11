package Homework2;

import java.util.Arrays;

public class Task6 {
    /*
    Задача 6
    Дадени са два масива със стойности {1, 2, 3} и {1, 2, 3} да се състави програма, която проверява дали масивите са еднакви
     */

    public static void main(String[] args) {

    Integer[] arr1 = {1, 2, 3};
    Integer[] arr2 = {1, 2, 3};

        int[] arr11 = {1, 2, 3};
        int[] arr22 = {1, 4, 3, 4};
//        System.out.println(compare2Arrays(arr1, arr2));
    compare2arrays(arr11, arr22);
    }

    static void compare2arrays(int[] arr1, int[] arr2) {

        boolean result = true;

        if (arr1.length == arr2.length) {

            for (int i = 0; i < arr1.length; i++) {

                if (arr1[i] != arr2[i]) {
                    result = false;
                }
            }

        } else {
            result = false;
        }

        if (result == true) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

    }

    private static boolean compare2Arrays(Integer[] arr1, Integer[] arr2){

        if(arr1 == null || arr2 == null) {
            System.out.println("Arrays are not equal!!!!");
            return false;
        }

        if(arr1.length != arr2.length) {
            System.out.println("Arrays are not equal!!!!");
            return false;
        } else{

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            System.out.println("Arrays are not equal");
            return Arrays.deepEquals(arr1, arr2);
        }
    }

}

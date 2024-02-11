package Homework2;

import java.util.Scanner;

public class Task4 {
    /*
    Задача 4
    Напишете програма, която създава масив с 10 елемента от тип int и обходете масива:
        1) с помоща на for loop
        2) с помоща на while loop
        Да се изведат елементите на екрана.

     */
    public static void main(String[] args) {

        double[] myArr = {1.1, 2.5, 3.2, 4.7, 5.1, 6.0, 7.8, 8.8, 9.9, 10.1};
        int lengthOfArray = 10;
//        printArrElementForLoop(myArr);

        double[] arr = new double[lengthOfArray];

//        printArrElementForLoop(arr, lengthOfArray);
        printArrElementWhileLoop(myArr);

    }

    static void printArrElementWhileLoop (double[] arr) {

        int i=0;
        while(i < arr.length){
            System.out.println(arr[i]);
            i++;
        }

    }

    static void printArrElementForLoop(double[] arr, int lengthArr) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers to store into an array: ");

        double[] myCustomArr = new double[lengthArr];

        for(int i=0; i < myCustomArr.length; i++) {
            myCustomArr[i]= Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Entered elements of the array are: ");
        for (int i = 0; i < myCustomArr.length; i++) {
            System.out.print(myCustomArr[i] + ", ");
        }
    }
}
